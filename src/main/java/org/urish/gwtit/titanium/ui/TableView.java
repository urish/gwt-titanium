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

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

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
	public final native Object[] getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(Object[] value)
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
	public final native Object getFooterView()
	/*-{
		return this.footerView;
	}-*/;

	public final native void setFooterView(Object value)
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
	public final native Object getHeaderView()
	/*-{
		return this.headerView;
	}-*/;

	public final native void setHeaderView(Object value)
	/*-{
		this.headerView = value;
	}-*/;

	/**
	 * @return An array of objects (with title and index properties) to control
	 *         the table view index
	 */
	public final native Object[] getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex(Object[] value)
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
	public final native Object getSearch()
	/*-{
		return this.search;
	}-*/;

	public final native void setSearch(Object value)
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
	 * @param properties
	 *            animation properties
	 */
	public final native void appendRow(Object row, Object properties)
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
	public final native void deleteRow(int row, Object properties)
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
	 * @param properties
	 *            animation properties
	 */
	public final native void insertRowAfter(int index, Object row, Object properties)
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
	public final native void insertRowBefore(int index, Object row, Object properties)
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
	public final native void scrollToIndex(int index, Object properties)
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
	public final native void scrollToTop(float top, Object properties)
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
	 * @param properties
	 *            animation properties
	 */
	public final native void updateRow(Object row, Object properties)
	/*-{
		return this.updateRow(row, properties);
	}-*/;

	public final static class DeleteEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "delete";

		protected DeleteEvent() {
		}

		/**
		 * table view row index
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
		}-*/;

		/**
		 * table view section object
		 */
		public final native Object getSection()
		/*-{
			return this.section;
		}-*/;

		/**
		 * boolean to indicate if the right area was clicked
		 */
		public final native Object getDetail()
		/*-{
			return this.detail;
		}-*/;

		/**
		 * boolean to indicate if the table is in search mode
		 */
		public final native Object getSearchMode()
		/*-{
			return this.searchMode;
		}-*/;

		/**
		 * table view row data object
		 */
		public final native Object getRowData()
		/*-{
			return this.rowData;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * table view row object
		 */
		public final native Object getRow()
		/*-{
			return this.row;
		}-*/;

	}

	public interface DeleteHandler {
		public void onDelete(DeleteEvent event);
	}

	public final native void addDeleteHandler(DeleteHandler handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.titanium.ui.TableView.DeleteHandler::onDelete(Lorg/urish/gwtit/titanium/ui/TableView/DeleteEvent;)(e); } );
	}-*/;

	public final static class MoveEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "move";

		protected MoveEvent() {
		}

		/**
		 * table view row index
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
		}-*/;

		/**
		 * table view section object
		 */
		public final native Object getSection()
		/*-{
			return this.section;
		}-*/;

		/**
		 * boolean to indicate if the right area was clicked
		 */
		public final native Object getDetail()
		/*-{
			return this.detail;
		}-*/;

		/**
		 * boolean to indicate if the table is in search mode
		 */
		public final native Object getSearchMode()
		/*-{
			return this.searchMode;
		}-*/;

		/**
		 * table view row data object
		 */
		public final native Object getRowData()
		/*-{
			return this.rowData;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * table view row object
		 */
		public final native Object getRow()
		/*-{
			return this.row;
		}-*/;

	}

	public interface MoveHandler {
		public void onMove(MoveEvent event);
	}

	public final native void addMoveHandler(MoveHandler handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.titanium.ui.TableView.MoveHandler::onMove(Lorg/urish/gwtit/titanium/ui/TableView/MoveEvent;)(e); } );
	}-*/;

	public final static class ScrollEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "scroll";

		protected ScrollEvent() {
		}

		/**
		 * the row index of the topmost visible row in the view (Android only)
		 */
		public final native Object getFirstVisibleItem()
		/*-{
			return this.firstVisibleItem;
		}-*/;

		/**
		 * the number of rows currently visible in the view (Android only)
		 */
		public final native Object getVisibleItemCount()
		/*-{
			return this.visibleItemCount;
		}-*/;

		/**
		 * dictionary with `x` and `y` properties containing the content offset
		 * (iOS only)
		 */
		public final native Object getContentOffset()
		/*-{
			return this.contentOffset;
		}-*/;

		/**
		 * the total number of rows in the view (Android only)
		 */
		public final native Object getTotalItemCount()
		/*-{
			return this.totalItemCount;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * dictionary with `width` and `height` properties containing the size
		 * of the content (regardless of the display size in the case of
		 * scrolling) (iOS only)
		 */
		public final native Object getContentSize()
		/*-{
			return this.contentSize;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * dictionary with `width` and `height` properties containing the size
		 * of the visible table view
		 */
		public final native Object getSize()
		/*-{
			return this.size;
		}-*/;

	}

	public interface ScrollHandler {
		public void onScroll(ScrollEvent event);
	}

	public final native void addScrollHandler(ScrollHandler handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.titanium.ui.TableView.ScrollHandler::onScroll(Lorg/urish/gwtit/titanium/ui/TableView/ScrollEvent;)(e); } );
	}-*/;

	public final static class ScrollEndEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "scrollEnd";

		protected ScrollEndEvent() {
		}

		/**
		 * dictionary with `x` and `y` properties containing the content offset
		 * (iOS only)
		 */
		public final native Object getContentOffset()
		/*-{
			return this.contentOffset;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * dictionary with `width` and `height` properties containing the size
		 * of the content (regardless of the display size in the case of
		 * scrolling) (iOS only)
		 */
		public final native Object getContentSize()
		/*-{
			return this.contentSize;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * dictionary with `width` and `height` properties containing the size
		 * of the visible table view
		 */
		public final native Object getSize()
		/*-{
			return this.size;
		}-*/;

	}

	public interface ScrollEndHandler {
		public void onScrollEnd(ScrollEndEvent event);
	}

	public final native void addScrollEndHandler(ScrollEndHandler handler)
	/*-{
		return this.addEventListener('scrollEnd', function(e) { handler.@org.urish.gwtit.titanium.ui.TableView.ScrollEndHandler::onScrollEnd(Lorg/urish/gwtit/titanium/ui/TableView/ScrollEndEvent;)(e); } );
	}-*/;

}
