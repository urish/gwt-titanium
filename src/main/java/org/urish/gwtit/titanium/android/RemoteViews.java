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
 * The Titanium binding of [Android
 * RemoteViews](http://developer.android.com/reference
 * /android/widget/RemoteViews.html). RemoteViews are an API for referencing and
 * updating views that live in another process (i.e. in a
 * {@link org.urish.gwtit.titanium.android.Notification})
 * 
 * @platforms android
 * @since 1.6
 */
public class RemoteViews extends org.urish.gwtit.titanium.Proxy {
	protected RemoteViews() {
	}

	/**
	 * Call a method taking one boolean on a view in the layout for this
	 * RemoteViews. See Android's documentation for
	 * [setBoolean](http://developer
	 * .android.com/reference/android/widget/RemoteViews.html#setBoolean(int,
	 * java.lang.String, boolean))
	 * 
	 * @param viewId
	 *            The resource id of the View (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param methodName
	 *            The name of the method to call
	 * @param value
	 *            The boolean to pass to the method
	 */
	public final native void setBoolean(float viewId, String methodName, boolean value)
	/*-{
		return this.setBoolean(viewId, methodName, value);
	}-*/;

	/**
	 * Sets a chronometer's base, format, and started flag. See Android's
	 * documentation for
	 * [setChronometer](http://developer.android.com/reference/
	 * android/widget/RemoteViews.html#setChronometer(int, long,
	 * java.lang.String, boolean))
	 * 
	 * @param viewId
	 *            The resource id of the Chronometer whose values will change
	 *            (also see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param base
	 *            The time at which the timer would have read 0:00
	 * @param format
	 *            The Chronometer format string, or null to simply display the
	 *            timer value
	 * @param started
	 *            True if you want the clock to be started, false if not
	 */
	public final native void setChronometer(float viewId, java.util.Date base, String format, boolean started)
	/*-{
		return this.setChronometer(viewId, base, format, started);
	}-*/;

	/**
	 * Call a method taking one double on a view in the layout for this
	 * RemoteViews. See Android's documentation for
	 * [setDouble](http://developer.
	 * android.com/reference/android/widget/RemoteViews.html#setDouble(int,
	 * java.lang.String, double))
	 * 
	 * @param viewId
	 *            The resource id of the View (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param methodName
	 *            The name of the method to call
	 * @param value
	 *            The double to pass to the method
	 */
	public final native void setDouble(float viewId, String methodName, float value)
	/*-{
		return this.setDouble(viewId, methodName, value);
	}-*/;

	/**
	 * Sets an ImageView's source given a Resource ID. See Android's
	 * documentation for
	 * [setImageViewResource](http://developer.android.com/reference
	 * /android/widget/RemoteViews.html#setImageViewResource(int, int))
	 * 
	 * @param viewId
	 *            The resource id of the ImageView whose image should change
	 *            (also see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param srcId
	 *            The resource id of the image
	 */
	public final native void setImageViewResource(float viewId, float srcId)
	/*-{
		return this.setImageViewResource(viewId, srcId);
	}-*/;

	/**
	 * Sets an ImageView's source given a URI (supports both Android and
	 * Titanium URLs). See Android's documentation for
	 * [setImageViewUri](http://developer
	 * .android.com/reference/android/widget/RemoteViews
	 * .html#setImageViewUri(int, android.net.Uri))
	 * 
	 * @param viewId
	 *            The resource id of the ImageView whose image should change
	 *            (also see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param uri
	 *            The URI of the image (both Android and Titanium URLs are
	 *            supported)
	 */
	public final native void setImageViewUri(float viewId, String uri)
	/*-{
		return this.setImageViewUri(viewId, uri);
	}-*/;

	/**
	 * Call a method taking one int on a view in the layout for this
	 * RemoteViews. See Android's documentation for
	 * [setInt](http://developer.android
	 * .com/reference/android/widget/RemoteViews.html#setInt(int,
	 * java.lang.String, int))
	 * 
	 * @param viewId
	 *            The resource id of the View (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param methodName
	 *            The name of the method to call
	 * @param value
	 *            The int to pass to the method
	 */
	public final native void setInt(float viewId, String methodName, float value)
	/*-{
		return this.setInt(viewId, methodName, value);
	}-*/;

