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
 * An object which represents a single calendar in android.
 * <p>
 * Notes: See <Titanium.Android.Calendar> for examples.
 * 
 * @platforms android
 * @since 1.5
 */
public class Calendar extends org.urish.gwtit.titanium.Proxy {
	protected Calendar() {
	}

	/**
	 * @return Whether the calendar is hidden.
	 */
	public final native boolean getHidden()
	/*-{
		return this.hidden;
	}-*/;

	public final native void setHidden(boolean value)
	/*-{
		this.hidden = value;
	}-*/;

	/**
	 * @return The id of the calendar.
	 */
	public final native String getId()
	/*-{
		return this.id;
	}-*/;

	public final native void setId(String value)
	/*-{
		this.id = value;
	}-*/;

	/**
	 * @return The display name of the calendar.
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native void setName(String value)
	/*-{
		this.name = value;
	}-*/;

	/**
	 * @return Whether the calendar is selected.
	 */
	public final native boolean getSelected()
	/*-{
		return this.selected;
	}-*/;

	public final native void setSelected(boolean value)
	/*-{
		this.selected = value;
	}-*/;

	/**
	 * Add an event to the calendar. returns the created
	 * {@link org.urish.gwtit.titanium.android.calendar.event}.
	 * 
	 * @param properties
	 *            An object defining the properties of the event. These
	 *            correspond to properties of
	 *            {@link org.urish.gwtit.titanium.android.calendar.Event}.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event createEvent(
			org.urish.gwtit.titanium.android.calendar.Event properties)
	/*-{
		return this.createEvent(properties);
	}-*/;

	/**
	 * Returns the {@link org.urish.gwtit.titanium.android.calendar.event}
	 * object for the event with the given integer id.
	 * 
	 * @param id
	 *            The integer id of the event to return.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event getEventById(float id)
	/*-{
		return this.getEventById(id);
	}-*/;

	/**
	 * Returns an array of
	 * {@link org.urish.gwtit.titanium.android.calendar.event} objects with all
	 * events in the given date range.
	 * 
	 * @param date1
	 *            The start date.
	 * @param date2
	 *            The end date.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event[] getEventsBetweenDates(java.util.Date date1,
			java.util.Date date2)
	/*-{
		return this.getEventsBetweenDates(date1, date2);
	}-*/;

	/**
	 * Returns an array of
	 * {@link org.urish.gwtit.titanium.android.calendar.event} objects with all
	 * events on the given date.
	 * 
	 * @param year
	 *            The year of the desired date.
	 * @param month
	 *            The month of the desired date. The month is zero-based,
	 *            therefore January is 0 and December is 11.
	 * @param day
	 *            The day for which events should be returned.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event[] getEventsInDate(float year, float month,
			float day)
	/*-{
		return this.getEventsInDate(year, month, day);
	}-*/;

	/**
	 * Returns an array of
	 * {@link org.urish.gwtit.titanium.android.calendar.event} objects with all
	 * events in the given month.
	 * 
	 * @param year
	 *            The year of the desired month.
	 * @param month
	 *            The month for which events should be returned. The month is
	 *            zero-based, therefore January is 0 and December is 11.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event[] getEventsInMonth(float year, float month)
	/*-{
		return this.getEventsInMonth(year, month);
	}-*/;

	/**
	 * Returns an array of
	 * {@link org.urish.gwtit.titanium.android.calendar.event} objects with all
	 * events in the given year.
	 * 
	 * @param year
	 *            The year for which all events should be returned.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Event[] getEventsInYear(float year)
	/*-{
		return this.getEventsInYear(year);
	}-*/;

}
