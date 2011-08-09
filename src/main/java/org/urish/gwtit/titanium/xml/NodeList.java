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
 * A list of {@link org.urish.gwtit.titanium.xml.node} objects. this conforms to
 * the [dom level 2](http://www.w3.org/tr/dom-level-2-core/core.html) definition
 * of a dom nodelist.
 * 
 * @since 0.9
 */
public class NodeList extends org.urish.gwtit.titanium.Proxy {
	protected NodeList() {
	}

	/**
	 * @return The length of the node list.
	 */
	public final native float getLength()
	/*-{
		return this.length;
	}-*/;

	/**
	 * Returns the {@link org.urish.gwtit.titanium.xml.node} object at the
	 * specified index.
	 * 
	 * @param index
	 *            The index of the node to retrieve. Indexing starts at 0.
	 * @return The node at the index, or `null` if the index is out of bounds.
	 */
	public final native org.urish.gwtit.titanium.xml.Node item(float index)
	/*-{
		return this.item(index);
	}-*/;

}
