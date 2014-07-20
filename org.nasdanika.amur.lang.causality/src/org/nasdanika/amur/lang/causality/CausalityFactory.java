/**
 */
package org.nasdanika.amur.lang.causality;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.causality.CausalityPackage
 * @generated
 */
public interface CausalityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CausalityFactory eINSTANCE = org.nasdanika.amur.lang.causality.impl.CausalityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	CausalitySource createCausalitySource();

	/**
	 * Returns a new object of class '<em>CC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CC</em>'.
	 * @generated
	 */
	CausalityCC createCausalityCC();

	/**
	 * Returns a new object of class '<em>CP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP</em>'.
	 * @generated
	 */
	CausalityCP createCausalityCP();

	/**
	 * Returns a new object of class '<em>AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AP</em>'.
	 * @generated
	 */
	CausalityAP createCausalityAP();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Translation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation Unit</em>'.
	 * @generated
	 */
	TranslationUnit createTranslationUnit();

	/**
	 * Returns a new object of class '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional</em>'.
	 * @generated
	 */
	Conditional createConditional();

	/**
	 * Returns a new object of class '<em>Conditional Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Part</em>'.
	 * @generated
	 */
	ConditionalPart createConditionalPart();

	/**
	 * Returns a new object of class '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration</em>'.
	 * @generated
	 */
	Iteration createIteration();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Interpolation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolation</em>'.
	 * @generated
	 */
	Interpolation createInterpolation();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When</em>'.
	 * @generated
	 */
	When createWhen();

	/**
	 * Returns a new object of class '<em>Parallel Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Section</em>'.
	 * @generated
	 */
	ParallelSection createParallelSection();

	/**
	 * Returns a new object of class '<em>Sequential Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Section</em>'.
	 * @generated
	 */
	SequentialSection createSequentialSection();

	/**
	 * Returns a new object of class '<em>Synchronous Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Section</em>'.
	 * @generated
	 */
	SynchronousSection createSynchronousSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CausalityPackage getCausalityPackage();

} //CausalityFactory
