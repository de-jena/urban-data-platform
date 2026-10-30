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
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.fennec.codec.value.AttributeValueReader;
import org.eclipse.fennec.codec.value.CodecReaderContext;

/**
 * Reads the IBIS timestamps into the {@link XMLGregorianCalendar} values of the IBIS-IP model. The
 * on-board bridge writes a local time with a literal Z and the English zone name, e.g.
 * {@code 2026-01-07T11:07:08.000ZCET}; the XML Schema lexical form is accepted as well.
 */
public class IbisDateReader implements AttributeValueReader<XMLGregorianCalendar> {

	static final String BRIDGE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz";

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
		return text == null || text.isBlank() ? null : parse(text);
	}

	XMLGregorianCalendar parse(String text) throws IOException {
		try {
			return datatypes.newXMLGregorianCalendar(text);
		} catch (IllegalArgumentException notLexical) {
			GregorianCalendar calendar = new GregorianCalendar();
			try {
				// the zone names are English whatever the locale of this JVM
				calendar.setTime(new SimpleDateFormat(BRIDGE_FORMAT, Locale.ENGLISH).parse(text));
			} catch (ParseException e) {
				throw new IOException("unexpected IBIS timestamp " + text, e);
			}
			return datatypes.newXMLGregorianCalendar(calendar);
		}
	}
}
