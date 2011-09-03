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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Database instance returned by
 * {@link org.urish.gwtit.titanium.database.open} or
 * {@link org.urish.gwtit.titanium.database.install}.
 * 
 * @since 0.1
 */
public class DB extends org.urish.gwtit.titanium.Proxy {
	protected DB() {
	}

	/**
	 * @return The last row identifier by the last INSERT query
	 */
	public final native int getLastInsertRowId()
	/*-{
		return this.lastInsertRowId;
	}-*/;

	public final native void setLastInsertRowId(int value)
	/*-{
		this.lastInsertRowId = value;
	}-*/;

	/**
	 * @return The name of the database
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native void setName(String value)
	/*-{
		this.name = value;
	}-*/;

	/**
	 * @return The number of rows affected by the last query
	 */
	public final native int getRowsAffected()
	/*-{
		return this.rowsAffected;
	}-*/;

	public final native void setRowsAffected(int value)
	/*-{
		this.rowsAffected = value;
	}-*/;

	/**
	 * Close the database and release resources from memory. once closed, this
	 * instance is no longer valid and must no longer be used.
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Execute a SQL statement against the database and returns a ResultSet
	 * 
	 * @param sql
	 *            the SQL to execute
	 */
	public final native JavaScriptObject execute(String sql)
	/*-{
		return this.execute(sql);
	}-*/;

	/**
	 * Execute a SQL statement against the database and returns a ResultSet
	 * 
	 * @param sql
	 *            the SQL to execute
	 * @param vararg
	 *            one or more optional variable arguments passed to this
	 *            function or an array of objects to be replaced in the query
	 *            using `?` substitution.
	 */
	public final native JavaScriptObject execute(String sql, JavaScriptObject[] vararg)
	/*-{
		return this.execute(sql, vararg);
	}-*/;

	/**
	 * Remove the database files for this instance from disk. WARNING: this is a
	 * destructive operation and cannot be reversed. All data in the database
	 * will be lost upon calling this function. Use with caution.
	 */
	public final native void remove()
	/*-{
		return this.remove();
	}-*/;

}
