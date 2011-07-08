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

package org.urish.gwtit.titanium.android.calendar;


/**
 * An object which represents a single reminder for an event in an android
 * calendar. reminders should not be created directly, but rather by using the
 * createreminder method of
 * {@link org.urish.gwtit.titanium.android.calendar.event}.
 * <p>
 * Notes: Reminder API See <Titanium.Android.Calendar> for examples of
 * retrieving reminder information and creating reminders for events.
 * 
 * @platforms android
 * @since 1.5
 */
public class Reminder extends org.urish.gwtit.titanium.Proxy {
	protected Reminder() {
	}

	/**
	 * @return The id of the reminder.
	 */
	public native String getId()
	/*-{
		return this.id;
	}-*/;

	public native void setId(String value)
	/*-{
		this.id = value;
	}-*/;

	/**
	 * @return The reminder method. possible values are the method constants in
	 *         {@link org.urish.gwtit.titanium.android.calendar}.
	 */
	public native float getMethod()
	/*-{
		return this.method;
	}-*/;

	public native void setMethod(float value)
	/*-{
		this.method = value;
	}-*/;

	/**
	 * @return The minutes before the event when the reminder should occur.
	 */
	public native float getMinutes()
	/*-{
		return this.minutes;
	}-*/;

	public native void setMinutes(float value)
	/*-{
		this.minutes = value;
	}-*/;

}