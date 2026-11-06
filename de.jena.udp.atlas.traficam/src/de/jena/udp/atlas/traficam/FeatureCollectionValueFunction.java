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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fennec.event.atlas.mapping.functions.ValueFunction;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Component;

/**
 * Builds the objects of one {@code ObservedClass} into a GeoJSON {@link FeatureCollection}:
 * one {@link Feature} per detection, placed at its first GPS coordinate and carrying the
 * {@code id}, {@code speed} and {@code heading} the camera reported. It replaces the feature
 * building {@code DetectionWindow} used to do inline, before the window was reduced to the
 * part a mapping cannot express.
 * <p>
 * <b>Two inputs, both supported.</b> The mapping names the feature path
 * {@code ObservedClass/objects}, so the engine hands over the list itself:
 * {@code ValueMapperImpl.followPathForFunction} passes a collection a path ENDS on whole,
 * narrowing it only where the mapping asks with a {@code collectionFilter} or a non-zero
 * {@code collectionIndex}. A mapping that names no path at all is served too - the engine then
 * passes the service source, and the function reads {@code objects} off it - which keeps the
 * same shape {@link ViewportValueFunction} has.
 * <p>
 * <b>An empty window yields an empty collection, not nothing.</b> This is the one place where
 * this function parts company with {@link ViewportValueFunction}, which returns {@code null}
 * so the engine keeps the last value. "The camera sees nothing right now" is an observation
 * the twin has to hear - {@code DetectionWindow} reports an empty window once for that very
 * reason - and {@code null} here would freeze the last objects on screen for good.
 * <p>
 * A detection that cannot be placed is left out rather than placed wrongly, and a truncated
 * collection is refused outright, in the spirit of the viewport that is not built from three
 * corners.
 * <p>
 * The features are read reflectively instead of through the generated {@code ObservedClass}
 * and {@code TrafiCamObject} interfaces, so the function also serves a payload whose package
 * was delivered dynamically - from a Model Atlas, say - where a cast to the generated type
 * fails.
 * 
 * @author ilenia
 * @since Nov 6, 2026
 */
@Component(name = "FeatureCollectionValueFunction", 
property = {ValueFunction.FUNCTION_ID+"="+FeatureCollectionValueFunction.FUNCTION_ID})
public class FeatureCollectionValueFunction implements ValueFunction {

	public static final String FUNCTION_ID = "udp.traficam.detections";

	private static final Logger logger = System.getLogger(FeatureCollectionValueFunction.class.getName());

	private static final String OBJECTS = "objects";
	private static final String GPS_COORDINATES = "gpsCoordinates";
	private static final String ID = "id";
	private static final String SPEED = "speed";
	private static final String HEADING = "heading";
	private static final String LATITUDE = "latitude";
	private static final String LONGITUDE = "longitude";

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.event.atlas.mapping.functions.ValueFunction#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Object input) {
		List<EObject> detections = detections(input);
		if (detections == null) {
			return null;
		}
		List<Feature> features = new ArrayList<>(detections.size());
		for (EObject detection : detections) {
			Feature feature = toFeature(detection);
			if (feature != null) {
				features.add(feature);
			}
		}
		// Deliberately not null when empty: see the class comment.
		return new FeatureCollection(features, null, null);
	}

	/**
	 * The detections to place: the list the feature path found, or the {@code objects} of the
	 * class this service stands for where the mapping names no path.
	 * <p>
	 * A single detection is refused rather than placed. It reaches this function in two ways,
	 * and neither is what the {@code objects} resource means: the mapping narrowed the
	 * collection on purpose with a filter or a non-zero index, or it is running against an
	 * engine that predates {@code followPathForFunction} and silently kept the first element.
	 * Publishing the survivor would claim the camera saw one object, which is the one failure a
	 * mapping author cannot see in the result.
	 * @return the detections, or <code>null</code> where the input is no class of objects
	 */
	private static List<EObject> detections(Object input) {
		if (input instanceof List<?> objects) {
			return elements(objects);
		}
		if (!(input instanceof EObject source)) {
			logger.log(Level.DEBUG, "The detections function needs a list or an EObject, not {0}", input);
			return null;
		}
		EStructuralFeature objects = feature(source, OBJECTS);
		if (objects != null) {
			return source.eGet(objects) instanceof List<?> values ? elements(values) : List.of();
		}
		if (feature(source, GPS_COORDINATES) != null) {
			logger.log(Level.WARNING,
					"The detections function was handed a single {0} instead of a class of objects. Either the"
					+ " mapping narrows the collection with a collectionFilter or a non-zero collectionIndex,"
					+ " or the engine does not pass a collection to a function whole - no collection is"
					+ " published rather than one built from the single survivor.",
					source.eClass().getName());
			return null;
		}
		logger.log(Level.WARNING, "{0} is no class of observed objects - no collection",
				source.eClass().getName());
		return null;
	}

	/** The EObjects of a collection the engine handed over, in payload order. */
	private static List<EObject> elements(List<?> values) {
		List<EObject> elements = new ArrayList<>(values.size());
		for (Object value : values) {
			if (value instanceof EObject element) {
				elements.add(element);
			}
		}
		return elements;
	}

	/**
	 * One detection as a GeoJSON feature, at the first position the camera reported for it.
	 * The property values keep the types the model gives them, so {@code id} stays whole.
	 * @return the feature, or <code>null</code> for a detection that cannot be placed
	 */
	private static Feature toFeature(EObject detection) {
		EObject gps = first(detection, GPS_COORDINATES);
		if (gps == null) {
			logger.log(Level.DEBUG, "A detection carries no coordinates - left out");
			return null;
		}
		Double longitude = number(gps, LONGITUDE);
		Double latitude = number(gps, LATITUDE);
		if (longitude == null || latitude == null) {
			logger.log(Level.DEBUG, "A detection carries incomplete coordinates - left out");
			return null;
		}
		Object id = value(detection, ID);
		Map<String, Object> properties = new LinkedHashMap<>();
		put(properties, ID, id);
		put(properties, SPEED, value(detection, SPEED));
		put(properties, HEADING, value(gps, HEADING));
		// Longitude first - that is the GeoJSON order, and the order DetectionWindow used.
		return new Feature(id == null ? null : String.valueOf(id), new Point(longitude, latitude),
				properties, null, null);
	}

	private static void put(Map<String, Object> properties, String key, Object value) {
		if (value != null) {
			properties.put(key, value);
		}
	}

	/** The first element of a multi-valued reference, or <code>null</code> where there is none. */
	private static EObject first(EObject owner, String featureName) {
		return value(owner, featureName) instanceof List<?> elements && !elements.isEmpty()
				&& elements.get(0) instanceof EObject element ? element : null;
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
