/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.DeviceBuildingPojo;
import de.jena.model.glt.DevicesCollectionPojo;
import de.jena.model.glt.GltPackage;

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
 * An implementation of the model object '<em><b>Devices Collection Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.DevicesCollectionPojoImpl#getBuildings <em>Buildings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevicesCollectionPojoImpl extends MinimalEObjectImpl.Container implements DevicesCollectionPojo {
	/**
	 * The cached value of the '{@link #getBuildings() <em>Buildings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildings()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceBuildingPojo> buildings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicesCollectionPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getDevicesCollectionPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceBuildingPojo> getBuildings() {
		if (buildings == null) {
			buildings = new EObjectContainmentEList<DeviceBuildingPojo>(DeviceBuildingPojo.class, this, GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS);
		}
		return buildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS:
				return ((InternalEList<?>)getBuildings()).basicRemove(otherEnd, msgs);
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
			case GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS:
				return getBuildings();
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
			case GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS:
				getBuildings().clear();
				getBuildings().addAll((Collection<? extends DeviceBuildingPojo>)newValue);
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
			case GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS:
				getBuildings().clear();
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
			case GltPackage.DEVICES_COLLECTION_POJO__BUILDINGS:
				return buildings != null && !buildings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevicesCollectionPojoImpl
