/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Soil#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Soil#getWater <em>Water</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Soil#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSoil()
 * @model
 * @generated
 */
@ProviderType
public interface Soil extends Service {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSoil_Temperature()
	 * @model annotation="mapping path='object/temp_SOIL_f'"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Soil#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' attribute.
	 * @see #setWater(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSoil_Water()
	 * @model annotation="mapping path='object/water_SOIL_f'"
	 * @generated
	 */
	double getWater();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Soil#getWater <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water</em>' attribute.
	 * @see #getWater()
	 * @generated
	 */
	void setWater(double value);

	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see #setConduct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSoil_Conduct()
	 * @model annotation="mapping path='object/conduct_SOIL_f'"
	 * @generated
	 */
	double getConduct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Soil#getConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see #getConduct()
	 * @generated
	 */
	void setConduct(double value);

} // Soil
