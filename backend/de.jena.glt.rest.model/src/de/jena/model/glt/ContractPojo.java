/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.ContractPojo#getArt <em>Art</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getDisplayname <em>Displayname</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getComment <em>Comment</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getContacts <em>Contacts</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getEnd <em>End</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getPartner <em>Partner</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getReferee <em>Referee</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getStart <em>Start</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getTermination <em>Termination</em>}</li>
 *   <li>{@link de.jena.model.glt.ContractPojo#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getContractPojo()
 * @model
 * @generated
 */
@ProviderType
public interface ContractPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art</em>' attribute.
	 * @see #setArt(Integer)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Art()
	 * @model
	 * @generated
	 */
	Integer getArt();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getArt <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' attribute.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Displayname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayname</em>' attribute.
	 * @see #setDisplayname(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Displayname()
	 * @model
	 * @generated
	 */
	String getDisplayname();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getDisplayname <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayname</em>' attribute.
	 * @see #getDisplayname()
	 * @generated
	 */
	void setDisplayname(String value);

	/**
	 * Returns the value of the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion Date</em>' attribute.
	 * @see #setConclusionDate(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_ConclusionDate()
	 * @model
	 * @generated
	 */
	String getConclusionDate();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getConclusionDate <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion Date</em>' attribute.
	 * @see #getConclusionDate()
	 * @generated
	 */
	void setConclusionDate(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' reference list.
	 * The list contents are of type {@link de.jena.model.glt.ContactPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' reference list.
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Contacts()
	 * @model
	 * @generated
	 */
	EList<ContactPojo> getContacts();

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_CustomerId()
	 * @model
	 * @generated
	 */
	String getCustomerId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' reference.
	 * @see #setPartner(ContactPojo)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Partner()
	 * @model
	 * @generated
	 */
	ContactPojo getPartner();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' reference.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(ContactPojo value);

	/**
	 * Returns the value of the '<em><b>Referee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referee</em>' reference.
	 * @see #setReferee(ContactPojo)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Referee()
	 * @model
	 * @generated
	 */
	ContactPojo getReferee();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getReferee <em>Referee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referee</em>' reference.
	 * @see #getReferee()
	 * @generated
	 */
	void setReferee(ContactPojo value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination</em>' attribute.
	 * @see #setTermination(String)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Termination()
	 * @model
	 * @generated
	 */
	String getTermination();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getTermination <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination</em>' attribute.
	 * @see #getTermination()
	 * @generated
	 */
	void setTermination(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Integer)
	 * @see de.jena.model.glt.GltPackage#getContractPojo_Type()
	 * @model
	 * @generated
	 */
	Integer getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContractPojo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Integer value);

} // ContractPojo
