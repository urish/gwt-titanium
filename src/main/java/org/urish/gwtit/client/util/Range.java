package org.urish.gwtit.client.util;

import com.google.gwt.core.client.JavaScriptObject;

public class Range extends JavaScriptObject {
	protected Range() {
	}
	
	public static native Size createSize(int location, int length)
	/*-{
		return {location: location, length: length};
	}-*/;

	public native final int getLocation()
	/*-{
		return this.location;
	}-*/;

	public native final int getLength()
	/*-{
		return this.length;
	}-*/;

}
