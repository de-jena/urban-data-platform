/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.ChangeItem#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getSource <em>Source</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getTarget <em>Target</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getChange <em>Change</em>}</li>
 *   <li>{@link de.jena.model.glt.ChangeItem#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getChangeItem()
 * @model
 * @generated
 */
@ProviderType
public interface ChangeItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Operation()
	 * @model unique="false"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' attribute.
	 * @see #setChange(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Change()
	 * @model unique="false"
	 * @generated
	 */
	String getChange();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' attribute.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getChangeItem_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ChangeItem#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // ChangeItem
