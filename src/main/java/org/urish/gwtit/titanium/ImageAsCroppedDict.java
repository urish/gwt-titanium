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

package org.urish.gwtit.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for {@link org.urish.gwtit.titanium.blob.imageascropped}
 */
public class ImageAsCroppedDict extends JavaScriptObject {
	protected ImageAsCroppedDict() {
	}

	/**
	 * @return The width to crop this image to.
	 */
	public final native float getWidth()
	/*-{
		return this.width;
	}-*/;

	public final native void setWidth(float value)
	/*-{
		this.width = value;
	}-*/;

	/**
	 * @return The height to crop this image to.
	 */
	public final native float getHeight()
	/*-{
		return this.height;
	}-*/;

	public final native void setHeight(float value)
	/*-{
		this.height = value;
	}-*/;

	/**
	 * @return The x point within the image to crop.
	 */
	public final native float getX()
	/*-{
		return this.x;
	}-*/;

	public final native void setX(float value)
	/*-{
		this.x = value;
	}-*/;

	/**
	 * @return The y point within the image to crop.
	 */
	public final native float getY()
	/*-{
		return this.y;
	}-*/;

	public final native void setY(float value)
	/*-{
		this.y = value;
	}-*/;

}
