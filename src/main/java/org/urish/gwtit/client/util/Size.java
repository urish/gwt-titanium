package org.urish.gwtit.client.util;

public class Size {
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
