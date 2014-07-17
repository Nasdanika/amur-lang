/**
 */
package org.nasdanika.amur.lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.FileReference;
import org.nasdanika.amur.lang.LangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.FileReferenceImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileReferenceImpl extends SourceImpl implements FileReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.FILE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eGet(LangPackage.Literals.FILE_REFERENCE__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(LangPackage.Literals.FILE_REFERENCE__PATH, newPath);
	}

	@Override
	public boolean isBlank() {
		return getPath()==null || getPath().trim().length()==0;
	}
	
	@Override
	public String toString() {
		return super.toString() + "{ language: "+getLanguage()+", path: "+getPath()+" }";
	}

} //FileReferenceImpl
