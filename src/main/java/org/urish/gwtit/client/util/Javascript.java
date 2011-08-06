package org.urish.gwtit.client.util;

public class Javascript {
	/**
	 * Throws a javascript string exception
	 */
	public static native void throwString(String error)
	/*-{
		throw error;
	}-*/;

	/**
	 * Encodes a string, replacing certain characters with a hexadecimal escape
	 * sequence. See https://developer.mozilla.org/En/Window.escape
	 * 
	 * @param unescaped
	 *            The string to escape
	 * @return The escaped string
	 */
	public static native String escape(String unescaped)
	/*-{
		return escape(unescaped);
	}-*/;

	/**
	 * Decodes a value that has been encoded in hexadecimal using escape(). See
	 * https://developer.mozilla.org/en/DOM/window.unescape
	 * 
	 * @param escaped
	 *            The string to unescape
	 * @return The unescaped string
	 */
	public static native String unescape(String escaped)
	/*-{
		return unescape(escaped);
	}-*/;
}
