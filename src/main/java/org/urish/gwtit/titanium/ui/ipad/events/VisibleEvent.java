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

package org.urish.gwtit.titanium.ui.ipad.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class VisibleEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "visible";

	protected VisibleEvent() {
	}

	/**
	 * the y point of the event, in receiving view coordinates
	 */
	public final native Object getY()
	/*-{
		return this.y;
	}-*/;

	/**
	 * for `view` view type, the button that is automatically wired to control
	 * the master view popover
	 */
	public final native Object getButton()
	/*-{
		return this.button;
	}-*/;

	/**
	 * for either `popover` or `detail` view types, the popover instance
	 */
	public final native Object getPopover()
	/*-{
		return this.popover;
	}-*/;

	/**
	 * the x point of the event in receiving view coordiantes
	 */
	public final native Object getX()
	/*-{
		return this.x;
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
	 * the type of view becoming visible. either `master`, `popover` or
	 * `detail`.
	 */
	public final native Object getView()
	/*-{
		return this.view;
	}-*/;

}
