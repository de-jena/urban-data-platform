/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Api Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.model.glt.GltPackage#getOpenApiClient()
 * @model interface="true" abstract="true"
 * @generated
 */
@ProviderType
public interface OpenApiClient extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an object to a query parameter compatible string
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String toQueryString(String name, Object in);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  _get it 
	 * <!-- end-model-doc -->
	 * @model pathParameterMapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" queryParameterMapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Response _get(String endpoint, EClass result, EMap<String, String> pathParameter, EMap<String, String> queryParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  _delete it 
	 * <!-- end-model-doc -->
	 * @model pathParameterMapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" queryParameterMapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Response _delete(String endpoint, EClass result, EMap<String, String> pathParameter, EMap<String, String> queryParameter);

} // OpenApiClient
