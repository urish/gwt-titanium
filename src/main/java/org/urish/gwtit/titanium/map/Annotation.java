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

package org.urish.gwtit.titanium.map;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An Annotation object that is created by the method
 * {@link org.urish.gwtit.titanium.map.createAnnotation}. This object gives you
 * low level control over annotations that can be added to a Map View.
 * 
 * @since 0.9
 */
public class Annotation extends org.urish.gwtit.titanium.Proxy {
	protected Annotation() {
	}

	/**
	 * @return Boolean to indicate whether the pin should animate when dropped
	 */
	public final native boolean getAnimate()
	/*-{
		return this.animate;
	}-*/;

	public final native void setAnimate(boolean value)
	/*-{
		this.animate = value;
	}-*/;

	/**
	 * @return Image for the pin instead of default image.
	 */
	public final native String getImage()
	/*-{
		return this.image;
	}-*/;

	public final native void setImage(String value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return The latitude
	 */
	public final native float getLatitude()
	/*-{
		return this.latitude;
	}-*/;

	public final native void setLatitude(float value)
	/*-{
		this.latitude = value;
	}-*/;

	public final native void setLeftButton(float value)
	/*-{
		this.leftButton = value;
	}-*/;

	public final native void setLeftButton(String value)
	/*-{
		this.leftButton = value;
	}-*/;

	/**
	 * @return The left button image on the annotation. must either be a button
	 *         type constant or url
	 */
	public final native JavaScriptObject getLeftButton()
	/*-{
		return this.leftButton;
	}-*/;

	/**
	 * @return A left view that is displayed on the annotation
	 */
	public final native JavaScriptObject getLeftView()
	/*-{
		return this.leftView;
	}-*/;

	public final native void setLeftView(JavaScriptObject value)
	/*-{
		this.leftView = value;
	}-*/;

	/**
	 * @return The longitude
	 */
	public final native float getLongitude()
	/*-{
		return this.longitude;
	}-*/;

	public final native void setLongitude(float value)
	/*-{
		this.longitude = value;
	}-*/;

	/**
	 * @return Use {@link org.urish.gwtit.titanium.map.annotation.image}
	 *         property instead.
	 * @platforms android
	 * @deprecated since 1.4
	 */
	public final native String getPinImage()
	/*-{
		return this.pinImage;
	}-*/;

	public final native void setPinImage(String value)
	/*-{
		this.pinImage = value;
	}-*/;

	/**
	 * @return The pin color as one of
	 *         {@link org.urish.gwtit.titanium.Map.ANNOTATION_RED},
	 *         {@link org.urish.gwtit.titanium.Map.ANNOTATION_GREEN} or
	 *         {@link org.urish.gwtit.titanium.Map.ANNOTATION_PURPLE}.
	 */
	public final native int getPincolor()
	/*-{
		return this.pincolor;
	}-*/;

	public final native void setPincolor(int value)
	/*-{
		this.pincolor = value;
	}-*/;

	public final native void setRightButton(float value)
	/*-{
		this.rightButton = value;
	}-*/;

	public final native void setRightButton(String value)
	/*-{
		this.rightButton = value;
	}-*/;

	/**
	 * @return The right button image on the annotation. must either be a button
	 *         type constant or url
	 */
	public final native JavaScriptObject getRightButton()
	/*-{
		return this.rightButton;
	}-*/;

	/**
	 * @return A right view that is displayed on the annotation
	 */
	public final native JavaScriptObject getRightView()
	/*-{
		return this.rightView;
	}-*/;

	public final native void setRightView(JavaScriptObject value)
	/*-{
		this.rightView = value;
	}-*/;

	/**
	 * @return The secondary title of the annotation view
	 */
	public final native String getSubtitle()
	/*-{
		return this.subtitle;
	}-*/;

	public final native void setSubtitle(String value)
	/*-{
		this.subtitle = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the subtitle property
	 */
	public final native String getSubtitleid()
	/*-{
		return this.subtitleid;
	}-*/;

	public final native void setSubtitleid(String value)
	/*-{
		this.subtitleid = value;
	}-*/;

	/**
	 * @return The primary title of the annotation view
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public final native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public final native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

}
