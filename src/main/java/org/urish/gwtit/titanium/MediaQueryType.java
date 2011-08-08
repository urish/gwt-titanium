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
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A specifier for a media library query. by default, filters perform an exact
 * match.
 * 
 * @platforms iphone, ipad
 * @since 1.8
 */
public class MediaQueryType extends JavaScriptObject {
	protected MediaQueryType() {
	}

	/**
	 * @return A constant that specifies the ordering of the result array. one
	 *         of the `music_media_group_*` constants specified on the
	 *         {@link org.urish.gwtit.titanium.media} module.
	 */
	public final native float getGrouping()
	/*-{
		return this.grouping;
	}-*/;

	public final native void setGrouping(float value)
	/*-{
		this.grouping = value;
	}-*/;

	public final native void setMediaType(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.mediaType = value;
	}-*/;

	public final native void setMediaType(float value)
	/*-{
		this.mediaType = value;
	}-*/;

	/**
	 * @return The media type to filter on. value should be one of the
	 *         `music_media_type_` constants on
	 *         {@link org.urish.gwtit.titanium.media}.
	 */
	public final native Object getMediaType()
	/*-{
		return this.mediaType;
	}-*/;

	public final native void setTitle(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.title = value;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The title to filter on. value should be a string.
	 */
	public final native Object getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setAlbumTitle(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.albumTitle = value;
	}-*/;

	public final native void setAlbumTitle(String value)
	/*-{
		this.albumTitle = value;
	}-*/;

	/**
	 * @return The album title to filter on. value should be a string.
	 */
	public final native Object getAlbumTitle()
	/*-{
		return this.albumTitle;
	}-*/;

	public final native void setArtist(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.artist = value;
	}-*/;

	public final native void setArtist(String value)
	/*-{
		this.artist = value;
	}-*/;

	/**
	 * @return The artist to filter on. value should be a string.
	 */
	public final native Object getArtist()
	/*-{
		return this.artist;
	}-*/;

	public final native void setAlbumArtist(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.albumArtist = value;
	}-*/;

	public final native void setAlbumArtist(String value)
	/*-{
		this.albumArtist = value;
	}-*/;

	/**
	 * @return The album artist to filter on. value should be a string.
	 */
	public final native Object getAlbumArtist()
	/*-{
		return this.albumArtist;
	}-*/;

	public final native void setGenre(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.genre = value;
	}-*/;

	public final native void setGenre(String value)
	/*-{
		this.genre = value;
	}-*/;

	/**
	 * @return The genre to filter on. value should be a string.
	 */
	public final native Object getGenre()
	/*-{
		return this.genre;
	}-*/;

	public final native void setComposer(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.composer = value;
	}-*/;

	public final native void setComposer(String value)
	/*-{
		this.composer = value;
	}-*/;

	/**
	 * @return The composer to filter on. value should be a string.
	 */
	public final native Object getComposer()
	/*-{
		return this.composer;
	}-*/;

	public final native void setIsCompilation(EventCallback<org.urish.gwtit.titanium.MediaQueryInfoType> value)
	/*-{
		this.isCompilation = value;
	}-*/;

	public final native void setIsCompilation(boolean value)
	/*-{
		this.isCompilation = value;
	}-*/;

	/**
	 * @return Filter by whether or not the item is a compilation. value should
	 *         be a boolean.
	 */
	public final native Object getIsCompilation()
	/*-{
		return this.isCompilation;
	}-*/;

}
