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

package org.urish.gwtit.titanium.database;


/**
 * The ResultSet instance returned by invoking a database SQL `execute`.
 * 
 * @since 0.1
 */
public class ResultSet extends org.urish.gwtit.titanium.Proxy {
	protected ResultSet() {
	}

	/**
	 * @return The number of rows in the result set
	 */
	public final native int getRowCount()
	/*-{
		return this.rowCount;
	}-*/;

	public final native void setRowCount(int value)
	/*-{
		this.rowCount = value;
	}-*/;

	/**
	 * @return Returns true if the current row is still valid
	 */
	public final native boolean getValidRow()
	/*-{
		return this.validRow;
	}-*/;

	public final native void setValidRow(boolean value)
	/*-{
		this.validRow = value;
	}-*/;

	/**
	 * Close the result set and release resources. once closed, this result set
	 * must no longer be used
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Retrieve a row value by field index
	 * 
	 * @param index
	 *            column index (which is zero based)
	 */
	public final native Object field(int index)
	/*-{
		return this.field(index);
	}-*/;

	/**
	 * Retrieve a row value by field index
	 * 
	 * @param index
	 *            column index (which is zero based)
	 * @param type
	 *            One of (
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_STRING} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_INT} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_FLOAT} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_DOUBLE})
	 */
	public final native Object field(int index, int type)
	/*-{
		return this.field(index, type);
	}-*/;

	/**
	 * Retrieve a row value by field name
	 * 
	 * @param name
	 *            column name from SQL query
	 */
	public final native Object fieldByName(String name)
	/*-{
		return this.fieldByName(name);
	}-*/;

	/**
	 * Retrieve a row value by field name
	 * 
	 * @param name
	 *            column name from SQL query
	 * @param type
	 *            One of (
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_STRING} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_INT} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_FLOAT} |
	 *            {@link org.urish.gwtit.titanium.Database.FIELD_TYPE_DOUBLE})
	 */
	public final native Object fieldByName(String name, int type)
	/*-{
		return this.fieldByName(name, type);
	}-*/;

	/**
	 * Return the number of columns in the result set
	 */
	public final native int fieldCount()
	/*-{
		return this.fieldCount();
	}-*/;

	/**
	 * Return the field name for field index
	 * 
	 * @param index
	 *            field name column index (which is zero based)
	 */
	public final native String fieldName(int index)
	/*-{
		return this.fieldName(index);
	}-*/;

	/**
	 * Return true if the row is a valid row
	 */
	public final native boolean isValidRow()
	/*-{
		return this.isValidRow();
	}-*/;

	/**
	 * Iterate to the next row in the result set.
	 * 
	 * @return If the next operation goes past the final row, this returns
	 *         false. Else true.
	 */
	public final native boolean next()
	/*-{
		return this.next();
	}-*/;

}
