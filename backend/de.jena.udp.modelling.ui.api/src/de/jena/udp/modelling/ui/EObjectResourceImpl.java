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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.upd.modelling.ui.api.modellingApi.EObjectResource;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@RequireEMFJson
@Component(name = EObjectResourceImpl.COMPONENT_NAME, service = EObjectResource.class, scope = ServiceScope.PROTOTYPE)
@JakartarsResource
@JakartarsApplicationSelect("(applicationId=modelling-api)")
@Path("/eobject")
public class EObjectResourceImpl implements EObjectResource {
	private static final Logger LOGGER = System.getLogger(EObjectResourceImpl.class.getName());

	public static final String COMPONENT_NAME = "EObjectResource";

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ModelRepository repo;

	// http://localhost:8081/udp/rest/modelling-ui/eobject/hello
	@GET
	@Path("hello")
	public String hello() {
		return "hello";
	}

	@GET
	@Path("load/{id}")
	@Operation(description = "Loads and returns an EObject for an specified eClassUri and id.")
	@Override
	public EObject load(@QueryParam("eClassUri") String eClassUri, @PathParam("id") String id)
			throws WebApplicationException {
		EClassifier eClassifier = getEClassifier(eClassUri);
		if (eClassifier instanceof EClass eClass) {
			EObject eObject = repo.getEObject(eClass, id);
			if (eObject == null) {
				LOGGER.log(Level.WARNING, "No eObject found for eClassUri {0} and id {1}.", eClassUri, id);
			}
			return eObject;
		}
		LOGGER.log(Level.WARNING, "No eClass found for eClassUri {0}.", eClassUri);
		throw new WebApplicationException("String " + eClassUri + " does not represent a known EClassURI", 400);
	}

	private EClassifier getEClassifier(String eClassUri) {
		return repo.getEClassifier(eClassUri);
	}

	@GET
	@Path("loadall")
	@Operation(description = "Loads and returns a list of EObject for an specified eClassUri.")
	@Override
	public EList<EObject> loadAll(@QueryParam("eClassUri") String eClassUri,
			@QueryParam("projection") EList<String> projections) throws WebApplicationException {
		return repo.loadAll(eClassUri, projections);
	}

	@POST
	@Path("save")
	@Operation(description = "Saves an EObject.")
	@Override
	public EObject save(@QueryParam("eObject") EObject eObject) {
		repo.save(eObject);
		return eObject;
	}

	@POST
	@Path("saveall")
	@Operation(description = "Saves a list of EObjects.")
	@Override
	public EList<EObject> saveAll(@QueryParam("eObjects") EList<EObject> eObjects) {
		for (EObject eObject : eObjects) {
			repo.save(eObject);
		}
		return eObjects;
	}

	@DELETE
	@Path("delete/{id}")
	@Operation(description = "Deletes an EObject with an specified eClassUri and id.")
	@Override
	public Response delete(@QueryParam("eClassUri") String eClassUri, @PathParam("id") String id)
			throws WebApplicationException {
		EClassifier eClassifier = getEClassifier(eClassUri);
		if (eClassifier instanceof EClass eClass) {
			EObject eObject = repo.getEObject(eClass, id);
			if (eObject == null) {
				LOGGER.log(Level.WARNING, "No eObject for deletion found for eClassUri {0} and id {1}.", eClassUri, id);
				return Response.noContent().build();
			}
			repo.delete(eObject);
			return Response.ok().build();
		}
		LOGGER.log(Level.WARNING, "No eClass found for eClassUri {0}.", eClassUri);
		return Response.status(400, "String " + eClassUri + " does not represent a known EClassURI").build();
	}

	@GET
	@Path("exists/{id}")
	@Operation(description = "Check existens of an EObject with an specified eClassUri and id.")
	@Override
	public Response exists(@QueryParam("eClassUri") String eClassUri, @PathParam("id") String id)
			throws WebApplicationException {
		EClassifier eClassifier = getEClassifier(eClassUri);
		if (eClassifier instanceof EClass eClass) {
			EObject eObject = repo.getEObject(eClass, id);
			if (eObject == null) {
				LOGGER.log(Level.WARNING, "No eObject found for eClassUri {0} and id {1}.", eClassUri, id);
				return Response.noContent().build();
			}
			return Response.ok().build();
		}
		return Response.status(400, "String " + eClassUri + " does not represent a known EClassURI").build();
	}

}
