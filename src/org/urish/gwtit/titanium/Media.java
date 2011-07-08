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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;
import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level media module. the media module is used accessing the device's
 * media related functionality such as playing audio or recording video.
 * 
 * @since 0.1
 */
public class Media extends org.urish.gwtit.titanium.Module {
	protected Media() {
	}

	public static final Const AUDIO_FILEFORMAT_3GP2 = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_3GP2");

	public static final Const AUDIO_FILEFORMAT_3GPP = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_3GPP");

	public static final Const AUDIO_FILEFORMAT_AIFF = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_AIFF");

	public static final Const AUDIO_FILEFORMAT_AMR = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_AMR");

	public static final Const AUDIO_FILEFORMAT_CAF = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_CAF");

	public static final Const AUDIO_FILEFORMAT_MP3 = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_MP3");

	public static final Const AUDIO_FILEFORMAT_MP4 = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_MP4");

	public static final Const AUDIO_FILEFORMAT_MP4A = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_MP4A");

	public static final Const AUDIO_FILEFORMAT_WAVE = new ConstImpl("Titanium.Media.AUDIO_FILEFORMAT_WAVE");

	public static final Const AUDIO_FORMAT_AAC = new ConstImpl("Titanium.Media.AUDIO_FORMAT_AAC");

	public static final Const AUDIO_FORMAT_ALAW = new ConstImpl("Titanium.Media.AUDIO_FORMAT_ALAW");

	public static final Const AUDIO_FORMAT_APPLE_LOSSLESS = new ConstImpl("Titanium.Media.AUDIO_FORMAT_APPLE_LOSSLESS");

	public static final Const AUDIO_FORMAT_ILBC = new ConstImpl("Titanium.Media.AUDIO_FORMAT_ILBC");

	public static final Const AUDIO_FORMAT_IMA4 = new ConstImpl("Titanium.Media.AUDIO_FORMAT_IMA4");

	public static final Const AUDIO_FORMAT_LINEAR_PCM = new ConstImpl("Titanium.Media.AUDIO_FORMAT_LINEAR_PCM");

	public static final Const AUDIO_FORMAT_ULAW = new ConstImpl("Titanium.Media.AUDIO_FORMAT_ULAW");

	public static final Const AUDIO_HEADPHONES = new ConstImpl("Titanium.Media.AUDIO_HEADPHONES");

	public static final Const AUDIO_HEADPHONES_AND_MIC = new ConstImpl("Titanium.Media.AUDIO_HEADPHONES_AND_MIC");

	public static final Const AUDIO_HEADSET_INOUT = new ConstImpl("Titanium.Media.AUDIO_HEADSET_INOUT");

	public static final Const AUDIO_LINEOUT = new ConstImpl("Titanium.Media.AUDIO_LINEOUT");

	public static final Const AUDIO_MICROPHONE = new ConstImpl("Titanium.Media.AUDIO_MICROPHONE");

	public static final Const AUDIO_MUTED = new ConstImpl("Titanium.Media.AUDIO_MUTED");

	public static final Const AUDIO_RECEIVER_AND_MIC = new ConstImpl("Titanium.Media.AUDIO_RECEIVER_AND_MIC");

	public static final Const AUDIO_SESSION_MODE_AMBIENT = new ConstImpl("Titanium.Media.AUDIO_SESSION_MODE_AMBIENT");

	public static final Const AUDIO_SESSION_MODE_PLAYBACK = new ConstImpl("Titanium.Media.AUDIO_SESSION_MODE_PLAYBACK");

	public static final Const AUDIO_SESSION_MODE_PLAY_AND_RECORD = new ConstImpl(
			"Titanium.Media.AUDIO_SESSION_MODE_PLAY_AND_RECORD");

	public static final Const AUDIO_SESSION_MODE_RECORD = new ConstImpl("Titanium.Media.AUDIO_SESSION_MODE_RECORD");

	public static final Const AUDIO_SESSION_MODE_SOLO_AMBIENT = new ConstImpl(
			"Titanium.Media.AUDIO_SESSION_MODE_SOLO_AMBIENT");

	public static final Const AUDIO_SPEAKER = new ConstImpl("Titanium.Media.AUDIO_SPEAKER");

	public static final Const AUDIO_UNAVAILABLE = new ConstImpl("Titanium.Media.AUDIO_UNAVAILABLE");

