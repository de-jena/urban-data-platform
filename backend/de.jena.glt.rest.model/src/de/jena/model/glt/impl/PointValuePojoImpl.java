/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.CommentPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.PointValuePojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Value Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getValuePrev <em>Value Prev</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getOverrideState <em>Override State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.PointValuePojoImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointValuePojoImpl extends MinimalEObjectImpl.Container implements PointValuePojo {
	/**
	 * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected Integer systemId = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Float VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValuePrev() <em>Value Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePrev()
	 * @generated
	 * @ordered
	 */
	protected static final Float VALUE_PREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuePrev() <em>Value Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePrev()
	 * @generated
	 * @ordered
	 */
	protected Float valuePrev = VALUE_PREV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverrideState() <em>Override State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OVERRIDE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideState() <em>Override State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideState()
	 * @generated
	 * @ordered
	 */
	protected Integer overrideState = OVERRIDE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnknown() <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNKNOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnknown() <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnknown()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnknown = IS_UNKNOWN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentPojo> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointValuePojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getPointValuePojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemId(Integer newSystemId) {
		Integer oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Float newValue) {
		Float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getValuePrev() {
		return valuePrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuePrev(Float newValuePrev) {
		Float oldValuePrev = valuePrev;
		valuePrev = newValuePrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__VALUE_PREV, oldValuePrev, valuePrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOverrideState() {
		return overrideState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideState(Integer newOverrideState) {
		Integer oldOverrideState = overrideState;
		overrideState = newOverrideState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__OVERRIDE_STATE, oldOverrideState, overrideState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsUnknown() {
		return isUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnknown(Boolean newIsUnknown) {
		Boolean oldIsUnknown = isUnknown;
		isUnknown = newIsUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.POINT_VALUE_POJO__IS_UNKNOWN, oldIsUnknown, isUnknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentPojo> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<CommentPojo>(CommentPojo.class, this, GltPackage.POINT_VALUE_POJO__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.POINT_VALUE_POJO__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
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
			case GltPackage.POINT_VALUE_POJO__SYSTEM_ID:
				return getSystemId();
			case GltPackage.POINT_VALUE_POJO__ID:
				return getId();
			case GltPackage.POINT_VALUE_POJO__NAME:
				return getName();
			case GltPackage.POINT_VALUE_POJO__VALUE:
				return getValue();
			case GltPackage.POINT_VALUE_POJO__VALUE_PREV:
				return getValuePrev();
			case GltPackage.POINT_VALUE_POJO__TIME:
				return getTime();
			case GltPackage.POINT_VALUE_POJO__OVERRIDE_STATE:
				return getOverrideState();
			case GltPackage.POINT_VALUE_POJO__IS_UNKNOWN:
				return getIsUnknown();
			case GltPackage.POINT_VALUE_POJO__COMMENTS:
				return getComments();
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
			case GltPackage.POINT_VALUE_POJO__SYSTEM_ID:
				setSystemId((Integer)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__ID:
				setId((Integer)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__VALUE:
				setValue((Float)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__VALUE_PREV:
				setValuePrev((Float)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__TIME:
				setTime((String)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__OVERRIDE_STATE:
				setOverrideState((Integer)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__IS_UNKNOWN:
				setIsUnknown((Boolean)newValue);
				return;
			case GltPackage.POINT_VALUE_POJO__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends CommentPojo>)newValue);
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
			case GltPackage.POINT_VALUE_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__VALUE_PREV:
				setValuePrev(VALUE_PREV_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__OVERRIDE_STATE:
				setOverrideState(OVERRIDE_STATE_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__IS_UNKNOWN:
				setIsUnknown(IS_UNKNOWN_EDEFAULT);
				return;
			case GltPackage.POINT_VALUE_POJO__COMMENTS:
				getComments().clear();
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
			case GltPackage.POINT_VALUE_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.POINT_VALUE_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.POINT_VALUE_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.POINT_VALUE_POJO__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GltPackage.POINT_VALUE_POJO__VALUE_PREV:
				return VALUE_PREV_EDEFAULT == null ? valuePrev != null : !VALUE_PREV_EDEFAULT.equals(valuePrev);
			case GltPackage.POINT_VALUE_POJO__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GltPackage.POINT_VALUE_POJO__OVERRIDE_STATE:
				return OVERRIDE_STATE_EDEFAULT == null ? overrideState != null : !OVERRIDE_STATE_EDEFAULT.equals(overrideState);
			case GltPackage.POINT_VALUE_POJO__IS_UNKNOWN:
				return IS_UNKNOWN_EDEFAULT == null ? isUnknown != null : !IS_UNKNOWN_EDEFAULT.equals(isUnknown);
			case GltPackage.POINT_VALUE_POJO__COMMENTS:
				return comments != null && !comments.isEmpty();
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
		result.append(" (systemId: ");
		result.append(systemId);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", valuePrev: ");
		result.append(valuePrev);
		result.append(", time: ");
		result.append(time);
		result.append(", overrideState: ");
		result.append(overrideState);
		result.append(", isUnknown: ");
		result.append(isUnknown);
		result.append(')');
		return result.toString();
	}

} //PointValuePojoImpl
