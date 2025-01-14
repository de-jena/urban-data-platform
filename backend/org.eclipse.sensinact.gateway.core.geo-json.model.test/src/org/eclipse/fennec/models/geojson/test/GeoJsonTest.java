/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package org.eclipse.fennec.models.geojson.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.jackson.annotations.EcoreTypeInfo;
import org.eclipse.emfcloud.jackson.resource.JsonResource;
import org.eclipse.fennec.models.geojson.BoundingBox;
import org.eclipse.fennec.models.geojson.Coordinates;
import org.eclipse.fennec.models.geojson.Feature;
import org.eclipse.fennec.models.geojson.Hole;
import org.eclipse.fennec.models.geojson.LineString;
import org.eclipse.fennec.models.geojson.MultiLineString;
import org.eclipse.fennec.models.geojson.MultiPoint;
import org.eclipse.fennec.models.geojson.Point;
import org.eclipse.fennec.models.geojson.Polygon;
import org.eclipse.fennec.models.geojson.Ring;
import org.eclipse.fennec.models.geojson.impl.BoundingBoxImpl;
import org.eclipse.fennec.models.geojson.impl.CoordinatesImpl;
import org.eclipse.fennec.models.geojson.impl.FeatureImpl;
import org.eclipse.fennec.models.geojson.impl.HoleImpl;
import org.eclipse.fennec.models.geojson.impl.LineStringImpl;
import org.eclipse.fennec.models.geojson.impl.MultiLineStringImpl;
import org.eclipse.fennec.models.geojson.impl.MultiPointImpl;
import org.eclipse.fennec.models.geojson.impl.PointImpl;
import org.eclipse.fennec.models.geojson.impl.PolygonImpl;
import org.eclipse.fennec.models.geojson.impl.RingImpl;
import org.eclipse.fennec.models.geojson.util.GeoJsonHelper;
import org.eclipse.fennec.models.geojson.util.GeoJsonResourceImpl;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@RequireEMFJson
public class GeoJsonTest {
	
	private Coordinates createCoordinate(double latitude, double longitude) {
		return createCoordinate(latitude, longitude, Double.NaN);
	}
	private Coordinates createCoordinate(double latitude, double longitude, double elevation) {
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(latitude);
		coords.setLongitude(longitude);
		if(Double.isNaN(elevation)) {
			coords.setElevation(120);
		}
		return coords;
	}
	
