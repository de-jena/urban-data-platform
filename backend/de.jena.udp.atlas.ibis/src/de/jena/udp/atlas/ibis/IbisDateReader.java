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
package de.jena.udp.atlas.ibis;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.fennec.codec.value.AttributeValueReader;
import org.eclipse.fennec.codec.value.CodecReaderContext;

/**
 * Reads the IBIS timestamps, written as {@code 2026-01-07T10:07:08.000ZCET} by the on-board
 * bridge, into the {@link XMLGregorianCalendar} values of the IBIS-IP model.
 */
public class IbisDateReader implements AttributeValueReader<XMLGregorianCalendar> {

	static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz";

	private final DatatypeFactory datatypes;

	public IbisDateReader() {
		try {
			datatypes = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new IllegalStateException(e);
		}
	}

	@Override
	public String getName() {
		return "ibisDate";
	}

	@Override
	public boolean canHandle(EAttribute attribute) {
		return XMLGregorianCalendar.class.equals(attribute.getEAttributeType().getInstanceClass());
	}

	@Override
	public XMLGregorianCalendar read(CodecReaderContext context, EAttribute attribute) throws IOException {
		String text = context.getParser().getString();
		if (text == null || text.isBlank()) {
			return null;
		}
		GregorianCalendar calendar = new GregorianCalendar();
		try {
			calendar.setTime(new SimpleDateFormat(DATE_FORMAT).parse(text));
		} catch (ParseException e) {
			throw new IOException("unexpected IBIS timestamp " + text, e);
		}
		return datatypes.newXMLGregorianCalendar(calendar);
	}
}
