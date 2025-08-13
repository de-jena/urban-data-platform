/*
 */
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.EM310;
import de.jena.chirpstack.model.chirpstack.Trash;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EM310</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.EM310Impl#getTrash <em>Trash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EM310Impl extends ProviderImpl implements EM310 {
	/**
	 * The cached value of the '{@link #getTrash() <em>Trash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrash()
	 * @generated
	 * @ordered
	 */
	protected Trash trash;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EM310Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.EM310;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trash getTrash() {
		return trash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrash(Trash newTrash, NotificationChain msgs) {
		Trash oldTrash = trash;
		trash = newTrash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.EM310__TRASH, oldTrash, newTrash);
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
	public void setTrash(Trash newTrash) {
		if (newTrash != trash) {
			NotificationChain msgs = null;
			if (trash != null)
				msgs = ((InternalEObject)trash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.EM310__TRASH, null, msgs);
			if (newTrash != null)
				msgs = ((InternalEObject)newTrash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.EM310__TRASH, null, msgs);
			msgs = basicSetTrash(newTrash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.EM310__TRASH, newTrash, newTrash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.EM310__TRASH:
				return basicSetTrash(null, msgs);
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
			case ChirpstackPackage.EM310__TRASH:
				return getTrash();
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
			case ChirpstackPackage.EM310__TRASH:
				setTrash((Trash)newValue);
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
			case ChirpstackPackage.EM310__TRASH:
				setTrash((Trash)null);
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
			case ChirpstackPackage.EM310__TRASH:
				return trash != null;
		}
		return super.eIsSet(featureID);
	}

} //EM310Impl
