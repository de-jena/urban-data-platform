/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.udp.modelling.ui.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationBase;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;

import jakarta.ws.rs.core.Application;
import java.util.Set;

import org.glassfish.jersey.jackson.JacksonFeature;

@Component(name = UrbanDataPlatformApplication.COMPONENT_NAME, service = Application.class, property = {"emf=true", "applicationId=modelling-api"})
@JakartarsApplicationBase("/modelling-api")
@JakartarsName("Model API Application")
public class UrbanDataPlatformApplication extends Application {

	public static final String COMPONENT_NAME = "UrbanDataPlatformApplication";
	
	@Override
	public Set<Class<?>> getClasses() {
		return Set.of(JacksonFeature.class);
	}
}