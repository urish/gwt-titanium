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

import org.urish.gwtit.titanium.ui.events.ChangeHandler;

import com.google.gwt.core.client.JavaScriptObject;

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
	public final native JavaScriptObject[] getImages()
	/*-{
		return this.images;
	}-*/;

	public final native void setImages(JavaScriptObject[] value)
	/*-{
		this.images = value;
	}-*/;

	/**
	 * @return Index to make selected
	 */
	public final native int getSelected()
	/*-{
		return this.selected;
	}-*/;

	public final native void setSelected(int value)
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
	public final native void setImage(int index, JavaScriptObject image)
	/*-{
		return this.setImage(index, image);
	}-*/;

	public final native void addChangeHandler(ChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ChangeHandler::onChange(Lorg/urish/gwtit/titanium/ui/events/ChangeEvent;)(e); } );
	}-*/;

}
