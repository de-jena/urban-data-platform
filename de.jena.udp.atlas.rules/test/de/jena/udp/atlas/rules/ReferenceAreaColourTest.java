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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;

class ReferenceAreaColourTest {

	@Test
	void oneOrTwoSensorsGoByTheMean() {
		assertEquals(ColorType.BLUE, ReferenceAreaColour.of(List.of(1.7)));
		assertEquals(ColorType.GREEN, ReferenceAreaColour.of(List.of(2.0, 3.9)));
		assertEquals(ColorType.YELLOW, ReferenceAreaColour.of(List.of(3.0, 3.5)));
		assertEquals(ColorType.RED, ReferenceAreaColour.of(List.of(3.6)));
	}

	@Test
	void threeOrFourSensorsNeedOneWetForBlueAndExactlyTwoDryForYellow() {
		assertEquals(ColorType.BLUE, ReferenceAreaColour.of(List.of(1.7, 3.9, 3.9)));
		assertEquals(ColorType.YELLOW, ReferenceAreaColour.of(List.of(2.0, 3.1, 3.2, 2.5)));
		assertEquals(ColorType.RED, ReferenceAreaColour.of(List.of(2.0, 3.7, 2.0)));
		assertEquals(ColorType.RED, ReferenceAreaColour.of(List.of(3.1, 3.1, 3.1)));
		assertEquals(ColorType.GREEN, ReferenceAreaColour.of(List.of(2.0, 2.5, 3.1)));
	}

	@Test
	void fiveSensorsNeedTwoWetForBlueAndExactlyThreeDryForYellow() {
		assertEquals(ColorType.GREEN, ReferenceAreaColour.of(List.of(1.7, 2.0, 2.0, 2.0, 2.0)));
		assertEquals(ColorType.BLUE, ReferenceAreaColour.of(List.of(1.7, 1.7, 2.0, 2.0, 2.0)));
		assertEquals(ColorType.YELLOW, ReferenceAreaColour.of(List.of(3.1, 3.1, 3.1, 2.0, 2.0)));
		assertEquals(ColorType.RED, ReferenceAreaColour.of(List.of(3.1, 3.1, 3.1, 3.1, 2.0)));
	}

	@Test
	void noSensorsOrMoreThanFiveAreUnknown() {
		assertEquals(ColorType.UNKNOWN, ReferenceAreaColour.of(List.of()));
		assertEquals(ColorType.UNKNOWN, ReferenceAreaColour.of(List.of(2.0, 2.0, 2.0, 2.0, 2.0, 2.0)));
	}
}
