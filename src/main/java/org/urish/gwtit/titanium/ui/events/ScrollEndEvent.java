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
public class ScrollEndEvent extends TouchEvent {

	public final static String NATIVE_EVENT_NAME = "scrollEnd";

	protected ScrollEndEvent() {
	}

	/**
	 * dictionary with `x` and `y` properties containing the content offset (iOS
	 * only)
	 */
	public final native org.urish.gwtit.client.util.Point getContentOffset()
	/*-{
		return this.contentOffset;
	}-*/;

	/**
	 * dictionary with `width` and `height` properties containing the size of
	 * the content (regardless of the display size in the case of scrolling)
	 * (iOS only)
	 */
	public final native org.urish.gwtit.client.util.Size getContentSize()
	/*-{
		return this.contentSize;
	}-*/;

	/**
	 * dictionary with `width` and `height` properties containing the size of
	 * the visible table view
	 */
	public final native org.urish.gwtit.client.util.Size getSize()
	/*-{
		return this.size;
	}-*/;

}
