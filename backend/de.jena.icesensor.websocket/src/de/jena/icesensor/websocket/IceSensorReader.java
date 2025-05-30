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

package de.jena.icesensor.websocket;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorPackage;
import de.jena.model.icesensor.SensorMessage;

@Component(service = { IceSensorService.class, IceSensorReader.class }, name = "IceSensorServiceWebsocket")
@RequireEMFJson
public class IceSensorReader implements IceSensorService {

	private PushStreamProvider provider;
	private List<SimplePushEventSource<IceSENSOR>> eventSources = new ArrayList<>();
	@Reference(target = "(&(emf.resource.configurator.name=" + EMFJs.EMFSJON_CAPABILITY_NAME + "))")
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	IcesensorPackage iceSensorepackage;

	@Activate
	public void activate() {
		provider = new PushStreamProvider();
	}

	@Deactivate
	public void deactivate() {
		eventSources.forEach(SimplePushEventSource::close);
	}

	@Override
	public PushStream<IceSENSOR> subcribe() {
		SimplePushEventSource<IceSENSOR> source = provider.buildSimpleEventSource(IceSENSOR.class).build();
		eventSources.add(source);
		return provider.createStream(source);
	}

	public void read(String msg) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI("dummy"), "application/json");
		try {
			Map<String, Object> loadOption = new HashMap<>();
			loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, iceSensorepackage.getSensorMessage());
			InputStream stream = new ByteArrayInputStream(msg.getBytes(StandardCharsets.UTF_8));

			resource.load(stream, loadOption);
			ArrayList<EObject> sensors = new ArrayList<>(resource.getContents());
			resource.getContents().clear();
			publish(sensors);
		} catch (Exception e) {
			resource.getErrors().forEach(diag -> System.out.println(diag.getMessage()));
			e.printStackTrace();
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	private void publish(List<EObject> sensors) {
		for (EObject sensor : sensors) {
			Iterator<SimplePushEventSource<IceSENSOR>> it = eventSources.iterator();
			while (it.hasNext()) {
				SimplePushEventSource<IceSENSOR> source = it.next();
				if (source.isConnected()) {
					SensorMessage msg = (SensorMessage) EcoreUtil.copy(sensor);
//					source.publish(msg.getData());
				} else
					it.remove();
			}
		}
	}
}
