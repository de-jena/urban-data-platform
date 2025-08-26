/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.jena.model.glt.impl;

import de.jena.model.glt.CylonNetworkPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.ImportStatisticPojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Statistic Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.ImportStatisticPojoImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ImportStatisticPojoImpl#getRemove <em>Remove</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ImportStatisticPojoImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportStatisticPojoImpl extends MinimalEObjectImpl.Container implements ImportStatisticPojo {
	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected EList<CylonNetworkPojo> add;

	/**
	 * The cached value of the '{@link #getRemove() <em>Remove</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemove()
	 * @generated
	 * @ordered
	 */
	protected EList<CylonNetworkPojo> remove;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList<CylonNetworkPojo> update;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportStatisticPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getImportStatisticPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CylonNetworkPojo> getAdd() {
		if (add == null) {
			add = new EObjectContainmentEList<CylonNetworkPojo>(CylonNetworkPojo.class, this, GltPackage.IMPORT_STATISTIC_POJO__ADD);
		}
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CylonNetworkPojo> getRemove() {
		if (remove == null) {
			remove = new EObjectContainmentEList<CylonNetworkPojo>(CylonNetworkPojo.class, this, GltPackage.IMPORT_STATISTIC_POJO__REMOVE);
		}
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CylonNetworkPojo> getUpdate() {
		if (update == null) {
			update = new EObjectContainmentEList<CylonNetworkPojo>(CylonNetworkPojo.class, this, GltPackage.IMPORT_STATISTIC_POJO__UPDATE);
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.IMPORT_STATISTIC_POJO__ADD:
				return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
			case GltPackage.IMPORT_STATISTIC_POJO__REMOVE:
				return ((InternalEList<?>)getRemove()).basicRemove(otherEnd, msgs);
			case GltPackage.IMPORT_STATISTIC_POJO__UPDATE:
				return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.IMPORT_STATISTIC_POJO__ADD:
				return getAdd();
			case GltPackage.IMPORT_STATISTIC_POJO__REMOVE:
				return getRemove();
			case GltPackage.IMPORT_STATISTIC_POJO__UPDATE:
				return getUpdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GltPackage.IMPORT_STATISTIC_POJO__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends CylonNetworkPojo>)newValue);
				return;
			case GltPackage.IMPORT_STATISTIC_POJO__REMOVE:
				getRemove().clear();
				getRemove().addAll((Collection<? extends CylonNetworkPojo>)newValue);
				return;
			case GltPackage.IMPORT_STATISTIC_POJO__UPDATE:
				getUpdate().clear();
				getUpdate().addAll((Collection<? extends CylonNetworkPojo>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GltPackage.IMPORT_STATISTIC_POJO__ADD:
				getAdd().clear();
				return;
			case GltPackage.IMPORT_STATISTIC_POJO__REMOVE:
				getRemove().clear();
				return;
			case GltPackage.IMPORT_STATISTIC_POJO__UPDATE:
				getUpdate().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GltPackage.IMPORT_STATISTIC_POJO__ADD:
				return add != null && !add.isEmpty();
			case GltPackage.IMPORT_STATISTIC_POJO__REMOVE:
				return remove != null && !remove.isEmpty();
			case GltPackage.IMPORT_STATISTIC_POJO__UPDATE:
				return update != null && !update.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportStatisticPojoImpl
