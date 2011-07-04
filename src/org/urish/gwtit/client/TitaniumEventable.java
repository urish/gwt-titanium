package org.urish.gwtit.client;


public interface TitaniumEventable<T> {
	/**
	 * Add an event listener for the instance to receive view triggered events
	 * 
	 * @param name name of the event
	 * @param callback
	 */
	void addEventListener(String name, EventCallback<T> callback);

	/***
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name name of the event
	 * @param event event object
	 */
	void fireEvent(String name, T event);

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name name of the event
	 * @param callback callback function passed in addEventListener
	 */
	void removeEventListener(String name, EventCallback<T> callback);
}
