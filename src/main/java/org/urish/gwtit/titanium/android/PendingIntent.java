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
 * The Titanium binding of an [Android Pending
 * Intent](http://developer.android.com
 * /reference/android/app/PendingIntent.html)
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
	 * @return Flags used for creating the Pending Intent. Possible values are
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_CANCEL_CURRENT},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_NO_CREATE},
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_ONE_SHOT}, and
	 *         {@link org.urish.gwtit.titanium.Android.FLAG_UPDATE_CURRENT}.
	 */
	public final native float getFlags()
	/*-{
		return this.flags;
	}-*/;

	public final native void setFlags(float value)
	/*-{
		this.flags = value;
	}-*/;

	/**
	 * @return The intent data to pass to the Activity launched by this
	 *         PendingIntent
	 */
	public final native org.urish.gwtit.titanium.android.Intent getIntent()
	/*-{
		return this.intent;
	}-*/;

	public final native void setIntent(org.urish.gwtit.titanium.android.Intent value)
	/*-{
		this.intent = value;
	}-*/;

}
