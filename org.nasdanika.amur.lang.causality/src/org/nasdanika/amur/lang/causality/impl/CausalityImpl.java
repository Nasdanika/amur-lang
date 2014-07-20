/**
 */
package org.nasdanika.amur.lang.causality.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.TextualLanguage;
import org.nasdanika.amur.lang.causality.Causality;
import org.nasdanika.amur.lang.causality.CausalityCC;
import org.nasdanika.amur.lang.causality.CausalityFactory;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.ui.CausalityEditorComposite;
import org.nasdanika.amur.lang.impl.LanguageImpl;
import org.nasdanika.amur.lang.util.LangUtil;
import org.nasdanika.amur.util.AmurUtil;
import org.nasdanika.common.Editor;
import org.nasdanika.common.SwtEditor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CausalityImpl extends LanguageImpl<CausalitySource> implements Causality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CausalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CAUSALITY;
	}
	

	@Override
	public IFigure getTooltip(Source source) {
		return null;
	}

	@Override
	public boolean isBlank(CausalitySource source) {
		return source==null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Editor> createEditors() {
		return ECollections.<Editor>singletonEList(new SwtEditor() {

			private CausalityEditorComposite causalityComposite;

			@Override
			public Object getValue() {
				return causalityComposite.getValue();
			}

			@Override
			public void setValue(Object value) {
				causalityComposite.setValue((CausalitySource) value);				
			}

			@Override
			public void setEnabled(boolean enabled) {
				causalityComposite.setEnabled(enabled);				
			}

			@Override
			public String getName() {
				return "Causality";
			}

			@Override
			public void createSwtContent(
					Control root, 
					Object value, 
					AdapterFactory adapterFactory,
					CompletionProviderFactory completionProvider) {
				
				causalityComposite = new CausalityEditorComposite((Composite) root, SWT.NONE, CausalityImpl.this, getTextMimeType(), null); 
				if (value instanceof CausalitySource) {
					causalityComposite.setValue((CausalitySource) value);
				}												
			}
			
		});
	}	
	
	protected String getTextMimeType() {
		return "text";
	}
	
	@Override
	public EList<String> mimeTypes() {
		return ECollections.singletonEList("application/causality");
	}
		
	@Override
	public CausalitySource createSource(Source original) {
	    if (original instanceof CausalitySource) {
	    	CausalitySource causalitySource = (CausalitySource) original;
	        if (causalitySource.getLanguage()!=null
	                && causalitySource.getLanguage().getUid()!=null
	                && causalitySource.getLanguage().getUid().equals(getUid())) {
	            return causalitySource;
	        }
	        causalitySource = EcoreUtil.copy(causalitySource);
	        causalitySource.setLanguage(EcoreUtil.copy(this));
	        return causalitySource;
	    }
	    CausalitySource ret = CausalityFactory.eINSTANCE.createCausalitySource();
	    AmurUtil.pumpFeatures(original, ret, false, false, new AmurUtil.SuperClassFeatureFilter(LangPackage.eINSTANCE.getSource()));
	    ret.setLanguage(EcoreUtil.copy(this));
	    return ret;
	}

	@Override
	public Source translate(
			Source source, 
			String targetLanguageId,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			Collection<Runnable> undoCollector) throws Exception {
		if (source instanceof CausalitySource) {
			if (getUid().equals(targetLanguageId)) {
				return source;
			}
			
			if ("javascript".equals(targetLanguageId)) {
				TextualLanguage javaScript = (TextualLanguage) LangUtil.getLanguage(targetLanguageId);
				TextSource ret = javaScript.createSource(null);
				TranslationUnit tu = parse((CausalitySource) source, null, null);
				ret.setText(tu.toJavaScript(((CausalitySource) source).getMode(), ((CausalitySource) source).getOutputExpression(), ((CausalitySource) source).getReturnExpression()));
				return ret;				
			}			
		}
		return null;
	}
	
	protected abstract TranslationUnit parse(CausalitySource source, DiagnosticChain diagnostic, AtomicBoolean validationResult);
	
	@Override
	public Set<String> supportedTargetLanguages() {
		return Collections.singleton("javascript");
	}
	
	@Override
	public boolean validate(final DiagnosticChain diagnostic, final CausalitySource source, Map<Object, Object> context) {
		AtomicBoolean result = new AtomicBoolean(true);
		if (diagnostic!=null && source!=null) {
			try {
				parse(source, diagnostic, result);
			} catch (Exception e) {
				e.printStackTrace();
				diagnostic.add(
						new BasicDiagnostic(
								Diagnostic.ERROR,
								CausalityCC.class.getName(),
								0,
								"Validation error: "+e,
								new Object [] { source }));

				result.set(false);				
			}
		}
		return result.get();
	}

} //CausalityImpl