	public static final Const AUDIO_UNKNOWN = new ConstImpl("Titanium.Media.AUDIO_UNKNOWN");

	public static final Const DEVICE_BUSY = new ConstImpl("Titanium.Media.DEVICE_BUSY");

	public static final Const MEDIA_TYPE_PHOTO = new ConstImpl("Titanium.Media.MEDIA_TYPE_PHOTO");

	public static final Const MEDIA_TYPE_VIDEO = new ConstImpl("Titanium.Media.MEDIA_TYPE_VIDEO");

	public static final Const MUSIC_MEDIA_TYPE_ALL = new ConstImpl("Titanium.Media.MUSIC_MEDIA_TYPE_ALL");

	public static final Const MUSIC_MEDIA_TYPE_ANY_AUDIO = new ConstImpl("Titanium.Media.MUSIC_MEDIA_TYPE_ANY_AUDIO");

	public static final Const MUSIC_MEDIA_TYPE_AUDIOBOOK = new ConstImpl("Titanium.Media.MUSIC_MEDIA_TYPE_AUDIOBOOK");

	public static final Const MUSIC_MEDIA_TYPE_MUSIC = new ConstImpl("Titanium.Media.MUSIC_MEDIA_TYPE_MUSIC");

	public static final Const MUSIC_MEDIA_TYPE_PODCAST = new ConstImpl("Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST");

	public static final Const MUSIC_PLAYER_REPEAT_ALL = new ConstImpl("Titanium.Media.MUSIC_PLAYER_REPEAT_ALL");

	public static final Const MUSIC_PLAYER_REPEAT_DEFAULT = new ConstImpl("Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT");

	public static final Const MUSIC_PLAYER_REPEAT_NONE = new ConstImpl("Titanium.Media.MUSIC_PLAYER_REPEAT_NONE");

	public static final Const MUSIC_PLAYER_REPEAT_ONE = new ConstImpl("Titanium.Media.MUSIC_PLAYER_REPEAT_ONE");

	public static final Const MUSIC_PLAYER_SHUFFLE_ALBUMS = new ConstImpl("Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS");

	public static final Const MUSIC_PLAYER_SHUFFLE_DEFAULT = new ConstImpl(
			"Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT");

	public static final Const MUSIC_PLAYER_SHUFFLE_NONE = new ConstImpl("Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE");

	public static final Const MUSIC_PLAYER_SHUFFLE_SONGS = new ConstImpl("Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS");

	public static final Const MUSIC_PLAYER_STATE_INTERRUPTED = new ConstImpl(
			"Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED");

	public static final Const MUSIC_PLAYER_STATE_PAUSED = new ConstImpl("Titanium.Media.MUSIC_PLAYER_STATE_PAUSED");

	public static final Const MUSIC_PLAYER_STATE_PLAYING = new ConstImpl("Titanium.Media.MUSIC_PLAYER_STATE_PLAYING");

	public static final Const MUSIC_PLAYER_STATE_SEEK_BACKWARD = new ConstImpl(
			"Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD");

	public static final Const MUSIC_PLAYER_STATE_SKEEK_FORWARD = new ConstImpl(
			"Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD");

	public static final Const MUSIC_PLAYER_STATE_STOPPED = new ConstImpl("Titanium.Media.MUSIC_PLAYER_STATE_STOPPED");

	public static final Const NO_CAMERA = new ConstImpl("Titanium.Media.NO_CAMERA");

	public static final Const NO_VIDEO = new ConstImpl("Titanium.Media.NO_VIDEO");

	public static final Const QUALITY_HIGH = new ConstImpl("Titanium.Media.QUALITY_HIGH");

	public static final Const QUALITY_LOW = new ConstImpl("Titanium.Media.QUALITY_LOW");

	public static final Const QUALITY_MEDIUM = new ConstImpl("Titanium.Media.QUALITY_MEDIUM");

	public static final Const UNKNOWN_ERROR = new ConstImpl("Titanium.Media.UNKNOWN_ERROR");

	public static final Const VIDEO_CONTROL_DEFAULT = new ConstImpl("Titanium.Media.VIDEO_CONTROL_DEFAULT");

	public static final Const VIDEO_CONTROL_EMBEDDED = new ConstImpl("Titanium.Media.VIDEO_CONTROL_EMBEDDED");

	public static final Const VIDEO_CONTROL_FULLSCREEN = new ConstImpl("Titanium.Media.VIDEO_CONTROL_FULLSCREEN");

