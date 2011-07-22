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
 * A single node in the [document|titanium.xml.document] tree. for full property
 * and method description, see the [dom level 2
 * api|http://www.w3.org/tr/2000/rec
 * -dom-level-2-core-20001113/core.html#id-1950641247].
 */
public class Node extends org.urish.gwtit.titanium.Proxy {
	protected Node() {
	}

	private static native final float value_ELEMENT_NODE()
	/*-{
		return Titanium.XML.Node.ELEMENT_NODE;
	}-*/;

	public static final float ELEMENT_NODE = value_ELEMENT_NODE();

	private static native final float value_ATTRIBUTE_NODE()
	/*-{
		return Titanium.XML.Node.ATTRIBUTE_NODE;
	}-*/;

	public static final float ATTRIBUTE_NODE = value_ATTRIBUTE_NODE();

	private static native final float value_TEXT_NODE()
	/*-{
		return Titanium.XML.Node.TEXT_NODE;
	}-*/;

	public static final float TEXT_NODE = value_TEXT_NODE();

	private static native final float value_CDATA_SECTION_NODE()
	/*-{
		return Titanium.XML.Node.CDATA_SECTION_NODE;
	}-*/;

	public static final float CDATA_SECTION_NODE = value_CDATA_SECTION_NODE();

	private static native final float value_ENTITY_REFERENCE_NODE()
	/*-{
		return Titanium.XML.Node.ENTITY_REFERENCE_NODE;
	}-*/;

	public static final float ENTITY_REFERENCE_NODE = value_ENTITY_REFERENCE_NODE();

	private static native final float value_ENTITY_NODE()
	/*-{
		return Titanium.XML.Node.ENTITY_NODE;
	}-*/;

	public static final float ENTITY_NODE = value_ENTITY_NODE();

	private static native final float value_PROCESSING_INSTRUCTION_NODE()
	/*-{
		return Titanium.XML.Node.PROCESSING_INSTRUCTION_NODE;
	}-*/;

	public static final float PROCESSING_INSTRUCTION_NODE = value_PROCESSING_INSTRUCTION_NODE();

	private static native final float value_COMMENT_NODE()
	/*-{
		return Titanium.XML.Node.COMMENT_NODE;
	}-*/;

	public static final float COMMENT_NODE = value_COMMENT_NODE();

	private static native final float value_DOCUMENT_NODE()
	/*-{
		return Titanium.XML.Node.DOCUMENT_NODE;
	}-*/;

	public static final float DOCUMENT_NODE = value_DOCUMENT_NODE();

	private static native final float value_DOCUMENT_TYPE_NODE()
	/*-{
		return Titanium.XML.Node.DOCUMENT_TYPE_NODE;
	}-*/;

	public static final float DOCUMENT_TYPE_NODE = value_DOCUMENT_TYPE_NODE();

	private static native final float value_DOCUMENT_FRAGMENT_NODE()
	/*-{
		return Titanium.XML.Node.DOCUMENT_FRAGMENT_NODE;
	}-*/;

	public static final float DOCUMENT_FRAGMENT_NODE = value_DOCUMENT_FRAGMENT_NODE();

	private static native final float value_NOTATION_NODE()
	/*-{
		return Titanium.XML.Node.NOTATION_NODE;
	}-*/;

	public static final float NOTATION_NODE = value_NOTATION_NODE();

	/**
	 * @return The name of this node
	 */
	public final native String getNodeName()
	/*-{
		return this.nodeName;
	}-*/;

	public final native void setNodeName(String value)
	/*-{
		this.nodeName = value;
	}-*/;

	/**
	 * @return The content (value) of this node
	 */
	public final native String getNodeValue()
	/*-{
		return this.nodeValue;
	}-*/;

	public final native void setNodeValue(String value)
	/*-{
		this.nodeValue = value;
	}-*/;

	/**
	 * @return This node's type. one of , , , , , , , , , , ,
	 */
	public final native float getNodeType()
	/*-{
		return this.nodeType;
	}-*/;

	public final native void setNodeType(float value)
	/*-{
		this.nodeType = value;
	}-*/;

	/**
	 * @return This node's parent node
	 */
	public final native org.urish.gwtit.titanium.xml.Node getParentNode()
	/*-{
		return this.parentNode;
	}-*/;

	public final native void setParentNode(org.urish.gwtit.titanium.xml.Node value)
	/*-{
		this.parentNode = value;
	}-*/;

	/**
	 * @return A {@link org.urish.gwtit.titanium.xml.nodelist} of this node's
	 *         children
	 */
	public final native org.urish.gwtit.titanium.xml.NodeList getChildNodes()
	/*-{
		return this.childNodes;
	}-*/;

	public final native void setChildNodes(org.urish.gwtit.titanium.xml.NodeList value)
	/*-{
		this.childNodes = value;
	}-*/;

	/**
	 * @return This node's first child
	 */
	public final native org.urish.gwtit.titanium.xml.Node getFirstChild()
	/*-{
		return this.firstChild;
	}-*/;

	public final native void setFirstChild(org.urish.gwtit.titanium.xml.Node value)
	/*-{
		this.firstChild = value;
	}-*/;

	/**
	 * @return This node's last child
	 */
	public final native org.urish.gwtit.titanium.xml.Node getLastChild()
	/*-{
		return this.lastChild;
	}-*/;

	public final native void setLastChild(org.urish.gwtit.titanium.xml.Node value)
	/*-{
		this.lastChild = value;
	}-*/;

	/**
	 * @return This node's previous sibling
	 */
	public final native org.urish.gwtit.titanium.xml.Node getPreviousSibling()
	/*-{
		return this.previousSibling;
	}-*/;

	public final native void setPreviousSibling(org.urish.gwtit.titanium.xml.Node value)
	/*-{
		this.previousSibling = value;
	}-*/;

	/**
	 * @return This node's next sibling
	 */
	public final native org.urish.gwtit.titanium.xml.Node getNextSibling()
	/*-{
		return this.nextSibling;
	}-*/;

	public final native void setNextSibling(org.urish.gwtit.titanium.xml.Node value)
	/*-{
		this.nextSibling = value;
	}-*/;

	/**
	 * @return A map of this node's attributes
	 */
	public final native org.urish.gwtit.titanium.xml.NamedNodeMap getAttributes()
	/*-{
		return this.attributes;
	}-*/;

	public final native void setAttributes(org.urish.gwtit.titanium.xml.NamedNodeMap value)
	/*-{
		this.attributes = value;
	}-*/;

	/**
	 * @return This node's owning document
	 */
	public final native org.urish.gwtit.titanium.xml.Document getOwnerDocument()
	/*-{
		return this.ownerDocument;
	}-*/;

	public final native void setOwnerDocument(org.urish.gwtit.titanium.xml.Document value)
	/*-{
		this.ownerDocument = value;
	}-*/;

	/**
	 * @return The namespace uri of this node
	 */
	public final native String getNamespaceURI()
	/*-{
		return this.namespaceURI;
	}-*/;

	public final native void setNamespaceURI(String value)
	/*-{
		this.namespaceURI = value;
	}-*/;

	/**
	 * @return The namespace prefix of this node
	 */
	public final native String getPrefix()
	/*-{
		return this.prefix;
	}-*/;

	public final native void setPrefix(String value)
	/*-{
		this.prefix = value;
	}-*/;

	/**
	 * @return The local part of the qualified name of this node
	 */
	public final native String getLocalName()
	/*-{
		return this.localName;
	}-*/;

	public final native void setLocalName(String value)
	/*-{
		this.localName = value;
	}-*/;

	/**
	 * Appends the node `newchild` as a child of this node
	 * 
	 * @param newChild
	 *            The new node to append
	 * @return The appended node
	 */
	public final native org.urish.gwtit.titanium.xml.Node appendChild(org.urish.gwtit.titanium.xml.Node newChild)
	/*-{
		return this.appendChild(newChild);
	}-*/;

	/**
	 * Returns a duplicate of this node
	 * 
	 * @param deep
	 *            Whether or not to perform a deep copy of this node
	 * @return The appended node
	 */
	public final native org.urish.gwtit.titanium.xml.Node cloneNode(boolean deep)
	/*-{
		return this.cloneNode(deep);
	}-*/;

	/**
	 * Whether or not this node has attributes
	 */
	public final native boolean hasAttributes()
	/*-{
		return this.hasAttributes();
	}-*/;

	/**
	 * Whether or not this node has child nodes
	 */
	public final native boolean hasChildNodes()
	/*-{
		return this.hasChildNodes();
	}-*/;

	/**
	 * @param newChild
	 *            The node to insert
	 * @param refChild
	 *            The node to insert `newChild` before
	 * @return The inserted node
	 */
	public final native org.urish.gwtit.titanium.xml.Node insertBefore(org.urish.gwtit.titanium.xml.Node newChild,
			org.urish.gwtit.titanium.xml.Node refChild)
	/*-{
		return this.insertBefore(newChild, refChild);
	}-*/;

	/**
	 * Tests whether the dom implementation supports a specific feature
	 * 
	 * @param feature
	 *            The name of the feature
	 * @param version
	 *            The version number of the feature
	 * @return Whether or not the feature is supported
	 */
	public final native boolean isSupported(String feature, String version)
	/*-{
		return this.isSupported(feature, version);
	}-*/;

	/**
	 * Normalizes text and attribute nodes in this node's child hierarchy
	 */
	public final native void normalize()
	/*-{
		return this.normalize();
	}-*/;

	/**
	 * Removes a child node from this node
	 * 
	 * @param oldChild
	 *            The node to remove
	 * @return The node that was removed
	 */
	public final native org.urish.gwtit.titanium.xml.Node removeChild(org.urish.gwtit.titanium.xml.Node oldChild)
	/*-{
		return this.removeChild(oldChild);
	}-*/;

	/**
	 * Replaces the node `oldchild` with the node `newchild`
	 * 
	 * @param newChild
	 *            The new node
	 * @param oldChild
	 *            The node being replaced
	 */
	public final native void replaceChild(org.urish.gwtit.titanium.xml.Node newChild,
			org.urish.gwtit.titanium.xml.Node oldChild)
	/*-{
		return this.replaceChild(newChild, oldChild);
	}-*/;

}
