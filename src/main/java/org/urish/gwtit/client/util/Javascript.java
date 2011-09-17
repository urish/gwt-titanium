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
package org.urish.gwtit.client.util;

import com.google.gwt.core.client.JavaScriptObject;

public class Javascript {
	/**
	 * Throws a javascript string exception
	 */
	public static native void throwString(String error)
	/*-{
		throw error;
	}-*/;

	/**
	 * Displas a popup message with the given text
	 * 
	 * @param message
	 *            The message to display
	 */
	public static native void alert(String message)
	/*-{
		alert(message);
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

	/**
	 * Defines a one-shot timer.
	 * 
	 * @param milliseconds
	 *            Time until the timeout callback fires
	 * @param callback
	 *            Callback to fire
	 * @return The new timer object
	 */
	public static Timer setTimeout(int milliseconds, TimerCallback callback) {
		return Timers.setTimeout(milliseconds, callback);
	}

	/**
	 * Defines a repeating timer with a specified interval.
	 * 
	 * @param milliseconds
	 *            Interval between timer shots.
	 * @param callback
	 *            Callback to fire on each timer shot.
	 * @return The new interval object
	 */
	public static Timer setInterval(int milliseconds, TimerCallback callback) {
		return Timers.setInterval(milliseconds, callback);
	}
	
	/**
	 * Returns a JSON string representation of the given JavaScriptObject.
	 * @param what Object to convert to JSON
	 * @return The JSON representation of the given object
	 */
	public static native String stringify(JavaScriptObject what) 
	/*-{
		return JSON.stringify(what);
	}-*/;
}
