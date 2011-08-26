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
 * The top level analytics module. the analytics module is used for transmitting
 * developer-defined analytics event for your application to the appcelerator
 * analytics product. it can be used to augment additional context or
 * application-specific information which can then be accessed during analysis
 * using analytics.
 * 
 * @since 0.1
 */
public class Analytics extends org.urish.gwtit.titanium.Module {
	protected Analytics() {
	}

	/**
	 * Send a generic event for the application session
	 * 
	 * @param type
	 *            the event type
	 * @param name
	 *            the event name
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void addEvent(String type, String name, JavaScriptObject data)
	/*-{
		return Titanium.Analytics.addEvent(type, name, data);
	}-*/;

	/**
	 * Send an analytics feature event for the application session
	 * 
	 * @param name
	 *            the event name
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void featureEvent(String name, JavaScriptObject data)
	/*-{
		return Titanium.Analytics.featureEvent(name, data);
	}-*/;

	/**
	 * Send an analytics nav event for the application session
	 * 
	 * @param from
	 *            the `from` location in the nav event
	 * @param to
	 *            the `to` location in the nav event
	 * @param name
	 *            the event name
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void navEvent(String from, String to, String name, JavaScriptObject data)
	/*-{
		return Titanium.Analytics.navEvent(from, to, name, data);
	}-*/;

	/**
	 * Send a analytics settings event for the application session
	 * 
	 * @param name
	 *            the event name
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void settingsEvent(String name, JavaScriptObject data)
	/*-{
		return Titanium.Analytics.settingsEvent(name, data);
	}-*/;

	/**
	 * Send an analytics timed event for the application session
	 * 
	 * @param name
	 *            the event name
	 * @param start
	 *            the event start as a Date object
	 * @param stop
	 *            the event end as a Date object
	 * @param duration
	 *            the event duration
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void timedEvent(String name, java.util.Date start, java.util.Date stop, float duration,
			JavaScriptObject data)
	/*-{
		return Titanium.Analytics.timedEvent(name, start, stop, duration, data);
	}-*/;

	/**
	 * Send an analytics user event for the application session
	 * 
	 * @param name
	 *            the event name
	 * @param data
	 *            event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void userEvent(String name, JavaScriptObject data)
	/*-{
		return Titanium.Analytics.userEvent(name, data);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Analytics.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Analytics.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Analytics.fireEvent(name, event);
	}-*/;

}
