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
 * A set of constants for the status bar style.
 * 
 * @platforms iphone, ipad
 * @since 0.9
 */
public class StatusBar extends org.urish.gwtit.titanium.Proxy {
	protected StatusBar() {
	}

	private static native final int value_DEFAULT()
	/*-{
		return Titanium.UI.iPhone.StatusBar.DEFAULT;
	}-*/;

	public static final int DEFAULT = value_DEFAULT();

	private static native final int value_GRAY()
	/*-{
		return Titanium.UI.iPhone.StatusBar.GRAY;
	}-*/;

	public static final int GRAY = value_GRAY();

	private static native final int value_OPAQUE_BLACK()
	/*-{
		return Titanium.UI.iPhone.StatusBar.OPAQUE_BLACK;
	}-*/;

	public static final int OPAQUE_BLACK = value_OPAQUE_BLACK();

	private static native final int value_TRANSLUCENT_BLACK()
	/*-{
		return Titanium.UI.iPhone.StatusBar.TRANSLUCENT_BLACK;
	}-*/;

	public static final int TRANSLUCENT_BLACK = value_TRANSLUCENT_BLACK();

}
