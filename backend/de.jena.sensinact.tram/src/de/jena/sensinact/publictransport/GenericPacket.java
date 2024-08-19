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

package de.jena.sensinact.publictransport;

import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;

/**
 * 
 * @author ungei
 * @since 22 Oct 2021
 */
public class GenericPacket {


	@Provider
	protected String providerId;
	@Service
    protected String serviceId;
	@Resource
    protected String resourceId;
	@Data
    protected Object payload;
    
    public GenericPacket(String providerId, String serviceId, String resourceId, Object data) {
        this.providerId = providerId;
        this.serviceId = serviceId;
        this.resourceId = resourceId;
        this.payload = data;
    }

    public String getProviderId() {
        return providerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public Object getPayload() {
        return payload;
    }
}
