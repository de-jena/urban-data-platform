/**
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.atlas.traficam;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fennec.event.atlas.mapping.functions.ValueFunction;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Component;

/**
 * Builds a camera's viewport: the four corners of its {@code Scene} as a GeoJSON
 * {@link GeometryCollection}. It replaces {@code TrafiCamListener.viewport(Scene)}, which a
 * mapping cannot express as a feature path - the value is computed from a whole object, which
 * is what a {@link ValueFunction} is for.
 * <p>
 * The mapping hands it the {@code Scene}, through the feature path of its
 * {@code valueMapping}. It also accepts the whole {@code CamConfig}, so the same function
 * answers a mapping that names no path.
 * <p>
 * The features are read reflectively instead of through the generated {@code Scene} and
 * {@code GpsCoordinates} interfaces, so the function also serves a payload whose package was
 * delivered dynamically - from a Model Atlas, say - where a cast to the generated type fails.
 * <p>
 * Producing {@code null} is the way to say "nothing": the mapping engine then leaves the
 * resource at its last value rather than writing an incomplete viewport.
 * 
 * @author ilenia
 * @since Nov 5, 2026
 */
@Component(name = "ViewportValueFunction", 
property = {ValueFunction.FUNCTION_ID+"="+ViewportValueFunction.FUNCTION_ID})
public class ViewportValueFunction implements ValueFunction {
	
	public static final String FUNCTION_ID = "udp.traficam.viewport";

	private static final Logger logger = System.getLogger(ViewportValueFunction.class.getName());

	/** The scene corners, in the order {@code TrafiCamListener.viewport} writes them. */
	private static final List<String> CORNERS = List.of("leftBottom", "rightBottom", "rightTop", "leftTop");

	private static final String SCENE = "scene";
	private static final String LATITUDE = "latitude";
	private static final String LONGITUDE = "longitude";

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.event.atlas.mapping.functions.ValueFunction#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Object input) {
		if (!(input instanceof EObject source)) {
			logger.log(Level.DEBUG, "The viewport function needs an EObject, not {0}", input);
			return null;
		}
		EObject scene = scene(source);
		if (scene == null) {
			logger.log(Level.DEBUG, "{0} carries no scene - no viewport", source.eClass().getName());
			return null;
		}
		List<Geometry> corners = new ArrayList<>(CORNERS.size());
		for (String corner : CORNERS) {
			Point point = point(child(scene, corner));
			if (point == null) {
				// A viewport with three corners is not a smaller viewport, it is a wrong one.
				logger.log(Level.WARNING, "Scene corner {0} is missing - no viewport", corner);
				return null;
			}
			corners.add(point);
		}
		return new GeometryCollection(corners, null, null);
	}

	/**
	 * The object itself when the mapping's feature path already found the scene, its contained
	 * scene when the function is handed the whole configuration.
	 */
	private static EObject scene(EObject source) {
		return feature(source, CORNERS.get(0)) != null ? source : child(source, SCENE);
	}

	/**
	 * A GeoJSON point of one {@code GpsCoordinates}. Longitude first - that is the GeoJSON
	 * order, and the order {@code TrafiCamListener.point} uses.
	 */
	private static Point point(EObject gps) {
		Double longitude = number(gps, LONGITUDE);
		Double latitude = number(gps, LATITUDE);
		return longitude == null || latitude == null ? null : new Point(longitude, latitude);
	}

	private static EObject child(EObject owner, String featureName) {
		return value(owner, featureName) instanceof EObject child ? child : null;
	}

	private static Double number(EObject owner, String featureName) {
		return value(owner, featureName) instanceof Number number ? number.doubleValue() : null;
	}

	private static Object value(EObject owner, String featureName) {
		EStructuralFeature feature = feature(owner, featureName);
		return feature == null ? null : owner.eGet(feature);
	}

	private static EStructuralFeature feature(EObject owner, String featureName) {
		return owner == null ? null : owner.eClass().getEStructuralFeature(featureName);
	}

}
