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
 * A table view allows you to create a scrollable table of content in a
 * list-based fashion. the table view is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtableview}.
 * 
 * @since 0.8
 */
public class TableView extends org.urish.gwtit.titanium.ui.View {
	protected TableView() {
	}

	/**
	 * @return True if the rows can be selected
	 */
	public native boolean getAllowsSelection()
	/*-{
		return this.allowsSelection;
	}-*/;

	public native void setAllowsSelection(boolean value)
	/*-{
		this.allowsSelection = value;
	}-*/;

	/**
	 * @return True if the rows can be selected while editing the table (ios
	 *         only)
	 * @platforms iphone, ipad
	 */
	public native boolean getAllowsSelectionDuringEditing()
	/*-{
		return this.allowsSelectionDuringEditing;
	}-*/;

	public native void setAllowsSelectionDuringEditing(boolean value)
	/*-{
		this.allowsSelectionDuringEditing = value;
	}-*/;

	/**
	 * @return The data array of objects to be used for the rows of the table
	 *         view
	 */
	public native Object[] getData()
	/*-{
		return this.data;
	}-*/;

	public native void setData(Object[] value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return Allow the table view to be editable (this must be true for
	 *         swipe-to-delete) (ios only)
	 * @platforms iphone, ipad
	 */
	public native boolean getEditable()
	/*-{
		return this.editable;
	}-*/;

	public native void setEditable(boolean value)
	/*-{
		this.editable = value;
	}-*/;

	/**
	 * @return Boolean to control the editing state of the table view (ios only)
	 * @platforms iphone, ipad
	 */
	public native boolean getEditing()
	/*-{
		return this.editing;
	}-*/;

	public native void setEditing(boolean value)
	/*-{
		this.editing = value;
	}-*/;

	/**
	 * @return The filter attribute to be used when searching. this property
	 *         maps to your data object or a property on the row object
	 */
	public native String getFilterAttribute()
	/*-{
		return this.filterAttribute;
	}-*/;

	public native void setFilterAttribute(String value)
	/*-{
		this.filterAttribute = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the search should be case sensitive or
	 *         case insensitive (default)
	 */
	public native boolean getFilterCaseInsensitive()
	/*-{
		return this.filterCaseInsensitive;
	}-*/;

	public native void setFilterCaseInsensitive(boolean value)
	/*-{
		this.filterCaseInsensitive = value;
	}-*/;

	/**
	 * @return The table view footer title
	 */
	public native String getFooterTitle()
	/*-{
		return this.footerTitle;
	}-*/;

	public native void setFooterTitle(String value)
	/*-{
		this.footerTitle = value;
	}-*/;

	/**
	 * @return The table view footer as a view that will be rendered instead of
	 *         a label
	 */
	public native Object getFooterView()
	/*-{
		return this.footerView;
	}-*/;

	public native void setFooterView(Object value)
	/*-{
		this.footerView = value;
	}-*/;

	/**
	 * @return The table view header title
	 */
	public native String getHeaderTitle()
	/*-{
		return this.headerTitle;
	}-*/;

	public native void setHeaderTitle(String value)
	/*-{
		this.headerTitle = value;
	}-*/;

	/**
	 * @return The table view header as a view that will be rendered instead of
	 *         a label
	 */
	public native Object getHeaderView()
	/*-{
		return this.headerView;
	}-*/;

	public native void setHeaderView(Object value)
	/*-{
		this.headerView = value;
	}-*/;

	/**
	 * @return An array of objects (with title and index properties) to control
	 *         the table view index
	 */
	public native Object[] getIndex()
	/*-{
		return this.index;
	}-*/;

	public native void setIndex(Object[] value)
	/*-{
		this.index = value;
	}-*/;

	/**
	 * @return Max row height for table view rows
	 */
	public native float getMaxRowHeight()
	/*-{
		return this.maxRowHeight;
	}-*/;

	public native void setMaxRowHeight(float value)
	/*-{
		this.maxRowHeight = value;
	}-*/;

	/**
	 * @return Min row height for table view rows
	 */
	public native float getMinRowHeight()
	/*-{
		return this.minRowHeight;
	}-*/;

	public native void setMinRowHeight(float value)
	/*-{
		this.minRowHeight = value;
	}-*/;

	/**
	 * @return Boolean to control the moveable state of the table view (ios
	 *         only)
	 * @platforms iphone, ipad
	 */
	public native boolean getMoving()
	/*-{
		return this.moving;
	}-*/;

	public native void setMoving(boolean value)
	/*-{
		this.moving = value;
	}-*/;

	/**
	 * @return Default row height for table view rows
	 */
	public native float getRowHeight()
	/*-{
		return this.rowHeight;
	}-*/;

	public native void setRowHeight(float value)
	/*-{
		this.rowHeight = value;
	}-*/;

	/**
	 * @return True (default) if tableview can be scrolled
	 */
	public native boolean getScrollable()
	/*-{
		return this.scrollable;
	}-*/;

	public native void setScrollable(boolean value)
	/*-{
		this.scrollable = value;
	}-*/;

	/**
	 * @return The search field to use for the table view
	 */
	public native Object getSearch()
	/*-{
		return this.search;
	}-*/;

	public native void setSearch(Object value)
	/*-{
		this.search = value;
	}-*/;

	/**
	 * @return Boolean to control the visibility of the search field
	 */
	public native boolean getSearchHidden()
	/*-{
		return this.searchHidden;
	}-*/;

	public native void setSearchHidden(boolean value)
	/*-{
		this.searchHidden = value;
	}-*/;

	/**
	 * @return The separator color color as a hex or named value
	 */
	public native String getSeparatorColor()
	/*-{
		return this.separatorColor;
	}-*/;

	public native void setSeparatorColor(String value)
	/*-{
		this.separatorColor = value;
	}-*/;

	/**
	 * @return The separator style constant. for iphone,
	 *         titanium.ui.iphone.tableviewseparatorstyle
	 */
	public native float getSeparatorStyle()
	/*-{
		return this.separatorStyle;
	}-*/;

	public native void setSeparatorStyle(float value)
	/*-{
		this.separatorStyle = value;
	}-*/;

	/**
	 * @return Whether tableview displays vertical scroll indicator (ios only)
	 * @platforms iphone, ipad
	 */
	public native boolean getShowVerticalScrollIndicator()
	/*-{
		return this.showVerticalScrollIndicator;
	}-*/;

	public native void setShowVerticalScrollIndicator(boolean value)
	/*-{
		this.showVerticalScrollIndicator = value;
	}-*/;

	/**
	 * @return Iphone only. the style of the table view. constant from
	 *         {@link org.urish.gwtit.titanium.ui.iphone.tableviewstyle}
	 * @platforms iphone, ipad
	 */
	public native float getStyle()
	/*-{
		return this.style;
	}-*/;

	public native void setStyle(float value)
	/*-{
		this.style = value;
	}-*/;

	/**
	 * Append a row to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param properties
	 *            animation properties
	 */
	public native void appendRow(Object row, Object properties)
	/*-{
		return this.appendRow(row, properties);
	}-*/;

	/**
	 * Delete an existing row, optionally with animation
	 * 
	 * @param row
	 *            index of row to delete
	 * @param properties
	 *            animation properties
	 */
	public native void deleteRow(float row, Object properties)
	/*-{
		return this.deleteRow(row, properties);
	}-*/;

	/**
	 * Programmatically deselect a row
	 * 
	 * @param row
	 *            row index to deselect
	 */
	public native void deselectRow(float row)
	/*-{
		return this.deselectRow(row);
	}-*/;

	/**
	 * Insert a row before another row, optionally with animation
	 * 
	 * @param index
	 *            index
	 * @param row
	 *            row to insert
	 * @param properties
	 *            animation properties
	 */
	public native void insertRowAfter(float index, Object row, Object properties)
	/*-{
		return this.insertRowAfter(index, row, properties);
	}-*/;

	/**
	 * Insert a row after another row, optionally with animation
	 * 
	 * @param index
	 *            index
	 * @param row
	 *            row to insert
	 * @param properties
	 *            animation properties
	 */
	public native void insertRowBefore(float index, Object row, Object properties)
	/*-{
		return this.insertRowBefore(index, row, properties);
	}-*/;

	/**
	 * Scroll to a specific row index and ensure that that row is on screen
	 * 
	 * @param index
	 *            index
	 * @param properties
	 *            animation properties. `position` property controls the
	 *            position constant to use for position (on iPhone, use
	 *            constants from Titanium.UI.iPhone.TableViewScrollPosition).
	 */
	public native void scrollToIndex(float index, Object properties)
	/*-{
		return this.scrollToIndex(index, properties);
	}-*/;

	/**
	 * Scroll the table to a specific top position where 0 is the topmost y
	 * position in the table view
	 * 
	 * @param top
	 *            y position
	 * @param properties
	 *            optional dictionary with the key `animated` (default, true) as
	 *            boolean to indicate if the scroll should be animated or
	 *            immediate
	 */
	public native void scrollToTop(float top, Object properties)
	/*-{
		return this.scrollToTop(top, properties);
	}-*/;

	/**
	 * Programmatically select a row
	 * 
	 * @param row
	 *            row index to select
	 */
	public native void selectRow(float row)
	/*-{
		return this.selectRow(row);
	}-*/;

	/**
	 * Update an existing row, optionally with animation
	 * 
	 * @param row
	 *            row data to update
	 * @param properties
	 *            animation properties
	 */
	public native void updateRow(Object row, Object properties)
	/*-{
		return this.updateRow(row, properties);
	}-*/;

	public native void addDeleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addMoveHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addScrollHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addScrollEndHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('scrollEnd', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
