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
package geojson.impl;

import geojson.GeoJSON;
import geojson.GeojsonPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo JSON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link geojson.impl.GeoJSONImpl#getBbox <em>Bbox</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoJSONImpl extends MinimalEObjectImpl.Container implements GeoJSON {
	/**
	 * The default value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected static final Double[] BBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected Double[] bbox = BBOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoJSONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeojsonPackage.Literals.GEO_JSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double[] getBbox() {
		return bbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBbox(Double[] newBbox) {
		Double[] oldBbox = bbox;
		bbox = newBbox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeojsonPackage.GEO_JSON__BBOX, oldBbox, bbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeojsonPackage.GEO_JSON__BBOX:
				return getBbox();
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
			case GeojsonPackage.GEO_JSON__BBOX:
				setBbox((Double[])newValue);
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
			case GeojsonPackage.GEO_JSON__BBOX:
				setBbox(BBOX_EDEFAULT);
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
			case GeojsonPackage.GEO_JSON__BBOX:
				return BBOX_EDEFAULT == null ? bbox != null : !BBOX_EDEFAULT.equals(bbox);
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
		result.append(" (bbox: ");
		result.append(bbox);
		result.append(')');
		return result.toString();
	}

} //GeoJSONImpl
