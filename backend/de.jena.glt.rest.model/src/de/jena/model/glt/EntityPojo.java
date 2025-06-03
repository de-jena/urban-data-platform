/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.EntityPojo#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getEntityPojo()
 * @model
 * @generated
 */
@ProviderType
public interface EntityPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see de.jena.model.glt.GltPackage#getEntityPojo_Entity()
	 * @model
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityPojo#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

} // EntityPojo
