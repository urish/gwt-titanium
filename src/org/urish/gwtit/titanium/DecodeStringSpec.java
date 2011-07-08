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
 * Specification for {@link org.urish.gwtit.titanium.codec.decodestring}
 */
public class DecodeStringSpec extends JavaScriptObject {
	protected DecodeStringSpec() {
	}

	/**
	 * @return The buffer to decode.
	 */
	public native org.urish.gwtit.titanium.Buffer getSource()
	/*-{
		return this.source;
	}-*/;

	public native void setSource(org.urish.gwtit.titanium.Buffer value)
	/*-{
		this.source = value;
	}-*/;

	/**
	 * @return The position to start decoding.
	 */
	public native float getPosition()
	/*-{
		return this.position;
	}-*/;

	public native void setPosition(float value)
	/*-{
		this.position = value;
	}-*/;

	/**
	 * @return The number of bytes to decode.
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
	 * @return The character set to use when encoding this string to bytes.
	 */
	public native String getCharset()
	/*-{
		return this.charset;
	}-*/;

	public native void setCharset(String value)
	/*-{
		this.charset = value;
	}-*/;

}
