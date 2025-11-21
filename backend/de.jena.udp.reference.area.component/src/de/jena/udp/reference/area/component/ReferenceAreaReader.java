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

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaFactory;
import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractGeometryType;
import net.opengis.kml.BoundaryType;
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
	private List<ReferenceAreaProvider> referenceAreaProviders;

	@Activate
	public void activate() {
		LOGGER.info("ReferenceAreaReader component activated");
		loadReferenceAreas();
		pushToSensinact();
	}

	private void pushToSensinact() {
		for(ReferenceAreaProvider provider : referenceAreaProviders) {
			sensinact.pushUpdate(provider)
			.onSuccess(s -> {
				LOGGER.info(String.format("Succesfully pushed ReferenceAreaProvider %s to SensiNact", provider.getId()));
			})
			.onFailure(t -> {
				LOGGER.log(Level.SEVERE, "Error while pushing ReferenceAreaProvider to SensiNact", t);
			});
		}		
	}



	/**
	 * Loads the KML file and converts it to ReferenceArea instances
	 */
	private void loadReferenceAreas() {
		try {
			// Load the KML file
			URI kmlUri = URI.createURI(System.getProperty("data") + "refflaechen_smartcity.kml");
			Resource kmlResource = resourceSet.createResource(kmlUri);
			kmlResource.load(null);

			// Get the document root
			DocumentRoot documentRoot = (DocumentRoot) kmlResource.getContents().get(0);
			DocumentType document = (DocumentType) documentRoot.getKml().getAbstractFeatureGroup();

			referenceAreaProviders = new LinkedList<>();

			// Process each placemark
			List<AbstractFeatureType> features = document.getAbstractFeatureGroup();
			for (AbstractFeatureType feature : features) {
				if (feature instanceof PlacemarkType) {
					PlacemarkType placemark = (PlacemarkType) feature;
					ReferenceAreaProvider refAreaProvider = convertPlacemarkToReferenceAreaProvider(placemark);
					if (refAreaProvider != null) {
						referenceAreaProviders.add(refAreaProvider);
					}
				} else if(feature instanceof FolderType folderType) {
					for(AbstractFeatureType f : folderType.getAbstractFeatureGroup()) {
						if(f instanceof PlacemarkType placemark) {
							ReferenceAreaProvider refAreaProvider = convertPlacemarkToReferenceAreaProvider(placemark);
							if (refAreaProvider != null) {
								referenceAreaProviders.add(refAreaProvider);

							}
						}
					}
				}
			}

			LOGGER.info("Loaded " + referenceAreaProviders.size() + " reference areas from KML");

		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error loading KML file: " + e.getMessage(), e);
			e.printStackTrace();
		}
	}

	/**
	 * @param placemark
	 * @return
	 */
	private ReferenceAreaProvider convertPlacemarkToReferenceAreaProvider(PlacemarkType placemark) {
		ReferenceAreaProvider provider = SensinactRefAreaFactory.eINSTANCE.createReferenceAreaProvider();
		ReferenceArea service = SensinactRefAreaFactory.eINSTANCE.createReferenceArea();

		provider.setId(placemark.getName());

		service.setName(placemark.getName());
		service.setColor(ColorType.UNKNOWN);

		Map<String, Object> properties = new HashMap<>();

		// Extract extended data (gid, anzahl_sens, tour_name_lang)
		ExtendedDataType extendedData = placemark.getExtendedData();
		if (extendedData != null && !extendedData.getSchemaData().isEmpty()) {
			SchemaDataType schemaData = extendedData.getSchemaData().get(0);
			Map<String, String> dataMap = extractSchemaData(schemaData);

			// Set gid
			String gidStr = dataMap.get("gid");
			if (gidStr != null) {
				service.setGid(Float.parseFloat(gidStr));
				properties.put("gid", service.getGid());
			}

			// Set sensor count
			String sensorCountStr = dataMap.get("anzahl_sens");
			if (sensorCountStr != null) {
				service.setSensorCount(Integer.parseInt(sensorCountStr));
				properties.put("sensorCount", service.getSensorCount());
			}

			// Set tour name
			String tourName = dataMap.get("tour_name_lang");
			if (tourName != null) {
				service.setTourName(tourName);
				properties.put("tourName", service.getTourName());
			}
		}


		provider.setReferenceArea(service);

		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setFriendlyName("Reference Area " + placemark.getName());
		admin.setDescription("Sensor reference area");


		// Convert geometry (MultiGeometry with Polygon)
		//		FeatureMap abstractGeometryGroupGroup = placemark.getAbstractGeometryGroupGroup();
		AbstractGeometryType abstractGeometryGroup = placemark.getAbstractGeometryGroup();

		if(abstractGeometryGroup instanceof PolygonType polygonType) {
			Polygon sensinactPolygon = convertKmlPolygonToSensinactPolygon(polygonType);					
			// Create a Feature wrapping the polygon
			Feature sensinactFeature = new Feature(
					properties.containsKey("name") ? (String) properties.get("name") : null, // id - can be extracted from properties if needed
							sensinactPolygon,
							properties,
							null, // bbox - could be calculated if needed
							null  // foreignMembers
					);

			admin.setLocation(sensinactFeature);
		}

		else if (placemark.getAbstractGeometryGroup() instanceof MultiGeometryType) {
			MultiGeometryType multiGeometry = (MultiGeometryType) placemark.getAbstractGeometryGroup();
			if (!multiGeometry.getAbstractGeometryGroup().isEmpty()) {
				int index = 0;
				List<Feature> features = new LinkedList<>();
				for(AbstractGeometryType abGeometry : multiGeometry.getAbstractGeometryGroup()) {
					if(abGeometry instanceof PolygonType polygon) {
						Polygon sensinactPolygon = convertKmlPolygonToSensinactPolygon(polygon);					
						// Create a Feature wrapping the polygon
						Feature sensinactFeature = new Feature(
								properties.containsKey("name") ? ((String) properties.get("name")).concat(String.valueOf(index)) : null, // id - can be extracted from properties if needed
										sensinactPolygon,
										properties,
										null, // bbox - could be calculated if needed
										null  // foreignMembers
								);
						index++;
						features.add(sensinactFeature);	
					}
				}
				FeatureCollection featureCollection = new FeatureCollection(features, null, properties);
				admin.setLocation(featureCollection);				
			}
		}
		provider.setAdmin(admin);
		return provider;
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

	private Polygon convertKmlPolygonToSensinactPolygon(PolygonType kmlPolygon) {
		if (kmlPolygon == null) {
			return null;
		}

		List<List<Coordinates>> rings = new java.util.ArrayList<>();

		// Process outer boundary (exterior ring)
		if (kmlPolygon.getOuterBoundaryIs() != null) {
			BoundaryType outerBoundary = kmlPolygon.getOuterBoundaryIs();
			if (outerBoundary.getLinearRing() != null) {
				List<String> coordinates = outerBoundary.getLinearRing().getCoordinates();
				Double[][] exteriorRing = parseKmlCoordinates(coordinates);

				// Ensure exterior ring is counter-clockwise
				if (isClockwise(exteriorRing)) {
					exteriorRing = reverseRing(exteriorRing);
				}

				// Convert to SensiNact Coordinates
				List<Coordinates> coordsList = new java.util.ArrayList<>();
				for (Double[] point : exteriorRing) {
					if (point.length >= 2) {
						if (point.length >= 3) {
							// With elevation
							coordsList.add(new Coordinates(
									point[0], point[1], point[2]
									));
						} else {
							// Without elevation
							coordsList.add(new Coordinates(
									point[0], point[1]
									));
						}
					}
				}
				rings.add(coordsList);
			}
		}

		// Process inner boundaries (holes) if any
		if (kmlPolygon.getInnerBoundaryIs() != null && !kmlPolygon.getInnerBoundaryIs().isEmpty()) {
			for (BoundaryType innerBoundary : kmlPolygon.getInnerBoundaryIs()) {
				if (innerBoundary.getLinearRing() != null) {
					List<String> coordinates = innerBoundary.getLinearRing().getCoordinates();
					Double[][] hole = parseKmlCoordinates(coordinates);

					// Ensure holes are clockwise
					if (!isClockwise(hole)) {
						hole = reverseRing(hole);
					}

					// Convert to SensiNact Coordinates
					List<Coordinates> coordsList = new java.util.ArrayList<>();
					for (Double[] point : hole) {
						if (point.length >= 2) {
							if (point.length >= 3) {
								coordsList.add(new Coordinates(
										point[0], point[1], point[2]
										));
							} else {
								coordsList.add(new Coordinates(
										point[0], point[1]
										));
							}
						}
					}
					rings.add(coordsList);
				}
			}
		}

		// Return null if no rings were processed
		if (rings.isEmpty()) {
			return null;
		}

		return new Polygon(rings, null, null);
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

}
