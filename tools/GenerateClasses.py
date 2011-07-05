import os
import re
import yaml

CLASS_TEMPLATE = """
package org.urish.gwtit.%(package)s;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.AbstractTitaniumEventable;
import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

public class %(name)s extends %(parent)s {
	protected %(name)s() {}

	%(properties)s
	%(factories)s
	%(methods)s
}
"""

GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public native %(type)s get%(nameCapital)s() /*-{
		return this.%(name)s;
	}-*/;
"""
SETTER_TEMPLATE = """
	public native void set%(nameCapital)s(%(type)s value) /*-{
		this.%(name)s = value;
	}-*/;
"""

STATIC_GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(type)s get%(nameCapital)s() /*-{
		return %(module)s.%(name)s;
	}-*/;
"""
STATIC_SETTER_TEMPLATE = """
	public static native void set%(nameCapital)s(%(type)s value) /*-{
		%(module)s.%(name)s = value;
	}-*/;
"""

CONST_TEMPLATE = """
	public static final Const %(name)s = new ConstImpl("%(module)s.%(name)s");
"""

STATIC_METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(return)s %(name)s (%(params)s) /*-{
		return %(module)s.%(name)s(%(paramNames)s);
	}-*/;
"""

METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public native %(return)s %(name)s (%(params)s) /*-{
		return this.%(name)s(%(paramNames)s);
	}-*/;
"""

CONSTRUCTOR_TEMPLATE = """
	public static native %(return)s %(name)s () /*-{
		return %(type)s.%(name)s();
	}-*/;
"""

EVENT_TEMPLATE = """
	public void add%(name)sHandler(Object handler) {
		return addDomHandler(handler, ClickEvent.getType());
	}
"""

def capitalFirst(s):
	return s[0].upper() + s[1:]

def mapTypes(s):
	if s == "String":
		return "String"
	if s == "Number":
		return "float"
	if s == "Boolean":
		return "boolean"
	if s == "void":
		return "void"
	if type(s) == list:
		return "Object"
	arrayMatch = re.match("^Array<(.+)>$", s)
	if arrayMatch:
		return mapTypes(arrayMatch.group(1)) + "[]"
	if s == "Object":
		return "Object"
	if s.startswith("Titanium."):
		path = s.split(".")
		return "org.urish.gwtit." + ".".join(path[:-1]).lower() + "." + path[-1]
	return "Object"
	
def mapIdentifiers(s):
	if s == "default":
		return "_default"
	return s
	
def mapMethodNames(s):
	if s == "toString":
		return "toString_"
	return s
	
def generateProperties(type, isSingleton):
	result = ""
	if isSingleton:
		getter = STATIC_GETTER_TEMPLATE
		setter = STATIC_SETTER_TEMPLATE
	else:
		getter = GETTER_TEMPLATE
		setter = SETTER_TEMPLATE		
	if 'properties' in type:
		for property in type['properties']:
			docString = ("@return " + property['description']) if property['description'] else ''
			if property['name'] != property['name'].upper():
				if isinstance(property['type'], list):
					for option in property['type']:
						result += setter % {
							'name': property['name'],
							'nameCapital': capitalFirst(property['name']),
							'type': mapTypes(option),
							'module': type['name'],
							'docString': docString,
						}
					result += getter % {
						'name': property['name'],
						'nameCapital': capitalFirst(property['name']),
						'type': "Object",
						'module': type['name'],
						'docString': docString,
					}
				else:
					result += (getter + setter) % {
						'name': property['name'],
						'nameCapital': capitalFirst(property['name']),
						'type': mapTypes(property['type']),
						'module': type['name'],
						'docString': docString,
					}
			else:
				result += CONST_TEMPLATE % {
					'type': property['type'],
					'name': property['name'],
					'module': type['name'],
					'docString': docString,
				}
	return result

def stripHtml(text):
	return re.sub("<[^>]+>", "", text)

def generateMethodDoc(method):
	parts = [
		stripHtml(method['description']).capitalize()
	]
	if 'parameters' in method:
		for parameter in method['parameters']:
			parts.append("@param %s %s" % (mapIdentifiers(parameter['name']), stripHtml(parameter['description'])))
	if 'returns' in method and 'description' in method['returns']:
		descr = stripHtml(method['returns']['description'])
		if descr:
			parts.append("@return " + descr)
	return "\n * ".join(parts)

def generateFactories(typeInfo, types):
	typeName = typeInfo['name']
	result = ""
	for candidate in types:
		if (candidate['name'].startswith(typeName + ".") and 
			len(candidate['name'].split(".")) == len(typeName.split(".")) + 1):
			result += CONSTRUCTOR_TEMPLATE % {
				'type': typeName,
				'name': 'create' + candidate['name'].split(".")[-1],
				'return': mapTypes(candidate['name']),
			}
	return result
			

def generateMethods(type, isSingleton):
	result = ""
	for method in type['methods']:
		duplicate = False
		if 'properties' in type:
			for property in type['properties']:
				propName = capitalFirst(property['name'])
				if method['name'] in ["get" + propName, "set" + propName]:
					duplicate = True
		if duplicate:
			continue
		returnType = "void"
		params = []
		paramNames = []
		if "returns" in method:
			returnType = method['returns']["type"]
		if 'parameters' in method:
			for parameter in method['parameters']:
				name = mapIdentifiers(parameter['name'])
				paramNames.append(name)
				params.append("%s %s" % (mapTypes(parameter['type']),name))
		if isSingleton:
			template = STATIC_METHOD_TEMPLATE 
		else:
			template = METHOD_TEMPLATE
		result += template % {
			'module': type['name'],
			'name': mapMethodNames(method['name']),
			'nativeName': method['name'],
			'docString': generateMethodDoc(method),
			'params': ", ".join(params),
			'paramNames': ", ".join(paramNames),
			'return': mapTypes(returnType),
		}
	return result
	
def generateEvents(type):
	result = ""
	for event in type['events']:
		result += EVENT_TEMPLATE % {
			'name': event['name'],
		}
	return result

def generateClass(type, types):
	print type['name']
	type['name'] = re.sub(r"(^|\.)(\d)", r"\1_\2", type['name'])
	name = type['name'].split(".")
	parentClass = "JavaScriptObject"
	singleton = False
	if 'extends' in type:
		parentClass = mapTypes(type['extends'])
		singleton = type['extends'] == 'Titanium.Module'
	code = CLASS_TEMPLATE % {
		'package': ".".join(["titanium"] + name[1:-1]).lower(),
		'name': name[-1],
		'parent': parentClass,
		'properties': generateProperties(type, singleton),
		'factories': generateFactories(type, types),
		'methods': generateMethods(type, singleton) if ('methods' in type) else '',
	}
	dir = os.path.join(r"C:\Projects\gwt-titanium\src\org\urish\gwtit", "/".join(["titanium"] + name[1:-1]).lower())
	if not os.path.exists(dir):
		os.makedirs(dir)
	file(os.path.join(dir, name[-1] + ".java"), "w").write(code)

def getTypes(path):
	with open(path, 'r') as f:
		return list(yaml.load_all(f))

def processDir(dir):
	types = []
	for root, dirs, files in os.walk(os.path.abspath(dir)):
		for name in files:
			if name.endswith('.yml'):
				types.extend(getTypes(os.path.join(root, name)))
	for type in types:
		generateClass(type, types)

processDir(r"C:\projects\titanium_mobile\apidoc")

