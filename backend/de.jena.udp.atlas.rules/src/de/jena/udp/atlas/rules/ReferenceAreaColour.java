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

import java.util.List;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;

/**
 * The colour of a reference area from the average pF values of its sensors, as the city's
 * "Rules Sensordaten" table defines it for one to five sensors.
 */
final class ReferenceAreaColour {

	private ReferenceAreaColour() {
	}

	static ColorType of(List<Double> pfValues) {
		return switch (pfValues.size()) {
		case 1, 2 -> byMean(pfValues.stream().mapToDouble(Double::doubleValue).average().orElseThrow());
		case 3, 4 -> byCount(pfValues, 1, 2, 3);
		case 5 -> byCount(pfValues, 2, 3, 4);
		default -> ColorType.UNKNOWN;
		};
	}

	private static ColorType byMean(double mean) {
		if (mean < 1.8) {
			return ColorType.BLUE;
		}
		if (mean < 3.0) {
			return ColorType.GREEN;
		}
		if (mean < 3.6) {
			return ColorType.YELLOW;
		}
		return ColorType.RED;
	}

	/** Blue needs {@code wet} sensors below 1.8, yellow exactly {@code dry} above 3.0, red one above 3.6 or {@code veryDry} above 3.0. */
	private static ColorType byCount(List<Double> pfValues, int wet, int dry, int veryDry) {
		if (count(pfValues, pf -> pf < 1.8) >= wet) {
			return ColorType.BLUE;
		}
		if (count(pfValues, pf -> pf > 3.0) == dry) {
			return ColorType.YELLOW;
		}
		if (count(pfValues, pf -> pf > 3.6) >= 1 || count(pfValues, pf -> pf > 3.0) >= veryDry) {
			return ColorType.RED;
		}
		return ColorType.GREEN;
	}

	private static long count(List<Double> pfValues, java.util.function.DoublePredicate condition) {
		return pfValues.stream().mapToDouble(Double::doubleValue).filter(condition).count();
	}
}
