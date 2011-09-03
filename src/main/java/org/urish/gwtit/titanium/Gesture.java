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

import org.urish.gwtit.titanium.events.OrientationChangeHandler;
import org.urish.gwtit.titanium.events.ShakeHandler;

/**
 * The top level Gestures module. The Gesture module is responsible for high
 * level device gestures that are device-wide.
 * 
 * @since 0.8
 */
public class Gesture extends org.urish.gwtit.titanium.Module {
	protected Gesture() {
	}

	/**
	 * @return True if current window is considered portrait by the device,
	 *         false otherwise
	 */
	public static native boolean getPortrait()
	/*-{
		return Titanium.Gesture.portrait;
	}-*/;

	/**
	 * @return True if current window is considered landscape by the device,
	 *         false otherwise
	 */
	public static native boolean getLandscape()
	/*-{
		return Titanium.Gesture.landscape;
	}-*/;

	/**
	 * @return Orientation of the current window. Value will be one of the
	 *         following - {@link org.urish.gwtit.titanium.UI.PORTRAIT},
	 *         {@link org.urish.gwtit.titanium.UI.UPSIDE_PORTRAIT},
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_LEFT},
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_RIGHT} or
	 *         {@link org.urish.gwtit.titanium.UI.UNKNOWN}
	 */
	public static native float getOrientation()
	/*-{
		return Titanium.Gesture.orientation;
	}-*/;

	public static native void addOrientationChangeHandler(OrientationChangeHandler handler)
	/*-{
		return Titanium.Gesture.addEventListener('orientationchange', function(e) { handler.@org.urish.gwtit.titanium.events.OrientationChangeHandler::onOrientationChange(Lorg/urish/gwtit/titanium/events/OrientationChangeEvent;)(e); } );
	}-*/;

	public static native void addShakeHandler(ShakeHandler handler)
	/*-{
		return Titanium.Gesture.addEventListener('shake', function(e) { handler.@org.urish.gwtit.titanium.events.ShakeHandler::onShake(Lorg/urish/gwtit/titanium/events/ShakeEvent;)(e); } );
	}-*/;

}