	public static final Const VIDEO_CONTROL_HIDDEN = new ConstImpl("Titanium.Media.VIDEO_CONTROL_HIDDEN");

	public static final Const VIDEO_CONTROL_NONE = new ConstImpl("Titanium.Media.VIDEO_CONTROL_NONE");

	public static final Const VIDEO_CONTROL_VOLUME_ONLY = new ConstImpl("Titanium.Media.VIDEO_CONTROL_VOLUME_ONLY");

	public static final Const VIDEO_FINISH_REASON_PLAYBACK_ENDED = new ConstImpl(
			"Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED");

	public static final Const VIDEO_FINISH_REASON_PLAYBACK_ERROR = new ConstImpl(
			"Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR");

	public static final Const VIDEO_FINISH_REASON_USER_EXITED = new ConstImpl(
			"Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED");

	public static final Const VIDEO_LOAD_STATE_PLAYABLE = new ConstImpl("Titanium.Media.VIDEO_LOAD_STATE_PLAYABLE");

	public static final Const VIDEO_LOAD_STATE_PLAYTHROUGH_OK = new ConstImpl(
			"Titanium.Media.VIDEO_LOAD_STATE_PLAYTHROUGH_OK");

	public static final Const VIDEO_LOAD_STATE_STALLED = new ConstImpl("Titanium.Media.VIDEO_LOAD_STATE_STALLED");

	public static final Const VIDEO_LOAD_STATE_UNKNOWN = new ConstImpl("Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN");

	public static final Const VIDEO_MEDIA_TYPE_AUDIO = new ConstImpl("Titanium.Media.VIDEO_MEDIA_TYPE_AUDIO");

	public static final Const VIDEO_MEDIA_TYPE_NONE = new ConstImpl("Titanium.Media.VIDEO_MEDIA_TYPE_NONE");

	public static final Const VIDEO_MEDIA_TYPE_VIDEO = new ConstImpl("Titanium.Media.VIDEO_MEDIA_TYPE_VIDEO");

	public static final Const VIDEO_PLAYBACK_STATE_INTERRUPTED = new ConstImpl(
			"Titanium.Media.VIDEO_PLAYBACK_STATE_INTERRUPTED");

	public static final Const VIDEO_PLAYBACK_STATE_PAUSED = new ConstImpl("Titanium.Media.VIDEO_PLAYBACK_STATE_PAUSED");

	public static final Const VIDEO_PLAYBACK_STATE_PLAYING = new ConstImpl(
			"Titanium.Media.VIDEO_PLAYBACK_STATE_PLAYING");

	public static final Const VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD = new ConstImpl(
			"Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD");

	public static final Const VIDEO_PLAYBACK_STATE_SEEKING_FORWARD = new ConstImpl(
			"Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_FORWARD");

	public static final Const VIDEO_PLAYBACK_STATE_STOPPED = new ConstImpl(
			"Titanium.Media.VIDEO_PLAYBACK_STATE_STOPPED");

	public static final Const VIDEO_REPEAT_MODE_NONE = new ConstImpl("Titanium.Media.VIDEO_REPEAT_MODE_NONE");

	public static final Const VIDEO_REPEAT_MODE_ONE = new ConstImpl("Titanium.Media.VIDEO_REPEAT_MODE_ONE");

	public static final Const VIDEO_SCALING_ASPECT_FILL = new ConstImpl("Titanium.Media.VIDEO_SCALING_ASPECT_FILL");

	public static final Const VIDEO_SCALING_ASPECT_FIT = new ConstImpl("Titanium.Media.VIDEO_SCALING_ASPECT_FIT");

	public static final Const VIDEO_SCALING_MODE_FILL = new ConstImpl("Titanium.Media.VIDEO_SCALING_MODE_FILL");

	public static final Const VIDEO_SCALING_NONE = new ConstImpl("Titanium.Media.VIDEO_SCALING_NONE");

	public static final Const VIDEO_SOURCE_TYPE_FILE = new ConstImpl("Titanium.Media.VIDEO_SOURCE_TYPE_FILE");

	public static final Const VIDEO_SOURCE_TYPE_STREAMING = new ConstImpl("Titanium.Media.VIDEO_SOURCE_TYPE_STREAMING");

	public static final Const VIDEO_SOURCE_TYPE_UNKNOWN = new ConstImpl("Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN");

