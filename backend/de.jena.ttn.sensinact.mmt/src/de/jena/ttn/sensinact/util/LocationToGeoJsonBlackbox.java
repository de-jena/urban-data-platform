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

package de.jena.ttn.sensinact.util;

import org.eclipse.fennec.qvt.osgi.annotations.ModuleName;
import org.eclipse.fennec.qvt.osgi.annotations.QvtBlackbox;
import org.eclipse.fennec.qvt.osgi.annotations.TemplatePath;
import org.eclipse.fennec.qvt.osgi.annotations.TransformatorId;
import org.eclipse.fennec.qvt.osgi.annotations.UnitQualifiedName;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Component;

import de.jena.model.ttn.Location;
import de.jena.model.ttn.TTNPackage;


/**
 * 
 * @author mark
 * @since 24.11.2022
 */
@Component(service = {LocationToGeoJsonBlackbox.class})
@QvtBlackbox
@TransformatorId("TTN2SensinactTTNApi")
@ModuleName("LocationToGeoJsonBlackbox")
@UnitQualifiedName("de.jena.ttn.sensinact.util.LocationToGeoJsonBlackbox")
@TemplatePath("de.jena.ttn.sensinact.mmt/ttn.qvto")
@Module(packageURIs={TTNPackage.eNS_URI})
public class LocationToGeoJsonBlackbox{
	
	@Operation(contextual = true, description = "Converts from UTM into degree latitude")
	public static GeoJsonObject toGeoJson(Location l) {
		return new Point(new Coordinates(l.getLongitude(), l.getLatitude(), l.getAltitude()), null, null);
	}

}
