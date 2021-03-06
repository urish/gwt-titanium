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

package org.urish.gwtit.titanium.platform;


/**
 * The Display Caps object returned by the
 * {@link org.urish.gwtit.titanium.platform.displayCaps} property.
 * <p>
 * Notes: On iPhone, the `density` property will return `high` for retina
 * devices and `medium` otherwise, the `dpi` property will return `160`. For
 * iPad, the `density` property will return `medium` and the `dpi` property will
 * return `130`. For Android, these values are device specific.
 * 
 * @since 0.8
 */
public class DisplayCaps extends org.urish.gwtit.titanium.Proxy {
	protected DisplayCaps() {
	}

	/**
	 * @return Returns the density property of the display device.
	 */
	public final native String getDensity()
	/*-{
		return this.density;
	}-*/;

	public final native void setDensity(String value)
	/*-{
		this.density = value;
	}-*/;

	/**
	 * @return The DPI of the display device.
	 */
	public final native int getDpi()
	/*-{
		return this.dpi;
	}-*/;

	public final native void setDpi(int value)
	/*-{
		this.dpi = value;
	}-*/;

	/**
	 * @return The height of the device screen
	 */
	public final native float getPlatformHeight()
	/*-{
		return this.platformHeight;
	}-*/;

	public final native void setPlatformHeight(float value)
	/*-{
		this.platformHeight = value;
	}-*/;

	/**
	 * @return The width of the device screen
	 */
	public final native float getPlatformWidth()
	/*-{
		return this.platformWidth;
	}-*/;

	public final native void setPlatformWidth(float value)
	/*-{
		this.platformWidth = value;
	}-*/;

}
