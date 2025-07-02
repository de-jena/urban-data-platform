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

package de.jena.ibis.sensinact.mmt.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.ibis.sensinact.mmt.tests.helper.IbisToSensinactTestHelper;
import de.jena.model.ibis.common.Announcement;
import de.jena.model.ibis.common.IbisCommonFactory;
import de.jena.model.ibis.common.StopInformation;
import de.jena.model.ibis.common.TripInformation;
import de.jena.model.ibis.customerinformationservice.AllData;
import de.jena.model.ibis.customerinformationservice.AllDataResponse;
import de.jena.model.ibis.customerinformationservice.CurrentAnnouncementData;
import de.jena.model.ibis.customerinformationservice.CurrentAnnouncementResponse;
import de.jena.model.ibis.customerinformationservice.CurrentConnectionInformationData;
import de.jena.model.ibis.customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.model.ibis.customerinformationservice.CurrentDisplayContentData;
import de.jena.model.ibis.customerinformationservice.CurrentDisplayContentResponse;
import de.jena.model.ibis.customerinformationservice.CurrentStopIndexData;
import de.jena.model.ibis.customerinformationservice.CurrentStopIndexResponse;
import de.jena.model.ibis.customerinformationservice.CurrentStopPointData;
import de.jena.model.ibis.customerinformationservice.CurrentStopPointResponse;
import de.jena.model.ibis.customerinformationservice.IbisCustomerInformationServiceFactory;
import de.jena.model.ibis.customerinformationservice.TripData;
import de.jena.model.ibis.customerinformationservice.TripDataResponse;
import de.jena.model.ibis.customerinformationservice.VehicleData;
import de.jena.model.ibis.customerinformationservice.VehicleDataResponse;
import de.jena.model.ibis.enumerations.DoorOpenStateEnumeration;
import de.jena.model.ibis.enumerations.ExitSideEnumeration;
import de.jena.model.ibis.enumerations.LocationStateEnumeration;
import de.jena.model.ibis.enumerations.RouteDeviationEnumeration;
import de.jena.model.ibis.enumerations.RouteDirectionEnumeration;
import de.jena.model.ibis.enumerations.TripStateEnumeration;
import de.jena.model.ibis.enumerations.VehicleModeEnumeration;
import de.jena.model.sensinact.ibis.CustomerInfoAll;
import de.jena.model.sensinact.ibis.CustomerInfoAllData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncement;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncementData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentConnection;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentConnectionData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContent;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndex;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndexData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData;
import de.jena.model.sensinact.ibis.CustomerInfoTrip;
import de.jena.model.sensinact.ibis.CustomerInfoTripData;
import de.jena.model.sensinact.ibis.CustomerInfoVehicle;
import de.jena.model.sensinact.ibis.CustomerInfoVehicleData;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class IbisCustomerInfoToSensinactMMTTest {

	//@InjectService(filter = "(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=ibisToSensinact)")
	ModelTransformator transformator;
	
	@BeforeEach
	public void test(@InjectService(filter = "(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=ibisToSensinact)", cardinality = 0) ServiceAware<ModelTransformator> trafoAware) throws InterruptedException{
		transformator = trafoAware.waitForService(500);			
	}
	
	
	@Test
	public void testAllData() throws DatatypeConfigurationException {
		AllDataResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createAllDataResponse();
		AllData data = IbisCustomerInformationServiceFactory.eINSTANCE.createAllData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setDefaultLanguage(IbisToSensinactTestHelper.createIbisLanguage("en"));
		data.setVehicleRef(IbisToSensinactTestHelper.createIbisToken("vehicleRefTest"));
		data.setCurrentStopIndex(IbisToSensinactTestHelper.createIbisInt(7));
		data.setRouteDeviation(RouteDeviationEnumeration.ONROUTE);
		data.setDoorState(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN);
		data.setExitSide(ExitSideEnumeration.LEFT);
		data.setInPanic(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setMovingDirectionForward(IbisToSensinactTestHelper.createIbisBoolean(true));
		data.setSpeakerActive(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setStopInformationActive(IbisToSensinactTestHelper.createIbisBoolean(true));
		data.setVehicleStopRequested(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setVehicleMode(VehicleModeEnumeration.BUS);		
		data.setTripState(TripStateEnumeration.OFF_DUTY);
		response.setAllData(data);
		
		CustomerInfoAll customerInfoAll = transformator.doTransformation(response);
		CustomerInfoAllData sensinactData = customerInfoAll.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getDefaultLanguage()).isEqualTo("en");
		assertThat(sensinactData.getVehicleRef()).isEqualTo("vehicleRefTest");
		assertThat(sensinactData.getCurrentStopIndex()).isEqualTo(7);
		assertThat(sensinactData.getRouteDeviation()).isEqualTo(RouteDeviationEnumeration.ONROUTE.getLiteral());
		assertThat(sensinactData.getDoorState()).isEqualTo(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN.getLiteral());
		assertThat(sensinactData.getExitSide()).isEqualTo(ExitSideEnumeration.LEFT.getLiteral());
		assertThat(sensinactData.isInPanic()).isFalse();
		assertThat(sensinactData.isMovingDirectionForward()).isTrue();
		assertThat(sensinactData.isSpeakerActive()).isFalse();
		assertThat(sensinactData.isStopInformationActive()).isTrue();
		assertThat(sensinactData.isVehicleStopRequested()).isFalse();
		assertThat(sensinactData.getVehicleMode()).isEqualTo(VehicleModeEnumeration.BUS.getLiteral());
		assertThat(sensinactData.getTripState()).isEqualTo(TripStateEnumeration.OFF_DUTY.getLiteral());
		
		assertThat(customerInfoAll.getMetadata()).isNotEmpty();
		assertThat(customerInfoAll.getMetadata()).hasSize(13);		
	}
	
	@Test
	public void testCurrentConnectionData() throws DatatypeConfigurationException { 
		CurrentConnectionInformationResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentConnectionInformationResponse();
		CurrentConnectionInformationData data = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentConnectionInformationData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));		
		
		response.setCurrentConnectionData(data);
		
		CustomerInfoCurrentConnection service = transformator.doTransformation(response);
		CustomerInfoCurrentConnectionData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(service.getMetadata()).isEmpty();
	}
	
	@Test
	public void testCurrentDisplayContentData() throws DatatypeConfigurationException { 
		CurrentDisplayContentResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentDisplayContentResponse();
		CurrentDisplayContentData data = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentDisplayContentData();
		
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));		
		response.setCurrentDisplayContentData(data);
		
		CustomerInfoCurrentDisplayContent service = transformator.doTransformation(response);
		CustomerInfoCurrentDisplayContentData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(service.getMetadata()).isEmpty();		
	}
	
	@Test
	public void testCurrentAnnouncement() throws DatatypeConfigurationException { 
		CurrentAnnouncementResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentAnnouncementResponse();
		CurrentAnnouncementData data = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentAnnouncementData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		Announcement announcement = IbisCommonFactory.eINSTANCE.createAnnouncement();
		announcement.setAnnouncementRef(IbisToSensinactTestHelper.createIbisToken("annRefTest"));
		announcement.getAnnouncementText().add(IbisToSensinactTestHelper.createIbisTextType("Ann 1"));
		announcement.getAnnouncementText().add(IbisToSensinactTestHelper.createIbisTextType("Ann 2"));
		announcement.getAnnouncementText().add(IbisToSensinactTestHelper.createIbisTextType("Ann 3"));
		announcement.getAnnouncementTTSText().add(IbisToSensinactTestHelper.createIbisTextType("TTS Ann 1"));
		announcement.getAnnouncementTTSText().add(IbisToSensinactTestHelper.createIbisTextType("TTS Ann 2"));
		data.setCurrentAnnouncement(announcement);		
		
		response.setCurrentAnnouncementData(data);
		
		CustomerInfoCurrentAnnouncement service = transformator.doTransformation(response);
		CustomerInfoCurrentAnnouncementData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getAnnouncementRef()).isEqualTo("annRefTest");
		assertThat(sensinactData.getAnnouncementText()).hasSize(3);
		assertThat(sensinactData.getAnnouncementText()).contains("Ann 1", "Ann 2", "Ann 3");
		assertThat(sensinactData.getAnnouncementTTSText()).hasSize(2);
		assertThat(sensinactData.getAnnouncementTTSText()).contains("TTS Ann 1", "TTS Ann 2");
		
		assertThat(service.getMetadata()).isNotEmpty();
		assertThat(service.getMetadata()).hasSize(3);		
	}
	
	@Test
	public void testCurrentStopIndex() throws DatatypeConfigurationException { 
		CurrentStopIndexResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopIndexResponse();
		CurrentStopIndexData data = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopIndexData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setCurrentStopIndex(IbisToSensinactTestHelper.createIbisInt(7));
		
		response.setCurrentStopIndexData(data);

		CustomerInfoCurrentStopIndex service = transformator.doTransformation(response);
		CustomerInfoCurrentStopIndexData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getCurrentStopIndex()).isEqualTo(7);
	
		assertThat(service.getMetadata()).isNotEmpty();
		assertThat(service.getMetadata()).hasSize(1);		
	}
	
	@Test
	public void testCurrentStopPoint() throws DatatypeConfigurationException {  
		CurrentStopPointResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopPointResponse();
		CurrentStopPointData data = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopPointData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		StopInformation stopInfo = IbisCommonFactory.eINSTANCE.createStopInformation();
		stopInfo.setArrivalExpected(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setArrivalScheduled(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDepartureExpected(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDepartureScheduled(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDistanceToNextStop(IbisToSensinactTestHelper.createIbisInt(3));
		stopInfo.setPlatform(IbisToSensinactTestHelper.createIbisString("platformTest"));
		stopInfo.setRecordedArrivalTime(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setStopIndex(IbisToSensinactTestHelper.createIbisInt(7));
		stopInfo.setStopRef(IbisToSensinactTestHelper.createIbisToken("stopRefTest"));
		stopInfo.getStopName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Name 1"));
		stopInfo.getStopName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Name 2"));
		stopInfo.getStopAlternativeName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Alternative Name 1"));
		stopInfo.getStopAlternativeName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Alternative Name 2"));
		stopInfo.getFareZone().add(IbisToSensinactTestHelper.createIbisToken("Fare Zone 1"));
		stopInfo.getFareZone().add(IbisToSensinactTestHelper.createIbisToken("Fare Zone 2"));

		data.setCurrentStopPoint(stopInfo);
		response.setCurrentStopPointData(data);
		
		CustomerInfoCurrentStopPoint service = transformator.doTransformation(response);
		CustomerInfoCurrentStopPointData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getArrivalExpected()).isNotNull();
		assertThat(sensinactData.getArrivalScheduled()).isNotNull();
		assertThat(sensinactData.getDepartureExpected()).isNotNull();
		assertThat(sensinactData.getDepartureScheduled()).isNotNull();
		assertThat(sensinactData.getRecordedArrivalTime()).isNotNull();
		assertThat(sensinactData.getPlatform()).isEqualTo("platformTest");
		assertThat(sensinactData.getStopRef()).isEqualTo("stopRefTest");
		assertThat(sensinactData.getStopIndex()).isEqualTo(7);
		assertThat(sensinactData.getDistanceToNextStop()).isEqualTo(3);
		assertThat(sensinactData.getStopName()).hasSize(2);
		assertThat(sensinactData.getStopName()).contains("Stop Name 1", "Stop Name 2");
		assertThat(sensinactData.getStopAlternativeName()).hasSize(2);
		assertThat(sensinactData.getStopAlternativeName()).contains("Stop Alternative Name 1", "Stop Alternative Name 2");
		assertThat(sensinactData.getFareZone()).hasSize(2);
		assertThat(sensinactData.getFareZone()).contains("Fare Zone 1", "Fare Zone 2");
		
		assertThat(service.getMetadata()).isNotEmpty();
		assertThat(service.getMetadata()).hasSize(12);		
	}
	
	@Test
	public void testTripData() throws DatatypeConfigurationException {  
		TripDataResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createTripDataResponse();
		TripData data = IbisCustomerInformationServiceFactory.eINSTANCE.createTripData();
		
		TripInformation tripInfo = IbisCommonFactory.eINSTANCE.createTripInformation();
		tripInfo.setLocationState(LocationStateEnumeration.AT_STOP);
		tripInfo.setPathDestinationNumber(IbisToSensinactTestHelper.createIbisInt(7));
		tripInfo.setPatternNumber(IbisToSensinactTestHelper.createIbisInt(4));
		tripInfo.setRouteDirection(RouteDirectionEnumeration.CLOCKWISE);
		tripInfo.setRunNumber(IbisToSensinactTestHelper.createIbisInt(23));
		tripInfo.setTimetableDelay(IbisToSensinactTestHelper.createIbisInt(3));
		tripInfo.setTripRef(IbisToSensinactTestHelper.createIbisToken("tripRefTest"));
		tripInfo.setAdditionalTextMessage(IbisToSensinactTestHelper.createIbisTextType("Msg"));
		tripInfo.setAdditionalTextMessage1(IbisToSensinactTestHelper.createIbisTextType("Msg1"));
		tripInfo.setAdditionalTextMessage2(IbisToSensinactTestHelper.createIbisTextType("Msg2"));
		tripInfo.setAdditionalTextMessage3(IbisToSensinactTestHelper.createIbisTextType("Msg3"));
		tripInfo.setAdditionalTextMessage4(IbisToSensinactTestHelper.createIbisTextType("Msg4"));
		tripInfo.setAdditionalTextMessage5(IbisToSensinactTestHelper.createIbisTextType("Msg5"));
		tripInfo.setAdditionalTextMessage6(IbisToSensinactTestHelper.createIbisTextType("Msg6"));
		tripInfo.setAdditionalTextMessage7(IbisToSensinactTestHelper.createIbisTextType("Msg7"));
		tripInfo.setAdditionalTextMessage8(IbisToSensinactTestHelper.createIbisTextType("Msg8"));
		tripInfo.setAdditionalTextMessage9(IbisToSensinactTestHelper.createIbisTextType("Msg9"));

		
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setDefaultLanguage(IbisToSensinactTestHelper.createIbisLanguage("en"));
		data.setVehicleRef(IbisToSensinactTestHelper.createIbisToken("vehicleRefTest"));
		data.setCurrentStopIndex(IbisToSensinactTestHelper.createIbisInt(7));
		data.setTripInformation(tripInfo);
		response.setTripData(data);
		
		CustomerInfoTrip service = transformator.doTransformation(response);
		CustomerInfoTripData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getDefaultLanguage()).isEqualTo("en");
		assertThat(sensinactData.getVehicleRef()).isEqualTo("vehicleRefTest");
		assertThat(sensinactData.getCurrentStopIndex()).isEqualTo(7);
		assertThat(sensinactData.getPathDestinationNumber()).isEqualTo(7);
		assertThat(sensinactData.getPatternNumber()).isEqualTo(4);
		assertThat(sensinactData.getRunNumber()).isEqualTo(23);
		assertThat(sensinactData.getTimetableDelay()).isEqualTo(3);
		assertThat(sensinactData.getTripRef()).isEqualTo("tripRefTest");
		assertThat(sensinactData.getLocationState()).isEqualTo(LocationStateEnumeration.AT_STOP.getLiteral());
		assertThat(sensinactData.getRouteDirection()).isEqualTo(RouteDirectionEnumeration.CLOCKWISE.getLiteral());
		assertThat(sensinactData.getAdditionalTextMsg()).isEqualTo("Msg");
		assertThat(sensinactData.getAdditionalTextMsg1()).isEqualTo("Msg1");
		assertThat(sensinactData.getAdditionalTextMsg2()).isEqualTo("Msg2");
		assertThat(sensinactData.getAdditionalTextMsg3()).isEqualTo("Msg3");
		assertThat(sensinactData.getAdditionalTextMsg4()).isEqualTo("Msg4");
		assertThat(sensinactData.getAdditionalTextMsg5()).isEqualTo("Msg5");
		assertThat(sensinactData.getAdditionalTextMsg6()).isEqualTo("Msg6");
		assertThat(sensinactData.getAdditionalTextMsg7()).isEqualTo("Msg7");
		assertThat(sensinactData.getAdditionalTextMsg8()).isEqualTo("Msg8");
		assertThat(sensinactData.getAdditionalTextMsg9()).isEqualTo("Msg9");
		
		assertThat(service.getMetadata()).isNotEmpty();
		assertThat(service.getMetadata()).hasSize(20);		
	}
	
	@Test
	public void testVehicleData() throws DatatypeConfigurationException {  
		VehicleDataResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createVehicleDataResponse();
		VehicleData data = IbisCustomerInformationServiceFactory.eINSTANCE.createVehicleData();
	
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setVehicleRef(IbisToSensinactTestHelper.createIbisToken("vehicleRefTest"));
		data.setRouteDeviation(RouteDeviationEnumeration.ONROUTE);
		data.setDoorState(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN);
		data.setExitSide(ExitSideEnumeration.LEFT);
		data.setInPanic(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setMovingDirectionForward(IbisToSensinactTestHelper.createIbisBoolean(true));
		data.setSpeakerActive(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setStopInformationActive(IbisToSensinactTestHelper.createIbisBoolean(true));
		data.setVehicleStopRequested(IbisToSensinactTestHelper.createIbisBoolean(false));
		data.setVehicleMode(VehicleModeEnumeration.BUS);		
		data.setTripState(TripStateEnumeration.OFF_DUTY);
		
		response.setVehicleData(data);
		
		CustomerInfoVehicle service = transformator.doTransformation(response);
		CustomerInfoVehicleData sensinactData = service.getResource();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getVehicleRef()).isEqualTo("vehicleRefTest");
		assertThat(sensinactData.getRouteDeviation()).isEqualTo(RouteDeviationEnumeration.ONROUTE.getLiteral());
		assertThat(sensinactData.getDoorState()).isEqualTo(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN.getLiteral());
		assertThat(sensinactData.getExitSide()).isEqualTo(ExitSideEnumeration.LEFT.getLiteral());
		assertThat(sensinactData.isInPanic()).isFalse();
		assertThat(sensinactData.isMovingDirectionForward()).isTrue();
		assertThat(sensinactData.isSpeakerActive()).isFalse();
		assertThat(sensinactData.isStopInformationActive()).isTrue();
		assertThat(sensinactData.isVehicleStopRequested()).isFalse();
		assertThat(sensinactData.getVehicleMode()).isEqualTo(VehicleModeEnumeration.BUS.getLiteral());
		assertThat(sensinactData.getTripState()).isEqualTo(TripStateEnumeration.OFF_DUTY.getLiteral());
		
		assertThat(service.getMetadata()).isNotEmpty();
		assertThat(service.getMetadata()).hasSize(11);		
	}
}
