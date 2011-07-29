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

package org.urish.gwtit.titanium.app;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level app ios module. the app ios module is only available on ios
 * based devices.
 * 
 * @platforms iphone, ipad
 * @since 1.5
 */
public class iOS extends org.urish.gwtit.titanium.Module {
	protected iOS() {
	}

	public static native org.urish.gwtit.titanium.app.ios.BackgroundService createBackgroundService()
	/*-{
		return Titanium.App.iOS.createBackgroundService();
	}-*/;

	public static native org.urish.gwtit.titanium.app.ios.LocalNotification createLocalNotification()
	/*-{
		return Titanium.App.iOS.createLocalNotification();
	}-*/;

	/**
	 * Cancel all scheduled local notifications
	 */
	public static native void cancelAllLocalNotifications()
	/*-{
		return Titanium.App.iOS.cancelAllLocalNotifications();
	}-*/;

	/**
	 * Cancel a specific local notification
	 */
	public static native void cancelLocalNotification()
	/*-{
		return Titanium.App.iOS.cancelLocalNotification();
	}-*/;

	/**
	 * Register a background service to run when the app is backgrounded
	 * 
	 * @param params
	 *            dictionary of key/values that are used to create the service.
	 *            the `url` property should point to a local JavaScript url that
	 *            will be executed when the app is backgrounded.
	 */
	public static native Object registerBackgroundService(Object params)
	/*-{
		return Titanium.App.iOS.registerBackgroundService(params);
	}-*/;

	/**
	 * Schedule a local notification
	 * 
	 * @param params
	 *            dictionary of key/values that are used to create the
	 *            notification. the `date` property is when the notification
	 *            should fire, `repeat` is an optional property of one of:
	 *            `weekly`, `daily`, `yearly,` `monthly`, `alertBody` is an
	 *            optional property that is the body of the alert when the
	 *            notification is displayed, `alertAction` is an optional
	 *            property that represents the alert button text or the 'slide
	 *            to unlock...' slider in place of unlock, `alertLaunchImage` is
	 *            an optional property that specifies the launch image to
	 *            display instead of Default.png when launching the application,
	 *            `badge` is the optional badge value for the application,
	 *            `sound` is the optional property to specify the sound to play
	 *            when the notification is triggered and `userInfo` is the
	 *            optional property which specifies data passed to the
	 *            application upon launch when the notification is triggered.
	 */
	public static native Object scheduleLocalNotification(Object params)
	/*-{
		return Titanium.App.iOS.scheduleLocalNotification(params);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.App.iOS.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.App.iOS.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.App.iOS.fireEvent(name, event);
	}-*/;

	public final static class NotificationEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "notification";

		protected NotificationEvent() {
		}

	}

	public static native void addNotificationHandler(EventCallback<NotificationEvent> handler)
	/*-{
		return Titanium.App.iOS.addEventListener('notification', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
