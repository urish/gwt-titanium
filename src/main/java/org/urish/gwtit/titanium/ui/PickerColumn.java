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
 * The picker row object created by
 * [titanium.ui.createpickercolumn](titanium.ui.createpickercolumn).
 * 
 * @since 0.9
 */
public class PickerColumn extends org.urish.gwtit.titanium.ui.View {
	protected PickerColumn() {
	}

	/**
	 * @return Number of rows in the column
	 */
	public final native int getRowCount()
	/*-{
		return this.rowCount;
	}-*/;

	/**
	 * @return An array of rows
	 */
	public final native JavaScriptObject[] getRows()
	/*-{
		return this.rows;
	}-*/;

	public final native void setRows(JavaScriptObject[] value)
	/*-{
		this.rows = value;
	}-*/;

	/**
	 * Add a row to the column.
	 * 
	 * @param row
	 *            The row to add.
	 */
	public final native void addRow(org.urish.gwtit.titanium.ui.PickerRow row)
	/*-{
		return this.addRow(row);
	}-*/;

	/**
	 * Remove a row from the column.
	 * 
	 * @param row
	 *            The row to remove.
	 */
	public final native void removeRow(org.urish.gwtit.titanium.ui.PickerRow row)
	/*-{
		return this.removeRow(row);
	}-*/;

}
