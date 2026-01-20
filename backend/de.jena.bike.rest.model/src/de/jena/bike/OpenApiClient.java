/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.bike;

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
 * @see de.jena.bike.BikePackage#getOpenApiClient()
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(in instanceof java.util.Collection&lt;?&gt; c) {\n\treturn c.stream().map(String::valueOf).map(s -&gt; java.net.URLEncoder.encode(s, java.nio.charset.StandardCharsets.UTF_8)).collect(java.util.stream.Collectors.joining(\"&amp;\"+name+\"=\"));\n}\nreturn java.net.URLEncoder.encode(String.valueOf(in), java.nio.charset.StandardCharsets.UTF_8);\n'"
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
