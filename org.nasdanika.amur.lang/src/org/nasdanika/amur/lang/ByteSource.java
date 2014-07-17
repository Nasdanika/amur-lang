/**
 */
package org.nasdanika.amur.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.ByteSource#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.lang.LangPackage#getByteSource()
 * @model
 * @generated
 */
public interface ByteSource extends Source {
	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(byte[])
	 * @see org.nasdanika.amur.lang.LangPackage#getByteSource_Bytes()
	 * @model
	 * @generated
	 */
	byte[] getBytes();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.lang.ByteSource#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(byte[] value);

} // ByteSource
