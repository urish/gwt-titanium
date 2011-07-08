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

	public static native org.urish.gwtit.titanium.xml.DOMDocument createDOMDocument()
	/*-{
		return Titanium.XML.createDOMDocument();
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

}
