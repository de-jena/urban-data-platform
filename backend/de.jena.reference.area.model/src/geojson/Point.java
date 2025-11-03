/*
 */
package geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geojson.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see geojson.GeojsonPackage#getPoint()
 * @model
 * @generated
 */
@ProviderType
public interface Point extends Geometry {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see geojson.GeojsonPackage#getPoint_Coordinates()
	 * @model upper="3"
	 * @generated
	 */
	EList<Double> getCoordinates();

} // Point
