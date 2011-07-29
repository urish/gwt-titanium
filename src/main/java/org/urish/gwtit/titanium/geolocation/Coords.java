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

package org.urish.gwtit.titanium.geolocation;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A callback for when dialog is completed/cancelled
 */
public class Coords extends JavaScriptObject {
	protected Coords() {
	}

	/**
	 * 
	 */
	public final native float getLatitude()
	/*-{
		return this.latitude;
	}-*/;

	/**
	 * 
	 */
	public final native float getLongitude()
	/*-{
		return this.longitude;
	}-*/;

	/**
	 * 
	 */
	public final native float getAltitude()
	/*-{
		return this.altitude;
	}-*/;

	/**
	 * 
	 */
	public final native float getAccuracy()
	/*-{
		return this.accuracy;
	}-*/;

	/**
	 * 
	 */
	public final native float getAltitudeAccuracy()
	/*-{
		return this.altitudeAccuracy;
	}-*/;

	/**
	 * 
	 */
	public final native float getHeading()
	/*-{
		return this.heading;
	}-*/;

	/**
	 * 
	 */
	public final native float getSpeed()
	/*-{
		return this.speed;
	}-*/;

	/**
	 * 
	 */
	public final native java.util.Date getTimestamp()
	/*-{
		return this.timestamp;
	}-*/;

}
