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
 * An interface extending {@link org.urish.gwtit.titanium.xml.node} with a set
 * of attributes and methods for accessing character data in the dom. this
 * conforms to the [dom level
 * 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * characterdata. unlike the dom, for reasons of compatibility with the
 * javascript engine, text is represented by utf-8 instead of utf-16.
 * 
 * @since 0.9
 */
public class CharacterData extends org.urish.gwtit.titanium.xml.Node {
	protected CharacterData() {
	}

	/**
	 * @return The character data of the node that implements this interface.
	 *         throws an exception during setting if this node is readonly.
	 */
	public final native String getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(String value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return The number of characters that are available through data and the
	 *         substringdata method. this may have the value zero, i.e.,
	 *         {@link org.urish.gwtit.titanium.xml.characterdata} may be empty.
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
	 * Append the string to the end of the character data of the node. upon
	 * success, data provides access to the concatenation of data and the string
	 * specified. throws an exception if this node is readonly.
	 * 
	 * @param arg
	 *            The string to append.
	 */
	public final native void appendData(String arg)
	/*-{
		return this.appendData(arg);
	}-*/;

	/**
	 * Remove a range of characters from the node. upon success, data and length
	 * reflect the change. throws an exception if this node is readonly, if
	 * offset is negative, offset is beyond the data's length, or if count is
	 * negative.
	 */
	public final native void deleteData()
	/*-{
		return this.deleteData();
	}-*/;

	/**
	 * Insert a string at the specified offset. throws an exception if this node
	 * is readonly, if offset is negative, or if offset is beyond the data's
	 * length.
	 */
	public final native void insertData()
	/*-{
		return this.insertData();
	}-*/;

	/**
	 * Replace the characters starting at the specified offset with the
	 * specified string. throws an exception if this node is readonly, if offset
	 * is negative, offset is beyond the data's length, or if count is negative.
	 */
	public final native void replaceData()
	/*-{
		return this.replaceData();
	}-*/;

	/**
	 * Extracts a range of data from the node. throws an exception if offset is
	 * negative, offset is beyond the data's length, or if count is negative.
	 * 
	 * @return The specified substring. If the sum of offset and count exceeds
	 *         the length
	 */
	public final native String substringData()
	/*-{
		return this.substringData();
	}-*/;

}