	public static final Const VIDEO_TIME_OPTION_EXACT = new ConstImpl("Titanium.Media.VIDEO_TIME_OPTION_EXACT");

	public static final Const VIDEO_TIME_OPTION_NEAREST_KEYFRAME = new ConstImpl(
			"Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME");

	/**
	 * @return An instance of {@link org.urish.gwtit.titanium.media.musicplayer}
	 *         representing the app-specific music player. iphone/ipad only
	 */
	public static native Object getAppMusicPlayer()
	/*-{
		return Titanium.Media.appMusicPlayer;
	}-*/;

	public static native void setAppMusicPlayer(Object value)
	/*-{
		Titanium.Media.appMusicPlayer = value;
	}-*/;

	/**
	 * @return Returns the line type constant for the current line type
	 */
	public static native float getAudioLineType()
	/*-{
		return Titanium.Media.audioLineType;
	}-*/;

	public static native void setAudioLineType(float value)
	/*-{
		Titanium.Media.audioLineType = value;
	}-*/;

	/**
	 * @return Returns true if the device is playing audio
	 */
	public static native boolean getAudioPlaying()
	/*-{
		return Titanium.Media.audioPlaying;
	}-*/;

	public static native void setAudioPlaying(boolean value)
	/*-{
		Titanium.Media.audioPlaying = value;
	}-*/;

	/**
	 * @return A constant for the audio session mode to be used. must be set
	 *         while the audio session is inactive (no sounds are playing, no
	 *         listeners for audio properties on the media module, but the ipod
	 *         may be active).
	 */
	public static native float getAudioSessionMode()
	/*-{
		return Titanium.Media.audioSessionMode;
	}-*/;

	public static native void setAudioSessionMode(float value)
	/*-{
		Titanium.Media.audioSessionMode = value;
	}-*/;

	/**
	 * @return Return an array of media type constants supported for the camera
	 */
	public static native Object[] getAvailableCameraMediaTypes()
	/*-{
		return Titanium.Media.availableCameraMediaTypes;
	}-*/;

	public static native void setAvailableCameraMediaTypes(Object[] value)
	/*-{
		Titanium.Media.availableCameraMediaTypes = value;
	}-*/;

	/**
	 * @return Return an array of media type constants supported for saving to
	 *         the photo gallery
	 */
	public static native Object[] getAvailablePhotoGalleryMediaTypes()
	/*-{
		return Titanium.Media.availablePhotoGalleryMediaTypes;
	}-*/;

	public static native void setAvailablePhotoGalleryMediaTypes(Object[] value)
	/*-{
		Titanium.Media.availablePhotoGalleryMediaTypes = value;
	}-*/;

	/**
	 * @return Return an array of media type constants supported for the photo
	 */
	public static native Object[] getAvailablePhotoMediaTypes()
	/*-{
		return Titanium.Media.availablePhotoMediaTypes;
	}-*/;

	public static native void setAvailablePhotoMediaTypes(Object[] value)
	/*-{
		Titanium.Media.availablePhotoMediaTypes = value;
	}-*/;

	/**
	 * @return Return the current average microphone level in db or -1 if
	 *         microphone monitoring is disabled
	 */
	public static native float getAverageMicrophonePower()
	/*-{
		return Titanium.Media.averageMicrophonePower;
	}-*/;

	public static native void setAverageMicrophonePower(float value)
	/*-{
		Titanium.Media.averageMicrophonePower = value;
	}-*/;

	/**
	 * @return Returns true if the device has recording input device available
	 */
	public static native boolean getCanRecord()
	/*-{
		return Titanium.Media.canRecord;
	}-*/;

	public static native void setCanRecord(boolean value)
	/*-{
		Titanium.Media.canRecord = value;
	}-*/;

	/**
	 * @return Returns true if the device has camera support
	 */
	public static native boolean getIsCameraSupported()
	/*-{
		return Titanium.Media.isCameraSupported;
	}-*/;

	public static native void setIsCameraSupported(boolean value)
	/*-{
		Titanium.Media.isCameraSupported = value;
	}-*/;

	/**
	 * @return Return the current microphone level peak power in db or -1 if
	 *         microphone monitoring is disabled
	 */
	public static native float getPeakMicrophonePower()
	/*-{
		return Titanium.Media.peakMicrophonePower;
	}-*/;

