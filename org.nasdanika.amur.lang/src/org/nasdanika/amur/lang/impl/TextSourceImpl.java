/**
 */
package org.nasdanika.amur.lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.TextSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.TextSourceImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextSourceImpl extends SourceImpl implements TextSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.TEXT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Language<TextSource> getLanguage() {
		return (Language<TextSource>)eGet(LangPackage.Literals.SOURCE__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eGet(LangPackage.Literals.TEXT_SOURCE__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(LangPackage.Literals.TEXT_SOURCE__TEXT, newText);
	}

	@Override
	public boolean isBlank() {
		Language<TextSource> lang = getLanguage();
		if (lang==null) {
			String text = getText();
			return text==null || text.length()==0;
		}
		return lang.isBlank(this);
	}

} //TextSourceImpl
