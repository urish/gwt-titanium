package org.urish.gwtit.client.util;

import com.google.gwt.core.client.JavaScriptObject;

public class Point extends JavaScriptObject {
	public static native Point createPoint(float x, float y)
	/*-{
		return {x: x, y: y};
	}-*/;

	public native final float getX()
	/*-{
		return this.x;
	}-*/;

	public native final float getY()
	/*-{
		return this.y;
	}-*/;
}
