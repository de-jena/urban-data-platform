/*
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.ADryRunResponse;
import de.jena.mdo.idmt.idmt.IdmtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADry Run Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ADryRunResponseImpl#getEstCalcTime <em>Est Calc Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADryRunResponseImpl extends AResponseImpl implements ADryRunResponse {
	/**
	 * The default value of the '{@link #getEstCalcTime() <em>Est Calc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCalcTime()
	 * @generated
	 * @ordered
	 */
	protected static final long EST_CALC_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEstCalcTime() <em>Est Calc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCalcTime()
	 * @generated
	 * @ordered
	 */
	protected long estCalcTime = EST_CALC_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADryRunResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmtPackage.Literals.ADRY_RUN_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getEstCalcTime() {
		return estCalcTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstCalcTime(long newEstCalcTime) {
		long oldEstCalcTime = estCalcTime;
		estCalcTime = newEstCalcTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ADRY_RUN_RESPONSE__EST_CALC_TIME, oldEstCalcTime, estCalcTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdmtPackage.ADRY_RUN_RESPONSE__EST_CALC_TIME:
				return getEstCalcTime();
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
			case IdmtPackage.ADRY_RUN_RESPONSE__EST_CALC_TIME:
				setEstCalcTime((Long)newValue);
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
			case IdmtPackage.ADRY_RUN_RESPONSE__EST_CALC_TIME:
				setEstCalcTime(EST_CALC_TIME_EDEFAULT);
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
			case IdmtPackage.ADRY_RUN_RESPONSE__EST_CALC_TIME:
				return estCalcTime != EST_CALC_TIME_EDEFAULT;
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
		result.append(" (estCalcTime: ");
		result.append(estCalcTime);
		result.append(')');
		return result.toString();
	}

} //ADryRunResponseImpl
