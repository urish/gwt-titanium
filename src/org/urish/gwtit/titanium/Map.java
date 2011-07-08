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
 * The top level map module. the map module is used for creating in-application
 * native maps.
 * 
 * @since 0.8
 */
public class Map extends org.urish.gwtit.titanium.Module {
	protected Map() {
	}

	public static final Const HYBRID_TYPE = new ConstImpl("Titanium.Map.HYBRID_TYPE");

	public static final Const SATELLITE_TYPE = new ConstImpl("Titanium.Map.SATELLITE_TYPE");

	public static final Const STANDARD_TYPE = new ConstImpl("Titanium.Map.STANDARD_TYPE");

	public static native org.urish.gwtit.titanium.map.Annotation createAnnotation()
	/*-{
		return Titanium.Map.createAnnotation();
	}-*/;

	public static native org.urish.gwtit.titanium.map.MapView createMapView()
	/*-{
		return Titanium.Map.createMapView();
	}-*/;

}
