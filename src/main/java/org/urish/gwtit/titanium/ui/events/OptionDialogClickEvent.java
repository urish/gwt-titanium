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

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class OptionDialogClickEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "click";

	protected OptionDialogClickEvent() {
	}

	/**
	 * the button index that was pressed
	 */
	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	/**
	 * boolean to indicate that the index refers to a button on the dialog and
	 * not an item. (Android)
	 */
	public final native boolean getButton()
	/*-{
		return this.button;
	}-*/;

	/**
	 * the index of the cancel button
	 */
	public final native int getCancel()
	/*-{
		return this.cancel;
	}-*/;

	/**
	 * the index of the destructive button
	 */
	public final native int getDestructive()
	/*-{
		return this.destructive;
	}-*/;

}
