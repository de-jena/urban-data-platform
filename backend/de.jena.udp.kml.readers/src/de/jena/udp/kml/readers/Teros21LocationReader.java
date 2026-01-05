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
package de.jena.udp.kml.readers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import de.jena.udp.kml.readers.api.KMLReader;
import de.jena.udp.kml.readers.api.LocationReader;
import net.opengis.kml.DocumentRoot;
import net.opengis.kml.DocumentType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.FolderType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PointType;
import net.opengis.kml.SchemaDataType;

@Component(name = "Teros21LocationReader", 
service = {KMLReader.class, LocationReader.class},
configurationPid = "Teros21LocationReader", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = KMLReaderConfig.class)
public class Teros21LocationReader implements KMLReader, LocationReader{

	@Reference
	private ResourceSet resourceSet;


	private static final Logger LOGGER = Logger.getLogger(Teros21LocationReader.class.getName());
	private Map<String, Point> locationMap = new HashMap<>();

	private KMLReaderConfig config;

	@Activate
	public void activate(KMLReaderConfig config) {
		Objects.requireNonNull(config.kml_file_path(), "A configuration property 'kml.file.path' must be provided!");
		this.config = config;
		loadKML();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.udp.kml.readers.api.KMLReader#loadKML()
	 */
	@Override
	public void loadKML() {
		try {
			URI kmlUri = URI.createURI(config.kml_file_path());
			Resource kmlResource = resourceSet.createResource(kmlUri);
			kmlResource.load(null);	

			// Get the document root
			DocumentRoot documentRoot = (DocumentRoot) kmlResource.getContents().get(0);
			DocumentType document = (DocumentType) documentRoot.getKml().getAbstractFeatureGroup();

			// Process each placemark
			List<FolderType> folders;
			if(config.kml_folder_name() != null) {
				folders = document.getAbstractFeatureGroup().
						stream().
						filter(f -> f instanceof FolderType).
						map(f -> (FolderType) f).
						filter(f -> config.kml_folder_name().equals(f.getName())).
						toList();
			} else {
				folders = document.getAbstractFeatureGroup().
						stream().
						filter(f -> f instanceof FolderType).
						map(f -> (FolderType) f).
						toList();
			}
			for (FolderType folder : folders) {
				List<PlacemarkType> placemarks = folder.getAbstractFeatureGroup().
						stream().
						filter(f -> f instanceof PlacemarkType).
						map(f -> (PlacemarkType) f).
						toList();
				for(PlacemarkType placemark : placemarks) {
					String id = extractSensorIdFromPlacemark(placemark);
					Point location = extractSensorLocationFromPlacemark(placemark);
					if(id != null && location != null) {
						locationMap.put(id, location);
					}
				}					
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error loading KML file: " + e.getMessage(), e);
		}

	}



	//	private void loadSensorLocation() {
	//		try {
	//			URI kmlUri = URI.createURI(System.getProperty("data") + "sensoren.kml");
	//			Resource kmlResource = resourceSet.createResource(kmlUri);
	//			kmlResource.load(null);	
	//
	//			// Get the document root
	//			DocumentRoot documentRoot = (DocumentRoot) kmlResource.getContents().get(0);
	//			DocumentType document = (DocumentType) documentRoot.getKml().getAbstractFeatureGroup();
	//			
	//			// Process each placemark
	//			List<AbstractFeatureType> features = document.getAbstractFeatureGroup();
	//			for (AbstractFeatureType feature : features) {
	//				if (feature instanceof PlacemarkType placemark) {
	//					String id = extractSensorIdFromPlacemark(placemark);
	//					Point location = extractSensorLocationFromPlacemark(placemark);
	//					if(id != null && location != null) {
	//						locationMap.put(id, location);
	//					}
	//				} 
	//			}
	//		} catch (IOException e) {
	//			LOGGER.log(Level.SEVERE, "Error loading KML file: " + e.getMessage(), e);
	//		}
	//
	//	}

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
					double lng = Double.parseDouble(coordinates[0]);
					double lat = Double.parseDouble(coordinates[1]);
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
		if (extendedData != null && extendedData.getSchemaData() != null && !extendedData.getSchemaData().isEmpty()) {
			Optional<String> euiOptional = doExtractEUIFromSchemaData(extendedData.getSchemaData().get(0));
			return euiOptional.orElse(null);
		}			
		return null;
	}

	private Optional<String> doExtractEUIFromSchemaData(SchemaDataType schemaData) {
		return schemaData.getSimpleData().stream().
				filter(sd -> "eui".equals(sd.getName())).
				findFirst().
				map(sd -> sd.getValue());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.udp.kml.readers.api.LocationReader#getLocation(java.lang.String)
	 */
	@Override
	public Point getLocation(String elementId) {
		return locationMap.getOrDefault(elementId, null);
	}
}
