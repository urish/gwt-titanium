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
 * The database instance returned by
 * {@link org.urish.gwtit.titanium.database.open} or
 * {@link org.urish.gwtit.titanium.database.install}.
 * 
 * @since 0.1
 */
public class DB extends org.urish.gwtit.titanium.Proxy {
	protected DB() {
	}

	/**
	 * @return The last row identifier by the last insert query
	 */
	public native float getLastInsertRowId()
	/*-{
		return this.lastInsertRowId;
	}-*/;

	public native void setLastInsertRowId(float value)
	/*-{
		this.lastInsertRowId = value;
	}-*/;

	/**
	 * @return The name of the database
	 */
	public native String getName()
	/*-{
		return this.name;
	}-*/;

	public native void setName(String value)
	/*-{
		this.name = value;
	}-*/;

	/**
	 * @return The number of rows affected by the last query
	 */
	public native float getRowsAffected()
	/*-{
		return this.rowsAffected;
	}-*/;

	public native void setRowsAffected(float value)
	/*-{
		this.rowsAffected = value;
	}-*/;

	/**
	 * Close the database and release resources from memory. once closed, this
	 * instance is no longer valid and must no longer be used.
	 */
	public native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Execute a sql statement against the database and returns a resultset
	 * 
	 * @param sql
	 *            the SQL to execute
	 * @param vararg
	 *            one or more optional variable arguments passed to this
	 *            function or an array of objects to be replaced in the query
	 *            using `?` substitution.
	 */
	public native Object execute(String sql)
	/*-{
		return this.execute(sql);
	}-*/;

	/**
	 * Execute a sql statement against the database and returns a resultset
	 * 
	 * @param sql
	 *            the SQL to execute
	 * @param vararg
	 *            one or more optional variable arguments passed to this
	 *            function or an array of objects to be replaced in the query
	 *            using `?` substitution.
	 */
	public native Object execute(String sql, Object[] vararg)
	/*-{
		return this.execute(sql, vararg);
	}-*/;

	/**
	 * Remove the database files for this instance from disk. warning: this is a
	 * destructive operation and cannot be reversed. all data in the database
	 * will be lost upon calling this function. use with caution.
	 */
	public native void remove()
	/*-{
		return this.remove();
	}-*/;

}
