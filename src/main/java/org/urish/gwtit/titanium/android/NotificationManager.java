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

package org.urish.gwtit.titanium.android;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Module to notify users of events that happen. It is a thin wrapper on
 * [NotificationManager
 * ](http://developer.android.com/reference/android/app/NotificationManager
 * .html).
 * <p>
 * Notes: The constants above are taken from
 * [Notification](http://developer.android
 * .com/reference/android/app/Notification.html).
 * 
 * @platforms android
 * @since 1.5
 */
public class NotificationManager extends org.urish.gwtit.titanium.Module {
	protected NotificationManager() {
	}

	private static native final float value_DEFAULT_ALL()
	/*-{
		return Titanium.Android.NotificationManager.DEFAULT_ALL;
	}-*/;

	public static final float DEFAULT_ALL = value_DEFAULT_ALL();

	private static native final float value_DEFAULT_LIGHTS()
	/*-{
		return Titanium.Android.NotificationManager.DEFAULT_LIGHTS;
	}-*/;

	public static final float DEFAULT_LIGHTS = value_DEFAULT_LIGHTS();

	private static native final float value_DEFAULT_SOUND()
	/*-{
		return Titanium.Android.NotificationManager.DEFAULT_SOUND;
	}-*/;

	public static final float DEFAULT_SOUND = value_DEFAULT_SOUND();

	private static native final float value_DEFAULT_VIBRATE()
	/*-{
		return Titanium.Android.NotificationManager.DEFAULT_VIBRATE;
	}-*/;

	public static final float DEFAULT_VIBRATE = value_DEFAULT_VIBRATE();

	private static native final float value_FLAG_AUTO_CANCEL()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL;
	}-*/;

	public static final float FLAG_AUTO_CANCEL = value_FLAG_AUTO_CANCEL();

	private static native final float value_FLAG_INSISTENT()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_INSISTENT;
	}-*/;

	public static final float FLAG_INSISTENT = value_FLAG_INSISTENT();

	private static native final float value_FLAG_NO_CLEAR()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_NO_CLEAR;
	}-*/;

	public static final float FLAG_NO_CLEAR = value_FLAG_NO_CLEAR();

	private static native final float value_FLAG_ONGOING_EVENT()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT;
	}-*/;

	public static final float FLAG_ONGOING_EVENT = value_FLAG_ONGOING_EVENT();

	private static native final float value_FLAG_ONLY_ALERT_ONCE()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE;
	}-*/;

	public static final float FLAG_ONLY_ALERT_ONCE = value_FLAG_ONLY_ALERT_ONCE();

	private static native final float value_FLAG_SHOW_LIGHTS()
	/*-{
		return Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS;
	}-*/;

	public static final float FLAG_SHOW_LIGHTS = value_FLAG_SHOW_LIGHTS();

	private static native final float value_STREAM_DEFAULT()
	/*-{
		return Titanium.Android.NotificationManager.STREAM_DEFAULT;
	}-*/;

	public static final float STREAM_DEFAULT = value_STREAM_DEFAULT();

	/**
	 * Cancel a previously shown notification.
	 * 
	 * @param id
	 *            The id you assigned to a notification.
	 */
	public static native void cancel(float id)
	/*-{
		return Titanium.Android.NotificationManager.cancel(id);
	}-*/;

	/**
	 * Cancel all previously shown notifications.
	 */
	public static native void cancelAll()
	/*-{
		return Titanium.Android.NotificationManager.cancelAll();
	}-*/;

	/**
	 * Add a persistent notification to the status bar.
	 * 
	 * @param id
	 *            An id that may be used to cancel a shown notification.
	 * @param notification
	 *            An instance of
	 *            {@link org.urish.gwtit.titanium.android.Notification} created
	 *            with
	 *            {@link org.urish.gwtit.titanium.android.createNotification}.
	 */
	public static native void notify(float id, org.urish.gwtit.titanium.android.Notification notification)
	/*-{
		return Titanium.Android.NotificationManager.notify(id, notification);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Android.NotificationManager.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Android.NotificationManager.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Android.NotificationManager.fireEvent(name, event);
	}-*/;

}
