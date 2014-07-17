/**
 */
package org.nasdanika.amur.lang.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.amur.lang.LangFactory;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.TextualLanguage;

import org.nasdanika.amur.util.AmurUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TextualLanguageImpl extends LanguageImpl<TextSource> implements TextualLanguage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.TEXTUAL_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextSource createSource(Source original) {
		if (original instanceof TextSource) {			
			TextSource ts = (TextSource) original;
			if (ts.getLanguage()!=null 
					&& ts.getLanguage().getUid()!=null 
					&& ts.getLanguage().getUid().equals(getUid())) {
				return ts;
			}
			ts = EcoreUtil.copy(ts);
			ts.setLanguage(EcoreUtil.copy(this));
			return ts;
		}
		TextSource ret = LangFactory.eINSTANCE.createTextSource();
		AmurUtil.pumpFeatures(original, ret, false, false, new AmurUtil.SuperClassFeatureFilter(LangPackage.eINSTANCE.getSource()));
		ret.setLanguage(EcoreUtil.copy(this));
		return ret;
	}
		
	@Override
	public boolean isBlank(TextSource source) {
		return source==null || source.getText()==null;
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostic, TextSource source, Map<Object, Object> context) {
		// NOP
		return true;
	}
	
	@Override
	public EList<String> mimeTypes() {
		return ECollections.singletonEList("text");
	}
	
	@Override
	protected TextSource editorValueToSource(Object value) {
		TextSource v = createSource(null);
		v.setText((String) value);
		return v;
	}
	
	@Override
	protected Object sourceToEditorValue(Source source) {
		return source instanceof TextSource ? ((TextSource) source).getText()==null ? "" : ((TextSource) source).getText() : "";
	}
	
} //TextualLanguageImpl
