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

	public static final boolean iPad() {
		return Platform.getOsname().equals(OS_IPAD);
	}

	public static final boolean iPhone() {
		return Platform.getOsname().equals(OS_IPHONE);
	}

	public static final boolean android() {
		return Platform.getOsname().equals(OS_ANDROID);
	}

	/**
	 * Returns true if iphone/ipad and version is 3.2+
	 */
	public static final boolean iOs3_2Plus() {
		if (Platform.getName().equals(PLATFORM_IPHONE_OS)) {
			String[] version = Platform.getVersion().split(".");
			int major = Integer.parseInt(version[0]);
			int minor = Integer.parseInt(version[1]);

			if ((major > 3) || ((major == 3) && (minor > 1))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns true if iphone/ipad and version is 4.0+
	 */
	public static final boolean iOS4Plus() {
		if (Platform.getName().equals(PLATFORM_IPHONE_OS)) {
			String[] version = Platform.getVersion().split(".");
			int major = Integer.parseInt(version[0]);
			return (major >= 4);
		}

		return false;
	}
}
