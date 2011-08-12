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
import json
from copy import copy
from numpy.f2py.auxfuncs import issigned_array

PACKAGE_PREFIX = "org.urish.gwtit."

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

package %(package)s;

%(imports)s

/**
 * %(javaDoc)s
 */
public %(type)s %(name)s %(superClass)s {
	%(body)s
}
"""

CONSTRUCTOR_TEMPLATE = """
	/**
	 * Creates a new, empty instance of %(name)s
	 */
	public static final native %(name)s create%(name)s()
	/*-{
		return {};
	}-*/;
"""

GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public final native %(getterType)s get%(nameCapital)s() 
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

CALLBACK_GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public final native %(type)s get%(nameCapital)s() 
	/*-{
		return this.%(name)s._javaObj;
	}-*/;
"""

CALLBACK_SETTER_TEMPLATE = """
	public final native void set%(nameCapital)s(%(type)s value) 
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.%(name)s = callback;
	}-*/;
"""

STATIC_GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(getterType)s get%(nameCapital)s() 
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

STATIC_CALLBACK_GETTER_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public static native %(type)s get%(nameCapital)s() 
	/*-{
		return %(module)s.%(name)s._javaObj;
	}-*/;
"""

STATIC_CALLBACK_SETTER_TEMPLATE = """
	public static native void set%(nameCapital)s(%(type)s value) 
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		%(module)s.%(name)s = callback;
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
		return %(module)s.%(nativeName)s(%(paramNames)s);
	}-*/;
"""

METHOD_TEMPLATE = """
	/**
	 * %(docString)s
	 */
	public final native %(return)s %(name)s (%(params)s) 
	/*-{
		return this.%(nativeName)s(%(paramNames)s);
	}-*/;
"""

FACTORY_TEMPLATE = """
	public static native %(return)s %(name)s () 
	/*-{
		return %(type)s.%(name)s();
	}-*/;
"""

EVENT_CLASS_BODY_TEMPLATE = """
	public final static String NATIVE_EVENT_NAME = "%(name)s";
	
	protected %(javaName)sEvent() {}

	%(eventProperties)s		
"""

EVENT_HANDLER_BODY_TEMPLATE = """
	public void on%(javaName)s(%(javaName)sEvent event);
"""

EVENT_TEMPLATE = """
	public final native void add%(javaName)sHandler(%(javaName)sHandler handler) 
	/*-{
		return this.addEventListener('%(name)s', function(e) { handler.@%(handlerClass)s::on%(javaName)s(L%(eventClassPath)s;)(e); } );
	}-*/;
"""

STATIC_EVENT_TEMPLATE = """
	public static native void add%(javaName)sHandler(%(javaName)sHandler handler) 
	/*-{
		return %(module)s.addEventListener('%(name)s', function(e) { handler.@%(handlerClass)s::on%(javaName)s(L%(eventClassPath)s;)(e); } );
	}-*/;
