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
 * A key-value paired map that maps string objects to
 * {@link org.urish.gwtit.titanium.xml.node} objects. this conforms to the [dom
 * level 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * namednodemap.
 * 
 * @since 0.9
 */
public class NamedNodeMap extends org.urish.gwtit.titanium.Proxy {
	protected NamedNodeMap() {
	}

	/**
	 * @return The number of nodes in the map. the valid range of child node
	 *         indices is 0-`length`-1, inclusive.
	 */
	public final native float getLength()
	/*-{
		return this.length;
	}-*/;

	public final native void setLength(float value)
	/*-{
		this.length = value;
	}-*/;

	/**
	 * Retrieves a node specified by name.
	 * 
	 * @param name
	 *            The name of the node to retrieve.
	 * @return The specified node, or `null` if no node with the name is in the
	 *         map
	 */
	public final native org.urish.gwtit.titanium.xml.Node getNamedItem(String name)
	/*-{
		return this.getNamedItem(name);
	}-*/;

	/**
	 * Adds a node using its `nodename` attribute. if a node with that name is
	 * already present, it is replaced. throws an exception if the argument is
	 * from a different document, the map is read-only, or the argument is an
	 * attribute of another element.
	 * 
	 * @param node
	 *            The node to insert into the map.
	 * @return The node replaced, or `null` if no node was replaced.
	 */
	public final native org.urish.gwtit.titanium.xml.Node setNamedItem(org.urish.gwtit.titanium.xml.Node node)
	/*-{
		return this.setNamedItem(node);
	}-*/;

	/**
	 * Removes a node from the map specified by name. when this map contains
	 * attributes attached to an element, if the removed attribtue is known to
	 * have a default, it is replaced with that value.
	 * 
	 * @param name
	 *            The name of the node to remove.
	 * @return The node removed from the map, or `null` if nothing removed.
	 */
	public final native org.urish.gwtit.titanium.xml.Node removeNamedItem(String name)
	/*-{
		return this.removeNamedItem(name);
	}-*/;

	/**
	 * Retrieves the node at the specified index of the map. note that
	 * namednodemaps are not ordered.
	 * 
	 * @param index
	 *            The index of the node to retrieve.
	 * @return The node at the specified index, or `null` if the index is
	 *         invalid
	 */
	public final native org.urish.gwtit.titanium.xml.Node item(float index)
	/*-{
		return this.item(index);
	}-*/;

	/**
	 * Retrieves a node specified by name and namespace. returns `null` if no
	 * matching node is in the map.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the node to retrieve.
	 * @param localName
	 *            The local name of the node within the namespace to retrieve.
	 * @return The specified node, or `null` if there is no matching node.
	 */
	public final native org.urish.gwtit.titanium.xml.Node getNamedItemNS(String namespaceURI, String localName)
	/*-{
		return this.getNamedItemNS(namespaceURI, localName);
	}-*/;

	/**
	 * Adds a node using its `namespaceuri` and `localname` attributes. if a
	 * node with that name is already present, it is replaced. throws an
	 * exception if the argument is from a different document, the map is
	 * read-only, or the argument is an attribute of another element.
	 * 
	 * @param node
	 *            The node to insert into the map.
	 * @return Returns the node replaced, or `null`.
	 */
	public final native org.urish.gwtit.titanium.xml.Node setNamedItemNS(org.urish.gwtit.titanium.xml.Node node)
	/*-{
		return this.setNamedItemNS(node);
	}-*/;

	/**
	 * Removes a node from the map specified by local name and namespace uri.
	 * when this map contains attributes attached to an element, if the removed
	 * attribtue is known to have a default, it is replaced with that value.
	 * returns the node removed from the map, or `null` if there is no
	 * corresponding node.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the node to remove.
	 * @param localName
	 *            The local name of the node within the namespace to remove.
	 * @return The node removed from the map, or `null` if nothing removed.
	 */
	public final native org.urish.gwtit.titanium.xml.Node removeNamedItemNS(String namespaceURI, String localName)
	/*-{
		return this.removeNamedItemNS(namespaceURI, localName);
	}-*/;

}
