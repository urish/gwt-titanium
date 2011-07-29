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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The titanium binding of an [android
 * activity](http://developer.android.com/reference/android/app/activity.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Activity extends org.urish.gwtit.titanium.Proxy {
	protected Activity() {
	}

	/**
	 * @return The intent that was used to start this activity
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
	 * @return A callback function that is called to initially create an android
	 *         [options
	 *         menu](http://developer.android.com/guide/topics/ui/menus.
	 *         html#options-menu) for this activity when the user presses the
	 *         menu button. see the menu examples in
	 *         {@link org.urish.gwtit.titanium.android.menu}
	 */
	public final native EventCallback<JavaScriptObject> getOnCreateOptionsMenu()
	/*-{
		return this.onCreateOptionsMenu;
	}-*/;

	public final native void setOnCreateOptionsMenu(EventCallback<JavaScriptObject> value)
	/*-{
		this.onCreateOptionsMenu = value;
	}-*/;

	/**
	 * @return A callback function that is called to prepare an [options
	 *         menu](http
	 *         ://developer.android.com/guide/topics/ui/menus.html#options-menu)
	 *         for displaying on this activity when the user presses the menu
	 *         button. see the menu examples in
	 *         {@link org.urish.gwtit.titanium.android.menu}
	 */
	public final native EventCallback<JavaScriptObject> getOnPrepareOptionsMenu()
	/*-{
		return this.onPrepareOptionsMenu;
	}-*/;

	public final native void setOnPrepareOptionsMenu(EventCallback<JavaScriptObject> value)
	/*-{
		this.onPrepareOptionsMenu = value;
	}-*/;

	/**
	 * @return The requested orientation of this activity. see possible constant
	 *         values that begin with screen_orientation in the
	 *         {@link org.urish.gwtit.titanium.android} module.
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
	 * Called when the activity is done and should be closed. also see android's
	 * documentation for
	 * [finish](http://developer.android.com/reference/android/
	 * app/activity.html#finish())
	 */
	public final native void finish()
	/*-{
		return this.finish();
	}-*/;

	/**
	 * Get an android or application string using the passed-in resource id and
	 * optional format arguments. also see android's documentation for
	 * [getstring
	 * ](http://developer.android.com/reference/android/content/context
	 * .html#getstring(int)) and [string
	 * resources](http://developer.android.com/
	 * guide/topics/resources/string-resource.html#string)
	 * 
	 * @param resourceId
	 *            A Resource ID from the Application or Android.
	 * @param format
	 *            Optional format arguments for the String resource
	 */
	public final native String getString(float resourceId, Object[] format)
	/*-{
		return this.getString(resourceId, format);
	}-*/;

	/**
	 * Sets the result of this activity using an intent. this should be used in
	 * the case when the activity responds to startactivityforresult. also see
	 * android's documentation for
	 * [setresult](http://developer.android.com/reference
	 * /android/app/activity.html#setresult(int))
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
	 * Starts a new activity, using the passed in intent as the description.
	 * also see android's documentation for
	 * [startactivity](http://developer.android
	 * .com/reference/android/app/activity
	 * .html#startactivity(android.content.intent))
	 * 
	 * @param intent
	 *            Description of the Activity to start
	 */
	public final native void startActivity(org.urish.gwtit.titanium.android.Intent intent)
	/*-{
		return this.startActivity(intent);
	}-*/;

	/**
	 * The same as `startactivity`, but also accepts a callback function for
	 * handling the result of the started activity. also see android's
	 * documentation for
	 * [startactivityforresult](http://developer.android.com/reference
	 * /android/app/activity.html#startactivityforresult(android.content.intent,
	 * int))
	 * 
	 * @param intent
	 *            Description of the Activity to start
	 * @param callback
	 *            A callback function that is executed when the Activity has set
	 *            it's result. See example in
	 *            {@link org.urish.gwtit.titanium.android.Activity}.
	 */
	public final native void startActivityForResult(org.urish.gwtit.titanium.android.Intent intent,
			EventCallback<JavaScriptObject> callback)
	/*-{
		return this.startActivityForResult(intent, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	public final static class CreateEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "create";

		protected CreateEvent() {
		}

	}

	public final native void addCreateHandler(EventCallback<CreateEvent> handler)
	/*-{
		return this.addEventListener('create', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class DestroyEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "destroy";

		protected DestroyEvent() {
		}

	}

	public final native void addDestroyHandler(EventCallback<DestroyEvent> handler)
	/*-{
		return this.addEventListener('destroy', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class NewIntentEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "newIntent";

		protected NewIntentEvent() {
		}

		/**
		 * the <Titanium.Android.Intent> passed to the native `onNewIntent`
		 * method.
		 */
		public final native Object getIntent()
		/*-{
			return this.intent;
		}-*/;

	}

	public final native void addNewIntentHandler(EventCallback<NewIntentEvent> handler)
	/*-{
		return this.addEventListener('newIntent', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class PauseEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "pause";

		protected PauseEvent() {
		}

	}

	public final native void addPauseHandler(EventCallback<PauseEvent> handler)
	/*-{
		return this.addEventListener('pause', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ResumeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "resume";

		protected ResumeEvent() {
		}

	}

	public final native void addResumeHandler(EventCallback<ResumeEvent> handler)
	/*-{
		return this.addEventListener('resume', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class StartEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "start";

		protected StartEvent() {
		}

	}

	public final native void addStartHandler(EventCallback<StartEvent> handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class StopEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "stop";

		protected StopEvent() {
		}

	}

	public final native void addStopHandler(EventCallback<StopEvent> handler)
	/*-{
		return this.addEventListener('stop', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}