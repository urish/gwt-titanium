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

import org.urish.gwtit.titanium.media.events.CompleteHandler;
import org.urish.gwtit.titanium.media.events.DurationAvailableHandler;
import org.urish.gwtit.titanium.media.events.ErrorHandler;
import org.urish.gwtit.titanium.media.events.FullscreenHandler;
import org.urish.gwtit.titanium.media.events.LoadHandler;
import org.urish.gwtit.titanium.media.events.LoadStateHandler;
import org.urish.gwtit.titanium.media.events.MediaTypesAvailableHandler;
import org.urish.gwtit.titanium.media.events.NaturalSizeAvailableHandler;
import org.urish.gwtit.titanium.media.events.PlaybackStateHandler;
import org.urish.gwtit.titanium.media.events.PlayingHandler;
import org.urish.gwtit.titanium.media.events.PreloadHandler;
import org.urish.gwtit.titanium.media.events.ResizeHandler;
import org.urish.gwtit.titanium.media.events.SourceChangeHandler;
import org.urish.gwtit.titanium.media.events.ThumbnailHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The videoplayer object is returned by
 * {@link org.urish.gwtit.titanium.media.createvideoplayer} and is useful for
 * playing videos.
 * <p>
 * Notes: Starting in iPhone 3.2 SDK, the video player can be embedded in any
 * normal view. However, if you create multiple video players at one time, only
 * the last one to have its URL set will display video content or behave as if
 * it is a view for a video player. Prior to 3.2, only fullscreen views were
 * available on iPhone.
 * 
 * @since 0.9
 */
public class VideoPlayer extends org.urish.gwtit.titanium.ui.View {
	protected VideoPlayer() {
	}

	/**
	 * @return Whether or not the movie can be played on a remote device. ios
	 *         4.3+ only.
	 * @platforms iphone, ipad
	 */
	public final native boolean getAllowsAirPlay()
	/*-{
		return this.allowsAirPlay;
	}-*/;

	public final native void setAllowsAirPlay(boolean value)
	/*-{
		this.allowsAirPlay = value;
	}-*/;

	/**
	 * @return Indicates if a movie should automatically start playback when it
	 *         is likely to finish uninterrupted based on e.g. network
	 *         conditions. defaults to true.
	 */
	public final native boolean getAutoplay()
	/*-{
		return this.autoplay;
	}-*/;

	public final native void setAutoplay(boolean value)
	/*-{
		this.autoplay = value;
	}-*/;

	/**
	 * @return Deprecated. use url property instead.
	 */
	public final native String getContentURL()
	/*-{
		return this.contentURL;
	}-*/;

	public final native void setContentURL(String value)
	/*-{
		this.contentURL = value;
	}-*/;

	/**
	 * @return The duration of the movie, or 0.0 if not known.
	 */
	public final native double getDuration()
	/*-{
		return this.duration;
	}-*/;

	public final native void setDuration(double value)
	/*-{
		this.duration = value;
	}-*/;

	/**
	 * @return The end time of movie playback. defaults to nan, which indicates
	 *         natural end time of the movie.
	 */
	public final native double getEndPlaybackTime()
	/*-{
		return this.endPlaybackTime;
	}-*/;

	public final native void setEndPlaybackTime(double value)
	/*-{
		this.endPlaybackTime = value;
	}-*/;

	/**
	 * @return Determines if the movie is presented in the entire screen
	 *         (obscuring all other application content). default is false.
	 *         setting this property to true before the movie player's view is
	 *         visible will have no effect.
	 */
	public final native boolean getFullscreen()
	/*-{
		return this.fullscreen;
	}-*/;

	public final native void setFullscreen(boolean value)
	/*-{
		this.fullscreen = value;
	}-*/;

	/**
	 * @return The start time of movie playback. defaults to nan, indicating the
	 *         natural start time of the movie.
	 */
	public final native double getInitialPlaybackTime()
	/*-{
		return this.initialPlaybackTime;
	}-*/;

	public final native void setInitialPlaybackTime(double value)
	/*-{
		this.initialPlaybackTime = value;
	}-*/;

	/**
	 * @return Returns the network load state of the movie player.
	 */
	public final native int getLoadState()
	/*-{
		return this.loadState;
	}-*/;

	public final native void setLoadState(int value)
	/*-{
		this.loadState = value;
	}-*/;

	/**
	 * @return The media object, either a file or blob.
	 */
	public final native JavaScriptObject getMedia()
	/*-{
		return this.media;
	}-*/;

	public final native void setMedia(JavaScriptObject value)
	/*-{
		this.media = value;
	}-*/;

	/**
	 * @return The style of the playback controls. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}
	 */
	public final native int getMediaControlStyle()
	/*-{
		return this.mediaControlStyle;
	}-*/;

	public final native void setMediaControlStyle(int value)
	/*-{
		this.mediaControlStyle = value;
	}-*/;

	/**
	 * @return The types of media in the movie, or
	 *         {@link org.urish.gwtit.titanium.media.video_media_type_none} if
	 *         not known.
	 */
	public final native int getMediaTypes()
	/*-{
		return this.mediaTypes;
	}-*/;

