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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * 
 * @author grune
 * @since Aug 30, 2024
 */
@Component
@RequireMongoEMFRepository
public class ModelRepositoryImpl implements ModelRepository {
	private static final Logger LOGGER = System.getLogger(ModelRepositoryImpl.class.getName());

//	@Reference(target = "(target=modelling)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private EMFRepository repo;
	
	@Override
	public EClassifier getEClassifier(String eClassifierUri) {
		URI uri = URI.createURI(eClassifierUri);
		URI trimedUri = uri.trimFragment();
		EPackage ePackage = repo.getEObject(EcorePackage.Literals.EPACKAGE, trimedUri.toString());
		Resource resource = ePackage.eResource();
		return (EClassifier) resource.getEObject(uri.fragment());
	}

	@Override
	public EList<EObject> loadAll(String eClassUri, List<String> projections) {
		EClassifier eClassifier = getEClassifier(eClassUri);
		if (eClassifier instanceof EClass eClass) {
			IQueryBuilder query = ((QueryRepository) repo).createQueryBuilder();
			
			for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures()) {
				if(projections.contains(structuralFeature.getName())) {
					query.projectionPath(structuralFeature);
				}
			}
			
			List<EObject> eObject = ((QueryRepository) repo).getEObjectsByQuery(eClass, query.build());
			if (eObject.isEmpty()) {
				return ECollections.emptyEList();
			}
			return ECollections.asEList(eObject);
		}
		return ECollections.emptyEList();
	}

	@Override
	public EObject getEObject(EClass eClass, String id) {
		return repo.getEObject(eClass, id);
	}

	@Override
	public void save(EObject eObject) {
		repo.save(eObject);
	}

	@Override
	public void delete(EObject eObject) {
		repo.delete(eObject);
	}

	@Override
	public EPackage loadEPackage(String ePackageUri) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.upd.modelling.ui.ModelRepository#loadAllEPackages()
	 */
	@Override
	public List<String> loadAllEPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.upd.modelling.ui.ModelRepository#saveEPackage(java.lang.String, org.eclipse.emf.ecore.EPackage)
	 */
	@Override
	public EPackage saveEPackage(EPackage ePackage) {
		URI uri = repo.createUri(ePackage, Collections.singletonMap("USE_ID_ATTRIBUTE_AS_PRIMARY_KEY", Boolean.FALSE));
		URI uriId = uri.appendSegment(ePackage.getNsURI());
		LOGGER.log(Level.INFO, "Save ePackage" + uriId);
		repo.save(ePackage, uriId, Collections.emptyMap());
		return ePackage;
		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.upd.modelling.ui.ModelRepository#deleteEPackage(java.lang.String)
	 */
	@Override
	public EPackage deleteEPackage(String ePackageUri) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.upd.modelling.ui.ModelRepository#existEPackage(java.lang.String)
	 */
	@Override
	public boolean existEPackage(String ePackageUri) {
		// TODO Auto-generated method stub
		return false;
	}

}
