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

	private static native final float value_METHOD_ALERT()
	/*-{
		return Titanium.Android.Calendar.METHOD_ALERT;
	}-*/;

	public static final float METHOD_ALERT = value_METHOD_ALERT();

	private static native final float value_METHOD_DEFAULT()
	/*-{
		return Titanium.Android.Calendar.METHOD_DEFAULT;
	}-*/;

	public static final float METHOD_DEFAULT = value_METHOD_DEFAULT();

	private static native final float value_METHOD_EMAIL()
	/*-{
		return Titanium.Android.Calendar.METHOD_EMAIL;
	}-*/;

	public static final float METHOD_EMAIL = value_METHOD_EMAIL();

	private static native final float value_METHOD_SMS()
	/*-{
		return Titanium.Android.Calendar.METHOD_SMS;
	}-*/;

	public static final float METHOD_SMS = value_METHOD_SMS();

	private static native final float value_STATE_DISMISSED()
	/*-{
		return Titanium.Android.Calendar.STATE_DISMISSED;
	}-*/;

	public static final float STATE_DISMISSED = value_STATE_DISMISSED();

	private static native final float value_STATE_FIRED()
	/*-{
		return Titanium.Android.Calendar.STATE_FIRED;
	}-*/;

	public static final float STATE_FIRED = value_STATE_FIRED();

	private static native final float value_STATE_SCHEDULED()
	/*-{
		return Titanium.Android.Calendar.STATE_SCHEDULED;
	}-*/;

	public static final float STATE_SCHEDULED = value_STATE_SCHEDULED();

	private static native final float value_STATUS_CANCELED()
	/*-{
		return Titanium.Android.Calendar.STATUS_CANCELED;
	}-*/;

	public static final float STATUS_CANCELED = value_STATUS_CANCELED();

	private static native final float value_STATUS_CONFIRMED()
	/*-{
		return Titanium.Android.Calendar.STATUS_CONFIRMED;
	}-*/;

	public static final float STATUS_CONFIRMED = value_STATUS_CONFIRMED();

	private static native final float value_STATUS_TENTATIVE()
	/*-{
		return Titanium.Android.Calendar.STATUS_TENTATIVE;
	}-*/;

	public static final float STATUS_TENTATIVE = value_STATUS_TENTATIVE();

	private static native final float value_VISIBILITY_CONFIDENTIAL()
	/*-{
		return Titanium.Android.Calendar.VISIBILITY_CONFIDENTIAL;
	}-*/;

	public static final float VISIBILITY_CONFIDENTIAL = value_VISIBILITY_CONFIDENTIAL();

	private static native final float value_VISIBILITY_DEFAULT()
	/*-{
		return Titanium.Android.Calendar.VISIBILITY_DEFAULT;
	}-*/;

	public static final float VISIBILITY_DEFAULT = value_VISIBILITY_DEFAULT();

	private static native final float value_VISIBILITY_PRIVATE()
	/*-{
		return Titanium.Android.Calendar.VISIBILITY_PRIVATE;
	}-*/;

	public static final float VISIBILITY_PRIVATE = value_VISIBILITY_PRIVATE();

	private static native final float value_VISIBILITY_PUBLIC()
	/*-{
		return Titanium.Android.Calendar.VISIBILITY_PUBLIC;
	}-*/;

	public static final float VISIBILITY_PUBLIC = value_VISIBILITY_PUBLIC();

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

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.Android.Calendar.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.Android.Calendar.removeEventListener(name, callbac);
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Android.Calendar.fireEvent(name, event);
	}-*/;

}
