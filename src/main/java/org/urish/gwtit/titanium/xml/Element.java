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


/**
 * Represents an element in a dom document, a
 * {@link org.urish.gwtit.titanium.xml.node} defined by a start-tag and end-tag
 * (or an empty tag). elements may have [attributes](titanium.xml.attr)
 * associated with them. this conforms to the [dom level
 * 2](http://www.w3.org/tr/dom-level-2-core/core.html) definition of a dom
 * element.
 */
public class Element extends org.urish.gwtit.titanium.xml.Node {
	protected Element() {
	}

	/**
	 * @return The name of the element, as defined by its tag.
	 */
	public final native String getTagName()
	/*-{
		return this.tagName;
	}-*/;

	/**
	 * @return Retrieves all child text nodes as one string
	 */
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	/**
	 * Retrieves an attribute value by name, returning it as a string.
	 * 
	 * @param name
	 *            The name of the attribute
	 * @return The {@link org.urish.gwtit.titanium.xml.Attr} value as a string,
	 *         or empty string if the attribute has no specified or default
	 *         value.
	 */
	public final native String getAttribute(String name)
	/*-{
		return this.getAttribute(name);
	}-*/;

	/**
	 * Adds a new attribute. any attribute with the same name is replaced.
	 * throws an exception if the element is read-only, or if the name contains
	 * an illegal character.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param value
	 *            The value of the attribute. This is value is __not__ parsed as
	 *            part of the assignment. Any markup is treated as literal text,
	 *            and needs to be escaped.
	 */
	public final native void setAttribute(String name, String value)
	/*-{
		return this.setAttribute(name, value);
	}-*/;

	/**
	 * Removes an attribute by name. if the attribute has a default value, it is
	 * immediately replaced with this default, including namespace uri and local
	 * name. throws an exception if the element is read-only.
	 * 
	 * @param name
	 *            The name of the attribute to remove.
	 */
	public final native void removeAttribute(String name)
	/*-{
		return this.removeAttribute(name);
	}-*/;

	/**
	 * Retrieves an attribute value by name, returning it as a
	 * {@link org.urish.gwtit.titanium.xml.attr} object.
	 * 
	 * @param name
	 *            The name of the attribute
	 * @return The {@link org.urish.gwtit.titanium.xml.Attr} value, or null if
	 *         there is no such attribute.
	 */
	public final native org.urish.gwtit.titanium.xml.Attr getAttributeNode(String name)
	/*-{
		return this.getAttributeNode(name);
	}-*/;

	/**
	 * Adds a new attribute. any attribute with the same `nodename` as the
	 * argument is replaced. throws an exception if the element is read-only, if
	 * `newattr` is from a different document, or if `newattr` is already an
	 * attribute of another element.
	 * 
	 * @param newAttr
	 *            The attribute node to add to the element.
	 * @return The attribute that was replaced, or `null` otherwise.
	 */
	public final native org.urish.gwtit.titanium.xml.Attr setAttributeNode(org.urish.gwtit.titanium.xml.Attr newAttr)
	/*-{
		return this.setAttributeNode(newAttr);
	}-*/;

	/**
	 * Removes the specified attribute node. if the removed attribute has a
	 * default value, it is replaced immediately, with the same namespace and
	 * local name as the removed attribute, if applicable. throws an exception
	 * if the element is read-only, or the attribute is not an attribute of the
	 * element.
	 * 
	 * @param oldAttr
	 *            The attribute to remove.
	 */
	public final native void removeAttributeNode(org.urish.gwtit.titanium.xml.Attr oldAttr)
	/*-{
		return this.removeAttributeNode(oldAttr);
	}-*/;

	/**
	 * Retrieves a {@link org.urish.gwtit.titanium.xml.nodelist} of all
	 * descendant elements with a given tag name, in preorder traversal.
	 * 
	 * @param name
	 *            The name of the element. The value `*` matches all tags.
	 */
	public final native org.urish.gwtit.titanium.xml.NodeList getElementsByTagName(String name)
	/*-{
		return this.getElementsByTagName(name);
	}-*/;

