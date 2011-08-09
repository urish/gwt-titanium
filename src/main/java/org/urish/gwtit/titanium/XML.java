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

package org.urish.gwtit.titanium;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level xml module. the xml module is used parsing and processing
 * xml-based content.
 * 
 * @since 0.9
 */
public class XML extends org.urish.gwtit.titanium.Module {
	protected XML() {
	}

	public static native org.urish.gwtit.titanium.xml.Attr createAttr()
	/*-{
		return Titanium.XML.createAttr();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.CharacterData createCharacterData()
	/*-{
		return Titanium.XML.createCharacterData();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Document createDocument()
	/*-{
		return Titanium.XML.createDocument();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.DocumentType createDocumentType()
	/*-{
		return Titanium.XML.createDocumentType();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.DOMImplementation createDOMImplementation()
	/*-{
		return Titanium.XML.createDOMImplementation();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Element createElement()
	/*-{
		return Titanium.XML.createElement();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Entity createEntity()
	/*-{
		return Titanium.XML.createEntity();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.NamedNodeMap createNamedNodeMap()
	/*-{
		return Titanium.XML.createNamedNodeMap();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Node createNode()
	/*-{
		return Titanium.XML.createNode();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.NodeList createNodeList()
	/*-{
		return Titanium.XML.createNodeList();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Notation createNotation()
	/*-{
		return Titanium.XML.createNotation();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.ProcessingInstruction createProcessingInstruction()
	/*-{
		return Titanium.XML.createProcessingInstruction();
	}-*/;

	public static native org.urish.gwtit.titanium.xml.Text createText()
	/*-{
		return Titanium.XML.createText();
	}-*/;

	/**
	 * Parses an xml string into a {@link org.urish.gwtit.titanium.xml.document}
	 * object. throws an exception if the string is unable to be parsed into a
	 * valid document.
	 * 
	 * @param xml
	 *            the XML content as a string
	 */
	public static native org.urish.gwtit.titanium.xml.Document parseString(String xml)
	/*-{
		return Titanium.XML.parseString(xml);
	}-*/;

	/**
	 * Serializes a {@link org.urish.gwtit.titanium.xml.document} object into a
	 * string.
	 * 
	 * @param node
	 *            The XML DOMNode or DOMDocument to serialize
	 */
	public static native String serializeToString(org.urish.gwtit.titanium.xml.Node node)
	/*-{
		return Titanium.XML.serializeToString(node);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.XML.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.XML.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.XML.fireEvent(name, event);
	}-*/;

}
