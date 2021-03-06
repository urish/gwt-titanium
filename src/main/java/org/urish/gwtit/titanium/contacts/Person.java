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

package org.urish.gwtit.titanium.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object which represents a person in the contacts database.
 * <p>
 * Notes: There are two kinds of properties: single value and multivalue. Single
 * value properties are returned as a direct value, while mutlivalue properties
 * are returned as dictionary objects with keys which represent labels of the
 * property, with values that are arrays of all values in the property which
 * correspond to that label (e.g. {"home" : [address1, address2]})
 * 
 * @since 0.8
 */
public class Person extends org.urish.gwtit.titanium.Proxy {
	protected Person() {
	}

	/**
	 * @return URLs of webpages associated with the person. Multi-value, valid
	 *         labels are: `home`, `work`, `other`, `homepage`. Values are
	 *         strings.
	 * 
	 * @platforms iphone, ipad, ipod
	 */
	public final native JavaScriptObject getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(JavaScriptObject value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * @return The addresses for the person. Multi-value, valid labels are:
	 *         `home`, `work`, `other`. Values are dictionaries.
	 */
	public final native JavaScriptObject getAddress()
	/*-{
		return this.address;
	}-*/;

	public final native void setAddress(JavaScriptObject value)
	/*-{
		this.address = value;
	}-*/;

	/**
	 * @return The birthday of the person. Single value, format is
	 *         "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 */
	public final native String getBirthday()
	/*-{
		return this.birthday;
	}-*/;

	public final native void setBirthday(String value)
	/*-{
		this.birthday = value;
	}-*/;

	/**
	 * @return The date the person was created in the database. Single value,
	 *         format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 */
	public final native String getCreated()
	/*-{
		return this.created;
	}-*/;

	public final native void setCreated(String value)
	/*-{
		this.created = value;
	}-*/;

	/**
	 * @return Dates associated with the person. Multi-value, valid labels are:
	 *         `anniversary`. Values are strings of format
	 *         "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000"
	 */
	public final native JavaScriptObject getDate()
	/*-{
		return this.date;
	}-*/;

	public final native void setDate(JavaScriptObject value)
	/*-{
		this.date = value;
	}-*/;

	/**
	 * @return The department of the person. Single value
	 */
	public final native String getDepartment()
	/*-{
		return this.department;
	}-*/;

	public final native void setDepartment(String value)
	/*-{
		this.department = value;
	}-*/;

	/**
	 * @return The email addresses for the person. Multi-value, valid labels
	 *         are: `home`, `work`, `other`. Values are strings.
	 */
	public final native JavaScriptObject getEmail()
	/*-{
		return this.email;
	}-*/;

	public final native void setEmail(JavaScriptObject value)
	/*-{
		this.email = value;
	}-*/;

	/**
	 * @return The first name of the person. Single value
	 */
	public final native String getFirstName()
	/*-{
		return this.firstName;
	}-*/;

	public final native void setFirstName(String value)
	/*-{
		this.firstName = value;
	}-*/;

	/**
	 * @return The phonetic first name of the person. Single value
	 */
	public final native String getFirstPhonetic()
	/*-{
		return this.firstPhonetic;
	}-*/;

	public final native void setFirstPhonetic(String value)
	/*-{
		this.firstPhonetic = value;
	}-*/;

	/**
	 * @return The localized full name of the person. Single value, read-only
	 */
	public final native String getFullName()
	/*-{
		return this.fullName;
	}-*/;

	public final native void setFullName(String value)
	/*-{
		this.fullName = value;
	}-*/;

	/**
	 * @return A blob object representing the image for the person. Set to
	 *         `null` to remove the image. Single value
	 */
	public final native JavaScriptObject getImage()
	/*-{
		return this.image;
	}-*/;

	public final native void setImage(JavaScriptObject value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return The instant messenger names for the person. Multi-value, valid
	 *         labels are: `aim`, `icq`, `jabber`, `msn`, `yahoo`. Values are
	 *         dictionaries.
	 */
	public final native JavaScriptObject getInstantMessage()
	/*-{
		return this.instantMessage;
	}-*/;

	public final native void setInstantMessage(JavaScriptObject value)
	/*-{
		this.instantMessage = value;
	}-*/;

	/**
	 * @return The job title of the person. Single value
	 */
	public final native String getJobTitle()
	/*-{
		return this.jobTitle;
	}-*/;

	public final native void setJobTitle(String value)
	/*-{
		this.jobTitle = value;
	}-*/;

	/**
	 * @return The kind of person. Single value, one of
	 *         {@link org.urish.gwtit.titanium.Contacts.CONTACTS_KIND_PERSON} or
	 *         {@link org.urish.gwtit.titanium.Contacts.CONTACTS_KIND_ORGANIZATION}
	 */
	public final native int getKind()
	/*-{
		return this.kind;
	}-*/;

	public final native void setKind(int value)
	/*-{
		this.kind = value;
	}-*/;

	/**
	 * @return The last name of the person. Single value
	 */
	public final native String getLastName()
	/*-{
		return this.lastName;
	}-*/;

	public final native void setLastName(String value)
	/*-{
		this.lastName = value;
	}-*/;

	/**
	 * @return The phonetic last name of the person. Single value
	 */
	public final native String getLastPhonetic()
	/*-{
		return this.lastPhonetic;
	}-*/;

	public final native void setLastPhonetic(String value)
	/*-{
		this.lastPhonetic = value;
	}-*/;

	/**
	 * @return The middle name of the person. Single value
	 */
	public final native String getMiddleName()
	/*-{
		return this.middleName;
	}-*/;

	public final native void setMiddleName(String value)
	/*-{
		this.middleName = value;
	}-*/;

	/**
	 * @return The phonetic middle name of the person. Single value
	 */
	public final native String getMiddlePhonetic()
	/*-{
		return this.middlePhonetic;
	}-*/;

	public final native void setMiddlePhonetic(String value)
	/*-{
		this.middlePhonetic = value;
	}-*/;

	/**
	 * @return The most recent date the person was modified. Single value,
	 *         format is "yyyy-MM-dd'T'HH:mm:ss'.'SSS+0000", read-only
	 */
	public final native String getModified()
	/*-{
		return this.modified;
	}-*/;

	public final native void setModified(String value)
	/*-{
		this.modified = value;
	}-*/;

	/**
	 * @return The nickname of the person. Single value
	 */
	public final native String getNickname()
	/*-{
		return this.nickname;
	}-*/;

	public final native void setNickname(String value)
	/*-{
		this.nickname = value;
	}-*/;

	/**
	 * @return Notes for the person. Single value
	 */
	public final native String getNote()
	/*-{
		return this.note;
	}-*/;

	public final native void setNote(String value)
	/*-{
		this.note = value;
	}-*/;

	/**
	 * @return The organization the person belongs to. Single value
	 */
	public final native String getOrganization()
	/*-{
		return this.organization;
	}-*/;

	public final native void setOrganization(String value)
	/*-{
		this.organization = value;
	}-*/;

	/**
	 * @return The phone numbers for the person. Multi-value, valid labels are:
	 *         `home`, `work`, `other`, `mobile`, `pager`, `workFax`, `homeFax`,
	 *         `main`, `iPhone`. Values are strings.
	 */
	public final native JavaScriptObject getPhone()
	/*-{
		return this.phone;
	}-*/;

	public final native void setPhone(JavaScriptObject value)
	/*-{
		this.phone = value;
	}-*/;

	/**
	 * @return The prefix for the person. Single value
	 */
	public final native String getPrefix()
	/*-{
		return this.prefix;
	}-*/;

	public final native void setPrefix(String value)
	/*-{
		this.prefix = value;
	}-*/;

	/**
	 * @return The names of people the person is related to. Multi-value, valid
	 *         labels are: `mother`, `father`, `parent`, `sister`, `brother`,
	 *         `child`, `friend`, `spouse`, `partner`, `manager`, `assistant`.
	 *         Values are strings.
	 */
	public final native JavaScriptObject getRelatedNames()
	/*-{
		return this.relatedNames;
	}-*/;

	public final native void setRelatedNames(JavaScriptObject value)
	/*-{
		this.relatedNames = value;
	}-*/;

	/**
	 * @return The suffix for the person. Single value
	 */
	public final native String getSuffix()
	/*-{
		return this.suffix;
	}-*/;

	public final native void setSuffix(String value)
	/*-{
		this.suffix = value;
	}-*/;

}
