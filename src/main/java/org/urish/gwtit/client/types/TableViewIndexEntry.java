package org.urish.gwtit.client.types;

import com.google.gwt.core.client.JavaScriptObject;

public class TableViewIndexEntry extends JavaScriptObject {
	protected TableViewIndexEntry() {
	}

	public static native TableViewIndexEntry createTableViewIndexEntry(String title, int index)
	/*-{
		return {title:title, index:index};
	}-*/;

	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native int getTitle()
	/*-{
		return this.title;
	}-*/;
}
