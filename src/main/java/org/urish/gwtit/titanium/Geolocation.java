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

import org.urish.gwtit.client.EventCallback;

/**
 * The top level geolocation module. the geolocation module is used for
 * accessing device location based information.
 * 
 * @since 0.1
 */
public class Geolocation extends org.urish.gwtit.titanium.Module {
	protected Geolocation() {
	}

	private static native final float value_ACCURACY_BEST()
	/*-{
		return Titanium.Geolocation.ACCURACY_BEST;
	}-*/;

	public static final float ACCURACY_BEST = value_ACCURACY_BEST();

	private static native final float value_ACCURACY_HUNDRED_METERS()
	/*-{
		return Titanium.Geolocation.ACCURACY_HUNDRED_METERS;
	}-*/;

	public static final float ACCURACY_HUNDRED_METERS = value_ACCURACY_HUNDRED_METERS();

	private static native final float value_ACCURACY_KILOMETER()
	/*-{
		return Titanium.Geolocation.ACCURACY_KILOMETER;
	}-*/;

	public static final float ACCURACY_KILOMETER = value_ACCURACY_KILOMETER();

	private static native final float value_ACCURACY_NEAREST_TEN_METERS()
	/*-{
		return Titanium.Geolocation.ACCURACY_NEAREST_TEN_METERS;
	}-*/;

	public static final float ACCURACY_NEAREST_TEN_METERS = value_ACCURACY_NEAREST_TEN_METERS();

	private static native final float value_ACCURACY_THREE_KILOMETERS()
	/*-{
		return Titanium.Geolocation.ACCURACY_THREE_KILOMETERS;
	}-*/;

	public static final float ACCURACY_THREE_KILOMETERS = value_ACCURACY_THREE_KILOMETERS();

	private static native final float value_AUTHORIZATION_AUTHORIZED()
	/*-{
		return Titanium.Geolocation.AUTHORIZATION_AUTHORIZED;
	}-*/;

	public static final float AUTHORIZATION_AUTHORIZED = value_AUTHORIZATION_AUTHORIZED();

	private static native final float value_AUTHORIZATION_DENIED()
	/*-{
		return Titanium.Geolocation.AUTHORIZATION_DENIED;
	}-*/;

	public static final float AUTHORIZATION_DENIED = value_AUTHORIZATION_DENIED();

	private static native final float value_AUTHORIZATION_RESTRICTED()
	/*-{
		return Titanium.Geolocation.AUTHORIZATION_RESTRICTED;
	}-*/;

	public static final float AUTHORIZATION_RESTRICTED = value_AUTHORIZATION_RESTRICTED();

	private static native final float value_AUTHORIZATION_UNKNOWN()
	/*-{
		return Titanium.Geolocation.AUTHORIZATION_UNKNOWN;
	}-*/;

	public static final float AUTHORIZATION_UNKNOWN = value_AUTHORIZATION_UNKNOWN();

	private static native final float value_ERROR_DENIED()
	/*-{
		return Titanium.Geolocation.ERROR_DENIED;
	}-*/;

	public static final float ERROR_DENIED = value_ERROR_DENIED();

	private static native final float value_ERROR_HEADING_FAILURE()
	/*-{
		return Titanium.Geolocation.ERROR_HEADING_FAILURE;
	}-*/;

	public static final float ERROR_HEADING_FAILURE = value_ERROR_HEADING_FAILURE();

	private static native final float value_ERROR_LOCATION_UNKNOWN()
	/*-{
		return Titanium.Geolocation.ERROR_LOCATION_UNKNOWN;
	}-*/;

	public static final float ERROR_LOCATION_UNKNOWN = value_ERROR_LOCATION_UNKNOWN();

	private static native final float value_ERROR_NETWORK()
	/*-{
		return Titanium.Geolocation.ERROR_NETWORK;
	}-*/;

	public static final float ERROR_NETWORK = value_ERROR_NETWORK();

	private static native final float value_ERROR_REGION_MONITORING_DELAYED()
	/*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DELAYED;
	}-*/;

	public static final float ERROR_REGION_MONITORING_DELAYED = value_ERROR_REGION_MONITORING_DELAYED();

	private static native final float value_ERROR_REGION_MONITORING_DENIED()
	/*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DENIED;
	}-*/;

