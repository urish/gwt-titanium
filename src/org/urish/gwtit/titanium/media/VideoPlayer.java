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
	public native boolean getAllowsAirPlay()
	/*-{
		return this.allowsAirPlay;
	}-*/;

	public native void setAllowsAirPlay(boolean value)
	/*-{
		this.allowsAirPlay = value;
	}-*/;

	/**
	 * @return A dictionary with properties x and y to indicate the anchor point
	 *         value. anchor specifies the position by which animation should
	 *         occur. center is 0.5, 0.5
	 */
	public native Object getAnchorPoint()
	/*-{
		return this.anchorPoint;
	}-*/;

	public native void setAnchorPoint(Object value)
	/*-{
		this.anchorPoint = value;
	}-*/;

	/**
	 * @return Read-only object with x and y properties of where the view is
	 *         during animation
	 */
	public native Object getAnimatedCenterPoint()
	/*-{
		return this.animatedCenterPoint;
	}-*/;

	public native void setAnimatedCenterPoint(Object value)
	/*-{
		this.animatedCenterPoint = value;
	}-*/;

	/**
	 * @return Indicates if a movie should automatically start playback when it
	 *         is likely to finish uninterrupted based on e.g. network
	 *         conditions. defaults to true.
	 */
	public native boolean getAutoplay()
	/*-{
		return this.autoplay;
	}-*/;

	public native void setAutoplay(boolean value)
	/*-{
		this.autoplay = value;
	}-*/;

	/**
	 * @return The background color of the view
	 */
	public native String getBackgroundColor()
	/*-{
		return this.backgroundColor;
	}-*/;

	public native void setBackgroundColor(String value)
	/*-{
		this.backgroundColor = value;
	}-*/;

	/**
	 * @return The disabled background color of the view. (android)
	 * @platforms android
	 */
	public native String getBackgroundDisabledColor()
	/*-{
		return this.backgroundDisabledColor;
	}-*/;

	public native void setBackgroundDisabledColor(String value)
	/*-{
		this.backgroundDisabledColor = value;
	}-*/;

	/**
	 * @return The disabled background image url of the view. (android)
	 * @platforms android
	 */
	public native String getBackgroundDisabledImage()
	/*-{
		return this.backgroundDisabledImage;
	}-*/;

	public native void setBackgroundDisabledImage(String value)
	/*-{
		this.backgroundDisabledImage = value;
	}-*/;

	/**
	 * @return The focused background color of the view. focusable must be true
	 *         for normal views. (android)
	 * @platforms android
	 */
	public native String getBackgroundFocusedColor()
	/*-{
		return this.backgroundFocusedColor;
	}-*/;

	public native void setBackgroundFocusedColor(String value)
	/*-{
		this.backgroundFocusedColor = value;
	}-*/;

	/**
	 * @return The focused background image url of the view. focusable must be
	 *         true for normal views. (android)
	 * @platforms android
	 */
	public native String getBackgroundFocusedImage()
	/*-{
		return this.backgroundFocusedImage;
	}-*/;

	public native void setBackgroundFocusedImage(String value)
	/*-{
		this.backgroundFocusedImage = value;
	}-*/;

	/**
	 * @return A background gradient for the view with the properties:
	 *         type,startpoint
	 *         ,endpoint,startradius,endradius,backfillstart,backfillend,colors.
	 */
	public native Object getBackgroundGradient()
	/*-{
		return this.backgroundGradient;
	}-*/;

	public native void setBackgroundGradient(Object value)
	/*-{
		this.backgroundGradient = value;
	}-*/;

	/**
	 * @return The background image url of the view
	 */
	public native String getBackgroundImage()
	/*-{
		return this.backgroundImage;
	}-*/;

	public native void setBackgroundImage(String value)
	/*-{
		this.backgroundImage = value;
	}-*/;

	/**
	 * @return End caps specify the portion of an image that should not be
	 *         resized when an image is stretched. this technique is used to
	 *         implement buttons and other resizable image-based interface
	 *         elements. when a button with end caps is resized, the resizing
	 *         occurs only in the middle of the button, in the region between
	 *         the end caps. the end caps themselves keep their original size
	 *         and appearance. this property specifies the size of the left end
	 *         cap. the middle (stretchable) portion is assumed to be 1 pixel
	 *         wide. the right end cap is therefore computed by adding the size
	 *         of the left end cap and the middle portion together and then
	 *         subtracting that value from the width of the image
	 */
	public native float getBackgroundLeftCap()
	/*-{
		return this.backgroundLeftCap;
	}-*/;

	public native void setBackgroundLeftCap(float value)
	/*-{
		this.backgroundLeftCap = value;
	}-*/;

	/**
	 * @return The selected background color of the view. focusable must be true
	 *         for normal views. (android)
	 * @platforms android
	 */
	public native String getBackgroundSelectedColor()
	/*-{
		return this.backgroundSelectedColor;
	}-*/;

	public native void setBackgroundSelectedColor(String value)
	/*-{
		this.backgroundSelectedColor = value;
	}-*/;

	/**
	 * @return The selected background image url of the view. focusable must be
	 *         true for normal views. (android)
	 * @platforms android
	 */
	public native String getBackgroundSelectedImage()
	/*-{
		return this.backgroundSelectedImage;
	}-*/;

	public native void setBackgroundSelectedImage(String value)
	/*-{
		this.backgroundSelectedImage = value;
	}-*/;

	/**
	 * @return End caps specify the portion of an image that should not be
	 *         resized when an image is stretched. this technique is used to
	 *         implement buttons and other resizable image-based interface
	 *         elements. when a button with end caps is resized, the resizing
	 *         occurs only in the middle of the button, in the region between
	 *         the end caps. the end caps themselves keep their original size
	 *         and appearance. this property specifies the size of the top end
	 *         cap. the middle (stretchable) portion is assumed to be 1 pixel
	 *         wide. the bottom end cap is therefore computed by adding the size
	 *         of the top end cap and the middle portion together and then
	 *         subtracting that value from the height of the image
	 */
	public native float getBackgroundTopCap()
	/*-{
		return this.backgroundTopCap;
	}-*/;

	public native void setBackgroundTopCap(float value)
	/*-{
		this.backgroundTopCap = value;
	}-*/;

	/**
	 * @return The border color of the view
	 */
	public native String getBorderColor()
	/*-{
		return this.borderColor;
	}-*/;

	public native void setBorderColor(String value)
	/*-{
		this.borderColor = value;
	}-*/;

	/**
	 * @return The border radius of the view
	 */
	public native float getBorderRadius()
	/*-{
		return this.borderRadius;
	}-*/;

	public native void setBorderRadius(float value)
	/*-{
		this.borderRadius = value;
	}-*/;

	/**
	 * @return The border width of the view
	 */
	public native float getBorderWidth()
	/*-{
		return this.borderWidth;
	}-*/;

	public native void setBorderWidth(float value)
	/*-{
		this.borderWidth = value;
	}-*/;

	public native void setBottom(float value)
	/*-{
		this.bottom = value;
	}-*/;

	public native void setBottom(String value)
	/*-{
		this.bottom = value;
	}-*/;

	/**
	 * @return Property for the view bottom position. this position is relative
	 *         to the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public native Object getBottom()
	/*-{
		return this.bottom;
	}-*/;

	/**
	 * @return A dictionary with properties x and y to indicate the center of
	 *         the views position relative to the parent view
	 */
	public native Object getCenter()
	/*-{
		return this.center;
	}-*/;

	public native void setCenter(Object value)
	/*-{
		this.center = value;
	}-*/;

	/**
	 * @return Deprecated. use url property instead.
	 */
	public native String getContentURL()
	/*-{
		return this.contentURL;
	}-*/;

	public native void setContentURL(String value)
	/*-{
		this.contentURL = value;
	}-*/;

	/**
	 * @return The duration of the movie, or 0.0 if not known.
	 */
	public native float getDuration()
	/*-{
		return this.duration;
	}-*/;

	public native void setDuration(float value)
	/*-{
		this.duration = value;
	}-*/;

	/**
	 * @return The end time of movie playback. defaults to nan, which indicates
	 *         natural end time of the movie.
	 */
	public native float getEndPlaybackTime()
	/*-{
		return this.endPlaybackTime;
	}-*/;

	public native void setEndPlaybackTime(float value)
	/*-{
		this.endPlaybackTime = value;
	}-*/;

	/**
	 * @return Set true if you want a view to be focusable when navigating with
	 *         the trackball or d-pad. default: false. (android only)
	 */
	public native boolean getFocusable()
	/*-{
		return this.focusable;
	}-*/;

	public native void setFocusable(boolean value)
	/*-{
		this.focusable = value;
	}-*/;

	/**
	 * @return Determines if the movie is presented in the entire screen
	 *         (obscuring all other application content). default is false.
	 *         setting this property to true before the movie player's view is
	 *         visible will have no effect.
	 */
	public native boolean getFullscreen()
	/*-{
		return this.fullscreen;
	}-*/;

	public native void setFullscreen(boolean value)
	/*-{
		this.fullscreen = value;
	}-*/;

	public native void setHeight(float value)
	/*-{
		this.height = value;
	}-*/;

	public native void setHeight(String value)
	/*-{
		this.height = value;
	}-*/;

	/**
	 * @return Property for the view height. can be either a float value or a
	 *         dimension string ie 'auto' (default).
	 */
	public native Object getHeight()
	/*-{
		return this.height;
	}-*/;

	/**
	 * @return The start time of movie playback. defaults to nan, indicating the
	 *         natural start time of the movie.
	 */
	public native float getInitialPlaybackTime()
	/*-{
		return this.initialPlaybackTime;
	}-*/;

	public native void setInitialPlaybackTime(float value)
	/*-{
		this.initialPlaybackTime = value;
	}-*/;

	public native void setLeft(float value)
	/*-{
		this.left = value;
	}-*/;

	public native void setLeft(String value)
	/*-{
		this.left = value;
	}-*/;

	/**
	 * @return Property for the view left position. this position is relative to
	 *         the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public native Object getLeft()
	/*-{
		return this.left;
	}-*/;

	/**
	 * @return Returns the network load state of the movie player.
	 */
	public native float getLoadState()
	/*-{
		return this.loadState;
	}-*/;

	public native void setLoadState(float value)
	/*-{
		this.loadState = value;
	}-*/;

	/**
	 * @return The media object, either a file or blob.
	 */
	public native Object getMedia()
	/*-{
		return this.media;
	}-*/;

	public native void setMedia(Object value)
	/*-{
		this.media = value;
	}-*/;

	/**
	 * @return The style of the playback controls. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}
	 */
	public native float getMediaControlStyle()
	/*-{
		return this.mediaControlStyle;
	}-*/;

	public native void setMediaControlStyle(float value)
	/*-{
		this.mediaControlStyle = value;
	}-*/;

	/**
	 * @return The types of media in the movie, or
	 *         {@link org.urish.gwtit.titanium.media.video_media_type_none} if
	 *         not known.
	 */
	public native float getMediaTypes()
	/*-{
		return this.mediaTypes;
	}-*/;

	public native void setMediaTypes(float value)
	/*-{
		this.mediaTypes = value;
	}-*/;

	/**
	 * @return Deprecated in 3.2+ of the iphone sdk - use `mediacontrolstyle`.
	 *         provides the ability to set the control mode of the movie player.
	 *         defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_control_default}.
	 */
	public native float getMovieControlMode()
	/*-{
		return this.movieControlMode;
	}-*/;

	public native void setMovieControlMode(float value)
	/*-{
		this.movieControlMode = value;
	}-*/;

	/**
	 * @return Returns a dictionary with properties `width` and `height`.
	 *         returns the natural size of the movie or 0 for both properties if
	 *         not known or applicable.
	 */
	public native Object getNaturalSize()
	/*-{
		return this.naturalSize;
	}-*/;

	public native void setNaturalSize(Object value)
	/*-{
		this.naturalSize = value;
	}-*/;

	/**
	 * @return The opacity from 0.0-1.0
	 */
	public native float getOpacity()
	/*-{
		return this.opacity;
	}-*/;

	public native void setOpacity(float value)
	/*-{
		this.opacity = value;
	}-*/;

	/**
	 * @return The currently playable duration of the movie, for progressively
	 *         downloaded network content.
	 */
	public native float getPlayableDuration()
	/*-{
		return this.playableDuration;
	}-*/;

	public native void setPlayableDuration(float value)
	/*-{
		this.playableDuration = value;
	}-*/;

	/**
	 * @return Returns the current playback state of the music player
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
	 * @return Boolean to indicate if the player has started playing.
	 */
	public native boolean getPlaying()
	/*-{
		return this.playing;
	}-*/;

	public native void setPlaying(boolean value)
	/*-{
		this.playing = value;
	}-*/;

	/**
	 * @return Determines how the movie player repeats when reaching the end of
	 *         playback. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_repeat_mode_none}.
	 */
	public native float getRepeatMode()
	/*-{
		return this.repeatMode;
	}-*/;

	public native void setRepeatMode(float value)
	/*-{
		this.repeatMode = value;
	}-*/;

	public native void setRight(float value)
	/*-{
		this.right = value;
	}-*/;

	public native void setRight(String value)
	/*-{
		this.right = value;
	}-*/;

	/**
	 * @return Property for the view right position. this position is relative
	 *         to the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public native Object getRight()
	/*-{
		return this.right;
	}-*/;

	/**
	 * @return Determines how the content scales to fit the view. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_scaling_aspect_fit}.
	 */
	public native float getScalingMode()
	/*-{
		return this.scalingMode;
	}-*/;

	public native void setScalingMode(float value)
	/*-{
		this.scalingMode = value;
	}-*/;

	/**
	 * @return The size of the view as a dictionary of width and height
	 *         properties
	 */
	public native Object getSize()
	/*-{
		return this.size;
	}-*/;

	public native void setSize(Object value)
	/*-{
		this.size = value;
	}-*/;

	/**
	 * @return One of titanium.ui.android.soft_keyboard_default_on_focus,
	 *         titanium.ui.android.soft_keyboard_hide_on_focus, or
	 *         titanium.ui.android.soft_keyboard_show_on_focus. (android only)
	 * @platforms android
	 */
	public native float getSoftKeyboardOnFocus()
	/*-{
		return this.softKeyboardOnFocus;
	}-*/;

	public native void setSoftKeyboardOnFocus(float value)
	/*-{
		this.softKeyboardOnFocus = value;
	}-*/;

	/**
	 * @return The playback type of the movie. defaults to
	 *         {@link org.urish.gwtit.titanium.media.video_source_type_unknown}.
	 *         specifying a playback type before playing the movie can result in
	 *         faster load times.
	 */
	public native float getSourceType()
	/*-{
		return this.sourceType;
	}-*/;

	public native void setSourceType(float value)
	/*-{
		this.sourceType = value;
	}-*/;

	public native void setTop(float value)
	/*-{
		this.top = value;
	}-*/;

	public native void setTop(String value)
	/*-{
		this.top = value;
	}-*/;

	/**
	 * @return Property for the view top position. this position is relative to
	 *         the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public native Object getTop()
	/*-{
		return this.top;
	}-*/;

	/**
	 * @return A boolean indicating if the view should receive touch events
	 *         (true, default) or forward them to peers (false)
	 */
	public native boolean getTouchEnabled()
	/*-{
		return this.touchEnabled;
	}-*/;

	public native void setTouchEnabled(boolean value)
	/*-{
		this.touchEnabled = value;
	}-*/;

	/**
	 * @return The transformation matrix to apply to the view
	 */
	public native Object getTransform()
	/*-{
		return this.transform;
	}-*/;

	public native void setTransform(Object value)
	/*-{
		this.transform = value;
	}-*/;

	/**
	 * @return Url of the media.
	 */
	public native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public native void setUrl(String value)
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
	public native boolean getUseApplicationAudioSession()
	/*-{
		return this.useApplicationAudioSession;
	}-*/;

	public native void setUseApplicationAudioSession(boolean value)
	/*-{
		this.useApplicationAudioSession = value;
	}-*/;

	/**
	 * @return A boolean of the visibility of the view
	 */
	public native boolean getVisible()
	/*-{
		return this.visible;
	}-*/;

	public native void setVisible(boolean value)
	/*-{
		this.visible = value;
	}-*/;

	public native void setWidth(float value)
	/*-{
		this.width = value;
	}-*/;

	public native void setWidth(String value)
	/*-{
		this.width = value;
	}-*/;

	/**
	 * @return Property for the view width. can be either a float value or a
	 *         dimension string ie 'auto' (default).
	 */
	public native Object getWidth()
	/*-{
		return this.width;
	}-*/;

	/**
	 * @return The z index position relative to other sibling views
	 */
	public native float getZIndex()
	/*-{
		return this.zIndex;
	}-*/;

	public native void setZIndex(float value)
	/*-{
		this.zIndex = value;
	}-*/;

	/**
	 * Add a child to the view hierarchy
	 * 
	 * @param view
	 *            the view to add to this views hiearchy
	 */
	public native void add(Object view)
	/*-{
		return this.add(view);
	}-*/;

	/**
	 * Animate the view
	 * 
	 * @param obj
	 *            either a dictionary of animation properties or an Animation
	 *            object
	 * @param callback
	 *            function to be invoked upon completion of the animation
	 */
	public native void animate(Object obj, Object callback)
	/*-{
		return this.animate(obj, callback);
	}-*/;

	/**
	 * Cancels all pending asynchronous thumbnail requests.
	 */
	public native void cancelAllThumbnailImageRequests()
	/*-{
		return this.cancelAllThumbnailImageRequests();
	}-*/;

	/**
	 * Hide the view
	 */
	public native void hide()
	/*-{
		return this.hide();
	}-*/;

	/**
	 * Pause playing the video. on ios only available under 3.2 and later
	 */
	public native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Start playing the video
	 */
	public native void play()
	/*-{
		return this.play();
	}-*/;

	/**
	 * Release the internal video resources immediately. this is not usually
	 * necessary but can help if you no longer need to use the player after it
	 * is used to help converse memory.
	 */
	public native void release()
	/*-{
		return this.release();
	}-*/;

	/**
	 * Remove a previously add view from the view hiearchy
	 * 
	 * @param view
	 *            the view to remove from this views hiearchy
	 */
	public native void remove(Object view)
	/*-{
		return this.remove(view);
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
	public native void requestThumbnailImagesAtTimes(Object[] times, float option)
	/*-{
		return this.requestThumbnailImagesAtTimes(times, option);
	}-*/;

	/**
	 * A view for customization which is always displayed behind movie content.
	 * 
	 * @param view
	 *            view to set
	 */
	public native void setBackgroundView(Object view)
	/*-{
		return this.setBackgroundView(view);
	}-*/;

	/**
	 * Make the view visible
	 */
	public native void show()
	/*-{
		return this.show();
	}-*/;

	/**
	 * Stop playing the video
	 */
	public native void stop()
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
	public native Object thumbnailImageAtTime(float time, float option)
	/*-{
		return this.thumbnailImageAtTime(time, option);
	}-*/;

	/**
	 * Return a blob image of the rendered view
	 * 
	 * @param f
	 *            function to be invoked upon completion. if non-null, this
	 *            method will be performed asynchronously. if null, it will be
	 *            performed immediately
	 */
	public native Object toImage(Object f)
	/*-{
		return this.toImage(f);
	}-*/;

	public native void addClickHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addCompleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addDblclickHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('dblclick', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addDoubletapHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('doubletap', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addDurationAvailableHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('durationAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addFullscreenHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('fullscreen', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addLoadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addLoadstateHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('loadstate', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addMediaTypesAvailableHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('mediaTypesAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addNaturalSizeAvailableHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('naturalSizeAvailable', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addPlaybackStateHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('playbackState', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addPlayingHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('playing', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addPreloadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('preload', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addResizeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('resize', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addSingletapHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('singletap', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addSourceChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('sourceChange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addSwipeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('swipe', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addThumbnailHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('thumbnail', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addTouchcancelHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('touchcancel', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addTouchendHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('touchend', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addTouchmoveHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('touchmove', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addTouchstartHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('touchstart', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addTwofingertapHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('twofingertap', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