"""

class JavaClass(object):
	def __init__(self, package, name, body = "", interface = False, superClass = None, javaDoc = ""):
		self.package = PACKAGE_PREFIX + package
		self.name = name
		self.imports = []
		self.body = body
		self.interface = interface
		self.superClass = superClass
		self.javaDoc = javaDoc
		if superClass:
			self.setSuperClass(superClass)
	
	def addImport(self, name):
		if isinstance(name, JavaClass):
			name = name.package + "." + name.name
		package = ".".join(name.split(".")[:-1])
		if (name not in self.imports) and (package != self.package):
			self.imports.append(name)
		
	def setInterface(self, value):
		self.interface = value
		
	def setSuperClass(self, value):
		self.superClass = value
	
	def setJavaDoc(self, value):
		self.javaDoc = value
		
	def append(self, code):
		self.body += code
		
	def getPath(self):
		return os.path.join(self.package.replace(".", "/"), self.name + ".java")
	
	def getPackage(self):
		return self.package
	
	def getName(self):
		return self.name
	
	def getQualifiedName(self):
		return self.package + "." + self.name
	
	def getCode(self):
		importsString = "\n".join("import %s;" % importName for importName in self.imports)
		return CLASS_TEMPLATE % {
			'package': self.package,
			'type': "interface" if self.interface else "class",
			'superClass': "extends " + self.superClass if self.superClass else "",
			'name': self.name,
			'javaDoc': self.javaDoc,
			'imports': importsString,
			'body': self.body,
		}

def capitalFirst(s):
	return s[0].upper() + s[1:]

def mapTypes(s, withConsts = False):
	TYPE_MAP = {
		"String": "String",
		"int": "int",
		"long": "long",
		"float": "float",
		"double": "double",
		"Number": "float",
		"Boolean": "boolean",
		"void": "void",
		"Object": "JavaScriptObject",
		"Date": "java.util.Date",
		"Font": "org.urish.gwtit.client.font.Font",
		"$Point": "org.urish.gwtit.client.util.Point",
		"$Size": "org.urish.gwtit.client.util.Size",
		"$Range": "org.urish.gwtit.client.util.Range",
	}
	if s in TYPE_MAP.keys():
		return TYPE_MAP[s]
	if type(s) == list:
		return "Object"
	arrayMatch = re.match("^Array<(.+)>$", s)
	if arrayMatch:
		return mapTypes(arrayMatch.group(1), withConsts) + "[]"
	dictionaryMatch = re.match("^Dictionary<(.+)>$", s)
	if dictionaryMatch:
		return mapTypes(dictionaryMatch.group(1), withConsts)
	callbackMatch = re.match("^(?:Callback|Object)<(.+)>$", s)
	if callbackMatch:
		innerType = mapTypes(callbackMatch.group(1), withConsts)
		if innerType == 'Object':
			innerType = "JavaScriptObject" 
		return "EventCallback<%s>" % innerType
	eventMatch = re.match("^Event<(.+)\.([^.]+)>$", s)
	if eventMatch:
		innerType, eventName = eventMatch.groups()
		innerType = re.sub(r"\.[^.]+$", "", mapTypes(innerType, withConsts))
		return "%s.events.%sEvent" % (innerType, capitalFirst(eventName))
	if s in ["AcceptDict", "CreateBufferArgs", "CreateStreamArgs", "DecodeNumberDict", 
			"DecodeStringDict", "EncodeNumberDict",  "EncodeStringDict", "ImageAsCroppedDict",
			"MediaItemType", "MediaQueryInfoType", "MediaQueryType"]:
		s = "Titanium.%s" % s
	if s.startswith("Titanium."):
		path = s.split(".")
		if withConsts and path[-1].upper() == path[-1]:
			# Constant
			return "org.urish.gwtit.%s.%s.%s" % (".".join(path[:-2]).lower(), path[-2], path[-1])
		return "org.urish.gwtit." + ".".join(path[:-1]).lower() + "." + path[-1]
	if s.endswith("CallbackArgs") or s in ['EncodeNumberSpec', 'DecodeStringSpec']:
		return "org.urish.gwtit.titanium." + s
	print "!!!WARN!!! unknown type detected: ", s
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
		allReadOnly = 'readonly' in type and type['readonly']
		for property in type['properties']:
			readonly = allReadOnly or (property['description'] and property['description'].lower().strip().startswith("readonly"))
			if 'permission' in property and property['permission'] == "read-only":
				readonly = True
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
						'getterType': mapTypes(property.get('getterType', "Object")),
						'module': type['name'],
						'docString': docString,
					}
				else:
					mappedType = mapTypes(property['type'])
					if mappedType.startswith("EventCallback<"):
						getter = STATIC_CALLBACK_GETTER_TEMPLATE if isSingleton else CALLBACK_GETTER_TEMPLATE
						setter = STATIC_CALLBACK_SETTER_TEMPLATE if isSingleton else CALLBACK_SETTER_TEMPLATE
					result += (getter + setter) % {
						'name': property['name'],
						'nameCapital': capitalFirst(property['name']),
						'type': mappedType,
						'getterType': mapTypes(property.get('getterType', property['type'])),
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
	if 'description' in property and property['description']:
		parts.append("@return " + parseDocString(property['description']).capitalize())
	if 'platforms' in property:
		parts += ["@platforms " + ", ".join(property['platforms'])]
	if 'since' in property:
		parts += ["@since " + property['since']]
	return "\n * ".join(parts)

def generateMethodDoc(method, paramNames):
	parts = []
	if 'description' in method:
		parts.append(parseDocString(method['description']).capitalize())
	if 'platforms' in method:
		parts += ["@platforms " + ", ".join(method['platforms'])]
	if 'parameters' in method:
		for parameter in method['parameters']:
			if parameter['name'] in paramNames:
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

def generateConstructors(typeInfo):
	if 'needsConstructor' in typeInfo and typeInfo['needsConstructor']:
		return CONSTRUCTOR_TEMPLATE % {
			'name': typeInfo['name'].split(".")[-1],
			'return': mapTypes(typeInfo['name'])				
		}
	return ""

def generateFactories(typeInfo, types):
	typeName = typeInfo['name']
	result = ""
	for candidate in types:
		if (candidate['name'].startswith(typeName + ".") and 
			len(candidate['name'].split(".")) == len(typeName.split(".")) + 1):
			factoryName = 'create' + candidate['name'].split(".")[-1]
			duplicate = False
			readonly = 'readonly' in candidate and candidate['readonly'] 
			if 'methods' in typeInfo:
				for method in typeInfo['methods']:
					if method['name'] == factoryName:
						duplicate = True
			if not duplicate and not readonly:
				result += FACTORY_TEMPLATE % {
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
			optional = ('optional' in parameter and parameter['optional'] or
						'default' in parameter and parameter['default'])
			if optional:
				yield (copy(params), copy(paramNames))
			name = mapIdentifiers(parameter['name'])
			paramType = mapTypes(parameter['type'])
			paramGetter = name
			if paramType.startswith("EventCallback<"):
				paramGetter = "function(e) { %s.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); }" % name
			paramNames.append(paramGetter)
			params.append("%s %s" % (paramType, name))
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
					'docString': generateMethodDoc(method, paramNames),
					'params': ", ".join(params),
					'paramNames': ", ".join(paramNames),
					'return': mapTypes(returnType),
				}
	return result
	
def capitalEventName(eventName):
	def capitalMatch(match):
		return match.group(1).upper()
	return re.sub(":(.)", capitalMatch, capitalFirst(eventName))

def getPackageNameSuffix(typeInfo):
	return ".".join(["titanium"] + typeInfo['name'].split(".")[1:-1]).lower();
	
def generateEvents(javaClass, typeInfo, isSingleton, types):
	result = ""
	template = STATIC_EVENT_TEMPLATE if isSingleton else EVENT_TEMPLATE
	package = getPackageNameSuffix(typeInfo)
	packagePath = package.replace(".", "/")
	eventClasses = []
	for event in typeInfo.get('events', []):
		superClass = "AbstractTitaniumEvent"
		javaName = event.get("javaName", capitalEventName(event['name']))
		foundInAncetors = False
		eventProperties = ""
		propertyNames = [propertyInfo['name'] for propertyInfo in event['properties']]
		skipEventProperties = ["source", "type"]
		if 'x' in propertyNames and 'y' in propertyNames and 'globalPoint' in propertyNames:
			superClass = "TouchEvent"
			skipEventProperties += ['x', 'y', 'globalPoint']
		for propertyInfo in event['properties']:
			if propertyInfo['name'] in skipEventProperties:
				continue
			eventType = propertyInfo.get('type', "Object")
			if eventType == "Object":
				print "WARNING: no type, event= " + event['name'] + " property= " + propertyInfo['name']
			eventProperties += GETTER_TEMPLATE % {
				'docString': propertyInfo['description'],
				'getterType': mapTypes(eventType),
				'name': propertyInfo['name'],
				'nameCapital': capitalFirst(propertyInfo['name']),
			}
		if not isSingleton:
			for ancestor in ancestors(typeInfo, types):
				for candidate in ancestor.get('events', []):
					if event['name'] == candidate['name']:
						foundInAncetors = True
		if not foundInAncetors: 
			eventClass = JavaClass(package + ".events", javaName + "Event", superClass=superClass, body=EVENT_CLASS_BODY_TEMPLATE % {
				'eventProperties': eventProperties,
				'name': event['name'],
				'javaName': javaName,
			})
			eventClass.addImport("com.google.gwt.core.client.JavaScriptObject")
			eventClass.addImport("org.urish.gwtit.client.event.%s" % superClass)
			handlerClass = JavaClass(package + ".events", javaName + "Handler", interface=True, body=EVENT_HANDLER_BODY_TEMPLATE % {
				'javaName': javaName,
			})
			javaClass.addImport(handlerClass)
			javaClass.append(template % {
				'handlerClass': handlerClass.getQualifiedName(),
				'eventClassPath': eventClass.getQualifiedName().replace(".", "/"),
				'name': event['name'],
				'javaName': javaName,
				'module': typeInfo['name'],
			})
			eventClasses += [eventClass, handlerClass]
	return eventClasses

def generateClass(projectRoot, type, types):
	print type['name']
	type['name'] = re.sub(r"(^|\.)(\d)", r"\1_\2", type['name'])
	name = type['name'].split(".")
	superClass = "JavaScriptObject"
	singleton = False
	if ('extends' in type) and type['name'] != "Titanium.Module":
		superClass = mapTypes(type['extends'])
		singleton = type['extends'] == 'Titanium.Module'
	className = getPackageNameSuffix(type) + "." + name[-1]
	javaClass = JavaClass(getPackageNameSuffix(type), name[-1])
	javaClass.setSuperClass(superClass)
	javaClass.addImport("com.google.gwt.core.client.JavaScriptObject")
	javaClass.addImport("org.urish.gwtit.client.EventCallback")
	javaClass.setJavaDoc(generateClassDoc(type))
	javaClass.append("protected %s () {}" % name[-1])
	javaClass.append(generateConstructors(type))
	javaClass.append(generateProperties(type, singleton, types))
	javaClass.append(generateFactories(type, types))
	if 'methods' in type:
		javaClass.append(generateMethods(type, singleton, types))
	classes = generateEvents(javaClass, type, singleton, types)
	classes.append(javaClass)
	BASE_PATH = r"src/main/java"
	classFiles = []
	for javaClass in classes:
		dir = os.path.join(projectRoot, BASE_PATH, os.path.dirname(javaClass.getPath()))
		if not os.path.exists(dir):
			os.makedirs(dir)
		classFile = os.path.join(dir, os.path.basename(javaClass.getPath()))
		file(classFile, "w").write(javaClass.getCode())
		classFiles.append(classFile)
	return classFiles

def getTypes(path):
	with open(path, 'r') as f:
		return list(yaml.load_all(f))

def chunks(l, n):
    """ Yield successive n-sized chunks from l."""
    for i in xrange(0, len(l), n):
        yield l[i:i+n]
        
def processSelectorChain(subject, chain, value):
	while len(chain) > 0:
		selector = chain.pop(0)
		if (len(chain) == 0) and (value != None):
			if selector.endswith("+"):
				subject[selector] += value
			else:
				subject[selector] = value
		match = re.match(r"^([^[]+)\[([^=]+)='([^']+)'\]$", selector)
		rematch = re.match(r"^([^[]+)\[([^=]+)=/([^/]+)/\]$", selector)
		if match:
			realKey, searchKey, searchValue = match.groups()
			for subItem in subject[realKey]:
				if subItem[searchKey] == searchValue:
					if len(chain) > 0:
						subject = subItem
					else:		
						subject[realKey].remove(subItem)
		elif rematch:
			realKey, searchKey, searchValue = rematch.groups()
			for subItem in subject[realKey]:
				if re.search(searchValue, subItem[searchKey]):
					if len(chain) > 0:
						processSelectorChain(subItem, list(chain), value)
					else:
						subject[realKey].remove(subItem) 
			return
		else:
			subject = subject[selector]
	
def processOverrides(typeInfo, overrides):
	for key, item in overrides.items():
		key = re.sub("\s+", " ", key)
		chain = key.split(" ")
		processSelectorChain(typeInfo, chain, item)

def processDir(inputDir, projectDir):
	types = []
	for root, dirs, files in os.walk(os.path.abspath(inputDir)):
		for name in files:
			if name.endswith('.yml'):
				types.extend(getTypes(os.path.join(root, name)))
	overrides = json.load(file("overrides_number.json", "r"))
	for typeName, value in json.load(file("overrides.json", "r")).items():
		if typeName in overrides:
			overrides[typeName].update(value)
		else:
			overrides[typeName] = value
	classes = []
	for typeName, typeInfo in overrides.items():
		if typeName[0] == "+":
			typeInfo['name'] = typeName[1:]
			types.append(typeInfo)
	for typeInfo in types:
		if typeInfo['name'] in overrides:
			processOverrides(typeInfo, overrides[typeInfo['name']])
		classes += generateClass(projectDir, typeInfo, types)
	# Format the generated code
	for someClasses in chunks(classes, 64):
		os.system("eclipsec -application org.eclipse.jdt.core.JavaCodeFormatter -verbose -config %s\.settings\org.eclipse.jdt.core.prefs %s" % (projectDir, " ".join(someClasses)))

if __name__ == "__main__":
	processDir(r"C:\projects\titanium_mobile\apidoc\titanium", "C:\Projects\gwt-titanium")
