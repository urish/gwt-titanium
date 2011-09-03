package org.urish.gwtit.client.util;

import com.google.gwt.core.client.GWT;

public final class GwtUtil {
	/**
	 * Checks if we are running in GWT development mode ("hosted mode")
	 * @return
	 */
	public static boolean isDevelopmentMode() {
		return !GWT.isScript() && GWT.isClient();
	}
}
