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
 * A slider is created by the method
 * {@link org.urish.gwtit.titanium.ui.createslider}.
 * 
 * @since 0.8
 */
public class Slider extends org.urish.gwtit.titanium.ui.View {
	protected Slider() {
	}

	/**
	 * @return The image url of the slider left track when in the disabled state
	 */
	public native String getDisabledLeftTrackImage()
	/*-{
		return this.disabledLeftTrackImage;
	}-*/;

	public native void setDisabledLeftTrackImage(String value)
	/*-{
		this.disabledLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the disabled
	 *         state
	 */
	public native String getDisabledRightTrackImage()
	/*-{
		return this.disabledRightTrackImage;
	}-*/;

	public native void setDisabledRightTrackImage(String value)
	/*-{
		this.disabledRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the disabled state
	 */
	public native String getDisabledThumbImage()
	/*-{
		return this.disabledThumbImage;
	}-*/;

	public native void setDisabledThumbImage(String value)
	/*-{
		this.disabledThumbImage = value;
	}-*/;

	/**
	 * @return Boolean to indicate the enabled state of the slider
	 */
	public native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return The image url of the slider left track when in the highlighted
	 *         state
	 */
	public native String getHighlightedLeftTrackImage()
	/*-{
		return this.highlightedLeftTrackImage;
	}-*/;

	public native void setHighlightedLeftTrackImage(String value)
	/*-{
		this.highlightedLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the highlighted
	 *         state
	 */
	public native String getHighlightedRightTrackImage()
	/*-{
		return this.highlightedRightTrackImage;
	}-*/;

	public native void setHighlightedRightTrackImage(String value)
	/*-{
		this.highlightedRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the highlighted state
	 */
	public native String getHighlightedThumbImage()
	/*-{
		return this.highlightedThumbImage;
	}-*/;

	public native void setHighlightedThumbImage(String value)
	/*-{
		this.highlightedThumbImage = value;
	}-*/;

	/**
	 * @return The image url of the slider left track
	 */
	public native String getLeftTrackImage()
	/*-{
		return this.leftTrackImage;
	}-*/;

	public native void setLeftTrackImage(String value)
	/*-{
		this.leftTrackImage = value;
	}-*/;

	/**
	 * @return The maximum slider value
	 */
	public native float getMax()
	/*-{
		return this.max;
	}-*/;

	public native void setMax(float value)
	/*-{
		this.max = value;
	}-*/;

	/**
	 * @return Value can't be moved higher than maxrange. maxrange equals max by
	 *         default. (android)
	 * @platforms android
	 */
	public native float getMaxRange()
	/*-{
		return this.maxRange;
	}-*/;

	public native void setMaxRange(float value)
	/*-{
		this.maxRange = value;
	}-*/;

	/**
	 * @return The minimum slider value
	 */
	public native float getMin()
	/*-{
		return this.min;
	}-*/;

	public native void setMin(float value)
	/*-{
		this.min = value;
	}-*/;

	/**
	 * @return Value can't be moved lower than minrange. minrange equals min by
	 *         default. (android)
	 * @platforms android
	 */
	public native float getMinRange()
	/*-{
		return this.minRange;
	}-*/;

	public native void setMinRange(float value)
	/*-{
		this.minRange = value;
	}-*/;

	/**
	 * @return The image url of the slider right track
	 */
	public native String getRightTrackImage()
	/*-{
		return this.rightTrackImage;
	}-*/;

	public native void setRightTrackImage(String value)
	/*-{
		this.rightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider left track when in the selected state
	 */
	public native String getSelectedLeftTrackImage()
	/*-{
		return this.selectedLeftTrackImage;
	}-*/;

	public native void setSelectedLeftTrackImage(String value)
	/*-{
		this.selectedLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the selected
	 *         state
	 */
	public native String getSelectedRightTrackImage()
	/*-{
		return this.selectedRightTrackImage;
	}-*/;

	public native void setSelectedRightTrackImage(String value)
	/*-{
		this.selectedRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the selected state
	 */
	public native String getSelectedThumbImage()
	/*-{
		return this.selectedThumbImage;
	}-*/;

	public native void setSelectedThumbImage(String value)
	/*-{
		this.selectedThumbImage = value;
	}-*/;

	/**
	 * @return The image url to the slider thumb
	 */
	public native String getThumbImage()
	/*-{
		return this.thumbImage;
	}-*/;

	public native void setThumbImage(String value)
	/*-{
		this.thumbImage = value;
	}-*/;

	/**
	 * @return The value of the slider
	 */
	public native String getValue()
	/*-{
		return this.value;
	}-*/;

	public native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public native void addChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
