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
package de.jena.udp.dashboard.edit.web.app;

import jakarta.ws.rs.core.Application;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationBase;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsWhiteboardTarget;

/**
 * 
 * @author grune
 * @since Oct 1, 2024
 */
@Component(name = "DashboardRestApplication", service = Application.class, property = {"applicationId=dashboardRest"})
@JakartarsApplicationBase("/dashboard")
@JakartarsWhiteboardTarget("(jersey.jakartars.whiteboard.name=udprest)")
@JakartarsName("UDP Dashboard API")
public class DashboardRestApplication extends Application {

}