	public static final float ERROR_REGION_MONITORING_DENIED = value_ERROR_REGION_MONITORING_DENIED();

	private static native final float value_ERROR_REGION_MONITORING_FAILURE()
	/*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_FAILURE;
	}-*/;

	public static final float ERROR_REGION_MONITORING_FAILURE = value_ERROR_REGION_MONITORING_FAILURE();

	private static native final String value_PROVIDER_GPS()
	/*-{
		return Titanium.Geolocation.PROVIDER_GPS;
	}-*/;

	public static final String PROVIDER_GPS = value_PROVIDER_GPS();

	private static native final String value_PROVIDER_NETWORK()
	/*-{
		return Titanium.Geolocation.PROVIDER_NETWORK;
	}-*/;

	public static final String PROVIDER_NETWORK = value_PROVIDER_NETWORK();

	/**
	 * @return The minimum change of position (in meters) before a 'location'
	 *         event is fired. default is 0, meaning that location events are
	 *         continuously generated.
	 */
	public static native float getDistanceFilter()
	/*-{
		return Titanium.Geolocation.distanceFilter;
	}-*/;

	public static native void setDistanceFilter(float value)
	/*-{
		Titanium.Geolocation.distanceFilter = value;
	}-*/;

	/**
	 * @return The minium change of heading (in degrees) before a 'heading'
	 *         event is fired. default is 0, meaning that heading events are
	 *         continuously generated.
	 */
	public static native float getHeadingFilter()
	/*-{
		return Titanium.Geolocation.headingFilter;
	}-*/;

	public static native void setHeadingFilter(float value)
	/*-{
		Titanium.Geolocation.headingFilter = value;
	}-*/;

	/**
	 * @return (ios 4.2+ only). returns an authorization constant indicating if
	 *         the application has access to location services. always returns
	 *         authorization_unknown on pre-4.2 devices. attempting to
	 *         re-authorize when authorization_restricted will lead to issues
	 * @platforms iphone, ipad
	 */
	public static native float getLocationServicesAuthorization()
	/*-{
		return Titanium.Geolocation.locationServicesAuthorization;
	}-*/;

	public static native void setLocationServicesAuthorization(float value)
	/*-{
		Titanium.Geolocation.locationServicesAuthorization = value;
	}-*/;

	/**
	 * @return Returns true if the user has enabled or disable location services
	 *         for the device (not the application).
	 */
	public static native boolean getLocationServicesEnabled()
	/*-{
		return Titanium.Geolocation.locationServicesEnabled;
	}-*/;

	public static native void setLocationServicesEnabled(boolean value)
	/*-{
		Titanium.Geolocation.locationServicesEnabled = value;
	}-*/;

	/**
	 * @return Allows setting of the preferred location provider. returns
	 *         undefined when the preferred provider is auto-detected
	 */
	public static native String getPreferredProvider()
	/*-{
		return Titanium.Geolocation.preferredProvider;
	}-*/;

	public static native void setPreferredProvider(String value)
	/*-{
		Titanium.Geolocation.preferredProvider = value;
	}-*/;

	/**
	 * @return (ios only). this property informs the end-user why location
	 *         services are being requested by the application. this string will
	 *         be display in the permission dialog. this property is required
	 *         starting in 4.0.
	 * @platforms iphone, ipad
	 */
	public static native String getPurpose()
	/*-{
		return Titanium.Geolocation.purpose;
	}-*/;

	public static native void setPurpose(String value)
	/*-{
		Titanium.Geolocation.purpose = value;
	}-*/;

	/**
	 * @return Returns true if the calibration ui can show
	 */
	public static native boolean getShowCalibration()
	/*-{
		return Titanium.Geolocation.showCalibration;
	}-*/;

	public static native void setShowCalibration(boolean value)
	/*-{
		Titanium.Geolocation.showCalibration = value;
	}-*/;

	/**
	 * Tries to resolve an address to a location.
	 * 
	 * @param address
	 *            address to resolve.
	 * @param callback
	 *            function to invoke on success or failure. The event object
	 *            contains the properties described as the `place` dictionary in
	 *            {@link org.urish.gwtit.titanium.geolocation.reverseGeocoder}.
	 */
	public static native void forwardGeocoder(String address, Object callback)
	/*-{
		return Titanium.Geolocation.forwardGeocoder(address, callback);
	}-*/;

