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
 * The 2dmatrix is created by {@link org.urish.gwtit.titanium.ui.create2dmatrix}
 * . the 2d matrix is an object for holding values for an affine transformation
 * matrix. a 2d matrix is used to rotate, scale, translate, or skew the objects
 * in a two-dimensional space. a 2d matrix is represented by a 3 by 3 matrix.
 * because the third column is always (0,0,1), the data structure contains
 * values for only the first two columns.
 * <p>
 * Notes: You create an `identity matrix` by creating a 2D Matrix with an empty
 * constructor.
 * 
 * @since 0.9
 */
public class _2DMatrix extends org.urish.gwtit.titanium.Proxy {
	protected _2DMatrix() {
	}

	/**
	 * @return The entry at position [1,1] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getA()
	/*-{
		return this.a;
	}-*/;

	public native void setA(float value)
	/*-{
		this.a = value;
	}-*/;

	/**
	 * @return The entry at position [1,2] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getB()
	/*-{
		return this.b;
	}-*/;

	public native void setB(float value)
	/*-{
		this.b = value;
	}-*/;

	/**
	 * @return The entry at position [2,1] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getC()
	/*-{
		return this.c;
	}-*/;

	public native void setC(float value)
	/*-{
		this.c = value;
	}-*/;

	/**
	 * @return The entry at position [2,2] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getD()
	/*-{
		return this.d;
	}-*/;

	public native void setD(float value)
	/*-{
		this.d = value;
	}-*/;

	/**
	 * @return The entry at position [3,1] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getTx()
	/*-{
		return this.tx;
	}-*/;

	public native void setTx(float value)
	/*-{
		this.tx = value;
	}-*/;

	/**
	 * @return The entry at position [3,2] in the matrix.
	 * @platforms iphone, ipad
	 */
	public native float getTy()
	/*-{
		return this.ty;
	}-*/;

	public native void setTy(float value)
	/*-{
		this.ty = value;
	}-*/;

	/**
	 * Returns a matrix constructed by inverting an existing matrix
	 */
	public native void invert()
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
	public native Object multiply(Object t2)
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
	 */
	public native Object rotate(float angle)
	/*-{
		return this.rotate(angle);
	}-*/;

	/**
	 * Returns a matrix constructed by scaling an existing matrix
	 * 
	 * @param sx
	 *            The value by which to scale x values of the matrix
	 * @param sy
	 *            The value by which to scale y values of the matrix
	 */
	public native Object scale(float sx, float sy)
	/*-{
		return this.scale(sx, sy);
	}-*/;

	/**
	 * Returns a matrix constructed by translating an existing matrix
	 * 
	 * @param tx
	 *            The value by which to move x values with the matrix
	 * @param ty
	 *            The value by which to move y values with the matrix
	 */
	public native Object translate(float tx, float ty)
	/*-{
		return this.translate(tx, ty);
	}-*/;

}