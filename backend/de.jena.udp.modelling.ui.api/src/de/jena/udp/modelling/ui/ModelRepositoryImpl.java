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
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

@Component(scope = ServiceScope.PROTOTYPE)
@RequireMongoEMFRepository
public class ModelRepositoryImpl implements ModelRepository {

	private static final Logger LOGGER = System.getLogger(ModelRepositoryImpl.class.getName());

	private static final Map<String, EAttribute> OPTIONS = Collections.singletonMap("OVERWRITE_PRIMARY_KEY_EATTRIBUTE", EcorePackage.Literals.EPACKAGE__NS_URI);

	@Reference(target = "(repo_id=de.jena.modelling)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private QueryRepository repo;
	
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
			IQueryBuilder query = repo.createQueryBuilder();
			
			for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures()) {
				if(projections.contains(structuralFeature.getName())) {
					query.projectionPath(structuralFeature);
				}
			}
			
			List<EObject> eObject = repo.getEObjectsByQuery(eClass, query.build());
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
		EPackage ePackage = repo.getResourceSet().getPackageRegistry().getEPackage(ePackageUri);
		if(ePackage != null) {
			return EcoreUtil.copy(ePackage);
		}
		return repo.getEObject(EcorePackage.Literals.EPACKAGE, ePackageUri, OPTIONS);
	}

	@Override
	public List<String> loadAllEPackages() {
		List<EPackage> ePackages = repo.getAllEObjects(EcorePackage.Literals.EPACKAGE, OPTIONS);
		return ePackages.stream().map(EPackage::getNsURI).toList();
	}

	@Override
	public EPackage saveEPackage(EPackage ePackage) {
		LOGGER.log(Level.INFO, "Save ePackage " + ePackage.getNsURI());
		EPackage ep = EcoreUtil.copy(ePackage);
		repo.save(ep, OPTIONS);
		repo.detach(ep);
		return ep;
		
	}

	@Override
	public EPackage deleteEPackage(String ePackageUri) {
		EPackage ePackage = repo.getEObject(EcorePackage.Literals.EPACKAGE, ePackageUri, OPTIONS);
		if(ePackage == null) {
			return null;
		}
		repo.delete(ePackage);
		repo.detach(ePackage);
		return ePackage;
	}

	@Override
	public boolean existEPackage(String ePackageUri) {
		return null != loadEPackage(ePackageUri);
	}

}
