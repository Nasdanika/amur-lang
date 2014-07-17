/**
 */
package org.nasdanika.amur.lang.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.amur.lang.*;

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
 * @see org.nasdanika.amur.lang.LangPackage
 * @generated
 */
public class LangSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangSwitch() {
		if (modelPackage == null) {
			modelPackage = LangPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LangPackage.SOURCE_VALIDATOR: {
				SourceValidator<?> sourceValidator = (SourceValidator<?>)theEObject;
				T1 result = caseSourceValidator(sourceValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.LANGUAGE: {
				Language<?> language = (Language<?>)theEObject;
				T1 result = caseLanguage(language);
				if (result == null) result = caseSourceValidator(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.SOURCE: {
				Source source = (Source)theEObject;
				T1 result = caseSource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.TEXT_SOURCE: {
				TextSource textSource = (TextSource)theEObject;
				T1 result = caseTextSource(textSource);
				if (result == null) result = caseSource(textSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T1 result = caseScript(script);
				if (result == null) result = caseTextSource(script);
				if (result == null) result = caseSource(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.PROPERTY: {
				@SuppressWarnings("unchecked") Map.Entry<String, PropertyValue> property = (Map.Entry<String, PropertyValue>)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				T1 result = casePropertyValue(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.BYTE_SOURCE: {
				ByteSource byteSource = (ByteSource)theEObject;
				T1 result = caseByteSource(byteSource);
				if (result == null) result = caseSource(byteSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.OPAQUE_SOURCE: {
				OpaqueSource opaqueSource = (OpaqueSource)theEObject;
				T1 result = caseOpaqueSource(opaqueSource);
				if (result == null) result = caseSource(opaqueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.GENERIC_LANGUAGE: {
				GenericLanguage genericLanguage = (GenericLanguage)theEObject;
				T1 result = caseGenericLanguage(genericLanguage);
				if (result == null) result = caseLanguage(genericLanguage);
				if (result == null) result = caseSourceValidator(genericLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.TEXTUAL_LANGUAGE: {
				TextualLanguage textualLanguage = (TextualLanguage)theEObject;
				T1 result = caseTextualLanguage(textualLanguage);
				if (result == null) result = caseLanguage(textualLanguage);
				if (result == null) result = caseSourceValidator(textualLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.TEXTUAL_FILER_LANGUAGE: {
				TextualFilerLanguage textualFilerLanguage = (TextualFilerLanguage)theEObject;
				T1 result = caseTextualFilerLanguage(textualFilerLanguage);
				if (result == null) result = caseTextualLanguage(textualFilerLanguage);
				if (result == null) result = caseFiler(textualFilerLanguage);
				if (result == null) result = caseLanguage(textualFilerLanguage);
				if (result == null) result = caseSourceValidator(textualFilerLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.FILER: {
				Filer<?> filer = (Filer<?>)theEObject;
				T1 result = caseFiler(filer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.PROXY: {
				Proxy<?, ?> proxy = (Proxy<?, ?>)theEObject;
				T1 result = caseProxy(proxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.FILE_REFERENCE_LANGUAGE: {
				FileReferenceLanguage<?> fileReferenceLanguage = (FileReferenceLanguage<?>)theEObject;
				T1 result = caseFileReferenceLanguage(fileReferenceLanguage);
				if (result == null) result = caseLanguage(fileReferenceLanguage);
				if (result == null) result = caseProxy(fileReferenceLanguage);
				if (result == null) result = caseTranslator(fileReferenceLanguage);
				if (result == null) result = caseSourceValidator(fileReferenceLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.FILE_REFERENCE: {
				FileReference fileReference = (FileReference)theEObject;
				T1 result = caseFileReference(fileReference);
				if (result == null) result = caseSource(fileReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LangPackage.TRANSLATOR: {
				Translator translator = (Translator)theEObject;
				T1 result = caseTranslator(translator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public <S extends Source> T1 caseSourceValidator(SourceValidator<S> object) {
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
	public <S extends Source> T1 caseLanguage(Language<S> object) {
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
	public T1 caseSource(Source object) {
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
	public T1 caseTextSource(TextSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Map.Entry<String, PropertyValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyValue(PropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseByteSource(ByteSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueSource(OpaqueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericLanguage(GenericLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextualLanguage(TextualLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Filer Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Filer Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextualFilerLanguage(TextualFilerLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends Source> T1 caseFiler(Filer<S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends Source, T extends Source> T1 caseProxy(Proxy<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Reference Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Reference Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends Source> T1 caseFileReferenceLanguage(FileReferenceLanguage<S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFileReference(FileReference object) {
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
	public T1 caseTranslator(Translator object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //LangSwitch
