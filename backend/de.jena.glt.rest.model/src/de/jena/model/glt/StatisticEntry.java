/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.StatisticEntry#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link de.jena.model.glt.StatisticEntry#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getStatisticEntry()
 * @model
 * @generated
 */
@ProviderType
public interface StatisticEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' reference.
	 * @see #setTimeWindow(TimeWindow)
	 * @see de.jena.model.glt.GltPackage#getStatisticEntry_TimeWindow()
	 * @model
	 * @generated
	 */
	TimeWindow getTimeWindow();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.StatisticEntry#getTimeWindow <em>Time Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(Object)
	 * @see de.jena.model.glt.GltPackage#getStatisticEntry_Values()
	 * @model
	 * @generated
	 */
	Object getValues();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.StatisticEntry#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Object value);

} // StatisticEntry
