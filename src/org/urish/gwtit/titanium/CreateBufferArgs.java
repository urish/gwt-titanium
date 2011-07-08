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

package org.urish.gwtit.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Arguments to be passed to createbuffer
 * 
 * @since 1.7
 */
public class CreateBufferArgs extends JavaScriptObject {
	protected CreateBufferArgs() {
	}

	public native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public native void setValue(float value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * @return An initial value which will be encoded and placed in the buffer.
	 *         if value is a number, type must also be set. (this is simply a
	 *         convenient way of calling
	 *         {@link org.urish.gwtit.titanium.codec.encodestring} or
	 *         {@link org.urish.gwtit.titanium.codec.encodenumber} and placing
	 *         the encoded value in the returned buffer.)
	 */
	public native Object getValue()
	/*-{
		return this.value;
	}-*/;

	/**
	 * @return The length of the buffer.
	 */
	public native float getLength()
	/*-{
		return this.length;
	}-*/;

	public native void setLength(float value)
	/*-{
		this.length = value;
	}-*/;

	/**
	 * @return The type of data encoding to use with `value`.
	 */
	public native String getType()
	/*-{
		return this.type;
	}-*/;

	public native void setType(String value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * @return The byte order of this buffer.
	 */
	public native float getByteOrder()
	/*-{
		return this.byteOrder;
	}-*/;

	public native void setByteOrder(float value)
	/*-{
		this.byteOrder = value;
	}-*/;

}
