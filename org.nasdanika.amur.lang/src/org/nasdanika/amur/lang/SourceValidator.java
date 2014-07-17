/**
 */
package org.nasdanika.amur.lang;

import java.util.Map;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.lang.LangPackage#getSourceValidator()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface SourceValidator<S extends Source> extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, S source, Map<Object, Object> context);

} // SourceValidator
