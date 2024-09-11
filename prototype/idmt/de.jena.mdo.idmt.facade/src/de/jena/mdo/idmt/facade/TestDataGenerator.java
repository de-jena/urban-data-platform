/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.idmt.facade;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.mdo.idmt.idmt.ADryRunResponse;
import de.jena.mdo.idmt.idmt.ARequest;
import de.jena.mdo.idmt.idmt.AResponse;
import de.jena.mdo.idmt.idmt.FeatureStrategyType;
import de.jena.mdo.idmt.idmt.GradType;
import de.jena.mdo.idmt.idmt.IDMTFeature;
import de.jena.mdo.idmt.idmt.IDMTModel;
import de.jena.mdo.idmt.idmt.IdmtFactory;
import de.jena.mdo.idmt.idmt.IdmtPackage;
import de.jena.mdo.idmt.idmt.ModelStrategyType;
import de.jena.mdo.idmt.idmt.RegularizerGrad;
import de.jena.mdo.idmt.idmt.RegularizerType;
import de.jena.mdo.idmt.idmt.ResponseType;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import de.jena.service.remote.service.ServiceDescription;
import de.jena.service.remote.service.ServiceFactory;
import de.jena.service.remote.service.ServiceLifeCycleState;
import de.jena.service.remote.service.ServiceOperationDescription;
import de.jena.service.remote.service.ServicePackage;

/**
 * 
 * @author mark
 * @since 02.08.2024
 */
@Component
@RequireEMFJson
public class TestDataGenerator {
	
	@Reference
	private IdmtPackage idmtPackage;
	@Reference
	private IdmtFactory idmtFactory;
	@Reference(target = "(emf.configuratorName=EMFJson)")
	private ResourceSet resourceSet;
	@Reference
	private ServicePackage servicePackage;
	@Reference
	private ServiceFactory serviceFactory;
	
	@Activate
	public void activate() {
		createServiceDescription();
		ARequest request = createARequest();
		createAResponseDryRun(request);
		createAResponseOK(request);
		createAResponseAsyncOK(request);
		createAResponseCancelled(request);
		createAResponseError(request);
		
	}

