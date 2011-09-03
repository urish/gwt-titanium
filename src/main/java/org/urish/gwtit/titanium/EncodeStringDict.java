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
 * Options for {@link org.urish.gwtit.titanium.codec.encodeString}
 */
public class EncodeStringDict extends JavaScriptObject {
	protected EncodeStringDict() {
	}

	/**
	 * @return The source string to encode
	 */
	public final native String getSource()
	/*-{
		return this.source;
	}-*/;

	public final native void setSource(String value)
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
	 * @default 0
	 * @return The position in `dest` to set the encoded string.
	 */
	public final native float getDestPosition()
	/*-{
		return this.destPosition;
	}-*/;

	public final native void setDestPosition(float value)
	/*-{
		this.destPosition = value;
	}-*/;

	/**
	 * @default 0
	 * @return The position in `source` to start encoding.
	 */
	public final native float getSourcePosition()
	/*-{
		return this.sourcePosition;
	}-*/;

	public final native void setSourcePosition(float value)
	/*-{
		this.sourcePosition = value;
	}-*/;

	/**
	 * @default The length of `source`
	 * @return The number of characters in `source` to encode.
	 */
	public final native float getSourceLength()
	/*-{
		return this.sourceLength;
	}-*/;

	public final native void setSourceLength(float value)
	/*-{
		this.sourceLength = value;
	}-*/;

	/**
	 * @default <Titanium.Codec.CHARSET_UTF8>
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
