/*
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Area Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider#getReferenceArea <em>Reference Area</em>}</li>
 * </ul>
 *
 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceAreaProvider()
 * @model
 * @generated
 */
@ProviderType
public interface ReferenceAreaProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Reference Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Area</em>' containment reference.
	 * @see #setReferenceArea(ReferenceArea)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceAreaProvider_ReferenceArea()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceArea getReferenceArea();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider#getReferenceArea <em>Reference Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Area</em>' containment reference.
	 * @see #getReferenceArea()
	 * @generated
	 */
	void setReferenceArea(ReferenceArea value);

} // ReferenceAreaProvider
