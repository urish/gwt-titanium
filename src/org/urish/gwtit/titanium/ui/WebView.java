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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The web view allows you to open an html5 based view which can load either
 * local or remote content. the content can be any valid web content such as
 * html, pdf, svg or other webkit supported content types. the web view is
 * created by the method {@link org.urish.gwtit.titanium.ui.createwebview}.
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
	public native Object getData()
	/*-{
		return this.data;
	}-*/;

	public native void setData(Object value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return The html content of the web document
	 */
	public native String getHtml()
	/*-{
		return this.html;
	}-*/;

	public native void setHtml(String value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return Boolean indicating if the webview is loading content
	 */
	public native boolean getLoading()
	/*-{
		return this.loading;
	}-*/;

	public native void setLoading(boolean value)
	/*-{
		this.loading = value;
	}-*/;

	/**
	 * @return Whether the webview should scale it's contents or not
	 */
	public native boolean getScalesPageToFit()
	/*-{
		return this.scalesPageToFit;
	}-*/;

	public native void setScalesPageToFit(boolean value)
	/*-{
		this.scalesPageToFit = value;
	}-*/;

	/**
	 * @return The url to the web document. this property will change as the
	 *         content of the webview changes (such as from internal hyperlinks,
	 *         etc)
	 */
	public native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * Returns true if the webview can go back in history
	 */
	public native boolean canGoBack()
	/*-{
		return this.canGoBack();
	}-*/;

	/**
	 * Returns true if the webview can go forward in history
	 */
	public native boolean canGoForward()
	/*-{
		return this.canGoForward();
	}-*/;

	/**
	 * Invoke javascript inside the context of the webview and optionally,
	 * return a result
	 * 
	 * @param content
	 *            JavaScript code as a string. The code will be evaluated inside
	 *            the webview context.
	 */
	public native String evalJS(String content)
	/*-{
		return this.evalJS(content);
	}-*/;

	/**
	 * Go back one entry in history to the previous page
	 */
	public native void goBack()
	/*-{
		return this.goBack();
	}-*/;

	/**
	 * Go forward one entry in history to the page before the current page
	 */
	public native void goForward()
	/*-{
		return this.goForward();
	}-*/;

	/**
	 * Reload the current webpage
	 */
	public native void reload()
	/*-{
		return this.reload();
	}-*/;

	/**
	 * Force the webview to repaint its contents
	 */
	public native void repaint()
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
	public native void setBasicAuthentication(String username, String password)
	/*-{
		return this.setBasicAuthentication(username, password);
	}-*/;

	/**
	 * Stop loading a currently loading page
	 */
	public native void stopLoading()
	/*-{
		return this.stopLoading();
	}-*/;

	public native void addBeforeloadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('beforeload', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addLoadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
