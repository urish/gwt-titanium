package org.urish.gwtit.client.util;

import com.google.gwt.core.client.JavaScriptObject;

public class Size extends JavaScriptObject {
	protected Size() {
	}
	
	public static native Size createSize(float width, float height)
	/*-{
		return {width: width, height: height};
	}-*/;

	public native final float getWidth()
	/*-{
		return this.width;
	}-*/;

	public native final float getHeight()
	/*-{
		return this.height;
	}-*/;
}
