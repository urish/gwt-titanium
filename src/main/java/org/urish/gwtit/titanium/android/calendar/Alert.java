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
 * An object which represents a single alert for an event in an android
 * calendar.
 * 
 * @platforms android
 * @since 1.5
 */
public class Alert extends org.urish.gwtit.titanium.Proxy {
	protected Alert() {
	}

	/**
	 * @return The date/time at which the alert's alarm is triggered.
	 */
	public final native java.util.Date getAlarmTime()
	/*-{
		return this.alarmTime;
	}-*/;

	public final native void setAlarmTime(java.util.Date value)
	/*-{
		this.alarmTime = value;
	}-*/;

	/**
	 * @return The date/time at which the corresponding event begins.
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
	 * @return The date/time at which the corresponding event ends.
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
	 * @return The integer id of the event for which the alert is set.
	 */
	public final native float getEventId()
	/*-{
		return this.eventId;
	}-*/;

	public final native void setEventId(float value)
	/*-{
		this.eventId = value;
	}-*/;

	/**
	 * @return The id of the alert.
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
	 * @return The minutes before the event when the alert should trigger.
	 */
	public final native float getMinutes()
	/*-{
		return this.minutes;
	}-*/;

	public final native void setMinutes(float value)
	/*-{
		this.minutes = value;
	}-*/;

	/**
	 * @return The current state of the alert. possible values are the state_
	 *         constants in {@link org.urish.gwtit.titanium.android.calendar}.
	 */
	public final native float getState()
	/*-{
		return this.state;
	}-*/;

	public final native void setState(float value)
	/*-{
		this.state = value;
	}-*/;

}
