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

package org.urish.gwtit.titanium.app.ios;


/**
 * The backgroundservice is created by
 * {@link org.urish.gwtit.titanium.app.ios.registerbackgroundservice}.
 * <p>
 * Notes: The background service runs when the Application is placed in the
 * background and will continue to run until the service is stopped with the
 * `stop` method or the `unregister` method. Stopping a running background
 * service will converse resources while its running in the background. However,
 * if the application is foregrounded and then backgrounded again, it will run
 * again. If you want to permanently stop running the background service, you
 * must call `unregister`.
 * 
 * @platforms iphone, ipad
 * @since 1.5
 */
public class BackgroundService extends org.urish.gwtit.titanium.Proxy {
	protected BackgroundService() {
	}

	/**
	 * Stop the service from the current background session to conserve
	 * resources
	 */
	public native void stop()
	/*-{
		return this.stop();
	}-*/;

	/**
	 * Unregister the background service
	 */
	public native void unregister()
	/*-{
		return this.unregister();
	}-*/;

}
