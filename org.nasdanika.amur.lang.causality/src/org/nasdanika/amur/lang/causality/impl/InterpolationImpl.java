/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Interpolation;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.render.js.InterpolationRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpolation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.InterpolationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterpolationImpl extends TemplateElementImpl implements Interpolation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.INTERPOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return (String)eGet(CausalityPackage.Literals.INTERPOLATION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		eSet(CausalityPackage.Literals.INTERPOLATION__EXPRESSION, newExpression);
	}

	@Override
	public String toJavaScript(Mode mode) {
		return new InterpolationRenderer().render(mode, this).trim();
	}

} //InterpolationImpl
