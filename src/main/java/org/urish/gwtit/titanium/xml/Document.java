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

package org.urish.gwtit.titanium.xml;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DOM Document returned from
 * {@link org.urish.gwtit.titanium.xml.parseString} or
 * {@link org.urish.gwtit.titanium.xml.parse}. Implements the [DOM Level 2
 * API](http
 * ://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/core.html#i-Document).
 * <p>
 * Notes: As of version 3.1, Android still does not truly support DTDs. A
 * document with a DTD can be parsed, however it is not validated, none of its
 * default attributes will automatically be put into the tree, etc. [Google is
 * aware of the issue](http://code.google.com/p/android/issues/detail?id=7395).
 * 
 * @since 0.9
 */
public class Document extends org.urish.gwtit.titanium.xml.Node {
	protected Document() {
	}

	/**
	 * @return An interface to the list of entities that are defined for the
	 *         document, such as via a Document Type Definition (DTD). See note
	 *         about Android and DTDs.
	 */
	public final native org.urish.gwtit.titanium.xml.DocumentType getDoctype()
	/*-{
		return this.doctype;
	}-*/;

	/**
	 * @return The root element in the document.
	 */
	public final native org.urish.gwtit.titanium.xml.Element getDocumentElement()
	/*-{
		return this.documentElement;
	}-*/;

	/**
	 * @return The [DOMImplementation](Titanium.XML.DOMImplementation) that
	 *         handles this document
	 */
	public final native org.urish.gwtit.titanium.xml.DOMImplementation getImplementation()
	/*-{
		return this.implementation;
	}-*/;

	/**
	 * Creates an attribute with the given name.
	 * 
	 * @param name
	 *            Name for the new attribute
	 * @return An attribute object, ready for putting on an element.
	 */
	public final native org.urish.gwtit.titanium.xml.Attr createAttribute(String name)
	/*-{
		return this.createAttribute(name);
	}-*/;

	/**
	 * Creates an attribute with the given name and namespace.
	 * 
	 * @param namespaceURI
	 *            Namespace URI for the new attribute.
	 * @param name
	 *            Name for the new attribute.
	 */
	public final native void createAttributeNS(String namespaceURI, String name)
	/*-{
		return this.createAttributeNS(namespaceURI, name);
	}-*/;

	/**
	 * Creates and returns a {@link org.urish.gwtit.titanium.xml.CDATASection}.
	 * 
	 * @param data
	 *            The String data to go into the CDATA section.
	 * @return A CDATA section with the given data, ready to be applied to an
	 *         element.
	 */
	public final native JavaScriptObject createCDATASection(String data)
	/*-{
		return this.createCDATASection(data);
	}-*/;

	/**
	 * Creates a {@link org.urish.gwtit.titanium.xml.Comment} with the supplied
	 * string data.
	 * 
	 * @param data
	 *            The textual comment itself.
	 * @return The comment, ready to be appended to the DOM tree.
	 */
	public final native JavaScriptObject createComment(String data)
	/*-{
		return this.createComment(data);
	}-*/;

	/**
	 * Creates an empty {@link org.urish.gwtit.titanium.xml.DocumentFragment}.
	 * 
	 * @return The empty {@link org.urish.gwtit.titanium.xml.DocumentFragment}.
	 */
	public final native JavaScriptObject createDocumentFragment()
	/*-{
		return this.createDocumentFragment();
	}-*/;

	/**
	 * Creates an element with the given tag name.
	 * 
	 * @param tagName
	 *            The name for the created element.
	 * @return The newly created element.
	 */
	public final native org.urish.gwtit.titanium.xml.Element createElement(String tagName)
	/*-{
		return this.createElement(tagName);
	}-*/;

	/**
	 * Create a new element with the given namespace and name.
	 * 
	 * @param namespaceURI
	 *            URI for the namespace the new element belongs to.
	 * @param name
	 *            The name for the new element.
	 * @return the new namespace-qualified element.
	 */
	public final native org.urish.gwtit.titanium.xml.Element createElementNS(String namespaceURI, String name)
	/*-{
		return this.createElementNS(namespaceURI, name);
	}-*/;

	/**
	 * Creates an {@link org.urish.gwtit.titanium.xml.EntityReference} with the
	 * given name.
	 * 
	 * @param name
	 *            Name for the new entity reference.
	 * @return The created entity reference.
	 */
	public final native JavaScriptObject createEntityReference(String name)
	/*-{
		return this.createEntityReference(name);
	}-*/;

	/**
	 * Creates a processing instruction for inserting into the DOM tree.
	 * 
	 * @param target
	 *            The target part for the processing instruction.
	 * @param data
	 *            The data for the processing instruction node.
	 * @return The created processing instruction.
	 */
	public final native org.urish.gwtit.titanium.xml.ProcessingInstruction createProcessingInstruction(String target,
			String data)
	/*-{
		return this.createProcessingInstruction(target, data);
	}-*/;

	/**
	 * Creates a text node.
	 * 
	 * @param data
	 *            The string value for the text node.
	 * @return The created text node.
	 */
	public final native org.urish.gwtit.titanium.xml.Text createTextNode(String data)
	/*-{
		return this.createTextNode(data);
	}-*/;

	/**
	 * Returns an {@link org.urish.gwtit.titanium.xml.Element} that has an ID
	 * attribute with the given value.
	 * 
	 * @param elementId
	 *            A unique ID value for an element to search for.
	 * @return The Element matching the given ID, if any.
	 */
	public final native org.urish.gwtit.titanium.xml.Element getElementById(String elementId)
	/*-{
		return this.getElementById(elementId);
	}-*/;

	/**
	 * Return a node list of elements in the document which have the given tag.
	 * 
	 * @param tagname
	 *            the tag name to search for.
	 * @return The NodeList of elements in the document which have the given tag
	 *         name.
	 */
	public final native org.urish.gwtit.titanium.xml.NodeList getElementsByTagName(String tagname)
	/*-{
		return this.getElementsByTagName(tagname);
	}-*/;

	/**
	 * Return a node list of elements in the document which belong to the given
	 * namespace and have the given tag name.
	 * 
	 * @param namespaceURI
	 *            A namespace URI used for matching elements.
	 * @param localname
	 *            The tag name to search for.
	 * @return The NodeList of elements in the document which belong to the
	 *         given namespace and have the given tag name.
	 */
	public final native org.urish.gwtit.titanium.xml.NodeList getElementsByTagNameNS(String namespaceURI,
			String localname)
	/*-{
		return this.getElementsByTagNameNS(namespaceURI, localname);
	}-*/;

	/**
	 * Imports a node from another document to this document, without altering
	 * or removing the source node from the original document; this method
	 * creates a new copy of the source node. The returned node has no parent.
	 * 
	 * @param importedNode
	 *            The node to import.
	 * @param deep
	 *            If true, recursively import the subtree under the specified
	 *            node; if false, import only the node itself.
	 * @return the imported Node that belongs now to this document.
	 */
	public final native org.urish.gwtit.titanium.xml.Node importNode(org.urish.gwtit.titanium.xml.Node importedNode,
			boolean deep)
	/*-{
		return this.importNode(importedNode, deep);
	}-*/;

}
