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
package de.jena.sensinact.rest.log;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class LoggingBridge {
	@Activate
	public void activate() {
		java.util.logging.LogManager.getLogManager().reset();
		org.slf4j.bridge.SLF4JBridgeHandler.removeHandlersForRootLogger();
		org.slf4j.bridge.SLF4JBridgeHandler.install();
		System.out.println("Logging bridge install (JUL → SLF4J)");
	}

	@Deactivate
	public void deactivate() {
		org.slf4j.bridge.SLF4JBridgeHandler.uninstall();
		System.out.println("Logging bridge uninstall (JUL → SLF4J)");
	}
}
