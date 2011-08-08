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
 * A set of constants for the style that can be used for the `separatorstyle`
 * property of {@link org.urish.gwtit.titanium.ui.tableview}.
 * 
 * @platforms iphone, ipad
 * @since 0.9
 */
public class TableViewSeparatorStyle extends org.urish.gwtit.titanium.Proxy {
	protected TableViewSeparatorStyle() {
	}

	private static native final int value_NONE()
	/*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.NONE;
	}-*/;

	public static final int NONE = value_NONE();

	private static native final int value_SINGLE_LINE()
	/*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.SINGLE_LINE;
	}-*/;

	public static final int SINGLE_LINE = value_SINGLE_LINE();

}
