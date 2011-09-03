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
 * obtained through HTTPClient or via files. It often is used to store text or
 * the actual data of an image.
 * 
 * @platforms android, iphone, ipad
 * @since 0.9
 */
public class Blob extends org.urish.gwtit.titanium.Proxy {
	protected Blob() {
	}

	/**
	 * @return The length of this blob in bytes.
	 */
	public final native float getLength()
	/*-{
		return this.length;
	}-*/;

	/**
	 * @return A UTF-8 string representation of the data in this blob. If this
	 *         blob represents pure binary data, the value will be `null`.
	 */
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	/**
	 * @return The mime type of this blob.
	 */
	public final native String getMimeType()
	/*-{
		return this.mimeType;
	}-*/;

	/**
	 * @return When this blob represents an image, this is the height of the
	 *         image in pixels. Otherwise, this is 0.
	 */
	public final native float getHeight()
	/*-{
		return this.height;
	}-*/;

	/**
	 * @return When this blob represents an image, this is the width of the
	 *         image in pixels. Otherwise, this is 0.
	 */
	public final native float getWidth()
	/*-{
		return this.width;
	}-*/;

	/**
	 * @return When this blob represents a {@link org.urish.gwtit.titanium.File}
	 *         , this is the file URL that represents it
	 */
	public final native String getNativePath()
	/*-{
		return this.nativePath;
	}-*/;

	/**
	 * @return When this blob represents an image, this is the total number of
	 *         pixels in the image. Otherwise it returns the number of bytes in
	 *         the binary data.
	 * @platforms iphone, ipad
	 */
	public final native float getSize()
	/*-{
		return this.size;
	}-*/;

	/**
	 * Converts this blob to a String
	 */
	public final native String toString_()
	/*-{
		return this.toString();
	}-*/;

	/**
	 * Appends the data from another blob to this blob.
	 * 
	 * @platforms android
	 * @param blob
	 *            The blob to append to this blob
	 */
	public final native void append(org.urish.gwtit.titanium.Blob blob)
	/*-{
		return this.append(blob);
	}-*/;

	/**
	 * When this blob represents an image, this creates a new blob by cropping
	 * the underlying image to the specified dimensions.
	 * 
	 * @platforms iphone, ipad
	 * @param options
	 *            imageAsCropped named options
	 * @return The cropped image in a blob.
	 */
	public final native org.urish.gwtit.titanium.Blob imageAsCropped(org.urish.gwtit.titanium.ImageAsCroppedDict options)
	/*-{
		return this.imageAsCropped(options);
	}-*/;

	/**
	 * When this blob represents an image, this creates a new blob by resizing
	 * and scaling the underlying image to the specified dimensions.
	 * 
	 * @platforms iphone, ipad
	 * @param width
	 *            The width to resize this image to.
	 * @param height
	 *            The height to resize this image to.
	 * @return The resized image in a blob.
	 */
	public final native org.urish.gwtit.titanium.Blob imageAsResized(float width, float height)
	/*-{
		return this.imageAsResized(width, height);
	}-*/;

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners
	 * 
	 * @platforms iphone, ipad
	 * @param size
	 *            The size of the thumbnail, in either width or height
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

	/**
	 * When this blob represents an image, this adds an alpha channel to the
	 * underlying image.
	 * 
	 * @platforms iphone, ipad
	 * @return The image with an alpha channel in a blob, or `null` if this blob
	 *         is not an image.
	 */
	public final native org.urish.gwtit.titanium.Blob imageWithAlpha()
	/*-{
		return this.imageWithAlpha();
	}-*/;

	/**
	 * When this blob represents an image, this adds a rounded corner to the
	 * underlying image.
	 * 
	 * @platforms iphone, ipad
	 * @param cornerSize
	 *            The size of the rounded corners in pixels.
	 * @return The image with a rounded corner in a blob, or `null` if this blob
	 *         is not an image.
	 */
	public final native org.urish.gwtit.titanium.Blob imageWithRoundedCorner(float cornerSize)
	/*-{
		return this.imageWithRoundedCorner(cornerSize);
	}-*/;

	/**
	 * When this blob represents an image, this adds a rounded corner to the
	 * underlying image.
	 * 
	 * @platforms iphone, ipad
	 * @param cornerSize
	 *            The size of the rounded corners in pixels.
	 * @param borderSize
	 *            The size of the border in pixels.
	 * @return The image with a rounded corner in a blob, or `null` if this blob
	 *         is not an image.
	 */
	public final native org.urish.gwtit.titanium.Blob imageWithRoundedCorner(float cornerSize, float borderSize)
	/*-{
		return this.imageWithRoundedCorner(cornerSize, borderSize);
	}-*/;

	/**
	 * When this blob represents an image, this adds a transparent border to the
	 * underlying image.
	 * 
	 * @platforms iphone, ipad
	 * @param size
	 *            The size of the transparent border.
	 * @return The image with a transparent border in a blob, or `null` if this
	 *         blob is not an image.
	 */
	public final native org.urish.gwtit.titanium.Blob imageWithTransparentBorder(float size)
	/*-{
		return this.imageWithTransparentBorder(size);
	}-*/;

}
