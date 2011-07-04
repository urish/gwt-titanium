package com.titanium.ui;

import com.titanium.core.TitaniumObject;

public interface Window extends TitaniumObject {
	public String getTitle();

	public Window setTitle(String value);

	public void open();
}
