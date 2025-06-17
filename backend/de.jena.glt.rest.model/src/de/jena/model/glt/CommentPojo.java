/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.CommentPojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getContent <em>Content</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getOwnerId <em>Owner Id</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link de.jena.model.glt.CommentPojo#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getCommentPojo()
 * @model
 * @generated
 */
@ProviderType
public interface CommentPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Timestamp()
	 * @model
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Owner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Id</em>' attribute.
	 * @see #setOwnerId(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_OwnerId()
	 * @model
	 * @generated
	 */
	BigInteger getOwnerId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getOwnerId <em>Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Id</em>' attribute.
	 * @see #getOwnerId()
	 * @generated
	 */
	void setOwnerId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Owner Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Type</em>' attribute.
	 * @see #setOwnerType(String)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_OwnerType()
	 * @model
	 * @generated
	 */
	String getOwnerType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getOwnerType <em>Owner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type</em>' attribute.
	 * @see #getOwnerType()
	 * @generated
	 */
	void setOwnerType(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusPojo)
	 * @see de.jena.model.glt.GltPackage#getCommentPojo_Status()
	 * @model containment="true"
	 * @generated
	 */
	StatusPojo getStatus();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CommentPojo#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusPojo value);

} // CommentPojo
