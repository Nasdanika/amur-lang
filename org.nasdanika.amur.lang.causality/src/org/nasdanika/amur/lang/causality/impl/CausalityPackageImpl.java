/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.amur.lang.causality.Causality;
import org.nasdanika.amur.lang.causality.CausalityAP;
import org.nasdanika.amur.lang.causality.CausalityCC;
import org.nasdanika.amur.lang.causality.CausalityCP;
import org.nasdanika.amur.lang.causality.CausalityFactory;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.Conditional;
import org.nasdanika.amur.lang.causality.ConditionalPart;
import org.nasdanika.amur.lang.causality.Evaluation;
import org.nasdanika.amur.lang.causality.Interpolation;
import org.nasdanika.amur.lang.causality.Iteration;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.ParallelSection;
import org.nasdanika.amur.lang.causality.Section;
import org.nasdanika.amur.lang.causality.SequentialSection;
import org.nasdanika.amur.lang.causality.SynchronousSection;
import org.nasdanika.amur.lang.causality.Template;
import org.nasdanika.amur.lang.causality.TemplateElement;
import org.nasdanika.amur.lang.causality.Text;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.When;

import org.nasdanika.amur.lang.LangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CausalityPackageImpl extends EPackageImpl implements CausalityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalitySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalityCCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalityCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalityAPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.amur.lang.causality.CausalityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CausalityPackageImpl() {
		super(eNS_URI, CausalityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CausalityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CausalityPackage init() {
		if (isInited) return (CausalityPackage)EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI);

		// Obtain or create and register package
		CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CausalityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LangPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCausalityPackage.createPackageContents();

		// Initialize created meta-data
		theCausalityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCausalityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CausalityPackage.eNS_URI, theCausalityPackage);
		return theCausalityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausalitySource() {
		return causalitySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCausalitySource_Mode() {
		return (EAttribute)causalitySourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCausalitySource_OutputExpression() {
		return (EAttribute)causalitySourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCausalitySource_ReturnExpression() {
		return (EAttribute)causalitySourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausality() {
		return causalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausalityCC() {
		return causalityCCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausalityCP() {
		return causalityCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausalityAP() {
		return causalityAPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateElement() {
		return templateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_Elements() {
		return (EReference)templateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslationUnit() {
		return translationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Template() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Parts() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalPart() {
		return conditionalPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalPart_Condition() {
		return (EAttribute)conditionalPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalPart_Template() {
		return (EReference)conditionalPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteration() {
		return iterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Template() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteration_Iterable() {
		return (EAttribute)iterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteration_Key() {
		return (EAttribute)iterationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteration_Value() {
		return (EAttribute)iterationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpolation() {
		return interpolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpolation_Expression() {
		return (EAttribute)interpolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Code() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Template() {
		return (EReference)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_Expression() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_Variable() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelSection() {
		return parallelSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialSection() {
		return sequentialSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousSection() {
		return synchronousSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityFactory getCausalityFactory() {
		return (CausalityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		causalitySourceEClass = createEClass(CAUSALITY_SOURCE);
		createEAttribute(causalitySourceEClass, CAUSALITY_SOURCE__MODE);
		createEAttribute(causalitySourceEClass, CAUSALITY_SOURCE__OUTPUT_EXPRESSION);
		createEAttribute(causalitySourceEClass, CAUSALITY_SOURCE__RETURN_EXPRESSION);

		causalityEClass = createEClass(CAUSALITY);

		causalityCCEClass = createEClass(CAUSALITY_CC);

		causalityCPEClass = createEClass(CAUSALITY_CP);

		causalityAPEClass = createEClass(CAUSALITY_AP);

		templateElementEClass = createEClass(TEMPLATE_ELEMENT);

		templateEClass = createEClass(TEMPLATE);
		createEReference(templateEClass, TEMPLATE__ELEMENTS);

		translationUnitEClass = createEClass(TRANSLATION_UNIT);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__TEMPLATE);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__PARTS);

		conditionalPartEClass = createEClass(CONDITIONAL_PART);
		createEAttribute(conditionalPartEClass, CONDITIONAL_PART__CONDITION);
		createEReference(conditionalPartEClass, CONDITIONAL_PART__TEMPLATE);

		iterationEClass = createEClass(ITERATION);
		createEReference(iterationEClass, ITERATION__TEMPLATE);
		createEAttribute(iterationEClass, ITERATION__ITERABLE);
		createEAttribute(iterationEClass, ITERATION__KEY);
		createEAttribute(iterationEClass, ITERATION__VALUE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		interpolationEClass = createEClass(INTERPOLATION);
		createEAttribute(interpolationEClass, INTERPOLATION__EXPRESSION);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__CODE);

		whenEClass = createEClass(WHEN);
		createEReference(whenEClass, WHEN__TEMPLATE);
		createEAttribute(whenEClass, WHEN__EXPRESSION);
		createEAttribute(whenEClass, WHEN__VARIABLE);

		parallelSectionEClass = createEClass(PARALLEL_SECTION);

		sequentialSectionEClass = createEClass(SEQUENTIAL_SECTION);

		synchronousSectionEClass = createEClass(SYNCHRONOUS_SECTION);

		// Create enums
		modeEEnum = createEEnum(MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		causalitySourceEClass.getESuperTypes().add(theLangPackage.getTextSource());
		EGenericType g1 = createEGenericType(theLangPackage.getLanguage());
		EGenericType g2 = createEGenericType(this.getCausalitySource());
		g1.getETypeArguments().add(g2);
		causalityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theLangPackage.getTranslator());
		causalityEClass.getEGenericSuperTypes().add(g1);
		causalityCCEClass.getESuperTypes().add(this.getCausality());
		causalityCPEClass.getESuperTypes().add(this.getCausality());
		causalityAPEClass.getESuperTypes().add(this.getCausality());
		translationUnitEClass.getESuperTypes().add(this.getTemplate());
		sectionEClass.getESuperTypes().add(this.getTemplateElement());
		conditionalEClass.getESuperTypes().add(this.getTemplateElement());
		iterationEClass.getESuperTypes().add(this.getTemplateElement());
		textEClass.getESuperTypes().add(this.getTemplateElement());
		interpolationEClass.getESuperTypes().add(this.getTemplateElement());
		evaluationEClass.getESuperTypes().add(this.getTemplateElement());
		whenEClass.getESuperTypes().add(this.getTemplateElement());
		parallelSectionEClass.getESuperTypes().add(this.getSection());
		sequentialSectionEClass.getESuperTypes().add(this.getSection());
		synchronousSectionEClass.getESuperTypes().add(this.getSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(causalitySourceEClass, CausalitySource.class, "CausalitySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCausalitySource_Mode(), this.getMode(), "mode", "Sequential", 0, 1, CausalitySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCausalitySource_OutputExpression(), theEcorePackage.getEString(), "outputExpression", "", 0, 1, CausalitySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCausalitySource_ReturnExpression(), theEcorePackage.getEString(), "returnExpression", "", 0, 1, CausalitySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(causalityEClass, Causality.class, "Causality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causalityCCEClass, CausalityCC.class, "CausalityCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causalityCPEClass, CausalityCP.class, "CausalityCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causalityAPEClass, CausalityAP.class, "CausalityAP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateElementEClass, TemplateElement.class, "TemplateElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplate_Elements(), this.getTemplateElement(), null, "elements", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationUnitEClass, TranslationUnit.class, "TranslationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Template(), this.getTemplate(), null, "template", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_Parts(), this.getConditionalPart(), null, "parts", null, 0, -1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalPartEClass, ConditionalPart.class, "ConditionalPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalPart_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, ConditionalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalPart_Template(), this.getTemplate(), null, "template", null, 0, 1, ConditionalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterationEClass, Iteration.class, "Iteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteration_Template(), this.getTemplate(), null, "template", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIteration_Iterable(), theEcorePackage.getEString(), "iterable", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIteration_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIteration_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), ecorePackage.getEString(), "value", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interpolationEClass, Interpolation.class, "Interpolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpolation_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, Interpolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Code(), theEcorePackage.getEString(), "code", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhen_Template(), this.getTemplate(), null, "template", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhen_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhen_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelSectionEClass, ParallelSection.class, "ParallelSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialSectionEClass, SequentialSection.class, "SequentialSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronousSectionEClass, SynchronousSection.class, "SynchronousSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.PARALLEL);
		addEEnumLiteral(modeEEnum, Mode.SEQUENTIAL);
		addEEnumLiteral(modeEEnum, Mode.SYNCHRONOUS);

		// Create resource
		createResource(eNS_URI);
	}

} //CausalityPackageImpl
