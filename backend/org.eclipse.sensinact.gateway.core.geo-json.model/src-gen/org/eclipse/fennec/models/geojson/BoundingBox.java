/*
 */
package org.eclipse.fennec.models.geojson;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.models.geojson.BoundingBox#getSouthwest <em>Southwest</em>}</li>
 *   <li>{@link org.eclipse.fennec.models.geojson.BoundingBox#getNortheast <em>Northeast</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.models.geojson.GeoJsonPackage#getBoundingBox()
 * @model
 * @generated
 */
@ProviderType
public interface BoundingBox extends EObject {
	/**
	 * Returns the value of the '<em><b>Southwest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Southwest</em>' containment reference.
	 * @see #setSouthwest(Coordinates)
	 * @see org.eclipse.fennec.models.geojson.GeoJsonPackage#getBoundingBox_Southwest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinates getSouthwest();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.models.geojson.BoundingBox#getSouthwest <em>Southwest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Southwest</em>' containment reference.
	 * @see #getSouthwest()
	 * @generated
	 */
	void setSouthwest(Coordinates value);

	/**
	 * Returns the value of the '<em><b>Northeast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Northeast</em>' containment reference.
	 * @see #setNortheast(Coordinates)
	 * @see org.eclipse.fennec.models.geojson.GeoJsonPackage#getBoundingBox_Northeast()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinates getNortheast();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.models.geojson.BoundingBox#getNortheast <em>Northeast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Northeast</em>' containment reference.
	 * @see #getNortheast()
	 * @generated
	 */
	void setNortheast(Coordinates value);

} // BoundingBox
