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

import org.eclipse.fennec.m2x.model.qvtoperational.BlackboxOperationDescriptor;
import org.eclipse.fennec.m2x.model.qvtoperational.QvtOperationalFactory;
import org.eclipse.fennec.m2x.qvto.api.QvtoBlackboxInvocationContext;
import org.eclipse.fennec.m2x.qvto.api.QvtoBlackboxLibrary;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.LineString;
import org.eclipse.sensinact.gateway.geojson.MultiLineString;
import org.eclipse.sensinact.gateway.geojson.MultiPoint;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;

import de.jena.udp.model.geojson.GeoJSON;
import de.jena.udp.model.geojson.GeojsonPackage;

/**
 * QVT-O blackbox: {@code GeoJSON::convertToFeatureCollection()} turns the trafficos GeoJSON
 * model into the sensiNact GeoJSON value type.
 */
public class GeoJsonBlackBox implements QvtoBlackboxLibrary {

	public static final String UNIT_NAME = "de.jena.udp.atlas.ilsa.GeoJsonBlackBox";
	static final String CONVERT = "convertToFeatureCollection";

	@Override
	public String getModuleName() {
		return "GeoJsonBlackBox";
	}

	@Override
	public String getUnitQualifiedName() {
		return UNIT_NAME;
	}

	@Override
	public List<String> getUsedPackageURIs() {
		return List.of(GeojsonPackage.eNS_URI, ProviderPackage.eNS_URI);
	}

	@Override
	public List<BlackboxOperationDescriptor> getOperationDescriptors() {
		BlackboxOperationDescriptor convert = QvtOperationalFactory.eINSTANCE.createBlackboxOperationDescriptor();
		convert.setName(CONVERT);
		convert.setContextType(GeojsonPackage.eINSTANCE.getGeoJSON());
		convert.setReturnType(ProviderPackage.eINSTANCE.getEGeoJsonObject());
		return List.of(convert);
	}

	@Override
	public Object invoke(String operationName, QvtoBlackboxInvocationContext context, Object[] args) {
		if (CONVERT.equals(operationName) && context.self() instanceof GeoJSON geoJson) {
			return convertToFeatureCollection(geoJson);
		}
		return null;
	}

	public static FeatureCollection convertToFeatureCollection(GeoJSON source) {
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
