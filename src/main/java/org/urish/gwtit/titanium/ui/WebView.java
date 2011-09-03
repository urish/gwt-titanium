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

package org.urish.gwtit.titanium.ui;

import org.urish.gwtit.titanium.ui.events.BeforeLoadHandler;
import org.urish.gwtit.titanium.ui.events.ErrorHandler;
import org.urish.gwtit.titanium.ui.events.PauseHandler;
import org.urish.gwtit.titanium.ui.events.ResumeHandler;
import org.urish.gwtit.titanium.ui.events.WebViewLoadHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Web View allows you to open an HTML5 based view which can load either
 * local or remote content. The content can be any valid web content such as
 * HTML, PDF, SVG or other WebKit supported content types. The Web View is
 * created by the method {@link org.urish.gwtit.titanium.ui.createWebView}.
 * <p>
 * Notes: Creating webviews are more expensive than creating pure native views
 * because of the requirement to load the HTML browser into memory.
 * 
 * Since a webview internally wants to handle its own events, scrolling and
 * other related touch events against it's own view surface, you cannot have
 * both Titanium style events against the webview instance and internal
 * Javascript events in the DOM. You must choose between one or the other.
 * 
 * @since 0.8
 */
public class WebView extends org.urish.gwtit.titanium.ui.View {
	protected WebView() {
	}

	/**
	 * @return A data blob or file that is used to load the web document
	 */
	public final native JavaScriptObject getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(JavaScriptObject value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return The html content of the web document
	 */
	public final native String getHtml()
	/*-{
		return this.html;
	}-*/;

	public final native void setHtml(String value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return Boolean indicating if the webview is loading content
	 */
	public final native boolean getLoading()
	/*-{
		return this.loading;
	}-*/;

	public final native void setLoading(boolean value)
	/*-{
		this.loading = value;
	}-*/;

	/**
	 * @default <Titanium.UI.Android.WEBVIEW_PLUGINS_OFF>
	 * @return Set how plugins are processed. Accepts one of
	 *         {@link org.urish.gwtit.titanium.ui.Android.WEBVIEW_PLUGINS_OFF},
	 *         {@link org.urish.gwtit.titanium.ui.Android.WEBVIEW_PLUGINS_ON},
	 *         or
	 *         {@link org.urish.gwtit.titanium.ui.Android.WEBVIEW_PLUGINS_ON_DEMAND}
	 *         . See Android documentation for
	 *         [WebSettings.PluginState](http://developer
	 *         .android.com/reference/android
	 *         /webkit/WebSettings.PluginState.html). Only works on Android
	 *         devices at API Level 8 or greater.
	 * @platforms android
	 * @since 1.8.0
	 */
	public final native float getPluginState()
	/*-{
		return this.pluginState;
	}-*/;

	public final native void setPluginState(float value)
	/*-{
		this.pluginState = value;
	}-*/;

	/**
	 * @return Whether the webview should scale it's contents or not
	 */
	public final native boolean getScalesPageToFit()
	/*-{
		return this.scalesPageToFit;
	}-*/;

	public final native void setScalesPageToFit(boolean value)
	/*-{
		this.scalesPageToFit = value;
	}-*/;

	/**
	 * @return The url to the web document. this property will change as the
	 *         content of the webview changes (such as from internal hyperlinks,
	 *         etc)
	 */
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * Returns true if the webview can go back in history
	 */
	public final native boolean canGoBack()
	/*-{
		return this.canGoBack();
	}-*/;

	/**
	 * Returns true if the webview can go forward in history
	 */
	public final native boolean canGoForward()
	/*-{
		return this.canGoForward();
	}-*/;

	/**
	 * Invoke JavaScript inside the context of the webview and optionally,
	 * return a result
	 * 
	 * @param content
	 *            JavaScript code as a string. The code will be evaluated inside
	 *            the webview context.
	 */
	public final native String evalJS(String content)
	/*-{
		return this.evalJS(content);
	}-*/;

	/**
	 * Go back one entry in history to the previous page
	 */
	public final native void goBack()
	/*-{
		return this.goBack();
	}-*/;

	/**
	 * Go forward one entry in history to the page before the current page
	 */
	public final native void goForward()
	/*-{
		return this.goForward();
	}-*/;

	/**
	 * Reload the current webpage
	 */
	public final native void reload()
	/*-{
		return this.reload();
	}-*/;

	/**
	 * Force the webview to repaint its contents
	 */
	public final native void repaint()
	/*-{
		return this.repaint();
	}-*/;

	/**
	 * Set the basic authentication for the webview instance to be used on
	 * subsequent url requests
	 * 
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public final native void setBasicAuthentication(String username, String password)
	/*-{
		return this.setBasicAuthentication(username, password);
	}-*/;

	/**
	 * Stop loading a currently loading page
	 */
	public final native void stopLoading()
	/*-{
		return this.stopLoading();
	}-*/;

	public final native void addBeforeLoadHandler(BeforeLoadHandler handler)
	/*-{
		return this.addEventListener('beforeload', function(e) { handler.@org.urish.gwtit.titanium.ui.events.BeforeLoadHandler::onBeforeLoad(Lorg/urish/gwtit/titanium/ui/events/BeforeLoadEvent;)(e); } );
	}-*/;

	public final native void addErrorHandler(ErrorHandler handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ErrorHandler::onError(Lorg/urish/gwtit/titanium/ui/events/ErrorEvent;)(e); } );
	}-*/;

	public final native void addLoadHandler(WebViewLoadHandler handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.titanium.ui.events.WebViewLoadHandler::onWebViewLoad(Lorg/urish/gwtit/titanium/ui/events/WebViewLoadEvent;)(e); } );
	}-*/;

	public final native void addPauseHandler(PauseHandler handler)
	/*-{
		return this.addEventListener('pause', function(e) { handler.@org.urish.gwtit.titanium.ui.events.PauseHandler::onPause(Lorg/urish/gwtit/titanium/ui/events/PauseEvent;)(e); } );
	}-*/;

	public final native void addResumeHandler(ResumeHandler handler)
	/*-{
		return this.addEventListener('resume', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ResumeHandler::onResume(Lorg/urish/gwtit/titanium/ui/events/ResumeEvent;)(e); } );
	}-*/;

}
