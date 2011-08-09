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
 * This interface represents an entity, either parsed or unparsed, in an xml
 * document. note that this models the entity itself not the entity declaration.
 * the nodename attribute that is inherited from node contains the name of the
 * entity. an entity node does not have any parent. this conforms to the [dom
 * level 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * entity.
 * 
 * @since 0.9
 */
public class Entity extends org.urish.gwtit.titanium.xml.Node {
	protected Entity() {
	}

	/**
	 * @return For unparsed entities, the name of the notation for the entity.
	 *         for parsed entities, this is `null`.
	 */
	public final native String getNotationName()
	/*-{
		return this.notationName;
	}-*/;

	/**
	 * @return The public identifier associated with the entity, if specified.
	 *         if the public identifier was not specified, this is `null`.
	 */
	public final native String getPublicId()
	/*-{
		return this.publicId;
	}-*/;

	/**
	 * @return The system identifier associated with the entity, if specified.
	 *         if the system identifier was not specified, this is null.
	 */
	public final native String getSystemId()
	/*-{
		return this.systemId;
	}-*/;

}
