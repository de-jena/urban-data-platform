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

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
import org.osgi.util.promise.Promise;

/**
 * General SensiNact southbound service that uses EMF Fennec Mapping
 * 
 * @author Mark Hoffmann
 * @since 13.08.2025
 */
public interface SouthboundMappingService {

	/**
	 * Configuration properties can be prefixed with this, to be forwarded
	 */
	public final static String PROP_PREFIX = "sthbnd.mapping.";

	/**
	 * Maps the provided {@link InputStream} and returns a {@link Promise} that
	 * either resolves in case of success or fails on errors
	 * 
	 * @param data the input data to map, must no be <code>null</code>
	 * @return {@link Promise}
	 */
	Promise<EObject> mapFrom(InputStream data);

	/**
	 * Maps the provided {@link byte[]} and returns a {@link Promise} that either
	 * resolves in case of success or fails on errors
	 * 
	 * @param data the input data to map, must no be <code>null</code>
	 * @return {@link Promise}
	 */
	Promise<EObject> mapFrom(byte[] data);

}
