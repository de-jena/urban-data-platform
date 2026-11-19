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
import static org.junit.jupiter.api.Assertions.assertNull;

import org.eclipse.fennec.m2x.ocl.api.OclConfiguration;
import org.eclipse.fennec.m2x.ocl.api.OclContext;
import org.eclipse.fennec.m2x.ocl.api.OclEngine;
import org.eclipse.fennec.m2x.ocl.api.OclInvalid;
import org.eclipse.fennec.m2x.ocl.api.OclOperation;
import org.eclipse.fennec.m2x.ocl.api.OclParseException;
import org.eclipse.fennec.m2x.ocl.engine.OclEngines;
import org.eclipse.fennec.m2x.ocl.parser.OclParserSupport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.jena.udp.model.geojson.GeoJSON;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightFactory;
import io.cloudevents.model.ce.CloudEvent;
import io.cloudevents.model.ce.CloudEventsFactory;
import de.jena.udp.model.geojson.GeojsonFactory;
import de.jena.udp.model.geojson.GeojsonPackage;

/**
 * What {@code ilsa-configuration-ce-mapping.xmi} needs to produce an admin location:
 * {@code bbox.at(1)} and {@code bbox.at(2)} off a real trafficos {@link GeoJSON}.
 * <p>
 * The engine is built here the way {@code configs/ocl.json} configures the deployed one -
 * {@code customOperationsEnabled} true, this provider bound.
 */
class GeoJsonArrayOperationsTest {

	private final GeoJsonArrayOperations operations = new GeoJsonArrayOperations();

	@Test
	@DisplayName("at(n) indexes the bbox 1-based, so at(1) is the longitude")
	void atIndexesTheBoundingBox() throws OclParseException {
		OclEngine engine = engine(true);
		OclContext context = OclContext.of(geoJson(11.58d, 50.92d, 11.59d, 50.93d));

		assertEquals(11.58d, engine.evaluate("self.bbox.at(1)", context));
		assertEquals(50.92d, engine.evaluate("self.bbox.at(2)", context));
	}

	@Test
	@DisplayName("An index past the end is empty rather than a failure")
	void anIndexPastTheEndIsEmpty() throws OclParseException {
		OclEngine engine = engine(true);
		OclContext context = OclContext.of(geoJson(11.58d, 50.92d));

		assertNull(engine.evaluate("self.bbox.at(3)", context));
		assertNull(engine.evaluate("self.bbox.at(0)", context));
	}

	@Test
	@DisplayName("It is contributed on Array1D, which is what bbox is typed")
	void itIsContributedOnTheDatatypeOfBbox() {
		OclOperation at = operations.getOperations().get(0);

		assertEquals("at", at.name());
		assertEquals(GeojsonPackage.Literals.ARRAY1_D, at.ownerType());
		assertEquals(GeojsonPackage.Literals.ARRAY1_D,
				GeojsonPackage.Literals.GEO_JSON__BBOX.getEType());
	}

	@Test
	@DisplayName("Without ocl.customOperationsEnabled the expression is OCL invalid")
	void withoutTheFlagTheExpressionIsInvalid() throws OclParseException {
		OclEngine engine = engine(false);

		// Not null, which would be OCL void - the unknown operation makes the whole
		// expression invalid. OclExpressionEvaluator turns that into no value and a FINE log
		// line, which is why the live runtime showed an empty admin location and said nothing
		// at the default log level.
		assertEquals(OclInvalid.INSTANCE, engine.evaluate("self.bbox.at(1)",
				OclContext.of(geoJson(11.58d, 50.92d, 11.59d, 50.93d))));
	}

	private OclEngine engine(boolean customOperationsEnabled) {
		return OclEngines.create(OclConfiguration.builder(new OclParserSupport())
				.customOperationsEnabled(customOperationsEnabled)
				.addOperationProvider(operations)
				.build());
	}

	/**
	 * What the ILSA configuration mapping actually evaluates: the operation reached through a
	 * CloudEvent envelope, whose {@code data} reference is typed {@code EObject}.
	 * <p>
	 * The other tests give the engine a typed context, so {@code bbox} is statically known to
	 * be an {@code Array1D} and the operation is found by that type. Here nothing is known
	 * before the value is in hand - if the engine resolved contributed operations from static
	 * types alone, the live mapping would fail while every other test passed.
	 */
	@Test
	@DisplayName("at(n) resolves through an EObject-typed envelope, as in the live mapping")
	void atResolvesThroughAnUntypedEnvelope() throws OclParseException {
		TLConfiguration configuration = TOSTrafficLightFactory.eINSTANCE.createTLConfiguration();
		configuration.setIntersectionName("Fischergasse");
		configuration.setGeoJson(geoJson(11.58d, 50.92d, 11.59d, 50.93d));
		CloudEvent envelope = CloudEventsFactory.eINSTANCE.createCloudEvent();
		envelope.setData(configuration);

		OclEngine engine = engine(true);
		OclContext context = OclContext.of(envelope);

		assertEquals("ILSA Fischergasse", engine.evaluate("'ILSA ' + self.data.intersectionName", context));
		assertEquals(11.58d, engine.evaluate("self.data.geoJson.bbox.at(1)", context));
		assertEquals(50.92d, engine.evaluate("self.data.geoJson.bbox.at(2)", context));
	}

	private static GeoJSON geoJson(Double... bbox) {
		GeoJSON geoJson = GeojsonFactory.eINSTANCE.createGeoJSON();
		geoJson.setBbox(bbox);
		return geoJson;
	}
}
