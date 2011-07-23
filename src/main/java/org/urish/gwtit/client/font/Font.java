package org.urish.gwtit.client.font;

import com.google.gwt.core.client.JavaScriptObject;

public final class Font extends JavaScriptObject {
	protected Font() {
	}

	public native static Font createFont(String family)
	/*-{ 
	 	return {fontFamily: family};
	}-*/;

	public native static Font createFont(String family, int size)
	/*-{ 
	 return {fontFamily: family, fontSize: size}; 
	}-*/;

	public native static Font createFont(int size)
	/*-{ 
	 	return {fontSize: size}; 
	}-*/;

	public static Font createFont(int size, FontStyle style) {
		return createFont_SizeStyle(size, style.toString().toLowerCase());
	}

	public static Font createFont(int size, FontWeight weight) {
		return createFont_SizeWeight(size, weight.toString().toLowerCase());
	}

	public static Font createFont(int size, FontStyle style, FontWeight weight) {
		return createFont_SizeStyleWeight(size, style.toString().toLowerCase(), weight.toString().toLowerCase());
	}

	public static Font createFont(String family, int size, FontStyle style) {
		return createFont_FamilySizeStyle(family, size, style.toString().toLowerCase());
	}

	public static Font createFont(String family, int size, FontWeight weight) {
		return createFont_FamilySizeWeight(family, size, weight.toString().toLowerCase());
	}

	public static Font createFont(String family, int size, FontStyle style, FontWeight weight) {
		return createFont_FamilySizeStyleWeight(family, size, style.toString().toLowerCase(), weight.toString().toLowerCase());
	}

	private native static Font createFont_SizeStyle(int size, String style)
	/*-{ 
	 	return {fontSize: size,	fontStyle: style}; 
	}-*/;

	private native static Font createFont_SizeWeight(int size, String weight)
	/*-{ 
	 	return {fontSize: size,	fontWeight: weight}; 
	}-*/;

	private native static Font createFont_SizeStyleWeight(int size, String style, String weight)
	/*-{ 
	 	return {fontSize: size,	fontStyle: style, fontWeight: weight}; 
	}-*/;

	private native static Font createFont_FamilySizeStyle(String family, int size, String style)
	/*-{ 
	 	return {fontFamily: family, fontSize: size,	fontStyle: style}; 
	}-*/;

	private native static Font createFont_FamilySizeWeight(String family, int size, String weight)
	/*-{ 
	 	return {fontFamily: family, fontSize: size,	fontWeight: weight}; 
	}-*/;

	private native static Font createFont_FamilySizeStyleWeight(String family, int size, String style, String weight)
	/*-{ 
	 	return {fontFamily: family, fontSize: size,	fontStyle: style, fontWeight: weight}; 
	}-*/;

	public native String getFamily()
	/*-{
	    return this.fontFamily;
	}-*/;

	public native int getSize()
	/*-{
	    return this.fontSize;
	}-*/;

	private native String internalGetWeight()
	/*-{
		return this.fontWeight;
	}-*/;

	public FontWeight getWeight() {
		return FontWeight.valueOf(internalGetWeight().toUpperCase());
	}

	public native String internalGetStyle()
	/*-{
		return this.fontStyle;
	}-*/;

	public FontStyle getStyle() {
		return FontStyle.valueOf(internalGetStyle().toUpperCase());
	}
}
