/**
 */
package org.nasdanika.amur.lang.causality;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getTemplateElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface TemplateElement extends CDOObject {
	
	String toJavaScript(Mode mode);	

} // TemplateElement
