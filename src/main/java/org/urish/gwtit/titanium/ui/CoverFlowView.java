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

/**
 * The cover flow view is container for showing animated, three dimensional
 * images in a nice ui. the cover flow view is created by the method
 * {@link org.urish.gwtit.titanium.ui.createcoverflowview}.
 * <p>
 * Notes:
 * 
 * @platforms iphone, ipad
 * @since 0.8
 */
public class CoverFlowView extends org.urish.gwtit.titanium.ui.View {
	protected CoverFlowView() {
	}

	/**
	 * @return Array of images to display in the view
	 */
	public final native Object[] getImages()
	/*-{
		return this.images;
	}-*/;

	public final native void setImages(Object[] value)
	/*-{
		this.images = value;
	}-*/;

	/**
	 * @return Index to make selected
	 */
	public final native float getSelected()
	/*-{
		return this.selected;
	}-*/;

	public final native void setSelected(float value)
	/*-{
		this.selected = value;
	}-*/;

	/**
	 * Change an image for a index
	 * 
	 * @param index
	 *            index to change
	 * @param image
	 *            the image to set the index to. May be a TiBlob, TiFile, URL,
	 *            or dictionary with 'image' (may be any of TiBlob, TiFile,
	 *            URL), 'width', 'height' keys. 'auto' is not allowed, only
	 *            exact sizes (although a size may be omitted to keep the image
	 *            at that size). If passed as a TiFile or URL, will perform a
	 *            check for '@2x' on Retina displays
	 */
	public final native void setImage(float index, Object image)
	/*-{
		return this.setImage(index, image);
	}-*/;

	public final static class ChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "change";

		protected ChangeEvent() {
		}

		/**
		 * the index of the image that is now visible
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
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
		 * the previous index of the image that was visible
		 */
		public final native Object getPrevious()
		/*-{
			return this.previous;
		}-*/;

	}

	public final native void addChangeHandler(EventCallback<ChangeEvent> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
