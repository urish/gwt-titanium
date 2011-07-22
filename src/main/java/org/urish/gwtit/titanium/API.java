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
 * The top level api module. the api module is mainly used for logging.
 * 
 * @since 0.1
 */
public class API extends org.urish.gwtit.titanium.Module {
	protected API() {
	}

	/**
	 * Function for logging debug messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void debug(String message)
	/*-{
		return Titanium.API.debug(message);
	}-*/;

	/**
	 * Function for logging error messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void error(String message)
	/*-{
		return Titanium.API.error(message);
	}-*/;

	/**
	 * Function for logging informational messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void info(String message)
	/*-{
		return Titanium.API.info(message);
	}-*/;

	/**
	 * Function for logging custom severity messages
	 * 
	 * @param level
	 *            the log level
	 * @param message
	 *            the message to log
	 */
	public static native void log(String level, String message)
	/*-{
		return Titanium.API.log(level, message);
	}-*/;

	/**
	 * Function for logging warning messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void warn(String message)
	/*-{
		return Titanium.API.warn(message);
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
		return Titanium.API.addEventListener(name, callback);
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
		return Titanium.API.removeEventListener(name, callbac);
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
		return Titanium.API.fireEvent(name, event);
	}-*/;

}
