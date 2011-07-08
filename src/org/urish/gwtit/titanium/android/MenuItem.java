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

package org.urish.gwtit.titanium.android;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The titanium binding of an [android
 * menuitem](http://developer.android.com/reference/android/view/menuitem.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class MenuItem extends org.urish.gwtit.titanium.Proxy {
	protected MenuItem() {
	}

	/**
	 * @return Set the enabled state of the item
	 */
	public native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return Groupid for this item (read-only)
	 */
	public native float getGroupId()
	/*-{
		return this.groupId;
	}-*/;

	public native void setGroupId(float value)
	/*-{
		this.groupId = value;
	}-*/;

	/**
	 * @return Itemid for this item (read-only)
	 */
	public native float getItemId()
	/*-{
		return this.itemId;
	}-*/;

	public native void setItemId(float value)
	/*-{
		this.itemId = value;
	}-*/;

	/**
	 * @return Integer used for controlling sort order (read-only)
	 */
	public native float getOrder()
	/*-{
		return this.order;
	}-*/;

	public native void setOrder(float value)
	/*-{
		this.order = value;
	}-*/;

	/**
	 * @return Item title
	 */
	public native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return Condensed item title
	 */
	public native String getTitleCondensed()
	/*-{
		return this.titleCondensed;
	}-*/;

	public native void setTitleCondensed(String value)
	/*-{
		this.titleCondensed = value;
	}-*/;

	/**
	 * @return Set the visible state of the item
	 */
	public native boolean getVisible()
	/*-{
		return this.visible;
	}-*/;

	public native void setVisible(boolean value)
	/*-{
		this.visible = value;
	}-*/;

	/**
	 * Retrieve the enabled state of the menu
	 */
	public native boolean isEnabled()
	/*-{
		return this.isEnabled();
	}-*/;

	/**
	 * Retrieve the visible state of the menu
	 */
	public native boolean isVisible()
	/*-{
		return this.isVisible();
	}-*/;

	/**
	 * Set the icon for the item
	 * 
	 * @param icon
	 *            icon to use with the item
	 */
	public native void setIcon(Object icon)
	/*-{
		return this.setIcon(icon);
	}-*/;

	public native void addClickHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}