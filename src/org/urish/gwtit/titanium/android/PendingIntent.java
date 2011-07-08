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
 * The titanium binding of an [android pending
 * intent](http://developer.android.com
 * /reference/android/app/pendingintent.html)
 * <p>
 * Notes: The type of Intent you choose will effect what kind of PendingIntent
 * is created. Each type corresponds directly with a get method on Android's
 * PendingIntent:
 * 
 * <Titanium.Android.createIntent> uses
 * [PendingIntent.getActivity](http://developer
 * .android.com/reference/android/app
 * /PendingIntent.html#getActivity(android.content.Context, int,
 * android.content.Intent, int)) <Titanium.Android.createBroadcastIntent> uses
 * [PendingIntent
 * .getBroadcast](http://developer.android.com/reference/android/app
 * /PendingIntent.html#getBroadcast(android.content.Context, int,
 * android.content.Intent, int)) <Titanium.Android.createServiceIntent> uses
 * [PendingIntent
 * .getService](http://developer.android.com/reference/android/app/
 * PendingIntent.html#getService(android.content.Context, int,
 * android.content.Intent, int))
 * 
 * @platforms android
 * @since 1.5
 */
public class PendingIntent extends org.urish.gwtit.titanium.Proxy {
	protected PendingIntent() {
	}

	/**
	 * @return Flags used for creating the pending intent. possible values are
	 *         {@link org.urish.gwtit.titanium.android.flag_cancel_current},
	 *         {@link org.urish.gwtit.titanium.android.flag_no_create},
	 *         {@link org.urish.gwtit.titanium.android.flag_one_shot}, and
	 *         {@link org.urish.gwtit.titanium.android.flag_update_current}.
	 */
	public native float getFlags()
	/*-{
		return this.flags;
	}-*/;

	public native void setFlags(float value)
	/*-{
		this.flags = value;
	}-*/;

	/**
	 * @return The intent data to pass to the activity launched by this
	 *         pendingintent
	 */
	public native org.urish.gwtit.titanium.android.Intent getIntent()
	/*-{
		return this.intent;
	}-*/;

	public native void setIntent(org.urish.gwtit.titanium.android.Intent value)
	/*-{
		this.intent = value;
	}-*/;

}
