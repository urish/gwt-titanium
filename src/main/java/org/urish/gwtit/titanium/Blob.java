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


/**
 * The blob is an abstract data type that represents binary information, often
 * obtained through httpclient or via files. it often is used to store text or
 * the actual data of an image.
 * 
 * @platforms android, iphone, ipad
 * @since 0.9
 */
public class Blob extends org.urish.gwtit.titanium.Proxy {
	protected Blob() {
	}

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners
	 * 
	 * @platforms iphone, ipad
	 * @param size
	 *            The size of the thumbnail, in either width or height
	 * @param borderSize
	 *            The width of the thumbnail's border.
	 * @param cornerRadius
	 *            The radius of the thumbnail's corners.
	 * @return The image thumbnail in a blob.
	 */
	public final native org.urish.gwtit.titanium.Blob imageAsThumbnail(float size)
	/*-{
		return this.imageAsThumbnail(size);
	}-*/;

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners
	 * 
	 * @platforms iphone, ipad
	 * @param size
	 *            The size of the thumbnail, in either width or height
	 * @param borderSize
	 *            The width of the thumbnail's border.
	 * @param cornerRadius
	 *            The radius of the thumbnail's corners.
	 * @return The image thumbnail in a blob.
	 */
	public final native org.urish.gwtit.titanium.Blob imageAsThumbnail(float size, float borderSize)
	/*-{
		return this.imageAsThumbnail(size, borderSize);
	}-*/;

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners
	 * 
	 * @platforms iphone, ipad
	 * @param size
	 *            The size of the thumbnail, in either width or height
	 * @param borderSize
	 *            The width of the thumbnail's border.
	 * @param cornerRadius
	 *            The radius of the thumbnail's corners.
	 * @return The image thumbnail in a blob.
	 */
	public final native org.urish.gwtit.titanium.Blob imageAsThumbnail(float size, float borderSize, float cornerRadius)
	/*-{
		return this.imageAsThumbnail(size, borderSize, cornerRadius);
	}-*/;

}
