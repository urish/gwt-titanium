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
	 * @return Readonly returns the fully resolved native path
	 */
	public final native String getNativePath()
	/*-{
		return this.nativePath;
	}-*/;

	/**
	 * Create a directory at the path for the file object
	 */
	public final native boolean createDirectory()
	/*-{
		return this.createDirectory();
	}-*/;

	/**
	 * Create a file path at the path for the file object
	 */
	public final native boolean createFile()
	/*-{
		return this.createFile();
	}-*/;

	/**
	 * Return the created timestamp for the file
	 */
	public final native int createTimestamp()
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
	public final native boolean deleteDirectory(boolean recursive)
	/*-{
		return this.deleteDirectory(recursive);
	}-*/;

	/**
	 * Delete the file
	 */
	public final native boolean deleteFile()
	/*-{
		return this.deleteFile();
	}-*/;

	/**
	 * Returns true if the file is executable
	 * 
	 * @return Returns true if file is executable.
	 */
	public final native boolean executable()
	/*-{
		return this.executable();
	}-*/;

	/**
	 * Returns true if the file or directory exists on the device
	 */
	public final native boolean exists()
	/*-{
		return this.exists();
	}-*/;

	/**
	 * Return the file extension
	 */
	public final native String extension()
	/*-{
		return this.extension();
	}-*/;

	/**
	 * Return an array of paths in the directory of the file object
	 */
	public final native String[] getDirectoryListing()
	/*-{
		return this.getDirectoryListing();
	}-*/;

	/**
	 * Return the file parent
	 */
	public final native org.urish.gwtit.titanium.filesystem.File getParent()
	/*-{
		return this.getParent();
	}-*/;

	/**
	 * Returns true if the file is hidden
	 */
	public final native boolean hidden()
	/*-{
		return this.hidden();
	}-*/;

	/**
	 * Return the last modification timestamp for the file
	 */
	public final native int modificationTimestamp()
	/*-{
		return this.modificationTimestamp();
	}-*/;

	/**
	 * Move the file to another path
	 * 
	 * @param newpath
	 *            new location
	 */
	public final native boolean move(Object newpath)
	/*-{
		return this.move(newpath);
	}-*/;

	/**
	 * The name of the file
	 */
	public final native String name()
	/*-{
		return this.name();
	}-*/;

	/**
	 * Return the contents of file as blob
	 */
	public final native org.urish.gwtit.titanium.Blob read()
	/*-{
		return this.read();
	}-*/;

	/**
	 * Returns true if the file is readonly
	 */
	public final native boolean readonly()
	/*-{
		return this.readonly();
	}-*/;

	/**
	 * Rename the file
	 * 
	 * @param newname
	 *            new name
	 */
	public final native boolean rename(String newname)
	/*-{
		return this.rename(newname);
	}-*/;

	/**
	 * Make the file executable
	 */
	public final native void setExecutable()
	/*-{
		return this.setExecutable();
	}-*/;

	/**
	 * Make the file hidden
	 */
	public final native void setHidden()
	/*-{
		return this.setHidden();
	}-*/;

	/**
	 * Make the file readonly
	 */
	public final native void setReadonly()
	/*-{
		return this.setReadonly();
	}-*/;

	/**
	 * Return boolean to indicate if the path has space available for storage
	 */
	public final native boolean spaceAvailable()
	/*-{
		return this.spaceAvailable();
	}-*/;

	/**
	 * Returns true if the file points to a symbolic link
	 */
	public final native boolean symbolicLink()
	/*-{
		return this.symbolicLink();
	}-*/;

	/**
	 * Write the contents to file.
	 * 
	 * @param contents
	 *            write the contents of string, blob or
	 *            {@link org.urish.gwtit.titanium.filesystem.File} to file
	 */
	public final native boolean write(Object contents)
	/*-{
		return this.write(contents);
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
	public final native boolean write(Object contents, boolean append)
	/*-{
		return this.write(contents, append);
	}-*/;

	/**
	 * Returns true if the file is writeable
	 */
	public final native boolean writeable()
	/*-{
		return this.writeable();
	}-*/;

}
