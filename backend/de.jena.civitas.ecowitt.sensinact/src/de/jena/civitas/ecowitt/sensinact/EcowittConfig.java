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
package de.jena.civitas.ecowitt.sensinact;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Ecowitt Weather Station Configuration")
public @interface EcowittConfig {
	String topic() default "ecowitt/bielefeld";

	String messagingServiceId() default "ecowitt";

	double longitude();

	double latitude();
}