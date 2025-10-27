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

package de.jena.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.sensinact.iceprovider.IceSensor;

@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.icesensor.sensinact.mmt)")
@Component(name="IceSensorConnector")
public class IceSensorConnector {
	private static final Logger logger = System.getLogger(IceSensorConnector.class.getName());
	
	@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=icesensor)"))
	private ModelTransformator transformator;
	@Reference
	private IceSensorService service;
	@Reference
	private DataUpdate sensiNact;

	private PushStream<IceSENSOR> subcribtion;

	@Activate
	public void activate() {
		subcribtion = service.subcribe();
		subcribtion.forEachEvent(this::handle);
		logger.log(Level.INFO, "Sensinact IceSensor started.");
	}

	@Deactivate
	private void deactivate() {
		subcribtion.close();
	}

	private long handle(PushEvent<? extends IceSENSOR> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private void onMessage(IceSENSOR iceSensor) {
		try {
			IceSensor senSensor = (IceSensor) transformator.doTransformation(iceSensor);
			Admin admin = senSensor.getAdmin();
			admin.setLocation(createPoint(iceSensor));
			sensiNact.pushUpdate(senSensor);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error update iceSensor data.", e);
		}
	}
	
	private Point createPoint(IceSENSOR sensor) {
		return new Point(sensor.getCoords().getLongitude(),sensor.getCoords().getLatitude());
	}
}