	public static native void setPeakMicrophonePower(float value)
	/*-{
		Titanium.Media.peakMicrophonePower = value;
	}-*/;

	/**
	 * @return An instance of {@link org.urish.gwtit.titanium.media.musicplayer}
	 *         representing the system-wide music player. iphone/ipad only
	 */
	public static native Object getSystemMusicPlayer()
	/*-{
		return Titanium.Media.systemMusicPlayer;
	}-*/;

	public static native void setSystemMusicPlayer(Object value)
	/*-{
		Titanium.Media.systemMusicPlayer = value;
	}-*/;

	/**
	 * @return The current volume of the playback device
	 */
	public static native float getVolume()
	/*-{
		return Titanium.Media.volume;
	}-*/;

	public static native void setVolume(float value)
	/*-{
		Titanium.Media.volume = value;
	}-*/;

	public static native org.urish.gwtit.titanium.media.AudioPlayer createAudioPlayer()
	/*-{
		return Titanium.Media.createAudioPlayer();
	}-*/;

	public static native org.urish.gwtit.titanium.media.AudioRecorder createAudioRecorder()
	/*-{
		return Titanium.Media.createAudioRecorder();
	}-*/;

	public static native org.urish.gwtit.titanium.media.Item createItem()
	/*-{
		return Titanium.Media.createItem();
	}-*/;

	public static native org.urish.gwtit.titanium.media.MusicPlayer createMusicPlayer()
	/*-{
		return Titanium.Media.createMusicPlayer();
	}-*/;

	public static native org.urish.gwtit.titanium.media.Sound createSound()
	/*-{
		return Titanium.Media.createSound();
	}-*/;

	public static native org.urish.gwtit.titanium.media.VideoPlayer createVideoPlayer()
	/*-{
		return Titanium.Media.createVideoPlayer();
	}-*/;

	public static native org.urish.gwtit.titanium.media.Android createAndroid()
	/*-{
		return Titanium.Media.createAndroid();
	}-*/;

	/**
	 * Play a device beep notification
	 */
	public static native void beep()
	/*-{
		return Titanium.Media.beep();
	}-*/;

	/**
	 * Hide the device camera ui. this must be called after calling `showcamera`
	 * and only when `autohide` is set to false. this method will cause the
	 * media capture device be hidden.
	 */
	public static native void hideCamera()
	/*-{
		return Titanium.Media.hideCamera();
	}-*/;

	/**
	 * Hide the music library. this must be called after calling
	 * `showmusiclibrary` and only when `autohide` is set to false. iphone and
	 * ipad only.
	 */
	public static native void hideMusicLibrary()
	/*-{
		return Titanium.Media.hideMusicLibrary();
	}-*/;

	/**
	 * Return boolean to indicate if the media type is supported
	 * 
	 * @param media
	 *            media type as a string of either `camera`, `photo` or
	 *            `photogallery`.
	 * @param type
	 *            the type of media to check
	 */
	public static native boolean isMediaTypeSupported(String media, String type)
	/*-{
		return Titanium.Media.isMediaTypeSupported(media, type);
	}-*/;

	/**
	 * Open the photo gallery picker
	 * 
	 * @param options
	 *            pass a dictionary with the following supported keys: `success`
	 *            a function that will be called when the camera is completed,
	 *            `error` a function that will be called upon receiving an
	 *            error, `cancel` a function that will be called if the user
	 *            presses the cancel button, `autohide` boolean if the camera
	 *            should auto hide after the media capture is completed
	 *            (defaults to true), `animated` boolean if the dialog should be
	 *            animated (defaults to true) upon showing and hiding,
	 *            `saveToPhotoGallery` boolean if the media should be saved to
	 *            the photo gallery upon successful capture, `allowEditing`
	 *            boolean if the media should be editable after capture in the
	 *            UI interface, `mediaTypes` an array of media type constants
	 *            supported by the capture device UI, `showControls` boolean to
	 *            indicate if the built-in UI controls should be displayed,
	 *            `overlay` view which is added as an overlay to the UI (on
	 *            top), `transform` an transformation matrix that applies to the
	 *            UI transform. For iPad, `popoverView` can be provided to
	 *            position the photo gallery popover a specific view and
	 *            `arrowDirection` can be provided to control the type of arrow
	 *            and position of the gallery.
	 */
	public static native void openPhotoGallery(Object options)
	/*-{
		return Titanium.Media.openPhotoGallery(options);
	}-*/;

