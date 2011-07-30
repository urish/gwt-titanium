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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A module for converting numbers and strings to and from a
 * {@link org.urish.gwtit.titanium.buffer}.
 * 
 * @since 1.7
 */
public class Codec extends org.urish.gwtit.titanium.Module {
	protected Codec() {
	}

	private static native final String value_CHARSET_ASCII()
	/*-{
		return Titanium.Codec.CHARSET_ASCII;
	}-*/;

	public static final String CHARSET_ASCII = value_CHARSET_ASCII();

	private static native final String value_CHARSET_ISO_LATIN_1()
	/*-{
		return Titanium.Codec.CHARSET_ISO_LATIN_1;
	}-*/;

	public static final String CHARSET_ISO_LATIN_1 = value_CHARSET_ISO_LATIN_1();

	private static native final String value_CHARSET_UTF8()
	/*-{
		return Titanium.Codec.CHARSET_UTF8;
	}-*/;

	public static final String CHARSET_UTF8 = value_CHARSET_UTF8();

	private static native final String value_CHARSET_UTF16()
	/*-{
		return Titanium.Codec.CHARSET_UTF16;
	}-*/;

	public static final String CHARSET_UTF16 = value_CHARSET_UTF16();

	private static native final String value_CHARSET_UTF16BE()
	/*-{
		return Titanium.Codec.CHARSET_UTF16BE;
	}-*/;

	public static final String CHARSET_UTF16BE = value_CHARSET_UTF16BE();

	private static native final String value_CHARSET_UTF16LE()
	/*-{
		return Titanium.Codec.CHARSET_UTF16LE;
	}-*/;

	public static final String CHARSET_UTF16LE = value_CHARSET_UTF16LE();

	private static native final String value_TYPE_BYTE()
	/*-{
		return Titanium.Codec.TYPE_BYTE;
	}-*/;

	public static final String TYPE_BYTE = value_TYPE_BYTE();

	private static native final String value_TYPE_SHORT()
	/*-{
		return Titanium.Codec.TYPE_SHORT;
	}-*/;

	public static final String TYPE_SHORT = value_TYPE_SHORT();

	private static native final String value_TYPE_INT()
	/*-{
		return Titanium.Codec.TYPE_INT;
	}-*/;

	public static final String TYPE_INT = value_TYPE_INT();

	private static native final String value_TYPE_FLOAT()
	/*-{
		return Titanium.Codec.TYPE_FLOAT;
	}-*/;

	public static final String TYPE_FLOAT = value_TYPE_FLOAT();

	private static native final String value_TYPE_LONG()
	/*-{
		return Titanium.Codec.TYPE_LONG;
	}-*/;

	public static final String TYPE_LONG = value_TYPE_LONG();

	private static native final String value_TYPE_DOUBLE()
	/*-{
		return Titanium.Codec.TYPE_DOUBLE;
	}-*/;

	public static final String TYPE_DOUBLE = value_TYPE_DOUBLE();

	private static native final float value_BIG_ENDIAN()
	/*-{
		return Titanium.Codec.BIG_ENDIAN;
	}-*/;

	public static final float BIG_ENDIAN = value_BIG_ENDIAN();

	private static native final float value_LITTLE_ENDIAN()
	/*-{
		return Titanium.Codec.LITTLE_ENDIAN;
	}-*/;

	public static final float LITTLE_ENDIAN = value_LITTLE_ENDIAN();

	/**
	 * Get the os native byte order (either
	 * {@link org.urish.gwtit.titanium.codec.big_endian} or
	 * {@link org.urish.gwtit.titanium.codec.little_endian})
	 * 
	 * @return The OS native byte order
	 */
	public static native float getNativeByteOrder()
	/*-{
		return Titanium.Codec.getNativeByteOrder();
	}-*/;

	/**
	 * Encodes the number `source` into `dest` using the passed in data `type`.
	 * 
	 * @param options
	 *            encodeNumber named options
	 * @return The position after the encoded number in `dest`.
	 */
	public static native float encodeNumber(org.urish.gwtit.titanium.EncodeNumberSpec options)
	/*-{
		return Titanium.Codec.encodeNumber(options);
	}-*/;

	/**
	 * Decodes the `source` buffer (starting at the optional `position`) using
	 * the passed in data `type`. throws an exception if `source` is null, or
	 * `position` is greater than `source.length`
	 * 
	 * @param options
	 *            decodeNumber named options
	 * @return The Number decoded from `source`.
	 */
	public static native float decodeNumber(org.urish.gwtit.titanium.DecodeNumberSpec options)
	/*-{
		return Titanium.Codec.decodeNumber(options);
	}-*/;

	/**
	 * Encodes the string `source` into `dest` using `charset`. throws an
	 * exception if `charset` is not a valid character set, `source` is null, or
	 * either `sourceposition`, `sourcelength`, or
	 * `sourceposition`+`sourcelength` is greater than `source.length`.
	 * 
	 * @param options
	 *            encodeString named options
	 * @return The position after the encoded String inside `dest`.
	 */
	public static native float encodeString(org.urish.gwtit.titanium.EncodeStringSpec options)
	/*-{
		return Titanium.Codec.encodeString(options);
	}-*/;

	/**
	 * Decodes the `source` buffer into a string starting at `position`, with
	 * `length` bytes, using the supplied character set `charset`. throws an
	 * exception if `charset` is not a valid character set, `source` is null, or
	 * either `position`, `length`, or `position`+`length` is greater than
	 * `source.length`.
	 * 
	 * @param options
	 *            decodeString named options
	 * @return The decoded string
	 */
	public static native String decodeString(org.urish.gwtit.titanium.DecodeStringSpec options)
	/*-{
		return Titanium.Codec.decodeString(options);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Codec.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.Codec.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Codec.fireEvent(name, event);
	}-*/;

}
