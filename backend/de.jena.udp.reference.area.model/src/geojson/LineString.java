/*
 */
package geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geojson.LineString#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see geojson.GeojsonPackage#getLineString()
 * @model
 * @generated
 */
@ProviderType
public interface LineString extends Geometry {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}<code>[]</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see geojson.GeojsonPackage#getLineString_Coordinates()
	 * @model dataType="geojson.Array1D"
	 * @generated
	 */
	EList<Double[]> getCoordinates();

} // LineString
