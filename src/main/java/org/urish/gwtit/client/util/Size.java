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
package org.urish.gwtit.client.util;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This object represents a size value
 * 
 * @author Uri
 */
public class Size extends JavaScriptObject {
	protected Size() {
	}

	/**
	 * Creates a new Titanium size object.
	 * 
	 * @param width
	 *            The width, in pixels
	 * @param height
	 *            The height, in pixels
	 * @return A Titanium size object with the given width and height.
	 */
	public static native Size createSize(float width, float height)
	/*-{
		return {
			width : width,
			height : height
		};
	}-*/;

	/**
	 * Gets the width part of the size object.
	 * 
	 * @return The width of the object, in pixels.
	 */
	public native final float getWidth()
	/*-{
		return this.width;
	}-*/;

	/**
	 * Gets the height part of the size object.
	 * 
	 * @return The height of the object, in pixels.
	 */
	public native final float getHeight()
	/*-{
		return this.height;
	}-*/;
}
