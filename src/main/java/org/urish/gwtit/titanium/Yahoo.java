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
 * The top level yahoo module. the yahoo module is used for accessing yahoo
 * related api services.
 * 
 * @since 0.8
 */
public class Yahoo extends org.urish.gwtit.titanium.Module {
	protected Yahoo() {
	}

	/**
	 * Invoke a yahoo yql query
	 * 
	 * @param yql
	 *            the YQL query to execute
	 * @param callback
	 *            the function to execute when the query completes. The event
	 *            will contain the boolean property `success` if successful. If
	 *            `success` is false, the `message` property will contain the
	 *            error message. If `success` is true, the `data` property will
	 *            contain the data payload received from the YQL.
	 */
	public static native void yql(String yql, Object callback)
	/*-{
		return Titanium.Yahoo.yql(yql, callback);
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
		return Titanium.Yahoo.addEventListener(name, callback);
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
		return Titanium.Yahoo.removeEventListener(name, callbac);
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
		return Titanium.Yahoo.fireEvent(name, event);
	}-*/;

}