	/**
	 * Retrieves an attribute value by local name and namespace uri, returning
	 * it as a string.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the attribute to retrieve.
	 * @param localName
	 *            The local name of the attribute to retrieve.
	 * @return The {@link org.urish.gwtit.titanium.xml.Attr} value as a string,
	 *         or empty string if the attribute has no specified or default
	 *         value.
	 */
	public final native String getAttributeNS(String namespaceURI, String localName)
	/*-{
		return this.getAttributeNS(namespaceURI, localName);
	}-*/;

	/**
	 * Adds a new attribute. any attribute with the same local name and
	 * namespace uri is present on the element is replaced, with its prefix
	 * changed to that of the `qualifiedname` parameter. throws an exception if
	 * the element is read-only, if the name contains an illegal character, or
	 * if the qualified name contains an error.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the attribute.
	 * @param qualifiedName
	 *            The qualified name of the attribute. If it is malformed, has a
	 *            prefix and namespaceURI is `null`, or if the prefix is `xml`
	 *            or `xmlns` but does not correspond to a property defined in
	 *            the [XML](http://www.w3.org/XML/1998/namespace) or
	 *            [XMLNS](http://www.w3.org/2000/xmlns/) specifications, then it
	 *            contains an error.
	 * 
	 * @param value
	 *            The value of the attribute. This is value is __not__ parsed as
	 *            part of the assignment. Any markup is treated as literal text,
	 *            and needs to be escaped.
	 */
	public final native void setAttributeNS(String namespaceURI, String qualifiedName, String value)
	/*-{
		return this.setAttributeNS(namespaceURI, qualifiedName, value);
	}-*/;

	/**
	 * Removes an attribute by local name and namespace uri. if the attribute
	 * has a default value, it is immediately replaced with this default,
	 * including namespace uri and local name. throws an exception if the
	 * element is read-only.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the attribute to remove.
	 * @param localName
	 *            The local name of the attribute to remove.
	 */
	public final native void removeAttributeNS(String namespaceURI, String localName)
	/*-{
		return this.removeAttributeNS(namespaceURI, localName);
	}-*/;

	/**
	 * Retrieves an attribute value by local name and namespace uri, returning
	 * it as a {@link org.urish.gwtit.titanium.xml.attr} object.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the attribute to retrieve.
	 * @param localName
	 *            The local name of the attribute to retrieve.
	 * @return The {@link org.urish.gwtit.titanium.xml.Attr} value, or null if
	 *         there is no such attribute.
	 */
	public final native org.urish.gwtit.titanium.xml.Attr getAttributeNodeNS(String namespaceURI, String localName)
	/*-{
		return this.getAttributeNodeNS(namespaceURI, localName);
	}-*/;

	/**
	 * Adds a new attribute. any attribute with the same local name and
	 * namespace uri is replaced. throws an exception if the element is
	 * read-only, if `newattr` is from a different document, or if `newattr` is
	 * already an attribute of another element.
	 * 
	 * @param newAttr
	 *            The attribute node to add to the element.
	 * @return The attribute that was replaced, or `null` otherwise.
	 */
	public final native org.urish.gwtit.titanium.xml.Attr setAttributeNodeNS(org.urish.gwtit.titanium.xml.Attr newAttr)
	/*-{
		return this.setAttributeNodeNS(newAttr);
	}-*/;

	/**
	 * Retrieves a {@link org.urish.gwtit.titanium.xml.nodelist} of all
	 * descendant elements with a given local name and namespace uri, in
	 * preorder traversal.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the element. The value `*` matches all
	 *            namespaces.
	 * @param localName
	 *            The local name of the element. The value `*` matches all local
	 *            names.
	 */
	public final native org.urish.gwtit.titanium.xml.NodeList getElementsByTagNameNS(String namespaceURI,
			String localName)
	/*-{
		return this.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;

	/**
	 * Determines whether or not an attribute with the given name is available
	 * in the element, or has a default value.
	 * 
	 * @param name
	 *            The name of the attribute to search for.
	 */
	public final native boolean hasAttribute(String name)
	/*-{
		return this.hasAttribute(name);
	}-*/;

	/**
	 * Determines whether or not an attribute with the given name is available
	 * in the element, or has a default value.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the attribute to search for.
	 * @param localName
	 *            The local name of the attribute to search for.
	 */
	public final native boolean hasAttributeNS(String namespaceURI, String localName)
	/*-{
		return this.hasAttributeNS(namespaceURI, localName);
	}-*/;

}
