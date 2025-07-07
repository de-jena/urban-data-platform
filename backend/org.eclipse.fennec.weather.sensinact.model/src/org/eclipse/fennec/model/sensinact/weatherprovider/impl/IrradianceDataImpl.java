/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irradiance Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.IrradianceDataImpl#getIrRadianceGlobal <em>Ir Radiance Global</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrradianceDataImpl extends ServiceImpl implements IrradianceData {
	/**
	 * The default value of the '{@link #getIrRadianceGlobal() <em>Ir Radiance Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrRadianceGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final Float IR_RADIANCE_GLOBAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIrRadianceGlobal() <em>Ir Radiance Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrRadianceGlobal()
	 * @generated
	 * @ordered
	 */
	protected Float irRadianceGlobal = IR_RADIANCE_GLOBAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrradianceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.IRRADIANCE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getIrRadianceGlobal() {
		return irRadianceGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIrRadianceGlobal(Float newIrRadianceGlobal) {
		Float oldIrRadianceGlobal = irRadianceGlobal;
		irRadianceGlobal = newIrRadianceGlobal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.IRRADIANCE_DATA__IR_RADIANCE_GLOBAL, oldIrRadianceGlobal, irRadianceGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.IRRADIANCE_DATA__IR_RADIANCE_GLOBAL:
				return getIrRadianceGlobal();
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
			case WeatherPackage.IRRADIANCE_DATA__IR_RADIANCE_GLOBAL:
				setIrRadianceGlobal((Float)newValue);
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
			case WeatherPackage.IRRADIANCE_DATA__IR_RADIANCE_GLOBAL:
				setIrRadianceGlobal(IR_RADIANCE_GLOBAL_EDEFAULT);
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
			case WeatherPackage.IRRADIANCE_DATA__IR_RADIANCE_GLOBAL:
				return IR_RADIANCE_GLOBAL_EDEFAULT == null ? irRadianceGlobal != null : !IR_RADIANCE_GLOBAL_EDEFAULT.equals(irRadianceGlobal);
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
		result.append(" (irRadianceGlobal: ");
		result.append(irRadianceGlobal);
		result.append(')');
		return result.toString();
	}

} //IrradianceDataImpl
