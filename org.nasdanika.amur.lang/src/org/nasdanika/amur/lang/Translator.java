package org.nasdanika.amur.lang;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Translates source to target in a given context.
 * @author Pavel
 *
 */
public interface Translator {
	
	/**
	 * A context key for a list of parameter names passed to translate.
	 */
	String PARAMETER_NAMES_KEY = Translator.class.getName()+":parameterNames";	

	Source translate(
			Source source, 
			String targetLanguageId, 
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			Collection<Runnable> undoCollector) throws Exception;
	
	Set<String> supportedTargetLanguages();
	
}
