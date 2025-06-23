/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Building Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.DeviceBuildingPojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceBuildingPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DeviceBuildingPojo#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getDeviceBuildingPojo()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceBuildingPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getDeviceBuildingPojo_Id()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceBuildingPojo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(String)
	 * @see de.jena.model.glt.GltPackage#getDeviceBuildingPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DeviceBuildingPojo#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(String value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.DevicePojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getDeviceBuildingPojo_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevicePojo> getDevices();

} // DeviceBuildingPojo
