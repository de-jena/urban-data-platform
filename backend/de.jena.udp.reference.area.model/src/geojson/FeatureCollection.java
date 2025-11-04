/*
 */
package geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geojson.FeatureCollection#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see geojson.GeojsonPackage#getFeatureCollection()
 * @model
 * @generated
 */
@ProviderType
public interface FeatureCollection extends GeoJSON {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link geojson.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see geojson.GeojsonPackage#getFeatureCollection_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureCollection
