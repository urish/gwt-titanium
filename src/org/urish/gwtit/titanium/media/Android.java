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

package org.urish.gwtit.titanium.media;


/**
 * Android-specific media-related functionality.
 * 
 * @platforms android
 * @since 1.7.0
 */
public class Android extends org.urish.gwtit.titanium.Module {
	protected Android() {
	}

	/**
	 * Use the [android
	 * mediascannerconnection](http://developer.android.com/reference
	 * /android/media/mediascannerconnection.html) to request immediate scan of
	 * particular files so that they become available to the appropriate media
	 * providers (gallery, etc.).
	 * 
	 * @param paths
	 *            Array of paths to the files you want to be scanned.
	 * @param mimeTypes
	 *            Array of mime types for the files in the paths parameter. Can
	 *            be null, in which case the mime type will be inferred at scan
	 *            time.
	 * @param callback
	 *            A function that will be called when each file is finished
	 *            being scanned. Check the callback argument's "path" and "uri"
	 *            properties to see the path that was scanned and the resulting
	 *            content uri.
	 */
	public static native void scanMediaFiles(String[] paths, String[] mimeTypes, Object callback)
	/*-{
		return Titanium.Media.Android.scanMediaFiles(paths, mimeTypes, callback);
	}-*/;

	/**
	 * Set the system homescreen wallpaper
	 * 
	 * @param image
	 *            Image blob such as what can be retrieved via callbacks for
	 *            {@link org.urish.gwtit.titanium.media.openPhotoGallery} and
	 *            {@link org.urish.gwtit.titanium.media.showCamera}, as well as
	 *            from the return value of
	 *            {@link org.urish.gwtit.titanium.filesystem.file.read}.
	 * @param scale
	 *            Set to true if you want the image to be scaled with respect to
	 *            the system wallpaper desired width, or false to leave it
	 *            as-is.
	 */
	public static native void setSystemWallpaper(Object image, boolean scale)
	/*-{
		return Titanium.Media.Android.setSystemWallpaper(image, scale);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.Media.Android.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.Media.Android.removeEventListener(name, callbac);
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Media.Android.fireEvent(name, event);
	}-*/;

}
