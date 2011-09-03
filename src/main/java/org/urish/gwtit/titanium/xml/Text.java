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
 * Represents the textual content of an
 * {@link org.urish.gwtit.titanium.xml.Element} or
 * {@link org.urish.gwtit.titanium.xml.Attr} This conforms to the [DOM Level
 * 2](http://www.w3.org/TR/DOM-Level-2-Core/core.html) defintion of a DOM Text.
 */
public class Text extends org.urish.gwtit.titanium.xml.CharacterData {
	protected Text() {
	}

	/**
	 * Breaks this node into two nodes at the specified by offset, and returns a
	 * new node of the same type, which contains all the content at and after
	 * the offset point. Throws an exception if the specified offset is negative
	 * or if this node is read only.
	 * 
	 * @param offset
	 *            The offset at which to split, starting from 0.
	 * @return The new node, of the same type as this node
	 */
	public final native org.urish.gwtit.titanium.xml.Text splitText(float offset)
	/*-{
		return this.splitText(offset);
	}-*/;

}
