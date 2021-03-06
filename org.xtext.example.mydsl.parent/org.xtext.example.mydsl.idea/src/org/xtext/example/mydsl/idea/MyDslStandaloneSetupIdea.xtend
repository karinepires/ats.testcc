/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.idea

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.MyDslRuntimeModule
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated

class MyDslStandaloneSetupIdea extends MyDslStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new MyDslRuntimeModule()
		val ideaModule = new MyDslIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
