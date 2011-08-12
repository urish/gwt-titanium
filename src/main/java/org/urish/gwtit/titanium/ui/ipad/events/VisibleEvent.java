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

import org.urish.gwtit.client.event.TouchEvent;

/**
 * 
 */
public class VisibleEvent extends TouchEvent {

	public final static String NATIVE_EVENT_NAME = "visible";

	protected VisibleEvent() {
	}

	/**
	 * for `view` view type, the button that is automatically wired to control
	 * the master view popover
	 */
	public final native org.urish.gwtit.titanium.ui.Button getButton()
	/*-{
		return this.button;
	}-*/;

	/**
	 * for either `popover` or `detail` view types, the popover instance
	 */
	public final native org.urish.gwtit.titanium.ui.View getPopover()
	/*-{
		return this.popover;
	}-*/;

	/**
	 * the type of view becoming visible. either `master`, `popover` or
	 * `detail`.
	 */
	public final native String getView()
	/*-{
		return this.view;
	}-*/;

}
