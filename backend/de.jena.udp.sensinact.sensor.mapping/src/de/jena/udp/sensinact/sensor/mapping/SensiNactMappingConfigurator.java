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
package de.jena.udp.sensinact.sensor.mapping;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.io.IOException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.mapping.ProviderMapping;
import org.gecko.emf.sensinact.model.ProviderMappingRegistry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;

/**
 * Implementation of a configurable mapping service implementation
 * 
 * @author Mark Hoffmann
 * @since 14.08.2025
 */
@Component(name = "SensiNactMappingConfigurator", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class SensiNactMappingConfigurator  {

	@Reference(name = "modelFilter")
	private ResourceSet resourceSet;

	@Reference
	private ProviderMappingRegistry registry;

	private Map<String, ProviderMapping> mappings = new ConcurrentHashMap<>();
	private ServiceRegistration<Condition> mappingCondition;

	@Activate
	public void activate(MappingConfiguration config, BundleContext ctx) throws ConfigurationException {
		if (config.fileType().isEmpty() && config.contentType().isEmpty()) {
			throw new ConfigurationException("fileType",
					"The fileType and contentType fields are empty. At least one needs to be set");
		}
		for(String urlString : config.mappingFiles()) {
			loadMapping(ctx, ctx.getBundle().getEntry(urlString).getFile());
		}
		updateCondition(ctx);
	}

	/**
	 * Loads a single mapping
	 * @param ctx the {@link BundleContext}
	 * @param mappingUrlString the url to load the mapping file
	 */
	private void loadMapping(BundleContext ctx, String mappingUrlString) {
		URL mappingUrl = ctx.getBundle().getEntry(mappingUrlString);
		Resource mappingResource = resourceSet.createResource(URI.createURI(mappingUrl.toString()));
		try {
			mappingResource.load(null);
			ProviderMapping mapping = (ProviderMapping) mappingResource.getContents().get(0);
			String id = mapping.getMid();
			if (mappings.containsKey(id)) {
				ProviderMapping current = mappings.remove(id);
				registry.unregisterModelMapping(current);
			}
			registry.registerModelMapping(mapping);
			mappings.put(id, mapping);
		} catch (IOException e) {
			throw new IllegalStateException("Cannot load mapping file. The mapping file path was invalid", e);
		}
	}

	/**
	 * Updates the condition service that hold the id's of the registered mappings
	 */
	private void updateCondition(BundleContext ctx) {
		Dictionary<String, Object> properties = new Hashtable<>();
		String[] ids = mappings.keySet().toArray(new String[0]);
		properties.put("sensinact.mappings", ids);
		properties.put(Condition.CONDITION_ID, "sensinact.mapping");
		if (isNull(mappingCondition)) {
			mappingCondition = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
		} else {
			mappingCondition.setProperties(properties);
		}
	}

	@Deactivate
	public void deactivate() {
		if (nonNull(mappingCondition)) {
			mappingCondition.unregister();
		}
		mappings.values().forEach(registry::unregisterModelMapping);
		mappings.clear();
	}

}
