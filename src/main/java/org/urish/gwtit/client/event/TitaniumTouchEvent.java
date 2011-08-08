package org.urish.gwtit.client.event;

import org.urish.gwtit.client.util.Point;

public class TitaniumTouchEvent extends AbstractTitaniumEvent {
	/**
	 * the x point of the event in receiving view coordinates
	 */
	public final native float getX()
	/*-{
		return this.x;
	}-*/;

	/**
	 * the y point of the event, in receiving view coordinates
	 */
	public final native float getY()
	/*-{
		return this.y;
	}-*/;

	/**
	 * a dictionary with properties x and y describing the point of the event in
	 * screen coordinates.
	 */
	public final native Point getGlobalPoint()
	/*-{
		return this.globalPoint;
	}-*/;
}
