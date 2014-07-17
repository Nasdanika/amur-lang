/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.GenericLanguage#getMimeTypes <em>Mime Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getGenericLanguage()
 * @model
 * @generated
 */
public interface GenericLanguage extends Language<Source> {
	/**
	 * Returns the value of the '<em><b>Mime Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Types</em>' attribute list.
	 * @see org.nasdanika.amur.lang.LangPackage#getGenericLanguage_MimeTypes()
	 * @model
	 * @generated
	 */
	EList<String> getMimeTypes();

} // GenericLanguage
