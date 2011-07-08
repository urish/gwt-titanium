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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The tab group allows you to manage a tabbed ui of one or more windows. the
 * tab group is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtabgroup}.
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
	public native Object getActiveTab()
	/*-{
		return this.activeTab;
	}-*/;

	public native void setActiveTab(Object value)
	/*-{
		this.activeTab = value;
	}-*/;

	/**
	 * @return Whether or not the user can configure the tab group via the
	 *         'more' tab's edit functionality. iphone/ipad only
	 * @platforms iphone, ipad
	 */
	public native boolean getAllowUserCustomization()
	/*-{
		return this.allowUserCustomization;
	}-*/;

	public native void setAllowUserCustomization(boolean value)
	/*-{
		this.allowUserCustomization = value;
	}-*/;

	/**
	 * @return The default navigation bar color (typically for the "more" tab)
	 */
	public native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return The title for the 'more' tab edit button. iphone/ipad only
	 * @platforms iphone, ipad
	 */
	public native String getEditButtonTitle()
	/*-{
		return this.editButtonTitle;
	}-*/;

	public native void setEditButtonTitle(String value)
	/*-{
		this.editButtonTitle = value;
	}-*/;

	/**
	 * @return Array of tab objects that are managed by the tab group
	 */
	public native Object[] getTabs()
	/*-{
		return this.tabs;
	}-*/;

	public native void setTabs(Object[] value)
	/*-{
		this.tabs = value;
	}-*/;

	/**
	 * @return One of ti.ui.android.soft_input_adjust_pan,
	 *         ti.ui.android.soft_input_adjust_resize, or
	 *         ti.ui.android.soft_input_adjust_unspecified. note: must be passed
	 *         in the creation options. (android only) [android doc:
	 *         window.setsoftinputmode
	 *         ](http://developer.android.com/reference/android
	 *         /view/window.html#setsoftinputmode(int))
	 * 
	 * @platforms android
	 */
	public native float getWindowSoftInputMode()
	/*-{
		return this.windowSoftInputMode;
	}-*/;

	public native void setWindowSoftInputMode(float value)
	/*-{
		this.windowSoftInputMode = value;
	}-*/;

	/**
	 * Add a tab to the tab group
	 */
	public native void addTab()
	/*-{
		return this.addTab();
	}-*/;

	/**
	 * Close the tab group and remove it from the ui
	 */
	public native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Open the tab group and make it visible
	 */
	public native void open()
	/*-{
		return this.open();
	}-*/;

	/**
	 * Remove a tab from the tab group
	 */
	public native void removeTab()
	/*-{
		return this.removeTab();
	}-*/;

	public native void addBlurHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addCloseHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('close', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addFocusHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addOpenHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('open', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
