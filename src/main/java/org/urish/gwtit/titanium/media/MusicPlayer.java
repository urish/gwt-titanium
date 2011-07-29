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
	public final native float getCurrentPlaybackTime()
	/*-{
		return this.currentPlaybackTime;
	}-*/;

	public final native void setCurrentPlaybackTime(float value)
	/*-{
		this.currentPlaybackTime = value;
	}-*/;

	/**
	 * @return An item object which indicates the currently playing media
	 */
	public final native Object getNowPlaying()
	/*-{
		return this.nowPlaying;
	}-*/;

	public final native void setNowPlaying(Object value)
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
	public final native float getPlaybackState()
	/*-{
		return this.playbackState;
	}-*/;

	public final native void setPlaybackState(float value)
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
	public final native float getRepeatMode()
	/*-{
		return this.repeatMode;
	}-*/;

	public final native void setRepeatMode(float value)
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
	public final native float getShuffleMode()
	/*-{
		return this.shuffleMode;
	}-*/;

	public final native void setShuffleMode(float value)
	/*-{
		this.shuffleMode = value;
	}-*/;

	/**
	 * @return A value between 0.0 and 1.0 indicating the volume level for the
	 *         music player
	 */
	public final native float getVolume()
	/*-{
		return this.volume;
	}-*/;

	public final native void setVolume(float value)
	/*-{
		this.volume = value;
	}-*/;

	/**
	 * Pause playback
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Begin playback
	 */
	public final native void play()
	/*-{
		return this.play();
	}-*/;

	/**
	 * Seek backward in the currently playing media
	 */
	public final native void seekBackward()
	/*-{
		return this.seekBackward();
	}-*/;

	/**
	 * Seek forward in the currently playing media
	 */
	public final native void seekForward()
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
	public final native void setQueue(Object queue)
	/*-{
		return this.setQueue(queue);
	}-*/;

	/**
	 * Skip to the beginning of the currently playing media
	 */
	public final native void skipToBeginning()
	/*-{
		return this.skipToBeginning();
	}-*/;

	/**
	 * Skip to the next media in the queue
	 */
	public final native void skipToNext()
	/*-{
		return this.skipToNext();
	}-*/;

	/**
	 * Skip to the previous media in the queue
	 */
	public final native void skipToPrevious()
	/*-{
		return this.skipToPrevious();
	}-*/;

	/**
	 * Stop playback
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	/**
	 * End a seek operation
	 */
	public final native void stopSeeking()
	/*-{
		return this.stopSeeking();
	}-*/;

	public final static class PlayingChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "playingChange";

		protected PlayingChangeEvent() {
		}

	}

	public final native void addPlayingChangeHandler(EventCallback<PlayingChangeEvent> handler)
	/*-{
		return this.addEventListener('playingChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class StateChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "stateChange";

		protected StateChangeEvent() {
		}

	}

	public final native void addStateChangeHandler(EventCallback<StateChangeEvent> handler)
	/*-{
		return this.addEventListener('stateChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class VolumeChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "volumeChange";

		protected VolumeChangeEvent() {
		}

	}

	public final native void addVolumeChangeHandler(EventCallback<VolumeChangeEvent> handler)
	/*-{
		return this.addEventListener('volumeChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}