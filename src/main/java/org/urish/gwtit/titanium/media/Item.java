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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of a media item returned by the music picker as part of the
 * `items` array in the dictionary passed to its `success` function.
 * 
 * @platforms iphone, ipad
 * @since 1.4.0
 */
public class Item extends org.urish.gwtit.titanium.Proxy {
	protected Item() {
	}

	/**
	 * @return The artist for the album of the item
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
	 * @return The album title of the item
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
	 * @return The number of tracks for the album of the item
	 */
	public final native int getAlbumTrackCount()
	/*-{
		return this.albumTrackCount;
	}-*/;

	public final native void setAlbumTrackCount(int value)
	/*-{
		this.albumTrackCount = value;
	}-*/;

	/**
	 * @return The track number of the item
	 */
	public final native int getAlbumTrackNumber()
	/*-{
		return this.albumTrackNumber;
	}-*/;

	public final native void setAlbumTrackNumber(int value)
	/*-{
		this.albumTrackNumber = value;
	}-*/;

	/**
	 * @return The artist of the item
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
	 * @return A blob object containing the image for the item's artwork, or
	 *         null if none
	 */
	public final native JavaScriptObject getArtwork()
	/*-{
		return this.artwork;
	}-*/;

	public final native void setArtwork(JavaScriptObject value)
	/*-{
		this.artwork = value;
	}-*/;

	/**
	 * @return The composer of the item
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
	 * @return The total number of discs of the item
	 */
	public final native int getDiscCount()
	/*-{
		return this.discCount;
	}-*/;

	public final native void setDiscCount(int value)
	/*-{
		this.discCount = value;
	}-*/;

	/**
	 * @return The disc number of the item
	 */
	public final native int getDiscNumber()
	/*-{
		return this.discNumber;
	}-*/;

	public final native void setDiscNumber(int value)
	/*-{
		this.discNumber = value;
	}-*/;

	/**
	 * @return The genre of the item
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
	 * @return True if the item is part of a compilation album
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
	 * @return The lyrics of the item
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
	 * @return The type of the item
	 */
	public final native int getMediaType()
	/*-{
		return this.mediaType;
	}-*/;

	public final native void setMediaType(int value)
	/*-{
		this.mediaType = value;
	}-*/;

	/**
	 * @return The number of times the item has been played
	 */
	public final native int getPlayCount()
	/*-{
		return this.playCount;
	}-*/;

	public final native void setPlayCount(int value)
	/*-{
		this.playCount = value;
	}-*/;

	/**
	 * @return The length (in seconds) of the item
	 */
	public final native double getPlaybackDuration()
	/*-{
		return this.playbackDuration;
	}-*/;

	public final native void setPlaybackDuration(double value)
	/*-{
		this.playbackDuration = value;
	}-*/;

	/**
	 * @return The title of a podcast item. Only for media types of
	 *         {@link org.urish.gwtit.titanium.Media.MUSIC_MEDIA_TYPE_PODCAST}.
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
	 * @return The rating of the item
	 */
	public final native int getRating()
	/*-{
		return this.rating;
	}-*/;

	public final native void setRating(int value)
	/*-{
		this.rating = value;
	}-*/;

	/**
	 * @return The number of times the item has been skipped
	 */
	public final native int getSkipCount()
	/*-{
		return this.skipCount;
	}-*/;

	public final native void setSkipCount(int value)
	/*-{
		this.skipCount = value;
	}-*/;

	/**
	 * @return The title of the item
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

}
