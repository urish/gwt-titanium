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


/**
 * The titanium binding of an [android
 * notification](http://developer.android.com
 * /reference/android/app/notification.html).
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
	 * @return The {@link org.urish.gwtit.titanium.android.pendingintent} to
	 *         execute when the expanded status entry is clicked.
	 */
	public final native Object getContentIntent()
	/*-{
		return this.contentIntent;
	}-*/;

	public final native void setContentIntent(Object value)
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
	 * @return The {@link org.urish.gwtit.titanium.android.pendingintent} to
	 *         execute when the status entry is deleted by the user with the
	 *         "clear all notifications" button.
	 */
	public final native Object getDeleteIntent()
	/*-{
		return this.deleteIntent;
	}-*/;

	public final native void setDeleteIntent(Object value)
	/*-{
		this.deleteIntent = value;
	}-*/;

	/**
	 * @return Set of flags for the notification, defaults to
	 *         {@link org.urish.gwtit.titanium.android.flag_auto_cancel}.
	 *         possible values:
	 *         {@link org.urish.gwtit.titanium.android.flag_auto_cancel},
	 *         {@link org.urish.gwtit.titanium.android.flag_insistent},
	 *         {@link org.urish.gwtit.titanium.android.flag_no_clear},
	 *         {@link org.urish.gwtit.titanium.android.flag_ongoing_event},
	 *         {@link org.urish.gwtit.titanium.android.flag_only_alert_once},
	 *         {@link org.urish.gwtit.titanium.android.flag_show_lights}
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
	 * @return A resource id or url to an icon (the url must be an image located
	 *         in resources/android/images/ or an android content uri)
	 */
	public final native Object getIcon()
	/*-{
		return this.icon;
	}-*/;

	/**
	 * @return The color for the led to blink
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
	 * @return The number of milliseconds for the led to be off while it's
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
	 * @return The number of milliseconds for the led to be on while it's
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
	 * @return A url to the sound to play (supports android + titanium urls)
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
	public final native Object getWhen()
	/*-{
		return this.when;
	}-*/;

	/**
	 * Sets the latest event info using the builtin notification view for this
	 * notification. see android's documentation for
	 * [setlatesteventinfo](http://
	 * developer.android.com/reference/android/app/notification
	 * .html#setlatesteventinfo(android.content.context, java.lang.charsequence,
	 * java.lang.charsequence, android.app.pendingintent))
	 */
	public final native void setLatestEventInfo()
	/*-{
		return this.setLatestEventInfo();
	}-*/;

}
