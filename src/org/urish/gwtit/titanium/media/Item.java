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
	public native String getAlbumArtist()
	/*-{
		return this.albumArtist;
	}-*/;

	public native void setAlbumArtist(String value)
	/*-{
		this.albumArtist = value;
	}-*/;

	/**
	 * @return The album title of the item
	 */
	public native String getAlbumTitle()
	/*-{
		return this.albumTitle;
	}-*/;

	public native void setAlbumTitle(String value)
	/*-{
		this.albumTitle = value;
	}-*/;

	/**
	 * @return The number of tracks for the album of the item
	 */
	public native float getAlbumTrackCount()
	/*-{
		return this.albumTrackCount;
	}-*/;

	public native void setAlbumTrackCount(float value)
	/*-{
		this.albumTrackCount = value;
	}-*/;

	/**
	 * @return The track number of the item
	 */
	public native float getAlbumTrackNumber()
	/*-{
		return this.albumTrackNumber;
	}-*/;

	public native void setAlbumTrackNumber(float value)
	/*-{
		this.albumTrackNumber = value;
	}-*/;

	/**
	 * @return The artist of the item
	 */
	public native String getArtist()
	/*-{
		return this.artist;
	}-*/;

	public native void setArtist(String value)
	/*-{
		this.artist = value;
	}-*/;

	/**
	 * @return A blob object containing the image for the item's artwork, or
	 *         null if none
	 */
	public native Object getArtwork()
	/*-{
		return this.artwork;
	}-*/;

	public native void setArtwork(Object value)
	/*-{
		this.artwork = value;
	}-*/;

	/**
	 * @return The composer of the item
	 */
	public native String getComposer()
	/*-{
		return this.composer;
	}-*/;

	public native void setComposer(String value)
	/*-{
		this.composer = value;
	}-*/;

	/**
	 * @return The total number of discs of the item
	 */
	public native float getDiscCount()
	/*-{
		return this.discCount;
	}-*/;

	public native void setDiscCount(float value)
	/*-{
		this.discCount = value;
	}-*/;

	/**
	 * @return The disc number of the item
	 */
	public native float getDiscNumber()
	/*-{
		return this.discNumber;
	}-*/;

	public native void setDiscNumber(float value)
	/*-{
		this.discNumber = value;
	}-*/;

	/**
	 * @return The genre of the item
	 */
	public native String getGenre()
	/*-{
		return this.genre;
	}-*/;

	public native void setGenre(String value)
	/*-{
		this.genre = value;
	}-*/;

	/**
	 * @return True if the item is part of a compilation album
	 */
	public native boolean getIsCompilation()
	/*-{
		return this.isCompilation;
	}-*/;

	public native void setIsCompilation(boolean value)
	/*-{
		this.isCompilation = value;
	}-*/;

	/**
	 * @return The lyrics of the item
	 */
	public native String getLyrics()
	/*-{
		return this.lyrics;
	}-*/;

	public native void setLyrics(String value)
	/*-{
		this.lyrics = value;
	}-*/;

	/**
	 * @return The type of the item
	 */
	public native float getMediaType()
	/*-{
		return this.mediaType;
	}-*/;

	public native void setMediaType(float value)
	/*-{
		this.mediaType = value;
	}-*/;

	/**
	 * @return The number of times the item has been played
	 */
	public native float getPlayCount()
	/*-{
		return this.playCount;
	}-*/;

	public native void setPlayCount(float value)
	/*-{
		this.playCount = value;
	}-*/;

	/**
	 * @return The length (in seconds) of the item
	 */
	public native float getPlaybackDuration()
	/*-{
		return this.playbackDuration;
	}-*/;

	public native void setPlaybackDuration(float value)
	/*-{
		this.playbackDuration = value;
	}-*/;

	/**
	 * @return The title of a podcast item. only for media types of
	 *         {@link org.urish.gwtit.titanium.media.music_media_type_podcast}.
	 */
	public native String getPodcastTitle()
	/*-{
		return this.podcastTitle;
	}-*/;

	public native void setPodcastTitle(String value)
	/*-{
		this.podcastTitle = value;
	}-*/;

	/**
	 * @return The rating of the item
	 */
	public native float getRating()
	/*-{
		return this.rating;
	}-*/;

	public native void setRating(float value)
	/*-{
		this.rating = value;
	}-*/;

	/**
	 * @return The number of times the item has been skipped
	 */
	public native float getSkipCount()
	/*-{
		return this.skipCount;
	}-*/;

	public native void setSkipCount(float value)
	/*-{
		this.skipCount = value;
	}-*/;

	/**
	 * @return The title of the item
	 */
	public native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

}
