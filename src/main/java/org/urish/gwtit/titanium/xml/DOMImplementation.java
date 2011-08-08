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
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * The {@link org.urish.gwtit.titanium.xml.domimplementation} interface provides
 * a number of methods for performing operations that are independent of any
 * particular instance of the document object model. this conforms to the [dom
 * level 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * domimplementation.
 * 
 * @since 1.8
 */
public class DOMImplementation extends org.urish.gwtit.titanium.Proxy {
	protected DOMImplementation() {
	}

	/**
	 * Creates an {@link org.urish.gwtit.titanium.xml.document} object of the
	 * specified type with its document element. raises an exception if
	 * qualifiedname is malformed, contains an illegal character, or is
	 * inconsistent with namespaceuri. also raises an exception if doctype has
	 * already been used with a different document.
	 * 
	 * @param namespaceURI
	 *            The namespace URI of the document element to create.
	 * @param qualifiedName
	 *            The qualified name of the document element to be created.
	 * @param doctype
	 *            The type of document to be created or null. When doctype is
	 *            not null, its Node.ownerDocument attribute is set to the
	 *            document being created.
	 * @return A new {@link org.urish.gwtit.titanium.xml.Document} object
	 */
	public final native org.urish.gwtit.titanium.xml.Document createDocument(String namespaceURI, String qualifiedName,
			org.urish.gwtit.titanium.xml.DocumentType doctype)
	/*-{
		return this.createDocument(namespaceURI, qualifiedName, doctype);
	}-*/;

	/**
	 * Creates an empty {@link org.urish.gwtit.titanium.xml.documenttype} node.
	 * entity declarations and notations are not made available. entity
	 * reference expansions and default attribute additions do not occur. raises
	 * an exception if qualifiedname is malformed or contains an illegal
	 * character.
	 * 
	 * @param qualifiedName
	 *            The qualified name of the document type to be created.
	 * @param publicId
	 *            The external subset public identifier.
	 * @param systemId
	 *            The external subset system identifier.
	 * @return A new {@link org.urish.gwtit.titanium.xml.DocumentType} node with
	 *         Node.ownerDocument set to null.
	 */
	public final native org.urish.gwtit.titanium.xml.DocumentType createDocumentType(String qualifiedName,
			String publicId, String systemId)
	/*-{
		return this.createDocumentType(qualifiedName, publicId, systemId);
	}-*/;

	/**
	 * Test if the {@link org.urish.gwtit.titanium.xml.domimplementation}
	 * implements a specific feature.
	 * 
	 * @param feature
	 *            The name of the feature to test (case-insensitive). The values
	 *            used by DOM features are defined throughout the DOM Level 2
	 *            specifications and listed in the Conformance section. The name
	 *            must be an XML name. To avoid possible conflicts, as a
	 *            convention, names referring to features defined outside the
	 *            DOM specification should be made unique by reversing the name
	 *            of the Internet domain name of the person (or the organization
	 *            that the person belongs to) who defines the feature, component
	 *            by component, and using this as a prefix. For instance, the
	 *            W3C SVG Working Group defines the feature "org.w3c.dom.svg".
	 * @param version
	 *            This is the version number of the feature to test. In Level 2,
	 *            the string can be either "2.0" or "1.0". If the version is not
	 *            specified, supporting any version of the feature causes the
	 *            method to return true.
	 * @return true if the feature is implemented in the specified version,
	 *         false otherwise.
	 */
	public final native boolean hasFeature(String feature, String version)
	/*-{
		return this.hasFeature(feature, version);
	}-*/;

}
