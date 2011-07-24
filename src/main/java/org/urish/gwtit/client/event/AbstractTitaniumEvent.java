package org.urish.gwtit.client.event;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class AbstractTitaniumEvent extends JavaScriptObject implements TitaniumEvent {
	/**
	 * the source object that fired the event
	 */
	public final native Object getSource()
	/*-{
		return this.source;
	}-*/;

	/**
	 * the name of the event fired
	 */
	public final native String getType()
	/*-{
		return this.type;
	}-*/;
}
