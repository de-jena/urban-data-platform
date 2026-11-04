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
package de.jena.udp.atlas.traficam;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.ServiceModel;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

/** The objects of one class a camera saw in the last window: one service per object class. */
@ModelPackageUri(TraficamproviderPackage.eNS_URI)
@Model("TrafiCam")
public class TrafiCamDto {

	public TrafiCamDto(String camId, String classId, String classificationName, GeoJsonObject objects, long timestamp) {
		this.camId = camId;
		this.classification = classId;
		this.classificationName = classificationName;
		this.objects = objects;
		this.timestamp = timestamp;
	}

	@Model
	public EClass providerEClass = TraficamproviderPackage.Literals.TRAFICAM_PROVIDER;

	@Provider
	public String camId;

	@ServiceModel
	public EClass serviceEClass = TraficamproviderPackage.Literals.OBSERVED_OBJECTS;

	@Service
	public String classification;

	@Data
	public String classificationName;

	@Data
	public GeoJsonObject objects;

	@Timestamp
	public long timestamp;
}
