/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.jena.ilsa.sensinact.geojson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fennec.qvt.osgi.annotations.ModuleName;
import org.eclipse.fennec.qvt.osgi.annotations.QvtBlackbox;
import org.eclipse.fennec.qvt.osgi.annotations.TemplatePath;
import org.eclipse.fennec.qvt.osgi.annotations.TransformatorId;
import org.eclipse.fennec.qvt.osgi.annotations.UnitQualifiedName;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.LineString;
import org.eclipse.sensinact.gateway.geojson.MultiLineString;
import org.eclipse.sensinact.gateway.geojson.MultiPoint;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.geojson.GeojsonPackage;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;

/**
 * 
 * @author markus
 * @since 22.04.2024
 */
@Component(service = { GeoJsonBlackBox.class })
@QvtBlackbox
@TransformatorId("TLSTrafficLightToIlsa")
@ModuleName("GeoJsonBlackBox")
@UnitQualifiedName("de.jena.ilsa.sensinact.geojson.GeoJsonBlackBox")
@TemplatePath("de.jena.ilsa.sensinact.mmt/transformations/ilsa.qvto")
@Module(packageURIs = { GeojsonPackage.eNS_URI, ProviderPackage.eNS_URI, TOSCommonPackage.eNS_URI, IlsaPackage.eNS_URI })
public final class GeoJsonBlackBox {

	@Reference
	GeojsonPackage geoJsonPackage;
	@Reference
	ProviderPackage providerPackage;
	@Reference
	IlsaPackage ilsaPackage;

	@Operation(contextual = true, description = "Converts from GeoJson into Sensorthing Feature Collections")
	public static FeatureCollection convertToFeatureCollection(de.jena.udp.model.geojson.GeoJSON sarea) {

		List<Feature> features = new ArrayList<>();
		if (sarea instanceof de.jena.udp.model.geojson.FeatureCollection area) {
			area.getFeatures().forEach(f -> {
				HashMap<String, Object> properties = new HashMap<>();
				properties.putAll(f.getProperties().map());

				if (f.getGeometry() instanceof de.jena.udp.model.geojson.LineString) {
					de.jena.udp.model.geojson.LineString fls = (de.jena.udp.model.geojson.LineString) f;
					List<Coordinates> coordinates = new ArrayList<>();
					fls.getCoordinates().forEach(c -> coordinates.add(new Coordinates(c[0], c[1])));
					LineString ls = new LineString(coordinates, null, null);
					Feature castFeature = new Feature("", ls, properties, null, null);
					features.add(castFeature);
				}

				if (f.getGeometry() instanceof de.jena.udp.model.geojson.Polygon fpg) {
					List<List<Coordinates>> coordinates = new ArrayList<>();
					fpg.getCoordinates().forEach(c -> {
						List<Coordinates> list = new ArrayList<>();

						for (Double[] p : c) {
							list.add(new Coordinates(p[0], p[1]));
						}

						coordinates.add(list);

					});
					Polygon pg = new Polygon(coordinates, null, null);
					Feature castFeature = new Feature("", pg, properties, null, null);
					features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.Point fp) {
					EList<Double> co = fp.getCoordinates();
					Coordinates coordinates = new Coordinates(co.get(0), co.get(1));
					Point pg = new Point(coordinates, null, null);
					Feature castFeature = new Feature("", pg, properties, null, null);
					features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.MultiPoint fmp) {
					List<Coordinates> coordinates = new ArrayList<>();

					for (Double[] p : fmp.getCoordinates()) {
						coordinates.add(new Coordinates(p[0], p[1]));
					}

					MultiPoint pg = new MultiPoint(coordinates, null, null);
					Feature castFeature = new Feature("", pg, properties, null, null);
					features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.MultiLineString fmls) {
					List<List<Coordinates>> coordinates = new ArrayList<>();
					fmls.getCoordinates().forEach(c -> {
						List<Coordinates> list = new ArrayList<>();
						for (Double[] p : c) {
							list.add(new Coordinates(p[0], p[1]));
						}
						coordinates.add(list);
					});
					MultiLineString mls = new MultiLineString(coordinates, null, null);
					Feature castFeature = new Feature("", mls, properties, null, null);
					features.add(castFeature);
				}

			});
		}
		return new FeatureCollection(features, null, null);
	}
}