	@Test
	public void testRing() throws IOException {
		System.err.println("Running Test Point");
		
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));
		
		assertFalse(GeoJsonHelper.checkRingClosed(ring));
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		
		assertTrue(GeoJsonHelper.checkRingClosed(ring));
	}

	@Test
	public void testRingAutoclose() throws IOException {
		System.err.println("Running Test Point");
		
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));
		
		assertFalse(GeoJsonHelper.checkRingClosed(ring));
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		
		assertTrue(GeoJsonHelper.checkRingClosed(ring));
	}

	@Test
	public void point(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Point");
		
		Point point = new PointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.setCoordinates(coords);
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = """
				{
  "type" : "Point",
  "coordinates" : [ 52.0, 12.0, 120.0 ]
				}
				""";
		
		System.err.println("Trying to load Point");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Point result = (Point) loadResource.getContents().get(0);
		System.err.println(result.getCoordinates());
	}

	@Test
	public void pointWithBoundingBox(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Point with BoundingBox");
		
		Point point = new PointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.setCoordinates(coords);
		point.setBoundingBox(new BoundingBoxImpl());
		point.getBoundingBox().setNortheast(coords);
		point.getBoundingBox().setSouthwest(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = """
				{
  "type" : "Point",
  "bbox" : [ 52.0, 12.0, 120.0, 52.0, 12.0, 120.0 ],
  "coordinates" : [ 52.0, 12.0, 120.0 ]
				}
				""";
		
		System.err.println("Trying to load Point with BoundingBox");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Point result = (Point) loadResource.getContents().get(0);
		System.err.println(result.getCoordinates());
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(result.getBoundingBox().getNortheast()).isNotNull();
		assertThat(result.getBoundingBox().getSouthwest()).isNotNull();
	}

	@Test
	public void lineString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test");
		
		LineString point = new LineStringImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.getCoordinates().add(coords);
		point.getCoordinates().add(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);

		System.out.println(new String(baos.toByteArray()));
		
		
		String test = """
				{
  "type" : "LineString",
  "coordinates" : [ [ 52.0, 12.0, 120.0 ], [ 52.0, 12.0, 120.0 ] ]
}
				""";
		
		System.err.println("Trying to load LineString");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		LineString result = (LineString) loadResource.getContents().get(0);
		result.getCoordinates().forEach(System.err::println);;
	}

	@Test
	public void multiLineString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test MultiLineString");
		
		LineString line = new LineStringImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		line.getCoordinates().add(createCoordinate(12, 52, 120));
		line.getCoordinates().add(createCoordinate(11, 53, 123));
		
		MultiLineString multiLineString = new MultiLineStringImpl();
		
		multiLineString.getLinesStrings().add(line);
		multiLineString.getLinesStrings().add(EcoreUtil.copy(line));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(multiLineString);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		
		System.err.println("Trying to load MultiLineString");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(baos.toByteArray()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		MultiLineString result = (MultiLineString) loadResource.getContents().get(0);
		
		assertThat(result.getLinesStrings()).hasSameSizeAs(multiLineString.getLinesStrings());
		
	}

	@Test
	public void multiPointString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test");
		
		MultiPoint point = new MultiPointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.getCoordinates().add(coords);
		point.getCoordinates().add(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = """
				{
  "type" : "MultiPoint",
  "coordinates" : [ [ 52.0, 12.0, 120.0 ], [ 52.0, 12.0, 120.0 ] ]
				}
				""";
		
		System.err.println("Trying to load MultiPoint");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		MultiPoint result = (MultiPoint) loadResource.getContents().get(0);
		result.getCoordinates().forEach(System.err::println);;
	}

	@Test
	public void feature(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Feature Test");
		
		Feature feature = new FeatureImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		BoundingBox bbox = new BoundingBoxImpl();
		bbox.setSouthwest(EcoreUtil.copy(coords));
		bbox.setNortheast(EcoreUtil.copy(coords));
		feature.setBoundingBox(bbox);
		
		feature.setProperties(EcoreUtil.copy(coords));		
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(feature);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = """
				{
  "type" : "Feature",
  "bbox" : [ 52.0, 12.0, 120.0 , 52.0, 12.0, 120.0 ]
				}
				""";
		
		System.err.println("Trying to load Feature");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Feature result = (Feature) loadResource.getContents().get(0);
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(feature.getProperties()).isInstanceOf(Coordinates.class);
		
	}
	
	@Test
	public void testDBPolygone(@InjectService ResourceSet set) throws IOException {
		String test = """
				{
	"type": "Polygon",
	"bbox": [
		11.504092,
		50.895368,
		11.566935,
		50.913474
	],
	"coordinates": [
		[
			[
				11.554532,
				50.90168
			],
			[
				11.554127,
				50.901214
			],
			[
				11.554528,
				50.900991
			],
			[
				11.554196,
				50.900806
			],
			[
				11.553101,
				50.899564
			],
			[
				11.552797,
				50.898849
			],
			[
				11.552712,
				50.896565
			],
			[
				11.552282,
				50.896421
			],
			[
				11.551836,
				50.896126
			],
			[
				11.551464,
				50.896398
			],
			[
				11.550654,
				50.895844
			],
			[
				11.550172,
				50.89619
			],
			[
				11.550001,
				50.89586
			],
			[
				11.549749,
				50.895793
			],
			[
				11.548798,
				50.896242
			],
			[
				11.548026,
				50.896414
			],
			[
				11.547431,
				50.89628
			],
			[
				11.544954,
				50.895368
			],
			[
				11.542608,
				50.895993
			],
			[
				11.541526,
				50.895805
			],
			[
				11.540404,
				50.89597
			],
			[
				11.540749,
				50.896473
			],
			[
				11.540567,
				50.896535
			],
			[
				11.54203,
				50.897826
			],
			[
				11.54066,
				50.898225
			],
			[
				11.540999,
				50.898748
			],
			[
				11.541198,
				50.899531
			],
			[
				11.54108,
				50.900253
			],
			[
				11.541148,
				50.901313
			],
			[
				11.540578,
				50.901684
			],
			[
				11.53719,
				50.90164
			],
			[
				11.535231,
				50.901289
			],
			[
				11.530252,
				50.901846
			],
			[
				11.529464,
				50.902023
			],
			[
				11.526186,
				50.902341
			],
			[
				11.522933,
				50.903903
			],
			[
				11.523349,
				50.904504
			],
			[
				11.522543,
				50.904434
			],
			[
				11.522427,
				50.90488
			],
			[
				11.521146,
				50.905783
			],
			[
				11.51895,
				50.905191
			],
			[
				11.517241,
				50.904858
			],
			[
				11.513599,
				50.903797
			],
			[
				11.51147,
				50.905539
			],
			[
				11.511694,
				50.906269
			],
			[
				11.510561,
				50.906379
			],
			[
				11.510615,
				50.906564
			],
			[
				11.50856,
				50.906702
			],
			[
				11.507924,
				50.906704
			],
			[
				11.507696,
				50.906601
			],
			[
				11.506708,
				50.906938
			],
			[
				11.505393,
				50.906239
			],
			[
				11.504333,
				50.905819
			],
			[
				11.504098,
				50.906495
			],
			[
				11.504185,
				50.906948
			],
			[
				11.504092,
				50.907269
			],
			[
				11.504276,
				50.907497
			],
			[
				11.505382,
				50.908132
			],
			[
				11.505481,
				50.908525
			],
			[
				11.50528,
				50.908865
			],
			[
				11.507127,
				50.910712
			],
			[
				11.507056,
				50.911474
			],
			[
				11.507383,
				50.913114
			],
			[
				11.508475,
				50.913437
			],
			[
				11.50914,
				50.913474
			],
			[
				11.509967,
				50.913332
			],
			[
				11.511671,
				50.912817
			],
			[
				11.513102,
				50.912643
			],
			[
				11.513641,
				50.912461
			],
			[
				11.516359,
				50.913023
			],
			[
				11.518141,
				50.913258
			],
			[
				11.519234,
				50.913261
			],
			[
				11.523311,
				50.912463
			],
			[
				11.526255,
				50.91212
			],
			[
				11.526344,
				50.912095
			],
			[
				11.525979,
				50.911704
			],
			[
				11.52578,
				50.91163
			],
			[
				11.525263,
				50.911087
			],
			[
				11.524727,
				50.910095
			],
			[
				11.52471,
				50.909722
			],
			[
				11.526668,
				50.909192
			],
			[
				11.528186,
				50.90914
			],
			[
				11.528868,
				50.908662
			],
			[
				11.530769,
				50.909893
			],
			[
				11.532192,
				50.910479
			],
			[
				11.536595,
				50.911412
			],
			[
				11.538296,
				50.911976
			],
			[
				11.539526,
				50.912041
			],
			[
				11.542292,
				50.912972
			],
			[
				11.549484,
				50.91145
			],
			[
				11.556112,
				50.910784
			],
			[
				11.557463,
				50.91089
			],
			[
				11.560743,
				50.911368
			],
			[
				11.56291,
				50.911518
			],
			[
				11.564749,
				50.912197
			],
			[
				11.56533,
				50.912274
			],
			[
				11.565757,
				50.912226
			],
			[
				11.566935,
				50.912521
			],
			[
				11.566636,
				50.912208
			],
			[
				11.565377,
				50.911506
			],
			[
				11.564079,
				50.909826
			],
			[
				11.562613,
				50.90921
			],
			[
				11.563746,
				50.907839
			],
			[
				11.563981,
				50.907932
			],
			[
				11.564818,
				50.906646
			],
			[
				11.563154,
				50.906306
			],
			[
				11.564127,
				50.904987
			],
			[
				11.563114,
				50.904886
			],
			[
				11.563125,
				50.903904
			],
			[
				11.563138,
				50.903743
			],
			[
				11.563784,
				50.90367
			],
			[
				11.56375,
				50.902355
			],
			[
				11.564245,
				50.902265
			],
			[
				11.564213,
				50.901758
			],
			[
				11.56298,
				50.901862
			],
			[
				11.561666,
				50.901597
			],
			[
				11.559324,
				50.9015
			],
			[
				11.558811,
				50.901636
			],
			[
				11.557151,
				50.901813
			],
			[
				11.556607,
				50.901962
			],
			[
				11.554532,
				50.90168
			]
		]
	]
}
				""";
//		Map<String, Object> map = new HashMap<>();
//		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
//		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
//		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		GeoJsonResourceImpl loadResource = (org.eclipse.fennec.models.geojson.util.GeoJsonResourceImpl) set.createResource(URI.createURI("test2.geojson"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), null);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Polygon result = (Polygon) loadResource.getContents().get(0);
		assertThat(result.getBoundingBox().getNortheast()).isNotNull();
		assertThat(result.getBoundingBox().getSouthwest()).isNotNull();
		
//		Resource resource = set.createResource(URI.createURI("test2.xmi"));
//		resource.getContents().add(result);
//		resource.save(System.err, null);#
	}
	
	@Test
	public void polygon(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Polygon");
		
		
		Polygon polygon = new PolygonImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));

		Hole hole = new HoleImpl();
		
		hole.getCoordinates().add(createCoordinate(1, 1));
		hole.getCoordinates().add(createCoordinate(2, 2));
		hole.getCoordinates().add(createCoordinate(3, 3));
		hole.getCoordinates().add(createCoordinate(4, 4));
		hole.getCoordinates().add(createCoordinate(5, 2));
		hole.getCoordinates().add(createCoordinate(6, 6));
		
		polygon.setExteriorRing(ring);
		polygon.getInteriorHoles().add(hole);
		polygon.getInteriorHoles().add(EcoreUtil.copy(hole));
	
		BoundingBox bbox = new BoundingBoxImpl();
		bbox.setSouthwest(EcoreUtil.copy(coords));
		bbox.setNortheast(EcoreUtil.copy(coords));
		polygon.setBoundingBox(bbox);
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(polygon);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);

		System.out.println(new String(baos.toByteArray()));
		
		System.err.println("Trying to load Polygon");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(baos.toByteArray()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Polygon result = (Polygon) loadResource.getContents().get(0);
		baos = new ByteArrayOutputStream();
		loadResource.save(baos, map);
		System.out.println(new String(baos.toByteArray()));
		
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(result.getExteriorRing()).isNotNull();
		assertThat(result.getExteriorRing().getCoordinates()).hasSize(polygon.getExteriorRing().getCoordinates().size() + 1);
		assertThat(result.getInteriorHoles()).hasSize(2);
		
	}

}
