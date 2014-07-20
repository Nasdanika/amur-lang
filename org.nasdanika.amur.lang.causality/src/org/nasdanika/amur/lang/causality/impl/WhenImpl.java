/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.Template;
import org.nasdanika.amur.lang.causality.When;
import org.nasdanika.amur.lang.causality.render.js.WhenRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.WhenImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.WhenImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.WhenImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenImpl extends TemplateElementImpl implements When {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.WHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return (Template)eGet(CausalityPackage.Literals.WHEN__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		eSet(CausalityPackage.Literals.WHEN__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return (String)eGet(CausalityPackage.Literals.WHEN__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		eSet(CausalityPackage.Literals.WHEN__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eGet(CausalityPackage.Literals.WHEN__VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eSet(CausalityPackage.Literals.WHEN__VARIABLE, newVariable);
	}

	@Override
	public String toJavaScript(Mode mode) {
		return new WhenRenderer().render(mode, this).trim();
	}

} //WhenImpl
