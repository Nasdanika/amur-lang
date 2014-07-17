/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.LangFactory
 * @model kind="package"
 * @generated
 */
public interface LangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur.lang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur.lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangPackage eINSTANCE = org.nasdanika.amur.lang.impl.LangPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.SourceValidator <em>Source Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.SourceValidator
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getSourceValidator()
	 * @generated
	 */
	int SOURCE_VALIDATOR = 0;

	/**
	 * The number of structural features of the '<em>Source Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_VALIDATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.LanguageImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = SOURCE_VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__UID = SOURCE_VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__VERSION = SOURCE_VALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = SOURCE_VALIDATOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.SourceImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__EDITOR = 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.TextSourceImpl <em>Text Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.TextSourceImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextSource()
	 * @generated
	 */
	int TEXT_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE__LANGUAGE = SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE__EDITOR = SOURCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE__TEXT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SOURCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.ScriptImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__LANGUAGE = TEXT_SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__EDITOR = TEXT_SOURCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__TEXT = TEXT_SOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PROPERTIES = TEXT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = TEXT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.PropertyImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.PropertyValueImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.ByteSourceImpl <em>Byte Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.ByteSourceImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getByteSource()
	 * @generated
	 */
	int BYTE_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_SOURCE__LANGUAGE = SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_SOURCE__EDITOR = SOURCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_SOURCE__BYTES = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_SOURCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.OpaqueSourceImpl <em>Opaque Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.OpaqueSourceImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getOpaqueSource()
	 * @generated
	 */
	int OPAQUE_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_SOURCE__LANGUAGE = SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_SOURCE__EDITOR = SOURCE__EDITOR;

	/**
	 * The number of structural features of the '<em>Opaque Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_SOURCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.GenericLanguageImpl <em>Generic Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.GenericLanguageImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getGenericLanguage()
	 * @generated
	 */
	int GENERIC_LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LANGUAGE__NAME = LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LANGUAGE__UID = LANGUAGE__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LANGUAGE__VERSION = LANGUAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LANGUAGE__MIME_TYPES = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LANGUAGE_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.TextualLanguageImpl <em>Textual Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.TextualLanguageImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextualLanguage()
	 * @generated
	 */
	int TEXTUAL_LANGUAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_LANGUAGE__NAME = LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_LANGUAGE__UID = LANGUAGE__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_LANGUAGE__VERSION = LANGUAGE__VERSION;

	/**
	 * The number of structural features of the '<em>Textual Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_LANGUAGE_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl <em>Textual Filer Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextualFilerLanguage()
	 * @generated
	 */
	int TEXTUAL_FILER_LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_FILER_LANGUAGE__NAME = TEXTUAL_LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_FILER_LANGUAGE__UID = TEXTUAL_LANGUAGE__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_FILER_LANGUAGE__VERSION = TEXTUAL_LANGUAGE__VERSION;

	/**
	 * The number of structural features of the '<em>Textual Filer Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_FILER_LANGUAGE_FEATURE_COUNT = TEXTUAL_LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.Filer <em>Filer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.Filer
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFiler()
	 * @generated
	 */
	int FILER = 12;

	/**
	 * The number of structural features of the '<em>Filer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.Proxy <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.Proxy
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 13;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.FileReferenceLanguageImpl <em>File Reference Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.FileReferenceLanguageImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFileReferenceLanguage()
	 * @generated
	 */
	int FILE_REFERENCE_LANGUAGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_LANGUAGE__NAME = LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_LANGUAGE__UID = LANGUAGE__UID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_LANGUAGE__VERSION = LANGUAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Filer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_LANGUAGE__FILER = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Reference Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_LANGUAGE_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.impl.FileReferenceImpl <em>File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.impl.FileReferenceImpl
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFileReference()
	 * @generated
	 */
	int FILE_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__LANGUAGE = SOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__EDITOR = SOURCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__PATH = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.lang.Translator <em>Translator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.lang.Translator
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTranslator()
	 * @generated
	 */
	int TRANSLATOR = 16;

	/**
	 * The number of structural features of the '<em>Translator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Editor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.Editor
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 17;


	/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 18;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 19;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 20;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.SourceValidator <em>Source Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Validator</em>'.
	 * @see org.nasdanika.amur.lang.SourceValidator
	 * @generated
	 */
	EClass getSourceValidator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see org.nasdanika.amur.lang.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.lang.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.Language#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.nasdanika.amur.lang.Language#getUid()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.Language#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.amur.lang.Language#getVersion()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Version();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.amur.lang.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.Source#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.nasdanika.amur.lang.Source#getLanguage()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.Source#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor</em>'.
	 * @see org.nasdanika.amur.lang.Source#getEditor()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Editor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.TextSource <em>Text Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Source</em>'.
	 * @see org.nasdanika.amur.lang.TextSource
	 * @generated
	 */
	EClass getTextSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.TextSource#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.amur.lang.TextSource#getText()
	 * @see #getTextSource()
	 * @generated
	 */
	EAttribute getTextSource_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.nasdanika.amur.lang.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.lang.Script#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.amur.lang.Script#getProperties()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Properties();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.amur.lang.PropertyValue" valueContainment="true"
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see org.nasdanika.amur.lang.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.PropertyValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.amur.lang.PropertyValue#getType()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.amur.lang.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.PropertyValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.lang.PropertyValue#getDescription()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.ByteSource <em>Byte Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Source</em>'.
	 * @see org.nasdanika.amur.lang.ByteSource
	 * @generated
	 */
	EClass getByteSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.ByteSource#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.nasdanika.amur.lang.ByteSource#getBytes()
	 * @see #getByteSource()
	 * @generated
	 */
	EAttribute getByteSource_Bytes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.OpaqueSource <em>Opaque Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Source</em>'.
	 * @see org.nasdanika.amur.lang.OpaqueSource
	 * @generated
	 */
	EClass getOpaqueSource();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.GenericLanguage <em>Generic Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Language</em>'.
	 * @see org.nasdanika.amur.lang.GenericLanguage
	 * @generated
	 */
	EClass getGenericLanguage();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.lang.GenericLanguage#getMimeTypes <em>Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mime Types</em>'.
	 * @see org.nasdanika.amur.lang.GenericLanguage#getMimeTypes()
	 * @see #getGenericLanguage()
	 * @generated
	 */
	EAttribute getGenericLanguage_MimeTypes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.TextualLanguage <em>Textual Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Language</em>'.
	 * @see org.nasdanika.amur.lang.TextualLanguage
	 * @generated
	 */
	EClass getTextualLanguage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.TextualFilerLanguage <em>Textual Filer Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Filer Language</em>'.
	 * @see org.nasdanika.amur.lang.TextualFilerLanguage
	 * @generated
	 */
	EClass getTextualFilerLanguage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Filer <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filer</em>'.
	 * @see org.nasdanika.amur.lang.Filer
	 * @generated
	 */
	EClass getFiler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see org.nasdanika.amur.lang.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.FileReferenceLanguage <em>File Reference Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reference Language</em>'.
	 * @see org.nasdanika.amur.lang.FileReferenceLanguage
	 * @generated
	 */
	EClass getFileReferenceLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.lang.FileReferenceLanguage#getFiler <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filer</em>'.
	 * @see org.nasdanika.amur.lang.FileReferenceLanguage#getFiler()
	 * @see #getFileReferenceLanguage()
	 * @generated
	 */
	EReference getFileReferenceLanguage_Filer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.FileReference <em>File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reference</em>'.
	 * @see org.nasdanika.amur.lang.FileReference
	 * @generated
	 */
	EClass getFileReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.lang.FileReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.amur.lang.FileReference#getPath()
	 * @see #getFileReference()
	 * @generated
	 */
	EAttribute getFileReference_Path();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.lang.Translator <em>Translator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translator</em>'.
	 * @see org.nasdanika.amur.lang.Translator
	 * @model instanceClass="org.nasdanika.amur.lang.Translator"
	 * @generated
	 */
	EClass getTranslator();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Editor</em>'.
	 * @see org.nasdanika.common.Editor
	 * @model instanceClass="org.nasdanika.common.Editor"
	 * @generated
	 */
	EDataType getEditor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LangFactory getLangFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.SourceValidator <em>Source Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.SourceValidator
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getSourceValidator()
		 * @generated
		 */
		EClass SOURCE_VALIDATOR = eINSTANCE.getSourceValidator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.LanguageImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__UID = eINSTANCE.getLanguage_Uid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__VERSION = eINSTANCE.getLanguage_Version();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.SourceImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__LANGUAGE = eINSTANCE.getSource_Language();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__EDITOR = eINSTANCE.getSource_Editor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.TextSourceImpl <em>Text Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.TextSourceImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextSource()
		 * @generated
		 */
		EClass TEXT_SOURCE = eINSTANCE.getTextSource();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_SOURCE__TEXT = eINSTANCE.getTextSource_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.ScriptImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__PROPERTIES = eINSTANCE.getScript_Properties();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.PropertyImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.PropertyValueImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__TYPE = eINSTANCE.getPropertyValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__DESCRIPTION = eINSTANCE.getPropertyValue_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.ByteSourceImpl <em>Byte Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.ByteSourceImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getByteSource()
		 * @generated
		 */
		EClass BYTE_SOURCE = eINSTANCE.getByteSource();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_SOURCE__BYTES = eINSTANCE.getByteSource_Bytes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.OpaqueSourceImpl <em>Opaque Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.OpaqueSourceImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getOpaqueSource()
		 * @generated
		 */
		EClass OPAQUE_SOURCE = eINSTANCE.getOpaqueSource();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.GenericLanguageImpl <em>Generic Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.GenericLanguageImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getGenericLanguage()
		 * @generated
		 */
		EClass GENERIC_LANGUAGE = eINSTANCE.getGenericLanguage();

		/**
		 * The meta object literal for the '<em><b>Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LANGUAGE__MIME_TYPES = eINSTANCE.getGenericLanguage_MimeTypes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.TextualLanguageImpl <em>Textual Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.TextualLanguageImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextualLanguage()
		 * @generated
		 */
		EClass TEXTUAL_LANGUAGE = eINSTANCE.getTextualLanguage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl <em>Textual Filer Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.TextualFilerLanguageImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTextualFilerLanguage()
		 * @generated
		 */
		EClass TEXTUAL_FILER_LANGUAGE = eINSTANCE.getTextualFilerLanguage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.Filer <em>Filer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.Filer
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFiler()
		 * @generated
		 */
		EClass FILER = eINSTANCE.getFiler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.Proxy <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.Proxy
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.FileReferenceLanguageImpl <em>File Reference Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.FileReferenceLanguageImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFileReferenceLanguage()
		 * @generated
		 */
		EClass FILE_REFERENCE_LANGUAGE = eINSTANCE.getFileReferenceLanguage();

		/**
		 * The meta object literal for the '<em><b>Filer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_REFERENCE_LANGUAGE__FILER = eINSTANCE.getFileReferenceLanguage_Filer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.impl.FileReferenceImpl <em>File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.impl.FileReferenceImpl
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getFileReference()
		 * @generated
		 */
		EClass FILE_REFERENCE = eINSTANCE.getFileReference();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REFERENCE__PATH = eINSTANCE.getFileReference_Path();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.lang.Translator <em>Translator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.lang.Translator
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getTranslator()
		 * @generated
		 */
		EClass TRANSLATOR = eINSTANCE.getTranslator();

		/**
		 * The meta object literal for the '<em>Editor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.Editor
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getEditor()
		 * @generated
		 */
		EDataType EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.amur.lang.impl.LangPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //LangPackage
