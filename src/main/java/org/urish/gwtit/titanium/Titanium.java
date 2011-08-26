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
 * The top level titanium module.
 * <p>
 * Notes: Titanium provides a number of built-in objects in the Javascript that
 * are not part of the Titanium namespace. Specifically, the following are
 * available.
 * 
 * #### JSON
 * 
 * Titanium has a built-in JSON parser with two main functions: `parse` and
 * `stringify`. `JSON.parse` will safely evaluate a string encoded as Javascript
 * into a Javascript object. `JSON.stringify` will encode a Javascript object
 * into a string.
 * 
 * #### Timers
 * 
 * Titanium has built-in support for one-shot and repeating timers with two main
 * functions: `setTimeout` and `setInterval`. `setTimeout` takes 2 arguments:
 * function and timeout in milliseconds after which the function should be
 * executed and returns a timer handle that can be used to cancel a pending
 * timer with `clearTimeout`. `setInterval` takes 2 arguments: function and
 * timeout in milliseconds for how often the function should be executed until
 * cancelled and returns a timer handle that can be used to cancel a timer with
 * `clearInterval`.
 * 
 * #### Alert
 * 
 * Titanium has a built-in convenience function `alert` which can be used as a
 * shortcut to <Titanium.UI.createAlertDialog> for creating a message box. Note
 * that unlike a web browser-based version of `alert`, the method is
 * asynchronous. However, only one alert dialog will be visible and modal at a
 * time.
 * 
 * #### Locale
 * 
 * The macro `L` can also be used which aliases the method
 * <Titanium.Locale.getString>.
 * 
 * #### String formatting
 * 
 * The following are built-in functions available on the `String` class which
 * are Titanium specific and will aid in formatting strings into a
 * locale-specific string.
 * 
 * `String.format`: format a generic string using the [IEEE printf
 * specification]
 * (http://www.opengroup.org/onlinepubs/009695399/functions/printf.html).
 * 
 * `String.formatDate`: format a date into a locale specific date format.
 * Optionally pass a second argument (string) as either "short" (default),
 * "medium" or "long" for controlling the date format.
 * 
 * `String.formatTime`: format a date into a locale specific time format.
 * 
 * `String.formatDecimal`: format a number into a locale specific decimal
 * format.
 * 
 * `String.formatCurrency`: format a number into a locale specific currency
 * format.
 * 
 * @platforms android, iphone, ipad
 * @since 0.1
 */
public class Titanium extends org.urish.gwtit.titanium.Module {
	protected Titanium() {
	}

	/**
	 * @return The user-agent string used by titanium
	 */
	public static native String getUserAgent()
	/*-{
		return Titanium.userAgent;
	}-*/;

	public static native void setUserAgent(String value)
	/*-{
		Titanium.userAgent = value;
	}-*/;

	/**
	 * @return The version of titanium that is executing
	 */
	public static native float getVersion()
	/*-{
		return Titanium.version;
	}-*/;

	public static native void setVersion(float value)
	/*-{
		Titanium.version = value;
	}-*/;

	/**
	 * A filename to include as if the javascript code was written in place.
	 * this is similar to a c `#include` function.
	 * 
	 * @param name
	 *            filename to include
	 */
	public static native void include(String name)
	/*-{
		return Titanium.include(name);
	}-*/;

	/**
	 * Creates a new buffer based on the params
	 * 
	 * @param params
	 *            creation arguments
	 * @return The new buffer.
	 */
	public static native org.urish.gwtit.titanium.Buffer createBuffer(org.urish.gwtit.titanium.CreateBufferArgs params)
	/*-{
		return Titanium.createBuffer(params);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.fireEvent(name, event);
	}-*/;

}
