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


/**
 * The titanium binding of an [android
 * menu](http://developer.android.com/reference/android/view/menu.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Menu extends org.urish.gwtit.titanium.Proxy {
	protected Menu() {
	}

	/**
	 * @return Array of {@link org.urish.gwtit.titanium.android.menuitem}
	 */
	public final native Object[] getItems()
	/*-{
		return this.items;
	}-*/;

	public final native void setItems(Object[] value)
	/*-{
		this.items = value;
	}-*/;

	/**
	 * Creates a {@link org.urish.gwtit.titanium.android.menuitem} from the
	 * passed creation options.
	 * 
	 * @param options
	 *            creation options. Supported options are itemId, groupId,
	 *            title, and order.
	 */
	public final native org.urish.gwtit.titanium.android.MenuItem add(Object options)
	/*-{
		return this.add(options);
	}-*/;

	/**
	 * Clear all items from the menu. you should release all references you have
	 * retained to {@link org.urish.gwtit.titanium.android.menuitem} previously
	 * created.
	 */
	public final native void clear()
	/*-{
		return this.clear();
	}-*/;

	/**
	 * Close the menu if visible
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Locate a {@link org.urish.gwtit.titanium.android.menuitem}
	 * 
	 * @param item
	 *            integer itemId or
	 *            {@link org.urish.gwtit.titanium.android.MenuItem}
	 */
	public final native org.urish.gwtit.titanium.android.MenuItem findItem(Object item)
	/*-{
		return this.findItem(item);
	}-*/;

	/**
	 * Return the {@link org.urish.gwtit.titanium.android.menuitem} at a
	 * specific index
	 * 
	 * @param index
	 *            item at index where index < size()
	 */
	public final native org.urish.gwtit.titanium.android.MenuItem getItem(float index)
	/*-{
		return this.getItem(index);
	}-*/;

	/**
	 * Query for any visible menu items
	 */
	public final native boolean hasVisibleItems()
	/*-{
		return this.hasVisibleItems();
	}-*/;

	/**
	 * Remove all {@link org.urish.gwtit.titanium.android.menuitem} with the
	 * specified groupid
	 * 
	 * @param groupId
	 *            groupId of items to remove.
	 */
	public final native void removeGroup(float groupId)
	/*-{
		return this.removeGroup(groupId);
	}-*/;

	/**
	 * Remove a specific {@link org.urish.gwtit.titanium.android.menuitem} by
	 * the specified itemid
	 * 
	 * @param itemId
	 *            itemId of item to remove.
	 */
	public final native void removeItem(float itemId)
	/*-{
		return this.removeItem(itemId);
	}-*/;

	/**
	 * Enable or disable a group of
	 * {@link org.urish.gwtit.titanium.android.menuitem} by groupid
	 * 
	 * @param groupId
	 *            groupId to enable or disable
	 * @param enabled
	 *            true to enable, false to disable.
	 */
	public final native void setGroupEnabled(float groupId, boolean enabled)
	/*-{
		return this.setGroupEnabled(groupId, enabled);
	}-*/;

	/**
	 * Show or hide a group of {@link org.urish.gwtit.titanium.android.menuitem}
	 * by groupid
	 * 
	 * @param groupId
	 *            groupId to enable or disable
	 * @param visible
	 *            true to show, false to hide
	 */
	public final native void setGroupVisible(float groupId, boolean visible)
	/*-{
		return this.setGroupVisible(groupId, visible);
	}-*/;

	/**
	 * Number of {@link org.urish.gwtit.titanium.android.menuitem} in this menu
	 */
	public final native float size()
	/*-{
		return this.size();
	}-*/;

}
