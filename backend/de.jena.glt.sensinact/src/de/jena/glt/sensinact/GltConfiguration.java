package de.jena.glt.sensinact;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "GLT Configuration")
public @interface GltConfiguration {
	String systemID();
	int[] points();
	long interval() default 10;
}