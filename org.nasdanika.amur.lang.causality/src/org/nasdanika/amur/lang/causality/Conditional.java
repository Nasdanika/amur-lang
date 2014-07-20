/**
 */
package org.nasdanika.amur.lang.causality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.Conditional#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends TemplateElement {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.lang.causality.ConditionalPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getConditional_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalPart> getParts();

} // Conditional
