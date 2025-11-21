/*
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
package de.jena.chirpstack.sensinact;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.DataType;
import net.opengis.kml.DocumentRoot;
import net.opengis.kml.DocumentType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PointType;

@Component(name = "ChirpstackLocationComponent", service = ChirpstackLocationComponent.class)
public class ChirpstackLocationComponent {

	@Reference
	private ResourceSet resourceSet;


	private static final Logger LOGGER = Logger.getLogger(ChirpstackLocationComponent.class.getName());
	private Map<String, Point> locationMap;

	@Activate
	public void activate() {
		locationMap = new HashMap<>();
		loadSensorLocation();
	}
	
	public Point getSensorLocation(String id) {
		return locationMap.getOrDefault(id, null);
	}

	private void loadSensorLocation() {
		try {
			URI kmlUri = URI.createURI(System.getProperty("data") + "sensoren.kml");
			Resource kmlResource = resourceSet.createResource(kmlUri);
			kmlResource.load(null);	

			// Get the document root
			DocumentRoot documentRoot = (DocumentRoot) kmlResource.getContents().get(0);
			DocumentType document = (DocumentType) documentRoot.getKml().getAbstractFeatureGroup();
			
			// Process each placemark
			List<AbstractFeatureType> features = document.getAbstractFeatureGroup();
			for (AbstractFeatureType feature : features) {
				if (feature instanceof PlacemarkType placemark) {
					String id = extractSensorIdFromPlacemark(placemark);
					Point location = extractSensorLocationFromPlacemark(placemark);
					if(id != null && location != null) {
						locationMap.put(id, location);
					}
				} 
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error loading KML file: " + e.getMessage(), e);
			e.printStackTrace();
		}

	}

	/**
	 * @param placemark
	 * @return
	 */
	private Point extractSensorLocationFromPlacemark(PlacemarkType placemark) {
		
		if(placemark.getAbstractGeometryGroup() instanceof PointType point) {
			if(point.getCoordinates() != null && point.getCoordinates().size() == 1) {
				String coordinatesStr = point.getCoordinates().get(0);
				String[] coordinates = coordinatesStr.split(",");
				if(coordinates.length >= 2) {
					double lng = Double.valueOf(coordinates[0]);
					double lat = Double.valueOf(coordinates[1]);
					return new Point(lng, lat);
				}
				
			}
		}
		return null;
	}

	/**
	 * @param placemark
	 * @return
	 */
	private String extractSensorIdFromPlacemark(PlacemarkType placemark) {
		ExtendedDataType extendedData = placemark.getExtendedData();
		if (extendedData != null) {
			Map<String, String> data = extractData(extendedData.getData());
			if(data.containsKey("eui")) return data.get("eui");
			else if(data.containsKey("key")) return data.get("key");
		}			
		return null;
	}
		
		/**
		 * Extracts schema data from KML into a map
		 */
		private Map<String, String> extractData(List<DataType> dataTypes) {
			Map<String, String> dataMap = new HashMap<>();
			// Note: SchemaData contains SimpleData elements
			// We need to access them via feature map
			for (int i = 0; i < dataTypes.size(); i++) {
				// Get the name and value from the feature map entry
				// This is a simplified approach - actual implementation depends on KML model structure
				String name = (String) dataTypes.get(i).getName();
				String value = (String) dataTypes.get(i).getValue();
				if (name != null && value != null && !value.isEmpty()) {
					dataMap.put(name, value);
				}
			}
			return dataMap;
		}


}
