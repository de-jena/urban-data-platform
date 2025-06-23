/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Log Timeline Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.AlarmLogTimelinePojo#getAlarmLogs <em>Alarm Logs</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmLogTimelinePojo#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getAlarmLogTimelinePojo()
 * @model
 * @generated
 */
@ProviderType
public interface AlarmLogTimelinePojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm Logs</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.AlarmLogPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Logs</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getAlarmLogTimelinePojo_AlarmLogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlarmLogPojo> getAlarmLogs();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getAlarmLogTimelinePojo_Total()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTotal();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmLogTimelinePojo#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(BigInteger value);

} // AlarmLogTimelinePojo
