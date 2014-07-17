/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Editor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.Language#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.Language#getUid <em>Uid</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.Language#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getLanguage()
 * @model abstract="true"
 * @generated
 */
public interface Language<S extends Source> extends SourceValidator<S> {
	
	/**
	 * Code type is passed as a context parameter to validation and 
	 * translation routines.
	 * @author Pavel
	 *
	 */
	enum CodeType {
		EXPRESSION,
		STATEMENT,
		FUNCTION,
		FUNCTION_BODY
	}
		
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.amur.lang.LangPackage#getLanguage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.Language#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see org.nasdanika.amur.lang.LangPackage#getLanguage_Uid()
	 * @model
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.Language#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.amur.lang.LangPackage#getLanguage_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.Language#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.amur.lang.Editor"
	 * @generated
	 */
	EList<Editor> createEditors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	S createSource(Source original);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> mimeTypes();

	boolean isBlank(S source);
	
	/**
	 * Renders source as tooltip.
	 * @param source
	 * @return
	 */
	IFigure getTooltip(Source source);

} // Language