	public final native void setMediaTypes(int value)
	/*-{
		this.mediaTypes = value;
	}-*/;

	/**
	 * @return Deprecated in 3.2+ of the iphone sdk - use `mediacontrolstyle`.
	 *         provides the ability to set the control mode of the movie player.
	 *         defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}.
	 */
	public final native int getMovieControlMode()
	/*-{
		return this.movieControlMode;
	}-*/;

	public final native void setMovieControlMode(int value)
	/*-{
		this.movieControlMode = value;
	}-*/;

	/**
	 * @return Returns a dictionary with properties `width` and `height`.
	 *         returns the natural size of the movie or 0 for both properties if
	 *         not known or applicable.
	 */
	public final native org.urish.gwtit.client.util.Size getNaturalSize()
	/*-{
		return this.naturalSize;
	}-*/;

	public final native void setNaturalSize(org.urish.gwtit.client.util.Size value)
	/*-{
		this.naturalSize = value;
	}-*/;

	/**
	 * @return The currently playable duration of the movie, for progressively
	 *         downloaded network content.
	 */
	public final native double getPlayableDuration()
	/*-{
		return this.playableDuration;
	}-*/;

	public final native void setPlayableDuration(double value)
	/*-{
		this.playableDuration = value;
	}-*/;

	/**
	 * @return Returns the current playback state of the music player
	 */
	public final native int getPlaybackState()
	/*-{
		return this.playbackState;
	}-*/;

	public final native void setPlaybackState(int value)
	/*-{
		this.playbackState = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the player has started playing.
	 */
	public final native boolean getPlaying()
	/*-{
		return this.playing;
	}-*/;

	public final native void setPlaying(boolean value)
	/*-{
		this.playing = value;
	}-*/;

	/**
	 * @return Determines how the movie player repeats when reaching the end of
	 *         playback. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_repeat_mode_none}.
	 */
	public final native int getRepeatMode()
	/*-{
		return this.repeatMode;
	}-*/;

	public final native void setRepeatMode(int value)
	/*-{
		this.repeatMode = value;
	}-*/;

	/**
	 * @return Determines how the content scales to fit the view. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_scaling_aspect_fit}.
	 */
	public final native int getScalingMode()
	/*-{
		return this.scalingMode;
	}-*/;

	public final native void setScalingMode(int value)
	/*-{
		this.scalingMode = value;
	}-*/;

	/**
	 * @return The playback type of the movie. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_source_type_unknown}.
	 *         specifying a playback type before playing the movie can result in
	 *         faster load times.
	 */
	public final native int getSourceType()
	/*-{
		return this.sourceType;
	}-*/;

	public final native void setSourceType(int value)
	/*-{
		this.sourceType = value;
	}-*/;

