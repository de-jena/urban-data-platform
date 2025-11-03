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

import de.jena.model.glt.EntityPojo;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.EntityPojoImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityPojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.EntityPojoImpl#getSystemId <em>System Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityPojoImpl extends MinimalEObjectImpl.Container implements EntityPojo {
	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getEntityPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_POJO__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_POJO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_POJO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ENTITY_POJO__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ENTITY_POJO__ENTITY:
				return getEntity();
			case GltPackage.ENTITY_POJO__ID:
				return getId();
			case GltPackage.ENTITY_POJO__NAME:
				return getName();
			case GltPackage.ENTITY_POJO__SYSTEM_ID:
				return getSystemId();
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
			case GltPackage.ENTITY_POJO__ENTITY:
				setEntity((String)newValue);
				return;
			case GltPackage.ENTITY_POJO__ID:
				setId((Integer)newValue);
				return;
			case GltPackage.ENTITY_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.ENTITY_POJO__SYSTEM_ID:
				setSystemId((Integer)newValue);
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
			case GltPackage.ENTITY_POJO__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case GltPackage.ENTITY_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.ENTITY_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.ENTITY_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
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
			case GltPackage.ENTITY_POJO__ENTITY:
				return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
			case GltPackage.ENTITY_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.ENTITY_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.ENTITY_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
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
		result.append(" (entity: ");
		result.append(entity);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", systemId: ");
		result.append(systemId);
		result.append(')');
		return result.toString();
	}

} //EntityPojoImpl
