/**
 */
package org.nasdanika.amur.lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.ByteSource;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.ByteSourceImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ByteSourceImpl extends SourceImpl implements ByteSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.BYTE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Language<ByteSource> getLanguage() {
		return (Language<ByteSource>)eGet(LangPackage.Literals.SOURCE__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBytes() {
		return (byte[])eGet(LangPackage.Literals.BYTE_SOURCE__BYTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(byte[] newBytes) {
		eSet(LangPackage.Literals.BYTE_SOURCE__BYTES, newBytes);
	}

	@Override
	public boolean isBlank() {
		Language<ByteSource> lang = getLanguage();
		if (lang==null) {
			byte[] bytes = getBytes();
			return bytes==null || bytes.length==0;
		}
		return lang.isBlank(this);
	}

} //ByteSourceImpl