	/**
	 * 
	 */
	private void createAResponseOK(ARequest request) {
		AResponse response = idmtFactory.createAResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setElapsedTime(42);
		response.setResultContentType("application/csv");
		response.setResultUri("https://files.jena.de/data/anonymized/lobeda_anonym.csv");
		response.setType(ResponseType.DEFAULT);
		Resource resource = resourceSet.createResource(URI.createFileURI("response-ok.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createAResponseDryRun(ARequest request) {
		ADryRunResponse response = idmtFactory.createADryRunResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setEstCalcTime(1440);
		response.setResultContentType("application/csv");
		response.setType(ResponseType.DRY_RESPONSE);
		Resource resource = resourceSet.createResource(URI.createFileURI("response-dryrun.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createAResponseAsyncOK(ARequest request) {
		AResponse response = idmtFactory.createAResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setElapsedTime(42);
		response.setResultContentType("application/csv");
		response.setResultUri("https://files.jena.de/data/anonymized/lobeda_anonym.csv");
		response.setType(ResponseType.ASYNC_RESPONSE);
		Resource resource = resourceSet.createResource(URI.createFileURI("response-ok-async.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createAResponseRunning(ARequest request) {
		AResponse response = idmtFactory.createAResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setElapsedTime(145);
		response.setRemainingTime(42);
		response.setResultContentType("application/csv");
		response.setType(ResponseType.ASYNC_RUNNING);
		response.setStatusMessage("77%");
		Resource resource = resourceSet.createResource(URI.createFileURI("response-running.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createAResponseError(ARequest request) {
		AResponse response = idmtFactory.createAResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setElapsedTime(145);
		response.setResultContentType("application/csv");
		response.setType(ResponseType.ERROR);
		response.setStatusMessage("Calculation broke with out of memory error");
		Resource resource = resourceSet.createResource(URI.createFileURI("response-error.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createAResponseCancelled(ARequest request) {
		AResponse response = idmtFactory.createAResponse();
		response.setRequestId(request.getRequestId());
		response.setConfig(EcoreUtil.copy(request.getConfig()));
		response.setElapsedTime(145);
		response.setRemainingTime(42);
		response.setResultContentType("application/csv");
		response.setType(ResponseType.ASYNC_CANCELLED);
		response.setStatusMessage("77%");
		Resource resource = resourceSet.createResource(URI.createFileURI("response-cancel.json"));
		resource.getContents().add(response);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private ARequest createARequest() {
		ARequest request = idmtFactory.createARequest();
		request.setConsumerId("JENAsensinact");
		request.setRequestId(UUID.randomUUID().toString());
		request.setContentType("application/json");
		request.setSrcUri("mqtt://mqtt.jena.de:8883/jena/sensinact");
		IDMTModel modelConfig = idmtFactory.createIDMTModel();
		request.setConfig(modelConfig);
		modelConfig.setStrategy(ModelStrategyType.PER_DATASET);
		modelConfig.getK().add(Integer.valueOf(42));
		modelConfig.getNoisy().add(Boolean.TRUE);
		RegularizerGrad regGrad = idmtFactory.createRegularizerGrad();
		regGrad.setGrad(GradType.ANTI);
		regGrad.setReg(RegularizerType.REGULARIZOR);
		modelConfig.getRegGrad().add(regGrad);
		IDMTFeature col01 = idmtFactory.createIDMTFeature();
		col01.setName("age");
		col01.setStrategy(FeatureStrategyType.ANONYMIZE);
		col01.setType("Number");
		IDMTFeature col02 = idmtFactory.createIDMTFeature();
		col02.setName("firstName");
		col02.setStrategy(FeatureStrategyType.IGNORE);
		col02.setType("String");
		modelConfig.getFeatures().add(col01);
		modelConfig.getFeatures().add(col02);
		Resource resource = resourceSet.createResource(URI.createFileURI("request.json"));
		resource.getContents().add(request);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return request;
	}

	/**
	 * 
	 */
	private void createServiceDescription() {
		ServiceDescription d = createServiceDescription(IdmtPackage.Literals.ANONYMIZATION_SERVICE);
		Resource resource = resourceSet.createResource(URI.createFileURI("service-description.json"));
		resource.getContents().add(d);
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	ServiceDescription createServiceDescription(EClass serviceClass) {
		requireNonNull(serviceClass);
		ServiceDescription desc = serviceFactory.createServiceDescription();
		desc.setLifeCycleState(ServiceLifeCycleState.ANNOUNCE);
		desc.setName(serviceClass.getName());
		desc.setServiceClass(EcoreUtil.copy(serviceClass));
		desc.setProviderId("FHIDMTnode01");
		desc.setVendor("Fraunhofer IDMT");
		desc.setServiceId(UUID.randomUUID().toString());
		desc.setSourceUri("mqtt://mqtt.jena.de:8883/jena");
		desc.setContentType("application/json");
		desc.setServiceType(EcoreUtil.getURI(IdmtPackage.Literals.ANONYMIZATION_SERVICE).toString());
		List<ServiceOperationDescription> operations = serviceClass.getEOperations().stream().map(o->createOperationDescription(o, desc)).collect(Collectors.toList());
		desc.getOperation().addAll(operations);
		return desc;
	}
	
	ServiceOperationDescription createOperationDescription(EOperation operation, ServiceDescription desc) {
		requireNonNull(operation);
		requireNonNull(desc);
		String prefix = desc.getSourceUri();
		String providerId = desc.getProviderId();
		ServiceOperationDescription sod = serviceFactory.createServiceOperationDescription();
		sod.setName(operation.getName());
		sod.setOperationId(UUID.randomUUID().toString());
		sod.setOperation(EcoreUtil.copy(operation));
		sod.setOperationType(EcoreUtil.getURI(operation).toString());
		String requestUri = EcoreUtil.getAnnotation(operation, "Service", "requestUri");
		if (nonNull(requestUri)) {
			requestUri = requestUri.replace("${prefix}", prefix).replace("${providerId}", providerId);
			sod.setOperationRequestUri(requestUri);
		}
		String responseUri = EcoreUtil.getAnnotation(operation, "Service", "responseUri");
		if (nonNull(responseUri)) {
			sod.setOperationResponseUri(responseUri);
		}
		return sod;
		
	}

}
