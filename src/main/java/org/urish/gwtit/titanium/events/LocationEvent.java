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
public class LocationEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "location";

	protected LocationEvent() {
	}

	/**
	 * if success is false, the error code if available (iOS only)
	 */
	public final native float getCode()
	/*-{
		return this.code;
	}-*/;

	/**
	 * boolean to indicate if the location event was successfully received or an
	 * error occurred
	 */
	public final native boolean getSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * (Android only) location provider dictionary with the following
	 * sub-properties: `name`, `accuracy`, `power`, and `provider`.
	 */
	public final native org.urish.gwtit.titanium.geolocation.LocationProviderInfo getProvider()
	/*-{
		return this.provider;
	}-*/;

	/**
	 * location coordinates dictionary with the following sub-properties:
	 * `latitude`, `longitude`, `altitude`, `accuracy`, `altitudeAccuracy`,
	 * `heading`, `speed`, `timestamp`.
	 */
	public final native org.urish.gwtit.titanium.geolocation.Coords getCoords()
	/*-{
		return this.coords;
	}-*/;

	/**
	 * if success is false, returns a string of the error description
	 */
	public final native String getError()
	/*-{
		return this.error;
	}-*/;

}
