/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.render.js.TranslationUnitRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TranslationUnitImpl extends TemplateImpl implements TranslationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.TRANSLATION_UNIT;
	}

	@Override
	public String toJavaScript(Mode mode, String outputExpression, String returnExpression) {
		return new TranslationUnitRenderer().render(mode, this, outputExpression, returnExpression).trim();
	}
	
	@Override
	public String toJavaScript(Mode mode) {
		throw new UnsupportedOperationException("Use toJavaScript(mode, outputExpression) instead");
	}

} //TranslationUnitImpl
