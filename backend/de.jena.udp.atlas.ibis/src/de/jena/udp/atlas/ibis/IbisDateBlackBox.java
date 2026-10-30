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

import java.time.Instant;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.fennec.m2x.model.qvtoperational.BlackboxOperationDescriptor;
import org.eclipse.fennec.m2x.model.qvtoperational.QvtOperationalFactory;
import org.eclipse.fennec.m2x.qvto.api.QvtoBlackboxInvocationContext;
import org.eclipse.fennec.m2x.qvto.api.QvtoBlackboxLibrary;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;

import de.jena.model.ibis.common.IBISIPDate;
import de.jena.model.ibis.common.IBISIPDateTime;
import de.jena.model.ibis.common.IbisCommonPackage;

/** QVT-O blackbox: the IBIS date wrappers become sensiNact {@code EInstant}s. */
public class IbisDateBlackBox implements QvtoBlackboxLibrary {

	public static final String UNIT_NAME = "de.jena.udp.atlas.ibis.IbisDateBlackBox";
	static final String DATE_TIME_TO_INSTANT = "dateTimeToInstant";
	static final String DATE_TO_INSTANT = "dateToInstant";

	@Override
	public String getModuleName() {
		return "IbisDateBlackBox";
	}

	@Override
	public String getUnitQualifiedName() {
		return UNIT_NAME;
	}

	@Override
	public List<String> getUsedPackageURIs() {
		return List.of(IbisCommonPackage.eNS_URI, ProviderPackage.eNS_URI);
	}

	@Override
	public List<BlackboxOperationDescriptor> getOperationDescriptors() {
		BlackboxOperationDescriptor dateTime = QvtOperationalFactory.eINSTANCE.createBlackboxOperationDescriptor();
		dateTime.setName(DATE_TIME_TO_INSTANT);
		dateTime.setContextType(IbisCommonPackage.eINSTANCE.getIBISIPDateTime());
		dateTime.setReturnType(ProviderPackage.eINSTANCE.getEInstant());
		BlackboxOperationDescriptor date = QvtOperationalFactory.eINSTANCE.createBlackboxOperationDescriptor();
		date.setName(DATE_TO_INSTANT);
		date.setContextType(IbisCommonPackage.eINSTANCE.getIBISIPDate());
		date.setReturnType(ProviderPackage.eINSTANCE.getEInstant());
		return List.of(dateTime, date);
	}

	@Override
	public Object invoke(String operationName, QvtoBlackboxInvocationContext context, Object[] args) {
		if (context.self() instanceof IBISIPDateTime dateTime) {
			return toInstant(dateTime.getValue());
		}
		if (context.self() instanceof IBISIPDate date) {
			return toInstant(date.getValue());
		}
		return null;
	}

	static Instant toInstant(XMLGregorianCalendar calendar) {
		return calendar == null ? null : calendar.toGregorianCalendar().toInstant();
	}
}
