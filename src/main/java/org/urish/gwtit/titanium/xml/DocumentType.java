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
 * Each {@link org.urish.gwtit.titanium.xml.document} has a `doctype` attribute
 * whose value is either 'null' or a
 * {@link org.urish.gwtit.titanium.xml.documenttype} object. this provides an
 * interface to the list of entities that are defined for the document. this
 * conforms to the [dom level
 * 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * documenttype.
 * 
 * @since 0.9
 */
public class DocumentType extends org.urish.gwtit.titanium.xml.Node {
	protected DocumentType() {
	}

	/**
	 * @return A {@link org.urish.gwtit.titanium.xml.namednodemap} containing
	 *         the general entities, both external and internal, declared in the
	 *         dtd. parameter entities are not contained. duplicates are
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
	 * @return The name of dtd; i.e., the name immediately following the
	 *         `doctype` keyword.
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	/**
	 * @return A {@link org.urish.gwtit.titanium.xml.namednodemap} containing
	 *         the notations declared in the dtd. duplicates are discarded.
	 *         every node in this map also implements the
	 *         {@link org.urish.gwtit.titanium.xml.notation} interface.
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
