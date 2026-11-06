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
package de.jena.traficam.impl;

import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.TrafiCamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observed Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.ObservedClassImpl#getClassId <em>Class Id</em>}</li>
 *   <li>{@link de.jena.traficam.impl.ObservedClassImpl#getClassificationName <em>Classification Name</em>}</li>
 *   <li>{@link de.jena.traficam.impl.ObservedClassImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservedClassImpl extends MinimalEObjectImpl.Container implements ObservedClass {
	/**
	 * The default value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected String classId = CLASS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationName() <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationName() <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationName()
	 * @generated
	 * @ordered
	 */
	protected String classificationName = CLASSIFICATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafiCamObject> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.OBSERVED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassId() {
		return classId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassId(String newClassId) {
		String oldClassId = classId;
		classId = newClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.OBSERVED_CLASS__CLASS_ID, oldClassId, classId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassificationName() {
		return classificationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationName(String newClassificationName) {
		String oldClassificationName = classificationName;
		classificationName = newClassificationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.OBSERVED_CLASS__CLASSIFICATION_NAME, oldClassificationName, classificationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafiCamObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<TrafiCamObject>(TrafiCamObject.class, this, TrafiCamPackage.OBSERVED_CLASS__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.OBSERVED_CLASS__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case TrafiCamPackage.OBSERVED_CLASS__CLASS_ID:
				return getClassId();
			case TrafiCamPackage.OBSERVED_CLASS__CLASSIFICATION_NAME:
				return getClassificationName();
			case TrafiCamPackage.OBSERVED_CLASS__OBJECTS:
				return getObjects();
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
			case TrafiCamPackage.OBSERVED_CLASS__CLASS_ID:
				setClassId((String)newValue);
				return;
			case TrafiCamPackage.OBSERVED_CLASS__CLASSIFICATION_NAME:
				setClassificationName((String)newValue);
				return;
			case TrafiCamPackage.OBSERVED_CLASS__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends TrafiCamObject>)newValue);
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
			case TrafiCamPackage.OBSERVED_CLASS__CLASS_ID:
				setClassId(CLASS_ID_EDEFAULT);
				return;
			case TrafiCamPackage.OBSERVED_CLASS__CLASSIFICATION_NAME:
				setClassificationName(CLASSIFICATION_NAME_EDEFAULT);
				return;
			case TrafiCamPackage.OBSERVED_CLASS__OBJECTS:
				getObjects().clear();
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
			case TrafiCamPackage.OBSERVED_CLASS__CLASS_ID:
				return CLASS_ID_EDEFAULT == null ? classId != null : !CLASS_ID_EDEFAULT.equals(classId);
			case TrafiCamPackage.OBSERVED_CLASS__CLASSIFICATION_NAME:
				return CLASSIFICATION_NAME_EDEFAULT == null ? classificationName != null : !CLASSIFICATION_NAME_EDEFAULT.equals(classificationName);
			case TrafiCamPackage.OBSERVED_CLASS__OBJECTS:
				return objects != null && !objects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (classId: ");
		result.append(classId);
		result.append(", classificationName: ");
		result.append(classificationName);
		result.append(')');
		return result.toString();
	}

} //ObservedClassImpl
