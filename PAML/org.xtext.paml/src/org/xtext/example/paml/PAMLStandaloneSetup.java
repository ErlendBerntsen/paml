/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PAMLStandaloneSetup extends PAMLStandaloneSetupGenerated {

	public static void doSetup() {
		new PAMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
