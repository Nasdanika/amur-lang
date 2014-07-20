/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.amur.lang.causality.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CausalityFactoryImpl extends EFactoryImpl implements CausalityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CausalityFactory init() {
		try {
			CausalityFactory theCausalityFactory = (CausalityFactory)EPackage.Registry.INSTANCE.getEFactory(CausalityPackage.eNS_URI);
			if (theCausalityFactory != null) {
				return theCausalityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CausalityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CausalityPackage.CAUSALITY_SOURCE: return (EObject)createCausalitySource();
			case CausalityPackage.CAUSALITY_CC: return (EObject)createCausalityCC();
			case CausalityPackage.CAUSALITY_CP: return (EObject)createCausalityCP();
			case CausalityPackage.CAUSALITY_AP: return (EObject)createCausalityAP();
			case CausalityPackage.TEMPLATE: return (EObject)createTemplate();
			case CausalityPackage.TRANSLATION_UNIT: return (EObject)createTranslationUnit();
			case CausalityPackage.CONDITIONAL: return (EObject)createConditional();
			case CausalityPackage.CONDITIONAL_PART: return (EObject)createConditionalPart();
			case CausalityPackage.ITERATION: return (EObject)createIteration();
			case CausalityPackage.TEXT: return (EObject)createText();
			case CausalityPackage.INTERPOLATION: return (EObject)createInterpolation();
			case CausalityPackage.EVALUATION: return (EObject)createEvaluation();
			case CausalityPackage.WHEN: return (EObject)createWhen();
			case CausalityPackage.PARALLEL_SECTION: return (EObject)createParallelSection();
			case CausalityPackage.SEQUENTIAL_SECTION: return (EObject)createSequentialSection();
			case CausalityPackage.SYNCHRONOUS_SECTION: return (EObject)createSynchronousSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CausalityPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CausalityPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalitySource createCausalitySource() {
		CausalitySourceImpl causalitySource = new CausalitySourceImpl();
		return causalitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityCC createCausalityCC() {
		CausalityCCImpl causalityCC = new CausalityCCImpl();
		return causalityCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityCP createCausalityCP() {
		CausalityCPImpl causalityCP = new CausalityCPImpl();
		return causalityCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityAP createCausalityAP() {
		CausalityAPImpl causalityAP = new CausalityAPImpl();
		return causalityAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationUnit createTranslationUnit() {
		TranslationUnitImpl translationUnit = new TranslationUnitImpl();
		return translationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalPart createConditionalPart() {
		ConditionalPartImpl conditionalPart = new ConditionalPartImpl();
		return conditionalPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iteration createIteration() {
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpolation createInterpolation() {
		InterpolationImpl interpolation = new InterpolationImpl();
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelSection createParallelSection() {
		ParallelSectionImpl parallelSection = new ParallelSectionImpl();
		return parallelSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSection createSequentialSection() {
		SequentialSectionImpl sequentialSection = new SequentialSectionImpl();
		return sequentialSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousSection createSynchronousSection() {
		SynchronousSectionImpl synchronousSection = new SynchronousSectionImpl();
		return synchronousSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityPackage getCausalityPackage() {
		return (CausalityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CausalityPackage getPackage() {
		return CausalityPackage.eINSTANCE;
	}

} //CausalityFactoryImpl
