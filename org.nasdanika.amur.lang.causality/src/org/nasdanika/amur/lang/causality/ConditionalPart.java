/**
 */
package org.nasdanika.amur.lang.causality;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.ConditionalPart#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.ConditionalPart#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getConditionalPart()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConditionalPart extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getConditionalPart_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.ConditionalPart#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getConditionalPart_Template()
	 * @model containment="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.ConditionalPart#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);
		
	String toJavaScript(Mode mode, String next);	

} // ConditionalPart
