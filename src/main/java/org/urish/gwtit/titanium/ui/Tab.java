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

package org.urish.gwtit.titanium.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A tabgroup tab instance. each tab instance maintains a stack of tab windows.
 * only one window within in the tab can be visible at a time. when a window is
 * closed, either by the user or by code, the window is removed from the stack,
 * make the previous window visible. the root tab window cannot be removed. the
 * tab group is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtab}.
 * 
 * @since 0.8
 */
public class Tab extends org.urish.gwtit.titanium.ui.View {
	protected Tab() {
	}

	/**
	 * @return The badge value for the tab group for this tab. null indicates no
	 *         badge is value
	 */
	public final native String getBadge()
	/*-{
		return this.badge;
	}-*/;

	public final native void setBadge(String value)
	/*-{
		this.badge = value;
	}-*/;

	/**
	 * @return The icon url for the tab group for this tab
	 */
	public final native String getIcon()
	/*-{
		return this.icon;
	}-*/;

	public final native void setIcon(String value)
	/*-{
		this.icon = value;
	}-*/;

	/**
	 * @return The title for the tab group for this tab
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public final native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public final native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

	/**
	 * @return The root level tab window. all tabs must have at least one root
	 *         level tab window.
	 */
	public final native JavaScriptObject getWindow()
	/*-{
		return this.window;
	}-*/;

	public final native void setWindow(JavaScriptObject value)
	/*-{
		this.window = value;
	}-*/;

	/**
	 * @param view
	 *            The view to open in the tab
	 */
	public final native void open(org.urish.gwtit.titanium.ui.View view)
	/*-{
		return this.open(view);
	}-*/;

}
