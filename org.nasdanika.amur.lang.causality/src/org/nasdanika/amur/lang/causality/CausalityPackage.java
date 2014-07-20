/**
 */
package org.nasdanika.amur.lang.causality;

import org.nasdanika.amur.lang.LangPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.causality.CausalityFactory
 * @model kind="package"
 * @generated
 */
public interface CausalityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "causality";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur.lang.causality";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur.lang.causality";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CausalityPackage eINSTANCE = org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalitySource()
	 * @generated
	 */
	int CAUSALITY_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__LANGUAGE = LangPackage.TEXT_SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__EDITOR = LangPackage.TEXT_SOURCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__TEXT = LangPackage.TEXT_SOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__MODE = LangPackage.TEXT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__OUTPUT_EXPRESSION = LangPackage.TEXT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE__RETURN_EXPRESSION = LangPackage.TEXT_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_SOURCE_FEATURE_COUNT = LangPackage.TEXT_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityImpl <em>Causality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausality()
	 * @generated
	 */
	int CAUSALITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY__NAME = LangPackage.LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY__UID = LangPackage.LANGUAGE__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY__VERSION = LangPackage.LANGUAGE__VERSION;

	/**
	 * The number of structural features of the '<em>Causality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_FEATURE_COUNT = LangPackage.LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityCCImpl <em>CC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityCCImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityCC()
	 * @generated
	 */
	int CAUSALITY_CC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CC__NAME = CAUSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CC__UID = CAUSALITY__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CC__VERSION = CAUSALITY__VERSION;

	/**
	 * The number of structural features of the '<em>CC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CC_FEATURE_COUNT = CAUSALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityCPImpl <em>CP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityCPImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityCP()
	 * @generated
	 */
	int CAUSALITY_CP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CP__NAME = CAUSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CP__UID = CAUSALITY__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CP__VERSION = CAUSALITY__VERSION;

	/**
	 * The number of structural features of the '<em>CP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_CP_FEATURE_COUNT = CAUSALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityAPImpl <em>AP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityAPImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityAP()
	 * @generated
	 */
	int CAUSALITY_AP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_AP__NAME = CAUSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_AP__UID = CAUSALITY__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_AP__VERSION = CAUSALITY__VERSION;

	/**
	 * The number of structural features of the '<em>AP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSALITY_AP_FEATURE_COUNT = CAUSALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.TemplateElementImpl <em>Template Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.TemplateElementImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTemplateElement()
	 * @generated
	 */
	int TEMPLATE_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Template Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Template Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.TemplateImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.TranslationUnitImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTranslationUnit()
	 * @generated
	 */
	int TRANSLATION_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__ELEMENTS = TEMPLATE__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Translation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_FEATURE_COUNT = TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Translation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_OPERATION_COUNT = TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.SectionImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 8;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEMPLATE = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.ConditionalImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 9;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__PARTS = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl <em>Conditional Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getConditionalPart()
	 * @generated
	 */
	int CONDITIONAL_PART = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PART__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PART__TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>Conditional Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conditional Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.IterationImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 11;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__TEMPLATE = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__ITERABLE = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__KEY = TEMPLATE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VALUE = TEMPLATE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.TextImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.InterpolationImpl <em>Interpolation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.InterpolationImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getInterpolation()
	 * @generated
	 */
	int INTERPOLATION = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION__EXPRESSION = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpolation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interpolation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.EvaluationImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__CODE = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.WhenImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 15;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TEMPLATE = TEMPLATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__EXPRESSION = TEMPLATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__VARIABLE = TEMPLATE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = TEMPLATE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = TEMPLATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.ParallelSectionImpl <em>Parallel Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.ParallelSectionImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getParallelSection()
	 * @generated
	 */
	int PARALLEL_SECTION = 16;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SECTION__TEMPLATE = SECTION__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Parallel Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.SequentialSectionImpl <em>Sequential Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.SequentialSectionImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSequentialSection()
	 * @generated
	 */
	int SEQUENTIAL_SECTION = 17;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SECTION__TEMPLATE = SECTION__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Sequential Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequential Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.impl.SynchronousSectionImpl <em>Synchronous Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.impl.SynchronousSectionImpl
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSynchronousSection()
	 * @generated
	 */
	int SYNCHRONOUS_SECTION = 18;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SECTION__TEMPLATE = SECTION__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Synchronous Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronous Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.causality.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.causality.Mode
	 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 19;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.CausalitySource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalitySource
	 * @generated
	 */
	EClass getCausalitySource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.CausalitySource#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalitySource#getMode()
	 * @see #getCausalitySource()
	 * @generated
	 */
	EAttribute getCausalitySource_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.CausalitySource#getOutputExpression <em>Output Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Expression</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalitySource#getOutputExpression()
	 * @see #getCausalitySource()
	 * @generated
	 */
	EAttribute getCausalitySource_OutputExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.CausalitySource#getReturnExpression <em>Return Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Expression</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalitySource#getReturnExpression()
	 * @see #getCausalitySource()
	 * @generated
	 */
	EAttribute getCausalitySource_ReturnExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Causality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Causality</em>'.
	 * @see org.nasdanika.amur.lang.causality.Causality
	 * @generated
	 */
	EClass getCausality();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.CausalityCC <em>CC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CC</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalityCC
	 * @generated
	 */
	EClass getCausalityCC();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.CausalityCP <em>CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalityCP
	 * @generated
	 */
	EClass getCausalityCP();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.CausalityAP <em>AP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AP</em>'.
	 * @see org.nasdanika.amur.lang.causality.CausalityAP
	 * @generated
	 */
	EClass getCausalityAP();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.TemplateElement <em>Template Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Element</em>'.
	 * @see org.nasdanika.amur.lang.causality.TemplateElement
	 * @generated
	 */
	EClass getTemplateElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.nasdanika.amur.lang.causality.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.lang.causality.Template#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.amur.lang.causality.Template#getElements()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.TranslationUnit <em>Translation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Unit</em>'.
	 * @see org.nasdanika.amur.lang.causality.TranslationUnit
	 * @generated
	 */
	EClass getTranslationUnit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.nasdanika.amur.lang.causality.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.causality.Section#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.amur.lang.causality.Section#getTemplate()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Template();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see org.nasdanika.amur.lang.causality.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.lang.causality.Conditional#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.nasdanika.amur.lang.causality.Conditional#getParts()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Parts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.ConditionalPart <em>Conditional Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Part</em>'.
	 * @see org.nasdanika.amur.lang.causality.ConditionalPart
	 * @generated
	 */
	EClass getConditionalPart();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.ConditionalPart#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.amur.lang.causality.ConditionalPart#getCondition()
	 * @see #getConditionalPart()
	 * @generated
	 */
	EAttribute getConditionalPart_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.causality.ConditionalPart#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.amur.lang.causality.ConditionalPart#getTemplate()
	 * @see #getConditionalPart()
	 * @generated
	 */
	EReference getConditionalPart_Template();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see org.nasdanika.amur.lang.causality.Iteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.causality.Iteration#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.amur.lang.causality.Iteration#getTemplate()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Iteration#getIterable <em>Iterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterable</em>'.
	 * @see org.nasdanika.amur.lang.causality.Iteration#getIterable()
	 * @see #getIteration()
	 * @generated
	 */
	EAttribute getIteration_Iterable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Iteration#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.amur.lang.causality.Iteration#getKey()
	 * @see #getIteration()
	 * @generated
	 */
	EAttribute getIteration_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Iteration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.amur.lang.causality.Iteration#getValue()
	 * @see #getIteration()
	 * @generated
	 */
	EAttribute getIteration_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.amur.lang.causality.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.amur.lang.causality.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Interpolation <em>Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolation</em>'.
	 * @see org.nasdanika.amur.lang.causality.Interpolation
	 * @generated
	 */
	EClass getInterpolation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Interpolation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.amur.lang.causality.Interpolation#getExpression()
	 * @see #getInterpolation()
	 * @generated
	 */
	EAttribute getInterpolation_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see org.nasdanika.amur.lang.causality.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.Evaluation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.amur.lang.causality.Evaluation#getCode()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Code();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see org.nasdanika.amur.lang.causality.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.causality.When#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.amur.lang.causality.When#getTemplate()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.When#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.amur.lang.causality.When#getExpression()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.causality.When#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.amur.lang.causality.When#getVariable()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Variable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.ParallelSection <em>Parallel Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Section</em>'.
	 * @see org.nasdanika.amur.lang.causality.ParallelSection
	 * @generated
	 */
	EClass getParallelSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.SequentialSection <em>Sequential Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Section</em>'.
	 * @see org.nasdanika.amur.lang.causality.SequentialSection
	 * @generated
	 */
	EClass getSequentialSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.causality.SynchronousSection <em>Synchronous Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Section</em>'.
	 * @see org.nasdanika.amur.lang.causality.SynchronousSection
	 * @generated
	 */
	EClass getSynchronousSection();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.lang.causality.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see org.nasdanika.amur.lang.causality.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CausalityFactory getCausalityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.CausalitySourceImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalitySource()
		 * @generated
		 */
		EClass CAUSALITY_SOURCE = eINSTANCE.getCausalitySource();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSALITY_SOURCE__MODE = eINSTANCE.getCausalitySource_Mode();

		/**
		 * The meta object literal for the '<em><b>Output Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSALITY_SOURCE__OUTPUT_EXPRESSION = eINSTANCE.getCausalitySource_OutputExpression();

		/**
		 * The meta object literal for the '<em><b>Return Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSALITY_SOURCE__RETURN_EXPRESSION = eINSTANCE.getCausalitySource_ReturnExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityImpl <em>Causality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausality()
		 * @generated
		 */
		EClass CAUSALITY = eINSTANCE.getCausality();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityCCImpl <em>CC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityCCImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityCC()
		 * @generated
		 */
		EClass CAUSALITY_CC = eINSTANCE.getCausalityCC();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityCPImpl <em>CP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityCPImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityCP()
		 * @generated
		 */
		EClass CAUSALITY_CP = eINSTANCE.getCausalityCP();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.CausalityAPImpl <em>AP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityAPImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getCausalityAP()
		 * @generated
		 */
		EClass CAUSALITY_AP = eINSTANCE.getCausalityAP();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.TemplateElementImpl <em>Template Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.TemplateElementImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTemplateElement()
		 * @generated
		 */
		EClass TEMPLATE_ELEMENT = eINSTANCE.getTemplateElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.TemplateImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__ELEMENTS = eINSTANCE.getTemplate_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.TranslationUnitImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getTranslationUnit()
		 * @generated
		 */
		EClass TRANSLATION_UNIT = eINSTANCE.getTranslationUnit();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.SectionImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__TEMPLATE = eINSTANCE.getSection_Template();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.ConditionalImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__PARTS = eINSTANCE.getConditional_Parts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl <em>Conditional Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getConditionalPart()
		 * @generated
		 */
		EClass CONDITIONAL_PART = eINSTANCE.getConditionalPart();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_PART__CONDITION = eINSTANCE.getConditionalPart_Condition();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_PART__TEMPLATE = eINSTANCE.getConditionalPart_Template();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.IterationImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__TEMPLATE = eINSTANCE.getIteration_Template();

		/**
		 * The meta object literal for the '<em><b>Iterable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION__ITERABLE = eINSTANCE.getIteration_Iterable();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION__KEY = eINSTANCE.getIteration_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION__VALUE = eINSTANCE.getIteration_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.TextImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.InterpolationImpl <em>Interpolation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.InterpolationImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getInterpolation()
		 * @generated
		 */
		EClass INTERPOLATION = eINSTANCE.getInterpolation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPOLATION__EXPRESSION = eINSTANCE.getInterpolation_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.EvaluationImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__CODE = eINSTANCE.getEvaluation_Code();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.WhenImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__TEMPLATE = eINSTANCE.getWhen_Template();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__EXPRESSION = eINSTANCE.getWhen_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__VARIABLE = eINSTANCE.getWhen_Variable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.ParallelSectionImpl <em>Parallel Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.ParallelSectionImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getParallelSection()
		 * @generated
		 */
		EClass PARALLEL_SECTION = eINSTANCE.getParallelSection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.SequentialSectionImpl <em>Sequential Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.SequentialSectionImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSequentialSection()
		 * @generated
		 */
		EClass SEQUENTIAL_SECTION = eINSTANCE.getSequentialSection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.impl.SynchronousSectionImpl <em>Synchronous Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.impl.SynchronousSectionImpl
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getSynchronousSection()
		 * @generated
		 */
		EClass SYNCHRONOUS_SECTION = eINSTANCE.getSynchronousSection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.causality.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.causality.Mode
		 * @see org.nasdanika.amur.lang.causality.impl.CausalityPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //CausalityPackage
