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
 * A specifier for a media library query. By default, filters perform an exact
 * match.
 * 
 * @platforms iphone, ipad
 * @since 1.8
 */
public class MediaQueryType extends JavaScriptObject {
	protected MediaQueryType() {
	}

	/**
	 * @return A constant that specifies the ordering of the result array. One
	 *         of the `MUSIC_MEDIA_GROUP_*` constants specified on the
	 *         {@link org.urish.gwtit.titanium.Media} module.
	 */
	public final native float getGrouping()
	/*-{
		return this.grouping;
	}-*/;

	public final native void setGrouping(float value)
	/*-{
		this.grouping = value;
	}-*/;

	public final native void setMediaType(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.mediaType = value;
	}-*/;

	public final native void setMediaType(float value)
	/*-{
		this.mediaType = value;
	}-*/;

	/**
	 * @return The media type to filter on. Value should be one of the
	 *         `MUSIC_MEDIA_TYPE_` constants on
	 *         {@link org.urish.gwtit.titanium.Media}.
	 */
	public final native JavaScriptObject getMediaType()
	/*-{
		return this.mediaType;
	}-*/;

	public final native void setTitle(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.title = value;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The title to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setAlbumTitle(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.albumTitle = value;
	}-*/;

	public final native void setAlbumTitle(String value)
	/*-{
		this.albumTitle = value;
	}-*/;

	/**
	 * @return The album title to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getAlbumTitle()
	/*-{
		return this.albumTitle;
	}-*/;

	public final native void setArtist(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.artist = value;
	}-*/;

	public final native void setArtist(String value)
	/*-{
		this.artist = value;
	}-*/;

	/**
	 * @return The artist to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getArtist()
	/*-{
		return this.artist;
	}-*/;

	public final native void setAlbumArtist(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.albumArtist = value;
	}-*/;

	public final native void setAlbumArtist(String value)
	/*-{
		this.albumArtist = value;
	}-*/;

	/**
	 * @return The album artist to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getAlbumArtist()
	/*-{
		return this.albumArtist;
	}-*/;

	public final native void setGenre(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.genre = value;
	}-*/;

	public final native void setGenre(String value)
	/*-{
		this.genre = value;
	}-*/;

	/**
	 * @return The genre to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getGenre()
	/*-{
		return this.genre;
	}-*/;

	public final native void setComposer(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.composer = value;
	}-*/;

	public final native void setComposer(String value)
	/*-{
		this.composer = value;
	}-*/;

	/**
	 * @return The composer to filter on. Value should be a String.
	 */
	public final native JavaScriptObject getComposer()
	/*-{
		return this.composer;
	}-*/;

	public final native void setIsCompilation(org.urish.gwtit.titanium.MediaQueryInfoType value)
	/*-{
		this.isCompilation = value;
	}-*/;

	public final native void setIsCompilation(boolean value)
	/*-{
		this.isCompilation = value;
	}-*/;

	/**
	 * @return Filter by whether or not the item is a compilation. Value should
	 *         be a Boolean.
	 */
	public final native JavaScriptObject getIsCompilation()
	/*-{
		return this.isCompilation;
	}-*/;

}
