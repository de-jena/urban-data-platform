package de.jena.udp.reference.area.sensinact.rules;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.rules.helper.ReferenceAreaHelper;


@Component(immediate = true, name = "ReferenceAreaRule")
public class ReferenceAreaRule implements RuleDefinition{

	@Reference(target = "(identifier=refArea)")
	LocationNotification refAreaNotification;

	@Reference(target = "(identifier=chirpstack)")
	LocationNotification chirpstackNotification;

	private static final Logger LOGGER = Logger.getLogger(ReferenceAreaRule.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#evaluate(java.util.List, org.eclipse.sensinact.southbound.rules.api.ResourceUpdater)
	 */
	@Override
	public void evaluate(List<ProviderSnapshot> providerSnapshots, ResourceUpdater resourceUpdater) {

		//		Map to collect refArea,providers 
		Map<String, List<ProviderSnapshot>> providerToMatchingAreaMap = new HashMap<>();

		//		We should retrieve from SensiNact all the ReferenceAreas
		Map<String, GeoJsonObject> refAreasMap = refAreaNotification.getProviderLocationMap();

		//		We are looping over all the chirpstack-xxxxx-derived
		for(ProviderSnapshot provider : providerSnapshots) {		
			Map<String, GeoJsonObject> providerLocationMap = chirpstackNotification.getProviderLocationMap();
			if(!providerLocationMap.containsKey(provider.getName().replaceFirst("-derived", ""))) {
				LOGGER.warning(String.format("No Location Information for provider %s", provider.getName()));
				continue;
			}
			//			We should check to which reference area it belongs and somehow store the provider together with the ref areas
			GeoJsonObject location = (GeoJsonObject) providerLocationMap.get(provider.getName().replaceFirst("-derived", ""));
			if(location instanceof Point point) {
				String refArea = getBelongingArea(point, refAreasMap);
				if(refArea != null) {
					if(!providerToMatchingAreaMap.containsKey(refArea)) {
						providerToMatchingAreaMap.put(refArea, new LinkedList<>());
					}
					providerToMatchingAreaMap.get(refArea).add(provider);
				} else {
					LOGGER.info(String.format("Provider %s does not belong to any known reference area", provider.getName()));
				}
			}
		}

		//		We should go over the map <refArea, List<providers>> and make the update of the ref area
		providerToMatchingAreaMap.forEach((areaId, providers) -> {
			List<Double> pfWerts = new LinkedList<>();
			//			We should retrieve from SensiNact the corresponding chirpstack-xxxxx-derived in oder to get its pfWert
			providers.forEach(provider -> {
				provider.getService("derivedQuantities").getResources().forEach(resource -> {
					if(resource.getName().equals("pfWertAvg")) {
						pfWerts.add((double) resource.getValue().getValue());
					}
				});
			});
//			It may happen that some providers do not have a pfWertAvg yet because they did not get data, so we put those at 0.
			if(pfWerts.size() < providers.size()) {
				for(int i = pfWerts.size(); i < providers.size(); i++) {
					pfWerts.add(0.);
				}
			}
			ColorType color = getReferenceAreaColor(pfWerts, pfWerts.size());
			resourceUpdater.updateResource(areaId, "referenceArea", "color", color);
			LOGGER.info(String.format("Setting color %s for reference area %s", color, areaId));
		});
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#getInputFilter()
	 */
	@Override
	public ICriterion getInputFilter() {
		return new ReferenceAreaResourceCriterium();
	}

	private String getBelongingArea(Point point, Map<String, GeoJsonObject> refAreasMap) {

		for(Map.Entry<String, GeoJsonObject> entry : refAreasMap.entrySet()) {
			if(entry.getValue() instanceof Feature feature) {
				if(ReferenceAreaHelper.isPointInside(point, feature.geometry())) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

	private ColorType getReferenceAreaColor(List<Double> pfWerts, int numberofSensors) {
		if(pfWerts.size() != numberofSensors) {
			LOGGER.warning(String.format("Number of pfWert values is %d but number of sensors is %d"));
			return ColorType.UNKNOWN;
		}
		if(numberofSensors == 1 || numberofSensors == 2) {
			double mean = numberofSensors == 1 ? pfWerts.get(0) : (pfWerts.get(0) + pfWerts.get(1))/2.;
			LOGGER.info(String.format("Mean value of pfWert %f", mean));
			if(mean < 1.8) return ColorType.BLUE;
			else if(mean >= 1.8 && mean < 3.) return ColorType.GREEN;
			else if(mean >= 3. && mean < 3.6) return ColorType.YELLOW;
			else return ColorType.RED;
		} 
		else if(numberofSensors == 3) {
			if(isConditionMet(pfWerts, 1.8, "LOWER", 1, false)) return ColorType.BLUE;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 2, true)) return ColorType.YELLOW;
			else if(isConditionMet(pfWerts, 3.6, "GREATER", 1, false)) return ColorType.RED;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 3, false)) return ColorType.RED;
			else return ColorType.GREEN;
		}
		else if(numberofSensors == 4) {
			if(isConditionMet(pfWerts, 1.8, "LOWER", 1, false)) return ColorType.BLUE;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 2, true)) return ColorType.YELLOW;
			else if(isConditionMet(pfWerts, 3.6, "GREATER", 1, false)) return ColorType.RED;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 3, false)) return ColorType.RED;
			else return ColorType.GREEN;
		} 
		else if(numberofSensors == 5) {
			if(isConditionMet(pfWerts, 1.8, "LOWER", 2, false)) return ColorType.BLUE;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 3, true)) return ColorType.YELLOW;
			else if(isConditionMet(pfWerts, 3.6, "GREATER", 1, false)) return ColorType.RED;
			else if(isConditionMet(pfWerts, 3.0, "GREATER", 4, false)) return ColorType.RED;
			else return ColorType.GREEN;
		} else {
			LOGGER.warning(String.format("Case not supported. Number of sensors %d", numberofSensors));
			return ColorType.UNKNOWN;
		}
	}

	private boolean isConditionMet(List<Double> pfWerts, Double threshold, String type, int numOfSensorsForThreshold,  boolean exact) {
		int numOfSensorsWithConditionMet = 0;
		for(Double pfWert : pfWerts) {
			if("LOWER".equals(type)) {
				if(pfWert < threshold) {
					numOfSensorsWithConditionMet++;
				}
			} else if("GREATER".equals(type)) {
				if(pfWert > threshold) {
					numOfSensorsWithConditionMet++;
				}
			}
		}
		LOGGER.info(String.format("# Sensors meeting the rule \"%s %d should be %s than %f\" is %d", exact ? "Exaclty" : "At least", numOfSensorsForThreshold, "GREATER".equals(type) ? ">" : "<", threshold, numOfSensorsWithConditionMet));
		if(exact) {
			if(numOfSensorsWithConditionMet == numOfSensorsForThreshold) return true;
			else return false;
		} else {
			if(numOfSensorsWithConditionMet >= numOfSensorsForThreshold) return true;
			else return false;
		}		
	}
}
