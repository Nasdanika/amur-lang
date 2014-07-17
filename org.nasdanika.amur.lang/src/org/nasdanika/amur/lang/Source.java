/**
 */
package org.nasdanika.amur.lang;

import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.Source#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.Source#getEditor <em>Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getSource()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Source extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see org.nasdanika.amur.lang.LangPackage#getSource_Language()
	 * @model containment="true"
	 * @generated
	 */
	Language<? extends Source> getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.Source#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language<? extends Source> value);
	
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' attribute.
	 * @see #setEditor(String)
	 * @see org.nasdanika.amur.lang.LangPackage#getSource_Editor()
	 * @model
	 * @generated
	 */
	String getEditor();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.Source#getEditor <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' attribute.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map<Object, Object> context);

	boolean isBlank();
	
	/**
	 * Renders source as a tooltip figure.
	 * @return
	 */
	IFigure getTooltip();

} // Source