	/**
	 * Launches a {@link org.urish.gwtit.titanium.android.PendingIntent} when
	 * the specified view is clicked. See Android's documentation for
	 * [setOnClickPendingIntent
	 * ](http://developer.android.com/reference/android/widget
	 * /RemoteViews.html#setOnClickPendingIntent(int,
	 * android.app.PendingIntent))
	 * 
	 * @param viewId
	 *            The resource id of the View to add a click listener to (also
	 *            see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param pendingIntent
	 *            The PendingIntent to execute when this view is clicked
	 */
	public final native void setOnClickPendingIntent(float viewId,
			org.urish.gwtit.titanium.android.PendingIntent pendingIntent)
	/*-{
		return this.setOnClickPendingIntent(viewId, pendingIntent);
	}-*/;

	/**
	 * Sets the progress, max value, and indeterminate flag of a ProgressBar.
	 * See Android's documentation for
	 * [setProgressBar](http://developer.android.
	 * com/reference/android/widget/RemoteViews.html#setProgressBar(int, int,
	 * int, boolean))
	 * 
	 * @param viewId
	 *            The resource id of the ProgressBar to change (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param max
	 *            The new max value of the ProgressBar
	 * @param progress
	 *            The new progress value of the ProgressBar (from 0..max)
	 * @param indeterminate
	 *            Whether or not the progress in indeterminate
	 */
	public final native void setProgressBar(float viewId, float max, float progress, boolean indeterminate)
	/*-{
		return this.setProgressBar(viewId, max, progress, indeterminate);
	}-*/;

	/**
	 * Call a method taking one String on a view in the layout for this
	 * RemoteViews. See Android's documentation for
	 * [setString](http://developer.
	 * android.com/reference/android/widget/RemoteViews.html#setString(int,
	 * java.lang.String, java.lang.String))
	 * 
	 * @param viewId
	 *            The resource id of the View (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param methodName
	 *            The name of the method to call
	 * @param value
	 *            The String to pass to the method
	 */
	public final native void setString(float viewId, String methodName, String value)
	/*-{
		return this.setString(viewId, methodName, value);
	}-*/;

	/**
	 * Sets the text color of a view. See Android's documentation for
	 * [setTextColor
	 * ](http://developer.android.com/reference/android/widget/RemoteViews
	 * .html#setTextColor(int, int))
	 * 
	 * @param viewId
	 *            The resource id of the View whose text color will change (also
	 *            see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param color
	 *            A color as an integer
	 */
	public final native void setTextColor(float viewId, float color)
	/*-{
		return this.setTextColor(viewId, color);
	}-*/;

	/**
	 * Sets the text of a TextView. See Android's documentation for
	 * [setTextViewText
	 * ](http://developer.android.com/reference/android/widget/RemoteViews
	 * .html#setTextViewText(int, java.lang.CharSequence))
	 * 
	 * @param viewId
	 *            The resource id of the TextView whose text will change (also
	 *            see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param text
	 *            The new text of the TextView
	 */
	public final native void setTextViewText(float viewId, String text)
	/*-{
		return this.setTextViewText(viewId, text);
	}-*/;

	/**
	 * Call a method taking one Uri on a view in the layout for this
	 * RemoteViews. See Android's documentation for
	 * [setUri](http://developer.android
	 * .com/reference/android/widget/RemoteViews.html#setUri(int,
	 * java.lang.String, android.net.Uri))
	 * 
	 * @param viewId
	 *            The resource id of the View (also see
	 *            {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param methodName
	 *            The name of the method to call
	 * @param value
	 *            The URI (as a string) to pass to the method
	 */
	public final native void setUri(float viewId, String methodName, String value)
	/*-{
		return this.setUri(viewId, methodName, value);
	}-*/;

	/**
	 * Sets the visibility of a View. See Android's documentation for
	 * [setViewVisibility
	 * ](http://developer.android.com/reference/android/widget/
	 * RemoteViews.html#setViewVisibility(int, int))
	 * 
	 * @param viewId
	 *            The resource id of the View whose visibility will change (also
	 *            see {@link org.urish.gwtit.titanium.app.Android.R})
	 * @param visibility
	 *            The visibility, one of
	 *            {@link org.urish.gwtit.titanium.Android.VISIBLE},
	 *            {@link org.urish.gwtit.titanium.Android.INVISIBLE}, or
	 *            {@link org.urish.gwtit.titanium.Android.GONE}
	 */
	public final native void setViewVisibility(float viewId, float visibility)
	/*-{
		return this.setViewVisibility(viewId, visibility);
	}-*/;

}
