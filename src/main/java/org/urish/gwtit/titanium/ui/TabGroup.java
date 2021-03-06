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

import org.urish.gwtit.titanium.ui.events.CloseHandler;
import org.urish.gwtit.titanium.ui.events.OpenHandler;
import org.urish.gwtit.titanium.ui.events.TabGroupBlurHandler;
import org.urish.gwtit.titanium.ui.events.TabGroupFocusHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Tab Group allows you to manage a tabbed UI of one or more windows. The
 * Tab Group is created by the method
 * {@link org.urish.gwtit.titanium.ui.createTabGroup}.
 * <p>
 * Notes: Note that when opening a tab group, if one or more of its tabs have
 * been set 'active' prior to opening, or if setActiveTab() has been called
 * while a tab is 'active', the result of which tab is initially selected is
 * undefined.
 * 
 * @since 0.9
 */
public class TabGroup extends org.urish.gwtit.titanium.ui.View {
	protected TabGroup() {
	}

	/**
	 * @return The active tab
	 */
	public final native org.urish.gwtit.titanium.ui.Tab getActiveTab()
	/*-{
		return this.activeTab;
	}-*/;

	public final native void setActiveTab(org.urish.gwtit.titanium.ui.Tab value)
	/*-{
		this.activeTab = value;
	}-*/;

	/**
	 * @return Whether or not the user can configure the tab group via the
	 *         'More' tab's edit functionality.
	 * @platforms iphone, ipad
	 */
	public final native boolean getAllowUserCustomization()
	/*-{
		return this.allowUserCustomization;
	}-*/;

	public final native void setAllowUserCustomization(boolean value)
	/*-{
		this.allowUserCustomization = value;
	}-*/;

	/**
	 * @return The default navigation bar color (typically for the "More" tab)
	 */
	public final native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public final native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return The title for the 'More' tab edit button.
	 * @platforms iphone, ipad
	 */
	public final native String getEditButtonTitle()
	/*-{
		return this.editButtonTitle;
	}-*/;

	public final native void setEditButtonTitle(String value)
	/*-{
		this.editButtonTitle = value;
	}-*/;

	/**
	 * @return Array of tab objects that are managed by the tab group
	 */
	public final native JavaScriptObject[] getTabs()
	/*-{
		return this.tabs;
	}-*/;

	public final native void setTabs(JavaScriptObject[] value)
	/*-{
		this.tabs = value;
	}-*/;

	/**
	 * @return One of Ti.UI.Android.SOFT_INPUT_ADJUST_PAN,
	 *         Ti.UI.Android.SOFT_INPUT_ADJUST_RESIZE, or
	 *         Ti.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED. Note: MUST be passed
	 *         in the creation options. [Android Doc:
	 *         Window.setSoftInputMode](http
	 *         ://developer.android.com/reference/android
	 *         /view/Window.html#setSoftInputMode(int))
	 * 
	 * @platforms android
	 */
	public final native int getWindowSoftInputMode()
	/*-{
		return this.windowSoftInputMode;
	}-*/;

	public final native void setWindowSoftInputMode(int value)
	/*-{
		this.windowSoftInputMode = value;
	}-*/;

	/**
	 * Add a tab to the tab group
	 * 
	 * @param tab
	 *            The tab to add
	 */
	public final native void addTab(org.urish.gwtit.titanium.ui.Tab tab)
	/*-{
		return this.addTab(tab);
	}-*/;

	/**
	 * Close the tab group and remove it from the UI
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Open the tab group and make it visible
	 */
	public final native void open()
	/*-{
		return this.open();
	}-*/;

	/**
	 * Remove a tab from the tab group
	 */
	public final native void removeTab()
	/*-{
		return this.removeTab();
	}-*/;

	public final native void addBlurHandler(TabGroupBlurHandler handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TabGroupBlurHandler::onTabGroupBlur(Lorg/urish/gwtit/titanium/ui/events/TabGroupBlurEvent;)(e); } );
	}-*/;

	public final native void addCloseHandler(CloseHandler handler)
	/*-{
		return this.addEventListener('close', function(e) { handler.@org.urish.gwtit.titanium.ui.events.CloseHandler::onClose(Lorg/urish/gwtit/titanium/ui/events/CloseEvent;)(e); } );
	}-*/;

	public final native void addFocusHandler(TabGroupFocusHandler handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TabGroupFocusHandler::onTabGroupFocus(Lorg/urish/gwtit/titanium/ui/events/TabGroupFocusEvent;)(e); } );
	}-*/;

	public final native void addOpenHandler(OpenHandler handler)
	/*-{
		return this.addEventListener('open', function(e) { handler.@org.urish.gwtit.titanium.ui.events.OpenHandler::onOpen(Lorg/urish/gwtit/titanium/ui/events/OpenEvent;)(e); } );
	}-*/;

}
