/**
 */
package org.nasdanika.amur.lang.causality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getTranslationUnit()
 * @model
 * @generated
 */
public interface TranslationUnit extends Template {
	
	String toJavaScript(Mode mode, String outputExpression, String returnExpression);	
	
} // TranslationUnit
