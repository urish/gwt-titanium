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

package org.urish.gwtit.titanium.ui.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class StopEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "stop";

	protected StopEvent() {
	}

	// Titanium.UI.ImageView

	/**
	 * the y point of the event, in receiving view coordinates
	 */
	public final native Object getY()
	/*-{
		return this.y;
	}-*/;

	/**
	 * a dictionary with properties x and y describing the point of the event in
	 * screen coordinates
	 */
	public final native Object getGlobalPoint()
	/*-{
		return this.globalPoint;
	}-*/;

	/**
	 * the x point of the event in receiving view coordiantes
	 */
	public final native Object getX()
	/*-{
		return this.x;
	}-*/;

}
