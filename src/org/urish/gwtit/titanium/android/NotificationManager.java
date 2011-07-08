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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * Module to notify users of events that happen. it is a thin wrapper on
 * [notificationmanager
 * ](http://developer.android.com/reference/android/app/notificationmanager
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

	public static final Const DEFAULT_ALL = new ConstImpl("Titanium.Android.NotificationManager.DEFAULT_ALL");

	public static final Const DEFAULT_LIGHTS = new ConstImpl("Titanium.Android.NotificationManager.DEFAULT_LIGHTS");

	public static final Const DEFAULT_SOUND = new ConstImpl("Titanium.Android.NotificationManager.DEFAULT_SOUND");

	public static final Const DEFAULT_VIBRATE = new ConstImpl("Titanium.Android.NotificationManager.DEFAULT_VIBRATE");

	public static final Const FLAG_AUTO_CANCEL = new ConstImpl("Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL");

	public static final Const FLAG_INSISTENT = new ConstImpl("Titanium.Android.NotificationManager.FLAG_INSISTENT");

	public static final Const FLAG_NO_CLEAR = new ConstImpl("Titanium.Android.NotificationManager.FLAG_NO_CLEAR");

	public static final Const FLAG_ONGOING_EVENT = new ConstImpl(
			"Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT");

	public static final Const FLAG_ONLY_ALERT_ONCE = new ConstImpl(
			"Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE");

	public static final Const FLAG_SHOW_LIGHTS = new ConstImpl("Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS");

	public static final Const STREAM_DEFAULT = new ConstImpl("Titanium.Android.NotificationManager.STREAM_DEFAULT");

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

}
