/*
 */
package org.eclipse.fennec.models.geojson.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.models.geojson.BoundingBox;
import org.eclipse.fennec.models.geojson.Coordinates;
import org.eclipse.fennec.models.geojson.GeoJsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.models.geojson.impl.BoundingBoxImpl#getSouthwest <em>Southwest</em>}</li>
 *   <li>{@link org.eclipse.fennec.models.geojson.impl.BoundingBoxImpl#getNortheast <em>Northeast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingBoxImpl extends MinimalEObjectImpl.Container implements BoundingBox {
	/**
	 * The cached value of the '{@link #getSouthwest() <em>Southwest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouthwest()
	 * @generated
	 * @ordered
	 */
	protected Coordinates southwest;

	/**
	 * The cached value of the '{@link #getNortheast() <em>Northeast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNortheast()
	 * @generated
	 * @ordered
	 */
	protected Coordinates northeast;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoJsonPackage.Literals.BOUNDING_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinates getSouthwest() {
		return southwest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouthwest(Coordinates newSouthwest, NotificationChain msgs) {
		Coordinates oldSouthwest = southwest;
		southwest = newSouthwest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeoJsonPackage.BOUNDING_BOX__SOUTHWEST, oldSouthwest, newSouthwest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSouthwest(Coordinates newSouthwest) {
		if (newSouthwest != southwest) {
			NotificationChain msgs = null;
			if (southwest != null)
				msgs = ((InternalEObject)southwest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.BOUNDING_BOX__SOUTHWEST, null, msgs);
			if (newSouthwest != null)
				msgs = ((InternalEObject)newSouthwest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.BOUNDING_BOX__SOUTHWEST, null, msgs);
			msgs = basicSetSouthwest(newSouthwest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoJsonPackage.BOUNDING_BOX__SOUTHWEST, newSouthwest, newSouthwest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinates getNortheast() {
		return northeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNortheast(Coordinates newNortheast, NotificationChain msgs) {
		Coordinates oldNortheast = northeast;
		northeast = newNortheast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeoJsonPackage.BOUNDING_BOX__NORTHEAST, oldNortheast, newNortheast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNortheast(Coordinates newNortheast) {
		if (newNortheast != northeast) {
			NotificationChain msgs = null;
			if (northeast != null)
				msgs = ((InternalEObject)northeast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.BOUNDING_BOX__NORTHEAST, null, msgs);
			if (newNortheast != null)
				msgs = ((InternalEObject)newNortheast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.BOUNDING_BOX__NORTHEAST, null, msgs);
			msgs = basicSetNortheast(newNortheast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoJsonPackage.BOUNDING_BOX__NORTHEAST, newNortheast, newNortheast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoJsonPackage.BOUNDING_BOX__SOUTHWEST:
				return basicSetSouthwest(null, msgs);
			case GeoJsonPackage.BOUNDING_BOX__NORTHEAST:
				return basicSetNortheast(null, msgs);
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
			case GeoJsonPackage.BOUNDING_BOX__SOUTHWEST:
				return getSouthwest();
			case GeoJsonPackage.BOUNDING_BOX__NORTHEAST:
				return getNortheast();
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
			case GeoJsonPackage.BOUNDING_BOX__SOUTHWEST:
				setSouthwest((Coordinates)newValue);
				return;
			case GeoJsonPackage.BOUNDING_BOX__NORTHEAST:
				setNortheast((Coordinates)newValue);
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
			case GeoJsonPackage.BOUNDING_BOX__SOUTHWEST:
				setSouthwest((Coordinates)null);
				return;
			case GeoJsonPackage.BOUNDING_BOX__NORTHEAST:
				setNortheast((Coordinates)null);
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
			case GeoJsonPackage.BOUNDING_BOX__SOUTHWEST:
				return southwest != null;
			case GeoJsonPackage.BOUNDING_BOX__NORTHEAST:
				return northeast != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundingBoxImpl
