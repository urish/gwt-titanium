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
	 * Parse an xml string into a domdocument
	 * 
	 * @param xml
	 *            the XML content as a string
	 */
	public static native Object parseString(String xml)
	/*-{
		return Titanium.XML.parseString(xml);
	}-*/;

	/**
	 * Serialize a domdocument or domnode and its descendants into an xml string
	 * 
	 * @param node
	 *            the XML DOMNode or DOMDocument to serialize
	 */
	public static native String serializeToString(Object node)
	/*-{
		return Titanium.XML.serializeToString(node);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.XML.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.XML.removeEventListener(name, callbac);
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
