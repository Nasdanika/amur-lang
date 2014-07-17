/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.lang.LangPackage#getProxy()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Proxy<S extends Source, T extends Source> extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.amur.lang.Exception" monitorDataType="org.nasdanika.amur.lang.IProgressMonitor"
	 * @generated
	 */
	T resolve(S source, IProgressMonitor monitor) throws Exception;

} // Proxy
