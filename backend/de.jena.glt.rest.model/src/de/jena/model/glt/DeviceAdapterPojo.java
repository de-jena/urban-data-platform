/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Adapter Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getReachable <em>Reachable</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceAdapterPojo#getSince <em>Since</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceAdapterPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Id</em>' attribute.
	 * @see #setBuildingId(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_BuildingId()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getBuildingId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getBuildingId <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Id</em>' attribute.
	 * @see #getBuildingId()
	 * @generated
	 */
	void setBuildingId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_DeviceId()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getDeviceId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_Ip()
	 * @model unique="false"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getIp <em>Ip</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_Reachable()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getReachable();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getReachable <em>Reachable</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getDeviceAdapterPojo_Since()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getSince();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceAdapterPojo#getSince <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Since</em>' attribute.
	 * @see #getSince()
	 * @generated
	 */
	void setSince(BigInteger value);

} // DeviceAdapterPojo
