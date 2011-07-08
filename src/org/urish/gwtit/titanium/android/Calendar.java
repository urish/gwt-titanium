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
 * The android.calendar module provides proxies and methods for accessing the
 * native android calendar functionality.
 * <p>
 * Notes: The API supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported.
 * 
 * @platforms android
 * @since 1.5
 */
public class Calendar extends org.urish.gwtit.titanium.Module {
	protected Calendar() {
	}

	public static final Const METHOD_ALERT = new ConstImpl("Titanium.Android.Calendar.METHOD_ALERT");

	public static final Const METHOD_DEFAULT = new ConstImpl("Titanium.Android.Calendar.METHOD_DEFAULT");

	public static final Const METHOD_EMAIL = new ConstImpl("Titanium.Android.Calendar.METHOD_EMAIL");

	public static final Const METHOD_SMS = new ConstImpl("Titanium.Android.Calendar.METHOD_SMS");

	public static final Const STATE_DISMISSED = new ConstImpl("Titanium.Android.Calendar.STATE_DISMISSED");

	public static final Const STATE_FIRED = new ConstImpl("Titanium.Android.Calendar.STATE_FIRED");

	public static final Const STATE_SCHEDULED = new ConstImpl("Titanium.Android.Calendar.STATE_SCHEDULED");

	public static final Const STATUS_CANCELED = new ConstImpl("Titanium.Android.Calendar.STATUS_CANCELED");

	public static final Const STATUS_CONFIRMED = new ConstImpl("Titanium.Android.Calendar.STATUS_CONFIRMED");

	public static final Const STATUS_TENTATIVE = new ConstImpl("Titanium.Android.Calendar.STATUS_TENTATIVE");

	public static final Const VISIBILITY_CONFIDENTIAL = new ConstImpl(
			"Titanium.Android.Calendar.VISIBILITY_CONFIDENTIAL");

	public static final Const VISIBILITY_DEFAULT = new ConstImpl("Titanium.Android.Calendar.VISIBILITY_DEFAULT");

	public static final Const VISIBILITY_PRIVATE = new ConstImpl("Titanium.Android.Calendar.VISIBILITY_PRIVATE");

	public static final Const VISIBILITY_PUBLIC = new ConstImpl("Titanium.Android.Calendar.VISIBILITY_PUBLIC");

	/**
	 * @return Array of {@link org.urish.gwtit.titanium.android.calendar.alert}
	 *         objects representing all alerts.
	 */
	public static native org.urish.gwtit.titanium.android.calendar.Alert[] getAllAlerts()
	/*-{
		return Titanium.Android.Calendar.allAlerts;
	}-*/;

	public static native void setAllAlerts(org.urish.gwtit.titanium.android.calendar.Alert[] value)
	/*-{
		Titanium.Android.Calendar.allAlerts = value;
	}-*/;

	/**
	 * @return Array of
	 *         {@link org.urish.gwtit.titanium.android.calendar.calendar}
	 *         objects representing all the calendars known to the native
	 *         calendar app.
	 */
	public static native org.urish.gwtit.titanium.android.calendar.Calendar[] getAllCalendars()
	/*-{
		return Titanium.Android.Calendar.allCalendars;
	}-*/;

	public static native void setAllCalendars(org.urish.gwtit.titanium.android.calendar.Calendar[] value)
	/*-{
		Titanium.Android.Calendar.allCalendars = value;
	}-*/;

	/**
	 * @return Array of
	 *         {@link org.urish.gwtit.titanium.android.calendar.calendar}
	 *         objects representing calendars selected within the native
	 *         calendar app. this may be a subset of allcalendars; for example,
	 *         the native calendar application may know -- via your gooogle
	 *         account -- about calendars that you have access to but have not
	 *         selected to be displayed in the native calendar app.
	 */
	public static native org.urish.gwtit.titanium.android.calendar.Calendar[] getSelectableCalendars()
	/*-{
		return Titanium.Android.Calendar.selectableCalendars;
	}-*/;

	public static native void setSelectableCalendars(org.urish.gwtit.titanium.android.calendar.Calendar[] value)
	/*-{
		Titanium.Android.Calendar.selectableCalendars = value;
	}-*/;

	public static native org.urish.gwtit.titanium.android.calendar.Alert createAlert()
	/*-{
		return Titanium.Android.Calendar.createAlert();
	}-*/;

	public static native org.urish.gwtit.titanium.android.calendar.Calendar createCalendar()
	/*-{
		return Titanium.Android.Calendar.createCalendar();
	}-*/;

	public static native org.urish.gwtit.titanium.android.calendar.Event createEvent()
	/*-{
		return Titanium.Android.Calendar.createEvent();
	}-*/;

	public static native org.urish.gwtit.titanium.android.calendar.Reminder createReminder()
	/*-{
		return Titanium.Android.Calendar.createReminder();
	}-*/;

	/**
	 * Returns the {@link org.urish.gwtit.titanium.android.calendar.calendar}
	 * object specified by the given integer id.
	 * 
	 * @param id
	 *            The system id of the calendar to be retrieved.
	 */
	public static native org.urish.gwtit.titanium.android.calendar.Calendar getCalendarById(float id)
	/*-{
		return Titanium.Android.Calendar.getCalendarById(id);
	}-*/;

}
