#
# Copyright 2011 Uri Shaked
#
# Licensed under the Apache License, Version 2.0 (the "License"); you may not
# use this file except in compliance with the License. You may obtain a copy of
# the License at
# 
# http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# License for the specific language governing permissions and limitations under
# the License.

import os
import re
import yaml
from copy import copy
from numpy.f2py.auxfuncs import issigned_array

CLASS_TEMPLATE = """
/*
 * Copyright 2011 Uri Shaked
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
 
/* Automatically generated code, don't edit ! */

package org.urish.gwtit.%(package)s;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;

/**
 * %(docString)s
 */
public class %(name)s extends %(parent)s {
	protected %(name)s() {}

	%(properties)s
	%(factories)s
	%(methods)s
	%(events)s
}
"""

GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public final native %(type)s get%(nameCapital)s() 
	/*-{
		return this.%(name)s;
	}-*/;
"""
SETTER_TEMPLATE = """
	public final native void set%(nameCapital)s(%(type)s value) 
	/*-{
		this.%(name)s = value;
	}-*/;
"""

STATIC_GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(type)s get%(nameCapital)s() 
	/*-{
		return %(module)s.%(name)s;
	}-*/;
"""
STATIC_SETTER_TEMPLATE = """
	public static native void set%(nameCapital)s(%(type)s value) 
	/*-{
		%(module)s.%(name)s = value;
	}-*/;
"""

CONST_TEMPLATE = """
	private static native final %(type)s value_%(name)s()
	/*-{
		return %(module)s.%(name)s;
	}-*/;

	public static final %(type)s %(name)s = value_%(name)s();
"""

STATIC_METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(return)s %(name)s (%(params)s) 
	/*-{
		return %(module)s.%(name)s(%(paramNames)s);
	}-*/;
"""

METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public final native %(return)s %(name)s (%(params)s) 
	/*-{
		return this.%(name)s(%(paramNames)s);
	}-*/;
"""

CONSTRUCTOR_TEMPLATE = """
	public static native %(return)s %(name)s () 
	/*-{
		return %(type)s.%(name)s();
	}-*/;
"""

EVENT_TEMPLATE = """
	public final native void add%(nameCapital)sHandler(EventCallback<JavaScriptObject> handler) 
	/*-{
		return this.addEventListener('%(name)s', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;
"""

