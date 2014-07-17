package org.nasdanika.amur.lang.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.Translator;

public class LangUtil {
	
	private LangUtil() {
		// Utility class.
	}
	
    private static ScriptEngineManager manager = new ScriptEngineManager();
        
	private static class TranslatorEntry {
		Translator translator;
		Set<String> targetLanguageIds = new HashSet<>();
	}
	
	private static class TranslatorLink {
		Translator translator;
		String targetLanguage;
	}
	
	private static final int FACTOR = 2;
	
	/**
	 * Translates 
	 * @param source
	 * @param targetLanguageId
	 * @param monitor 
	 * @return
	 */
	public static Source translate(Source source, String targetLanguageId, Map<Object, Object> context, IProgressMonitor monitor, int maxChain) throws Exception {
		if (source.getLanguage()!=null && targetLanguageId.equals(source.getLanguage().getUid())) {
			return source;
		}
		
		Map<String, List<TranslatorEntry>> translators = new HashMap<>();
		int translatorCount = 0;
		
		if (source.getLanguage() instanceof Translator) {
			addTranslator(translators, source.getLanguage().getUid(), (Translator) source.getLanguage(), null);
			++translatorCount;
		}
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.nasdanika.amur.lang.translator");
		for (IConfigurationElement ce: config) {
			Translator translator = (Translator) ce.createExecutableExtension("class");
			if (notBlank(ce.getAttribute("selector"))) {
		        ScriptEngine engine = manager.getEngineByName("JavaScript");
		        try {
					Bindings bindings = new SimpleBindings();
					bindings.put("translators", translators.get(ce.getAttribute("source")));
					bindings.put("context", context);
					Object res = engine.eval(ce.getAttribute("selector"), bindings);
					if (Boolean.FALSE.equals(res)) {
						continue;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			addTranslator(translators, ce.getAttribute("source"), translator, ce.getAttribute("target"));		
			++translatorCount;
		}
		
		if (maxChain<1) {
			maxChain = translatorCount*FACTOR;
		}
		List<List<TranslatorLink>> translatorChains = buildChains(source.getLanguage().getUid(), targetLanguageId, translators, maxChain);
		
		Collections.sort(translatorChains, new Comparator<List<TranslatorLink>>() {

			@Override
			public int compare(List<TranslatorLink> o1, List<TranslatorLink> o2) {
				return o1.size()-o2.size();
			}
		});
		
		C: for (List<TranslatorLink> chain: translatorChains) {
			Collection<Runnable> undoCollector = new ArrayList<>();
			Source src=source;
			for (TranslatorLink link: chain) {
				src = link.translator.translate(src, link.targetLanguage, context, monitor, undoCollector);
				if (src==null) {
					for (Runnable undo: undoCollector) {
						undo.run();
					}
					continue C;
				}
			}
			return src;
		}
		return null;
	}
	
	public static boolean canTranslate(Language<?> sourceLanguage, String targetLanguageId, int maxChain, Map<Object, Object> context) {
		if (sourceLanguage==null || targetLanguageId==null) {
			return false;
		}
		
		if (targetLanguageId.equals(sourceLanguage.getUid())) {
			return true;
		}
		
		Map<String, List<TranslatorEntry>> translators = new HashMap<>();
		int translatorCount = 0;
		
		if (sourceLanguage instanceof Translator) {
			addTranslator(translators, sourceLanguage.getUid(), (Translator) sourceLanguage, null);
			++translatorCount;
		}
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.nasdanika.amur.lang.translator");
		for (IConfigurationElement ce: config) {
			try {
				Translator translator = (Translator) ce.createExecutableExtension("class");
				if (notBlank(ce.getAttribute("selector"))) {
			        ScriptEngine engine = manager.getEngineByName("JavaScript");
					Bindings bindings = new SimpleBindings();
					bindings.put("translators", translators.get(ce.getAttribute("source")));
					bindings.put("context", context);
					Object res = engine.eval(ce.getAttribute("selector"), bindings);
					if (Boolean.FALSE.equals(res)) {
						continue;
					}
				}
				addTranslator(translators, ce.getAttribute("source"), translator, ce.getAttribute("target"));		
				++translatorCount;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (maxChain<1) {
			maxChain = translatorCount*FACTOR;
		}
		return !buildChains(sourceLanguage.getUid(), targetLanguageId, translators, maxChain).isEmpty();
	}
	
	/**
	 * Builds translator chains.
	 * @param uid
	 * @param translators
	 * @param translatorChains
	 */
	private static List<List<TranslatorLink>> buildChains(
			String sourceLanguageId,
			String targetLanguageId,
			Map<String, List<TranslatorEntry>> translators,
			int maxLength) {
		
		if (maxLength<=0) {
			return Collections.emptyList();
		}
		
		List<List<TranslatorLink>> ret = new ArrayList<>();
		
		List<TranslatorEntry> tel = translators.get(sourceLanguageId);
		if (tel==null) {
			return Collections.emptyList();
		}
		
		for (TranslatorEntry te: tel) {
			TranslatorLink tl = new TranslatorLink();
			tl.translator = te.translator;
			tl.targetLanguage = targetLanguageId;
			
			if (te.targetLanguageIds.contains(targetLanguageId)) {		
				List<TranslatorLink> chain = new ArrayList<>();
				chain.add(tl);
				ret.add(chain);
			} else {
				for (String next: te.targetLanguageIds) {
					List<List<TranslatorLink>> chains = buildChains(next, targetLanguageId, translators, maxLength-1);
					for (List<TranslatorLink> chain:chains) {
						chain.add(0, tl);
						ret.add(chain);
					}
				}
			}
		}
		
		return ret;
	}

	private static void addTranslator(
			Map<String, List<TranslatorEntry>> translators, 
			String sourceLanguageId,
			Translator translator,
			String targetLanguageId) {
		List<TranslatorEntry> tl = translators.get(sourceLanguageId);
		if (tl==null) {
			tl = new ArrayList<>();
			translators.put(sourceLanguageId, tl);
		}
		TranslatorEntry translatorEntry = new TranslatorEntry();
		translatorEntry.translator = translator;
		if (notBlank(targetLanguageId)) {
			translatorEntry.targetLanguageIds.add(targetLanguageId);
		}
		if (translator.supportedTargetLanguages()!=null) {
			translatorEntry.targetLanguageIds.addAll(translator.supportedTargetLanguages());
		}
		tl.add(translatorEntry);
	}

	private static boolean notBlank(String str) {
		return str!=null && str.trim().length()>0;
	}
	
}
