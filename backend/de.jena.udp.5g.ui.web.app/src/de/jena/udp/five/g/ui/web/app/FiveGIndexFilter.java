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
package de.jena.udp.five.g.ui.web.app;

import java.io.IOException;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContextSelect;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardFilterRegex;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@HttpWhiteboardFilterRegex({ "/?", "/" })
@HttpWhiteboardContextSelect("(osgi.http.whiteboard.context.name=upd-5g)")
@Component(name = FiveGIndexFilter.COMPONENT_NAME, service = Filter.class, scope = ServiceScope.PROTOTYPE)
public class FiveGIndexFilter implements Filter {

	public static final String COMPONENT_NAME = "IndexFilter";

	/**
	 * Creates a new instance.
	 */
	@Activate
	public FiveGIndexFilter(Map<String, Object> props) {
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.err.println("======================= FILTER CALLED");
		
		if (request instanceof HttpServletRequest) {
			((HttpServletResponse) response).sendRedirect("index.html");
		}
	}

	public void destroy() {
	}
}
