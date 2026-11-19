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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.junit.jupiter.api.Test;

import de.jena.udp.model.geojson.AbstractGeometry;
import de.jena.udp.model.geojson.Feature;
import de.jena.udp.model.geojson.GeojsonFactory;
import de.jena.udp.model.geojson.LineString;
import de.jena.udp.model.geojson.Point;
import de.jena.udp.model.geojson.Polygon;

/**
 * What the mapping gets where the QVT-O transformation used the blackbox: the observed area of
 * a signal, as the sensiNact GeoJSON value type.
 * <p>
 * The fixtures are built here rather than shared with {@link IlsaTransformationTest}: that test
 * belongs to the payload-rooted flow and goes when it does.
 */
class GeoJsonValueConverterTest {

	private final GeoJsonValueConverter converter = new GeoJsonValueConverter();

	@Test
	void aPolygonAreaBecomesASensinactFeatureCollection() {
		GeojsonFactory geojson = GeojsonFactory.eINSTANCE;
		Polygon polygon = geojson.createPolygon();
		polygon.getCoordinates().add(new Double[][] { { 11.58, 50.92 }, { 11.581, 50.92 }, { 11.581, 50.921 },
				{ 11.58, 50.92 } });
		Feature feature = geojson.createFeature();
		feature.setGeometry(polygon);
		feature.getProperties().put("signal_type", "K");
		de.jena.udp.model.geojson.FeatureCollection area = geojson.createFeatureCollection();
		area.getFeatures().add(feature);

		FeatureCollection converted = assertInstanceOf(FeatureCollection.class, converter.convert(area));

		assertEquals(1, converted.features().size());
		org.eclipse.sensinact.gateway.geojson.Polygon converted0 = assertInstanceOf(
				org.eclipse.sensinact.gateway.geojson.Polygon.class, converted.features().get(0).geometry());
		assertEquals(List.of(new Coordinates(11.58, 50.92), new Coordinates(11.581, 50.92),
				new Coordinates(11.581, 50.921), new Coordinates(11.58, 50.92)), converted0.coordinates().get(0));
		assertEquals("K", converted.features().get(0).properties().get("signal_type"));
	}

	/** Every geometry the trafficos model can hold, so none is silently dropped. */
	@Test
	void aPointAndALineAreConvertedToo() {
		GeojsonFactory geojson = GeojsonFactory.eINSTANCE;
		Point point = geojson.createPoint();
		point.getCoordinates().addAll(List.of(11.58, 50.92));
		LineString line = geojson.createLineString();
		line.getCoordinates().add(new Double[] { 11.58, 50.92 });
		line.getCoordinates().add(new Double[] { 11.581, 50.921 });
		de.jena.udp.model.geojson.FeatureCollection area = geojson.createFeatureCollection();
		area.getFeatures().add(feature(geojson, point));
		area.getFeatures().add(feature(geojson, line));

		FeatureCollection converted = assertInstanceOf(FeatureCollection.class, converter.convert(area));

		assertEquals(2, converted.features().size());
		assertInstanceOf(org.eclipse.sensinact.gateway.geojson.Point.class, converted.features().get(0).geometry());
		assertInstanceOf(org.eclipse.sensinact.gateway.geojson.LineString.class,
				converted.features().get(1).geometry());
	}

	/**
	 * A signal that observes no area is not a signal whose area is unknown, so the converter
	 * answers with an empty collection rather than dropping the value.
	 */
	@Test
	void aGeoJsonThatIsNoCollectionBecomesAnEmptyCollection() {
		FeatureCollection converted = assertInstanceOf(FeatureCollection.class,
				converter.convert(GeojsonFactory.eINSTANCE.createPoint()));

		assertTrue(converted.features().isEmpty());
	}

	/** Anything else is a mapping naming this converter on the wrong feature path. */
	@Test
	void aValueThatIsNoGeoJsonIsRefused() {
		assertThrows(IllegalArgumentException.class, () -> converter.convert("11.58, 50.92"));
	}

	private static Feature feature(GeojsonFactory geojson, AbstractGeometry geometry) {
		Feature feature = geojson.createFeature();
		feature.setGeometry(geometry);
		return feature;
	}
}
