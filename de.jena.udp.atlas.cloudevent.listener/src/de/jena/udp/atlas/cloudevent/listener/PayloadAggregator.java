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
package de.jena.udp.atlas.cloudevent.listener;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.jena.udp.atlas.cloudevent.listener.impl.MqttCloudEventListener;

/**
 * Turns the payloads of a time window into the instances that leave it.
 * <p>
 * This is the part of an adapter a mapping cannot express and {@link MqttCloudEventListener}
 * must not know: state across payloads. The listener reads the message and builds the
 * envelope; an aggregator decides what the window's payloads add up to - one instance per
 * provider, a reduction, a join with something that arrived on another topic earlier.
 * <p>
 * A listener instance binds at most one aggregator, through {@code aggregator.target} in its
 * configuration. Several instances may share one - that is how an aggregator sees a payload
 * flow it does not itself window, such as a configuration that names what the windowed flow
 * reports - but only one of them should carry the {@code window.seconds} that drives
 * {@link #flush()}.
 */
public interface PayloadAggregator {

	/** Service property naming an aggregator, for the {@code aggregator.target} of a listener. */
	String AGGREGATOR_ID = "aggregator.id";

	/**
	 * Offers a payload to the aggregator.
	 * <p>
	 * Returning {@code true} means the aggregator took it: the payload leaves with the next
	 * {@link #flush()} and the listener pushes nothing now. Returning {@code false} leaves
	 * the payload to the listener, which wraps and pushes it straight away - an aggregator
	 * that only wants to <em>read</em> a payload, to keep context for the flows it does
	 * window, returns {@code false} too.
	 * @param topic the topic the payload arrived on. Parameter must not be <code>null</code>
	 * @param payload the deserialized payload. Parameter must not be <code>null</code>
	 * @return <code>true</code> if the aggregator took the payload
	 */
	boolean collect(String topic, EObject payload);

	/**
	 * Closes the current window and returns what it adds up to, one entry per envelope to
	 * push. Each call starts a new window.
	 * @return the aggregates, empty where the window has nothing to report
	 */
	List<Aggregate> flush();

	/**
	 * One instance leaving a window, with what the envelope around it needs.
	 * @param source the topic to report as the event source - the aggregate is built from
	 * several messages, so the aggregator names the one that stands for them
	 * @param data the aggregated instance
	 * @param time when the window closed, which is what stamps the values it carries
	 */
	record Aggregate(String source, EObject data, Date time) {
	}
}
