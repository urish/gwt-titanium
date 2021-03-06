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

package org.urish.gwtit.titanium.ui.ios;

import org.urish.gwtit.titanium.ui.ios.events.ActionHandler;
import org.urish.gwtit.titanium.ui.ios.events.ErrorHandler;
import org.urish.gwtit.titanium.ui.ios.events.LoadHandler;

/**
 * The AdView is a view for display Apple iAds. The View is created by the
 * method {@link org.urish.gwtit.titanium.ui.ios.createAdView}.
 * 
 * @platforms iphone, ipad
 * @since 1.4
 */
public class AdView extends org.urish.gwtit.titanium.ui.View {
	protected AdView() {
	}

	/**
	 * @return Constant for 320x50 ad sizes
	 */
	public final native String getSIZE_320x50()
	/*-{
		return this.SIZE_320x50;
	}-*/;

	/**
	 * @return Constant for 480x32 ad sizes
	 */
	public final native String getSIZE_480x32()
	/*-{
		return this.SIZE_480x32;
	}-*/;

	/**
	 * A banner view action can cover your application's user interface.
	 * However, your application continues to run, and receives events normally.
	 * If your application receives an event that requires the user's attention,
	 * it can programmatically cancel the action and uncover its interface by
	 * calling cancelAction. Canceling actions frequently can cause a loss of
	 * revenue for your application.
	 */
	public final native void cancelAction()
	/*-{
		return this.cancelAction();
	}-*/;

	public final native void addActionHandler(ActionHandler handler)
	/*-{
		return this.addEventListener('action', function(e) { handler.@org.urish.gwtit.titanium.ui.ios.events.ActionHandler::onAction(Lorg/urish/gwtit/titanium/ui/ios/events/ActionEvent;)(e); } );
	}-*/;

	public final native void addErrorHandler(ErrorHandler handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.titanium.ui.ios.events.ErrorHandler::onError(Lorg/urish/gwtit/titanium/ui/ios/events/ErrorEvent;)(e); } );
	}-*/;

	public final native void addLoadHandler(LoadHandler handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.titanium.ui.ios.events.LoadHandler::onLoad(Lorg/urish/gwtit/titanium/ui/ios/events/LoadEvent;)(e); } );
	}-*/;

}
