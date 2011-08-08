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

package org.urish.gwtit.titanium.ui.iphone;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A navigation group implements a specialized view that manages the navigation
 * of hierarchical content. the navigation group is created by the method
 * {@link org.urish.gwtit.titanium.ui.iphone.navigationgroup}.
 * ![navgroup](http://img.skitch.com/20100406-rwe44533tkd94fdnbqqudxynpe.png) a
 * navigation group is very similar to tab bars with the exception that they do
 * not maintain a group of windows with a interface bar at the bottom.
 * <p>
 * Notes: The `window` property must be set initially in the constructor when
 * creating a navigation group to the root level window. All Navigation Groups
 * must have at least one root window that cannot be removed.
 * 
 * @platforms iphone, ipad
 * @since 1.2
 */
public class NavigationGroup extends org.urish.gwtit.titanium.ui.View {
	protected NavigationGroup() {
	}

	/**
	 * Close a window and remove it from the navigation group
	 * 
	 * @param window
	 *            window to close
	 * @param properties
	 *            optional dictionary. the only current property supported is
	 *            `animated` which is a boolean to indicate if the window should
	 *            be closed animated (default) or not.
	 */
	public final native void close(Object window, Object properties)
	/*-{
		return this.close(window, properties);
	}-*/;

	/**
	 * Open a window within the navigation group
	 * 
	 * @param window
	 *            window to open within the tab group
	 * @param properties
	 *            optional dictionary. the only current property supported is
	 *            `animated` which is a boolean to indicate if the window should
	 *            be opened animated (default) or not.
	 */
	public final native void open(Object window, Object properties)
	/*-{
		return this.open(window, properties);
	}-*/;

}
