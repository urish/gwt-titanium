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


/**
 * An object which represents a group in the contacts database.
 * 
 * @platforms iphone, ipad
 * @since 1.4.0
 */
public class Group extends org.urish.gwtit.titanium.Proxy {
	protected Group() {
	}

	/**
	 * @return The name of the group
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native void setName(String value)
	/*-{
		this.name = value;
	}-*/;

	/**
	 * Adds a person to the group
	 * 
	 * @param person
	 *            {@link org.urish.gwtit.titanium.contacts.Person} object to add
	 *            to the group
	 */
	public final native void add(org.urish.gwtit.titanium.contacts.Person person)
	/*-{
		return this.add(person);
	}-*/;

	/**
	 * The complete list of members of the group
	 */
	public final native void members()
	/*-{
		return this.members();
	}-*/;

	/**
	 * Removes a person from the group
	 * 
	 * @param person
	 *            {@link org.urish.gwtit.titanium.contacts.Person} object to
	 *            remove from the group
	 */
	public final native void remove(org.urish.gwtit.titanium.contacts.Person person)
	/*-{
		return this.remove(person);
	}-*/;

	/**
	 * A list of sorted members
	 * 
	 * @param sortBy
	 *            Method for sorting. Must be one of
	 *            {@link org.urish.gwtit.titanium.Contacts.CONTACTS_SORT_FIRST_NAME}
	 *            or
	 *            {@link org.urish.gwtit.titanium.Contacts.CONTACTS_SORT_LAST_NAME}
	 */
	public final native void sortedMembers(float sortBy)
	/*-{
		return this.sortedMembers(sortBy);
	}-*/;

}
