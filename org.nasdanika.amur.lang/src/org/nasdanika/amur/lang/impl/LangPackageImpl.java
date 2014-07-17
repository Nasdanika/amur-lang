/**
 */
package org.nasdanika.amur.lang.impl;


import static org.nasdanika.amur.lang.LangPackage.PROXY;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.amur.lang.ByteSource;
import org.nasdanika.amur.lang.FileReference;
import org.nasdanika.amur.lang.FileReferenceLanguage;
import org.nasdanika.amur.lang.Filer;
import org.nasdanika.amur.lang.GenericLanguage;
import org.nasdanika.amur.lang.LangFactory;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.OpaqueSource;
import org.nasdanika.amur.lang.PropertyValue;
import org.nasdanika.amur.lang.Proxy;
import org.nasdanika.amur.lang.Script;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.SourceValidator;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.TextualFilerLanguage;
import org.nasdanika.amur.lang.TextualLanguage;
import org.nasdanika.amur.lang.Translator;
import org.nasdanika.amur.lang.util.LangValidator;
import org.nasdanika.common.Editor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangPackageImpl extends EPackageImpl implements LangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualFilerLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReferenceLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType editorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	 * @see org.nasdanika.amur.lang.LangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LangPackageImpl() {
		super(eNS_URI, LangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LangPackage init() {
		if (isInited) return (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Obtain or create and register package
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LangPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLangPackage.createPackageContents();

		// Initialize created meta-data
		theLangPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLangPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LangValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LangPackage.eNS_URI, theLangPackage);
		return theLangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceValidator() {
		return sourceValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Name() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Uid() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Version() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Language() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Editor() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSource() {
		return textSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSource_Text() {
		return (EAttribute)textSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Properties() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Value() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Type() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Value() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Description() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteSource() {
		return byteSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteSource_Bytes() {
		return (EAttribute)byteSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueSource() {
		return opaqueSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericLanguage() {
		return genericLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericLanguage_MimeTypes() {
		return (EAttribute)genericLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualLanguage() {
		return textualLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualFilerLanguage() {
		return textualFilerLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiler() {
		return filerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxy() {
		return proxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReferenceLanguage() {
		return fileReferenceLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileReferenceLanguage_Filer() {
		return (EReference)fileReferenceLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReference() {
		return fileReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileReference_Path() {
		return (EAttribute)fileReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslator() {
		return translatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEditor() {
		return editorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangFactory getLangFactory() {
		return (LangFactory)getEFactoryInstance();
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
		sourceValidatorEClass = createEClass(SOURCE_VALIDATOR);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__NAME);
		createEAttribute(languageEClass, LANGUAGE__UID);
		createEAttribute(languageEClass, LANGUAGE__VERSION);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__LANGUAGE);
		createEAttribute(sourceEClass, SOURCE__EDITOR);

		textSourceEClass = createEClass(TEXT_SOURCE);
		createEAttribute(textSourceEClass, TEXT_SOURCE__TEXT);

		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEReference(propertyEClass, PROPERTY__VALUE);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__TYPE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__DESCRIPTION);

		byteSourceEClass = createEClass(BYTE_SOURCE);
		createEAttribute(byteSourceEClass, BYTE_SOURCE__BYTES);

		opaqueSourceEClass = createEClass(OPAQUE_SOURCE);

		genericLanguageEClass = createEClass(GENERIC_LANGUAGE);
		createEAttribute(genericLanguageEClass, GENERIC_LANGUAGE__MIME_TYPES);

		textualLanguageEClass = createEClass(TEXTUAL_LANGUAGE);

		textualFilerLanguageEClass = createEClass(TEXTUAL_FILER_LANGUAGE);

		filerEClass = createEClass(FILER);

		proxyEClass = createEClass(PROXY);

		fileReferenceLanguageEClass = createEClass(FILE_REFERENCE_LANGUAGE);
		createEReference(fileReferenceLanguageEClass, FILE_REFERENCE_LANGUAGE__FILER);

		fileReferenceEClass = createEClass(FILE_REFERENCE);
		createEAttribute(fileReferenceEClass, FILE_REFERENCE__PATH);

		translatorEClass = createEClass(TRANSLATOR);

		// Create data types
		editorEDataType = createEDataType(EDITOR);
		iFileEDataType = createEDataType(IFILE);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		exceptionEDataType = createEDataType(EXCEPTION);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter sourceValidatorEClass_S = addETypeParameter(sourceValidatorEClass, "S");
		ETypeParameter languageEClass_S = addETypeParameter(languageEClass, "S");
		ETypeParameter filerEClass_S = addETypeParameter(filerEClass, "S");
		ETypeParameter proxyEClass_S = addETypeParameter(proxyEClass, "S");
		ETypeParameter proxyEClass_T = addETypeParameter(proxyEClass, "T");
		ETypeParameter fileReferenceLanguageEClass_S = addETypeParameter(fileReferenceLanguageEClass, "S");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSource());
		sourceValidatorEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(this.getSource());
		languageEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(this.getSource());
		filerEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(this.getSource());
		proxyEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(this.getSource());
		proxyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSource());
		fileReferenceLanguageEClass_S.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSourceValidator());
		EGenericType g2 = createEGenericType(languageEClass_S);
		g1.getETypeArguments().add(g2);
		languageEClass.getEGenericSuperTypes().add(g1);
		textSourceEClass.getESuperTypes().add(this.getSource());
		scriptEClass.getESuperTypes().add(this.getTextSource());
		byteSourceEClass.getESuperTypes().add(this.getSource());
		opaqueSourceEClass.getESuperTypes().add(this.getSource());
		g1 = createEGenericType(this.getLanguage());
		g2 = createEGenericType(this.getSource());
		g1.getETypeArguments().add(g2);
		genericLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLanguage());
		g2 = createEGenericType(this.getTextSource());
		g1.getETypeArguments().add(g2);
		textualLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTextualLanguage());
		textualFilerLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFiler());
		g2 = createEGenericType(this.getTextSource());
		g1.getETypeArguments().add(g2);
		textualFilerLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLanguage());
		g2 = createEGenericType(this.getFileReference());
		g1.getETypeArguments().add(g2);
		fileReferenceLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProxy());
		g2 = createEGenericType(this.getTextSource());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(fileReferenceLanguageEClass_S);
		g1.getETypeArguments().add(g2);
		fileReferenceLanguageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTranslator());
		fileReferenceLanguageEClass.getEGenericSuperTypes().add(g1);
		fileReferenceEClass.getESuperTypes().add(this.getSource());

		// Initialize classes and features; add operations and parameters
		initEClass(sourceValidatorEClass, SourceValidator.class, "SourceValidator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(sourceValidatorEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(sourceValidatorEClass_S);
		addEParameter(op, g1, "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Uid(), theEcorePackage.getEString(), "uid", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Version(), ecorePackage.getEString(), "version", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(languageEClass, this.getEditor(), "createEditors", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(languageEClass, null, "createSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSource(), "original", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(languageEClass_S);
		initEOperation(op, g1);

		addEOperation(languageEClass, theEcorePackage.getEString(), "mimeTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getLanguage());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSource());
		g2.setEUpperBound(g3);
		initEReference(getSource_Language(), g1, null, "language", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Editor(), theEcorePackage.getEString(), "editor", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(sourceEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textSourceEClass, TextSource.class, "TextSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextSource_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Properties(), this.getPropertyValue(), null, "properties", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Map.Entry.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Value(), this.getPropertyValue(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Type(), ecorePackage.getEString(), "type", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteSourceEClass, ByteSource.class, "ByteSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteSource_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, ByteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueSourceEClass, OpaqueSource.class, "OpaqueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericLanguageEClass, GenericLanguage.class, "GenericLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericLanguage_MimeTypes(), ecorePackage.getEString(), "mimeTypes", null, 0, -1, GenericLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textualLanguageEClass, TextualLanguage.class, "TextualLanguage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualFilerLanguageEClass, TextualFilerLanguage.class, "TextualFilerLanguage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filerEClass, Filer.class, "Filer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(filerEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(filerEClass_S);
		initEOperation(op, g1);

		op = addEOperation(filerEClass, null, "store", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(filerEClass_S);
		addEParameter(op, g1, "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		addEOperation(filerEClass, theEcorePackage.getEString(), "defaultExtension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(proxyEClass, Proxy.class, "Proxy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(proxyEClass, null, "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(proxyEClass_S);
		addEParameter(op, g1, "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(proxyEClass_T);
		initEOperation(op, g1);

		initEClass(fileReferenceLanguageEClass, FileReferenceLanguage.class, "FileReferenceLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getFiler());
		g2 = createEGenericType(fileReferenceLanguageEClass_S);
		g1.getETypeArguments().add(g2);
		initEReference(getFileReferenceLanguage_Filer(), g1, null, "filer", null, 0, 1, FileReferenceLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileReferenceEClass, FileReference.class, "FileReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileReference_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FileReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translatorEClass, Translator.class, "Translator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(editorEDataType, Editor.class, "Editor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LangPackageImpl
