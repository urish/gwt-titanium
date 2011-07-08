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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * The top level contacts module. the contacts module is used accessing the
 * device address book. (read-only on android.)
 * <p>
 * Notes: Contacts on Android are currently only read-only, so methods such as
 * `createPerson`, `removePerson`, etc., are not supported.
 * <Titanium.Contacts.Person> objects which have been removed from the database
 * are invalidated after a save operation, whether from creating a new contact
 * or explicitly calling <Titanium.Contacts.save()>. Using them may result in
 * unpredictable behavior, including crashes.
 * 
 * @since 0.8
 */
public class Contacts extends org.urish.gwtit.titanium.Module {
	protected Contacts() {
	}

	public static final Const CONTACTS_KIND_ORGANIZATION = new ConstImpl("Titanium.Contacts.CONTACTS_KIND_ORGANIZATION");

	public static final Const CONTACTS_KIND_PERSON = new ConstImpl("Titanium.Contacts.CONTACTS_KIND_PERSON");

	public static final Const CONTACTS_SORT_FIRST_NAME = new ConstImpl("Titanium.Contacts.CONTACTS_SORT_FIRST_NAME");

	public static final Const CONTACTS_SORT_LAST_NAME = new ConstImpl("Titanium.Contacts.CONTACTS_SORT_LAST_NAME");

	/**
	 * Create and return an instance of titanium.contacts.group
	 * 
	 * @platforms iphone, ipad
	 * @param parameters
	 *            (optional) a dictionary object properties defined in
	 *            Titanium.Contacts.Group
	 */
	public static native org.urish.gwtit.titanium.contacts.Group createGroup(
			org.urish.gwtit.titanium.contacts.Group parameters)
	/*-{
		return Titanium.Contacts.createGroup(parameters);
	}-*/;

	/**
	 * Create and return an instance of titanium.contacts.person
	 * 
	 * @platforms ipad, iphone
	 * @param parameters
	 *            (optional) a dictionary object properties defined in
	 *            Titanium.Contacts.Person
	 */
	public static native org.urish.gwtit.titanium.contacts.Person createPerson(
			org.urish.gwtit.titanium.contacts.Person parameters)
	/*-{
		return Titanium.Contacts.createPerson(parameters);
	}-*/;

	/**
	 * Returns an of all {@link org.urish.gwtit.titanium.contacts.group} objects
	 * in the contacts database
	 * 
	 * @platforms ipad, iphone
	 */
	public static native void getAllGroups()
	/*-{
		return Titanium.Contacts.getAllGroups();
	}-*/;

	/**
	 * Returns an array of all {@link org.urish.gwtit.titanium.contacts.person}
	 * objects in the contacts database
	 */
	public static native void getAllPeople()
	/*-{
		return Titanium.Contacts.getAllPeople();
	}-*/;

	/**
	 * Returns a {@link org.urish.gwtit.titanium.contacts.group} object with the
	 * given id
	 * 
	 * @platforms iphone, ipad
	 * @param id
	 *            The database ID of the group to retrieve
	 */
	public static native org.urish.gwtit.titanium.contacts.Group getGroupByID(float id)
	/*-{
		return Titanium.Contacts.getGroupByID(id);
	}-*/;

	/**
	 * Returns an array of {@link org.urish.gwtit.titanium.contacts.person}
	 * objects who have a name (first, last, middle, composite) which matches
	 * the given name
	 * 
	 * @param name
	 *            The name to match in the database
	 */
	public static native org.urish.gwtit.titanium.contacts.Person[] getPeopleWithName(String name)
	/*-{
		return Titanium.Contacts.getPeopleWithName(name);
	}-*/;

	/**
	 * Returns a {@link org.urish.gwtit.titanium.contacts.person} object with
	 * the given id
	 * 
	 * @param id
	 *            The database ID of the person to retrieve
	 */
	public static native org.urish.gwtit.titanium.contacts.Person getPersonByID(float id)
	/*-{
		return Titanium.Contacts.getPersonByID(id);
	}-*/;

	/**
	 * Removes a group from the contacts database.
	 * 
	 * @platforms iphone, ipad
	 * @param group
	 *            The {@link org.urish.gwtit.titanium.contacts.Group} object to
	 *            remove from the database.
	 */
	public static native void removeGroup(org.urish.gwtit.titanium.contacts.Group group)
	/*-{
		return Titanium.Contacts.removeGroup(group);
	}-*/;

	/**
	 * Removes a person from the contacts database.
	 * 
	 * @platforms iphone, ipad
	 * @param person
	 *            The {@link org.urish.gwtit.titanium.contacts.Person} object to
	 *            remove from the database.
	 */
	public static native void removePerson(org.urish.gwtit.titanium.contacts.Person person)
	/*-{
		return Titanium.Contacts.removePerson(person);
	}-*/;

	/**
	 * Reverts all changes made to the previous save of the database.
	 * 
	 * @platforms iphone, ipad
	 */
	public static native void revert()
	/*-{
		return Titanium.Contacts.revert();
	}-*/;

	/**
	 * Saves all changes to contacts to the database.
	 */
	public static native void save()
	/*-{
		return Titanium.Contacts.save();
	}-*/;

	/**
	 * Displays the contact picker
	 * 
	 * @param cancel
	 *            The function to call when selection is cancelled
	 * @param selectedPerson
	 *            The function to call when a person is selected. Mutually
	 *            exclusive with `selectedProperty`
	 * @param selectedProperty
	 *            The function to call when a property is selected. Mutally
	 *            exclusive with `selectedPerson`
	 * @param animated
	 *            Whether or not to animate the show/hide of the contacts picker
	 * @param fields
	 *            A list of field names to show when selecting properties,
	 *            default is to show all available
	 */
	public static native void showContacts(Object cancel, Object selectedPerson, Object selectedProperty,
			boolean animated, String[] fields)
	/*-{
		return Titanium.Contacts.showContacts(cancel, selectedPerson, selectedProperty, animated, fields);
	}-*/;

}