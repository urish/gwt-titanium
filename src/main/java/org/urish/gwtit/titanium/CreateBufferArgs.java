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
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * Arguments to be passed to createbuffer
 * 
 * @since 1.7
 */
public class CreateBufferArgs extends JavaScriptObject {
	protected CreateBufferArgs() {
	}

	/**
	 * Creates a new, empty instance of CreateBufferArgs
	 */
	public static final native CreateBufferArgs createCreateBufferArgs()
	/*-{
		return {};
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public final native void setValue(float value)
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
	public final native Object getValue()
	/*-{
		return this.value;
	}-*/;

	/**
	 * @return The length of the buffer.
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
	 * @return The type of data encoding to use with `value`.
	 */
	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	public final native void setType(String value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * @return The byte order of this buffer.
	 */
	public final native float getByteOrder()
	/*-{
		return this.byteOrder;
	}-*/;

	public final native void setByteOrder(float value)
	/*-{
		this.byteOrder = value;
	}-*/;

}
