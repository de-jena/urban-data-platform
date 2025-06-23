package de.jena.glt.sensinact;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "GLT Configuration", description = "Configuration to request and update sensor data from the GLT rest api.")
public @interface GltConfiguration {
	@AttributeDefinition(description = "System/Side id")
	String systemID();
	@AttributeDefinition(description = "Mesurement points")
	int[] points();
	@AttributeDefinition(description = "Update interval in minutes")
	long interval() default 10;
	@AttributeDefinition(description = "Time to look back on update in minutes")
	long back() default 60;
}