	/**
	 * Retrieve the current compass heading.
	 * 
	 * @param callback
	 *            function to invoke on success or failure of obtaining the
	 *            current heading. See heading event in
	 *            {@link org.urish.gwtit.titanium.Geolocation}.
	 */
	public static native void getCurrentHeading(Object callback)
	/*-{
		return Titanium.Geolocation.getCurrentHeading(callback);
	}-*/;

	/**
	 * Retrieve the last known location from the device. on android, the radios
	 * are not turned on to update the location. on ios the radios may be used
	 * if the location is too "old".
	 * 
	 * @param callback
	 *            function to invoke on success or failure of obtaining the
	 *            current location. See location event in
	 *            {@link org.urish.gwtit.titanium.Geolocation}.
	 */
	public static native void getCurrentPosition(Object callback)
	/*-{
		return Titanium.Geolocation.getCurrentPosition(callback);
	}-*/;

	/**
	 * Tries to resolve a location to an address.
	 * 
	 * @param latitude
	 *            latitude to search
	 * @param longitude
	 *            longitude to search
	 * @param callback
	 *            function to invoke on success or failure. The event object
	 *            passed contains a `places` array of zero or more place
	 *            dictionaries. Each `place` dictionary contains the following
	 *            properties: `street`, `street1`, `city`, `region1`, `region2`,
	 *            `postalCode`, `country`, `countryCode`, `longitude`,
	 *            `latitude`, `displayAddress`, `address`.
	 */
	public static native void reverseGeocoder(float latitude, float longitude, Object callback)
	/*-{
		return Titanium.Geolocation.reverseGeocoder(latitude, longitude, callback);
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
		return Titanium.Geolocation.addEventListener(name, callback);
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
		return Titanium.Geolocation.removeEventListener(name, callbac);
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
		return Titanium.Geolocation.fireEvent(name, event);
	}-*/;

	public final class CalibrationEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "calibration";

	}

	public static native void addCalibrationHandler(EventCallback<CalibrationEvent> handler)
	/*-{
		return Titanium.Geolocation.addEventListener('calibration', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class HeadingEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "heading";

		/**
		 * if success is false, the error code if available (iOS only)
		 */
		public final native Object getCode()
		/*-{
			return this.code;
		}-*/;

		/**
		 * boolean to indicate if the heading event was successfully received or
		 * an error occurred
		 */
		public final native Object getSuccess()
		/*-{
			return this.success;
		}-*/;

		/**
		 * if success is false, returns a string of the error description
		 */
		public final native Object getError()
		/*-{
			return this.error;
		}-*/;

		/**
		 * heading results dictionary with the following sub-properties:
		 * `magneticHeading`, `trueHeading`, `accuracy`, `x`, `y`, `z`,
		 * `timestamp`.
		 */
		public final native Object getHeading()
		/*-{
			return this.heading;
		}-*/;

	}

	public static native void addHeadingHandler(EventCallback<HeadingEvent> handler)
	/*-{
		return Titanium.Geolocation.addEventListener('heading', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class LocationEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "location";

		/**
		 * if success is false, the error code if available (iOS only)
		 */
		public final native Object getCode()
		/*-{
			return this.code;
		}-*/;

		/**
		 * boolean to indicate if the location event was successfully received
		 * or an error occurred
		 */
		public final native Object getSuccess()
		/*-{
			return this.success;
		}-*/;

		/**
		 * (Android only) location provider dictionary with the following
		 * sub-properties: `name`, `accuracy`, `power`, and `provider`.
		 */
		public final native Object getProvider()
		/*-{
			return this.provider;
		}-*/;

		/**
		 * location coordinates dictionary with the following sub-properties:
		 * `latitude`, `longitude`, `altitude`, `accuracy`, `altitudeAccuracy`,
		 * `heading`, `speed`, `timestamp`.
		 */
		public final native Object getCoords()
		/*-{
			return this.coords;
		}-*/;

		/**
		 * if success is false, returns a string of the error description
		 */
		public final native Object getError()
		/*-{
			return this.error;
		}-*/;

	}

	public static native void addLocationHandler(EventCallback<LocationEvent> handler)
	/*-{
		return Titanium.Geolocation.addEventListener('location', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
