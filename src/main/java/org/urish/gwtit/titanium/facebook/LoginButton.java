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

package org.urish.gwtit.titanium.facebook;


/**
 * The login button created by
 * {@link org.urish.gwtit.titanium.facebook.createloginbutton}. this is a
 * facebook-themed button that does not require a click event handler or any
 * listeners. it "just works" and changes its label to reflect the current state
 * of the facebook session. for example, if the user is already logged in, this
 * button will show "logout".
 * <p>
 * Notes: See the examples in the <Titanium.Facebook> documentation.
 * 
 * @since 0.8
 */
public class LoginButton extends org.urish.gwtit.titanium.ui.View {
	protected LoginButton() {
	}

	/**
	 * @return Set to "wide" to show a wider version of the button that displays
	 *         "connect with facebook" instead of just "connect".
	 */
	public final native String getStyle()
	/*-{
		return this.style;
	}-*/;

	public final native void setStyle(String value)
	/*-{
		this.style = value;
	}-*/;

}
