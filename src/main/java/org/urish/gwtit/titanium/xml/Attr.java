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
 * Proxy representing an attribute of an [Element](Titanium.XML.Element), as
 * defined in the [DOM Level 2
 * specification](http://www.w3.org/TR/2000/REC-DOM-Level
 * -2-Core-20001113/core.html#ID-637646024).
 */
public class Attr extends org.urish.gwtit.titanium.xml.Node {
	protected Attr() {
	}

	/**
	 * @return Attribute name
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	/**
	 * @return The {@link org.urish.gwtit.titanium.xml.Element} to which the
	 *         attribute belongs.
	 */
	public final native org.urish.gwtit.titanium.xml.Element getOwnerElement()
	/*-{
		return this.ownerElement;
	}-*/;

	/**
	 * @return True if this attribute was explicitly given a value in the
	 *         instance document, false otherwise.
	 */
	public final native boolean getSpecified()
	/*-{
		return this.specified;
	}-*/;

	/**
	 * @return The attribute value as a string.
	 */
	public final native String getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

}
