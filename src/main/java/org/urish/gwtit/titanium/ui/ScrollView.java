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

import org.urish.gwtit.titanium.ui.events.DragEndHandler;
import org.urish.gwtit.titanium.ui.events.DragStartHandler;
import org.urish.gwtit.titanium.ui.events.ScaleHandler;
import org.urish.gwtit.titanium.ui.events.ScrollViewScrollHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Scroll View is used to create a scrollable region of content. Views added
 * to the Scroll View will be scrolled based on the content size of the Scroll
 * View. The Scroll View is created by the method
 * {@link org.urish.gwtit.titanium.ui.createScrollView}. Note: In Android,
 * Scroll Views can only scroll in one direction, either vertical or horizontal,
 * but not both at the same time. See the
 * {@link org.urish.gwtit.titanium.ui.scrollview.scrollType} property
 * 
 * <p>
 * Notes: If your scrollable region fits within the size of the content area the
 * scroll view will not scroll.
 * 
 * Android Note**: Android ScrollViews can only scroll in one direction,
 * vertical or horizontal. We provide the `scrollType` property so you can
 * explicitly set the scroll direction. If that property is *not* set, we
 * attempt to deduce the scroll direction based on some of the other properties
 * that have been set. Specifically, if `contentWidth` and `width` are both set
 * and are equal to each other, or if they are both set *and*
 * `showVerticalScrollIndicator` is set to `true`, then the scroll direction is
 * set to "vertical". If `contentHeight` and `height` are both set and are
 * equal, or if they are both set and `showHorizontalScrollIndicator` is set to
 * `true`, then the scroll direction is set to "horizontal". If `scrollType` is
 * set, it overrides the deduced setting.
 * 
 * @since 0.9
 */
public class ScrollView extends org.urish.gwtit.titanium.ui.View {
	protected ScrollView() {
	}

	/**
	 * @return Boolean to indicate if the scroll view can cancel subview touches
	 *         in order to scroll instead. Default of true
	 * @platforms iphone, ipad
	 */
	public final native boolean getCanCancelEvents()
	/*-{
		return this.canCancelEvents;
	}-*/;

	public final native void setCanCancelEvents(boolean value)
	/*-{
		this.canCancelEvents = value;
	}-*/;

	/**
	 * @return The height of the scrollable area
	 */
	public final native float getContentHeight()
	/*-{
		return this.contentHeight;
	}-*/;

	public final native void setContentHeight(float value)
	/*-{
		this.contentHeight = value;
	}-*/;

	/**
	 * @return An object (with x and y properties) to indicate the offset of the
	 *         content area
	 */
	public final native JavaScriptObject getContentOffset()
	/*-{
		return this.contentOffset;
	}-*/;

	public final native void setContentOffset(JavaScriptObject value)
	/*-{
		this.contentOffset = value;
	}-*/;

	/**
	 * @return The width of the scrollable area
	 */
	public final native float getContentWidth()
	/*-{
		return this.contentWidth;
	}-*/;

	public final native void setContentWidth(float value)
	/*-{
		this.contentWidth = value;
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
	 * @return Boolean to control the horizontal bounce during scrolling
	 * @platforms iphone, ipad
	 */
	public final native boolean getHorizontalBounce()
	/*-{
		return this.horizontalBounce;
	}-*/;

	public final native void setHorizontalBounce(boolean value)
	/*-{
		this.horizontalBounce = value;
	}-*/;

	/**
	 * @return The maximum scale of the content
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
	 * @return The minimum scale of the content
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
	 * @return For explicitly setting the direction -- "vertical" or
	 *         "horizontal" -- in which the ScrollView will scroll. See also the
	 *         documentation notes for more information concerning how Android
	 *         deduces the scroll direction when this property is *not* set.
	 * 
	 * @platforms android
	 */
	public final native String getScrollType()
	/*-{
		return this.scrollType;
	}-*/;

	public final native void setScrollType(String value)
	/*-{
		this.scrollType = value;
	}-*/;

	/**
	 * @return Boolean to indicate whether the horizontal scroll indicator is
	 *         visible
	 */
	public final native boolean getShowHorizontalScrollIndicator()
	/*-{
		return this.showHorizontalScrollIndicator;
	}-*/;

	public final native void setShowHorizontalScrollIndicator(boolean value)
	/*-{
		this.showHorizontalScrollIndicator = value;
	}-*/;

	/**
	 * @return Boolean to indicate whether the vertical scroll indicator is
	 *         visible
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
	 * @return Boolean to control the vertical bounce during scrolling
	 * @platforms iphone, ipad
	 */
	public final native boolean getVerticalBounce()
	/*-{
		return this.verticalBounce;
	}-*/;

	public final native void setVerticalBounce(boolean value)
	/*-{
		this.verticalBounce = value;
	}-*/;

	/**
	 * @return Set the zoom scale for the current content area
	 * @platforms iphone, ipad
	 */
	public final native float getZoomScale()
	/*-{
		return this.zoomScale;
	}-*/;

	public final native void setZoomScale(float value)
	/*-{
		this.zoomScale = value;
	}-*/;

	/**
	 * ScrollTo a particular point
	 * 
	 * @param x
	 *            the x point within the view
	 * @param y
	 *            the y point within the view
	 */
	public final native void scrollTo(float x, float y)
	/*-{
		return this.scrollTo(x, y);
	}-*/;

	public final native void addScaleHandler(ScaleHandler handler)
	/*-{
		return this.addEventListener('scale', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ScaleHandler::onScale(Lorg/urish/gwtit/titanium/ui/events/ScaleEvent;)(e); } );
	}-*/;

	public final native void addScrollHandler(ScrollViewScrollHandler handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ScrollViewScrollHandler::onScrollViewScroll(Lorg/urish/gwtit/titanium/ui/events/ScrollViewScrollEvent;)(e); } );
	}-*/;

	public final native void addDragStartHandler(DragStartHandler handler)
	/*-{
		return this.addEventListener('dragStart', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DragStartHandler::onDragStart(Lorg/urish/gwtit/titanium/ui/events/DragStartEvent;)(e); } );
	}-*/;

	public final native void addDragEndHandler(DragEndHandler handler)
	/*-{
		return this.addEventListener('dragEnd', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DragEndHandler::onDragEnd(Lorg/urish/gwtit/titanium/ui/events/DragEndEvent;)(e); } );
	}-*/;

}
