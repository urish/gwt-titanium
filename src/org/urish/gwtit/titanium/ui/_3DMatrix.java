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

package org.urish.gwtit.titanium.ui;


/**
 * The 3dmatrix is created by {@link org.urish.gwtit.titanium.ui.create3dmatrix}
 * . the 3d matrix is an object for holding values for an affine transformation
 * matrix. a 3d matrix is used to rotate, scale, translate, or skew the objects
 * in a three-dimensional space. a 3d matrix is represented by a 4 by 4 matrix.
 * because the forth column is always (0,0,1), the data structure contains
 * values for only the first three columns.
 * <p>
 * Notes: You create an `identity matrix` by creating a 3D Matrix with an empty
 * constructor.
 * 
 * @platforms iphone, ipad
 * @since 0.9
 */
public class _3DMatrix extends org.urish.gwtit.titanium.Proxy {
	protected _3DMatrix() {
	}

	/**
	 * @return The entry at position [1,1] in the matrix.
	 */
	public final native float getM11()
	/*-{
		return this.m11;
	}-*/;

	public final native void setM11(float value)
	/*-{
		this.m11 = value;
	}-*/;

	/**
	 * @return The entry at position [1,2] in the matrix.
	 */
	public final native float getM12()
	/*-{
		return this.m12;
	}-*/;

	public final native void setM12(float value)
	/*-{
		this.m12 = value;
	}-*/;

	/**
	 * @return The entry at position [1,3] in the matrix.
	 */
	public final native float getM13()
	/*-{
		return this.m13;
	}-*/;

	public final native void setM13(float value)
	/*-{
		this.m13 = value;
	}-*/;

	/**
	 * @return The entry at position [1,4] in the matrix.
	 */
	public final native float getM14()
	/*-{
		return this.m14;
	}-*/;

	public final native void setM14(float value)
	/*-{
		this.m14 = value;
	}-*/;

	/**
	 * @return The entry at position [2,1] in the matrix.
	 */
	public final native float getM21()
	/*-{
		return this.m21;
	}-*/;

	public final native void setM21(float value)
	/*-{
		this.m21 = value;
	}-*/;

	/**
	 * @return The entry at position [2,2] in the matrix.
	 */
	public final native float getM22()
	/*-{
		return this.m22;
	}-*/;

	public final native void setM22(float value)
	/*-{
		this.m22 = value;
	}-*/;

	/**
	 * @return The entry at position [2,3] in the matrix.
	 */
	public final native float getM23()
	/*-{
		return this.m23;
	}-*/;

	public final native void setM23(float value)
	/*-{
		this.m23 = value;
	}-*/;

	/**
	 * @return The entry at position [2,4] in the matrix.
	 */
	public final native float getM24()
	/*-{
		return this.m24;
	}-*/;

	public final native void setM24(float value)
	/*-{
		this.m24 = value;
	}-*/;

	/**
	 * @return The entry at position [3,1] in the matrix.
	 */
	public final native float getM31()
	/*-{
		return this.m31;
	}-*/;

	public final native void setM31(float value)
	/*-{
		this.m31 = value;
	}-*/;

	/**
	 * @return The entry at position [3,2] in the matrix.
	 */
	public final native float getM32()
	/*-{
		return this.m32;
	}-*/;

	public final native void setM32(float value)
	/*-{
		this.m32 = value;
	}-*/;

	/**
	 * @return The entry at position [3,3] in the matrix.
	 */
	public final native float getM33()
	/*-{
		return this.m33;
	}-*/;

	public final native void setM33(float value)
	/*-{
		this.m33 = value;
	}-*/;

	/**
	 * @return The entry at position [3,4] in the matrix.
	 */
	public final native float getM34()
	/*-{
		return this.m34;
	}-*/;

	public final native void setM34(float value)
	/*-{
		this.m34 = value;
	}-*/;

	/**
	 * @return The entry at position [4,1] in the matrix.
	 */
	public final native float getM41()
	/*-{
		return this.m41;
	}-*/;

	public final native void setM41(float value)
	/*-{
		this.m41 = value;
	}-*/;

	/**
	 * @return The entry at position [4,2] in the matrix.
	 */
	public final native float getM42()
	/*-{
		return this.m42;
	}-*/;

	public final native void setM42(float value)
	/*-{
		this.m42 = value;
	}-*/;

	/**
	 * @return The entry at position [4,3] in the matrix.
	 */
	public final native float getM43()
	/*-{
		return this.m43;
	}-*/;

	public final native void setM43(float value)
	/*-{
		this.m43 = value;
	}-*/;

	/**
	 * @return The entry at position [4,4] in the matrix.
	 */
	public final native float getM44()
	/*-{
		return this.m44;
	}-*/;

	public final native void setM44(float value)
	/*-{
		this.m44 = value;
	}-*/;

	/**
	 * Returns a matrix constructed by inverting an existing matrix
	 */
	public final native void invert()
	/*-{
		return this.invert();
	}-*/;

	/**
	 * Returns a matrix constructed by combining two existing matrix.
	 * 
	 * @param t2
	 *            The second matrix. This matrix is concatenated to the matrix
	 *            instance against which the function is invoked. The result of
	 *            this function is the first matrix multiplied by the second
	 *            matrix. You might perform several multiplications in order to
	 *            create a single matrix that contains the cumulative effects of
	 *            several transformations. Note that matrix operations are not
	 *            commutative - the order in which you concatenate matrices is
	 *            important. That is, the result of multiplying matrix t1 by
	 *            matrix t2 does not necessarily equal the result of multiplying
	 *            matrix t2 by matrix t1.
	 */
	public final native Object multiply(Object t2)
	/*-{
		return this.multiply(t2);
	}-*/;

	/**
	 * Returns a matrix constructed by rotating an existing matrix
	 * 
	 * @param angle
	 *            The angle, in degrees, by which to rotate the matrix. A
	 *            positive value specifies counterclockwise rotation and a
	 *            negative value specifies clockwise rotation.
	 * @param x
	 *            The x part of the vector about which to rotate
	 * @param y
	 *            The y part of the vector about which to rotate
	 * @param z
	 *            The z part of the vector about which to rotate
	 */
	public final native Object rotate(float angle, float x, float y, float z)
	/*-{
		return this.rotate(angle, x, y, z);
	}-*/;

	/**
	 * Returns a matrix constructed by scaling an existing matrix
	 * 
	 * @param sx
	 *            The value by which to scale x values of the matrix
	 * @param sy
	 *            The value by which to scale y values of the matrix
	 * @param sz
	 *            The value by which to scale z values of the matrix
	 */
	public final native Object scale(float sx, float sy, float sz)
	/*-{
		return this.scale(sx, sy, sz);
	}-*/;

	/**
	 * Returns a matrix constructed by translating an existing matrix
	 * 
	 * @param tx
	 *            The value by which to move x values with the matrix
	 * @param ty
	 *            The value by which to move y values with the matrix
	 * @param tz
	 *            The value by which to move z values with the matrix
	 */
	public final native Object translate(float tx, float ty, float tz)
	/*-{
		return this.translate(tx, ty, tz);
	}-*/;

}
