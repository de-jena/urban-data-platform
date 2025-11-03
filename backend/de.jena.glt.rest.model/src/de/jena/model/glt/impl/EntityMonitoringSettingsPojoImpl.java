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

import de.jena.model.glt.EntityMonitoringSettingsPojo;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Monitoring Settings Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityMonitoringSettingsPojoImpl extends MinimalEObjectImpl.Container implements EntityMonitoringSettingsPojo {
	/**
	 * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected Integer systemId = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Integer identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncluded() <em>Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected Boolean included = INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityMonitoringSettingsPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getEntityMonitoringSettingsPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemId(Integer newSystemId) {
		Integer oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(Integer newIdentifier) {
		Integer oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_MONITORING_SETTINGS_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncluded() {
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncluded(Boolean newIncluded) {
		Boolean oldIncluded = included;
		included = newIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_MONITORING_SETTINGS_POJO__INCLUDED, oldIncluded, included));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_MONITORING_SETTINGS_POJO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID:
				return getSystemId();
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER:
				return getIdentifier();
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__NAME:
				return getName();
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__INCLUDED:
				return getIncluded();
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID:
				setSystemId((Integer)newValue);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER:
				setIdentifier((Integer)newValue);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__INCLUDED:
				setIncluded((Boolean)newValue);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__TYPE:
				setType((String)newValue);
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
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__INCLUDED:
				setIncluded(INCLUDED_EDEFAULT);
				return;
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__INCLUDED:
				return INCLUDED_EDEFAULT == null ? included != null : !INCLUDED_EDEFAULT.equals(included);
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (systemId: ");
		result.append(systemId);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(", included: ");
		result.append(included);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EntityMonitoringSettingsPojoImpl
