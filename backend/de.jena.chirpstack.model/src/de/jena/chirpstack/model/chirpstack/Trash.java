/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Trash#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Trash#getPosition <em>Position</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Trash#getBattery <em>Battery</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTrash()
 * @model
 * @generated
 */
@ProviderType
public interface Trash extends Service {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTrash_Distance()
	 * @model annotation="mapping path='object/distance'"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Trash#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTrash_Position()
	 * @model annotation="mapping path='object/position'"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Trash#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTrash_Battery()
	 * @model annotation="mapping path='object/battery'"
	 * @generated
	 */
	double getBattery();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Trash#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(double value);

} // Trash
