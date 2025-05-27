/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Facility Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getFacilityClass <em>Facility Class</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getFacilityClassName <em>Facility Class Name</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getRoom <em>Room</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getConstructionYear <em>Construction Year</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getLaunchDate <em>Launch Date</em>}</li>
 *   <li>{@link de.jena.model.glt.TechFacilityPojo#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo()
 * @model
 * @generated
 */
@ProviderType
public interface TechFacilityPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Facility Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Class</em>' attribute.
	 * @see #setFacilityClass(String)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_FacilityClass()
	 * @model
	 * @generated
	 */
	String getFacilityClass();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getFacilityClass <em>Facility Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Class</em>' attribute.
	 * @see #getFacilityClass()
	 * @generated
	 */
	void setFacilityClass(String value);

	/**
	 * Returns the value of the '<em><b>Facility Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Class Name</em>' attribute.
	 * @see #setFacilityClassName(String)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_FacilityClassName()
	 * @model
	 * @generated
	 */
	String getFacilityClassName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getFacilityClassName <em>Facility Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Class Name</em>' attribute.
	 * @see #getFacilityClassName()
	 * @generated
	 */
	void setFacilityClassName(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_Room()
	 * @model
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Construction Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Year</em>' attribute.
	 * @see #setConstructionYear(Integer)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_ConstructionYear()
	 * @model
	 * @generated
	 */
	Integer getConstructionYear();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getConstructionYear <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Year</em>' attribute.
	 * @see #getConstructionYear()
	 * @generated
	 */
	void setConstructionYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Launch Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Date</em>' attribute.
	 * @see #setLaunchDate(String)
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_LaunchDate()
	 * @model
	 * @generated
	 */
	String getLaunchDate();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TechFacilityPojo#getLaunchDate <em>Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Date</em>' attribute.
	 * @see #getLaunchDate()
	 * @generated
	 */
	void setLaunchDate(String value);

	/**
	 * Returns the value of the '<em><b>Contracts</b></em>' reference list.
	 * The list contents are of type {@link de.jena.model.glt.ContractPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracts</em>' reference list.
	 * @see de.jena.model.glt.GltPackage#getTechFacilityPojo_Contracts()
	 * @model
	 * @generated
	 */
	EList<ContractPojo> getContracts();

} // TechFacilityPojo
