/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.dim.trafficos.publictransport.api.component.helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
public class PTApiHelper {
	
	public static LocalTime adjustTimeToUTCZone(LocalDate day, LocalTime time) {
		if(time == null) return null;
		LocalDateTime localDateTime = LocalDateTime.of(day, time);
		ZoneId dbZone = ZoneId.of("Europe/Berlin"); // db timezone
		ZoneOffset currentOffsetForDbZone = dbZone.getRules().getOffset(localDateTime);
		LocalTime utcTime = LocalTime.ofInstant(localDateTime.toInstant(currentOffsetForDbZone), ZoneId.of("UTC"));
		return utcTime;
	}
}
