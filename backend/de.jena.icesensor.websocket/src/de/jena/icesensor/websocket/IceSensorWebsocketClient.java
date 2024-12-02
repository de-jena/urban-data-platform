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

import java.net.URI;

import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Copyright (c) 2012 - 2022 Data In Motion and others. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Data In Motion - initial API and implementation
 */

@Component(name = "IceSensorWebsocketClient",configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IceSensorWebsocketClient {

	private WebSocketClient client;
	@Reference
	private IceSensorReader reader;

	public @interface IceSensorWebsocketConfig {
		String token() default "";
	}

	@Activate
	public void activate(IceSensorWebsocketConfig config) throws Exception {
		client = new WebSocketClient();
		URI dest = new URI("wss://jena.smart-city-factory.com/ws/sensor/?token=" + config.token());

		client.start();
		IceSensorWebsocket socket = new IceSensorWebsocket(reader);
		ClientUpgradeRequest request = new ClientUpgradeRequest();
		request.setHeader("Host", "jena.smart-city-factory.com");
		client.connect(socket, dest, request);
	}

	@Deactivate
	public void deactivate() throws Exception {
		client.stop();
	}

}
