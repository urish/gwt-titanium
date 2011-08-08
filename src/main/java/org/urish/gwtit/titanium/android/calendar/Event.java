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

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * An object which represents a single event in an android calendar.
 * <p>
 * Notes: The API supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported. See
 * <Titanium.Android.Calendar> for examples of retrieving event information and
 * creating events.
 * 
 * @platforms android
 * @since 1.5
 */
public class Event extends org.urish.gwtit.titanium.Proxy {
	protected Event() {
	}

	/**
	 * @return An array of
	 *         {@link org.urish.gwtit.titanium.android.calendar.alert} objects
	 *         which are the alerts - if any - for this event.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Alert[] getAlerts()
	/*-{
		return this.alerts;
	}-*/;

	public final native void setAlerts(org.urish.gwtit.titanium.android.calendar.Alert[] value)
	/*-{
		this.alerts = value;
	}-*/;

	/**
	 * @return Whether the event is all day.
	 */
	public final native boolean getAllDay()
	/*-{
		return this.allDay;
	}-*/;

	public final native void setAllDay(boolean value)
	/*-{
		this.allDay = value;
	}-*/;

	/**
	 * @return The date/time at which the event begins.
	 */
	public final native java.util.Date getBegin()
	/*-{
		return this.begin;
	}-*/;

	public final native void setBegin(java.util.Date value)
	/*-{
		this.begin = value;
	}-*/;

	/**
	 * @return The event description.
	 */
	public final native String getDescription()
	/*-{
		return this.description;
	}-*/;

	public final native void setDescription(String value)
	/*-{
		this.description = value;
	}-*/;

	/**
	 * @return The date/time at which the event ends.
	 */
	public final native java.util.Date getEnd()
	/*-{
		return this.end;
	}-*/;

	public final native void setEnd(java.util.Date value)
	/*-{
		this.end = value;
	}-*/;

	/**
	 * @return An object containing extended properties of the event.
	 */
	public final native Object getExtendedProperties()
	/*-{
		return this.extendedProperties;
	}-*/;

	public final native void setExtendedProperties(Object value)
	/*-{
		this.extendedProperties = value;
	}-*/;

	/**
	 * @return Whether an alarm is scheduled for the event.
	 */
	public final native boolean getHasAlarm()
	/*-{
		return this.hasAlarm;
	}-*/;

	public final native void setHasAlarm(boolean value)
	/*-{
		this.hasAlarm = value;
	}-*/;

	/**
	 * 
	 */
	public final native boolean getHasExtendedProperties()
	/*-{
		return this.hasExtendedProperties;
	}-*/;

	public final native void setHasExtendedProperties(boolean value)
	/*-{
		this.hasExtendedProperties = value;
	}-*/;

	/**
	 * @return The id of the event.
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
	 * @return The event location.
	 */
	public final native String getLocation()
	/*-{
		return this.location;
	}-*/;

	public final native void setLocation(String value)
	/*-{
		this.location = value;
	}-*/;

	/**
	 * @return An array of
	 *         {@link org.urish.gwtit.titanium.android.calendar.reminder}
	 *         objects which are the reminders - if any - for this event.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Reminder[] getReminders()
	/*-{
		return this.reminders;
	}-*/;

	public final native void setReminders(org.urish.gwtit.titanium.android.calendar.Reminder[] value)
	/*-{
		this.reminders = value;
	}-*/;

	/**
	 * @return The status of the event. possible values are the status constants
	 *         in {@link org.urish.gwtit.titanium.android.calendar}.
	 */
	public final native float getStatus()
	/*-{
		return this.status;
	}-*/;

	public final native void setStatus(float value)
	/*-{
		this.status = value;
	}-*/;

	/**
	 * @return The title string for the event.
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The event's visibility. possible values are the visibility
	 *         constants in {@link org.urish.gwtit.titanium.android.calendar}.
	 */
	public final native float getVisibility()
	/*-{
		return this.visibility;
	}-*/;

	public final native void setVisibility(float value)
	/*-{
		this.visibility = value;
	}-*/;

	/**
	 * Create an alert for this event. pass a dictionary object containing
	 * attributes corresponding to properties of
	 * {@link org.urish.gwtit.titanium.android.calendar.alert}. returns the
	 * created alert.
	 * 
	 * @param data
	 *            Properties for the new alert, corresponding to properties of
	 *            {@link org.urish.gwtit.titanium.android.calendar.Alert}.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Alert createAlert(
			org.urish.gwtit.titanium.android.calendar.Alert data)
	/*-{
		return this.createAlert(data);
	}-*/;

	/**
	 * Create a reminder for this event. pass a dictionary object containing
	 * attributes corresponding to properties of
	 * {@link org.urish.gwtit.titanium.android.calendar.reminder}. returns the
	 * created reminder.
	 * 
	 * @param data
	 *            Properties for the new reminder, corresponding to properties
	 *            of {@link org.urish.gwtit.titanium.android.calendar.Reminder}.
	 */
	public final native org.urish.gwtit.titanium.android.calendar.Reminder createReminder(
			org.urish.gwtit.titanium.android.calendar.Reminder data)
	/*-{
		return this.createReminder(data);
	}-*/;

	/**
	 * Returns the value of the given extended property key string.
	 * 
	 * @param name
	 *            The name of the extended property whose value should be
	 *            returned.
	 */
	public final native String getExtendedProperty(String name)
	/*-{
		return this.getExtendedProperty(name);
	}-*/;

	/**
	 * Set the value of the named extended property.
	 * 
	 * @param name
	 *            The name of the extended property whose value should be set.
	 * @param value
	 *            The value to which to set the named extended property.
	 */
	public final native void setExtendedProperty(String name, String value)
	/*-{
		return this.setExtendedProperty(name, value);
	}-*/;

}
