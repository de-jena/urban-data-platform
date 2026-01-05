/**
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
package de.jena.udp.kml.readers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * 
 * @author ilenia
 * @since Jan 5, 2026
 */
@ObjectClassDefinition(
		name = "KML Reader Configuration",
		description = "Configuration for KML reader components"
		)
public @interface KMLReaderConfig {
	
	@AttributeDefinition(
			name = "KML File Path",
			description = "The complete file path of the kml file to be loaded",
			required = true
			)
	String kml_file_path();
	
	@AttributeDefinition(
			name = "KML Folder Name",
			description = "The folder name in the kml file to load the data from. If none is specified, all the placemarkes found in the kml file will be loaded."
			)
	String kml_folder_name();
	
	
	
	
	

}
