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
	public final native float getDuration()
	/*-{
		return this.duration;
	}-*/;

	public final native void setDuration(float value)
	/*-{
		this.duration = value;
	}-*/;

	/**
	 * @return The end time of movie playback. defaults to nan, which indicates
	 *         natural end time of the movie.
	 */
	public final native float getEndPlaybackTime()
	/*-{
		return this.endPlaybackTime;
	}-*/;

	public final native void setEndPlaybackTime(float value)
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
	public final native float getInitialPlaybackTime()
	/*-{
		return this.initialPlaybackTime;
	}-*/;

	public final native void setInitialPlaybackTime(float value)
	/*-{
		this.initialPlaybackTime = value;
	}-*/;

	/**
	 * @return Returns the network load state of the movie player.
	 */
	public final native float getLoadState()
	/*-{
		return this.loadState;
	}-*/;

	public final native void setLoadState(float value)
	/*-{
		this.loadState = value;
	}-*/;

	/**
	 * @return The media object, either a file or blob.
	 */
	public final native Object getMedia()
	/*-{
		return this.media;
	}-*/;

	public final native void setMedia(Object value)
	/*-{
		this.media = value;
	}-*/;

	/**
	 * @return The style of the playback controls. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}
	 */
	public final native float getMediaControlStyle()
	/*-{
		return this.mediaControlStyle;
	}-*/;

	public final native void setMediaControlStyle(float value)
	/*-{
		this.mediaControlStyle = value;
	}-*/;

	/**
	 * @return The types of media in the movie, or
	 *         {@link org.urish.gwtit.titanium.media.video_media_type_none} if
	 *         not known.
	 */
	public final native float getMediaTypes()
	/*-{
		return this.mediaTypes;
	}-*/;

	public final native void setMediaTypes(float value)
	/*-{
		this.mediaTypes = value;
	}-*/;

	/**
	 * @return Deprecated in 3.2+ of the iphone sdk - use `mediacontrolstyle`.
	 *         provides the ability to set the control mode of the movie player.
	 *         defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}.
	 */
	public final native float getMovieControlMode()
	/*-{
		return this.movieControlMode;
	}-*/;

	public final native void setMovieControlMode(float value)
	/*-{
		this.movieControlMode = value;
	}-*/;

	/**
	 * @return Returns a dictionary with properties `width` and `height`.
	 *         returns the natural size of the movie or 0 for both properties if
	 *         not known or applicable.
	 */
	public final native Object getNaturalSize()
	/*-{
		return this.naturalSize;
	}-*/;

	public final native void setNaturalSize(Object value)
	/*-{
		this.naturalSize = value;
	}-*/;

	/**
	 * @return The currently playable duration of the movie, for progressively
	 *         downloaded network content.
	 */
	public final native float getPlayableDuration()
	/*-{
		return this.playableDuration;
	}-*/;

	public final native void setPlayableDuration(float value)
	/*-{
		this.playableDuration = value;
	}-*/;

	/**
	 * @return Returns the current playback state of the music player
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
	public final native float getRepeatMode()
	/*-{
		return this.repeatMode;
	}-*/;

	public final native void setRepeatMode(float value)
	/*-{
		this.repeatMode = value;
	}-*/;

	/**
	 * @return Determines how the content scales to fit the view. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_scaling_aspect_fit}.
	 */
	public final native float getScalingMode()
	/*-{
		return this.scalingMode;
	}-*/;

	public final native void setScalingMode(float value)
	/*-{
		this.scalingMode = value;
	}-*/;

	/**
	 * @return The playback type of the movie. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_source_type_unknown}.
	 *         specifying a playback type before playing the movie can result in
	 *         faster load times.
	 */
	public final native float getSourceType()
	/*-{
		return this.sourceType;
	}-*/;

	public final native void setSourceType(float value)
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
	public final native void requestThumbnailImagesAtTimes(Object[] times, float option)
	/*-{
		return this.requestThumbnailImagesAtTimes(times, option);
	}-*/;

	/**
	 * A view for customization which is always displayed behind movie content.
	 * 
	 * @param view
	 *            view to set
	 */
	public final native void setBackgroundView(Object view)
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
	public final native Object thumbnailImageAtTime(float time, float option)
	/*-{
		return this.thumbnailImageAtTime(time, option);
	}-*/;

	public final static class CompleteEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "complete";

		protected CompleteEvent() {
		}

		/**
		 * the completion reason. One of
		 * <Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED>,
		 * <Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR> or
		 * <Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED>.
		 */
		public final native Object getReason()
		/*-{
			return this.reason;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addCompleteHandler(EventCallback<CompleteEvent> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class DurationAvailableEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "durationAvailable";

		protected DurationAvailableEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * duration
		 */
		public final native Object getDuration()
		/*-{
			return this.duration;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addDurationAvailableHandler(EventCallback<DurationAvailableEvent> handler)
	/*-{
		return this.addEventListener('durationAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ErrorEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "error";

		protected ErrorEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * reason for error as string
		 */
		public final native Object getMessage()
		/*-{
			return this.message;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addErrorHandler(EventCallback<ErrorEvent> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class FullscreenEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "fullscreen";

		protected FullscreenEvent() {
		}

		/**
		 * true to indicate entering fullscreen, false to indicate leaving
		 * fullscreen
		 */
		public final native Object getEntering()
		/*-{
			return this.entering;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addFullscreenHandler(EventCallback<FullscreenEvent> handler)
	/*-{
		return this.addEventListener('fullscreen', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class LoadEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "load";

		protected LoadEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addLoadHandler(EventCallback<LoadEvent> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class LoadstateEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "loadstate";

		protected LoadstateEvent() {
		}

		/**
		 * loadState
		 */
		public final native Object getLoadState()
		/*-{
			return this.loadState;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addLoadstateHandler(EventCallback<LoadstateEvent> handler)
	/*-{
		return this.addEventListener('loadstate', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class MediaTypesAvailableEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "mediaTypesAvailable";

		protected MediaTypesAvailableEvent() {
		}

		/**
		 * media types
		 */
		public final native Object getMediaTypes()
		/*-{
			return this.mediaTypes;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addMediaTypesAvailableHandler(EventCallback<MediaTypesAvailableEvent> handler)
	/*-{
		return this.addEventListener('mediaTypesAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class NaturalSizeAvailableEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "naturalSizeAvailable";

		protected NaturalSizeAvailableEvent() {
		}

		/**
		 * natural size as a dictionary. see `naturalSize` property.
		 */
		public final native Object getNaturalSize()
		/*-{
			return this.naturalSize;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addNaturalSizeAvailableHandler(EventCallback<NaturalSizeAvailableEvent> handler)
	/*-{
		return this.addEventListener('naturalSizeAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class PlaybackStateEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "playbackState";

		protected PlaybackStateEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * playbackState
		 */
		public final native Object getPlaybackState()
		/*-{
			return this.playbackState;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addPlaybackStateHandler(EventCallback<PlaybackStateEvent> handler)
	/*-{
		return this.addEventListener('playbackState', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class PlayingEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "playing";

		protected PlayingEvent() {
		}

		/**
		 * url of the media
		 */
		public final native Object getUrl()
		/*-{
			return this.url;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addPlayingHandler(EventCallback<PlayingEvent> handler)
	/*-{
		return this.addEventListener('playing', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class PreloadEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "preload";

		protected PreloadEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addPreloadHandler(EventCallback<PreloadEvent> handler)
	/*-{
		return this.addEventListener('preload', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ResizeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "resize";

		protected ResizeEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addResizeHandler(EventCallback<ResizeEvent> handler)
	/*-{
		return this.addEventListener('resize', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class SourceChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "sourceChange";

		protected SourceChangeEvent() {
		}

		/**
		 * the new sourceType
		 */
		public final native Object getSourceChange()
		/*-{
			return this.sourceChange;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addSourceChangeHandler(EventCallback<SourceChangeEvent> handler)
	/*-{
		return this.addEventListener('sourceChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ThumbnailEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "thumbnail";

		protected ThumbnailEvent() {
		}

		/**
		 * boolean to indicate success or failure
		 */
		public final native Object getSuccess()
		/*-{
			return this.success;
		}-*/;

		/**
		 * blob of the thumbnail image
		 */
		public final native Object getImage()
		/*-{
			return this.image;
		}-*/;

		/**
		 * time
		 */
		public final native Object getTime()
		/*-{
			return this.time;
		}-*/;

		/**
		 * if success is `false`, error message as string for reason
		 */
		public final native Object getError()
		/*-{
			return this.error;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addThumbnailHandler(EventCallback<ThumbnailEvent> handler)
	/*-{
		return this.addEventListener('thumbnail', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}