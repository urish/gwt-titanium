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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;
import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The audioplayer object is returned by
 * {@link org.urish.gwtit.titanium.media.createaudioplayer} and is used for
 * streaming audio to the device and low-level control of the audio playback.
 * 
 * @since 0.9
 */
public class AudioPlayer extends org.urish.gwtit.titanium.Proxy {
	protected AudioPlayer() {
	}

	public static final Const STATE_BUFFERING = new ConstImpl("Titanium.Media.AudioPlayer.STATE_BUFFERING");

	public static final Const STATE_INITIALIZED = new ConstImpl("Titanium.Media.AudioPlayer.STATE_INITIALIZED");

	public static final Const STATE_PAUSED = new ConstImpl("Titanium.Media.AudioPlayer.STATE_PAUSED");

	public static final Const STATE_PLAYING = new ConstImpl("Titanium.Media.AudioPlayer.STATE_PLAYING");

	public static final Const STATE_STARTING = new ConstImpl("Titanium.Media.AudioPlayer.STATE_STARTING");

	public static final Const STATE_STOPPED = new ConstImpl("Titanium.Media.AudioPlayer.STATE_STOPPED");

	public static final Const STATE_STOPPING = new ConstImpl("Titanium.Media.AudioPlayer.STATE_STOPPING");

	public static final Const STATE_WAITING_FOR_DATA = new ConstImpl(
			"Titanium.Media.AudioPlayer.STATE_WAITING_FOR_DATA");

	public static final Const STATE_WAITING_FOR_QUEUE = new ConstImpl(
			"Titanium.Media.AudioPlayer.STATE_WAITING_FOR_QUEUE");

	/**
	 * @return Boolean to indicate if audio should continue playing even if
	 *         activity is paused (android only as of 1.3.0)
	 */
	public native boolean getAllowBackground()
	/*-{
		return this.allowBackground;
	}-*/;

	public native void setAllowBackground(boolean value)
	/*-{
		this.allowBackground = value;
	}-*/;

	/**
	 * @return Bit rate of the current playback stream
	 */
	public native float getBitRate()
	/*-{
		return this.bitRate;
	}-*/;

	public native void setBitRate(float value)
	/*-{
		this.bitRate = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is idle
	 */
	public native boolean getIdle()
	/*-{
		return this.idle;
	}-*/;

	public native void setIdle(boolean value)
	/*-{
		this.idle = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is paused
	 */
	public native boolean getPaused()
	/*-{
		return this.paused;
	}-*/;

	public native void setPaused(boolean value)
	/*-{
		this.paused = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is streaming audio
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
	 * @return Returns the current playback progress. will return zero if
	 *         samplerate has not yet been detected
	 */
	public native float getProgress()
	/*-{
		return this.progress;
	}-*/;

	public native void setProgress(float value)
	/*-{
		this.progress = value;
	}-*/;

	/**
	 * @return Returns int for the current state of playback
	 */
	public native float getState()
	/*-{
		return this.state;
	}-*/;

	public native void setState(float value)
	/*-{
		this.state = value;
	}-*/;

	/**
	 * @return Returns the url for the current playback
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
	 * @return Returns boolean indicating if the playback is waiting for audio
	 *         data from the network
	 */
	public native boolean getWaiting()
	/*-{
		return this.waiting;
	}-*/;

	public native void setWaiting(boolean value)
	/*-{
		this.waiting = value;
	}-*/;

	/**
	 * @return The size of the buffer used for streaming, in bytes
	 * @platforms iphone, ipad
	 */
	public native float getBufferSize()
	/*-{
		return this.bufferSize;
	}-*/;

	public native void setBufferSize(float value)
	/*-{
		this.bufferSize = value;
	}-*/;

	/**
	 * Pause playback
	 */
	public native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Start playback
	 */
	public native void start()
	/*-{
		return this.start();
	}-*/;

	/**
	 * Convert a state into a textual description suitable for display
	 */
	public native String stateDescription()
	/*-{
		return this.stateDescription();
	}-*/;

	/**
	 * Stop playback
	 */
	public native void stop()
	/*-{
		return this.stop();
	}-*/;

	public native void addChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addProgressHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('progress', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
