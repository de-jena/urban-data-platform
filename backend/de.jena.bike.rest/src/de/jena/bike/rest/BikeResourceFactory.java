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
package de.jena.bike.rest;
/*
 * 		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, CodecPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "codec");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
 */
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.fennec.codec.v2.config.CodecConfiguration;
import org.eclipse.fennec.codec.v2.resource.CodecResource;
import org.eclipse.fennec.codec.v2.util.MetadataServiceFactory;
import org.eclipse.fennec.model.metadata.api.MetadataService;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.bike.BikePackage;

@Component(service = Resource.Factory.class,property = {EMFNamespaces.EMF_CONFIGURATOR_NAME+"=newCodec",EMFNamespaces.EMF_MODEL_CONTENT_TYPE+"=application/json2"}, immediate = true)
public class BikeResourceFactory extends ResourceFactoryImpl {
	private MetadataService metadataService;
	@Reference
	private BikePackage bikePackage;

	/**
	 * Creates a new instance.
	 */
	public BikeResourceFactory() {
		metadataService = MetadataServiceFactory.create();
		metadataService.registerPackage(bikePackage);
	}

	@Override
	public Resource createResource(URI uri) {
		CodecConfiguration config = CodecConfiguration.builder().build();
		return new CodecResource(uri, metadataService, config, null);
	}
}