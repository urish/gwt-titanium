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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class PickerChangeEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "change";

	protected PickerChangeEvent() {
	}

	/**
	 * the selected column index
	 */
	public final native int getColumnIndex()
	/*-{
		return this.columnIndex;
	}-*/;

	/**
	 * the selected row index
	 */
	public final native int getRowIndex()
	/*-{
		return this.rowIndex;
	}-*/;

	/**
	 * the column object
	 */
	public final native org.urish.gwtit.titanium.ui.PickerColumn getColumn()
	/*-{
		return this.column;
	}-*/;

	/**
	 * (date/time pickers only) the selected date/time value.
	 */
	public final native java.util.Date getValue()
	/*-{
		return this.value;
	}-*/;

	/**
	 * the row object
	 */
	public final native org.urish.gwtit.titanium.ui.PickerRow getRow()
	/*-{
		return this.row;
	}-*/;

	/**
	 * (plain picker only) the array of selected values, one element per column
	 * in the picker.
	 */
	public final native JavaScriptObject[] getSelectedValue()
	/*-{
		return this.selectedValue;
	}-*/;

}
