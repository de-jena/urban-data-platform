/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.udp.dashboard.viewer.web.app;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

/**
 * 
 * @author Juergen Albert
 * @since 1 Oct 2024
 */
@Component(name = "DashboardViewerConfigurator", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class DashboardViewerConfigurator {

	private static final Logger LOGGER = System.getLogger(DashboardViewerConfigurator.class.getName());
	private static final String PATH_SEPARATOR = "/";

	public static @interface Config {
		String path();

		String configFile();
	}

	@Reference
	ConfigurationAdmin configAdmin;
	private List<Configuration> configs = new ArrayList<>();

	@Activate
	public void activate(Config config) {
		try {
			String contextName = "dasboardviewer_" + config.path();
			Hashtable<String, Object> props = new Hashtable<>();
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT,
					"(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=" + contextName + ")");
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME, contextName);
			String path = config.path().startsWith(PATH_SEPARATOR) ? config.path() : PATH_SEPARATOR + config.path();
			path = path.endsWith(PATH_SEPARATOR) ? path.substring(0, path.length() - 2) : path;
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH, "/html" + path);
			config(props, ContentTypeServletContextHelper.COMPONENT_NAME);

			props = new Hashtable<>();
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT,
					"(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=" + contextName + ")");
			config(props, DashboardViewerHttpResource.COMPONENT_NAME);

			props = new Hashtable<>();
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT,
					"(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=" + contextName + ")");
			config(props, DashboardViewerIndexFilter.COMPONENT_NAME);

			LOGGER.log(Level.DEBUG, "Registering dashboard {0}", config.path());
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, "Error registering dashboard {0}", config.path(), e);
		}
	}

	private void config(Hashtable<String, Object> props, String name) throws IOException {
		Configuration configuration = configAdmin.createFactoryConfiguration(name, "?");
		configs.add(configuration);
		configuration.updateIfDifferent(props);
	}

	@Deactivate
	public void deactivate() {
		for (Configuration config : configs) {
			try {
				config.delete();
			} catch (IOException e) {
				LOGGER.log(Level.ERROR, "Error deleting config {0}", config.getPid(), e);
			}
		}
	}
}
