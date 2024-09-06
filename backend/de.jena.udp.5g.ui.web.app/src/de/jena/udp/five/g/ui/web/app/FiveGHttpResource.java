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
package de.jena.udp.five.g.ui.web.app;


import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContextSelect;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;

/**
 * Webresource
 * @author Juergen Albert
 * @since 20 Mar 2023
 */
@Component(service = FiveGHttpResource.class)
@HttpWhiteboardResource(prefix = "/content", pattern = "/*")
@HttpWhiteboardContextSelect("(osgi.http.whiteboard.context.name=upd-5g)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=org.eclipse.sensinact.gateway.northbound.sensorthings.rest.gateway)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.udp.web.mimetype.helper)")
public class FiveGHttpResource {

}
