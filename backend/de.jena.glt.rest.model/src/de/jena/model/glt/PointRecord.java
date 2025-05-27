/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.PointRecord#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getOverrideStatus <em>Override Status</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getNote <em>Note</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getPointRecord()
 * @model
 * @generated
 */
@ProviderType
public interface PointRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Id</em>' attribute.
	 * @see #setSiteId(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_SiteId()
	 * @model
	 * @generated
	 */
	Integer getSiteId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getSiteId <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Id</em>' attribute.
	 * @see #getSiteId()
	 * @generated
	 */
	void setSiteId(Integer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Float)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_NewValue()
	 * @model
	 * @generated
	 */
	Float getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Float value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Float)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_OldValue()
	 * @model
	 * @generated
	 */
	Float getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Float value);

	/**
	 * Returns the value of the '<em><b>Override Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Status</em>' attribute.
	 * @see #setOverrideStatus(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_OverrideStatus()
	 * @model
	 * @generated
	 */
	Integer getOverrideStatus();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getOverrideStatus <em>Override Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Status</em>' attribute.
	 * @see #getOverrideStatus()
	 * @generated
	 */
	void setOverrideStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // PointRecord
