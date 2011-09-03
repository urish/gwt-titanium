/*
 * Copyright 2011 Uri Shaked
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.urish.gwtit.client.util;

import org.urish.gwtit.titanium.Platform;

/**
 * Utility function to check for platform / os version.
 * 
 * @author Uri Shaked
 */
public class Version {
	public static final String OS_IPAD = "ipad";
	public static final String OS_IPHONE = "iphone";
	public static final String OS_ANDROID = "android";

	public static final String PLATFORM_IPHONE_OS = "iPhone OS";

	private static final boolean developementMode = GwtUtil.isDevelopmentMode();

	/**
	 * Checks whether we are running on an iPad device.
	 * 
	 * @return true if we are running on an iPad.
	 */
	public static final boolean iPad() {
		if (developementMode) {
			return cachedOsName().equals(OS_IPAD);
		}
		return Platform.getOsname().equals(OS_IPAD);
	}

	/**
	 * Checks whether we are running on an iPhone/iPod Touch device.
	 * 
	 * @return true if we are running on an iPhone/iPod touch.
	 */
	public static final boolean iPhone() {
		if (developementMode) {
			return cachedOsName().equals(OS_IPHONE);
		}
		return Platform.getOsname().equals(OS_IPHONE);
	}

	/**
	 * Checks whether we are running on an Android device.
	 * 
	 * @return true if we are running on an Android.
	 */
	public static final boolean android() {
		if (developementMode) {
			return cachedOsName().equals(OS_ANDROID);
		}
		return Platform.getOsname().equals(OS_ANDROID);
	}

	private static Boolean cachediOs3_2Plus = null;

	/**
	 * Returns true if iphone/ipad and version is 3.2+
	 */
	public static final boolean iOs3_2Plus() {
		if (cachediOs3_2Plus == null) {
			cachediOs3_2Plus = false;
			if (Platform.getName().equals(PLATFORM_IPHONE_OS)) {
				String[] version = Platform.getVersion().split(".");
				int major = Integer.parseInt(version[0]);
				int minor = Integer.parseInt(version[1]);

				if ((major > 3) || ((major == 3) && (minor > 1))) {
					cachediOs3_2Plus = true;
				}
			}
		}

		return cachediOs3_2Plus;
	}

	private static Boolean cachediOs4Plus = null;

	/**
	 * Returns true if iphone/ipad and version is 4.0+
	 */
	public static final boolean iOS4Plus() {
		if (cachediOs4Plus == null) {
			cachediOs4Plus = false;
			if (Platform.getName().equals(PLATFORM_IPHONE_OS)) {
				String[] version = Platform.getVersion().split(".");
				int major = Integer.parseInt(version[0]);
				cachediOs4Plus = (major >= 4);
			}
		}

		return cachediOs4Plus;
	}

	/*--- Cache for speeding up hosted mode ---*/
	private static String cachedOsNameValue = null;

	private static String cachedOsName() {
		if (cachedOsNameValue == null) {
			cachedOsNameValue = Platform.getOsname();
		}
		return cachedOsNameValue;
	}
}
