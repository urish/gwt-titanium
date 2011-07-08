package org.urish.gwtit.client;

import com.google.gwt.core.client.JavaScriptObject;

public class TitaniumModule extends JavaScriptObject {

	/**
	 * Add an event listener for the module to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Gesture.addEventListener(event, function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public native void fireEvent(String name, Object event)
	/*-{
		return this.fireEvent(name, event);
	}-*/;
}
