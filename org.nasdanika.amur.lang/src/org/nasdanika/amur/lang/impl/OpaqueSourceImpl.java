/**
 */
package org.nasdanika.amur.lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.OpaqueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OpaqueSourceImpl extends SourceImpl implements OpaqueSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.OPAQUE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Language<OpaqueSource> getLanguage() {
		return (Language<OpaqueSource>)eGet(LangPackage.Literals.SOURCE__LANGUAGE, true);
	}

	@Override
	public boolean isBlank() {
		Language<OpaqueSource> lang = getLanguage();		
		return lang==null ? false : lang.isBlank(this);
	}

} //OpaqueSourceImpl
