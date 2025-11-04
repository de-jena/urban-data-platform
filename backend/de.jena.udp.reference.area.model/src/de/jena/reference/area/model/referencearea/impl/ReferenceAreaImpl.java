/*
 */
package de.jena.reference.area.model.referencearea.impl;

import de.jena.reference.area.model.referencearea.ReferenceArea;
import de.jena.reference.area.model.referencearea.ReferenceAreaPackage;

import geojson.Feature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl#getSensorCount <em>Sensor Count</em>}</li>
 *   <li>{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl#getTourName <em>Tour Name</em>}</li>
 *   <li>{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceAreaImpl extends MinimalEObjectImpl.Container implements ReferenceArea {
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
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final float GID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected float gid = GID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorCount() <em>Sensor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SENSOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSensorCount() <em>Sensor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorCount()
	 * @generated
	 * @ordered
	 */
	protected int sensorCount = SENSOR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTourName() <em>Tour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTourName() <em>Tour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourName()
	 * @generated
	 * @ordered
	 */
	protected String tourName = TOUR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Feature geometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceAreaPackage.Literals.REFERENCE_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGid(float newGid) {
		float oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSensorCount() {
		return sensorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorCount(int newSensorCount) {
		int oldSensorCount = sensorCount;
		sensorCount = newSensorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__SENSOR_COUNT, oldSensorCount, sensorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTourName() {
		return tourName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTourName(String newTourName) {
		String oldTourName = tourName;
		tourName = newTourName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__TOUR_NAME, oldTourName, tourName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(Feature newGeometry, NotificationChain msgs) {
		Feature oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(Feature newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY:
				return basicSetGeometry(null, msgs);
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
			case ReferenceAreaPackage.REFERENCE_AREA__NAME:
				return getName();
			case ReferenceAreaPackage.REFERENCE_AREA__GID:
				return getGid();
			case ReferenceAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				return getSensorCount();
			case ReferenceAreaPackage.REFERENCE_AREA__TOUR_NAME:
				return getTourName();
			case ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY:
				return getGeometry();
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
			case ReferenceAreaPackage.REFERENCE_AREA__NAME:
				setName((String)newValue);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__GID:
				setGid((Float)newValue);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				setSensorCount((Integer)newValue);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__TOUR_NAME:
				setTourName((String)newValue);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY:
				setGeometry((Feature)newValue);
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
			case ReferenceAreaPackage.REFERENCE_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__GID:
				setGid(GID_EDEFAULT);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				setSensorCount(SENSOR_COUNT_EDEFAULT);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__TOUR_NAME:
				setTourName(TOUR_NAME_EDEFAULT);
				return;
			case ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY:
				setGeometry((Feature)null);
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
			case ReferenceAreaPackage.REFERENCE_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReferenceAreaPackage.REFERENCE_AREA__GID:
				return gid != GID_EDEFAULT;
			case ReferenceAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				return sensorCount != SENSOR_COUNT_EDEFAULT;
			case ReferenceAreaPackage.REFERENCE_AREA__TOUR_NAME:
				return TOUR_NAME_EDEFAULT == null ? tourName != null : !TOUR_NAME_EDEFAULT.equals(tourName);
			case ReferenceAreaPackage.REFERENCE_AREA__GEOMETRY:
				return geometry != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", gid: ");
		result.append(gid);
		result.append(", sensorCount: ");
		result.append(sensorCount);
		result.append(", tourName: ");
		result.append(tourName);
		result.append(')');
		return result.toString();
	}

} //ReferenceAreaImpl
