/**
 */
package org.nasdanika.amur.lang.util;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.amur.lang.*;
import org.nasdanika.common.Editor;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.LangPackage
 * @generated
 */
public class LangValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LangValidator INSTANCE = new LangValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.amur.lang";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Source'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOURCE__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LangPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LangPackage.SOURCE_VALIDATOR:
				return validateSourceValidator((SourceValidator<?>)value, diagnostics, context);
			case LangPackage.LANGUAGE:
				return validateLanguage((Language<?>)value, diagnostics, context);
			case LangPackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case LangPackage.TEXT_SOURCE:
				return validateTextSource((TextSource)value, diagnostics, context);
			case LangPackage.SCRIPT:
				return validateScript((Script)value, diagnostics, context);
			case LangPackage.PROPERTY:
				return validateProperty((Map.Entry<?, ?>)value, diagnostics, context);
			case LangPackage.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case LangPackage.BYTE_SOURCE:
				return validateByteSource((ByteSource)value, diagnostics, context);
			case LangPackage.OPAQUE_SOURCE:
				return validateOpaqueSource((OpaqueSource)value, diagnostics, context);
			case LangPackage.GENERIC_LANGUAGE:
				return validateGenericLanguage((GenericLanguage)value, diagnostics, context);
			case LangPackage.TEXTUAL_LANGUAGE:
				return validateTextualLanguage((TextualLanguage)value, diagnostics, context);
			case LangPackage.TEXTUAL_FILER_LANGUAGE:
				return validateTextualFilerLanguage((TextualFilerLanguage)value, diagnostics, context);
			case LangPackage.FILER:
				return validateFiler((Filer<?>)value, diagnostics, context);
			case LangPackage.PROXY:
				return validateProxy((Proxy<?, ?>)value, diagnostics, context);
			case LangPackage.FILE_REFERENCE_LANGUAGE:
				return validateFileReferenceLanguage((FileReferenceLanguage<?>)value, diagnostics, context);
			case LangPackage.FILE_REFERENCE:
				return validateFileReference((FileReference)value, diagnostics, context);
			case LangPackage.TRANSLATOR:
				return validateTranslator((Translator)value, diagnostics, context);
			case LangPackage.EDITOR:
				return validateEditor((Editor)value, diagnostics, context);
			case LangPackage.IFILE:
				return validateIFile((IFile)value, diagnostics, context);
			case LangPackage.IPROGRESS_MONITOR:
				return validateIProgressMonitor((IProgressMonitor)value, diagnostics, context);
			case LangPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceValidator(SourceValidator<?> sourceValidator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)sourceValidator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language<?> language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)source, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)source, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(source, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource_validate(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return source.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSource(TextSource textSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)textSource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)textSource, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(textSource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(Script script, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)script, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)script, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(script, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Map.Entry<?, ?> property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteSource(ByteSource byteSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)byteSource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)byteSource, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(byteSource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueSource(OpaqueSource opaqueSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)opaqueSource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)opaqueSource, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(opaqueSource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericLanguage(GenericLanguage genericLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)genericLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualLanguage(TextualLanguage textualLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)textualLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualFilerLanguage(TextualFilerLanguage textualFilerLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)textualFilerLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiler(Filer<?> filer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)filer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProxy(Proxy<?, ?> proxy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)proxy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileReferenceLanguage(FileReferenceLanguage<?> fileReferenceLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)fileReferenceLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileReference(FileReference fileReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)fileReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)fileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSource_validate(fileReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslator(Translator translator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)translator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditor(Editor editor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIFile(IFile iFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIProgressMonitor(IProgressMonitor iProgressMonitor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateException(Exception exception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LangValidator
