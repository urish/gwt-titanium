import os
import re
import yaml

CLASS_TEMPLATE = """
package org.urish.gwtit.%(package)s;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.AbstractTitaniumEventable;
import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * %(docString)s
 */
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

def mapTypes(s, withConsts = False):
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
		return mapTypes(arrayMatch.group(1), withConsts) + "[]"
	if s == "Object":
		return "Object"
	if s.startswith("Titanium."):
		path = s.split(".")
		if withConsts and path[-1].upper() == path[-1]:
			# Constant
			return "org.urish.gwtit.%s.%s.%s" % (".".join(path[:-2]).lower(), path[-2], path[-1])
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

def docStringLink(match):
	return "{@link %s}" % mapTypes(match.group(1), True)

def parseDocString(text):
	text = re.sub("<(Titanium.[^>]+)>", docStringLink, text)
	return re.sub("<[^>]+>", "", text)

def generateProperties(type, isSingleton):
	result = ""
	if isSingleton:
		getterTemplate = STATIC_GETTER_TEMPLATE
		setterTemplate = STATIC_SETTER_TEMPLATE
	else:
		getterTemplate = GETTER_TEMPLATE
		setterTemplate = SETTER_TEMPLATE		
	if 'properties' in type:
		for property in type['properties']:
			readonly = property['description'] and property['description'].lower().strip().startswith("readonly")
			docString = ("@return " + parseDocString(property['description'])) if property['description'] else ''
			getter = getterTemplate
			setter = setterTemplate if not readonly else ""
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

def generateMethodDoc(method):
	parts = [
		parseDocString(method['description']).capitalize()
	]
	if 'platforms' in method:
		parts += ["@platforms " + ", ".join(method['platforms'])]
	if 'parameters' in method:
		for parameter in method['parameters']:
			parts.append("@param %s %s" % (mapIdentifiers(parameter['name']), parseDocString(parameter['description'])))
	if 'returns' in method and 'description' in method['returns']:
		descr = parseDocString(method['returns']['description'])
		if descr:
			parts.append("@return " + descr)
	return "\n * ".join(parts)

def generateClassDoc(typeInfo):
	parts = [
		parseDocString(typeInfo['description']).capitalize()
	]
	if 'notes' in typeInfo:
		parts += ["<p>", "Notes: " + typeInfo['notes']]
	if 'platforms' in typeInfo:
		parts += ["@platforms " + ", ".join(typeInfo['platforms'])]
	if 'since' in typeInfo:
		parts += ["@since " + typeInfo['since']]
	return "\n * ".join(parts)

def generateFactories(typeInfo, types):
	typeName = typeInfo['name']
	result = ""
	for candidate in types:
		if (candidate['name'].startswith(typeName + ".") and 
			len(candidate['name'].split(".")) == len(typeName.split(".")) + 1):
			factoryName = 'create' + candidate['name'].split(".")[-1]
			duplicate = False
			if 'methods' in typeInfo:
				for method in typeInfo['methods']:
					if method['name'] == factoryName:
						duplicate = True
			if not duplicate:
				result += CONSTRUCTOR_TEMPLATE % {
					'type': typeName,
					'name': factoryName,
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
	if 'events' in type:
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
		'docString': generateClassDoc(type),
		'properties': generateProperties(type, singleton),
		'factories': generateFactories(type, types),
		'methods': generateMethods(type, singleton) if ('methods' in type) else '',
		'events': generateEvents(type),
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

