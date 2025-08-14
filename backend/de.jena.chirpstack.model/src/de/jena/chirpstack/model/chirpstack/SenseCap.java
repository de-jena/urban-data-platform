/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sense Cap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCap#getAir <em>Air</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCap#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCap#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCap()
 * @model annotation="model name='SenseCAP_Wetterstation_2_0' profileName='SenseCAP Wetterstation 2.0' profileId='b6a1cea0-c82d-4261-b32c-cf4d2e1f97fb'"
 * @generated
 */
@ProviderType
public interface SenseCap extends Provider {
	/**
	 * Returns the value of the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air</em>' containment reference.
	 * @see #setAir(Air)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCap_Air()
	 * @model containment="true"
	 * @generated
	 */
	Air getAir();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCap#getAir <em>Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air</em>' containment reference.
	 * @see #getAir()
	 * @generated
	 */
	void setAir(Air value);

	/**
	 * Returns the value of the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain</em>' containment reference.
	 * @see #setRain(Rain)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCap_Rain()
	 * @model containment="true"
	 * @generated
	 */
	Rain getRain();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCap#getRain <em>Rain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain</em>' containment reference.
	 * @see #getRain()
	 * @generated
	 */
	void setRain(Rain value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(Light)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCap_Light()
	 * @model containment="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCap#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

} // SenseCap
