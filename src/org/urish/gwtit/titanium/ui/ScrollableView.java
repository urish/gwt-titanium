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
 * The scrollable view provides a view that supports horizontal scrolling on one
 * or more views in a gesture motion. the scrollable view also optionally
 * supports a visual paging control to indicate the page that the view is
 * visible. the scrollable view is created by the method
 * {@link org.urish.gwtit.titanium.ui.createscrollableview}.
 * 
 * @since 0.8
 */
public class ScrollableView extends org.urish.gwtit.titanium.ui.View {
	protected ScrollableView() {
	}

	/**
	 * @return The number of views to cache (prerender). views are rendered in
	 *         the range (currentpage +/- (cachesize - 1)/2), rounded down for
	 *         even values (i.e. cachesize=4 renders 3 views into the cache).
	 *         keep in mind that improved performance (larger cache) will lead
	 *         to faster performance, but more memory usage. ios only.
	 */
	public final native float getCacheSize()
	/*-{
		return this.cacheSize;
	}-*/;

	public final native void setCacheSize(float value)
	/*-{
		this.cacheSize = value;
	}-*/;

	/**
	 * @return The current page visible in the view
	 */
	public final native float getCurrentPage()
	/*-{
		return this.currentPage;
	}-*/;

	public final native void setCurrentPage(float value)
	/*-{
		this.currentPage = value;
	}-*/;

	/**
	 * @return Disable view bouncing. ios only.
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
	 * @return The maximum zoom scale for the view
	 * @platforms iphone, ipad
	 */
	public final native float getMaxZoomScale()
	/*-{
		return this.maxZoomScale;
	}-*/;

	public final native void setMaxZoomScale(float value)
	/*-{
		this.maxZoomScale = value;
	}-*/;

	/**
	 * @return The minimum zoom scale for the view
	 * @platforms iphone, ipad
	 */
	public final native float getMinZoomScale()
	/*-{
		return this.minZoomScale;
	}-*/;

	public final native void setMinZoomScale(float value)
	/*-{
		this.minZoomScale = value;
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
	 * @return Boolean to indicate whether the paging control ui is visible
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
	 * @return Array of view objects to place in the view
	 */
	public final native Object[] getViews()
	/*-{
		return this.views;
	}-*/;

	public final native void setViews(Object[] value)
	/*-{
		this.views = value;
	}-*/;

	/**
	 * Add a new view to the scrollable view
	 * 
	 * @param view
	 *            the view to add
	 */
	public final native void addView(Object view)
	/*-{
		return this.addView(view);
	}-*/;

	/**
	 * Remove an existing view from the scrollable view
	 * 
	 * @param view
	 *            the view to remove
	 */
	public final native void removeView(Object view)
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

	public final native void addScrollHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
