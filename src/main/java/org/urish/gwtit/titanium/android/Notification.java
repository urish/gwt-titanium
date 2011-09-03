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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an [Android
 * Notification](http://developer.android.com
 * /reference/android/app/Notification.html).
 * <p>
 * Notes: If you pass contentTitle and/or contentText into
 * <Titanium.Android.createNotification>, then setLatestEventInfo will
 * automatically be called with those properties (there's no need to call it
 * separately unless you want to). You can also use a custom layout.xml wrapped
 * in a <Titanium.Android.RemoteViews> object in the contentView property, which
 * gives more fine grained control and customization to how the notification
 * actually behaves. Also see [Android's developer guide for
 * Notifications](http:
 * //developer.android.com/guide/topics/ui/notifiers/notifications.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Notification extends org.urish.gwtit.titanium.Proxy {
	protected Notification() {
	}

	/**
	 * @return The audio stream type to use when playing the sound.
	 */
	public final native float getAudioStreamType()
	/*-{
		return this.audioStreamType;
	}-*/;

	public final native void setAudioStreamType(float value)
	/*-{
		this.audioStreamType = value;
	}-*/;

	/**
	 * @return The {@link org.urish.gwtit.titanium.android.PendingIntent} to
	 *         execute when the expanded status entry is clicked.
	 */
	public final native JavaScriptObject getContentIntent()
	/*-{
		return this.contentIntent;
	}-*/;

	public final native void setContentIntent(JavaScriptObject value)
	/*-{
		this.contentIntent = value;
	}-*/;

	/**
	 * @return Description text of the notification.
	 */
	public final native String getContentText()
	/*-{
		return this.contentText;
	}-*/;

	public final native void setContentText(String value)
	/*-{
		this.contentText = value;
	}-*/;

	/**
	 * @return Title of the notification.
	 */
	public final native String getContentTitle()
	/*-{
		return this.contentTitle;
	}-*/;

	public final native void setContentTitle(String value)
	/*-{
		this.contentTitle = value;
	}-*/;

	/**
	 * @return Specifies which values should be taken from the defaults.
	 */
	public final native float getDefaults()
	/*-{
		return this.defaults;
	}-*/;

	public final native void setDefaults(float value)
	/*-{
		this.defaults = value;
	}-*/;

	/**
	 * @return The {@link org.urish.gwtit.titanium.android.PendingIntent} to
	 *         execute when the status entry is deleted by the user with the
	 *         "Clear All Notifications" button.
	 */
	public final native JavaScriptObject getDeleteIntent()
	/*-{
		return this.deleteIntent;
	}-*/;

	public final native void setDeleteIntent(JavaScriptObject value)
	/*-{
		this.deleteIntent = value;
	}-*/;

	/**
	 * @return Set of flags for the notification, defaults to
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_AUTO_CANCEL}.
	 *         Possible values:
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_AUTO_CANCEL},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_INSISTENT},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_NO_CLEAR},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_ONGOING_EVENT},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_ONLY_ALERT_ONCE},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_SHOW_LIGHTS}
	 */
	public final native float getFlags()
	/*-{
		return this.flags;
	}-*/;

	public final native void setFlags(float value)
	/*-{
		this.flags = value;
	}-*/;

	public final native void setIcon(float value)
	/*-{
		this.icon = value;
	}-*/;

	public final native void setIcon(String value)
	/*-{
		this.icon = value;
	}-*/;

	/**
	 * @return A resource id or URL to an icon (the URL must be an image located
	 *         in Resources/android/images/ or an Android content URI)
	 */
	public final native JavaScriptObject getIcon()
	/*-{
		return this.icon;
	}-*/;

	/**
	 * @return The color for the LED to blink
	 */
	public final native float getLedARGB()
	/*-{
		return this.ledARGB;
	}-*/;

	public final native void setLedARGB(float value)
	/*-{
		this.ledARGB = value;
	}-*/;

	/**
	 * @return The number of milliseconds for the LED to be off while it's
	 *         flashing.
	 */
	public final native float getLedOffMS()
	/*-{
		return this.ledOffMS;
	}-*/;

	public final native void setLedOffMS(float value)
	/*-{
		this.ledOffMS = value;
	}-*/;

	/**
	 * @return The number of milliseconds for the LED to be on while it's
	 *         flashing.
	 */
	public final native float getLedOnMS()
	/*-{
		return this.ledOnMS;
	}-*/;

	public final native void setLedOnMS(float value)
	/*-{
		this.ledOnMS = value;
	}-*/;

	/**
	 * @return The number of events that this notification represents.
	 */
	public final native float getNumber()
	/*-{
		return this.number;
	}-*/;

	public final native void setNumber(float value)
	/*-{
		this.number = value;
	}-*/;

	/**
	 * @return A URL to the sound to play (supports Android + Titanium URLs)
	 */
	public final native String getSound()
	/*-{
		return this.sound;
	}-*/;

	public final native void setSound(String value)
	/*-{
		this.sound = value;
	}-*/;

	/**
	 * @return Text to scroll across the screen when this item is added to the
	 *         status bar.
	 */
	public final native String getTickerText()
	/*-{
		return this.tickerText;
	}-*/;

	public final native void setTickerText(String value)
	/*-{
		this.tickerText = value;
	}-*/;

	public final native void setWhen(java.util.Date value)
	/*-{
		this.when = value;
	}-*/;

	public final native void setWhen(float value)
	/*-{
		this.when = value;
	}-*/;

	/**
	 * @return The timestamp for the notification (defaults to the current time)
	 */
	public final native JavaScriptObject getWhen()
	/*-{
		return this.when;
	}-*/;

	/**
	 * Sets the latest event info using the builtin Notification View for this
	 * notification. See Android's documentation for
	 * [setLatestEventInfo](http://
	 * developer.android.com/reference/android/app/Notification
	 * .html#setLatestEventInfo(android.content.Context, java.lang.CharSequence,
	 * java.lang.CharSequence, android.app.PendingIntent))
	 */
	public final native void setLatestEventInfo()
	/*-{
		return this.setLatestEventInfo();
	}-*/;

}
