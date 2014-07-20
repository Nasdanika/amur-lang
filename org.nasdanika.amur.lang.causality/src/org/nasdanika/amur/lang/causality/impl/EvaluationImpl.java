/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Evaluation;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.render.js.EvaluationRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.EvaluationImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationImpl extends TemplateElementImpl implements Evaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eGet(CausalityPackage.Literals.EVALUATION__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eSet(CausalityPackage.Literals.EVALUATION__CODE, newCode);
	}

	@Override
	public String toJavaScript(Mode mode) {
		return new EvaluationRenderer().render(mode, this).trim();
	}

} //EvaluationImpl
