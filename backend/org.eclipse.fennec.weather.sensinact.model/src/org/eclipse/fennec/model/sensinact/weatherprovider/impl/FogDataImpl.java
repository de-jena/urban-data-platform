/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.FogData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl#getFogPropLast1 <em>Fog Prop Last1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl#getFogPropLast6 <em>Fog Prop Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl#getFogPropLast12 <em>Fog Prop Last12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogDataImpl extends ServiceImpl implements FogData {
	/**
	 * The default value of the '{@link #getFogPropLast1() <em>Fog Prop Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast1()
	 * @generated
	 * @ordered
	 */
	protected static final Float FOG_PROP_LAST1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFogPropLast1() <em>Fog Prop Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast1()
	 * @generated
	 * @ordered
	 */
	protected Float fogPropLast1 = FOG_PROP_LAST1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFogPropLast6() <em>Fog Prop Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast6()
	 * @generated
	 * @ordered
	 */
	protected static final Float FOG_PROP_LAST6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFogPropLast6() <em>Fog Prop Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast6()
	 * @generated
	 * @ordered
	 */
	protected Float fogPropLast6 = FOG_PROP_LAST6_EDEFAULT;

	/**
	 * The default value of the '{@link #getFogPropLast12() <em>Fog Prop Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast12()
	 * @generated
	 * @ordered
	 */
	protected static final Float FOG_PROP_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFogPropLast12() <em>Fog Prop Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogPropLast12()
	 * @generated
	 * @ordered
	 */
	protected Float fogPropLast12 = FOG_PROP_LAST12_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.FOG_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getFogPropLast1() {
		return fogPropLast1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFogPropLast1(Float newFogPropLast1) {
		Float oldFogPropLast1 = fogPropLast1;
		fogPropLast1 = newFogPropLast1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.FOG_DATA__FOG_PROP_LAST1, oldFogPropLast1, fogPropLast1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getFogPropLast6() {
		return fogPropLast6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFogPropLast6(Float newFogPropLast6) {
		Float oldFogPropLast6 = fogPropLast6;
		fogPropLast6 = newFogPropLast6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.FOG_DATA__FOG_PROP_LAST6, oldFogPropLast6, fogPropLast6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getFogPropLast12() {
		return fogPropLast12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFogPropLast12(Float newFogPropLast12) {
		Float oldFogPropLast12 = fogPropLast12;
		fogPropLast12 = newFogPropLast12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.FOG_DATA__FOG_PROP_LAST12, oldFogPropLast12, fogPropLast12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST1:
				return getFogPropLast1();
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST6:
				return getFogPropLast6();
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST12:
				return getFogPropLast12();
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
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST1:
				setFogPropLast1((Float)newValue);
				return;
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST6:
				setFogPropLast6((Float)newValue);
				return;
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST12:
				setFogPropLast12((Float)newValue);
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
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST1:
				setFogPropLast1(FOG_PROP_LAST1_EDEFAULT);
				return;
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST6:
				setFogPropLast6(FOG_PROP_LAST6_EDEFAULT);
				return;
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST12:
				setFogPropLast12(FOG_PROP_LAST12_EDEFAULT);
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
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST1:
				return FOG_PROP_LAST1_EDEFAULT == null ? fogPropLast1 != null : !FOG_PROP_LAST1_EDEFAULT.equals(fogPropLast1);
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST6:
				return FOG_PROP_LAST6_EDEFAULT == null ? fogPropLast6 != null : !FOG_PROP_LAST6_EDEFAULT.equals(fogPropLast6);
			case WeatherPackage.FOG_DATA__FOG_PROP_LAST12:
				return FOG_PROP_LAST12_EDEFAULT == null ? fogPropLast12 != null : !FOG_PROP_LAST12_EDEFAULT.equals(fogPropLast12);
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
		result.append(" (fogPropLast1: ");
		result.append(fogPropLast1);
		result.append(", fogPropLast6: ");
		result.append(fogPropLast6);
		result.append(", fogPropLast12: ");
		result.append(fogPropLast12);
		result.append(')');
		return result.toString();
	}

} //FogDataImpl
