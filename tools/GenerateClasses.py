import json
import os
import re

SKIP_METHODS = [
	"addEventListener",
	"fireEvent",
	"removeEventListener",
]

SINGLETONS = [
	"Titanium.API"
]

CLASS_TEMPLATE = """
package org.urish.gwtit.%(package)s;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.AbstractTitaniumEventable;
import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

public class %(name)s extends %(parent)s {
	protected %(name)s() {}

	%(properties)s
	%(methods)s
}
"""

PROPERTY_TEMPLATE = """
	public native %(type)s get%(nameCapital)s() /*-{
		return this.%(name)s;
	}-*/;

	public native void set%(nameCapital)s(%(type)s value) /*-{
		this.%(name)s = value;
	}-*/;
"""

CONST_TEMPLATE = """
	public static final Const %(name)s = new ConstImpl("%(type)s.%(name)s");
"""

STATIC_METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(return)s %(name)s (%(params)s) /*-{
		return %(type)s.%(name)s(%(paramNames)s);
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
	if s == "void":
		return "void"
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
	
def generateProperties(type):
	result = ""
	for property in type['properties']:
		if (property['isInstanceProperty']):
			result += PROPERTY_TEMPLATE % {
				'name': property['name'],
				'nameCapital': capitalFirst(property['name']),
				'type': mapTypes(property['type']),
			}
		else:
			result += CONST_TEMPLATE % {
				'type': type['name'],
				'name': property['name'],
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
	if 'returnTypes' in method:
		descr = stripHtml(method['returnTypes'][0]['description'])
		if descr:
			parts.append("@return " + descr)
	return "\n * ".join(parts)

def generateMethods(type, isSingleton):
	result = ""
	for method in type['functions']:
		if method['name'] in SKIP_METHODS:
			continue
		duplicate = False
		for property in type['properties']:
			propName = capitalFirst(property['name'])
			if method['name'] in ["get" + propName, "set" + propName]:
				duplicate = True
		if duplicate:
			continue
		if method['name'].startswith("create"):
			result += CONSTRUCTOR_TEMPLATE % {
				'type': type['name'],
				'name': method['name'],
				'return': mapTypes(method['returnTypes'][0]["type"]),
			}
		else:
			returnType = "void"
			params = []
			paramNames = []
			if "returnTypes" in method:
				returnType = method['returnTypes'][0]["type"]
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
				'type': type['name'],
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

def generateClass(type):
	name = type['name'].split(".")
	parentClass = "JavaScriptObject"
	for method in type['functions']:
		if method['name'] == 'addEventListener':
			parentClass = "AbstractTitaniumEventable"
	print type['name']
	singleton = type['name'] in SINGLETONS
	code = CLASS_TEMPLATE % {
		'package': ".".join(["titanium"] + name[1:-1]).lower(),
		'name': name[-1],
		'parent': parentClass,
		'properties': generateProperties(type),
		'methods': generateMethods(type, singleton),
	}
	dir = os.path.join(r"C:\Projects\gwt-titanium\src\org\urish\gwtit", "/".join(["titanium"] + name[1:-1]).lower())
	if not os.path.exists(dir):
		os.makedirs(dir)
	file(os.path.join(dir, name[-1] + ".java"), "w").write(code)

data = json.load(open("C:/projects/zampona/api.jsca", "rb"))
for type in data['types']:
	generateClass(type)
