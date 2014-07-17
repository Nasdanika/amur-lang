/**
 */
package org.nasdanika.amur.lang.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.TextualFilerLanguage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Filer Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TextualFilerLanguageImpl extends TextualLanguageImpl implements TextualFilerLanguage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualFilerLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.TEXTUAL_FILER_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextSource load(IFile file, IProgressMonitor monitor) throws Exception {
		if (file.exists()) {
			InputStreamReader reader = new InputStreamReader(file.getContents());
			int l;
			char[] buf = new char[4096];
			StringWriter sw = new StringWriter();
			while ((l=reader.read(buf))!=-1) {
				sw.write(buf, 0, l);
			}
			reader.close();
			sw.close();
			TextSource ret = createSource(null);
			ret.setText(sw.toString());
			return ret;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void store(TextSource source, IFile file, IProgressMonitor monitor) throws Exception {
		if (source!=null && source.getText()!=null) {
			InputStream is = new ByteArrayInputStream(source.getText().getBytes()); // Default encoding.
			if (file.exists()) {
				file.setContents(is, IResource.KEEP_HISTORY, monitor);
			} else {
				file.create(is, false, monitor);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String defaultExtension() {
		return ".txt";
	}

} //TextualFilerLanguageImpl
