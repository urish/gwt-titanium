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
import org.urish.gwtit.titanium.events.BatteryHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level platform module. the platform module is used accessing the
 * device's platform related functionality.
 * 
 * @since 0.1
 */
public class Platform extends org.urish.gwtit.titanium.Module {
	protected Platform() {
	}

	private static native final int value_BATTERY_STATE_CHARGING()
	/*-{
		return Titanium.Platform.BATTERY_STATE_CHARGING;
	}-*/;

	public static final int BATTERY_STATE_CHARGING = value_BATTERY_STATE_CHARGING();

	private static native final int value_BATTERY_STATE_FULL()
	/*-{
		return Titanium.Platform.BATTERY_STATE_FULL;
	}-*/;

	public static final int BATTERY_STATE_FULL = value_BATTERY_STATE_FULL();

	private static native final int value_BATTERY_STATE_UNKNOWN()
	/*-{
		return Titanium.Platform.BATTERY_STATE_UNKNOWN;
	}-*/;

	public static final int BATTERY_STATE_UNKNOWN = value_BATTERY_STATE_UNKNOWN();

	private static native final int value_BATTERY_STATE_UNPLUGGED()
	/*-{
		return Titanium.Platform.BATTERY_STATE_UNPLUGGED;
	}-*/;

	public static final int BATTERY_STATE_UNPLUGGED = value_BATTERY_STATE_UNPLUGGED();

	/**
	 * @return The ip address that the device reports (only applicable on wifi
	 *         network)
	 */
	public static native String getAddress()
	/*-{
		return Titanium.Platform.address;
	}-*/;

	/**
	 * @return The processor architecture that the device reports
	 */
	public static native String getArchitecture()
	/*-{
		return Titanium.Platform.architecture;
	}-*/;

	/**
	 * @return Return the amount of memory available on the device in bytes
	 */
	public static native double getAvailableMemory()
	/*-{
		return Titanium.Platform.availableMemory;
	}-*/;

	/**
	 * @return The current device battery level. this property is only
	 *         accessible if `batterymonitoring` is enabled. on iphone, this
	 *         level only changes at 5% intervals.
	 */
	public static native float getBatteryLevel()
	/*-{
		return Titanium.Platform.batteryLevel;
	}-*/;

	/**
	 * @return Boolean to indicate if battery monitoring is enabled
	 */
	public static native boolean getBatteryMonitoring()
	/*-{
		return Titanium.Platform.batteryMonitoring;
	}-*/;

	/**
	 * @return Constant that represents the state of the battery. this property
	 *         is only accessible if `batterymonitoring` is enabled
	 */
	public static native int getBatteryState()
	/*-{
		return Titanium.Platform.batteryState;
	}-*/;

	/**
	 * @return Return the displaycaps object for platform
	 */
	public static native org.urish.gwtit.titanium.platform.DisplayCaps getDisplayCaps()
	/*-{
		return Titanium.Platform.displayCaps;
	}-*/;

	/**
	 * @return The unique id of the device
	 */
	public static native String getId()
	/*-{
		return Titanium.Platform.id;
	}-*/;

	/**
	 * @return The primary language of the device that the user has enabled
	 */
	public static native String getLocale()
	/*-{
		return Titanium.Platform.locale;
	}-*/;

	/**
	 * @return This property will return a unique identifier for the device
	 */
	public static native String getMacaddress()
	/*-{
		return Titanium.Platform.macaddress;
	}-*/;

	/**
	 * @return The model of the phone that the device reports
	 */
	public static native String getModel()
	/*-{
		return Titanium.Platform.model;
	}-*/;

	/**
	 * @return The name of the platform returned by the device
	 */
	public static native String getName()
	/*-{
		return Titanium.Platform.name;
	}-*/;

	/**
	 * @return The network mask that the device reports (only applicable on wifi
	 *         network)
	 */
	public static native String getNetmask()
	/*-{
		return Titanium.Platform.netmask;
	}-*/;

	/**
	 * @return The shortname of the operating system. for example, on an iphone,
	 *         will return `iphone`, ipad will return `ipad` and android will
	 *         return `android`.
	 */
	public static native String getOsname()
	/*-{
		return Titanium.Platform.osname;
	}-*/;

	/**
	 * @return The os architecture, such as 32 bit
	 */
	public static native String getOstype()
	/*-{
		return Titanium.Platform.ostype;
	}-*/;

	/**
	 * @return The number of processors the device reports
	 */
	public static native int getProcessorCount()
	/*-{
		return Titanium.Platform.processorCount;
	}-*/;

	/**
	 * @return The username of the device, if set
	 */
	public static native String getUsername()
	/*-{
		return Titanium.Platform.username;
	}-*/;

	/**
	 * @return The version of the platform returned by the device
	 */
	public static native String getVersion()
	/*-{
		return Titanium.Platform.version;
	}-*/;

	public static native org.urish.gwtit.titanium.platform.DisplayCaps createDisplayCaps()
	/*-{
		return Titanium.Platform.createDisplayCaps();
	}-*/;

	/**
	 * Returns whether or not a system url can be opened.
	 * 
	 * @platforms iphone, ipad
	 * @param url
	 *            the url to check
	 */
	public static native void canOpenURL(String url)
	/*-{
		return Titanium.Platform.canOpenURL(url);
	}-*/;

	/**
	 * Create a globally unique identifier
	 */
	public static native String createUUID()
	/*-{
		return Titanium.Platform.createUUID();
	}-*/;

	/**
	 * Open a url in the system default manner
	 * 
	 * @param url
	 *            the url to open
	 */
	public static native void openURL(String url)
	/*-{
		return Titanium.Platform.openURL(url);
	}-*/;

	/**
	 * Whether device settings are set to show times in 24-hour format.
	 */
	public static native boolean is24HourTimeFormat()
	/*-{
		return Titanium.Platform.is24HourTimeFormat();
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Platform.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Platform.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.Platform.fireEvent(name, event);
	}-*/;

	public static native void addBatteryHandler(BatteryHandler handler)
	/*-{
		return Titanium.Platform.addEventListener('battery', function(e) { handler.@org.urish.gwtit.titanium.events.BatteryHandler::onBattery(Lorg/urish/gwtit/titanium/events/BatteryEvent;)(e); } );
	}-*/;

}
