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

package org.urish.gwtit.titanium;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level facebook module. the facebook module is used for connecting
 * your application with facebook through the [facebook graph
 * api](http://developers.facebook.com/docs/reference/api/) (see
 * `requestwithgraphpath`) or the deprecated [facebook rest
 * api](http://developers.facebook.com/docs/reference/rest/) (see `request`).
 * due to how the facebook login process works on ios, your app will need to
 * have the following in your tiapp.xml if you target those platforms:
 * 
 * your_app_id_here
 * 
 * you must still set ti.facebook.appid within your app itself to use the
 * facebook module. this property is used only for configuring your app to
 * interface with the facebook login process.
 * 
 * <p>
 * Notes: Titanium Mobile SDK 1.6.0 marked a significant change for this module.
 * Older versions of the module were not compatible with the new Graph API.
 * Applications written for the pre-1.6.0 version of this module will **not**
 * work with the 1.6.0 and higher versions. Nor is the code shown in the
 * examples here backwards-compatible with pre-1.6.0 Titanium Mobile SDK.
 * 
 * @since 0.8
 */
public class Facebook extends org.urish.gwtit.titanium.Module {
	protected Facebook() {
	}

	/**
	 * @return Oauth token set after a successful `authorize`.
	 */
	public static native String getAccessToken()
	/*-{
		return Titanium.Facebook.accessToken;
	}-*/;

	public static native void setAccessToken(String value)
	/*-{
		Titanium.Facebook.accessToken = value;
	}-*/;

	/**
	 * @return Your facebook application id. you need to set this for anything
	 *         to work.
	 */
	public static native String getAppid()
	/*-{
		return Titanium.Facebook.appid;
	}-*/;

	public static native void setAppid(String value)
	/*-{
		Titanium.Facebook.appid = value;
	}-*/;

	/**
	 * @return Time at which the `accesstoken` expires.
	 */
	public static native java.util.Date getExpirationDate()
	/*-{
		return Titanium.Facebook.expirationDate;
	}-*/;

	public static native void setExpirationDate(java.util.Date value)
	/*-{
		Titanium.Facebook.expirationDate = value;
	}-*/;

	/**
	 * @return Set to false to enable "single-sign-on" in cases where the
	 *         official facebook app is on the device. default is true, meaning
	 *         the traditional, dialog-based authentication is used rather than
	 *         single-sign-on. see [facebook mobile
	 *         guide](http://developers.facebook.com/docs/guides/mobile) for
	 *         details of their single-sign-on schem.
	 */
	public static native boolean getForceDialogAuth()
	/*-{
		return Titanium.Facebook.forceDialogAuth;
	}-*/;

	public static native void setForceDialogAuth(boolean value)
	/*-{
		Titanium.Facebook.forceDialogAuth = value;
	}-*/;

	/**
	 * @return Returns true if the user has logged in
	 */
	public static native boolean getLoggedIn()
	/*-{
		return Titanium.Facebook.loggedIn;
	}-*/;

	public static native void setLoggedIn(boolean value)
	/*-{
		Titanium.Facebook.loggedIn = value;
	}-*/;

	/**
	 * @return Set/return an array of permissions to request for your app. be
	 *         sure the permissions you want are set before calling `authorize`.
	 */
	public static native Object getPermissions()
	/*-{
		return Titanium.Facebook.permissions;
	}-*/;

	public static native void setPermissions(Object value)
	/*-{
		Titanium.Facebook.permissions = value;
	}-*/;

	/**
	 * @return The unique user id returned from facebook.
	 */
	public static native String getUid()
	/*-{
		return Titanium.Facebook.uid;
	}-*/;

	public static native void setUid(String value)
	/*-{
		Titanium.Facebook.uid = value;
	}-*/;

	public static native org.urish.gwtit.titanium.facebook.LoginButton createLoginButton()
	/*-{
		return Titanium.Facebook.createLoginButton();
	}-*/;

	/**
	 * Login the user (if not already logged in) and authorize your application.
	 * be sure to set your desired `permissions` and your `appid` before calling
	 * this.
	 */
	public static native void authorize()
	/*-{
		return Titanium.Facebook.authorize();
	}-*/;

	/**
	 * Open a supported facebook
	 * [dialog](http://developers.facebook.com/docs/reference/dialogs/). "feed"
	 * is just about the only useful one.
	 * 
	 * @param action
	 *            Specifies which dialog to show, such as "feed".
	 * @param params
	 *            A dictionary object for pre-filling some of the dialog's
	 *            fields. See example.
	 * @param callback
	 *            A callback for when dialog is completed/cancelled. The
	 *            callback should accept a single argument which will be filled
	 *            with a dictionary object concerning call results: items in the
	 *            dictionary can be "success" (boolean), "error" (string with
	 *            the error message), "cancelled" (set to true if user
	 *            cancelled) and "result" (the data returned by Facebook.)
	 */
	public static native void dialog(String action, Object params, Object callback)
	/*-{
		return Titanium.Facebook.dialog(action, params, callback);
	}-*/;

	/**
	 * Clear the oauth `accesstoken` and logout the user.
	 */
	public static native void logout()
	/*-{
		return Titanium.Facebook.logout();
	}-*/;

	/**
	 * Make a request to the deprecated [facebook rest
	 * api](http://developers.facebook.com/docs/reference/rest/).
	 * 
	 * @param method
	 *            The REST API method to call.
	 * @param params
	 *            A dictionary object for setting parameters required by the
	 *            call, if any. See examples.
	 * @param callback
	 *            A callback for when call is completed. The callback should
	 *            accept a single argument which will be filled with a
	 *            dictionary object concerning call results: items in the
	 *            dictionary can be "success" (boolean), "error" (string with
	 *            the error message), "method" (the REST method call you
	 *            specified), "result" (the data returned by Facebook.)
	 */
	public static native void request(String method, Object params, Object callback)
	/*-{
		return Titanium.Facebook.request(method, params, callback);
	}-*/;

	/**
	 * Make a [facebook graph
	 * api](http://developers.facebook.com/docs/reference/api/) request. if the
	 * request requires user authorization, be sure user is already logged-in
	 * and your app is authorized. (you can check `loggedin` for that.)
	 * 
	 * @param path
	 *            The graph API path to request. For example, "me" requests
	 *            [information about the logged-in
	 *            user](http://developers.facebook
	 *            .com/docs/reference/api/user/).
	 * @param params
	 *            A dictionary object for setting parameters required by the
	 *            call, if any. See examples.
	 * @param httpMethod
	 *            The http method (GET/POST/DELETE) to use for the call.
	 * @param callback
	 *            A callback for when call is completed. The callback should
	 *            accept a single argument which will be filled with a
	 *            dictionary object concerning call results: items in the
	 *            dictionary can be "success" (boolean), "error" (string with
	 *            the error message), "path" (the graph call path you
	 *            specified), "result" (the JSON returned by Facebook.)
	 */
	public static native void requestWithGraphPath(String path, Object params, String httpMethod, Object callback)
	/*-{
		return Titanium.Facebook.requestWithGraphPath(path, params, httpMethod, callback);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, Object callback)
	/*-{
		return Titanium.Facebook.addEventListener(name, callback);
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, Object callbac)
	/*-{
		return Titanium.Facebook.removeEventListener(name, callbac);
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Facebook.fireEvent(name, event);
	}-*/;

	public static native void addLoginHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Facebook.addEventListener('login', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public static native void addLogoutHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Facebook.addEventListener('logout', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
