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

package org.urish.gwtit.titanium.filesystem;


/**
 * The file object which support various filesystem based operations.
 * 
 * @since 0.1
 */
public class File extends org.urish.gwtit.titanium.Proxy {
	protected File() {
	}

	/**
	 * Create a directory at the path for the file object
	 */
	public native boolean createDirectory()
	/*-{
		return this.createDirectory();
	}-*/;

	/**
	 * Create a file path at the path for the file object
	 */
	public native boolean createFile()
	/*-{
		return this.createFile();
	}-*/;

	/**
	 * Return the created timestamp for the file
	 */
	public native float createTimestamp()
	/*-{
		return this.createTimestamp();
	}-*/;

	/**
	 * Delete the file directory path
	 * 
	 * @param recursive
	 *            pass true to recursively delete any contents. defaults to
	 *            false
	 */
	public native boolean deleteDirectory(boolean recursive)
	/*-{
		return this.deleteDirectory(recursive);
	}-*/;

	/**
	 * Delete the file
	 */
	public native boolean deleteFile()
	/*-{
		return this.deleteFile();
	}-*/;

	/**
	 * Returns true if the file is executable
	 * 
	 * @return Returns true if file is executable.
	 */
	public native boolean executable()
	/*-{
		return this.executable();
	}-*/;

	/**
	 * Returns true if the file or directory exists on the device
	 */
	public native boolean exists()
	/*-{
		return this.exists();
	}-*/;

	/**
	 * Return the file extension
	 */
	public native String extension()
	/*-{
		return this.extension();
	}-*/;

	/**
	 * Return an array of paths in the directory of the file object
	 */
	public native String[] getDirectoryListing()
	/*-{
		return this.getDirectoryListing();
	}-*/;

	/**
	 * Return the file parent
	 */
	public native org.urish.gwtit.titanium.filesystem.File getParent()
	/*-{
		return this.getParent();
	}-*/;

	/**
	 * Returns true if the file is hidden
	 */
	public native boolean hidden()
	/*-{
		return this.hidden();
	}-*/;

	/**
	 * Return the last modification timestamp for the file
	 */
	public native float modificationTimestamp()
	/*-{
		return this.modificationTimestamp();
	}-*/;

	/**
	 * Move the file to another path
	 * 
	 * @param newpath
	 *            new location
	 */
	public native boolean move(Object newpath)
	/*-{
		return this.move(newpath);
	}-*/;

	/**
	 * The name of the file
	 */
	public native String name()
	/*-{
		return this.name();
	}-*/;

	/**
	 * Returns the fully resolved native path
	 */
	public native String nativePath()
	/*-{
		return this.nativePath();
	}-*/;

	/**
	 * Return the contents of file as blob
	 */
	public native org.urish.gwtit.titanium.Blob read()
	/*-{
		return this.read();
	}-*/;

	/**
	 * Returns true if the file is readonly
	 */
	public native boolean readonly()
	/*-{
		return this.readonly();
	}-*/;

	/**
	 * Rename the file
	 * 
	 * @param newname
	 *            new name
	 */
	public native boolean rename(String newname)
	/*-{
		return this.rename(newname);
	}-*/;

	/**
	 * Make the file executable
	 */
	public native void setExecutable()
	/*-{
		return this.setExecutable();
	}-*/;

	/**
	 * Make the file hidden
	 */
	public native void setHidden()
	/*-{
		return this.setHidden();
	}-*/;

	/**
	 * Make the file readonly
	 */
	public native void setReadonly()
	/*-{
		return this.setReadonly();
	}-*/;

	/**
	 * Return boolean to indicate if the path has space available for storage
	 */
	public native boolean spaceAvailable()
	/*-{
		return this.spaceAvailable();
	}-*/;

	/**
	 * Returns true if the file points to a symbolic link
	 */
	public native boolean symbolicLink()
	/*-{
		return this.symbolicLink();
	}-*/;

	/**
	 * Write the contents to file.
	 * 
	 * @param contents
	 *            write the contents of string, blob or
	 *            {@link org.urish.gwtit.titanium.filesystem.File} to file
	 * @param append
	 *            (optional) append the string to the end of the file.
	 */
	public native boolean write(Object contents, boolean append)
	/*-{
		return this.write(contents, append);
	}-*/;

	/**
	 * Returns true if the file is writeable
	 */
	public native boolean writeable()
	/*-{
		return this.writeable();
	}-*/;

}
