/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
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
package de.jena.udp.sensinact.history.rehydration;

import java.time.Instant;

/**
 * The last value a resource had in the history database.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
public record HistoryRecord(String modelPackageUri, String model, String provider, String service, String resource,
		Instant timestamp, Object value) {
}
