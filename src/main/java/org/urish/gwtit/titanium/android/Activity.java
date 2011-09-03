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

package org.urish.gwtit.titanium.android;

import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.titanium.android.events.ActivityPauseHandler;
import org.urish.gwtit.titanium.android.events.ActivityResumeHandler;
import org.urish.gwtit.titanium.android.events.CreateHandler;
import org.urish.gwtit.titanium.android.events.DestroyHandler;
import org.urish.gwtit.titanium.android.events.NewIntentHandler;
import org.urish.gwtit.titanium.android.events.StartHandler;
import org.urish.gwtit.titanium.android.events.StopHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an [Android
 * Activity](http://developer.android.com/reference/android/app/Activity.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Activity extends org.urish.gwtit.titanium.Proxy {
	protected Activity() {
	}

	/**
	 * @return The Intent that was used to start this Activity
	 */
	public final native org.urish.gwtit.titanium.android.Intent getIntent()
	/*-{
		return this.intent;
	}-*/;

	public final native void setIntent(org.urish.gwtit.titanium.android.Intent value)
	/*-{
		this.intent = value;
	}-*/;

	/**
	 * @return A callback function that is called to initially create an Android
	 *         [Options
	 *         Menu](http://developer.android.com/guide/topics/ui/menus.
	 *         html#options-menu) for this Activity when the user presses the
	 *         Menu button. See the menu examples in
	 *         {@link org.urish.gwtit.titanium.android.Menu}
	 */
	public final native EventCallback<JavaScriptObject> getOnCreateOptionsMenu()
	/*-{
		return this.onCreateOptionsMenu._javaObj;
	}-*/;

	public final native void setOnCreateOptionsMenu(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onCreateOptionsMenu = callback;
	}-*/;

	/**
	 * @return A callback function that is called to prepare an [Options
	 *         Menu](http
	 *         ://developer.android.com/guide/topics/ui/menus.html#options-menu)
	 *         for displaying on this Activity when the user presses the Menu
	 *         button. See the menu examples in
	 *         {@link org.urish.gwtit.titanium.android.Menu}
	 */
	public final native EventCallback<JavaScriptObject> getOnPrepareOptionsMenu()
	/*-{
		return this.onPrepareOptionsMenu._javaObj;
	}-*/;

	public final native void setOnPrepareOptionsMenu(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onPrepareOptionsMenu = callback;
	}-*/;

	/**
	 * @return The requested orientation of this Activity. See possible constant
	 *         values that begin with SCREEN_ORIENTATION in the
	 *         {@link org.urish.gwtit.titanium.Android} module.
	 */
	public final native float getRequestedOrientation()
	/*-{
		return this.requestedOrientation;
	}-*/;

	public final native void setRequestedOrientation(float value)
	/*-{
		this.requestedOrientation = value;
	}-*/;

	/**
	 * Called when the activity is done and should be closed. Also see Android's
	 * documentation for
	 * [finish](http://developer.android.com/reference/android/
	 * app/Activity.html#finish())
	 */
	public final native void finish()
	/*-{
		return this.finish();
	}-*/;

	/**
	 * Get an Android or Application string using the passed-in Resource ID and
	 * optional format arguments. Also see Android's documentation for
	 * [getString
	 * ](http://developer.android.com/reference/android/content/Context
	 * .html#getString(int)) and [String
	 * Resources](http://developer.android.com/
	 * guide/topics/resources/string-resource.html#String)
	 * 
	 * @param resourceId
	 *            A Resource ID from the Application or Android.
	 * @param format
	 *            Optional format arguments for the String resource
	 */
	public final native String getString(float resourceId, JavaScriptObject[] format)
	/*-{
		return this.getString(resourceId, format);
	}-*/;

	/**
	 * Sets the result of this Activity using an Intent. This should be used in
	 * the case when the Activity responds to startActivityForResult. Also see
	 * Android's documentation for
	 * [setResult](http://developer.android.com/reference
	 * /android/app/Activity.html#setResult(int))
	 * 
	 * @param resultCode
	 *            The result code for this Activity. Must be one of
	 *            {@link org.urish.gwtit.titanium.Android.RESULT_OK},
	 *            {@link org.urish.gwtit.titanium.Android.RESULT_CANCELED},
	 *            {@link org.urish.gwtit.titanium.Android.RESULT_FIRST_USER}
	 * @param intent
	 *            An optional {@link org.urish.gwtit.titanium.android.Intent}
	 *            with extra result data
	 */
	public final native void setResult(float resultCode, org.urish.gwtit.titanium.android.Intent intent)
	/*-{
		return this.setResult(resultCode, intent);
	}-*/;

	/**
	 * Starts a new Activity, using the passed in Intent as the description.
	 * Also see Android's documentation for
	 * [startActivity](http://developer.android
	 * .com/reference/android/app/Activity
	 * .html#startActivity(android.content.Intent))
	 * 
	 * @param intent
	 *            Description of the Activity to start
	 */
	public final native void startActivity(org.urish.gwtit.titanium.android.Intent intent)
	/*-{
		return this.startActivity(intent);
	}-*/;

	/**
	 * The same as `startActivity`, but also accepts a callback function for
	 * handling the result of the started Activity. Also see Android's
	 * documentation for
	 * [startActivityForResult](http://developer.android.com/reference
	 * /android/app/Activity.html#startActivityForResult(android.content.Intent,
	 * int))
	 * 
	 * @param intent
	 *            Description of the Activity to start
	 */
	public final native void startActivityForResult(org.urish.gwtit.titanium.android.Intent intent,
			EventCallback<JavaScriptObject> callback)
	/*-{
		return this.startActivityForResult(intent, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	public final native void addCreateHandler(CreateHandler handler)
	/*-{
		return this.addEventListener('create', function(e) { handler.@org.urish.gwtit.titanium.android.events.CreateHandler::onCreate(Lorg/urish/gwtit/titanium/android/events/CreateEvent;)(e); } );
	}-*/;

	public final native void addDestroyHandler(DestroyHandler handler)
	/*-{
		return this.addEventListener('destroy', function(e) { handler.@org.urish.gwtit.titanium.android.events.DestroyHandler::onDestroy(Lorg/urish/gwtit/titanium/android/events/DestroyEvent;)(e); } );
	}-*/;

	public final native void addNewIntentHandler(NewIntentHandler handler)
	/*-{
		return this.addEventListener('newIntent', function(e) { handler.@org.urish.gwtit.titanium.android.events.NewIntentHandler::onNewIntent(Lorg/urish/gwtit/titanium/android/events/NewIntentEvent;)(e); } );
	}-*/;

	public final native void addPauseHandler(ActivityPauseHandler handler)
	/*-{
		return this.addEventListener('pause', function(e) { handler.@org.urish.gwtit.titanium.android.events.ActivityPauseHandler::onActivityPause(Lorg/urish/gwtit/titanium/android/events/ActivityPauseEvent;)(e); } );
	}-*/;

	public final native void addResumeHandler(ActivityResumeHandler handler)
	/*-{
		return this.addEventListener('resume', function(e) { handler.@org.urish.gwtit.titanium.android.events.ActivityResumeHandler::onActivityResume(Lorg/urish/gwtit/titanium/android/events/ActivityResumeEvent;)(e); } );
	}-*/;

	public final native void addStartHandler(StartHandler handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.titanium.android.events.StartHandler::onStart(Lorg/urish/gwtit/titanium/android/events/StartEvent;)(e); } );
	}-*/;

	public final native void addStopHandler(StopHandler handler)
	/*-{
		return this.addEventListener('stop', function(e) { handler.@org.urish.gwtit.titanium.android.events.StopHandler::onStop(Lorg/urish/gwtit/titanium/android/events/StopEvent;)(e); } );
	}-*/;

}
