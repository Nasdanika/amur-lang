/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.lang.LangPackage
 * @generated
 */
public interface LangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangFactory eINSTANCE = org.nasdanika.amur.lang.impl.LangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Text Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Source</em>'.
	 * @generated
	 */
	TextSource createTextSource();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	PropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Byte Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Byte Source</em>'.
	 * @generated
	 */
	ByteSource createByteSource();

	/**
	 * Returns a new object of class '<em>Opaque Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Source</em>'.
	 * @generated
	 */
	OpaqueSource createOpaqueSource();

	/**
	 * Returns a new object of class '<em>Generic Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Language</em>'.
	 * @generated
	 */
	GenericLanguage createGenericLanguage();

	/**
	 * Returns a new object of class '<em>File Reference Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Reference Language</em>'.
	 * @generated
	 */
	<S extends Source> FileReferenceLanguage<S> createFileReferenceLanguage();

	/**
	 * Returns a new object of class '<em>File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Reference</em>'.
	 * @generated
	 */
	FileReference createFileReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LangPackage getLangPackage();

} //LangFactory
