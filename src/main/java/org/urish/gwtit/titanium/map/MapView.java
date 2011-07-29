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

package org.urish.gwtit.titanium.map;

import org.urish.gwtit.client.EventCallback;

/**
 * The mapview is an object created by
 * {@link org.urish.gwtit.titanium.map.createmapview} and is used for embedding
 * native mapping capabilities as a view in your application. with native maps,
 * you can control the mapping location, the type of map, the zoom level and you
 * can add custom annotations directly to the map.
 * <p>
 * Notes: For Android, you will need to <a
 * href="http://code.google.com/android/maps-api-signup.html">obtain a map key
 * from Google</a> to use maps in your application. On iPhone, you cannot call
 * any methods on a map view until it has been added to a view.
 * 
 * @since 0.8
 */
public class MapView extends org.urish.gwtit.titanium.ui.View {
	protected MapView() {
	}

	/**
	 * @return Boolean is mapping actions should be animated
	 */
	public final native boolean getAnimate()
	/*-{
		return this.animate;
	}-*/;

	public final native void setAnimate(boolean value)
	/*-{
		this.animate = value;
	}-*/;

	/**
	 * @return An array of annotations to add to the map
	 */
	public final native Object[] getAnnotations()
	/*-{
		return this.annotations;
	}-*/;

	public final native void setAnnotations(Object[] value)
	/*-{
		this.annotations = value;
	}-*/;

	/**
	 * @return The map type constant of either
	 *         {@link org.urish.gwtit.titanium.map.standard_type},
	 *         {@link org.urish.gwtit.titanium.map.satellite_type} or
	 *         {@link org.urish.gwtit.titanium.map.hybrid_type}.
	 */
	public final native float getMapType()
	/*-{
		return this.mapType;
	}-*/;

	public final native void setMapType(float value)
	/*-{
		this.mapType = value;
	}-*/;

	/**
	 * @return A dictionary that specifies the following properties specifying
	 *         the region location to set the map: `latitudedelta`,
	 *         `longitudedelta`, `latitude`, `longitude`.
	 */
	public final native Object getRegion()
	/*-{
		return this.region;
	}-*/;

	public final native void setRegion(Object value)
	/*-{
		this.region = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the map should attempt to fit the map view
	 *         into the region in the visible view
	 */
	public final native boolean getRegionFit()
	/*-{
		return this.regionFit;
	}-*/;

	public final native void setRegionFit(boolean value)
	/*-{
		this.regionFit = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the map should show the user's current
	 *         device location as a pin on the map
	 */
	public final native boolean getUserLocation()
	/*-{
		return this.userLocation;
	}-*/;

	public final native void setUserLocation(boolean value)
	/*-{
		this.userLocation = value;
	}-*/;

	/**
	 * Add a new annotation to the map
	 * 
	 * @param annotation
	 *            either a dictionary of properties for the annotation or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} instance.
	 */
	public final native void addAnnotation(Object annotation)
	/*-{
		return this.addAnnotation(annotation);
	}-*/;

	/**
	 * Add one or more new annotation to the map
	 * 
	 * @param annotations
	 *            an array of either a dictionary of properties for the
	 *            annotation or a
	 *            [Titanium.Map.Annotation](Titanium.Map.Annotation) instance.
	 */
	public final native void addAnnotations(Object annotations)
	/*-{
		return this.addAnnotations(annotations);
	}-*/;

	/**
	 * Add a route. currently only supported on iphone
	 * 
	 * @param route
	 *            dictionary with the properties: `name` route name, `points`
	 *            dictionary of values with longitude and latitude keys, `color`
	 *            for the line color and `width` for the line width.
	 */
	public final native void addRoute(Object route)
	/*-{
		return this.addRoute(route);
	}-*/;

	/**
	 * Cause the annotation to be deselected (hidden).
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public final native void deselectAnnotation(Object annotation)
	/*-{
		return this.deselectAnnotation(annotation);
	}-*/;

	/**
	 * Removes all annotations added to the map
	 */
	public final native void removeAllAnnotations()
	/*-{
		return this.removeAllAnnotations();
	}-*/;

	/**
	 * Remove an existing annotation from the map
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public final native void removeAnnotation(Object annotation)
	/*-{
		return this.removeAnnotation(annotation);
	}-*/;

	/**
	 * Remove one or more existing annotations from the map
	 * 
	 * @param annotation
	 *            an array of either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public final native void removeAnnotations(Object annotation)
	/*-{
		return this.removeAnnotations(annotation);
	}-*/;

	/**
	 * Remove a previously added route. currently only supported on iphone
	 * 
	 * @param route
	 *            same route object used during addRoute
	 */
	public final native void removeRoute(Object route)
	/*-{
		return this.removeRoute(route);
	}-*/;

	/**
	 * Cause the annotation to be selected (shown).
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public final native void selectAnnotation(Object annotation)
	/*-{
		return this.selectAnnotation(annotation);
	}-*/;

	/**
	 * Set and center the map location.
	 * 
	 * @param location
	 *            a dictionary that specifies the following properties
	 *            specifying the location to set the map: `latitudeDelta`,
	 *            `longitudeDelta`, `latitude`, `longitude`.
	 */
	public final native void setLocation(Object location)
	/*-{
		return this.setLocation(location);
	}-*/;

	/**
	 * Zoom in or out of the map
	 * 
	 * @param level
	 *            zoom level (can be positive or negative)
	 */
	public final native void zoom(float level)
	/*-{
		return this.zoom(level);
	}-*/;

	public final static class CompleteEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "complete";

		protected CompleteEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addCompleteHandler(EventCallback<CompleteEvent> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ErrorEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "error";

		protected ErrorEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * the error message
		 */
		public final native Object getMessage()
		/*-{
			return this.message;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addErrorHandler(EventCallback<ErrorEvent> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class LoadingEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "loading";

		protected LoadingEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addLoadingHandler(EventCallback<LoadingEvent> handler)
	/*-{
		return this.addEventListener('loading', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class RegionChangedEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "regionChanged";

		protected RegionChangedEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the new longitude
		 */
		public final native Object getLongitude()
		/*-{
			return this.longitude;
		}-*/;

		/**
		 * the new latitude delta
		 */
		public final native Object getLatitudeDelta()
		/*-{
			return this.latitudeDelta;
		}-*/;

		/**
		 * the new longitude delta
		 */
		public final native Object getLongitudeDelta()
		/*-{
			return this.longitudeDelta;
		}-*/;

		/**
		 * the new latitude
		 */
		public final native Object getLatitude()
		/*-{
			return this.latitude;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addRegionChangedHandler(EventCallback<RegionChangedEvent> handler)
	/*-{
		return this.addEventListener('regionChanged', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}