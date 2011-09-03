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

package org.urish.gwtit.titanium.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class HeadingEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "heading";

	protected HeadingEvent() {
	}

	/**
	 * if success is false, the error code if available
	 */
	public final native float getCode()
	/*-{
		return this.code;
	}-*/;

	/**
	 * boolean to indicate if the heading event was successfully received or an
	 * error occurred
	 */
	public final native boolean getSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * if success is false, returns a string of the error description
	 */
	public final native String getError()
	/*-{
		return this.error;
	}-*/;

	/**
	 * heading results dictionary with the following sub-pro perties:
	 * `magneticHeading`, `trueHeading`, `accuracy`, `x`, `y`, `z`, `timestamp`.
	 */
	public final native org.urish.gwtit.titanium.geolocation.HeadingInfo getHeading()
	/*-{
		return this.heading;
	}-*/;

}
