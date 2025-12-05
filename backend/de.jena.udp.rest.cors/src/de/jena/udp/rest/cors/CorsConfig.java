/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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

package de.jena.udp.rest.cors;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * Configuration interface for CORS (Cross-Origin Resource Sharing) settings.
 *
 * @since 5 Dec 2025
 */
@ObjectClassDefinition(
    name = "CORS Configuration",
    description = "Configuration for Cross-Origin Resource Sharing (CORS) headers"
)
public @interface CorsConfig {

    @AttributeDefinition(
        name = "Enabled",
        description = "Enable or disable CORS support"
    )
    boolean enabled() default true;

    @AttributeDefinition(
        name = "Allowed Origins",
        description = "List of allowed origins. Use '*' to allow all origins."
    )
    String[] allowedOrigins() default {"*"};

    @AttributeDefinition(
        name = "Allowed Methods",
        description = "HTTP methods allowed for CORS requests"
    )
    String[] allowedMethods() default {"GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS", "HEAD"};

    @AttributeDefinition(
        name = "Allowed Headers",
        description = "HTTP headers that can be used in CORS requests"
    )
    String[] allowedHeaders() default {"Origin", "Content-Type", "Accept", "Authorization", "X-Requested-With"};

    @AttributeDefinition(
        name = "Exposed Headers",
        description = "HTTP headers that browsers are allowed to access"
    )
    String[] exposedHeaders() default {"Content-Length", "Content-Type"};

    @AttributeDefinition(
        name = "Allow Credentials",
        description = "Whether credentials (cookies, authorization headers) are allowed"
    )
    boolean allowCredentials() default false;

    @AttributeDefinition(
        name = "Max Age",
        description = "How long (in seconds) preflight requests can be cached. Default is 1 hour (3600 seconds)."
    )
    int maxAge() default 3600;
}
