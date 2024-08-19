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

package de.jena.publictransport.rest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationBase;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;

import jakarta.ws.rs.core.Application;

/**
 * Holder Application 
 * @author ungei
 * @since 27 Jul 2023
 */
@Component(service = Application.class, property = {"applicationId=pts", "emf=true"})
@JakartarsApplicationBase("/pt")
@JakartarsName("Public Transport Schedule Application")
public class PublicTransportScheduleApplication extends Application {

}
