package org.urish.gwtit.client.event;

import com.google.gwt.core.client.JavaScriptObject;

public interface TitaniumEvent {
	public JavaScriptObject getSource();
	public String getType();
}
