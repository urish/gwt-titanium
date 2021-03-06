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
 * Each {@link org.urish.gwtit.titanium.xml.Document} has a `doctype` attribute
 * whose value is either 'null' or a
 * {@link org.urish.gwtit.titanium.xml.DocumentType} object. This provides an
 * interface to the list of entities that are defined for the document. This
 * conforms to the [DOM Level
 * 2](http://www.w3.org/TR/DOM-Level-2-Core/core.html) defintion of a DOM
 * DocumentType.
 * 
 * <p>
 * Notes: As of version 3.1, Android still does not truly support DTDs. A
 * document with a DTD can be parsed, however it is not validated, none of its
 * default attributes will automatically be put into the tree, etc. [Google is
 * aware of the issue](http://code.google.com/p/android/issues/detail?id=7395).
 * 
 * @since 0.9
 */
public class DocumentType extends org.urish.gwtit.titanium.xml.Node {
	protected DocumentType() {
	}

	/**
	 * @return A {@link org.urish.gwtit.titanium.xml.NamedNodeMap} containing
	 *         the general entities, both external and internal, declared in the
	 *         DTD. Parameter entities are not contained. Duplicates are
	 *         discarded.
	 */
	public final native org.urish.gwtit.titanium.xml.NamedNodeMap getEntities()
	/*-{
		return this.entities;
	}-*/;

	/**
	 * @return The internal subset as a string.
	 */
	public final native String getInternalSubset()
	/*-{
		return this.internalSubset;
	}-*/;

	/**
	 * @return The name of DTD; i.e., the name immediately following the
	 *         `DOCTYPE` keyword.
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	/**
	 * @return A {@link org.urish.gwtit.titanium.xml.NamedNodeMap} containing
	 *         the notations declared in the DTD. Duplicates are discarded.
	 *         Every node in this map also implements the
	 *         {@link org.urish.gwtit.titanium.xml.Notation} interface.
	 */
	public final native org.urish.gwtit.titanium.xml.NamedNodeMap getNotations()
	/*-{
		return this.notations;
	}-*/;

	/**
	 * @return The public identifier of the external subset.
	 */
	public final native String getPublicId()
	/*-{
		return this.publicId;
	}-*/;

	/**
	 * @return The system identifier of the external subset.
	 */
	public final native String getSystemId()
	/*-{
		return this.systemId;
	}-*/;

}
