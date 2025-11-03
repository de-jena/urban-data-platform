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
package de.jena.glt.sensinact;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "GLT Configuration", description = "Configuration to request and update sensor data from the GLT rest api.")
public @interface GltConfiguration {
	@AttributeDefinition(description = "System/Side id")
	String systemID();
	@AttributeDefinition(description = "Mesurement points")
	int[] points();
	@AttributeDefinition(description = "Update interval in minutes")
	long interval() default 10;
	@AttributeDefinition(description = "Time to look back on update in minutes")
	long back() default 60;
}