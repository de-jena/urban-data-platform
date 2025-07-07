/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.PressureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PressureDataImpl#getSurfacePressure <em>Surface Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressureDataImpl extends ServiceImpl implements PressureData {
	/**
	 * The default value of the '{@link #getSurfacePressure() <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfacePressure()
	 * @generated
	 * @ordered
	 */
	protected static final Float SURFACE_PRESSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurfacePressure() <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfacePressure()
	 * @generated
	 * @ordered
	 */
	protected Float surfacePressure = SURFACE_PRESSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.PRESSURE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSurfacePressure() {
		return surfacePressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfacePressure(Float newSurfacePressure) {
		Float oldSurfacePressure = surfacePressure;
		surfacePressure = newSurfacePressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRESSURE_DATA__SURFACE_PRESSURE, oldSurfacePressure, surfacePressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.PRESSURE_DATA__SURFACE_PRESSURE:
				return getSurfacePressure();
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
			case WeatherPackage.PRESSURE_DATA__SURFACE_PRESSURE:
				setSurfacePressure((Float)newValue);
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
			case WeatherPackage.PRESSURE_DATA__SURFACE_PRESSURE:
				setSurfacePressure(SURFACE_PRESSURE_EDEFAULT);
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
			case WeatherPackage.PRESSURE_DATA__SURFACE_PRESSURE:
				return SURFACE_PRESSURE_EDEFAULT == null ? surfacePressure != null : !SURFACE_PRESSURE_EDEFAULT.equals(surfacePressure);
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
		result.append(" (surfacePressure: ");
		result.append(surfacePressure);
		result.append(')');
		return result.toString();
	}

} //PressureDataImpl
