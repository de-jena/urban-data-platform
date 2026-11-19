/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.atlas.ilsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.fennec.event.atlas.mapping.converters.ValueConverter;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.LineString;
import org.eclipse.sensinact.gateway.geojson.MultiLineString;
import org.eclipse.sensinact.gateway.geojson.MultiPoint;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.osgi.service.component.annotations.Component;

import de.jena.udp.model.geojson.GeoJSON;

/**
 * The observed area of a signal, from the trafficos GeoJSON model into the sensiNact GeoJSON
 * value type: what a resource of type {@code EGeoJsonObject} can hold.
 * <p>
 * A mapping asks for it by naming {@code converterId="udp.geojson.featurecollection"} on the
 * {@code valueMapping} of its {@code observedArea} resource. The feature path produces the
 * payload's own GeoJSON, and this runs after it, before the value is coerced to the
 * resource's declared type - which is why a converter may return a different type than it was
 * handed, and why this one can.
 * <p>
 * It is the mapping's counterpart to {@link GeoJsonBlackBox}, which is how the payload-rooted
 * flow reaches the same conversion from QVT-O. The conversion itself lives here and the
 * blackbox delegates to it, so the two flows cannot drift apart; when the QVT-O transformation
 * is retired, the blackbox goes with it and this stays.
 * <p>
 * A source that is no {@code FeatureCollection} converts to an empty one rather than to
 * nothing: the signal is then known to observe no area, which is not the same as a signal
 * whose area has not been reported.
 */
@Component(service = ValueConverter.class,
		property = ValueConverter.CONVERTER_ID + "=" + GeoJsonValueConverter.CONVERTER_ID)
public class GeoJsonValueConverter implements ValueConverter {

	/** The id a mapping names in {@code converterId}. */
	public static final String CONVERTER_ID = "udp.geojson.featurecollection";

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.event.atlas.mapping.converters.ValueConverter#convert(java.lang.Object)
	 */
	@Override
	public Object convert(Object value) {
		if (value instanceof GeoJSON geoJson) {
			return toFeatureCollection(geoJson);
		}
		// Not null: dropping it would leave the resource with the area it had and say nothing
		// about why. A value of another type is a mapping that points this converter at the
		// wrong feature path, and that is worth a failure.
		throw new IllegalArgumentException(String.format(
				"The GeoJSON converter was handed a %s, which is no GeoJSON - check the feature path of the"
						+ " valueMapping that names " + CONVERTER_ID,
				value.getClass().getName()));
	}

	/**
	 * The sensiNact feature collection of one trafficos GeoJSON.
	 * @param source the payload's GeoJSON
	 * @return the converted collection, empty where the source carries no features
	 */
	public static FeatureCollection toFeatureCollection(GeoJSON source) {
		List<Feature> features = new ArrayList<>();
		if (source instanceof de.jena.udp.model.geojson.FeatureCollection collection) {
			collection.getFeatures().forEach(feature -> {
				Map<String, Object> properties = new HashMap<>(feature.getProperties().map());
				Geometry geometry = convertGeometry(feature.getGeometry());
				if (geometry != null) {
					features.add(new Feature("", geometry, properties, null, null));
				}
			});
		}
		return new FeatureCollection(features, null, null);
	}

	private static Geometry convertGeometry(GeoJSON geometry) {
		if (geometry instanceof de.jena.udp.model.geojson.LineString lineString) {
			return new LineString(coordinates(lineString.getCoordinates()), null, null);
		}
		if (geometry instanceof de.jena.udp.model.geojson.Polygon polygon) {
			List<List<Coordinates>> rings = new ArrayList<>();
			polygon.getCoordinates().forEach(ring -> rings.add(coordinates(ring)));
			return new Polygon(rings, null, null);
		}
		if (geometry instanceof de.jena.udp.model.geojson.Point point) {
			List<Double> position = point.getCoordinates();
			return new Point(new Coordinates(position.get(0), position.get(1)), null, null);
		}
		if (geometry instanceof de.jena.udp.model.geojson.MultiPoint multiPoint) {
			return new MultiPoint(coordinates(multiPoint.getCoordinates()), null, null);
		}
		if (geometry instanceof de.jena.udp.model.geojson.MultiLineString multiLineString) {
			List<List<Coordinates>> lines = new ArrayList<>();
			multiLineString.getCoordinates().forEach(line -> lines.add(coordinates(line)));
			return new MultiLineString(lines, null, null);
		}
		return null;
	}

	private static List<Coordinates> coordinates(Iterable<Double[]> positions) {
		List<Coordinates> coordinates = new ArrayList<>();
		for (Double[] position : positions) {
			coordinates.add(new Coordinates(position[0], position[1]));
		}
		return coordinates;
	}

	private static List<Coordinates> coordinates(Double[][] positions) {
		return coordinates(List.of(positions));
	}
}
