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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

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

	public static final Const URL = new ConstImpl("Titanium.Contacts.Person.URL");

	/**
	 * @return The addresses for the person. multi-value, valid labels are:
	 *         `home`, `work`, `other`. values are dictionaries.
	 */
	public native Object getAddress()
	/*-{
		return this.address;
	}-*/;

	public native void setAddress(Object value)
	/*-{
		this.address = value;
	}-*/;

	/**
	 * @return The birthday of the person. single value, format is
	 *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
	 */
	public native String getBirthday()
	/*-{
		return this.birthday;
	}-*/;

	public native void setBirthday(String value)
	/*-{
		this.birthday = value;
	}-*/;

	/**
	 * @return The date the person was created in the database. single value,
	 *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
	 */
	public native String getCreated()
	/*-{
		return this.created;
	}-*/;

	public native void setCreated(String value)
	/*-{
		this.created = value;
	}-*/;

	/**
	 * @return Dates associated with the person. multi-value, valid labels are:
	 *         `anniversary`. values are strings of format
	 *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
	 */
	public native Object getDate()
	/*-{
		return this.date;
	}-*/;

	public native void setDate(Object value)
	/*-{
		this.date = value;
	}-*/;

	/**
	 * @return The department of the person. single value
	 */
	public native String getDepartment()
	/*-{
		return this.department;
	}-*/;

	public native void setDepartment(String value)
	/*-{
		this.department = value;
	}-*/;

	/**
	 * @return The email addresses for the person. multi-value, valid labels
	 *         are: `home`, `work`, `other`. values are strings.
	 */
	public native Object getEmail()
	/*-{
		return this.email;
	}-*/;

	public native void setEmail(Object value)
	/*-{
		this.email = value;
	}-*/;

	/**
	 * @return The first name of the person. single value
	 */
	public native String getFirstName()
	/*-{
		return this.firstName;
	}-*/;

	public native void setFirstName(String value)
	/*-{
		this.firstName = value;
	}-*/;

	/**
	 * @return The phonetic first name of the person. single value
	 */
	public native String getFirstPhonetic()
	/*-{
		return this.firstPhonetic;
	}-*/;

	public native void setFirstPhonetic(String value)
	/*-{
		this.firstPhonetic = value;
	}-*/;

	/**
	 * @return The localized full name of the person. single value, read-only
	 */
	public native String getFullName()
	/*-{
		return this.fullName;
	}-*/;

	public native void setFullName(String value)
	/*-{
		this.fullName = value;
	}-*/;

	/**
	 * @return A blob object representing the image for the person. set to
	 *         `null` to remove the image. single value
	 */
	public native Object getImage()
	/*-{
		return this.image;
	}-*/;

	public native void setImage(Object value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return The instant messenger names for the person. multi-value, valid
	 *         labels are: `aim`, `icq`, `jabber`, `msn`, `yahoo`. values are
	 *         dictionaries.
	 */
	public native Object getInstantMessage()
	/*-{
		return this.instantMessage;
	}-*/;

	public native void setInstantMessage(Object value)
	/*-{
		this.instantMessage = value;
	}-*/;

	/**
	 * @return The job title of the person. single value
	 */
	public native String getJobTitle()
	/*-{
		return this.jobTitle;
	}-*/;

	public native void setJobTitle(String value)
	/*-{
		this.jobTitle = value;
	}-*/;

	/**
	 * @return The kind of person. single value, one of
	 *         {@link org.urish.gwtit.titanium.contacts.contacts_kind_person} or
	 *         {@link org.urish.gwtit.titanium.contacts.contacts_kind_organization}
	 */
	public native float getKind()
	/*-{
		return this.kind;
	}-*/;

	public native void setKind(float value)
	/*-{
		this.kind = value;
	}-*/;

	/**
	 * @return The last name of the person. single value
	 */
	public native String getLastName()
	/*-{
		return this.lastName;
	}-*/;

	public native void setLastName(String value)
	/*-{
		this.lastName = value;
	}-*/;

	/**
	 * @return The phonetic last name of the person. single value
	 */
	public native String getLastPhonetic()
	/*-{
		return this.lastPhonetic;
	}-*/;

	public native void setLastPhonetic(String value)
	/*-{
		this.lastPhonetic = value;
	}-*/;

	/**
	 * @return The middle name of the person. single value
	 */
	public native String getMiddleName()
	/*-{
		return this.middleName;
	}-*/;

	public native void setMiddleName(String value)
	/*-{
		this.middleName = value;
	}-*/;

	/**
	 * @return The phonetic middle name of the person. single value
	 */
	public native String getMiddlePhonetic()
	/*-{
		return this.middlePhonetic;
	}-*/;

	public native void setMiddlePhonetic(String value)
	/*-{
		this.middlePhonetic = value;
	}-*/;

	/**
	 * @return The most recent date the person was modified. single value,
	 *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
	 */
	public native String getModified()
	/*-{
		return this.modified;
	}-*/;

	public native void setModified(String value)
	/*-{
		this.modified = value;
	}-*/;

	/**
	 * @return The nickname of the person. single value
	 */
	public native String getNickname()
	/*-{
		return this.nickname;
	}-*/;

	public native void setNickname(String value)
	/*-{
		this.nickname = value;
	}-*/;

	/**
	 * @return Notes for the person. single value
	 */
	public native String getNote()
	/*-{
		return this.note;
	}-*/;

	public native void setNote(String value)
	/*-{
		this.note = value;
	}-*/;

	/**
	 * @return The organization the person belongs to. single value
	 */
	public native String getOrganization()
	/*-{
		return this.organization;
	}-*/;

	public native void setOrganization(String value)
	/*-{
		this.organization = value;
	}-*/;

	/**
	 * @return The phone numbers for the person. multi-value, valid labels are:
	 *         `home`, `work`, `other`, `mobile`, `pager`, `workfax`, `homefax`,
	 *         `main`, `iphone`. values are strings.
	 */
	public native Object getPhone()
	/*-{
		return this.phone;
	}-*/;

	public native void setPhone(Object value)
	/*-{
		this.phone = value;
	}-*/;

	/**
	 * @return The prefix for the person. single value
	 */
	public native String getPrefix()
	/*-{
		return this.prefix;
	}-*/;

	public native void setPrefix(String value)
	/*-{
		this.prefix = value;
	}-*/;

	/**
	 * @return The names of people the person is related to. multi-value, valid
	 *         labels are: `mother`, `father`, `parent`, `sister`, `brother`,
	 *         `child`, `friend`, `spouse`, `partner`, `manager`, `assistant`.
	 *         values are strings.
	 */
	public native Object getRelatedNames()
	/*-{
		return this.relatedNames;
	}-*/;

	public native void setRelatedNames(Object value)
	/*-{
		this.relatedNames = value;
	}-*/;

	/**
	 * @return The suffix for the person. single value
	 */
	public native String getSuffix()
	/*-{
		return this.suffix;
	}-*/;

	public native void setSuffix(String value)
	/*-{
		this.suffix = value;
	}-*/;

}
