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

/* Automatically generated code, don't edit ! */

package org.urish.gwtit.titanium.ui.ipad;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A documentviewer provides in-app support for managing user interactions with
 * files in the local system. for example, an email program might use this class
 * to allow the user to preview attachments and open them in other apps. use
 * this class to present an appropriate user interface for previewing or
 * printing a specified file. the documentviewere is created by the method
 * {@link org.urish.gwtit.titanium.ui.ipad.createdocumentviewer}.
 * 
 * @platforms ipad
 * @since 1.8
 */
public class DocumentViewer extends org.urish.gwtit.titanium.ui.View {
	protected DocumentViewer() {
	}

	/**
	 * To display the document viewer over the current view.
	 * 
	 * @param animated
	 *            is a boolean indicating if the showing of the viewer should be
	 *            animated.
	 * @param view
	 *            The view property would specify the view relative to where the
	 *            viewer should display.
	 */
	public final native void show(boolean animated, Object view)
	/*-{
		return this.show(animated, view);
	}-*/;

	/**
	 * Change the url of the document viewer
	 * 
	 * @param url
	 *            the new url
	 */
	public final native void setUrl(String url)
	/*-{
		return this.setUrl(url);
	}-*/;

}
