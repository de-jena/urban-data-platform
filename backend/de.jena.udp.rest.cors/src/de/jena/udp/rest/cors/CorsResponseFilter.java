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

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.propertytypes.ServiceRanking;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsExtension;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsWhiteboardTarget;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MultivaluedMap;

/**
 * Jakarta RS filter that adds CORS (Cross-Origin Resource Sharing) headers to REST API responses.
 * Configured via OSGi Config Admin using {@link CorsConfig}.
 *
 * @since 5 Dec 2025
 */
@Component(
    configurationPid = "de.jena.udp.rest.cors.CorsConfig",
    configurationPolicy = ConfigurationPolicy.REQUIRE
)
@JakartarsExtension
@JakartarsName("CORS Response Filter")
@ServiceRanking(1000)
@JakartarsWhiteboardTarget("(jersey.jakartars.whiteboard.name=udprest)")
@JakartarsApplicationSelect("(|(osgi.jakartars.name=sensorthings)(osgi.jakartars.name=sensinact-rest))")
public class CorsResponseFilter implements ContainerResponseFilter {

    private boolean enabled;
    private String allowedOriginsHeader;
    private String allowedMethodsHeader;
    private String allowedHeadersHeader;
    private String exposedHeadersHeader;
    private boolean allowCredentials;
    private String maxAgeHeader;

    @Activate
    void activate(CorsConfig config) {
        this.enabled = config.enabled();
        this.allowedOriginsHeader = joinArray(config.allowedOrigins());
        this.allowedMethodsHeader = joinArray(config.allowedMethods());
        this.allowedHeadersHeader = joinArray(config.allowedHeaders());
        this.exposedHeadersHeader = joinArray(config.exposedHeaders());
        this.allowCredentials = config.allowCredentials();
        this.maxAgeHeader = String.valueOf(config.maxAge());
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {

        if (!enabled) {
            return;
        }

        // Add CORS headers to the response
        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		headers.add("Access-Control-Allow-Origin", allowedOriginsHeader);
        headers.add("Access-Control-Allow-Methods", allowedMethodsHeader);
        headers.add("Access-Control-Allow-Headers", allowedHeadersHeader);

        if (exposedHeadersHeader != null && !exposedHeadersHeader.isEmpty()) {
            headers.add("Access-Control-Expose-Headers", exposedHeadersHeader);
        }

        if (allowCredentials) {
            headers.add("Access-Control-Allow-Credentials", "true");
        }

        headers.add("Access-Control-Max-Age", maxAgeHeader);
    }

    private String joinArray(String[] values) {
        return Arrays.stream(values)
                .collect(Collectors.joining(", "));
    }
}
