/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Connection Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.DeviceConnectionPojo#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceConnectionPojo#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceConnectionPojo#getReachable <em>Reachable</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceConnectionPojo#getSince <em>Since</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getDeviceConnectionPojo()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceConnectionPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceConnectionPojo_Timestamp()
	 * @model
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceConnectionPojo#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see de.jena.model.glt.GltPackage#getDeviceConnectionPojo_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceConnectionPojo#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' attribute.
	 * @see #setReachable(Boolean)
	 * @see de.jena.model.glt.GltPackage#getDeviceConnectionPojo_Reachable()
	 * @model
	 * @generated
	 */
	Boolean getReachable();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceConnectionPojo#getReachable <em>Reachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reachable</em>' attribute.
	 * @see #getReachable()
	 * @generated
	 */
	void setReachable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Since</em>' attribute.
	 * @see #setSince(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceConnectionPojo_Since()
	 * @model
	 * @generated
	 */
	BigInteger getSince();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceConnectionPojo#getSince <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Since</em>' attribute.
	 * @see #getSince()
	 * @generated
	 */
	void setSince(BigInteger value);

} // DeviceConnectionPojo
