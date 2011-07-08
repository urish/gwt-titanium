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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The musicplayer instance returned from
 * {@link org.urish.gwtit.titanium.media.createmusicplayer}. this object
 * represents a music controller.
 * 
 * @platforms iphone, ipad
 * @since 1.4.0
 */
public class MusicPlayer extends org.urish.gwtit.titanium.Proxy {
	protected MusicPlayer() {
	}

	/**
	 * @return The current point in song playback
	 */
	public native float getCurrentPlaybackTime()
	/*-{
		return this.currentPlaybackTime;
	}-*/;

	public native void setCurrentPlaybackTime(float value)
	/*-{
		this.currentPlaybackTime = value;
	}-*/;

	/**
	 * @return An item object which indicates the currently playing media
	 */
	public native Object getNowPlaying()
	/*-{
		return this.nowPlaying;
	}-*/;

	public native void setNowPlaying(Object value)
	/*-{
		this.nowPlaying = value;
	}-*/;

	/**
	 * @return The playback state; one of
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_stopped}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_playing}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_paused},
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_interrupted}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_skeek_forward}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_state_seek_backward}
	 */
	public native float getPlaybackState()
	/*-{
		return this.playbackState;
	}-*/;

	public native void setPlaybackState(float value)
	/*-{
		this.playbackState = value;
	}-*/;

	/**
	 * @return The repeat setting; one of
	 *         {@link org.urish.gwtit.titanium.media.music_player_repeat_default}
	 *         , {@link org.urish.gwtit.titanium.media.music_player_repeat_none}
	 *         , {@link org.urish.gwtit.titanium.media.music_player_repeat_one},
	 *         {@link org.urish.gwtit.titanium.media.music_player_repeat_all}
	 */
	public native float getRepeatMode()
	/*-{
		return this.repeatMode;
	}-*/;

	public native void setRepeatMode(float value)
	/*-{
		this.repeatMode = value;
	}-*/;

	/**
	 * @return The shuffle setting; one of
	 *         {@link org.urish.gwtit.titanium.media.music_player_shuffle_default}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_shuffle_none},
	 *         {@link org.urish.gwtit.titanium.media.music_player_shuffle_songs}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.media.music_player_shuffle_albums}
	 */
	public native float getShuffleMode()
	/*-{
		return this.shuffleMode;
	}-*/;

	public native void setShuffleMode(float value)
	/*-{
		this.shuffleMode = value;
	}-*/;

	/**
	 * @return A value between 0.0 and 1.0 indicating the volume level for the
	 *         music player
	 */
	public native float getVolume()
	/*-{
		return this.volume;
	}-*/;

	public native void setVolume(float value)
	/*-{
		this.volume = value;
	}-*/;

	/**
	 * Pause playback
	 */
	public native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Begin playback
	 */
	public native void play()
	/*-{
		return this.play();
	}-*/;

	/**
	 * Seek backward in the currently playing media
	 */
	public native void seekBackward()
	/*-{
		return this.seekBackward();
	}-*/;

	/**
	 * Seek forward in the currently playing media
	 */
	public native void seekForward()
	/*-{
		return this.seekForward();
	}-*/;

	/**
	 * Set the media queue
	 * 
	 * @param queue
	 *            a queue representation to set the player queue to. Can be any
	 *            of: A dictionary with an `items` key that is an array of
	 *            {@link org.urish.gwtit.titanium.media.Item} objects, an array
	 *            of {@link org.urish.gwtit.titanium.media.Item} objects, or a
	 *            single {@link org.urish.gwtit.titanium.media.Item} object.
	 */
	public native void setQueue(Object queue)
	/*-{
		return this.setQueue(queue);
	}-*/;

	/**
	 * Skip to the beginning of the currently playing media
	 */
	public native void skipToBeginning()
	/*-{
		return this.skipToBeginning();
	}-*/;

	/**
	 * Skip to the next media in the queue
	 */
	public native void skipToNext()
	/*-{
		return this.skipToNext();
	}-*/;

	/**
	 * Skip to the previous media in the queue
	 */
	public native void skipToPrevious()
	/*-{
		return this.skipToPrevious();
	}-*/;

	/**
	 * Stop playback
	 */
	public native void stop()
	/*-{
		return this.stop();
	}-*/;

	/**
	 * End a seek operation
	 */
	public native void stopSeeking()
	/*-{
		return this.stopSeeking();
	}-*/;

	public native void addPlayingChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('playingChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addStateChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('stateChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addVolumeChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('volumeChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}