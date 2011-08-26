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

import org.urish.gwtit.titanium.ui.events.DeleteHandler;
import org.urish.gwtit.titanium.ui.events.MoveHandler;
import org.urish.gwtit.titanium.ui.events.ScrollEndHandler;
import org.urish.gwtit.titanium.ui.events.ScrollHandler;

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
	public final native boolean getAllowsSelection()
	/*-{
		return this.allowsSelection;
	}-*/;

	public final native void setAllowsSelection(boolean value)
	/*-{
		this.allowsSelection = value;
	}-*/;

	/**
	 * @return True if the rows can be selected while editing the table (ios
	 *         only)
	 * @platforms iphone, ipad
	 */
	public final native boolean getAllowsSelectionDuringEditing()
	/*-{
		return this.allowsSelectionDuringEditing;
	}-*/;

	public final native void setAllowsSelectionDuringEditing(boolean value)
	/*-{
		this.allowsSelectionDuringEditing = value;
	}-*/;

	/**
	 * @return The data array of objects to be used for the rows of the table
	 *         view
	 */
	public final native JavaScriptObject[] getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(JavaScriptObject[] value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return Allow the table view to be editable (this must be true for
	 *         swipe-to-delete) (ios only)
	 * @platforms iphone, ipad
	 */
	public final native boolean getEditable()
	/*-{
		return this.editable;
	}-*/;

	public final native void setEditable(boolean value)
	/*-{
		this.editable = value;
	}-*/;

	/**
	 * @return Boolean to control the editing state of the table view (ios only)
	 * @platforms iphone, ipad
	 */
	public final native boolean getEditing()
	/*-{
		return this.editing;
	}-*/;

	public final native void setEditing(boolean value)
	/*-{
		this.editing = value;
	}-*/;

	/**
	 * @return The filter attribute to be used when searching. this property
	 *         maps to your data object or a property on the row object
	 */
	public final native String getFilterAttribute()
	/*-{
		return this.filterAttribute;
	}-*/;

	public final native void setFilterAttribute(String value)
	/*-{
		this.filterAttribute = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the search should be case sensitive or
	 *         case insensitive (default)
	 */
	public final native boolean getFilterCaseInsensitive()
	/*-{
		return this.filterCaseInsensitive;
	}-*/;

	public final native void setFilterCaseInsensitive(boolean value)
	/*-{
		this.filterCaseInsensitive = value;
	}-*/;

	/**
	 * @return The table view footer title
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
	 * @return The table view footer as a view that will be rendered instead of
	 *         a label
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
	 * @return The table view header title
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
	 * @return The table view header as a view that will be rendered instead of
	 *         a label
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
	 * @return An array of objects (with title and index properties) to control
	 *         the table view index
	 */
	public final native JavaScriptObject[] getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex(JavaScriptObject[] value)
	/*-{
		this.index = value;
	}-*/;

	/**
	 * @return Max row height for table view rows
	 */
	public final native float getMaxRowHeight()
	/*-{
		return this.maxRowHeight;
	}-*/;

	public final native void setMaxRowHeight(float value)
	/*-{
		this.maxRowHeight = value;
	}-*/;

	/**
	 * @return Min row height for table view rows
	 */
	public final native float getMinRowHeight()
	/*-{
		return this.minRowHeight;
	}-*/;

	public final native void setMinRowHeight(float value)
	/*-{
		this.minRowHeight = value;
	}-*/;

	/**
	 * @return Boolean to control the moveable state of the table view (ios
	 *         only)
	 * @platforms iphone, ipad
	 */
	public final native boolean getMoving()
	/*-{
		return this.moving;
	}-*/;

	public final native void setMoving(boolean value)
	/*-{
		this.moving = value;
	}-*/;

	/**
	 * @return Default row height for table view rows
	 */
	public final native float getRowHeight()
	/*-{
		return this.rowHeight;
	}-*/;

	public final native void setRowHeight(float value)
	/*-{
		this.rowHeight = value;
	}-*/;

	/**
	 * @return True (default) if tableview can be scrolled
	 */
	public final native boolean getScrollable()
	/*-{
		return this.scrollable;
	}-*/;

	public final native void setScrollable(boolean value)
	/*-{
		this.scrollable = value;
	}-*/;

	/**
	 * @return The search field to use for the table view
	 */
	public final native JavaScriptObject getSearch()
	/*-{
		return this.search;
	}-*/;

	public final native void setSearch(JavaScriptObject value)
	/*-{
		this.search = value;
	}-*/;

	/**
	 * @return Boolean to control the visibility of the search field
	 */
	public final native boolean getSearchHidden()
	/*-{
		return this.searchHidden;
	}-*/;

	public final native void setSearchHidden(boolean value)
	/*-{
		this.searchHidden = value;
	}-*/;

	/**
	 * @return The separator color color as a hex or named value
	 */
	public final native String getSeparatorColor()
	/*-{
		return this.separatorColor;
	}-*/;

	public final native void setSeparatorColor(String value)
	/*-{
		this.separatorColor = value;
	}-*/;

	/**
	 * @return The separator style constant. for iphone,
	 *         titanium.ui.iphone.tableviewseparatorstyle
	 * @platforms iphone, ipad
	 */
	public final native int getSeparatorStyle()
	/*-{
		return this.separatorStyle;
	}-*/;

	public final native void setSeparatorStyle(int value)
	/*-{
		this.separatorStyle = value;
	}-*/;

	/**
	 * @return Whether tableview displays vertical scroll indicator (ios only)
	 * @platforms iphone, ipad
	 */
	public final native boolean getShowVerticalScrollIndicator()
	/*-{
		return this.showVerticalScrollIndicator;
	}-*/;

	public final native void setShowVerticalScrollIndicator(boolean value)
	/*-{
		this.showVerticalScrollIndicator = value;
	}-*/;

	/**
	 * @return Iphone only. the style of the table view. constant from
	 *         {@link org.urish.gwtit.titanium.ui.iphone.tableviewstyle}
	 * @platforms iphone, ipad
	 */
	public final native int getStyle()
	/*-{
		return this.style;
	}-*/;

	public final native void setStyle(int value)
	/*-{
		this.style = value;
	}-*/;

	/**
	 * Append a row to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 */
	public final native void appendRow(org.urish.gwtit.titanium.ui.TableViewRow row)
	/*-{
		return this.appendRow(row);
	}-*/;

	/**
	 * Append a row to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param properties
	 *            animation properties
	 */
	public final native void appendRow(org.urish.gwtit.titanium.ui.TableViewRow row, JavaScriptObject properties)
	/*-{
		return this.appendRow(row, properties);
	}-*/;

	/**
	 * Delete an existing row, optionally with animation
	 * 
	 * @param row
	 *            index of row to delete
	 */
	public final native void deleteRow(int row)
	/*-{
		return this.deleteRow(row);
	}-*/;

	/**
	 * Delete an existing row, optionally with animation
	 * 
	 * @param row
	 *            index of row to delete
	 * @param properties
	 *            animation properties
	 */
	public final native void deleteRow(int row, JavaScriptObject properties)
	/*-{
		return this.deleteRow(row, properties);
	}-*/;

	/**
	 * Programmatically deselect a row
	 * 
	 * @param row
	 *            row index to deselect
	 */
	public final native void deselectRow(int row)
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
	 */
	public final native void insertRowAfter(int index, org.urish.gwtit.titanium.ui.TableViewRow row)
	/*-{
		return this.insertRowAfter(index, row);
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
	public final native void insertRowAfter(int index, org.urish.gwtit.titanium.ui.TableViewRow row,
			JavaScriptObject properties)
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
	 */
	public final native void insertRowBefore(int index, org.urish.gwtit.titanium.ui.TableViewRow row)
	/*-{
		return this.insertRowBefore(index, row);
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
	public final native void insertRowBefore(int index, org.urish.gwtit.titanium.ui.TableViewRow row,
			JavaScriptObject properties)
	/*-{
		return this.insertRowBefore(index, row, properties);
	}-*/;

	/**
	 * Scroll to a specific row index and ensure that that row is on screen
	 * 
	 * @param index
	 *            index
	 */
	public final native void scrollToIndex(int index)
	/*-{
		return this.scrollToIndex(index);
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
	public final native void scrollToIndex(int index, JavaScriptObject properties)
	/*-{
		return this.scrollToIndex(index, properties);
	}-*/;

	/**
	 * Scroll the table to a specific top position where 0 is the topmost y
	 * position in the table view
	 * 
	 * @param top
	 *            y position
	 */
	public final native void scrollToTop(float top)
	/*-{
		return this.scrollToTop(top);
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
	public final native void scrollToTop(float top, JavaScriptObject properties)
	/*-{
		return this.scrollToTop(top, properties);
	}-*/;

	/**
	 * Programmatically select a row
	 * 
	 * @param row
	 *            row index to select
	 */
	public final native void selectRow(int row)
	/*-{
		return this.selectRow(row);
	}-*/;

	/**
	 * Update an existing row, optionally with animation
	 * 
	 * @param row
	 *            row data to update
	 */
	public final native void updateRow(org.urish.gwtit.titanium.ui.TableViewRow row)
	/*-{
		return this.updateRow(row);
	}-*/;

	/**
	 * Update an existing row, optionally with animation
	 * 
	 * @param row
	 *            row data to update
	 * @param properties
	 *            animation properties
	 */
	public final native void updateRow(org.urish.gwtit.titanium.ui.TableViewRow row, JavaScriptObject properties)
	/*-{
		return this.updateRow(row, properties);
	}-*/;

	public final native void addDeleteHandler(DeleteHandler handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DeleteHandler::onDelete(Lorg/urish/gwtit/titanium/ui/events/DeleteEvent;)(e); } );
	}-*/;

	public final native void addMoveHandler(MoveHandler handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.titanium.ui.events.MoveHandler::onMove(Lorg/urish/gwtit/titanium/ui/events/MoveEvent;)(e); } );
	}-*/;

	public final native void addScrollHandler(ScrollHandler handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ScrollHandler::onScroll(Lorg/urish/gwtit/titanium/ui/events/ScrollEvent;)(e); } );
	}-*/;

	public final native void addScrollEndHandler(ScrollEndHandler handler)
	/*-{
		return this.addEventListener('scrollEnd', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ScrollEndHandler::onScrollEnd(Lorg/urish/gwtit/titanium/ui/events/ScrollEndEvent;)(e); } );
	}-*/;

}
