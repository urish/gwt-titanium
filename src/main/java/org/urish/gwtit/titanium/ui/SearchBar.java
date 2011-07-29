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

/**
 * A search bar is created by the method
 * {@link org.urish.gwtit.titanium.ui.createsearchbar}.
 * <p>
 * Notes:
 * 
 * @since 0.8
 */
public class SearchBar extends org.urish.gwtit.titanium.ui.View {
	protected SearchBar() {
	}

	/**
	 * @return One of
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_none},
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_words}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_sentences}
	 *         , or
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_all}
	 *         to indicate how the field should be capitalized during typing.
	 */
	public final native float getAutocapitalization()
	/*-{
		return this.autocapitalization;
	}-*/;

	public final native void setAutocapitalization(float value)
	/*-{
		this.autocapitalization = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the text in the field should be
	 *         autocorrected as typed
	 */
	public final native boolean getAutocorrect()
	/*-{
		return this.autocorrect;
	}-*/;

	public final native void setAutocorrect(boolean value)
	/*-{
		this.autocorrect = value;
	}-*/;

	/**
	 * @return The bar color of the search bar view
	 */
	public final native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public final native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return The text to show when the search bar field is not focused
	 */
	public final native String getHintText()
	/*-{
		return this.hintText;
	}-*/;

	public final native void setHintText(String value)
	/*-{
		this.hintText = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the hinttext property
	 */
	public final native String getHinttextid()
	/*-{
		return this.hinttextid;
	}-*/;

	public final native void setHinttextid(String value)
	/*-{
		this.hinttextid = value;
	}-*/;

	/**
	 * @return The keyboard type constant to use when the field is focused
	 */
	public final native float getKeyboardType()
	/*-{
		return this.keyboardType;
	}-*/;

	public final native void setKeyboardType(float value)
	/*-{
		this.keyboardType = value;
	}-*/;

	/**
	 * @return A single line of text displayed at the top of the search bar
	 */
	public final native String getPrompt()
	/*-{
		return this.prompt;
	}-*/;

	public final native void setPrompt(String value)
	/*-{
		this.prompt = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the prompt property
	 */
	public final native String getPromptid()
	/*-{
		return this.promptid;
	}-*/;

	public final native void setPromptid(String value)
	/*-{
		this.promptid = value;
	}-*/;

	/**
	 * @return Boolean indicates whether the cancel button is displayed
	 */
	public final native boolean getShowCancel()
	/*-{
		return this.showCancel;
	}-*/;

	public final native void setShowCancel(boolean value)
	/*-{
		this.showCancel = value;
	}-*/;

	/**
	 * @return The value of the search bar
	 */
	public final native String getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * Called to force the search bar to lose focus
	 */
	public final native void blur()
	/*-{
		return this.blur();
	}-*/;

	/**
	 * Called to force the search bar to focus
	 */
	public final native void focus()
	/*-{
		return this.focus();
	}-*/;

	public final static class BlurEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "blur";

		protected BlurEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addBlurHandler(EventCallback<BlurEvent> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class CancelEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "cancel";

		protected CancelEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addCancelHandler(EventCallback<CancelEvent> handler)
	/*-{
		return this.addEventListener('cancel', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "change";

		protected ChangeEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addChangeHandler(EventCallback<ChangeEvent> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class FocusEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "focus";

		protected FocusEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addFocusHandler(EventCallback<FocusEvent> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ReturnEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "return";

		protected ReturnEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addReturnHandler(EventCallback<ReturnEvent> handler)
	/*-{
		return this.addEventListener('return', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}