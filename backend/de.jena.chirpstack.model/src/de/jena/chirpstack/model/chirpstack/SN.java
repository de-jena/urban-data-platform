/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SN#getAdc1v <em>Adc1v</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SN#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SN#getAdc2 <em>Adc2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SN#getAdc3 <em>Adc3</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN()
 * @model
 * @generated
 */
@ProviderType
public interface SN extends Service {
	/**
	 * Returns the value of the '<em><b>Adc1v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adc1v</em>' attribute.
	 * @see #setAdc1v(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN_Adc1v()
	 * @model annotation="mapping path='object/ADC1_V'"
	 * @generated
	 */
	double getAdc1v();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SN#getAdc1v <em>Adc1v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adc1v</em>' attribute.
	 * @see #getAdc1v()
	 * @generated
	 */
	void setAdc1v(double value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN_Battery()
	 * @model annotation="mapping path='object/BatV'"
	 * @generated
	 */
	double getBattery();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SN#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(double value);

	/**
	 * Returns the value of the '<em><b>Adc2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adc2</em>' attribute.
	 * @see #setAdc2(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN_Adc2()
	 * @model annotation="mapping path='object/ADC2'"
	 * @generated
	 */
	double getAdc2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SN#getAdc2 <em>Adc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adc2</em>' attribute.
	 * @see #getAdc2()
	 * @generated
	 */
	void setAdc2(double value);

	/**
	 * Returns the value of the '<em><b>Adc3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adc3</em>' attribute.
	 * @see #setAdc3(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSN_Adc3()
	 * @model annotation="mapping path='object/ADC3'"
	 * @generated
	 */
	double getAdc3();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SN#getAdc3 <em>Adc3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adc3</em>' attribute.
	 * @see #getAdc3()
	 * @generated
	 */
	void setAdc3(double value);

} // SN
