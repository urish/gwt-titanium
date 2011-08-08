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

package org.urish.gwtit.titanium.app;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A module used to access the android's [application
 * resources](http://developer.android.com/guide/topics/resources/index.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Android extends org.urish.gwtit.titanium.Module {
	protected Android() {
	}

	private static native final org.urish.gwtit.titanium.app.android.R value_R()
	/*-{
		return Titanium.App.Android.R;
	}-*/;

	public static final org.urish.gwtit.titanium.app.android.R R = value_R();

	public static native org.urish.gwtit.titanium.app.android.R createR()
	/*-{
		return Titanium.App.Android.createR();
	}-*/;

}
