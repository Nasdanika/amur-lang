/**
 */
package org.nasdanika.amur.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.TextSource#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getTextSource()
 * @model
 * @generated
 */
public interface TextSource extends Source {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.amur.lang.LangPackage#getTextSource_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.TextSource#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextSource
