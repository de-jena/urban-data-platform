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

package de.jena.sensinact.publictransport;

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
public @interface MqttConfig {
	
	String id();
	String host();
	String username();
	String password();
	String topic();

}
