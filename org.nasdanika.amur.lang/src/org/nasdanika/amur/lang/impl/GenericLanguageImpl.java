/**
 */
package org.nasdanika.amur.lang.impl;


import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.GenericLanguage;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.GenericLanguageImpl#getMimeTypes <em>Mime Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericLanguageImpl extends LanguageImpl<Source> implements GenericLanguage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.GENERIC_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getMimeTypes() {
		return (EList<String>)eGet(LangPackage.Literals.GENERIC_LANGUAGE__MIME_TYPES, true);
	}

	@Override
	public boolean isBlank(Source source) {
		return source==null;
	}

	@Override
	public Source createSource(Source original) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<String> mimeTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validate(DiagnosticChain diagnostic, Source source,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Source editorValueToSource(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object sourceToEditorValue(Source source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFigure getTooltip(Source source) {
		// TODO Auto-generated method stub
		return null;
	}

} //GenericLanguageImpl
