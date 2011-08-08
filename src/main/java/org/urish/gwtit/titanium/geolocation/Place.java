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
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * 
 */
public class Place extends JavaScriptObject {
	protected Place() {
	}

	/**
	 * 
	 */
	public final native String getStreet()
	/*-{
		return this.street;
	}-*/;

	/**
	 * 
	 */
	public final native String getStreet1()
	/*-{
		return this.street1;
	}-*/;

	/**
	 * 
	 */
	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	/**
	 * 
	 */
	public final native String getRegion1()
	/*-{
		return this.region1;
	}-*/;

	/**
	 * 
	 */
	public final native String getRegion2()
	/*-{
		return this.region2;
	}-*/;

	/**
	 * 
	 */
	public final native String getPostalCode()
	/*-{
		return this.postalCode;
	}-*/;

	/**
	 * 
	 */
	public final native String getCountry()
	/*-{
		return this.country;
	}-*/;

	/**
	 * 
	 */
	public final native String getCountryCode()
	/*-{
		return this.countryCode;
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
	public final native float getLatitude()
	/*-{
		return this.latitude;
	}-*/;

	/**
	 * 
	 */
	public final native String getDisplayAddress()
	/*-{
		return this.displayAddress;
	}-*/;

	/**
	 * 
	 */
	public final native String getAddress()
	/*-{
		return this.address;
	}-*/;

}
