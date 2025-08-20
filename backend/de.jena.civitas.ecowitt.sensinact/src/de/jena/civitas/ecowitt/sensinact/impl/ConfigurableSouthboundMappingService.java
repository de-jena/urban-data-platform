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
package de.jena.civitas.ecowitt.sensinact.impl;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.command.AbstractSensinactCommand;
import org.eclipse.sensinact.core.command.GatewayThread;
import org.eclipse.sensinact.core.model.SensinactModelManager;
import org.eclipse.sensinact.core.twin.SensinactDigitalTwin;
import org.eclipse.sensinact.mapping.ProviderMapping;
import org.gecko.emf.sensinact.model.ProviderMappingRegistry;
import org.gecko.emf.sensinact.model.ValueMapper;
import org.gecko.emf.sensinact.model.ValueMapperFactory;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;
import org.osgi.util.promise.Promises;

import de.jena.civitas.ecowitt.sensinact.MappingConfiguration;
import de.jena.civitas.ecowitt.sensinact.SouthboundMappingService;

/**
 * Implementation of a configurable mapping service implementation
 * 
 * @author Mark Hoffmann
 * @since 14.08.2025
 */
@Component(name = "SouthBoundMappingService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ConfigurableSouthboundMappingService implements SouthboundMappingService {

	@Reference(name = "modelFilter")
	private ResourceSet resourceSet;
	@Reference
	private GatewayThread gatewayThread;
	@Reference
	private ProviderMappingRegistry registry;

	private final PromiseFactory pf = new PromiseFactory(Executors.newWorkStealingPool());
	private ProviderMapping mapping;
	private MappingConfiguration config;
	private Map<String, Object> loadOptions;

	@Activate
	public void activate(MappingConfiguration config, ComponentContext cctx) throws ConfigurationException {
		if (config.fileType().isEmpty() && config.contentType().isEmpty()) {
			throw new ConfigurationException("fileType",
					"The fileType and contentType fields are empty. At least one needs to be set");
		}
		createLoadOptions(FrameworkUtil.asMap(cctx.getProperties()));
		this.config = config;
		URL mappingUrl = cctx.getBundleContext().getBundle().getEntry(config.mappingFile());
		Resource mappingResource = resourceSet.createResource(URI.createURI(mappingUrl.toString()));
		try {

			mappingResource.load(null);
			mapping = (ProviderMapping) mappingResource.getContents().get(0);
			registry.registerModelMapping(mapping);
		} catch (IOException e) {
			throw new ConfigurationException("mappingFile", "The mapping file path was invalid", e);
		}
	}

	@Deactivate
	public void deactivate() {
		if (nonNull(mapping)) {
			registry.unregisterModelMapping(mapping);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.sensinact.southbound.emf.mapping.SouthboundMappingService#mapFrom
	 * (java.io.InputStream)
	 */
	@Override
	public Promise<EObject> mapFrom(InputStream data) {
		try {
			final EObject dataEObject = loadData(data);
			gatewayThread.execute(new AbstractSensinactCommand<Boolean>() {
				@Override
				protected Promise<Boolean> call(SensinactDigitalTwin twin, SensinactModelManager modelManager,
						PromiseFactory pf) {
					try {
						ValueMapper mapper = ValueMapperFactory.createValueMapper(twin, mapping);
						mapper.mapInstance(dataEObject);
						return pf.resolved(Boolean.TRUE);
					} catch (Exception e) {
						return pf.failed(e);
					}
				}
			}).getValue();
			return pf.resolved(dataEObject);
		} catch (Exception e) {
			return pf.failed(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.sensinact.southbound.emf.mapping.SouthboundMappingService#mapFrom
	 * (byte[])
	 */
	@Override
	public Promise<EObject> mapFrom(byte[] data) {
		if (isNull(data)) {
			return Promises.failed(new NullPointerException("data parameter must not be null"));
		}
		if (data.length == 0) {
			return Promises.resolved(null);
		}
		return mapFrom(new ByteArrayInputStream(data));
	}

	private Resource createResource() {
		Resource resource;
		String path = UUID.randomUUID().toString();
		if (!config.fileType().isEmpty()) {
			path += "." + config.fileType();
			resource = resourceSet.createResource(URI.createURI(path));
		} else {
			resource = resourceSet.createResource(URI.createURI(path), config.contentType());
		}
		requireNonNull(resource, String.format("Error creating resource for path: '%s'", path));
		return resource;
	}

	/**
	 * Create the load options, when using the right prefix
	 * 
	 * @param properties the service properties
	 */
	private void createLoadOptions(Map<String, Object> properties) {
		if (isNull(properties)) {
			return;
		}
		loadOptions = properties.entrySet().stream().filter(e -> e.getKey().startsWith(PROP_PREFIX))
				.collect(Collectors.toMap(e -> e.getKey().replace(PROP_PREFIX, ""), Map.Entry::getValue));
	}

	/**
	 * Loads the data from the input stream
	 * 
	 * @param data the input stream to load from
	 * @return an {@link EObject} or throws an exception
	 * @throws IOException
	 */
	private EObject loadData(InputStream data) throws IOException {
		requireNonNull(data, "The data parameter must not be null");
		Resource resource = createResource();
		resource.load(data, loadOptions);
		if (resource.getContents().isEmpty()) {
			throw new IllegalStateException("There has no content been loaded fromn the resource");
		}
		EObject content = resource.getContents().get(0);
		return content;
	}

}
