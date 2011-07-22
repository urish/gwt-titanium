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
 * The sound object is returned by
 * {@link org.urish.gwtit.titanium.media.createsound} and is useful for playing
 * basic sounds. the sound object loads the entire media resource in memory
 * before playing. if you need to support streaming, use the
 * {@link org.urish.gwtit.titanium.media.createaudioplayer} api.
 * <p>
 * Notes: You can pass the property `preload` in the constructor as an object
 * property to cause the audio to be preloaded before `play` is invoked. For
 * larger audio files, this is recommended if you want the audio to begin
 * immediately when invoking `play`.
 * 
 * @since 0.8
 */
public class Sound extends org.urish.gwtit.titanium.Proxy {
	protected Sound() {
	}

	/**
	 * @return Boolean to indicate if audio should continue playing even if
	 *         activity is paused (android only as of 1.3.0)
	 * @platforms android
	 * @since 1.3.0
	 */
	public final native boolean getAllowBackground()
	/*-{
		return this.allowBackground;
	}-*/;

	public final native void setAllowBackground(boolean value)
	/*-{
		this.allowBackground = value;
	}-*/;

	/**
	 * @return The duration of the audio.
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
	 * @return Boolean to indicate if the audio should loop upon completion
	 */
	public final native boolean getLooping()
	/*-{
		return this.looping;
	}-*/;

	public final native void setLooping(boolean value)
	/*-{
		this.looping = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the audio is paused
	 */
	public final native boolean getPaused()
	/*-{
		return this.paused;
	}-*/;

	public final native void setPaused(boolean value)
	/*-{
		this.paused = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the audio is playing
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
	 * @return The time position of the audio.
	 */
	public final native float getTime()
	/*-{
		return this.time;
	}-*/;

	public final native void setTime(float value)
	/*-{
		this.time = value;
	}-*/;

	/**
	 * @return Url to the audio
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
	 * @return The volume of the audio. this volume only affects the media, not
	 *         the device audio.
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
	 * Returns true if the audio will loop
	 */
	public final native boolean isLooping()
	/*-{
		return this.isLooping();
	}-*/;

	/**
	 * Returns true if the audio is paused
	 */
	public final native boolean isPaused()
	/*-{
		return this.isPaused();
	}-*/;

	/**
	 * Returns true if the audio is playing
	 */
	public final native boolean isPlaying()
	/*-{
		return this.isPlaying();
	}-*/;

	/**
	 * Temporarily pause the audio. to resume, invoke `play`.
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Starting playing the source. if paused, will resume.
	 */
	public final native void play()
	/*-{
		return this.play();
	}-*/;

	/**
	 * Release all internal resources. this is typically unnecessary but can be
	 * useful if you load a large audio file in `app.js` and play it only once
	 * and you would like to release all releases after your final play to
	 * reduce memory.
	 */
	public final native void release()
	/*-{
		return this.release();
	}-*/;

	/**
	 * Reset the audio to the beginning.
	 */
	public final native void reset()
	/*-{
		return this.reset();
	}-*/;

	/**
	 * Stop playing the audio and reset it to the beginning.
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	public final native void addCompleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addInterruptedHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('interrupted', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addResumeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('resume', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
