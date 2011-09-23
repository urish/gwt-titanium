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

import org.urish.gwtit.titanium.ui.events.ScrollableViewScrollHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Scrollable View provides a view that supports horizontal scrolling on one
 * or more views in a gesture motion. The Scrollable View also optionally
 * supports a visual paging control to indicate the page that the view is
 * visible. The Scrollable View is created by the method
 * {@link org.urish.gwtit.titanium.ui.createScrollableView}.
 * 
 * @since 0.8
 */
public class ScrollableView extends org.urish.gwtit.titanium.ui.View {
	protected ScrollableView() {
	}

	/**
	 * @return The number of views to cache (prerender). Views are rendered in
	 *         the range (currentPage +/- (cacheSize - 1)/2), ROUNDED DOWN for
	 *         even values (i.e. cacheSize=4 renders 3 views into the cache).
	 *         Keep in mind that improved performance (larger cache) will lead
	 *         to faster performance, but more memory usage.
	 * @platforms iphone, ipad
	 */
	public final native int getCacheSize()
	/*-{
		return this.cacheSize;
	}-*/;

	public final native void setCacheSize(int value)
	/*-{
		this.cacheSize = value;
	}-*/;

	/**
	 * @return The current page visible in the view
	 */
	public final native int getCurrentPage()
	/*-{
		return this.currentPage;
	}-*/;

	public final native void setCurrentPage(int value)
	/*-{
		this.currentPage = value;
	}-*/;

	/**
	 * @return Disable view bouncing.
	 * @platforms iphone, ipad
	 */
	public final native boolean getDisableBounce()
	/*-{
		return this.disableBounce;
	}-*/;

	public final native void setDisableBounce(boolean value)
	/*-{
		this.disableBounce = value;
	}-*/;

	/**
	 * @return The color of the paging control. defaults to black.
	 */
	public final native String getPagingControlColor()
	/*-{
		return this.pagingControlColor;
	}-*/;

	public final native void setPagingControlColor(String value)
	/*-{
		this.pagingControlColor = value;
	}-*/;

	/**
	 * @return The height in pixels of the paging control, if visible. defaults
	 *         to 20
	 */
	public final native float getPagingControlHeight()
	/*-{
		return this.pagingControlHeight;
	}-*/;

	public final native void setPagingControlHeight(float value)
	/*-{
		this.pagingControlHeight = value;
	}-*/;

	/**
	 * @return Boolean to indicate whether the paging control UI is visible
	 */
	public final native boolean getShowPagingControl()
	/*-{
		return this.showPagingControl;
	}-*/;

	public final native void setShowPagingControl(boolean value)
	/*-{
		this.showPagingControl = value;
	}-*/;

	/**
	 * @return Number of milliseconds to wait before hiding the paging control.
	 *         Less than or equal to 0 disables timeout keeping controls
	 *         displayed.
	 * @platforms android
	 */
	public final native float getPagingControlTimeout()
	/*-{
		return this.pagingControlTimeout;
	}-*/;

	public final native void setPagingControlTimeout(float value)
	/*-{
		this.pagingControlTimeout = value;
	}-*/;

	/**
	 * @return Array of view objects to place in the view
	 */
	public final native JavaScriptObject[] getViews()
	/*-{
		return this.views;
	}-*/;

	public final native void setViews(JavaScriptObject[] value)
	/*-{
		this.views = value;
	}-*/;

	/**
	 * Add a new view to the Scrollable View
	 * 
	 * @param view
	 *            the view to add
	 */
	public final native void addView(JavaScriptObject view)
	/*-{
		return this.addView(view);
	}-*/;

	/**
	 * Remove an existing view from the Scrollable View
	 * 
	 * @param view
	 *            the view to remove
	 */
	public final native void removeView(JavaScriptObject view)
	/*-{
		return this.removeView(view);
	}-*/;

	/**
	 * Scroll to a specific view
	 * 
	 * @param view
	 *            either an integer index or the view object to bring into view
	 *            as the currentPage
	 */
	public final native void scrollToView(Object view)
	/*-{
		return this.scrollToView(view);
	}-*/;

	public final native void addScrollHandler(ScrollableViewScrollHandler handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ScrollableViewScrollHandler::onScrollableViewScroll(Lorg/urish/gwtit/titanium/ui/events/ScrollableViewScrollEvent;)(e); } );
	}-*/;

}
