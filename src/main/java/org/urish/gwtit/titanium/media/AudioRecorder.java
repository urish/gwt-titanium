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
 * The AudioRecorder object is returned by
 * {@link org.urish.gwtit.titanium.media.createAudioRecorder} and is used for
 * recording audio from the device microphone.
 * 
 * @since 0.9
 */
public class AudioRecorder extends org.urish.gwtit.titanium.Proxy {
	protected AudioRecorder() {
	}

	/**
	 * @return Audio compression constant to be used for the recording
	 */
	public final native int getCompression()
	/*-{
		return this.compression;
	}-*/;

	public final native void setCompression(int value)
	/*-{
		this.compression = value;
	}-*/;

	/**
	 * @return Audio format constant for used for the recording
	 */
	public final native int getFormat()
	/*-{
		return this.format;
	}-*/;

	public final native void setFormat(int value)
	/*-{
		this.format = value;
	}-*/;

	/**
	 * @return Readonly property to indicate if paused
	 */
	public final native boolean getPaused()
	/*-{
		return this.paused;
	}-*/;

	/**
	 * @return Readonly property to indicate if recording
	 */
	public final native boolean getRecording()
	/*-{
		return this.recording;
	}-*/;

	/**
	 * @return Readonly property to indicate if stopped
	 */
	public final native boolean getStopped()
	/*-{
		return this.stopped;
	}-*/;

	/**
	 * Called to temporarily pause recording
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Called to resume audio recording
	 */
	public final native void resume()
	/*-{
		return this.resume();
	}-*/;

	/**
	 * Called to start recording audio
	 */
	public final native void start()
	/*-{
		return this.start();
	}-*/;

	/**
	 * Called to stop recording audio
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

}
