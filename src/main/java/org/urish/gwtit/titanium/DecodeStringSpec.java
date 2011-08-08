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
 * Specification for {@link org.urish.gwtit.titanium.codec.decodestring}
 */
public class DecodeStringSpec extends JavaScriptObject {
	protected DecodeStringSpec() {
	}

	/**
	 * @return The buffer to decode.
	 */
	public final native org.urish.gwtit.titanium.Buffer getSource()
	/*-{
		return this.source;
	}-*/;

	public final native void setSource(org.urish.gwtit.titanium.Buffer value)
	/*-{
		this.source = value;
	}-*/;

	/**
	 * @return The position to start decoding.
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
	 * @return The number of bytes to decode.
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
	 * @return The character set to use when encoding this string to bytes.
	 */
	public final native String getCharset()
	/*-{
		return this.charset;
	}-*/;

	public final native void setCharset(String value)
	/*-{
		this.charset = value;
	}-*/;

}
