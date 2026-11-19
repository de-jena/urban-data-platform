/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.atlas.ilsa;

import java.lang.reflect.Array;
import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.fennec.m2x.ocl.api.OclOperation;
import org.eclipse.fennec.m2x.ocl.api.OclOperationProvider;
import org.osgi.service.component.annotations.Component;

import de.jena.udp.model.geojson.GeojsonPackage;

/**
 * {@code at(n)} on the trafficos GeoJSON {@code Array1D}, so a mapping can index a bounding
 * box.
 * <p>
 * {@code Array1D} is an {@link org.eclipse.emf.ecore.EDataType EDataType} whose instance class
 * is {@code java.lang.Double[]}. To OCL that is one scalar, not a collection, so no standard
 * library operation takes an element out of it and
 * {@code self.data.geoJson.bbox.at(1)} - what {@code ilsa-configuration-ce-mapping.xmi} uses
 * for the admin location - evaluates to nothing. An operation contributed on the datatype
 * itself is what opens it, and then the mapping needs no converter for it.
 * <p>
 * <b>This only takes effect with {@code ocl.customOperationsEnabled=true} on PID
 * {@code DefaultOclEngine}</b>, which defaults to {@code false}; {@code configs/ocl.json} in
 * de.jena.udp.atlas.runtime.config sets it. Without that property the engine ignores every
 * contributed operation, {@code at} is an unknown operation and the whole expression evaluates
 * to OCL {@code invalid} - which the mapping's evaluator turns into no value and a FINE log
 * line, invisible at the default level.
 * <p>
 * <b>Being registered is not the same as being waited for.</b> Since emf.m2x#431 the engine's
 * {@code operationProvider} reference is dynamic, so this provider reaches an engine that is
 * already running - but an evaluation in the gap before the bind still resolves {@code at} to
 * nothing. {@link MappingReadyCondition} is what holds the ILSA configuration flow back until
 * this service is there; the service property below is what it targets, so that the gate waits
 * for THESE operations and not for whichever provider a runtime happens to hold.
 * <p>
 * Indices are 1-based, as everywhere in OCL. An index outside the array answers {@code null}
 * rather than throwing: a configuration whose {@code bbox} is absent or short should leave the
 * location unset, not fail the whole mapping.
 *
 * @see GeoJsonValueConverter the other half of what the ILSA mappings need from GeoJSON
 */
@Component(immediate = true, service = OclOperationProvider.class,
		property = "ocl.operations=de.jena.udp.atlas.ilsa.geojson")
public class GeoJsonArrayOperations implements OclOperationProvider {

	@Override
	public List<OclOperation> getOperations() {
		return List.of(OclOperation.of("at", GeojsonPackage.Literals.ARRAY1_D,
				EcorePackage.Literals.EDOUBLE_OBJECT, GeoJsonArrayOperations::at));
	}

	/**
	 * The 1-based element of a {@code Double[]}, or {@code null} where there is none.
	 * <p>
	 * Reflection rather than a cast to {@code Double[]}: the datatype's instance class says
	 * {@code java.lang.Double[]}, but a payload read through a codec can arrive as a
	 * {@code double[]} just as well, and the two are not assignable to one another.
	 */
	private static Object at(Object owner, Object[] arguments) {
		if (owner == null || arguments.length != 1 || !(arguments[0] instanceof Number index)) {
			return null;
		}
		if (!owner.getClass().isArray()) {
			return null;
		}
		int i = index.intValue() - 1;
		return i < 0 || i >= Array.getLength(owner) ? null : Array.get(owner, i);
	}
}
