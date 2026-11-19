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

import org.eclipse.fennec.m2x.ocl.api.OclOperationProvider;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;

/**
 * The one {@link Condition} the ILSA configuration flow waits for: the model it reads AND the
 * OCL operations its mapping calls.
 * <p>
 * <b>Why this exists at all.</b> A component has exactly one satisfying condition - SCR
 * augments every component description with a single implicit
 * {@code osgi.ds.satisfying.condition} reference (§112.3.13) - and the configuration flow
 * needs two waits. This component takes both as ordinary references and publishes the result
 * as a third Condition, so the flow can name that one and spend its single slot on it.
 * <p>
 * <b>What the OCL half is for.</b> {@link GeoJsonArrayOperations} is the provider of
 * {@code at(n)}, which {@code ilsa-configuration-ce-mapping.xmi} needs for the admin location.
 * Since emf.m2x#431 the engine's {@code operationProvider} reference is dynamic, so a provider
 * that comes up after the engine still reaches it - but arriving is not the same as being
 * waited for. An evaluation that runs in the gap between the engine and the provider resolves
 * {@code at} to nothing, the expression evaluates to OCL {@code invalid}, and the mapping's
 * evaluator turns that into no value and a FINE log line: a miss that looks exactly like a
 * configuration that carries no bounding box.
 * <p>
 * <b>Why that gap matters here and nowhere else.</b> The configuration flow reads RETAINED
 * messages, and a retained message is delivered when the client subscribes. Lose that one
 * delivery and the next chance is the next time an intersection republishes its configuration,
 * which for a retained message may be never. The signal-state and thermal flows call no
 * contributed operation and stream continuously, so neither needs this.
 * <p>
 * <b>What the model half is for</b> is what every flow's condition target is for: a listener
 * resolves {@code payload.eclass.uri} when it activates and a model bundle registers its
 * EPackage when IT activates, with no order between the two. The nsURI is named here rather
 * than in {@code configs/ilsa.json} so that the whole composition can be read in one place;
 * it has to stay in step with the {@code payload.eclass.uri} of the flow that names this
 * condition.
 * <p>
 * <b>What this does not cover.</b> {@code ocl.customOperationsEnabled} on PID
 * {@code DefaultOclEngine} - no DS reference can observe a configuration property of another
 * component, so a runtime that loses {@code configs/ocl.json} passes this gate and still
 * reports no location.
 *
 * @see GeoJsonArrayOperations the operations the OCL half waits for
 */
@Component(service = Condition.class,
		property = Condition.CONDITION_ID + "=de.jena.udp.atlas.ilsa.mapping.ready")
public class MappingReadyCondition implements Condition {

	/**
	 * The references ARE the condition - both mandatory and static, so this component is
	 * satisfied only while both are there, and the service it publishes disappears with
	 * either of them.
	 *
	 * @param trafficLightModel the condition the generated model bundle registers for
	 *            {@code http://jena.de/udp/trafficos/trafficlight/1.1.1}, under which the
	 *            configuration flow's {@code TLConfiguration} is resolvable
	 * @param geoJsonArrayOperations the provider of {@code at(n)}
	 */
	@Activate
	public MappingReadyCondition(
			@Reference(name = "trafficLightModel",
					target = "(osgi.condition.id=http://jena.de/udp/trafficos/trafficlight/1.1.1)")
			Condition trafficLightModel,
			@Reference(name = "operations", target = "(ocl.operations=de.jena.udp.atlas.ilsa.geojson)")
			OclOperationProvider geoJsonArrayOperations) {
		// neither is called from here: the engine uses the operations, DS uses the condition
	}
}
