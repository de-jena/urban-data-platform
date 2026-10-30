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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sensinact.gateway.geojson.Coordinates;

import net.opengis.kml.DocumentRoot;
import net.opengis.kml.DocumentType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.FolderType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.util.KMLResourceFactoryImpl;

/** The placemarks of a KML document by folder, and the parts of a placemark the adapter reads. */
final class KmlPlacemarks {

	private final DocumentType document;

	private KmlPlacemarks(DocumentType document) {
		this.document = document;
	}

	static KmlPlacemarks load(InputStream kml) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(KMLPackage.eNS_URI, KMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kml", new KMLResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createURI("locations.kml"));
		resource.load(kml, null);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		if (root.getKml() == null || !(root.getKml().getAbstractFeatureGroup() instanceof DocumentType document)) {
			throw new IOException("the KML carries no Document");
		}
		return new KmlPlacemarks(document);
	}

	List<PlacemarkType> inFolder(String folderName) {
		return document.getAbstractFeatureGroup().stream()
				.filter(FolderType.class::isInstance).map(FolderType.class::cast)
				.filter(folder -> folderName.equals(folder.getName()))
				.flatMap(folder -> folder.getAbstractFeatureGroup().stream())
				.filter(PlacemarkType.class::isInstance).map(PlacemarkType.class::cast)
				.toList();
	}

	/** The non-blank SchemaData/SimpleData and Data values of the placemark by name. */
	static Map<String, String> extendedData(PlacemarkType placemark) {
		Map<String, String> values = new HashMap<>();
		ExtendedDataType extended = placemark.getExtendedData();
		if (extended == null) {
			return values;
		}
		extended.getData().forEach(data -> values.put(data.getName(), data.getValue()));
		extended.getSchemaData().stream()
				.flatMap(schema -> schema.getSimpleData().stream())
				.forEach(simple -> values.put(simple.getName(), simple.getValue()));
		values.values().removeIf(value -> value == null || value.isBlank());
		return values;
	}

	/** KML {@code lon,lat[,alt]} tuples as GeoJSON coordinates; malformed tuples are skipped. */
	static List<Coordinates> coordinates(List<String> tuples) {
		List<Coordinates> coordinates = new ArrayList<>();
		for (String tuple : tuples) {
			String[] parts = tuple.trim().split(",");
			try {
				if (parts.length == 2) {
					coordinates.add(new Coordinates(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
				} else if (parts.length > 2) {
					coordinates.add(new Coordinates(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]),
							Double.parseDouble(parts[2])));
				}
			} catch (NumberFormatException e) {
				// not a coordinate tuple
			}
		}
		return coordinates;
	}
}
