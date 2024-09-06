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
package de.jena.udp.modelling.ui;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.upd.modelling.ui.api.modellingApi.EPackageResource;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@RequireEMFJson
@JakartarsResource
@Component(name = EPackageResourceImpl.COMPONENT_NAME, service = EPackageResource.class, scope = ServiceScope.PROTOTYPE)
@JakartarsApplicationSelect("(applicationId=modelling-api)")
@Path("/epackage")
public class EPackageResourceImpl implements EPackageResource {
	private static final Logger LOGGER = System.getLogger(EPackageResourceImpl.class.getName());

	public static final String COMPONENT_NAME = "EPackageResource";
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ModelRepository repo;

	@GET
	@Path("hello")
	public String hello() {
		return "hello";
	}

	@GET
	@Path("load/{ePackageUri}")
	@Operation(description = "Loads and returns an EPackage for an specified ePackageUri.")
	@Override
	public EPackage load(@PathParam("ePackageUri") String ePackageUri) throws WebApplicationException {
		LOGGER.log(Level.DEBUG, "Load package {0}", ePackageUri);
		
		return repo.loadEPackage(ePackageUri);
	}

	@GET
	@Path("loadall/{ePackageUri}")
	@Operation(description = "Loads and returns all EPackage for an specified ePackageUri.")
	@Override
	public EList<String> loadAll() throws WebApplicationException {
		LOGGER.log(Level.DEBUG, "Load all EPackages.");
		return ECollections.toEList(repo.loadAllEPackages());
	}

	@POST
	@Path("save/")
	@Operation(description = "Saves an EObject.")
	@Override
	public Response save(EPackage ePackage) {
		LOGGER.log(Level.DEBUG, "Save ePackage.{0}", ePackage.getNsURI());
		EPackage previous = repo.saveEPackage(ePackage);
		return Response.ok(previous).build();
	}

	@POST
	@Path("saveall/")
	@Operation(description = "Saves a list of Epackages.")
	@Override
	public Response saveAll(EList<EPackage> ePackages) {
		LOGGER.log(Level.DEBUG, "Save {0} ePackages.", ePackages.size());
		List<EPackage> old = new ArrayList<>();
		for (EPackage ePackage : ePackages) {	
			EPackage previous = repo.saveEPackage(ePackage);
			if(previous != null) {
				old.add(previous);
			}
		}
		return Response.ok(ECollections.asEList(old)).build();
	}
	
	@DELETE
	@Path("delete/{ePackageUri}")
	@Operation(description = "Deletes an ePackage with an specified ePackageUri.")
	@Override
	public Response delete(String ePackageUri) throws WebApplicationException {
		LOGGER.log(Level.DEBUG, "Delete ePackage.{0}", ePackageUri);
		EPackage previous = repo.deleteEPackage(ePackageUri);
		return Response.ok(previous).build();
	}

	@GET
	@Path("exists/{ePackageUri}")
	@Operation(description = "Check existens of an EObject with an specified eClassUri and id.")
	@Override
	public Response exists(String ePackageUri) throws WebApplicationException {
		boolean exists = repo.existEPackage(ePackageUri);
		return Response.accepted(exists).build();
	}

}
