/**
 */
package org.nasdanika.amur.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reference Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.FileReferenceLanguage#getFiler <em>Filer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getFileReferenceLanguage()
 * @model superTypes="org.nasdanika.amur.lang.Language<org.nasdanika.amur.lang.FileReference> org.nasdanika.amur.lang.Proxy<org.nasdanika.amur.lang.TextSource, S> org.nasdanika.amur.lang.Translator"
 * @generated
 */
public interface FileReferenceLanguage<S extends Source> extends Language<FileReference>, Proxy<TextSource, S>, Translator {
	/**
	 * Returns the value of the '<em><b>Filer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filer</em>' containment reference.
	 * @see #setFiler(Filer)
	 * @see org.nasdanika.amur.lang.LangPackage#getFileReferenceLanguage_Filer()
	 * @model containment="true"
	 * @generated
	 */
	Filer<S> getFiler();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.FileReferenceLanguage#getFiler <em>Filer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filer</em>' containment reference.
	 * @see #getFiler()
	 * @generated
	 */
	void setFiler(Filer<S> value);

} // FileReferenceLanguage
