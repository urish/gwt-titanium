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


/**
 * The top level utils module. the utils module is a set of common javascript
 * functions that are useful for applications.
 * 
 * @since 0.9
 */
public class Utils extends org.urish.gwtit.titanium.Module {
	protected Utils() {
	}

	/**
	 * Decode a base64 string
	 * 
	 * @param str
	 *            the string to use for the input
	 */
	public static native String base64decode(String str)
	/*-{
		return Titanium.Utils.base64decode(str);
	}-*/;

	/**
	 * Encode a string into base64
	 * 
	 * @param str
	 *            the string to use for the input
	 */
	public static native String base64encode(String str)
	/*-{
		return Titanium.Utils.base64encode(str);
	}-*/;

	/**
	 * Compute a md5 hash algorithm against the input and return a hex-based
	 * string
	 * 
	 * @param str
	 *            the string to use for the input
	 */
	public static native String md5HexDigest(String str)
	/*-{
		return Titanium.Utils.md5HexDigest(str);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.Utils.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.Utils.removeEventListener(name, callbac);
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
		return Titanium.Utils.fireEvent(name, event);
	}-*/;

}
