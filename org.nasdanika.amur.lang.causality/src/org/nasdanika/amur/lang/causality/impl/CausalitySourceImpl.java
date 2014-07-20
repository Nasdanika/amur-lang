/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.Mode;

import org.nasdanika.amur.lang.impl.TextSourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl#getOutputExpression <em>Output Expression</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl#getReturnExpression <em>Return Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausalitySourceImpl extends TextSourceImpl implements CausalitySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CausalitySourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CAUSALITY_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return (Mode)eGet(CausalityPackage.Literals.CAUSALITY_SOURCE__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		eSet(CausalityPackage.Literals.CAUSALITY_SOURCE__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputExpression() {
		return (String)eGet(CausalityPackage.Literals.CAUSALITY_SOURCE__OUTPUT_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputExpression(String newOutputExpression) {
		eSet(CausalityPackage.Literals.CAUSALITY_SOURCE__OUTPUT_EXPRESSION, newOutputExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnExpression() {
		return (String)eGet(CausalityPackage.Literals.CAUSALITY_SOURCE__RETURN_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnExpression(String newReturnExpression) {
		eSet(CausalityPackage.Literals.CAUSALITY_SOURCE__RETURN_EXPRESSION, newReturnExpression);
	}

} //CausalitySourceImpl
