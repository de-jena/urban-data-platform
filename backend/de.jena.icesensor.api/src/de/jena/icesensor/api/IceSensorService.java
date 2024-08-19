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

package de.jena.icesensor.api;

import org.osgi.util.pushstream.PushStream;

import de.jena.model.icesensor.SensorData;

/**
 * 
 * @author grune
 * @since Aug 16, 2022
 */
public interface IceSensorService {

	PushStream<SensorData> subcribe();

}