STATIC_EVENT_TEMPLATE = """
	public static native void add%(nameCapital)sHandler(EventCallback<JavaScriptObject> handler) 
	/*-{
		return %(module)s.addEventListener('%(name)s', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;
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
	if s == "Date":
		return "java.util.Date"
	if s in ["AcceptParams", "CreateBufferArgs", "CreateStreamArgs", "DecodeNumberSpec", "EncodeStringSpec"]:
		s = "Titanium.%s" % s
	if s.startswith("Titanium."):
		path = s.split(".")
		if withConsts and path[-1].upper() == path[-1]:
			# Constant
			return "org.urish.gwtit.%s.%s.%s" % (".".join(path[:-2]).lower(), path[-2], path[-1])
		return "org.urish.gwtit." + ".".join(path[:-1]).lower() + "." + path[-1]
	print "==>", s
	return "Object"

def findType(name, types):
	for typeInfo in types:
		if typeInfo['name'] == name:
			return typeInfo

def ancestors(type, types):
	while 'extends' in type:
		type = findType(type['extends'], types)
		yield type

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

def generateProperties(type, isSingleton, types):
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
			docString = generatePropertyDoc(property)
			getter = getterTemplate
			setter = setterTemplate if not readonly else ""
			if property['name'] != property['name'].upper():
				foundInAncetors = False
				if not isSingleton:
					for ancestor in ancestors(type, types):
						if 'properties' in ancestor:
							for candidate in ancestor['properties']:
								if property['name'] == candidate['name']:
									foundInAncetors = True
				if foundInAncetors:
					continue
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
					'type': mapTypes(property['type']),
					'name': property['name'],
					'module': type['name'],
					'docString': docString,
				}
	return result

def generatePropertyDoc(property):
	parts = []
	if property['description']:
		parts.append("@return " + parseDocString(property['description']).capitalize())
	if 'platforms' in property:
		parts += ["@platforms " + ", ".join(property['platforms'])]
	if 'since' in property:
		parts += ["@since " + property['since']]
	return "\n * ".join(parts)

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

def methodPermutations(method):
	params = []
	paramNames = []
	if 'parameters' in method:
		for parameter in method['parameters']:
			if 'optional' in parameter and parameter['optional']:
				yield (copy(params), copy(paramNames))
			name = mapIdentifiers(parameter['name'])
			paramNames.append(name)
			params.append("%s %s" % (mapTypes(parameter['type']),name))
	yield (params, paramNames)

def generateMethods(type, isSingleton, types):
	result = ""
	methods = type['methods']
	if isSingleton:
		for ancestor in ancestors(type, types):
			if 'methods' in ancestor:
				methods.extend(ancestor['methods'])
	for method in methods:
		duplicate = False
		if 'properties' in type:
			for property in type['properties']:
				propName = capitalFirst(property['name'])
				if method['name'] in ["get" + propName, "set" + propName]:
					duplicate = True
		if duplicate:
			continue
		returnType = "void"
		if "returns" in method:
			returnType = method['returns']["type"]
		if isSingleton:
			template = STATIC_METHOD_TEMPLATE 
		else:
			template = METHOD_TEMPLATE
		for params, paramNames in methodPermutations(method):
			foundInAncetors = False
			if not isSingleton:
				for ancestor in ancestors(type, types):
					if 'methods' in ancestor:
						for candidate in ancestor['methods']:
							if method['name'] == candidate['name']:
								for candidateParams, _ in methodPermutations(candidate):
									if candidateParams == params:
										foundInAncetors = True
			if not foundInAncetors:
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
	
def capitalEventName(eventName):
	def capitalMatch(match):
		return match.group(1).upper()
	return re.sub(":(.)", capitalMatch, capitalFirst(eventName))
	
def generateEvents(typeInfo, isSingleton, types):
	result = ""
	template = STATIC_EVENT_TEMPLATE if isSingleton else EVENT_TEMPLATE
	if 'events' in typeInfo:
		for event in typeInfo['events']:
			foundInAncetors = False
			if not isSingleton:
				for ancestor in ancestors(typeInfo, types):
					if 'events' in ancestor:
						for candidate in ancestor['events']:
							if event['name'] == candidate['name']:
								foundInAncetors = True
			if not foundInAncetors: 
				result += template % {
					'name': event['name'],
					'nameCapital': capitalEventName(event['name']),
					'module': typeInfo['name'],
				}
	return result

def generateClass(projectRoot, type, types):
	print type['name']
	type['name'] = re.sub(r"(^|\.)(\d)", r"\1_\2", type['name'])
	name = type['name'].split(".")
	parentClass = "JavaScriptObject"
	singleton = False
	if ('extends' in type) and type['name'] != "Titanium.Module":
		parentClass = mapTypes(type['extends'])
		singleton = type['extends'] == 'Titanium.Module'
	code = CLASS_TEMPLATE % {
		'package': ".".join(["titanium"] + name[1:-1]).lower(),
		'name': name[-1],
		'parent': parentClass,
		'docString': generateClassDoc(type),
		'properties': generateProperties(type, singleton, types),
		'factories': generateFactories(type, types),
		'methods': generateMethods(type, singleton, types) if ('methods' in type) else '',
		'events': generateEvents(type, singleton, types),
	}
	dir = os.path.join(projectRoot, r"src/org/urish/gwtit", "/".join(["titanium"] + name[1:-1]).lower())
	if not os.path.exists(dir):
		os.makedirs(dir)
	classFile = os.path.join(dir, name[-1] + ".java")
	file(classFile, "w").write(code.lstrip())
	return classFile

def getTypes(path):
	with open(path, 'r') as f:
		return list(yaml.load_all(f))

def chunks(l, n):
    """ Yield successive n-sized chunks from l."""
    for i in xrange(0, len(l), n):
        yield l[i:i+n]

def processDir(inputDir, projectDir):
	types = []
	for root, dirs, files in os.walk(os.path.abspath(inputDir)):
		for name in files:
			if name.endswith('.yml'):
				types.extend(getTypes(os.path.join(root, name)))
	classes = []
	for type in types:
		classes.append(generateClass(projectDir, type, types))
	# Format code
	for someClasses in chunks(classes, 32):
		os.system("eclipsec -application org.eclipse.jdt.core.JavaCodeFormatter -verbose -config %s\.settings\org.eclipse.jdt.core.prefs %s" % (projectDir, " ".join(someClasses)))

if __name__ == "__main__":
	processDir(r"C:\projects\titanium_mobile\apidoc", "C:\Projects\gwt-titanium")