	/**
	 * @return Url of the media.
	 */
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * @return Indicates if the movie player should inherit the application's
	 *         audio session instead of creating a new session (which would
	 *         interrupt the application's session). defaults to true. setting
	 *         this property during playback will not take effect until playback
	 *         is stopped and started again.
	 */
	public final native boolean getUseApplicationAudioSession()
	/*-{
		return this.useApplicationAudioSession;
	}-*/;

	public final native void setUseApplicationAudioSession(boolean value)
	/*-{
		this.useApplicationAudioSession = value;
	}-*/;

	/**
	 * Cancels all pending asynchronous thumbnail requests.
	 */
	public final native void cancelAllThumbnailImageRequests()
	/*-{
		return this.cancelAllThumbnailImageRequests();
	}-*/;

	/**
	 * Pause playing the video. on ios only available under 3.2 and later
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Start playing the video
	 */
	public final native void play()
	/*-{
		return this.play();
	}-*/;

	/**
	 * Release the internal video resources immediately. this is not usually
	 * necessary but can help if you no longer need to use the player after it
	 * is used to help converse memory.
	 */
	public final native void release()
	/*-{
		return this.release();
	}-*/;

	/**
	 * Asynchronously request thumbnails for one or more times, provided as an
	 * array of numbers (double). fires a `thumbnail` event on completion.
	 * optionally invokes the callback function passed in the method.
	 * 
	 * @param times
	 *            array of doubles for each time to request
	 * @param option
	 *            either
	 *            {@link org.urish.gwtit.titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME}
	 *            or
	 *            {@link org.urish.gwtit.titanium.Media.VIDEO_TIME_OPTION_EXACT}
	 *            .
	 */
	public final native void requestThumbnailImagesAtTimes(JavaScriptObject[] times, int option)
	/*-{
		return this.requestThumbnailImagesAtTimes(times, option);
	}-*/;

	/**
	 * A view for customization which is always displayed behind movie content.
	 * 
	 * @param view
	 *            view to set
	 */
	public final native void setBackgroundView(JavaScriptObject view)
	/*-{
		return this.setBackgroundView(view);
	}-*/;

	/**
	 * Stop playing the video
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	/**
	 * Returns a thumbnail at the given time as a blob.
	 * 
	 * @param time
	 *            playback time
	 * @param option
	 *            either
	 *            {@link org.urish.gwtit.titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME}
	 *            or
	 *            {@link org.urish.gwtit.titanium.Media.VIDEO_TIME_OPTION_EXACT}
	 */
	public final native JavaScriptObject thumbnailImageAtTime(double time, int option)
	/*-{
		return this.thumbnailImageAtTime(time, option);
	}-*/;

	public final native void addCompleteHandler(CompleteHandler handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.titanium.media.events.CompleteHandler::onComplete(Lorg/urish/gwtit/titanium/media/events/CompleteEvent;)(e); } );
	}-*/;

	public final native void addDurationAvailableHandler(DurationAvailableHandler handler)
	/*-{
		return this.addEventListener('durationAvailable', function(e) { handler.@org.urish.gwtit.titanium.media.events.DurationAvailableHandler::onDurationAvailable(Lorg/urish/gwtit/titanium/media/events/DurationAvailableEvent;)(e); } );
	}-*/;

	public final native void addErrorHandler(ErrorHandler handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.titanium.media.events.ErrorHandler::onError(Lorg/urish/gwtit/titanium/media/events/ErrorEvent;)(e); } );
	}-*/;

	public final native void addFullscreenHandler(FullscreenHandler handler)
	/*-{
		return this.addEventListener('fullscreen', function(e) { handler.@org.urish.gwtit.titanium.media.events.FullscreenHandler::onFullscreen(Lorg/urish/gwtit/titanium/media/events/FullscreenEvent;)(e); } );
	}-*/;

	public final native void addLoadHandler(LoadHandler handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.titanium.media.events.LoadHandler::onLoad(Lorg/urish/gwtit/titanium/media/events/LoadEvent;)(e); } );
	}-*/;

	public final native void addLoadStateHandler(LoadStateHandler handler)
	/*-{
		return this.addEventListener('loadstate', function(e) { handler.@org.urish.gwtit.titanium.media.events.LoadStateHandler::onLoadState(Lorg/urish/gwtit/titanium/media/events/LoadStateEvent;)(e); } );
	}-*/;

	public final native void addMediaTypesAvailableHandler(MediaTypesAvailableHandler handler)
	/*-{
		return this.addEventListener('mediaTypesAvailable', function(e) { handler.@org.urish.gwtit.titanium.media.events.MediaTypesAvailableHandler::onMediaTypesAvailable(Lorg/urish/gwtit/titanium/media/events/MediaTypesAvailableEvent;)(e); } );
	}-*/;

	public final native void addNaturalSizeAvailableHandler(NaturalSizeAvailableHandler handler)
	/*-{
		return this.addEventListener('naturalSizeAvailable', function(e) { handler.@org.urish.gwtit.titanium.media.events.NaturalSizeAvailableHandler::onNaturalSizeAvailable(Lorg/urish/gwtit/titanium/media/events/NaturalSizeAvailableEvent;)(e); } );
	}-*/;

	public final native void addPlaybackStateHandler(PlaybackStateHandler handler)
	/*-{
		return this.addEventListener('playbackState', function(e) { handler.@org.urish.gwtit.titanium.media.events.PlaybackStateHandler::onPlaybackState(Lorg/urish/gwtit/titanium/media/events/PlaybackStateEvent;)(e); } );
	}-*/;

	public final native void addPlayingHandler(PlayingHandler handler)
	/*-{
		return this.addEventListener('playing', function(e) { handler.@org.urish.gwtit.titanium.media.events.PlayingHandler::onPlaying(Lorg/urish/gwtit/titanium/media/events/PlayingEvent;)(e); } );
	}-*/;

	public final native void addPreloadHandler(PreloadHandler handler)
	/*-{
		return this.addEventListener('preload', function(e) { handler.@org.urish.gwtit.titanium.media.events.PreloadHandler::onPreload(Lorg/urish/gwtit/titanium/media/events/PreloadEvent;)(e); } );
	}-*/;

	public final native void addResizeHandler(ResizeHandler handler)
	/*-{
		return this.addEventListener('resize', function(e) { handler.@org.urish.gwtit.titanium.media.events.ResizeHandler::onResize(Lorg/urish/gwtit/titanium/media/events/ResizeEvent;)(e); } );
	}-*/;

	public final native void addSourceChangeHandler(SourceChangeHandler handler)
	/*-{
		return this.addEventListener('sourceChange', function(e) { handler.@org.urish.gwtit.titanium.media.events.SourceChangeHandler::onSourceChange(Lorg/urish/gwtit/titanium/media/events/SourceChangeEvent;)(e); } );
	}-*/;

	public final native void addThumbnailHandler(ThumbnailHandler handler)
	/*-{
		return this.addEventListener('thumbnail', function(e) { handler.@org.urish.gwtit.titanium.media.events.ThumbnailHandler::onThumbnail(Lorg/urish/gwtit/titanium/media/events/ThumbnailEvent;)(e); } );
	}-*/;

}
