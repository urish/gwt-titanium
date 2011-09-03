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
 * A tableview section object created by the method
 * {@link org.urish.gwtit.titanium.ui.createtableviewsection}.
 * 
 * @since 0.9
 */
public class TableViewSection extends org.urish.gwtit.titanium.ui.View {
	protected TableViewSection() {
	}

	/**
	 * @return The title of the section footer
	 */
	public final native String getFooterTitle()
	/*-{
		return this.footerTitle;
	}-*/;

	public final native void setFooterTitle(String value)
	/*-{
		this.footerTitle = value;
	}-*/;

	/**
	 * @return A view to use instead of the default label when rendering the
	 *         section footer
	 */
	public final native JavaScriptObject getFooterView()
	/*-{
		return this.footerView;
	}-*/;

	public final native void setFooterView(JavaScriptObject value)
	/*-{
		this.footerView = value;
	}-*/;

	/**
	 * @return The title of the section header
	 */
	public final native String getHeaderTitle()
	/*-{
		return this.headerTitle;
	}-*/;

	public final native void setHeaderTitle(String value)
	/*-{
		this.headerTitle = value;
	}-*/;

	/**
	 * @return A view to use instead of the default label when rendering the
	 *         section header
	 */
	public final native JavaScriptObject getHeaderView()
	/*-{
		return this.headerView;
	}-*/;

	public final native void setHeaderView(JavaScriptObject value)
	/*-{
		this.headerView = value;
	}-*/;

	/**
	 * @return The number of rows in the section
	 */
	public final native int getRowCount()
	/*-{
		return this.rowCount;
	}-*/;

}
