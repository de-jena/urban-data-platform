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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * Dummy
 */
public interface ModelRepository {
	EClassifier getEClassifier(String eClassifierUri) ;

	/**
	 * 
	 */
	EList<EObject> loadAll(String eClassUri, List<String> projections);

	/**
	 * @param eClass
	 * @param id
	 * @return
	 */
	EObject getEObject(EClass eClass, String id);

	/**
	 * @param eObject
	 */
	void save(EObject eObject);

	/**
	 * @param eObject
	 */
	void delete(EObject eObject);

	/**
	 * @param ePackageUri
	 * @return
	 */
	EPackage loadEPackage(String ePackageUri);

	/**
	 * @return
	 */
	List<String> loadAllEPackages();

	/**
	 * @param ePackage
	 * @return
	 */
	EPackage saveEPackage(EPackage ePackage);

	/**
	 * @param ePackageUri
	 * @return
	 */
	EPackage deleteEPackage(String ePackageUri);

	/**
	 * @param ePackageUri
	 * @return
	 */
	boolean existEPackage(String ePackageUri);

}
