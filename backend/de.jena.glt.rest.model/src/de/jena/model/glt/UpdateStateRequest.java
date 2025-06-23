/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update State Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.UpdateStateRequest#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.UpdateStateRequest#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link de.jena.model.glt.UpdateStateRequest#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.UpdateStateRequest#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.jena.model.glt.UpdateStateRequest#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest()
 * @model
 * @generated
 */
@ProviderType
public interface UpdateStateRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(String)
	 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.UpdateStateRequest#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(String value);

	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest_AlarmId()
	 * @model unique="false"
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.UpdateStateRequest#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest_State()
	 * @model unique="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.UpdateStateRequest#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(Integer)
	 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest_Severity()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSeverity();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.UpdateStateRequest#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Integer value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getUpdateStateRequest_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.UpdateStateRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

} // UpdateStateRequest
