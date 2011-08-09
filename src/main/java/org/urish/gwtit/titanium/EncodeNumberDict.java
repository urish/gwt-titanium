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
 * Options for {@link org.urish.gwtit.titanium.codec.encodenumber}
 */
public class EncodeNumberDict extends JavaScriptObject {
	protected EncodeNumberDict() {
	}

	/**
	 * @return The source number to encode
	 */
	public final native float getSource()
	/*-{
		return this.source;
	}-*/;

	public final native void setSource(float value)
	/*-{
		this.source = value;
	}-*/;

	/**
	 * @return The destination buffer
	 */
	public final native org.urish.gwtit.titanium.Buffer getDest()
	/*-{
		return this.dest;
	}-*/;

	public final native void setDest(org.urish.gwtit.titanium.Buffer value)
	/*-{
		this.dest = value;
	}-*/;

	/**
	 * @return The encoding type to use. must be one of
	 *         {@link org.urish.gwtit.titanium.codec.type_byte},
	 *         {@link org.urish.gwtit.titanium.codec.type_short},
	 *         {@link org.urish.gwtit.titanium.codec.type_int},
	 *         {@link org.urish.gwtit.titanium.codec.type_float},
	 *         {@link org.urish.gwtit.titanium.codec.type_long}, or
	 *         {@link org.urish.gwtit.titanium.codec.type_double}
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
	 * @return The position in dest to set the encoded data
	 */
	public final native float getPosition()
	/*-{
		return this.position;
	}-*/;

	public final native void setPosition(float value)
	/*-{
		this.position = value;
	}-*/;

	/**
	 * @return The byte order to encode with
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
