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
package org.eclipse.fennec.weather.sensinact.rules;

/**
 * 
 * @author ilenia
 * @since Aug 12, 2025
 */
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Threshold Rule Configuration")
public @interface CustomRuleConfig {

    @AttributeDefinition(name = "Provider Name", description = "The name of the service provider")
    String providerName();

    @AttributeDefinition(name = "Service Name", description = "The name of the service")
    String serviceName();

    @AttributeDefinition(name = "Resource Name", description = "The name of the resource to monitor")
    String resourceName();

    @AttributeDefinition(name = "Threshold Value", description = "The threshold value that triggers the rule")
    int threshold();
}
