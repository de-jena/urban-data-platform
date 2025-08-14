/*
 */
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Light;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.LightImpl#getLightIntensity <em>Light Intensity</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.LightImpl#getUvIndex <em>Uv Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightImpl extends ServiceImpl implements Light {
	/**
	 * The default value of the '{@link #getLightIntensity() <em>Light Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double LIGHT_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLightIntensity() <em>Light Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightIntensity()
	 * @generated
	 * @ordered
	 */
	protected double lightIntensity = LIGHT_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUvIndex() <em>Uv Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUvIndex()
	 * @generated
	 * @ordered
	 */
	protected static final double UV_INDEX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUvIndex() <em>Uv Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUvIndex()
	 * @generated
	 * @ordered
	 */
	protected double uvIndex = UV_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLightIntensity() {
		return lightIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightIntensity(double newLightIntensity) {
		double oldLightIntensity = lightIntensity;
		lightIntensity = newLightIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.LIGHT__LIGHT_INTENSITY, oldLightIntensity, lightIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUvIndex() {
		return uvIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUvIndex(double newUvIndex) {
		double oldUvIndex = uvIndex;
		uvIndex = newUvIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.LIGHT__UV_INDEX, oldUvIndex, uvIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.LIGHT__LIGHT_INTENSITY:
				return getLightIntensity();
			case ChirpstackPackage.LIGHT__UV_INDEX:
				return getUvIndex();
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
			case ChirpstackPackage.LIGHT__LIGHT_INTENSITY:
				setLightIntensity((Double)newValue);
				return;
			case ChirpstackPackage.LIGHT__UV_INDEX:
				setUvIndex((Double)newValue);
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
			case ChirpstackPackage.LIGHT__LIGHT_INTENSITY:
				setLightIntensity(LIGHT_INTENSITY_EDEFAULT);
				return;
			case ChirpstackPackage.LIGHT__UV_INDEX:
				setUvIndex(UV_INDEX_EDEFAULT);
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
			case ChirpstackPackage.LIGHT__LIGHT_INTENSITY:
				return lightIntensity != LIGHT_INTENSITY_EDEFAULT;
			case ChirpstackPackage.LIGHT__UV_INDEX:
				return uvIndex != UV_INDEX_EDEFAULT;
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
		result.append(" (lightIntensity: ");
		result.append(lightIntensity);
		result.append(", uvIndex: ");
		result.append(uvIndex);
		result.append(')');
		return result.toString();
	}

} //LightImpl
