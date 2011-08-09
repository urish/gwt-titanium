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
 * A scroll view is used to create a scrollable region of content. views added
 * to the scroll view will be scrolled based on the content size of the scroll
 * view. the scroll view is created by the method
 * {@link org.urish.gwtit.titanium.ui.createscrollview}. note: in android,
 * scroll views can only scroll in one direction, either vertical or horizontal,
 * but not both at the same time. see the
 * {@link org.urish.gwtit.titanium.ui.scrollview.scrolltype} property
 * 
 * <p>
 * Notes: If your scrollable region fits within the size of the content area the
 * scroll view will not scroll.
 * 
 * @since 0.9
 */
public class ScrollView extends org.urish.gwtit.titanium.ui.View {
	protected ScrollView() {
	}

	/**
	 * @return (iphone only) boolean to indicate if the scroll view can cancel
	 *         subview touches in order to scroll instead. default of true
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
	public final native Object getContentOffset()
	/*-{
		return this.contentOffset;
	}-*/;

	public final native void setContentOffset(Object value)
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
	 * @return (android only) the type of scrollview: "vertical" or "horizontal"
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
	 * Scrollto a particular point
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

	public final static class ScaleEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "scale";

		protected ScaleEvent() {
		}

		/**
		 * the new scale as a float
		 */
		public final native Object getScale()
		/*-{
			return this.scale;
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

	}

	public interface ScaleHandler {
		public void onScale(ScaleEvent event);
	}

	public final native void addScaleHandler(ScaleHandler handler)
	/*-{
		return this.addEventListener('scale', function(e) { handler.@org.urish.gwtit.titanium.ui.ScrollView.ScaleHandler::onScale(Lorg/urish/gwtit/titanium/ui/ScrollView/ScaleEvent;)(e); } );
	}-*/;

	public final static class ScrollEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "scroll";

		protected ScrollEvent() {
		}

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
		 * boolean to indicate if the scroll is based on a dragging gesture
		 */
		public final native Object getDragging()
		/*-{
			return this.dragging;
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
		 * boolean to indicate if the scroll is decelerating
		 */
		public final native Object getDecelerating()
		/*-{
			return this.decelerating;
		}-*/;

	}

	public interface ScrollHandler {
		public void onScroll(ScrollEvent event);
	}

	public final native void addScrollHandler(ScrollHandler handler)
	/*-{
		return this.addEventListener('scroll', function(e) { handler.@org.urish.gwtit.titanium.ui.ScrollView.ScrollHandler::onScroll(Lorg/urish/gwtit/titanium/ui/ScrollView/ScrollEvent;)(e); } );
	}-*/;

}
