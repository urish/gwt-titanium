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
 * The titanium binding of [android
 * remoteviews](http://developer.android.com/reference
 * /android/widget/remoteviews.html). remoteviews are an api for referencing and
 * updating views that live in another process (i.e. in a
 * {@link org.urish.gwtit.titanium.android.notification})
 * 
 * @platforms android
 * @since 1.6
 */
public class RemoteViews extends org.urish.gwtit.titanium.Proxy {
	protected RemoteViews() {
	}

	/**
	 * Call a method taking one boolean on a view in the layout for this
	 * remoteviews. see android's documentation for
	 * [setboolean](http://developer
	 * .android.com/reference/android/widget/remoteviews.html#setboolean(int,
	 * java.lang.string, boolean))
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
	 * Sets a chronometer's base, format, and started flag. see android's
	 * documentation for
	 * [setchronometer](http://developer.android.com/reference/
	 * android/widget/remoteviews.html#setchronometer(int, long,
	 * java.lang.string, boolean))
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
	 * remoteviews. see android's documentation for
	 * [setdouble](http://developer.
	 * android.com/reference/android/widget/remoteviews.html#setdouble(int,
	 * java.lang.string, double))
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
	 * Sets an imageview's source given a resource id. see android's
	 * documentation for
	 * [setimageviewresource](http://developer.android.com/reference
	 * /android/widget/remoteviews.html#setimageviewresource(int, int))
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
	 * Sets an imageview's source given a uri (supports both android and
	 * titanium urls). see android's documentation for
	 * [setimageviewuri](http://developer
	 * .android.com/reference/android/widget/remoteviews
	 * .html#setimageviewuri(int, android.net.uri))
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
	 * remoteviews. see android's documentation for
	 * [setint](http://developer.android
	 * .com/reference/android/widget/remoteviews.html#setint(int,
	 * java.lang.string, int))
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
	 * Launches a {@link org.urish.gwtit.titanium.android.pendingintent} when
	 * the specified view is clicked. see android's documentation for
	 * [setonclickpendingintent
	 * ](http://developer.android.com/reference/android/widget
	 * /remoteviews.html#setonclickpendingintent(int,
	 * android.app.pendingintent))
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
	 * Sets the progress, max value, and indeterminate flag of a progressbar.
	 * see android's documentation for
	 * [setprogressbar](http://developer.android.
	 * com/reference/android/widget/remoteviews.html#setprogressbar(int, int,
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
	 * Call a method taking one string on a view in the layout for this
	 * remoteviews. see android's documentation for
	 * [setstring](http://developer.
	 * android.com/reference/android/widget/remoteviews.html#setstring(int,
	 * java.lang.string, java.lang.string))
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
	 * Sets the text color of a view. see android's documentation for
	 * [settextcolor
	 * ](http://developer.android.com/reference/android/widget/remoteviews
	 * .html#settextcolor(int, int))
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
	 * Sets the text of a textview. see android's documentation for
	 * [settextviewtext
	 * ](http://developer.android.com/reference/android/widget/remoteviews
	 * .html#settextviewtext(int, java.lang.charsequence))
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
	 * Call a method taking one uri on a view in the layout for this
	 * remoteviews. see android's documentation for
	 * [seturi](http://developer.android
	 * .com/reference/android/widget/remoteviews.html#seturi(int,
	 * java.lang.string, android.net.uri))
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
	 * Sets the visibility of a view. see android's documentation for
	 * [setviewvisibility
	 * ](http://developer.android.com/reference/android/widget/
	 * remoteviews.html#setviewvisibility(int, int))
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
