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

package org.urish.gwtit.titanium.ui.ipad;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A popover is used to manage the presentation of content in a popover. you use
 * popovers to present information temporarily but in a way that does not take
 * over the entire screen like a modal view does. the popover content is layered
 * on top of your existing content in a special type of window. the popover
 * remains visible until the user taps outside of the popover window or you
 * explicitly dismiss it. the popover is created by the method
 * {@link org.urish.gwtit.titanium.ui.ipad.createpopover}.
 * ![popover](http://img.skitch.com/20100406-pmssjk1a3a65s6ui8qnbqi59c4.png)
 * 
 * @platforms ipad
 * @since 1.2
 */
public class Popover extends org.urish.gwtit.titanium.ui.View {
	protected Popover() {
	}

	/**
	 * @return Return the arrow direction of the popover
	 */
	public final native int getArrowDirection()
	/*-{
		return this.arrowDirection;
	}-*/;

	public final native void setArrowDirection(int value)
	/*-{
		this.arrowDirection = value;
	}-*/;

	/**
	 * @return The left button in the nav area of the popover
	 */
	public final native Object getLeftNavButton()
	/*-{
		return this.leftNavButton;
	}-*/;

	public final native void setLeftNavButton(Object value)
	/*-{
		this.leftNavButton = value;
	}-*/;

	/**
	 * @return The title of the nav area of the popover
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * Change the height of the popover
	 * 
	 * @param height
	 *            height of the popover
	 */
	public final native void setHeight(Object height)
	/*-{
		return this.setHeight(height);
	}-*/;

	/**
	 * Set the passthrough views for the popover
	 * 
	 * @param passthroughViews
	 *            array of views which the user can interact with while the
	 *            popover is open (i.e. clicking on these views will interact
	 *            with these views, and not dismiss the popover).
	 */
	public final native void setPassthroughViews(Object[] passthroughViews)
	/*-{
		return this.setPassthroughViews(passthroughViews);
	}-*/;

	/**
	 * Change the width of the popover
	 * 
	 * @param width
	 *            width of the popover
	 */
	public final native void setWidth(Object width)
	/*-{
		return this.setWidth(width);
	}-*/;

	public final static class HideEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "hide";

		protected HideEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
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
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public interface HideHandler {
		public void onHide(HideEvent event);
	}

	public final native void addHideHandler(HideHandler handler)
	/*-{
		return this.addEventListener('hide', function(e) { handler.@org.urish.gwtit.titanium.ui.ipad.Popover.HideHandler::onHide(Lorg/urish/gwtit/titanium/ui/ipad/Popover/HideEvent;)(e); } );
	}-*/;

}
