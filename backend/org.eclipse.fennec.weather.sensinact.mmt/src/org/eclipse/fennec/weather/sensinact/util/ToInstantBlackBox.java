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
package org.eclipse.fennec.weather.sensinact.util;

import java.time.Instant;

import org.eclipse.fennec.qvt.osgi.annotations.ModuleName;
import org.eclipse.fennec.qvt.osgi.annotations.QvtBlackbox;
import org.eclipse.fennec.qvt.osgi.annotations.TemplatePath;
import org.eclipse.fennec.qvt.osgi.annotations.TransformatorId;
import org.eclipse.fennec.qvt.osgi.annotations.UnitQualifiedName;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.gecko.weather.model.weather.WeatherPackage;
import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Component;


/**
 * 
 * @author ilenia
 * @since Jul 3, 2025
 */
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=org.gecko.weather.model)")
@Component(service = ToInstantBlackBox.class)
@QvtBlackbox
@ModuleName("ToInstant")
@UnitQualifiedName("org.eclipse.fennec.weather.sensinact.util.ToInstantBlackBox")
@TemplatePath("org.eclipse.fennec.weather.sensinact.mmt/transformations/weather.qvto")
@TransformatorId("Weather2Sensinact")
@Module(packageURIs={WeatherPackage.eNS_URI, ProviderPackage.eNS_URI})
public class ToInstantBlackBox {

	@Operation(description = "Converts from milliseconds to Instant")
	public Instant getInstant(Long millis) {
		if(millis !=  null) {
			return Instant.ofEpochMilli(millis);
		}
		return null;
	}

	@Operation(description = "Instant now")
	public Instant getNow() {
			return Instant.now();
	}
}
