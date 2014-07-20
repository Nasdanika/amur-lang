/**
 */
package org.nasdanika.amur.lang.causality;

import org.nasdanika.amur.lang.TextSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.CausalitySource#getMode <em>Mode</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.CausalitySource#getOutputExpression <em>Output Expression</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.CausalitySource#getReturnExpression <em>Return Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getCausalitySource()
 * @model
 * @generated
 */
public interface CausalitySource extends TextSource {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"Sequential"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.amur.lang.causality.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.amur.lang.causality.Mode
	 * @see #setMode(Mode)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getCausalitySource_Mode()
	 * @model default="Sequential"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.CausalitySource#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.amur.lang.causality.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Output Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Expression</em>' attribute.
	 * @see #setOutputExpression(String)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getCausalitySource_OutputExpression()
	 * @model default=""
	 * @generated
	 */
	String getOutputExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.CausalitySource#getOutputExpression <em>Output Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Expression</em>' attribute.
	 * @see #getOutputExpression()
	 * @generated
	 */
	void setOutputExpression(String value);

	/**
	 * Returns the value of the '<em><b>Return Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Expression</em>' attribute.
	 * @see #setReturnExpression(String)
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#getCausalitySource_ReturnExpression()
	 * @model default=""
	 * @generated
	 */
	String getReturnExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.causality.CausalitySource#getReturnExpression <em>Return Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Expression</em>' attribute.
	 * @see #getReturnExpression()
	 * @generated
	 */
	void setReturnExpression(String value);

} // CausalitySource
