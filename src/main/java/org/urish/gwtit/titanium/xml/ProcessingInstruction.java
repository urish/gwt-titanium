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

package org.urish.gwtit.titanium.xml;


/**
 * A way to keep processor-specific information in the text of the document. See
 * [DOM Level 2
 * Spec](http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/core
 * .html#ID-1004215813)
 * 
 * @since 0.9
 */
public class ProcessingInstruction extends org.urish.gwtit.titanium.Proxy {
	protected ProcessingInstruction() {
	}

	/**
	 * @return Retrieve the content of this processing instruction. This from
	 *         the first non white space character after the target to the
	 *         character immediatly preceding the ?>. When setting a processing
	 *         instruction, a DOMException may be thrown on an invalid
	 *         instruction.
	 */
	public final native String getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(String value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return Retrieve the target of this processing instruction. XML defines
	 *         this as being the first token following the markup that begins
	 *         the processing instruction.
	 */
	public final native String getTarget()
	/*-{
		return this.target;
	}-*/;

}
