/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.jena.udp.reference.area.component;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.reference.area.model.referencearea.ReferenceArea;
import de.jena.reference.area.model.referencearea.ReferenceAreaCollection;
import de.jena.reference.area.model.referencearea.ReferenceAreaFactory;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaFactory;
import geojson.Feature;
import geojson.FeatureCollection;
import geojson.GeojsonFactory;
import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.DocumentRoot;
import net.opengis.kml.DocumentType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.FolderType;
import net.opengis.kml.MultiGeometryType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PolygonType;
import net.opengis.kml.SchemaDataType;

/**
 * Component that reads KML files and converts them to ReferenceArea model instances.
 */
@Component(immediate = true, name = "ReferenceAreaReader")
@RequireEMF
public class ReferenceAreaReader {

	@Reference(target = "(" + EMFNamespaces.EMF_MODEL_FILE_EXT + "=json)")
	private ResourceSet resourceSet;
	
	@Reference
	private DataUpdate sensinact;

	private final static Logger LOGGER = Logger.getLogger(ReferenceAreaReader.class.getName());
	private ReferenceAreaCollection referenceAreas;

	@Activate
	public void activate() {
		LOGGER.info("ReferenceAreaReader component activated");
		loadReferenceAreas();
//		serializeFeature();
		pushToSensinact();
	}
	
	private void pushToSensinact() {
		for(ReferenceArea refArea : referenceAreas.getAreas()) {
			ReferenceAreaProvider provider = convertToSensinactRefArea(refArea);
			sensinact.pushUpdate(provider)
			.onSuccess(s -> {
				LOGGER.info("Succesfully pushed ReferenceAreaProvider to SensiNact");
			})
			.onFailure(t -> {
				LOGGER.log(Level.SEVERE, "Error while pushing ReferenceAreaProvider to SensiNact", t);
			});
		}
		
	}
	
	private ReferenceAreaProvider convertToSensinactRefArea(ReferenceArea refArea) {
		ReferenceAreaProvider provider = SensinactRefAreaFactory.eINSTANCE.createReferenceAreaProvider();
		de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea service = SensinactRefAreaFactory.eINSTANCE.createReferenceArea();
				
		provider.setId(refArea.getName());
		
		service.setName(refArea.getName());
		service.setGid(refArea.getGid());
		service.setSensorCount(refArea.getSensorCount());
		service.setTourName(refArea.getTourName());
		provider.setReferenceArea(service);
		
		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setFriendlyName("Reference Area " + refArea.getName());
		admin.setDescription("Sensor reference area");
		admin.setLocation(convertToSensinactGeoJson(refArea.getGeometry()));
		provider.setAdmin(admin);
		return provider;
		
		
	}
	
