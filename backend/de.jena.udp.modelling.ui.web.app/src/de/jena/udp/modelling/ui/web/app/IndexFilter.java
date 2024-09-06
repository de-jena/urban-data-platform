/*
* Copyright (c) 2020 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */
package de.jena.udp.modelling.ui.web.app;

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
@HttpWhiteboardContextSelect("(osgi.http.whiteboard.context.name=upd-modelling)")
@Component(name = IndexFilter.COMPONENT_NAME, service = Filter.class, scope = ServiceScope.PROTOTYPE)
public class IndexFilter implements Filter {

	public static final String COMPONENT_NAME = "IndexFilter";

	/**
	 * Creates a new instance.
	 */
	@Activate
	public IndexFilter(Map<String, Object> props) {
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
