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

package de.jena.chirpstack.sensinact.configuration;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;

import de.jena.chirpstack.sensinact.ChirpstackDeviceFactoryHandler;

@Component(configurationPid = "ChirpstackConfig")
public class ChirpstackConfigurator {
	private static final Logger logger = System.getLogger(ChirpstackConfigurator.class.getName());

	private static final String MQTT_PID = "sensinact.southbound.mqtt";

	EClass providerEClass = ProviderPackage.eINSTANCE.getProvider();
	EClass serviceEClass = ProviderPackage.eINSTANCE.getService();

	@interface ChirpstackConfig {
		@AttributeDefinition(name = "id", description = "Identifier to bind mqtt gateway to device factory")
		String id();

		@AttributeDefinition(name = "protocol", description = "Network protocol to communicate with the chirpstack gateway")
		String protocol() default "ssl";

		@AttributeDefinition(name = "host", description = "Hostname of the chirpstack gateway")
		String host();

		@AttributeDefinition(name = "port", description = "Network port of the chirpstack gateway")
		int port();

		@AttributeDefinition(name = "topics", description = "mqtt topics of the chirpstack applications")
		String[] topics();

		@AttributeDefinition(name = "certPath", description = "Absolute path to the file containing the client certificate (.pem)")
		String certPath();

		@AttributeDefinition(name = "certKey", description = "Absolute path to the file containing the client key (.key)")
		String certKey();

		@AttributeDefinition(name = "caPath", description = "Absolute path to the file containing the ca certificate (.pem)")
		String caPath();

		@AttributeDefinition(name = "caChainPath", description = "List of absolute paths to the files containing the ca cert chain")
		String[] caChainPath();
	}

	@Reference
	private ConfigurationAdmin configAdmin;

	@Activate
	public void activate(ChirpstackConfig config) {
		String id = config.id();
		logger.log(Level.DEBUG, "Start loading chirpstack configuration {0}", id);
		try {
			init(config, id);
		} catch (Exception e) {
			logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
		}
	}

	@Modified
	public void modify(ChirpstackConfig config) {
		String id = config.id();
		logger.log(Level.DEBUG, "Update chirpstack configuration {0}", id);
		try {
			init(config, id);
		} catch (Exception e) {
			logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
		}
	}

	private void init(ChirpstackConfig config, String id) throws IOException {
		configureGateway(id, config);
		configureDeviceFactory(id);
	}

	private void configureDeviceFactory(String id) throws IOException {
		logger.log(Level.INFO, () -> "create chirpstack device config for " + id);
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("mqtt.handler.id", id);

		Configuration config = configAdmin.getFactoryConfiguration(ChirpstackDeviceFactoryHandler.PID, id, "?");
		logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}

	void configureGateway(String name, ChirpstackConfig csConfig) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(MQTT_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("id", name);
		props.put("protocol", csConfig.protocol());
		props.put("host", csConfig.host());
		props.put("port", csConfig.port());
		props.put("topics", csConfig.topics());
		props.put("auth.clientcert.path", csConfig.certPath());
		props.put("auth.clientcert.key", csConfig.certKey());
		props.put("auth.clientcert.key.algorithm", "EC");
		props.put("auth.clientcert.ca.path", csConfig.caPath());
		props.put("auth.trusted.certs", csConfig.caChainPath());
		props.put("auth.allow.expired", true);

		logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}

}