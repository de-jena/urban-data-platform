/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SN50</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SN50#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN50()
 * @model annotation="model name='SN50v3-LB_LS' profileName='SN50v3-LB/LS' profileId='a610241d-86c3-4d4a-af88-bfa1754f1610'"
 * @generated
 */
@ProviderType
public interface SN50 extends Provider {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(SN)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN50_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	SN getSensor();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SN50#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(SN value);

} // SN50
