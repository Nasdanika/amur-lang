/**
 */
package org.nasdanika.amur.lang.causality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.Evaluation#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends TemplateElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getEvaluation_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.Evaluation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Evaluation
