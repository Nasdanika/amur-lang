/**
 */
package org.nasdanika.amur.lang.impl;

import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.util.LangValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.SourceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.impl.SourceImpl#getEditor <em>Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SourceImpl extends CDOObjectImpl implements Source {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language<? extends Source> getLanguage() {
		return (Language<? extends Source>)eGet(LangPackage.Literals.SOURCE__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language<? extends Source> newLanguage) {
		eSet(LangPackage.Literals.SOURCE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditor() {
		return (String)eGet(LangPackage.Literals.SOURCE__EDITOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(String newEditor) {
		eSet(LangPackage.Literals.SOURCE__EDITOR, newEditor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public boolean validate(DiagnosticChain diagnostic, Map<Object, Object> context) {
		@SuppressWarnings("rawtypes")
		Language language = getLanguage();
		if (diagnostic != null && language!=null) {
			return language.validate(diagnostic, this, context);
		}
		return true;
	}
	
	@Override
	public IFigure getTooltip() {
		Language<? extends Source> lang = getLanguage();
		if (lang!=null) {
			return lang.getTooltip(this);
		}
		return null;
	}

} //SourceImpl
