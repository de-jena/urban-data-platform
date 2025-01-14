/*
 */
package org.eclipse.fennec.models.geojson;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.models.geojson.GeoJsonObject#getBoundingBox <em>Bounding Box</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.models.geojson.GeoJsonPackage#getGeoJsonObject()
 * @model features="bbox" 
 *        bboxDataType="org.eclipse.fennec.models.geojson.DoubleArray1D" bboxRequired="true" bboxVolatile="true" bboxSuppressedGetVisibility="true" bboxSuppressedSetVisibility="true" bboxSuppressedUnsetVisibility="true"
 *        bboxExtendedMetaData="name='bbox'"
 *        bboxAnnotation="http://www.eclipse.org/emf/2002/GenModel get='return org.eclipse.fennec.models.geojson.util.GeoJsonHelper.convertBoundingBox(getBoundingBox());'"
 * @generated
 */
@ProviderType
public interface GeoJsonObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Box</em>' containment reference.
	 * @see #setBoundingBox(BoundingBox)
	 * @see org.eclipse.fennec.models.geojson.GeoJsonPackage#getGeoJsonObject_BoundingBox()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	BoundingBox getBoundingBox();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.models.geojson.GeoJsonObject#getBoundingBox <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box</em>' containment reference.
	 * @see #getBoundingBox()
	 * @generated
	 */
	void setBoundingBox(BoundingBox value);

} // GeoJsonObject
