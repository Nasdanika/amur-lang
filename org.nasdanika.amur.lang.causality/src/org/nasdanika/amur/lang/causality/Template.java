/**
 */
package org.nasdanika.amur.lang.causality;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.Template#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getTemplate()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Template extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.lang.causality.TemplateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getTemplate_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateElement> getElements();
	
	String toJavaScript(Mode mode);	

} // Template
