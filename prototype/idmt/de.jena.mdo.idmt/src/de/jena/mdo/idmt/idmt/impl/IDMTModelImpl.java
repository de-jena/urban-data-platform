/*
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.IDMTModel;
import de.jena.mdo.idmt.idmt.IdmtPackage;
import de.jena.mdo.idmt.idmt.RegularizerGrad;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDMT Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.IDMTModelImpl#getK <em>K</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.IDMTModelImpl#getRegGrad <em>Reg Grad</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.IDMTModelImpl#getNoisy <em>Noisy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDMTModelImpl extends AModelConfigurationImpl implements IDMTModel {
	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> k;

	/**
	 * The cached value of the '{@link #getRegGrad() <em>Reg Grad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegGrad()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularizerGrad> regGrad;

	/**
	 * The cached value of the '{@link #getNoisy() <em>Noisy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoisy()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> noisy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDMTModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmtPackage.Literals.IDMT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getK() {
		if (k == null) {
			k = new EDataTypeUniqueEList<Integer>(Integer.class, this, IdmtPackage.IDMT_MODEL__K);
		}
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegularizerGrad> getRegGrad() {
		if (regGrad == null) {
			regGrad = new EObjectContainmentEList<RegularizerGrad>(RegularizerGrad.class, this, IdmtPackage.IDMT_MODEL__REG_GRAD);
		}
		return regGrad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getNoisy() {
		if (noisy == null) {
			noisy = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, IdmtPackage.IDMT_MODEL__NOISY);
		}
		return noisy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmtPackage.IDMT_MODEL__REG_GRAD:
				return ((InternalEList<?>)getRegGrad()).basicRemove(otherEnd, msgs);
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
			case IdmtPackage.IDMT_MODEL__K:
				return getK();
			case IdmtPackage.IDMT_MODEL__REG_GRAD:
				return getRegGrad();
			case IdmtPackage.IDMT_MODEL__NOISY:
				return getNoisy();
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
			case IdmtPackage.IDMT_MODEL__K:
				getK().clear();
				getK().addAll((Collection<? extends Integer>)newValue);
				return;
			case IdmtPackage.IDMT_MODEL__REG_GRAD:
				getRegGrad().clear();
				getRegGrad().addAll((Collection<? extends RegularizerGrad>)newValue);
				return;
			case IdmtPackage.IDMT_MODEL__NOISY:
				getNoisy().clear();
				getNoisy().addAll((Collection<? extends Boolean>)newValue);
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
			case IdmtPackage.IDMT_MODEL__K:
				getK().clear();
				return;
			case IdmtPackage.IDMT_MODEL__REG_GRAD:
				getRegGrad().clear();
				return;
			case IdmtPackage.IDMT_MODEL__NOISY:
				getNoisy().clear();
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
			case IdmtPackage.IDMT_MODEL__K:
				return k != null && !k.isEmpty();
			case IdmtPackage.IDMT_MODEL__REG_GRAD:
				return regGrad != null && !regGrad.isEmpty();
			case IdmtPackage.IDMT_MODEL__NOISY:
				return noisy != null && !noisy.isEmpty();
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
		result.append(" (k: ");
		result.append(k);
		result.append(", noisy: ");
		result.append(noisy);
		result.append(')');
		return result.toString();
	}

} //IDMTModelImpl
