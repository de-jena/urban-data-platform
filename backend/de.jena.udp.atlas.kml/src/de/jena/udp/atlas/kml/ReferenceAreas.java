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
package de.jena.udp.atlas.kml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaFactory;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage;
import net.opengis.kml.AbstractGeometryType;
import net.opengis.kml.BoundaryType;
import net.opengis.kml.LinearRingType;
import net.opengis.kml.MultiGeometryType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PolygonType;

/**
 * A reference-area placemark as a ReferenceArea provider: the placemark name is the provider id
 * (a slash, which no REST path can carry, becomes an underscore), the schema data fills the service,
 * the polygons become the admin location as GeoJSON features.
 */
final class ReferenceAreas {

	private ReferenceAreas() {
	}

	static ReferenceAreaProvider toProvider(PlacemarkType placemark) {
		String name = placemark.getName();
		Map<String, String> data = KmlPlacemarks.extendedData(placemark);
		ReferenceArea area = SensinactRefAreaFactory.eINSTANCE.createReferenceArea();
		area.setName(name);
		area.setColor(ColorType.UNKNOWN);
		set(area, SensinactRefAreaPackage.Literals.REFERENCE_AREA__GID, data.get("gid"));
		set(area, SensinactRefAreaPackage.Literals.REFERENCE_AREA__SENSOR_COUNT, data.get("anzahl_sens"));
		set(area, SensinactRefAreaPackage.Literals.REFERENCE_AREA__TOUR_NAME, data.get("tour_name_lang"));

		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setFriendlyName("Reference Area " + name);
		admin.setDescription("Sensor reference area");
		admin.setLocation(location(placemark, properties(area)));

		ReferenceAreaProvider provider = SensinactRefAreaFactory.eINSTANCE.createReferenceAreaProvider();
		provider.setId(providerId(name));
		provider.setAdmin(admin);
		provider.setReferenceArea(area);
		return provider;
	}

	static String providerId(String placemarkName) {
		return placemarkName.replace('/', '_');
	}

	private static void set(ReferenceArea area, EAttribute attribute, String value) {
		if (value != null) {
			area.eSet(attribute, EcoreUtil.createFromString(attribute.getEAttributeType(), value));
		}
	}

	/** The set area attributes except the colour, as the properties of the GeoJSON features. */
	static Map<String, Object> properties(ReferenceArea area) {
		Map<String, Object> properties = new LinkedHashMap<>();
		for (EAttribute attribute : area.eClass().getEAllAttributes()) {
			if (area.eIsSet(attribute) && attribute != SensinactRefAreaPackage.Literals.REFERENCE_AREA__COLOR) {
				properties.put(attribute.getName(), area.eGet(attribute));
			}
		}
		return properties;
	}

	/** One polygon becomes a Feature, a MultiGeometry a FeatureCollection of its polygons. */
	static GeoJsonObject location(PlacemarkType placemark, Map<String, Object> properties) {
		String featureId = "feature-" + providerId(placemark.getName());
		AbstractGeometryType geometry = placemark.getAbstractGeometryGroup();
		if (geometry instanceof PolygonType polygon) {
			return new Feature(featureId, polygon(polygon), properties, null, null);
		}
		if (geometry instanceof MultiGeometryType multi) {
			List<Feature> features = new ArrayList<>();
			for (AbstractGeometryType member : multi.getAbstractGeometryGroup()) {
				if (member instanceof PolygonType polygon) {
					features.add(new Feature(featureId + "-" + features.size(), polygon(polygon), properties, null, null));
				}
			}
			return new FeatureCollection(features, null, properties);
		}
		return null;
	}

	static Polygon polygon(PolygonType polygon) {
		List<List<Coordinates>> rings = new ArrayList<>();
		BoundaryType outer = polygon.getOuterBoundaryIs();
		if (outer != null && outer.getLinearRing() != null) {
			rings.add(ring(outer.getLinearRing(), false));
		}
		for (BoundaryType inner : polygon.getInnerBoundaryIs()) {
			if (inner.getLinearRing() != null) {
				rings.add(ring(inner.getLinearRing(), true));
			}
		}
		return new Polygon(rings, null, null);
	}

	/** RFC 7946 winding: the exterior ring counter-clockwise, holes clockwise. */
	private static List<Coordinates> ring(LinearRingType ring, boolean clockwise) {
		List<Coordinates> points = new ArrayList<>(KmlPlacemarks.coordinates(ring.getCoordinates()));
		if (isClockwise(points) != clockwise) {
			Collections.reverse(points);
		}
		return points;
	}

	static boolean isClockwise(List<Coordinates> ring) {
		double sum = 0;
		for (int i = 0; i < ring.size(); i++) {
			Coordinates from = ring.get(i);
			Coordinates to = ring.get((i + 1) % ring.size());
			sum += (to.longitude() - from.longitude()) * (to.latitude() + from.latitude());
		}
		return sum > 0;
	}
}
