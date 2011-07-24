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

import org.urish.gwtit.client.EventCallback;

/**
 * The top level media module. the media module is used accessing the device's
 * media related functionality such as playing audio or recording video.
 * 
 * @since 0.1
 */
public class Media extends org.urish.gwtit.titanium.Module {
	protected Media() {
	}

	private static native final float value_AUDIO_FILEFORMAT_3GP2()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GP2;
	}-*/;

	public static final float AUDIO_FILEFORMAT_3GP2 = value_AUDIO_FILEFORMAT_3GP2();

	private static native final float value_AUDIO_FILEFORMAT_3GPP()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GPP;
	}-*/;

	public static final float AUDIO_FILEFORMAT_3GPP = value_AUDIO_FILEFORMAT_3GPP();

	private static native final float value_AUDIO_FILEFORMAT_AIFF()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AIFF;
	}-*/;

	public static final float AUDIO_FILEFORMAT_AIFF = value_AUDIO_FILEFORMAT_AIFF();

	private static native final float value_AUDIO_FILEFORMAT_AMR()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AMR;
	}-*/;

	public static final float AUDIO_FILEFORMAT_AMR = value_AUDIO_FILEFORMAT_AMR();

	private static native final float value_AUDIO_FILEFORMAT_CAF()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_CAF;
	}-*/;

	public static final float AUDIO_FILEFORMAT_CAF = value_AUDIO_FILEFORMAT_CAF();

	private static native final float value_AUDIO_FILEFORMAT_MP3()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP3;
	}-*/;

	public static final float AUDIO_FILEFORMAT_MP3 = value_AUDIO_FILEFORMAT_MP3();

	private static native final float value_AUDIO_FILEFORMAT_MP4()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4;
	}-*/;

	public static final float AUDIO_FILEFORMAT_MP4 = value_AUDIO_FILEFORMAT_MP4();

	private static native final float value_AUDIO_FILEFORMAT_MP4A()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4A;
	}-*/;

	public static final float AUDIO_FILEFORMAT_MP4A = value_AUDIO_FILEFORMAT_MP4A();

	private static native final float value_AUDIO_FILEFORMAT_WAVE()
	/*-{
		return Titanium.Media.AUDIO_FILEFORMAT_WAVE;
	}-*/;

	public static final float AUDIO_FILEFORMAT_WAVE = value_AUDIO_FILEFORMAT_WAVE();

	private static native final float value_AUDIO_FORMAT_AAC()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_AAC;
	}-*/;

	public static final float AUDIO_FORMAT_AAC = value_AUDIO_FORMAT_AAC();

	private static native final float value_AUDIO_FORMAT_ALAW()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_ALAW;
	}-*/;

	public static final float AUDIO_FORMAT_ALAW = value_AUDIO_FORMAT_ALAW();

	private static native final float value_AUDIO_FORMAT_APPLE_LOSSLESS()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_APPLE_LOSSLESS;
	}-*/;

	public static final float AUDIO_FORMAT_APPLE_LOSSLESS = value_AUDIO_FORMAT_APPLE_LOSSLESS();

	private static native final float value_AUDIO_FORMAT_ILBC()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_ILBC;
	}-*/;

	public static final float AUDIO_FORMAT_ILBC = value_AUDIO_FORMAT_ILBC();

	private static native final float value_AUDIO_FORMAT_IMA4()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_IMA4;
	}-*/;

	public static final float AUDIO_FORMAT_IMA4 = value_AUDIO_FORMAT_IMA4();

	private static native final float value_AUDIO_FORMAT_LINEAR_PCM()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_LINEAR_PCM;
	}-*/;

	public static final float AUDIO_FORMAT_LINEAR_PCM = value_AUDIO_FORMAT_LINEAR_PCM();

	private static native final float value_AUDIO_FORMAT_ULAW()
	/*-{
		return Titanium.Media.AUDIO_FORMAT_ULAW;
	}-*/;

	public static final float AUDIO_FORMAT_ULAW = value_AUDIO_FORMAT_ULAW();

	private static native final float value_AUDIO_HEADPHONES()
	/*-{
		return Titanium.Media.AUDIO_HEADPHONES;
	}-*/;

	public static final float AUDIO_HEADPHONES = value_AUDIO_HEADPHONES();

	private static native final float value_AUDIO_HEADPHONES_AND_MIC()
	/*-{
		return Titanium.Media.AUDIO_HEADPHONES_AND_MIC;
	}-*/;

	public static final float AUDIO_HEADPHONES_AND_MIC = value_AUDIO_HEADPHONES_AND_MIC();

	private static native final float value_AUDIO_HEADSET_INOUT()
	/*-{
		return Titanium.Media.AUDIO_HEADSET_INOUT;
	}-*/;

	public static final float AUDIO_HEADSET_INOUT = value_AUDIO_HEADSET_INOUT();

	private static native final float value_AUDIO_LINEOUT()
	/*-{
		return Titanium.Media.AUDIO_LINEOUT;
	}-*/;

	public static final float AUDIO_LINEOUT = value_AUDIO_LINEOUT();

	private static native final float value_AUDIO_MICROPHONE()
	/*-{
		return Titanium.Media.AUDIO_MICROPHONE;
	}-*/;

	public static final float AUDIO_MICROPHONE = value_AUDIO_MICROPHONE();

	private static native final float value_AUDIO_MUTED()
	/*-{
		return Titanium.Media.AUDIO_MUTED;
	}-*/;

	public static final float AUDIO_MUTED = value_AUDIO_MUTED();

	private static native final float value_AUDIO_RECEIVER_AND_MIC()
	/*-{
		return Titanium.Media.AUDIO_RECEIVER_AND_MIC;
	}-*/;

	public static final float AUDIO_RECEIVER_AND_MIC = value_AUDIO_RECEIVER_AND_MIC();

	private static native final float value_AUDIO_SESSION_MODE_AMBIENT()
	/*-{
		return Titanium.Media.AUDIO_SESSION_MODE_AMBIENT;
	}-*/;

	public static final float AUDIO_SESSION_MODE_AMBIENT = value_AUDIO_SESSION_MODE_AMBIENT();

	private static native final float value_AUDIO_SESSION_MODE_PLAYBACK()
	/*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAYBACK;
	}-*/;

	public static final float AUDIO_SESSION_MODE_PLAYBACK = value_AUDIO_SESSION_MODE_PLAYBACK();

	private static native final float value_AUDIO_SESSION_MODE_PLAY_AND_RECORD()
	/*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAY_AND_RECORD;
	}-*/;

	public static final float AUDIO_SESSION_MODE_PLAY_AND_RECORD = value_AUDIO_SESSION_MODE_PLAY_AND_RECORD();

	private static native final float value_AUDIO_SESSION_MODE_RECORD()
	/*-{
		return Titanium.Media.AUDIO_SESSION_MODE_RECORD;
	}-*/;

	public static final float AUDIO_SESSION_MODE_RECORD = value_AUDIO_SESSION_MODE_RECORD();

	private static native final float value_AUDIO_SESSION_MODE_SOLO_AMBIENT()
	/*-{
		return Titanium.Media.AUDIO_SESSION_MODE_SOLO_AMBIENT;
	}-*/;

	public static final float AUDIO_SESSION_MODE_SOLO_AMBIENT = value_AUDIO_SESSION_MODE_SOLO_AMBIENT();

	private static native final float value_AUDIO_SPEAKER()
	/*-{
		return Titanium.Media.AUDIO_SPEAKER;
	}-*/;

	public static final float AUDIO_SPEAKER = value_AUDIO_SPEAKER();

	private static native final float value_AUDIO_UNAVAILABLE()
	/*-{
		return Titanium.Media.AUDIO_UNAVAILABLE;
	}-*/;

	public static final float AUDIO_UNAVAILABLE = value_AUDIO_UNAVAILABLE();

	private static native final float value_AUDIO_UNKNOWN()
	/*-{
		return Titanium.Media.AUDIO_UNKNOWN;
	}-*/;

	public static final float AUDIO_UNKNOWN = value_AUDIO_UNKNOWN();

	private static native final float value_DEVICE_BUSY()
	/*-{
		return Titanium.Media.DEVICE_BUSY;
	}-*/;

	public static final float DEVICE_BUSY = value_DEVICE_BUSY();

	private static native final float value_MEDIA_TYPE_PHOTO()
	/*-{
		return Titanium.Media.MEDIA_TYPE_PHOTO;
	}-*/;

	public static final float MEDIA_TYPE_PHOTO = value_MEDIA_TYPE_PHOTO();

	private static native final float value_MEDIA_TYPE_VIDEO()
	/*-{
		return Titanium.Media.MEDIA_TYPE_VIDEO;
	}-*/;

	public static final float MEDIA_TYPE_VIDEO = value_MEDIA_TYPE_VIDEO();

	private static native final float value_MUSIC_MEDIA_TYPE_ALL()
	/*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ALL;
	}-*/;

	public static final float MUSIC_MEDIA_TYPE_ALL = value_MUSIC_MEDIA_TYPE_ALL();

	private static native final float value_MUSIC_MEDIA_TYPE_ANY_AUDIO()
	/*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ANY_AUDIO;
	}-*/;

	public static final float MUSIC_MEDIA_TYPE_ANY_AUDIO = value_MUSIC_MEDIA_TYPE_ANY_AUDIO();

	private static native final float value_MUSIC_MEDIA_TYPE_AUDIOBOOK()
	/*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_AUDIOBOOK;
	}-*/;

	public static final float MUSIC_MEDIA_TYPE_AUDIOBOOK = value_MUSIC_MEDIA_TYPE_AUDIOBOOK();

	private static native final float value_MUSIC_MEDIA_TYPE_MUSIC()
	/*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_MUSIC;
	}-*/;

	public static final float MUSIC_MEDIA_TYPE_MUSIC = value_MUSIC_MEDIA_TYPE_MUSIC();

	private static native final float value_MUSIC_MEDIA_TYPE_PODCAST()
	/*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST;
	}-*/;

	public static final float MUSIC_MEDIA_TYPE_PODCAST = value_MUSIC_MEDIA_TYPE_PODCAST();

	private static native final float value_MUSIC_PLAYER_REPEAT_ALL()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ALL;
	}-*/;

	public static final float MUSIC_PLAYER_REPEAT_ALL = value_MUSIC_PLAYER_REPEAT_ALL();

	private static native final float value_MUSIC_PLAYER_REPEAT_DEFAULT()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT;
	}-*/;

	public static final float MUSIC_PLAYER_REPEAT_DEFAULT = value_MUSIC_PLAYER_REPEAT_DEFAULT();

	private static native final float value_MUSIC_PLAYER_REPEAT_NONE()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_NONE;
	}-*/;

	public static final float MUSIC_PLAYER_REPEAT_NONE = value_MUSIC_PLAYER_REPEAT_NONE();

	private static native final float value_MUSIC_PLAYER_REPEAT_ONE()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ONE;
	}-*/;

	public static final float MUSIC_PLAYER_REPEAT_ONE = value_MUSIC_PLAYER_REPEAT_ONE();

	private static native final float value_MUSIC_PLAYER_SHUFFLE_ALBUMS()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS;
	}-*/;

	public static final float MUSIC_PLAYER_SHUFFLE_ALBUMS = value_MUSIC_PLAYER_SHUFFLE_ALBUMS();

	private static native final float value_MUSIC_PLAYER_SHUFFLE_DEFAULT()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT;
	}-*/;

	public static final float MUSIC_PLAYER_SHUFFLE_DEFAULT = value_MUSIC_PLAYER_SHUFFLE_DEFAULT();

	private static native final float value_MUSIC_PLAYER_SHUFFLE_NONE()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE;
	}-*/;

	public static final float MUSIC_PLAYER_SHUFFLE_NONE = value_MUSIC_PLAYER_SHUFFLE_NONE();

	private static native final float value_MUSIC_PLAYER_SHUFFLE_SONGS()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS;
	}-*/;

	public static final float MUSIC_PLAYER_SHUFFLE_SONGS = value_MUSIC_PLAYER_SHUFFLE_SONGS();

	private static native final float value_MUSIC_PLAYER_STATE_INTERRUPTED()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_INTERRUPTED = value_MUSIC_PLAYER_STATE_INTERRUPTED();

	private static native final float value_MUSIC_PLAYER_STATE_PAUSED()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PAUSED;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_PAUSED = value_MUSIC_PLAYER_STATE_PAUSED();

	private static native final float value_MUSIC_PLAYER_STATE_PLAYING()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PLAYING;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_PLAYING = value_MUSIC_PLAYER_STATE_PLAYING();

	private static native final float value_MUSIC_PLAYER_STATE_SEEK_BACKWARD()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_SEEK_BACKWARD = value_MUSIC_PLAYER_STATE_SEEK_BACKWARD();

	private static native final float value_MUSIC_PLAYER_STATE_SKEEK_FORWARD()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_SKEEK_FORWARD = value_MUSIC_PLAYER_STATE_SKEEK_FORWARD();

	private static native final float value_MUSIC_PLAYER_STATE_STOPPED()
	/*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_STOPPED;
	}-*/;

	public static final float MUSIC_PLAYER_STATE_STOPPED = value_MUSIC_PLAYER_STATE_STOPPED();

	private static native final float value_NO_CAMERA()
	/*-{
		return Titanium.Media.NO_CAMERA;
	}-*/;

	public static final float NO_CAMERA = value_NO_CAMERA();

	private static native final float value_NO_VIDEO()
	/*-{
		return Titanium.Media.NO_VIDEO;
	}-*/;

	public static final float NO_VIDEO = value_NO_VIDEO();

	private static native final float value_QUALITY_HIGH()
	/*-{
		return Titanium.Media.QUALITY_HIGH;
	}-*/;

	public static final float QUALITY_HIGH = value_QUALITY_HIGH();

	private static native final float value_QUALITY_LOW()
	/*-{
		return Titanium.Media.QUALITY_LOW;
	}-*/;

	public static final float QUALITY_LOW = value_QUALITY_LOW();

	private static native final float value_QUALITY_MEDIUM()
	/*-{
		return Titanium.Media.QUALITY_MEDIUM;
	}-*/;

	public static final float QUALITY_MEDIUM = value_QUALITY_MEDIUM();

	private static native final float value_UNKNOWN_ERROR()
	/*-{
		return Titanium.Media.UNKNOWN_ERROR;
	}-*/;

	public static final float UNKNOWN_ERROR = value_UNKNOWN_ERROR();

	private static native final float value_VIDEO_CONTROL_DEFAULT()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_DEFAULT;
	}-*/;

	public static final float VIDEO_CONTROL_DEFAULT = value_VIDEO_CONTROL_DEFAULT();

	private static native final float value_VIDEO_CONTROL_EMBEDDED()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_EMBEDDED;
	}-*/;

	public static final float VIDEO_CONTROL_EMBEDDED = value_VIDEO_CONTROL_EMBEDDED();

	private static native final float value_VIDEO_CONTROL_FULLSCREEN()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_FULLSCREEN;
	}-*/;

	public static final float VIDEO_CONTROL_FULLSCREEN = value_VIDEO_CONTROL_FULLSCREEN();

	private static native final float value_VIDEO_CONTROL_HIDDEN()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_HIDDEN;
	}-*/;

	public static final float VIDEO_CONTROL_HIDDEN = value_VIDEO_CONTROL_HIDDEN();

	private static native final float value_VIDEO_CONTROL_NONE()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_NONE;
	}-*/;

	public static final float VIDEO_CONTROL_NONE = value_VIDEO_CONTROL_NONE();

	private static native final float value_VIDEO_CONTROL_VOLUME_ONLY()
	/*-{
		return Titanium.Media.VIDEO_CONTROL_VOLUME_ONLY;
	}-*/;

	public static final float VIDEO_CONTROL_VOLUME_ONLY = value_VIDEO_CONTROL_VOLUME_ONLY();

	private static native final float value_VIDEO_FINISH_REASON_PLAYBACK_ENDED()
	/*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED;
	}-*/;

	public static final float VIDEO_FINISH_REASON_PLAYBACK_ENDED = value_VIDEO_FINISH_REASON_PLAYBACK_ENDED();

	private static native final float value_VIDEO_FINISH_REASON_PLAYBACK_ERROR()
	/*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR;
	}-*/;

	public static final float VIDEO_FINISH_REASON_PLAYBACK_ERROR = value_VIDEO_FINISH_REASON_PLAYBACK_ERROR();

	private static native final float value_VIDEO_FINISH_REASON_USER_EXITED()
	/*-{
		return Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED;
	}-*/;

	public static final float VIDEO_FINISH_REASON_USER_EXITED = value_VIDEO_FINISH_REASON_USER_EXITED();

	private static native final float value_VIDEO_LOAD_STATE_PLAYABLE()
	/*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYABLE;
	}-*/;

	public static final float VIDEO_LOAD_STATE_PLAYABLE = value_VIDEO_LOAD_STATE_PLAYABLE();

	private static native final float value_VIDEO_LOAD_STATE_PLAYTHROUGH_OK()
	/*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYTHROUGH_OK;
	}-*/;

	public static final float VIDEO_LOAD_STATE_PLAYTHROUGH_OK = value_VIDEO_LOAD_STATE_PLAYTHROUGH_OK();

	private static native final float value_VIDEO_LOAD_STATE_STALLED()
	/*-{
		return Titanium.Media.VIDEO_LOAD_STATE_STALLED;
	}-*/;

	public static final float VIDEO_LOAD_STATE_STALLED = value_VIDEO_LOAD_STATE_STALLED();

	private static native final float value_VIDEO_LOAD_STATE_UNKNOWN()
	/*-{
		return Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN;
	}-*/;

	public static final float VIDEO_LOAD_STATE_UNKNOWN = value_VIDEO_LOAD_STATE_UNKNOWN();

	private static native final float value_VIDEO_MEDIA_TYPE_AUDIO()
	/*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_AUDIO;
	}-*/;

	public static final float VIDEO_MEDIA_TYPE_AUDIO = value_VIDEO_MEDIA_TYPE_AUDIO();

	private static native final float value_VIDEO_MEDIA_TYPE_NONE()
	/*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_NONE;
	}-*/;

	public static final float VIDEO_MEDIA_TYPE_NONE = value_VIDEO_MEDIA_TYPE_NONE();

	private static native final float value_VIDEO_MEDIA_TYPE_VIDEO()
	/*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_VIDEO;
	}-*/;

	public static final float VIDEO_MEDIA_TYPE_VIDEO = value_VIDEO_MEDIA_TYPE_VIDEO();

	private static native final float value_VIDEO_PLAYBACK_STATE_INTERRUPTED()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_INTERRUPTED;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_INTERRUPTED = value_VIDEO_PLAYBACK_STATE_INTERRUPTED();

	private static native final float value_VIDEO_PLAYBACK_STATE_PAUSED()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PAUSED;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_PAUSED = value_VIDEO_PLAYBACK_STATE_PAUSED();

	private static native final float value_VIDEO_PLAYBACK_STATE_PLAYING()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PLAYING;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_PLAYING = value_VIDEO_PLAYBACK_STATE_PLAYING();

	private static native final float value_VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD = value_VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD();

	private static native final float value_VIDEO_PLAYBACK_STATE_SEEKING_FORWARD()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_FORWARD;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_SEEKING_FORWARD = value_VIDEO_PLAYBACK_STATE_SEEKING_FORWARD();

	private static native final float value_VIDEO_PLAYBACK_STATE_STOPPED()
	/*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_STOPPED;
	}-*/;

	public static final float VIDEO_PLAYBACK_STATE_STOPPED = value_VIDEO_PLAYBACK_STATE_STOPPED();

	private static native final float value_VIDEO_REPEAT_MODE_NONE()
	/*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_NONE;
	}-*/;

	public static final float VIDEO_REPEAT_MODE_NONE = value_VIDEO_REPEAT_MODE_NONE();

	private static native final float value_VIDEO_REPEAT_MODE_ONE()
	/*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_ONE;
	}-*/;

	public static final float VIDEO_REPEAT_MODE_ONE = value_VIDEO_REPEAT_MODE_ONE();

	private static native final float value_VIDEO_SCALING_ASPECT_FILL()
	/*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FILL;
	}-*/;

	public static final float VIDEO_SCALING_ASPECT_FILL = value_VIDEO_SCALING_ASPECT_FILL();

	private static native final float value_VIDEO_SCALING_ASPECT_FIT()
	/*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FIT;
	}-*/;

	public static final float VIDEO_SCALING_ASPECT_FIT = value_VIDEO_SCALING_ASPECT_FIT();

	private static native final float value_VIDEO_SCALING_MODE_FILL()
	/*-{
		return Titanium.Media.VIDEO_SCALING_MODE_FILL;
	}-*/;

	public static final float VIDEO_SCALING_MODE_FILL = value_VIDEO_SCALING_MODE_FILL();

	private static native final float value_VIDEO_SCALING_NONE()
	/*-{
		return Titanium.Media.VIDEO_SCALING_NONE;
	}-*/;

	public static final float VIDEO_SCALING_NONE = value_VIDEO_SCALING_NONE();

	private static native final float value_VIDEO_SOURCE_TYPE_FILE()
	/*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_FILE;
	}-*/;

	public static final float VIDEO_SOURCE_TYPE_FILE = value_VIDEO_SOURCE_TYPE_FILE();

	private static native final float value_VIDEO_SOURCE_TYPE_STREAMING()
	/*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_STREAMING;
	}-*/;

	public static final float VIDEO_SOURCE_TYPE_STREAMING = value_VIDEO_SOURCE_TYPE_STREAMING();

	private static native final float value_VIDEO_SOURCE_TYPE_UNKNOWN()
	/*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN;
	}-*/;

	public static final float VIDEO_SOURCE_TYPE_UNKNOWN = value_VIDEO_SOURCE_TYPE_UNKNOWN();

	private static native final float value_VIDEO_TIME_OPTION_EXACT()
	/*-{
		return Titanium.Media.VIDEO_TIME_OPTION_EXACT;
	}-*/;

	public static final float VIDEO_TIME_OPTION_EXACT = value_VIDEO_TIME_OPTION_EXACT();

	private static native final float value_VIDEO_TIME_OPTION_NEAREST_KEYFRAME()
	/*-{
		return Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME;
	}-*/;

	public static final float VIDEO_TIME_OPTION_NEAREST_KEYFRAME = value_VIDEO_TIME_OPTION_NEAREST_KEYFRAME();

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

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.Media.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.Media.removeEventListener(name, callbac);
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Media.fireEvent(name, event);
	}-*/;

	public final static class LinechangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "linechange";

		protected LinechangeEvent() {
		}

	}

	public static native void addLinechangeHandler(EventCallback<LinechangeEvent> handler)
	/*-{
		return Titanium.Media.addEventListener('linechange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class RecordinginputEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "recordinginput";

		protected RecordinginputEvent() {
		}

		/**
		 * bool indicating availability of recording device
		 */
		public final native Object getAvailable()
		/*-{
			return this.available;
		}-*/;

	}

	public static native void addRecordinginputHandler(EventCallback<RecordinginputEvent> handler)
	/*-{
		return Titanium.Media.addEventListener('recordinginput', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class VolumeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "volume";

		protected VolumeEvent() {
		}

		/**
		 * float of the new volume in dB
		 */
		public final native Object getVolume()
		/*-{
			return this.volume;
		}-*/;

	}

	public static native void addVolumeHandler(EventCallback<VolumeEvent> handler)
	/*-{
		return Titanium.Media.addEventListener('volume', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
