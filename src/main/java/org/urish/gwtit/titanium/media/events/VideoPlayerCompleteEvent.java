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

package org.urish.gwtit.titanium.media.events;

import org.urish.gwtit.client.event.TouchEvent;

/**
 * 
 */
public class VideoPlayerCompleteEvent extends TouchEvent {

	public final static String NATIVE_EVENT_NAME = "complete";

	protected VideoPlayerCompleteEvent() {
	}

	/**
	 * the completion reason. One of
	 * <Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED>,
	 * <Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR> or
	 * <Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED>.
	 */
	public final native int getReason()
	/*-{
		return this.reason;
	}-*/;

}
