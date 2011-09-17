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

package org.urish.gwtit.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Specifies a region in the map
 */
public class RegionDict extends JavaScriptObject {
	protected RegionDict() {
	}

	/**
	 * Creates a new, empty instance of RegionDict
	 */
	public static final native RegionDict createRegionDict()
	/*-{
		return {};
	}-*/;

	/**
	 * @return The latitude
	 */
	public final native float getLatitude()
	/*-{
		return this.latitude;
	}-*/;

	public final native void setLatitude(float value)
	/*-{
		this.latitude = value;
	}-*/;

	/**
	 * @return The latitude delta
	 */
	public final native float getLatitudeDelta()
	/*-{
		return this.latitudeDelta;
	}-*/;

	public final native void setLatitudeDelta(float value)
	/*-{
		this.latitudeDelta = value;
	}-*/;

	/**
	 * @return The longitude
	 */
	public final native float getLongitude()
	/*-{
		return this.longitude;
	}-*/;

	public final native void setLongitude(float value)
	/*-{
		this.longitude = value;
	}-*/;

	/**
	 * @return The longitude delta
	 */
	public final native float getLongitudeDelta()
	/*-{
		return this.longitudeDelta;
	}-*/;

	public final native void setLongitudeDelta(float value)
	/*-{
		this.longitudeDelta = value;
	}-*/;

}