	/**
	 * Save media to photo gallery / camera roll
	 * 
	 * @param media
	 *            save the media passed to the cameras photo roll/media gallery.
	 *            must be one of Blob object or File object or an error will be
	 *            generated.
	 * @param callbacks
	 *            pass a dictionary with the following supported keys: `success`
	 *            a function that will be called when the save succeeds, and
	 *            `error` a function that will be called upon anreceiving an
	 *            error
	 */
	public static native void saveToPhotoGallery(Object media, Object callbacks)
	/*-{
		return Titanium.Media.saveToPhotoGallery(media, callbacks);
	}-*/;

	/**
	 * Show the camera
	 * 
	 * @param options
	 *            pass a dictionary with the following supported keys: `success`
	 *            a function that will be called when the camera is completed,
	 *            `error` a function that will be called upon receiving an
	 *            error, `cancel` a function that will be called if the user
	 *            presses the cancel button, `autohide` boolean if the camera
	 *            should auto hide after the media capture is completed
	 *            (defaults to true), `animated` boolean if the dialog should be
	 *            animated (defaults to true) upon showing and hiding,
	 *            `saveToPhotoGallery` boolean if the media should be saved to
	 *            the photo gallery upon successful capture, `allowEditing`
	 *            boolean if the media should be editable after capture in the
	 *            UI interface, `mediaTypes` an array of media type constants
	 *            supported by the capture device UI, `videoMaximumDuration`
	 *            float duration on how long in milliseconds to allow capture
	 *            before completing, `videoQuality` constant to indicate the
	 *            video quality during capture, `showControls` boolean to
	 *            indicate if the built-in UI controls should be displayed,
	 *            `overlay` view which is added as an overlay to the camera UI
	 *            (on top), `transform` an transformation matrix that applies to
	 *            the camera UI transform.
	 */
	public static native void showCamera(Object options)
	/*-{
		return Titanium.Media.showCamera(options);
	}-*/;

	/**
	 * Show the music library. iphone and ipad only.
	 * 
	 * @platforms iphone, ipad
	 * @param options
	 *            pass a dictionary with the following supported keys: `success`
	 *            a function that will be called when the camera is completed,
	 *            `error` a function that will be called upon receiving an
	 *            error, `cancel` a function that will be called if the user
	 *            presses the cancel button, `autohide` boolean if the library
	 *            listing should auto hide after selection is completed
	 *            (defaults to true), `animated` boolean if the dialog should be
	 *            animated (defaults to true) upon showing and hiding,
	 *            `mediaTypes` an array of media type constants defining
	 *            selectable media (see MUSIC_MEDIA_TYPE_* properties below) as
	 *            either an array or a bitwise-or single value,
	 *            `allowMultipleSelections` boolean whether or not more than one
	 *            media selection is allowed
	 */
	public static native void showMusicLibrary(Object options)
	/*-{
		return Titanium.Media.showMusicLibrary(options);
	}-*/;

	/**
	 * Start the monitoring of microphone sound level
	 */
	public static native void startMicrophoneMonitor()
	/*-{
		return Titanium.Media.startMicrophoneMonitor();
	}-*/;

	/**
	 * Stop the monitoring of microphone sound level
	 */
	public static native void stopMicrophoneMonitor()
	/*-{
		return Titanium.Media.stopMicrophoneMonitor();
	}-*/;

	/**
	 * Use the device camera to capture a photo. this must be called after
	 * calling `showcamera` and only when `autohide` is set to false. this
	 * method will cause the media capture device to capture a photo and call
	 * the `success` callback.
	 */
	public static native void takePicture()
	/*-{
		return Titanium.Media.takePicture();
	}-*/;

	/**
	 * Take a screen shot of the visible ui on the device
	 * 
	 * @param callback
	 *            function that will be called upon capture. the event property
	 *            `media` will contain an image Blob object of the screenshot
	 */
	public static native void takeScreenshot(Object callback)
	/*-{
		return Titanium.Media.takeScreenshot(callback);
	}-*/;

	/**
	 * Play a device vibration
	 */
	public static native void vibrate()
	/*-{
		return Titanium.Media.vibrate();
	}-*/;

	public static native void addLinechangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Media.addEventListener('linechange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public static native void addRecordinginputHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Media.addEventListener('recordinginput', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public static native void addVolumeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Media.addEventListener('volume', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
