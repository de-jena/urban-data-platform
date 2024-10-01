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
package de.jena.udp.dashboard.edit.web.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * @author grune
 * @since Oct 1, 2024
 */
@Component(service = SaveResource.class, scope = ServiceScope.PROTOTYPE)
@JakartarsResource
@JakartarsApplicationSelect("(applicationId=dashboardRest)")
@Path("/")
public class SaveResource {

	@Reference
	private ConfigurationAdmin configAdmin;

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello";
	}

	@POST
	@Path("/release/{path}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response release(@PathParam("path") String path, InputStream stream) throws IOException {
		byte[] bytes = stream.readAllBytes();
		String dir = System.getProperty("user.dir", "/tmp");
		File p = new File(dir + "/dashboards/");
		p.mkdirs();
		File file = new File(p, path + ".json");
		try (FileOutputStream os = new FileOutputStream(file)) {
			os.write(bytes);
		}
		Hashtable<String, Object> props = new Hashtable<>();
		props.put("path", path);
		props.put("configFile", file.getAbsolutePath());
		Configuration configuration = configAdmin.getFactoryConfiguration("DashboardViewerConfigurator", path, "?");
		configuration.updateIfDifferent(props);

		return Response.ok().build();
	}
}
