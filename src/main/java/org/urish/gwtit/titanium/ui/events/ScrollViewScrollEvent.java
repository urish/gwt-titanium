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

import org.urish.gwtit.client.event.TouchEvent;

/**
 * 
 */
public class ScrollViewScrollEvent extends TouchEvent {

	public final static String NATIVE_EVENT_NAME = "scroll";

	protected ScrollViewScrollEvent() {
	}

	/**
	 * boolean to indicate if the scroll is based on a dragging gesture
	 */
	public final native boolean getDragging()
	/*-{
		return this.dragging;
	}-*/;

	/**
	 * boolean to indicate if the scroll is decelerating
	 */
	public final native boolean getDecelerating()
	/*-{
		return this.decelerating;
	}-*/;

}