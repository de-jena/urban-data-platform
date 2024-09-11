/*
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.GradType;
import de.jena.mdo.idmt.idmt.IdmtPackage;
import de.jena.mdo.idmt.idmt.RegularizerGrad;
import de.jena.mdo.idmt.idmt.RegularizerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regularizer Grad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl#getReg <em>Reg</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl#getGrad <em>Grad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularizerGradImpl extends MinimalEObjectImpl.Container implements RegularizerGrad {
	/**
	 * The default value of the '{@link #getReg() <em>Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReg()
	 * @generated
	 * @ordered
	 */
	protected static final RegularizerType REG_EDEFAULT = RegularizerType.DEFAULT;

	/**
	 * The cached value of the '{@link #getReg() <em>Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReg()
	 * @generated
	 * @ordered
	 */
	protected RegularizerType reg = REG_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrad() <em>Grad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrad()
	 * @generated
	 * @ordered
	 */
	protected static final GradType GRAD_EDEFAULT = GradType.F;

	/**
	 * The cached value of the '{@link #getGrad() <em>Grad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrad()
	 * @generated
	 * @ordered
	 */
	protected GradType grad = GRAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularizerGradImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmtPackage.Literals.REGULARIZER_GRAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularizerType getReg() {
		return reg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReg(RegularizerType newReg) {
		RegularizerType oldReg = reg;
		reg = newReg == null ? REG_EDEFAULT : newReg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.REGULARIZER_GRAD__REG, oldReg, reg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradType getGrad() {
		return grad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrad(GradType newGrad) {
		GradType oldGrad = grad;
		grad = newGrad == null ? GRAD_EDEFAULT : newGrad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.REGULARIZER_GRAD__GRAD, oldGrad, grad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdmtPackage.REGULARIZER_GRAD__REG:
				return getReg();
			case IdmtPackage.REGULARIZER_GRAD__GRAD:
				return getGrad();
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
			case IdmtPackage.REGULARIZER_GRAD__REG:
				setReg((RegularizerType)newValue);
				return;
			case IdmtPackage.REGULARIZER_GRAD__GRAD:
				setGrad((GradType)newValue);
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
			case IdmtPackage.REGULARIZER_GRAD__REG:
				setReg(REG_EDEFAULT);
				return;
			case IdmtPackage.REGULARIZER_GRAD__GRAD:
				setGrad(GRAD_EDEFAULT);
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
			case IdmtPackage.REGULARIZER_GRAD__REG:
				return reg != REG_EDEFAULT;
			case IdmtPackage.REGULARIZER_GRAD__GRAD:
				return grad != GRAD_EDEFAULT;
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
		result.append(" (reg: ");
		result.append(reg);
		result.append(", grad: ");
		result.append(grad);
		result.append(')');
		return result.toString();
	}

} //RegularizerGradImpl
