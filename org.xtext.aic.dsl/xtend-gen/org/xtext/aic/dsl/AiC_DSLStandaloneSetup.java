/**
 * generated by Xtext 2.9.0
 */
package org.xtext.aic.dsl;

import org.xtext.aic.dsl.AiC_DSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AiC_DSLStandaloneSetup extends AiC_DSLStandaloneSetupGenerated {
  public static void doSetup() {
    AiC_DSLStandaloneSetup _aiC_DSLStandaloneSetup = new AiC_DSLStandaloneSetup();
    _aiC_DSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
