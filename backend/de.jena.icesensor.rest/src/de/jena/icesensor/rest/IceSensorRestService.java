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

package de.jena.icesensor.rest;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorPackage;

@RequireEMFJson
@Component(service = IceSensorService.class, configurationPid = "IceSensorRestConfig", configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class IceSensorRestService implements IceSensorService {
	private static final Logger logger = System.getLogger(IceSensorRestService.class.getName());

	private static final String ALL_URL = "https://jena.smart-city-factory.com/iceapi/v3/iot/lastdata/all/";

	@Reference(target = "(&(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=" + EMFJs.EMFSJON_CAPABILITY_NAME + "))")
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	IcesensorPackage iceSensorpackage;
	
	private ScheduledExecutorService executor;
	private PushStreamProvider provider;
	private List<SimplePushEventSource<IceSENSOR>> eventSources = new ArrayList<>();

	private String token;

	public @interface IceSensorRestConfig {
		String token();

		int interval() default 1;
	}

	@Activate
	public void activate(IceSensorRestConfig config) {
		token = config.token();
		provider = new PushStreamProvider();
		logger.log(Level.INFO, "Rest client activated.");
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::update, 0, config.interval(), TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		eventSources.forEach(SimplePushEventSource::close);
		executor.shutdown();
		logger.log(Level.INFO, "Rest client stopped.");
	}

	@Override
	public PushStream<IceSENSOR> subcribe() {
		SimplePushEventSource<IceSENSOR> source = provider.buildSimpleEventSource(IceSENSOR.class).build();
		eventSources.add(source);
		return provider.createStream(source);
	}

	private void update() {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = null;
		try {
			resource = resourceSet.createResource(URI.createURI(ALL_URL), "application/json");
			resource.load(getLoadOptions());
			publish(resource.getContents());
			logger.log(Level.INFO, "Sources: {0} sensors: {1}", eventSources.size(), resource.getContents().size());
			resource.getContents().clear();
		} catch (Exception e) {
			resource.getErrors().forEach(x -> logger.log(Level.ERROR,"Error loading resource ", x));
			logger.log(Level.ERROR,"Error loading resource ", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private Map<String, Object> getLoadOptions() {
		Map<String, Object> loadOption = new HashMap<>();
		loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, iceSensorpackage.getIceSENSOR());
		loadOption.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, getHeader());
		return loadOption;
	}

	private Map<String, Object> getHeader() {
		Map<String, Object> headers = new HashMap<>();
		headers.put("Authorization", "Token " + token);
		headers.put("Accept", "application/json");
		return headers;
	}
	
	private void publish(List<EObject> sensors) {
		for (EObject eObject : sensors) {
			Iterator<SimplePushEventSource<IceSENSOR>> it = eventSources.iterator();
			while (it.hasNext()) {
				SimplePushEventSource<IceSENSOR> source = it.next();
				if (source.isConnected()) {
					IceSENSOR sensor = (IceSENSOR) EcoreUtil.copy(eObject);
					source.publish(sensor);
				} else
					it.remove();
			}
		}
	}


}
