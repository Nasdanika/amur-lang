/**
 */
package org.nasdanika.amur.lang;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.lang.LangPackage#getFiler()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Filer<S extends Source> extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.amur.lang.Exception" fileDataType="org.nasdanika.amur.lang.IFile" monitorDataType="org.nasdanika.amur.lang.IProgressMonitor"
	 * @generated
	 */
	S load(IFile file, IProgressMonitor monitor) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.amur.lang.Exception" fileDataType="org.nasdanika.amur.lang.IFile" monitorDataType="org.nasdanika.amur.lang.IProgressMonitor"
	 * @generated
	 */
	void store(S source, IFile file, IProgressMonitor monitor) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String defaultExtension();

} // Filer
