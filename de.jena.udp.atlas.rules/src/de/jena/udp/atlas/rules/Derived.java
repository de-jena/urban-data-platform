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
package de.jena.udp.atlas.rules;

/**
 * The derived provider of a sensor: the rules cannot add resources to a mapped provider's model,
 * so the quantities they compute live on {@code <provider>-derived}.
 */
final class Derived {

	static final String SUFFIX = "-derived";

	private Derived() {
	}

	static String of(String provider) {
		return provider + SUFFIX;
	}

	static boolean isDerived(String provider) {
		return provider.endsWith(SUFFIX);
	}

	static String sourceOf(String derived) {
		return derived.substring(0, derived.length() - SUFFIX.length());
	}
}
