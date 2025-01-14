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
import org.eclipse.fennec.models.geojson.GeoJsonObject;
import org.eclipse.fennec.models.geojson.GeoJsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.models.geojson.impl.GeoJsonObjectImpl#getBbox <em>Bbox</em>}</li>
 *   <li>{@link org.eclipse.fennec.models.geojson.impl.GeoJsonObjectImpl#getBoundingBox <em>Bounding Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoJsonObjectImpl extends MinimalEObjectImpl.Container implements GeoJsonObject {
	/**
	 * The default value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected static final double[] BBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected BoundingBox boundingBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoJsonObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoJsonPackage.Literals.GEO_JSON_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[] getBbox() {
		return org.eclipse.fennec.models.geojson.util.GeoJsonHelper.convertBoundingBox(getBoundingBox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBbox(double[] newBbox) {
		setBoundingBox(org.eclipse.fennec.models.geojson.util.GeoJsonHelper.convertToBoundingBox(newBbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBox getBoundingBox() {
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBox(BoundingBox newBoundingBox, NotificationChain msgs) {
		BoundingBox oldBoundingBox = boundingBox;
		boundingBox = newBoundingBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX, oldBoundingBox, newBoundingBox);
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
	public void setBoundingBox(BoundingBox newBoundingBox) {
		if (newBoundingBox != boundingBox) {
			NotificationChain msgs = null;
			if (boundingBox != null)
				msgs = ((InternalEObject)boundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX, null, msgs);
			if (newBoundingBox != null)
				msgs = ((InternalEObject)newBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX, null, msgs);
			msgs = basicSetBoundingBox(newBoundingBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX, newBoundingBox, newBoundingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX:
				return basicSetBoundingBox(null, msgs);
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
			case GeoJsonPackage.GEO_JSON_OBJECT__BBOX:
				return getBbox();
			case GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX:
				return getBoundingBox();
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
			case GeoJsonPackage.GEO_JSON_OBJECT__BBOX:
				setBbox((double[])newValue);
				return;
			case GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX:
				setBoundingBox((BoundingBox)newValue);
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
			case GeoJsonPackage.GEO_JSON_OBJECT__BBOX:
				setBbox(BBOX_EDEFAULT);
				return;
			case GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX:
				setBoundingBox((BoundingBox)null);
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
			case GeoJsonPackage.GEO_JSON_OBJECT__BBOX:
				return BBOX_EDEFAULT == null ? getBbox() != null : !BBOX_EDEFAULT.equals(getBbox());
			case GeoJsonPackage.GEO_JSON_OBJECT__BOUNDING_BOX:
				return boundingBox != null;
		}
		return super.eIsSet(featureID);
	}

} //GeoJsonObjectImpl
