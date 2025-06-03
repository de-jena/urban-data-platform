/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.AlarmId#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmId#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmId#getAlarmId <em>Alarm Id</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getAlarmId()
 * @model
 * @generated
 */
@ProviderType
public interface AlarmId extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(String)
	 * @see de.jena.model.glt.GltPackage#getAlarmId_SystemId()
	 * @model
	 * @generated
	 */
	String getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmId#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(String value);

	/**
	 * Returns the value of the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Id</em>' attribute.
	 * @see #setBuildingId(String)
	 * @see de.jena.model.glt.GltPackage#getAlarmId_BuildingId()
	 * @model
	 * @generated
	 */
	String getBuildingId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmId#getBuildingId <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Id</em>' attribute.
	 * @see #getBuildingId()
	 * @generated
	 */
	void setBuildingId(String value);

	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see de.jena.model.glt.GltPackage#getAlarmId_AlarmId()
	 * @model
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmId#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

} // AlarmId
