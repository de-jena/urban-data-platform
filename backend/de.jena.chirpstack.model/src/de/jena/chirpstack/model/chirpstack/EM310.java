/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EM310</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.EM310#getTrash <em>Trash</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getEM310()
 * @model annotation="model name='EM310-UDL' profileId='1e6d47f7-1432-4c83-b48d-dd34a7e5e9c6'"
 * @generated
 */
@ProviderType
public interface EM310 extends Provider {
	/**
	 * Returns the value of the '<em><b>Trash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trash</em>' containment reference.
	 * @see #setTrash(Trash)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getEM310_Trash()
	 * @model containment="true"
	 * @generated
	 */
	Trash getTrash();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.EM310#getTrash <em>Trash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trash</em>' containment reference.
	 * @see #getTrash()
	 * @generated
	 */
	void setTrash(Trash value);

} // EM310
