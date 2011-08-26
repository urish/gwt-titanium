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
import org.urish.gwtit.titanium.events.PauseHandler;
import org.urish.gwtit.titanium.events.ProximityHandler;
import org.urish.gwtit.titanium.events.ResumeHandler;
import org.urish.gwtit.titanium.events.ResumedHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level app module. the app module is mainly used for accessing
 * information about the application at runtime.
 * 
 * @since 0.1
 */
public class App extends org.urish.gwtit.titanium.Module {
	protected App() {
	}

	/**
	 * @return The application's copyright
	 */
	public static native String getCopyright()
	/*-{
		return Titanium.App.copyright;
	}-*/;

	public static native void setCopyright(String value)
	/*-{
		Titanium.App.copyright = value;
	}-*/;

	/**
	 * @return The application's description
	 */
	public static native String getDescription()
	/*-{
		return Titanium.App.description;
	}-*/;

	public static native void setDescription(String value)
	/*-{
		Titanium.App.description = value;
	}-*/;

	/**
	 * @return The application's globally unique id (this is system generated
	 *         and consistent through all versions)
	 */
	public static native String getGuid()
	/*-{
		return Titanium.App.guid;
	}-*/;

	public static native void setGuid(String value)
	/*-{
		Titanium.App.guid = value;
	}-*/;

	/**
	 * @return The application's app id as specified in titanium developer or
	 *         titanium studio
	 */
	public static native String getId()
	/*-{
		return Titanium.App.id;
	}-*/;

	public static native void setId(String value)
	/*-{
		Titanium.App.id = value;
	}-*/;

	/**
	 * @return Property for controlling whether the phone screen will be locked
	 *         on idle time. can be set to true to disable the timer
	 */
	public static native boolean getIdleTimerDisabled()
	/*-{
		return Titanium.App.idleTimerDisabled;
	}-*/;

	public static native void setIdleTimerDisabled(boolean value)
	/*-{
		Titanium.App.idleTimerDisabled = value;
	}-*/;

	/**
	 * @return The application's name
	 */
	public static native String getName()
	/*-{
		return Titanium.App.name;
	}-*/;

	public static native void setName(String value)
	/*-{
		Titanium.App.name = value;
	}-*/;

	/**
	 * @return A boolean to indicate whether proximity detection is enabled
	 */
	public static native boolean getProximityDetection()
	/*-{
		return Titanium.App.proximityDetection;
	}-*/;

	public static native void setProximityDetection(boolean value)
	/*-{
		Titanium.App.proximityDetection = value;
	}-*/;

	/**
	 * @return The state of the device's proximity detector
	 */
	public static native int getProximityState()
	/*-{
		return Titanium.App.proximityState;
	}-*/;

	public static native void setProximityState(int value)
	/*-{
		Titanium.App.proximityState = value;
	}-*/;

	/**
	 * @return The application's publisher
	 */
	public static native String getPublisher()
	/*-{
		return Titanium.App.publisher;
	}-*/;

	public static native void setPublisher(String value)
	/*-{
		Titanium.App.publisher = value;
	}-*/;

	/**
	 * @return The application url
	 */
	public static native String getUrl()
	/*-{
		return Titanium.App.url;
	}-*/;

	public static native void setUrl(String value)
	/*-{
		Titanium.App.url = value;
	}-*/;

	/**
	 * @return The application's version
	 */
	public static native String getVersion()
	/*-{
		return Titanium.App.version;
	}-*/;

	public static native void setVersion(String value)
	/*-{
		Titanium.App.version = value;
	}-*/;

	public static native org.urish.gwtit.titanium.app.Android createAndroid()
	/*-{
		return Titanium.App.createAndroid();
	}-*/;

	public static native org.urish.gwtit.titanium.app.iOS createiOS()
	/*-{
		return Titanium.App.createiOS();
	}-*/;

	public static native org.urish.gwtit.titanium.app.Properties createProperties()
	/*-{
		return Titanium.App.createProperties();
	}-*/;

	/**
	 * Return the arguments passed to the application on startup as a dictionary
	 */
	public static native JavaScriptObject getArguments()
	/*-{
		return Titanium.App.getArguments();
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.App.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.App.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.App.fireEvent(name, event);
	}-*/;

	public static native void addProximityHandler(ProximityHandler handler)
	/*-{
		return Titanium.App.addEventListener('proximity', function(e) { handler.@org.urish.gwtit.titanium.events.ProximityHandler::onProximity(Lorg/urish/gwtit/titanium/events/ProximityEvent;)(e); } );
	}-*/;

	public static native void addResumeHandler(ResumeHandler handler)
	/*-{
		return Titanium.App.addEventListener('resume', function(e) { handler.@org.urish.gwtit.titanium.events.ResumeHandler::onResume(Lorg/urish/gwtit/titanium/events/ResumeEvent;)(e); } );
	}-*/;

	public static native void addResumedHandler(ResumedHandler handler)
	/*-{
		return Titanium.App.addEventListener('resumed', function(e) { handler.@org.urish.gwtit.titanium.events.ResumedHandler::onResumed(Lorg/urish/gwtit/titanium/events/ResumedEvent;)(e); } );
	}-*/;

	public static native void addPauseHandler(PauseHandler handler)
	/*-{
		return Titanium.App.addEventListener('pause', function(e) { handler.@org.urish.gwtit.titanium.events.PauseHandler::onPause(Lorg/urish/gwtit/titanium/events/PauseEvent;)(e); } );
	}-*/;

}
