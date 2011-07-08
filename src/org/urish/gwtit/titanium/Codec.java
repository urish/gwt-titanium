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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * A module for converting numbers and strings to and from a
 * {@link org.urish.gwtit.titanium.buffer}.
 * 
 * @since 1.7
 */
public class Codec extends org.urish.gwtit.titanium.Module {
	protected Codec() {
	}

	public static final Const CHARSET_ASCII = new ConstImpl("Titanium.Codec.CHARSET_ASCII");

	public static final Const CHARSET_ISO_LATIN_1 = new ConstImpl("Titanium.Codec.CHARSET_ISO_LATIN_1");

	public static final Const CHARSET_UTF8 = new ConstImpl("Titanium.Codec.CHARSET_UTF8");

	public static final Const CHARSET_UTF16 = new ConstImpl("Titanium.Codec.CHARSET_UTF16");

	public static final Const CHARSET_UTF16BE = new ConstImpl("Titanium.Codec.CHARSET_UTF16BE");

	public static final Const CHARSET_UTF16LE = new ConstImpl("Titanium.Codec.CHARSET_UTF16LE");

	public static final Const TYPE_BYTE = new ConstImpl("Titanium.Codec.TYPE_BYTE");

	public static final Const TYPE_SHORT = new ConstImpl("Titanium.Codec.TYPE_SHORT");

	public static final Const TYPE_INT = new ConstImpl("Titanium.Codec.TYPE_INT");

	public static final Const TYPE_FLOAT = new ConstImpl("Titanium.Codec.TYPE_FLOAT");

	public static final Const TYPE_LONG = new ConstImpl("Titanium.Codec.TYPE_LONG");

	public static final Const TYPE_DOUBLE = new ConstImpl("Titanium.Codec.TYPE_DOUBLE");

	public static final Const BIG_ENDIAN = new ConstImpl("Titanium.Codec.BIG_ENDIAN");

	public static final Const LITTLE_ENDIAN = new ConstImpl("Titanium.Codec.LITTLE_ENDIAN");

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
	public static native float encodeNumber(Object options)
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
	public static native String decodeString(Object options)
	/*-{
		return Titanium.Codec.decodeString(options);
	}-*/;

}