	private GeoJsonObject convertToSensinactGeoJson(Feature feature) {
		if (feature == null || feature.getGeometry() == null) {
			return null;
		}

		// Convert the geometry
		org.eclipse.sensinact.gateway.geojson.Geometry sensinactGeometry = convertGeometry(feature.getGeometry());
		if (sensinactGeometry == null) {
			return null;
		}

		// Convert properties from EMap<String, String> to Map<String, Object>
		Map<String, Object> properties = new HashMap<>();
		if (feature.getProperties() != null) {
			for (Map.Entry<String, String> entry : feature.getProperties().entrySet()) {
				properties.put(entry.getKey(), entry.getValue());
			}
		}

		// Create the SensiNact Feature (it's a Record, so we use the constructor)
		// Feature(String id, Geometry geometry, Map<String, Object> properties, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.Feature(
			properties.containsKey("name") ? (String) properties.get("name") : null, // id - can be extracted from properties if needed
			sensinactGeometry,
			properties,
			null, // bbox - could be calculated if needed
			null  // foreignMembers
		);
	}

	private org.eclipse.sensinact.gateway.geojson.Geometry convertGeometry(geojson.AbstractGeometry geometry) {
		if (geometry instanceof geojson.Polygon) {
			return convertPolygon((geojson.Polygon) geometry);
		} else if (geometry instanceof geojson.Point) {
			return convertPoint((geojson.Point) geometry);
		} else if (geometry instanceof geojson.LineString) {
			return convertLineString((geojson.LineString) geometry);
		} else if (geometry instanceof geojson.MultiPolygon) {
			return convertMultiPolygon((geojson.MultiPolygon) geometry);
		} else if (geometry instanceof geojson.MultiPoint) {
			return convertMultiPoint((geojson.MultiPoint) geometry);
		} else if (geometry instanceof geojson.MultiLineString) {
			return convertMultiLineString((geojson.MultiLineString) geometry);
		}
		// Add more geometry types as needed
		return null;
	}

	private org.eclipse.sensinact.gateway.geojson.Polygon convertPolygon(geojson.Polygon polygon) {
		if (polygon == null || polygon.getCoordinates().isEmpty()) {
			return null;
		}

		// Convert coordinates from Double[][] to List<List<Coordinates>>
		List<List<org.eclipse.sensinact.gateway.geojson.Coordinates>> rings = new java.util.ArrayList<>();

		for (Double[][] ring : polygon.getCoordinates()) {
			List<org.eclipse.sensinact.gateway.geojson.Coordinates> coordsList = new java.util.ArrayList<>();
			for (Double[] point : ring) {
				if (point.length >= 2) {
					if (point.length >= 3) {
						// With elevation
						coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
							point[0], point[1], point[2]
						));
					} else {
						// Without elevation
						coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
							point[0], point[1]
						));
					}
				}
			}
			rings.add(coordsList);
		}

		// Polygon(List<List<Coordinates>> coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.Polygon(rings, null, null);
	}

	private org.eclipse.sensinact.gateway.geojson.Point convertPoint(geojson.Point point) {
		if (point == null || point.getCoordinates() == null || point.getCoordinates().size() < 2) {
			return null;
		}

		EList<Double> coords = point.getCoordinates();
		org.eclipse.sensinact.gateway.geojson.Coordinates sensinactCoords;
		if (coords.size() >= 3) {
			sensinactCoords = new org.eclipse.sensinact.gateway.geojson.Coordinates(
				coords.get(0), coords.get(1), coords.get(2)
			);
		} else {
			sensinactCoords = new org.eclipse.sensinact.gateway.geojson.Coordinates(
					coords.get(0), coords.get(1)
			);
		}

		// Point(Coordinates coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.Point(sensinactCoords, null, null);
	}

	private org.eclipse.sensinact.gateway.geojson.LineString convertLineString(geojson.LineString lineString) {
		if (lineString == null || lineString.getCoordinates().isEmpty()) {
			return null;
		}

		List<org.eclipse.sensinact.gateway.geojson.Coordinates> coordsList = new java.util.ArrayList<>();
		for (Double[] point : lineString.getCoordinates()) {
			if (point.length >= 2) {
				if (point.length >= 3) {
					coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
						point[0], point[1], point[2]
					));
				} else {
					coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
						point[0], point[1]
					));
				}
			}
		}

		// LineString(List<Coordinates> coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.LineString(coordsList, null, null);
	}

	private org.eclipse.sensinact.gateway.geojson.MultiPolygon convertMultiPolygon(geojson.MultiPolygon multiPolygon) {
		if (multiPolygon == null || multiPolygon.getCoordinates().isEmpty()) {
			return null;
		}

		List<List<List<org.eclipse.sensinact.gateway.geojson.Coordinates>>> polygons = new java.util.ArrayList<>();

		for (Double[][][] polygonCoords : multiPolygon.getCoordinates()) {
			List<List<org.eclipse.sensinact.gateway.geojson.Coordinates>> rings = new java.util.ArrayList<>();
			for (Double[][] ring : polygonCoords) {
				List<org.eclipse.sensinact.gateway.geojson.Coordinates> coordsList = new java.util.ArrayList<>();
				for (Double[] point : ring) {
					if (point.length >= 2) {
						if (point.length >= 3) {
							coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
								point[0], point[1], point[2]
							));
						} else {
							coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
								point[0], point[1]
							));
						}
					}
				}
				rings.add(coordsList);
			}
			polygons.add(rings);
		}

		// MultiPolygon(List<List<List<Coordinates>>> coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.MultiPolygon(polygons, null, null);
	}

	private org.eclipse.sensinact.gateway.geojson.MultiPoint convertMultiPoint(geojson.MultiPoint multiPoint) {
		if (multiPoint == null || multiPoint.getCoordinates().isEmpty()) {
			return null;
		}

		List<org.eclipse.sensinact.gateway.geojson.Coordinates> coordsList = new java.util.ArrayList<>();
		for (Double[] point : multiPoint.getCoordinates()) {
			if (point.length >= 2) {
				if (point.length >= 3) {
					coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
						point[0], point[1], point[2]
					));
				} else {
					coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
						point[0], point[1]
					));
				}
			}
		}

		// MultiPoint(List<Coordinates> coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.MultiPoint(coordsList, null, null);
	}

	private org.eclipse.sensinact.gateway.geojson.MultiLineString convertMultiLineString(geojson.MultiLineString multiLineString) {
		if (multiLineString == null || multiLineString.getCoordinates().isEmpty()) {
			return null;
		}

		List<List<org.eclipse.sensinact.gateway.geojson.Coordinates>> lines = new java.util.ArrayList<>();

		for (Double[][] line : multiLineString.getCoordinates()) {
			List<org.eclipse.sensinact.gateway.geojson.Coordinates> coordsList = new java.util.ArrayList<>();
			for (Double[] point : line) {
				if (point.length >= 2) {
					if (point.length >= 3) {
						coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
							point[0], point[1], point[2]
						));
					} else {
						coordsList.add(new org.eclipse.sensinact.gateway.geojson.Coordinates(
							point[0], point[1]
						));
					}
				}
			}
			lines.add(coordsList);
		}

		// MultiLineString(List<List<Coordinates>> coordinates, List<Double> bbox, Map<String, Object> foreignMembers)
		return new org.eclipse.sensinact.gateway.geojson.MultiLineString(lines, null, null);
	}

	private void serializeFeature() {
		// Create a FeatureCollection from all reference areas
		FeatureCollection featureColl = GeojsonFactory.eINSTANCE.createFeatureCollection();
		for(ReferenceArea area : referenceAreas.getAreas()) {
			if (area.getGeometry() != null) {
				featureColl.getFeatures().add(area.getGeometry());
			}
		}

		System.out.println("Created FeatureCollection with " + featureColl.getFeatures().size() + " features");

		File outputFile = new File(System.getProperty("data") + "reference_areas.json");
		URI outputUri = URI.createFileURI(outputFile.getAbsolutePath());

		Resource outputResource = resourceSet.createResource(outputUri, "application/json");
		outputResource.getContents().add(featureColl);

		Map<String, Object> saveOptions = new HashMap<>();
		saveOptions.put(EMFJs.OPTION_SERIALIZE_TYPE, false);

		try {
			outputResource.save(saveOptions);
			System.out.println("Successfully saved FeatureCollection to: " + outputFile.getAbsolutePath());
		} catch(IOException e) {
			System.err.println("Error saving FeatureCollection: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Loads the KML file and converts it to ReferenceArea instances
	 */
	private void loadReferenceAreas() {
		try {
			// Load the KML file
			URI kmlUri = URI.createURI(System.getProperty("data") + "sensor_reference_areas.kml");
			Resource kmlResource = resourceSet.createResource(kmlUri);
			kmlResource.load(null);

			// Get the document root
			DocumentRoot documentRoot = (DocumentRoot) kmlResource.getContents().get(0);
			DocumentType document = (DocumentType) documentRoot.getKml().getAbstractFeatureGroup();

			// Create the reference area collection
			referenceAreas = ReferenceAreaFactory.eINSTANCE.createReferenceAreaCollection();

			// Process each placemark
			List<AbstractFeatureType> features = document.getAbstractFeatureGroup();
			for (AbstractFeatureType feature : features) {
				if (feature instanceof PlacemarkType) {
					PlacemarkType placemark = (PlacemarkType) feature;
					ReferenceArea refArea = convertPlacemarkToReferenceArea(placemark);
					if (refArea != null) {
						referenceAreas.getAreas().add(refArea);
					}
				} else if(feature instanceof FolderType folderType) {
					for(AbstractFeatureType f : folderType.getAbstractFeatureGroup()) {
						if(f instanceof PlacemarkType placemark) {
							ReferenceArea refArea = convertPlacemarkToReferenceArea(placemark);
							if (refArea != null) {
								referenceAreas.getAreas().add(refArea);
							}
						}
					}
				}
			}

			LOGGER.info("Loaded " + referenceAreas.getAreas().size() + " reference areas from KML");

		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error loading KML file: " + e.getMessage(), e);
			e.printStackTrace();
		}
	}

	/**
	 * Converts a KML Placemark to a ReferenceArea instance
	 */
	private ReferenceArea convertPlacemarkToReferenceArea(PlacemarkType placemark) {
		ReferenceArea area = ReferenceAreaFactory.eINSTANCE.createReferenceArea();

		// Set the name
		area.setName(placemark.getName());

		// Extract extended data (gid, anzahl_sens, tour_name_lang)
		ExtendedDataType extendedData = placemark.getExtendedData();
		if (extendedData != null && !extendedData.getSchemaData().isEmpty()) {
			SchemaDataType schemaData = extendedData.getSchemaData().get(0);
			Map<String, String> dataMap = extractSchemaData(schemaData);

			// Set gid
			String gidStr = dataMap.get("gid");
			if (gidStr != null) {
				area.setGid(Float.parseFloat(gidStr));
			}

			// Set sensor count
			String sensorCountStr = dataMap.get("anzahl_sens");
			if (sensorCountStr != null) {
				area.setSensorCount(Integer.parseInt(sensorCountStr));
			}

			// Set tour name
			String tourName = dataMap.get("tour_name_lang");
			if (tourName != null) {
				area.setTourName(tourName);
			}
		}

		// Convert geometry (MultiGeometry with Polygon)
		if (placemark.getAbstractGeometryGroup() instanceof MultiGeometryType) {
			MultiGeometryType multiGeometry = (MultiGeometryType) placemark.getAbstractGeometryGroup();
			if (!multiGeometry.getAbstractGeometryGroup().isEmpty()) {
				// Get the first polygon and convert it to GeoJSON
				if (multiGeometry.getAbstractGeometryGroup().get(0) instanceof PolygonType) {
					PolygonType polygon = (PolygonType) multiGeometry.getAbstractGeometryGroup().get(0);
					geojson.Polygon geoJsonPolygon = convertKmlPolygonToGeoJson(polygon);

					// Create a Feature wrapping the polygon
					geojson.Feature feature = GeojsonFactory.eINSTANCE.createFeature();
					feature.setType("Feature");
					feature.setGeometry(geoJsonPolygon);

					// Add metadata to properties map
					addPropertyToFeature(feature, "name", placemark.getName());
					if (area.getGid() != 0.0f) {
						addPropertyToFeature(feature, "gid", String.valueOf(area.getGid()));
					}
					if (area.getSensorCount() != 0) {
						addPropertyToFeature(feature, "sensorCount", String.valueOf(area.getSensorCount()));
					}
					if (area.getTourName() != null) {
						addPropertyToFeature(feature, "tourName", area.getTourName());
					}

					area.setGeometry(feature);
				}
			}
		}

		return area;
	}

	/**
	 * Adds a property to a Feature's properties map
	 */
	private void addPropertyToFeature(geojson.Feature feature, String key, String value) {
		feature.getProperties().put(key, value);
	}

	/**
	 * Extracts schema data from KML into a map
	 */
	private Map<String, String> extractSchemaData(SchemaDataType schemaData) {
		Map<String, String> dataMap = new HashMap<>();
		// Note: SchemaData contains SimpleData elements
		// We need to access them via feature map
		for (int i = 0; i < schemaData.getSimpleData().size(); i++) {
			// Get the name and value from the feature map entry
			// This is a simplified approach - actual implementation depends on KML model structure
			String name = (String) schemaData.getSimpleData().get(i).getName();
			String value = (String) schemaData.getSimpleData().get(i).getValue();
			if (name != null && value != null) {
				dataMap.put(name, value);
			}
		}
		return dataMap;
	}

	/**
	 * Converts a KML Polygon to a GeoJSON Polygon
	 */
	private geojson.Polygon convertKmlPolygonToGeoJson(PolygonType kmlPolygon) {
		geojson.Polygon polygon = GeojsonFactory.eINSTANCE.createPolygon();
		polygon.setType("Polygon");

		List<Double[][]> rings = new java.util.ArrayList<>();

		// Process outer boundary (exterior ring)
		if (kmlPolygon.getOuterBoundaryIs() != null) {
			net.opengis.kml.BoundaryType outerBoundary = kmlPolygon.getOuterBoundaryIs();
			if (outerBoundary.getLinearRing() != null) {
				List<String> coordinates = outerBoundary.getLinearRing().getCoordinates();
				Double[][] exteriorRing = parseKmlCoordinates(coordinates);
				rings.add(exteriorRing);
			}
		}

		// Process inner boundaries (holes) if any
		if (kmlPolygon.getInnerBoundaryIs() != null && !kmlPolygon.getInnerBoundaryIs().isEmpty()) {
			for (net.opengis.kml.BoundaryType innerBoundary : kmlPolygon.getInnerBoundaryIs()) {
				if (innerBoundary.getLinearRing() != null) {
					List<String> coordinates = innerBoundary.getLinearRing().getCoordinates();
					Double[][] hole = parseKmlCoordinates(coordinates);
					rings.add(hole);
				}
			}
		}

		// Set all rings to the polygon with proper winding order
		// GeoJSON requires: exterior ring = counter-clockwise, holes = clockwise
		for (int i = 0; i < rings.size(); i++) {
			Double[][] ring = rings.get(i);

			if (i == 0) {
				// First ring is exterior - must be counter-clockwise
				if (isClockwise(ring)) {
					ring = reverseRing(ring);
				}
			} else {
				// Subsequent rings are holes - must be clockwise
				if (!isClockwise(ring)) {
					ring = reverseRing(ring);
				}
			}

			polygon.getCoordinates().add(ring);
		}

		return polygon;
	}

	/**
	 * Checks if a ring is in clockwise order using the shoelace formula
	 * Returns true if clockwise, false if counter-clockwise
	 */
	private boolean isClockwise(Double[][] ring) {
		if (ring == null || ring.length < 3) {
			return false;
		}

		double sum = 0.0;
		for (int i = 0; i < ring.length - 1; i++) {
			Double[] p1 = ring[i];
			Double[] p2 = ring[i + 1];
			sum += (p2[0] - p1[0]) * (p2[1] + p1[1]);
		}

		// Close the ring if not already closed
		if (!ring[0][0].equals(ring[ring.length - 1][0]) ||
		    !ring[0][1].equals(ring[ring.length - 1][1])) {
			Double[] first = ring[0];
			Double[] last = ring[ring.length - 1];
			sum += (first[0] - last[0]) * (first[1] + last[1]);
		}

		return sum > 0;
	}

	/**
	 * Reverses the order of coordinates in a ring
	 */
	private Double[][] reverseRing(Double[][] ring) {
		if (ring == null || ring.length == 0) {
			return ring;
		}

		Double[][] reversed = new Double[ring.length][];
		for (int i = 0; i < ring.length; i++) {
			reversed[i] = ring[ring.length - 1 - i];
		}
		return reversed;
	}

	/**
	 * Parses KML coordinate list into a Double[][] array
	 * Each element in the list is a coordinate tuple: "lon,lat" or "lon,lat,alt"
	 * Returns array[numPoints][2 or 3] where each point is [lon, lat] or [lon, lat, alt]
	 */
	private Double[][] parseKmlCoordinates(List<String> coordinatesList) {
		if (coordinatesList == null || coordinatesList.isEmpty()) {
			return new Double[0][0];
		}

		List<Double[]> points = new java.util.ArrayList<>();

		for (String tuple : coordinatesList) {
			if (tuple == null || tuple.trim().isEmpty()) {
				continue;
			}

			// Split each tuple by comma to get lon,lat,alt
			String[] parts = tuple.trim().split(",");

			if (parts.length >= 2) {
				try {
					double longitude = Double.parseDouble(parts[0].trim());
					double latitude = Double.parseDouble(parts[1].trim());

					// Create point array with or without elevation
					if (parts.length >= 3) {
						double elevation = Double.parseDouble(parts[2].trim());
						points.add(new Double[]{longitude, latitude, elevation});
					} else {
						points.add(new Double[]{longitude, latitude});
					}
				} catch (NumberFormatException e) {
					LOGGER.log(Level.SEVERE, "Error parsing coordinate tuple: " + tuple + " - " + e.getMessage());
				}
			}
		}

		// Convert List<Double[]> to Double[][]
		// Result should be Double[numPoints][coordsPerPoint]
		Double[][] result = new Double[points.size()][];
		for (int i = 0; i < points.size(); i++) {
			result[i] = points.get(i);
		}

		return result;
	}

	/**
	 * Returns the loaded reference areas
	 */
	public ReferenceAreaCollection getReferenceAreas() {
		return referenceAreas;
	}
}
