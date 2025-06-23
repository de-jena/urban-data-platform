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

package de.jena.ibis.sensinact.mmt.util;

import java.time.Instant;

import org.eclipse.fennec.qvt.osgi.annotations.ModuleName;
import org.eclipse.fennec.qvt.osgi.annotations.QvtBlackbox;
import org.eclipse.fennec.qvt.osgi.annotations.TemplatePath;
import org.eclipse.fennec.qvt.osgi.annotations.TransformatorId;
import org.eclipse.fennec.qvt.osgi.annotations.UnitQualifiedName;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Component;

import de.jena.model.ibis.common.IBISIPDate;
import de.jena.model.ibis.common.IBISIPDateTime;
import de.jena.model.ibis.common.IbisCommonPackage;

@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.customer.info.service.model)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.door.state.service.model)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.gnss.location.service.model)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.passenger.counting.service.model)")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.ticket.validation.service.model)")
@Component(service = IbisDateTimeToInstantBlackbox.class)
@QvtBlackbox
@ModuleName("IbisDateTimeToInstant")
@UnitQualifiedName("de.jena.ibis.sensinact.mmt.util.IbisDateTimeToInstantBlackbox")
@TemplatePath("de.jena.ibis.sensinact.mmt/transformations/ibisToSensinact.qvto")
@TransformatorId("ibisToSensinact")
@Module(packageURIs={IbisCommonPackage.eNS_URI, ProviderPackage.eNS_URI})
public class IbisDateTimeToInstantBlackbox {
	
	@Operation(description = "Converts from IBISIPDateTime into milliseconds")
	public Long getMillis(IBISIPDateTime ibisDateTime) {
		if(ibisDateTime != null) {			
			return ibisDateTime.getValue().toGregorianCalendar().getTimeInMillis();	
		}
		return null;
	}

	@Operation(description = "Converts from IBISIPDate into milliseconds")
	public Long getMillis(IBISIPDate ibisDate) {
		if(ibisDate != null) {			
			return ibisDate.getValue().toGregorianCalendar().getTimeInMillis();	
		}
		return null;
	}

	@Operation(description = "Converts from milliseconds to Instant")
	public Instant getInstant(Long millis) {
		if(millis !=  null) {
			return Instant.ofEpochMilli(millis);
		}
		return null;
	}

	@Operation(description = "Instant now")
	public Instant getNow() {
			return Instant.now();
	}
}
