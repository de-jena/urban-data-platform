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

/**
 * Mapping configuration
 * 
 * @author Mark Hoffmann
 * @since 13.08.2025
 */
public @interface MappingConfiguration {

	/**
	 * Path to the mapping file
	 * 
	 * @return
	 */
	String mappingFile() default "/mapping/mapping.xmi";

	/**
	 * A registered file-extension
	 * 
	 * @return
	 */
	String fileType() default "";

	/**
	 * The content type identifier
	 * 
	 * @return
	 */
	String contentType() default "";

}
