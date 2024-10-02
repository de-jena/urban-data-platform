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

package de.jena.udp.dashboard.viewer.web.app;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * @author Juergen Albert
 * @since 12 May 2023
 */
@Component(name = SettingsServlet.COMPONENT_NAME, service = Servlet.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
@HttpWhiteboardServletPattern("/config/settings.js")
public class SettingsServlet extends HttpServlet {
	private static final Logger LOGGER = System.getLogger(SettingsServlet.class.getName());

	public static final String COMPONENT_NAME = "SettingsServlet";

	private static final long serialVersionUID = 8664175649706859137L;
	private static final String CONFIG_JSON = """
			(function(window) {
			    window.__env = window.__env || {};
			    window.__env.settings = {
			        "initWithConfigurationURI": {
			            enabled:true,
			            url:"configs/dashboard.json"
			        },
			        "viewmodeByDefault":true,
			    };

			})(this);
						""";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		resp.setContentType("application/javascript");
		resp.setStatus(200);
		try {
			resp.getOutputStream().print(CONFIG_JSON);
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, () -> "Error writing settings.", e);
		}
	}

}
