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
package de.jena.udp.dashboard.viewer.web.app;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

/**
 * 
 * @author Juergen Albert
 * @since 1 Oct 2024
 */
@Component(name = "DashboardViewerConfigurator", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class DashboardViewerConfigurator {

	public static @interface Config{
		
		
		
	}
	
}
