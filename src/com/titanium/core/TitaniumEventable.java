package com.titanium.core;

public interface TitaniumEventable<T> {
	/**
	 * add an event listener for the instance to receive view triggered events
	 * 
	 * @param name name of the event
	 * @param callback
	 */
	void addEventListener(String name, EventCallback<T> callback);

	/***
	 * fire a synthesized event to the views listener
	 * 
	 * @param name name of the event
	 * @param event event object
	 */
	void fireEvent(String name, T event);

	/**
	 * remove a previously added event listener
	 * 
	 * @param name name of the event
	 * @param callback callback function passed in addEventListener
	 */
	void removeEventListener(String name, EventCallback<T> callback);
}
