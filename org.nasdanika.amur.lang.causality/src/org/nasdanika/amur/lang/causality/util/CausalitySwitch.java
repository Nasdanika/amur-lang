/**
 */
package org.nasdanika.amur.lang.causality.util;

import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.SourceValidator;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.Translator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.amur.lang.causality.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.causality.CausalityPackage
 * @generated
 */
public class CausalitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CausalityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalitySwitch() {
		if (modelPackage == null) {
			modelPackage = CausalityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CausalityPackage.CAUSALITY_SOURCE: {
				CausalitySource causalitySource = (CausalitySource)theEObject;
				T result = caseCausalitySource(causalitySource);
				if (result == null) result = caseTextSource(causalitySource);
				if (result == null) result = caseSource(causalitySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CAUSALITY: {
				Causality causality = (Causality)theEObject;
				T result = caseCausality(causality);
				if (result == null) result = caseLanguage(causality);
				if (result == null) result = caseTranslator(causality);
				if (result == null) result = caseSourceValidator(causality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CAUSALITY_CC: {
				CausalityCC causalityCC = (CausalityCC)theEObject;
				T result = caseCausalityCC(causalityCC);
				if (result == null) result = caseCausality(causalityCC);
				if (result == null) result = caseLanguage(causalityCC);
				if (result == null) result = caseTranslator(causalityCC);
				if (result == null) result = caseSourceValidator(causalityCC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CAUSALITY_CP: {
				CausalityCP causalityCP = (CausalityCP)theEObject;
				T result = caseCausalityCP(causalityCP);
				if (result == null) result = caseCausality(causalityCP);
				if (result == null) result = caseLanguage(causalityCP);
				if (result == null) result = caseTranslator(causalityCP);
				if (result == null) result = caseSourceValidator(causalityCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CAUSALITY_AP: {
				CausalityAP causalityAP = (CausalityAP)theEObject;
				T result = caseCausalityAP(causalityAP);
				if (result == null) result = caseCausality(causalityAP);
				if (result == null) result = caseLanguage(causalityAP);
				if (result == null) result = caseTranslator(causalityAP);
				if (result == null) result = caseSourceValidator(causalityAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.TEMPLATE_ELEMENT: {
				TemplateElement templateElement = (TemplateElement)theEObject;
				T result = caseTemplateElement(templateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.TRANSLATION_UNIT: {
				TranslationUnit translationUnit = (TranslationUnit)theEObject;
				T result = caseTranslationUnit(translationUnit);
				if (result == null) result = caseTemplate(translationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseTemplateElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseTemplateElement(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.CONDITIONAL_PART: {
				ConditionalPart conditionalPart = (ConditionalPart)theEObject;
				T result = caseConditionalPart(conditionalPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.ITERATION: {
				Iteration iteration = (Iteration)theEObject;
				T result = caseIteration(iteration);
				if (result == null) result = caseTemplateElement(iteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseTemplateElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.INTERPOLATION: {
				Interpolation interpolation = (Interpolation)theEObject;
				T result = caseInterpolation(interpolation);
				if (result == null) result = caseTemplateElement(interpolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseTemplateElement(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.WHEN: {
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseTemplateElement(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.PARALLEL_SECTION: {
				ParallelSection parallelSection = (ParallelSection)theEObject;
				T result = caseParallelSection(parallelSection);
				if (result == null) result = caseSection(parallelSection);
				if (result == null) result = caseTemplateElement(parallelSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.SEQUENTIAL_SECTION: {
				SequentialSection sequentialSection = (SequentialSection)theEObject;
				T result = caseSequentialSection(sequentialSection);
				if (result == null) result = caseSection(sequentialSection);
				if (result == null) result = caseTemplateElement(sequentialSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CausalityPackage.SYNCHRONOUS_SECTION: {
				SynchronousSection synchronousSection = (SynchronousSection)theEObject;
				T result = caseSynchronousSection(synchronousSection);
				if (result == null) result = caseSection(synchronousSection);
				if (result == null) result = caseTemplateElement(synchronousSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausalitySource(CausalitySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Causality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Causality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausality(Causality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausalityCC(CausalityCC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausalityCP(CausalityCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausalityAP(CausalityAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateElement(TemplateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationUnit(TranslationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalPart(ConditionalPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteration(Iteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpolation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpolation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpolation(Interpolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelSection(ParallelSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialSection(SequentialSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousSection(SynchronousSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSource(TextSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends Source> T caseSourceValidator(SourceValidator<S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends Source> T caseLanguage(Language<S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslator(Translator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CausalitySwitch
