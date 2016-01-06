/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.idea;

import com.intellij.openapi.extensions.ExtensionFactory;
import org.xtext.example.mydsl.idea.lang.MyDslLanguage;

public class MyDslExtensionFactory implements ExtensionFactory {
	@Override
	public Object createInstance(String factoryArgument, String implementationClass) {
		Class<?> clazz;
		try {
			clazz = Class.forName(implementationClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Couldn't load "+implementationClass, e);
		}
		return MyDslLanguage.INSTANCE.<Object> getInstance(clazz);
	}
}
