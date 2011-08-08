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
 * An object representing an entry in the ipod's music library.
 * 
 * @platforms iphone, ipad
 * @since 1.5
 */
public class MediaItemType extends JavaScriptObject {
	protected MediaItemType() {
	}

	/**
	 * @return The type of the media. one of the `music_media_type_*` constants
	 *         on {@link org.urish.gwtit.titanium.media}.
	 */
	public final native float getMediaType()
	/*-{
		return this.mediaType;
	}-*/;

	public final native void setMediaType(float value)
	/*-{
		this.mediaType = value;
	}-*/;

	/**
	 * @return The title id3 tag contents.
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
	 * @return The album title id3 tag contents.
	 */
	public final native String getAlbumTitle()
	/*-{
		return this.albumTitle;
	}-*/;

	public final native void setAlbumTitle(String value)
	/*-{
		this.albumTitle = value;
	}-*/;

	/**
	 * @return The artist id3 tag contents.
	 */
	public final native String getArtist()
	/*-{
		return this.artist;
	}-*/;

	public final native void setArtist(String value)
	/*-{
		this.artist = value;
	}-*/;

	/**
	 * @return The album artist id3 tag contents.
	 */
	public final native String getAlbumArtist()
	/*-{
		return this.albumArtist;
	}-*/;

	public final native void setAlbumArtist(String value)
	/*-{
		this.albumArtist = value;
	}-*/;

	/**
	 * @return The genre id3 tag contents.
	 */
	public final native String getGenre()
	/*-{
		return this.genre;
	}-*/;

	public final native void setGenre(String value)
	/*-{
		this.genre = value;
	}-*/;

	/**
	 * @return The composer id3 tag contents.
	 */
	public final native String getComposer()
	/*-{
		return this.composer;
	}-*/;

	public final native void setComposer(String value)
	/*-{
		this.composer = value;
	}-*/;

	/**
	 * @return Whether or not the media is part of a compilation album.
	 */
	public final native boolean getIsCompilation()
	/*-{
		return this.isCompilation;
	}-*/;

	public final native void setIsCompilation(boolean value)
	/*-{
		this.isCompilation = value;
	}-*/;

	/**
	 * @return The playback length.
	 */
	public final native float getPlaybackDuration()
	/*-{
		return this.playbackDuration;
	}-*/;

	public final native void setPlaybackDuration(float value)
	/*-{
		this.playbackDuration = value;
	}-*/;

	/**
	 * @return The track number of the album.
	 */
	public final native float getAlbumTrackNumber()
	/*-{
		return this.albumTrackNumber;
	}-*/;

	public final native void setAlbumTrackNumber(float value)
	/*-{
		this.albumTrackNumber = value;
	}-*/;

	/**
	 * @return The total number of tracks on the album.
	 */
	public final native float getAlbumTrackCount()
	/*-{
		return this.albumTrackCount;
	}-*/;

	public final native void setAlbumTrackCount(float value)
	/*-{
		this.albumTrackCount = value;
	}-*/;

	/**
	 * @return The disc number of the album.
	 */
	public final native float getDiscNumber()
	/*-{
		return this.discNumber;
	}-*/;

	public final native void setDiscNumber(float value)
	/*-{
		this.discNumber = value;
	}-*/;

	/**
	 * @return The total number of discs comprising the album.
	 */
	public final native float getDiscCount()
	/*-{
		return this.discCount;
	}-*/;

	public final native void setDiscCount(float value)
	/*-{
		this.discCount = value;
	}-*/;

	/**
	 * @return The lyrics id3 tag contents.
	 */
	public final native String getLyrics()
	/*-{
		return this.lyrics;
	}-*/;

	public final native void setLyrics(String value)
	/*-{
		this.lyrics = value;
	}-*/;

	/**
	 * @return The podcast title. only valid for media of type
	 *         `music_media_type_podcast`.
	 */
	public final native String getPodcastTitle()
	/*-{
		return this.podcastTitle;
	}-*/;

	public final native void setPodcastTitle(String value)
	/*-{
		this.podcastTitle = value;
	}-*/;

	/**
	 * @return The total number of plays.
	 */
	public final native float getPlayCount()
	/*-{
		return this.playCount;
	}-*/;

	public final native void setPlayCount(float value)
	/*-{
		this.playCount = value;
	}-*/;

	/**
	 * @return The total number of skips.
	 */
	public final native float getSkipCount()
	/*-{
		return this.skipCount;
	}-*/;

	public final native void setSkipCount(float value)
	/*-{
		this.skipCount = value;
	}-*/;

	/**
	 * @return The user rating.
	 */
	public final native float getRating()
	/*-{
		return this.rating;
	}-*/;

	public final native void setRating(float value)
	/*-{
		this.rating = value;
	}-*/;

}
