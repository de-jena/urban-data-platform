/*
 */
package de.jena.chirpstack.model.dummymoisture.impl;

import de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage;
import de.jena.chirpstack.model.dummymoisture.MoistureAdmin;
import de.jena.chirpstack.model.dummymoisture.SoilType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.AdminImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moisture Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureAdminImpl#getSoilType <em>Soil Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoistureAdminImpl extends AdminImpl implements MoistureAdmin {
	/**
	 * The default value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected static final SoilType SOIL_TYPE_EDEFAULT = SoilType.SAND;

	/**
	 * The cached value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected SoilType soilType = SOIL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoistureAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DummyMoisturePackage.Literals.MOISTURE_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoilType getSoilType() {
		return soilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilType(SoilType newSoilType) {
		SoilType oldSoilType = soilType;
		soilType = newSoilType == null ? SOIL_TYPE_EDEFAULT : newSoilType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_ADMIN__SOIL_TYPE, oldSoilType, soilType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DummyMoisturePackage.MOISTURE_ADMIN__SOIL_TYPE:
				return getSoilType();
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
			case DummyMoisturePackage.MOISTURE_ADMIN__SOIL_TYPE:
				setSoilType((SoilType)newValue);
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
			case DummyMoisturePackage.MOISTURE_ADMIN__SOIL_TYPE:
				setSoilType(SOIL_TYPE_EDEFAULT);
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
			case DummyMoisturePackage.MOISTURE_ADMIN__SOIL_TYPE:
				return soilType != SOIL_TYPE_EDEFAULT;
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
		result.append(" (soilType: ");
		result.append(soilType);
		result.append(')');
		return result.toString();
	}

} //MoistureAdminImpl
