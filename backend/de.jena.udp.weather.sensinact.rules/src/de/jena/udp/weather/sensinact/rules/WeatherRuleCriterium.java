package de.jena.udp.weather.sensinact.rules;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceValueFilter;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

public class WeatherRuleCriterium implements ICriterion{
	
	public static final String PROVIDER_NAME = "10567";
	public static final String TEMPERATURE_PREFIX = "temp";

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getLocationFilter()
	 */
	@Override
	public BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
		return (snapshot, geo) -> true;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getProviderFilter()
	 */
	@Override
	public Predicate<ProviderSnapshot> getProviderFilter() {
		return snapshot -> {
			return PROVIDER_NAME.equals(snapshot.getName());
		};
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getServiceFilter()
	 */
	@Override
	public Predicate<ServiceSnapshot> getServiceFilter() {
		return snapshot -> true;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceFilter()
	 */
	@Override
	public Predicate<ResourceSnapshot> getResourceFilter() {
		// TODO Auto-generated method stub
		return snapshot -> (snapshot.getName().startsWith(TEMPERATURE_PREFIX));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceValueFilter()
	 */
	@Override
	public ResourceValueFilter getResourceValueFilter() {
		return (provider, resources) -> true;
	}


}
