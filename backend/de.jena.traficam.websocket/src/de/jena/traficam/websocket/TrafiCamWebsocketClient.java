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

package de.jena.traficam.websocket;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import de.jena.traficam.api.TrafiCamConfig;

/**
 * Copyright (c) 2012 - 2022 Data In Motion and others. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Data In Motion - initial API and implementation
 */

//configure using reader config in ConfigurationUpdater#configureClient
@Component(name = "TrafiCamWSC", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = TrafiCamConfig.class)
public class TrafiCamWebsocketClient {
	private static final Logger logger = System.getLogger(TrafiCamWebsocketClient.class.getName());

	private WebSocketClient client;
	private TrafiCamConfig config;

	// configure using sender config in ConfigurationUpdater#configureClient using
	// .target=(id=something))
	@Reference
	private TrafiCamReader reader;

	@Activate
	public void activate(TrafiCamConfig config) throws Exception {
		this.config = config;
		client = new WebSocketClient();
		client.start();
		connect();
	}

	@Modified
	public void modify(TrafiCamConfig config) throws Exception {
		deactivate();
		activate(config);
	}

	@Deactivate
	public void deactivate() throws Exception {
		logger.log(Level.INFO, "Disconnect websocket");
		client.stop();
	}

	void onError(Throwable reason) {
		if (client.isStarted() && reason.getMessage().contains("Not valid UTF8!")) {
			try {
				connect();
			} catch (URISyntaxException | IOException e) {
				logger.log(Level.ERROR, "Error while connecting websocket for camera {0} to {1}.", config.id(),
						config.address(), e);
			}
		}
	}

	private void connect() throws URISyntaxException, IOException {
		String url = "ws://" + config.address() + "/api/subscriptions";
		URI dest = new URI(url);
		TrafiCamWebsocket socket = new TrafiCamWebsocket(reader, this::onError);
		ClientUpgradeRequest request = new ClientUpgradeRequest();
		logger.log(Level.INFO, "Connect websocket for camera {0} to {1}.", config.id(), url);
		client.connect(socket, dest, request);
	}

}
