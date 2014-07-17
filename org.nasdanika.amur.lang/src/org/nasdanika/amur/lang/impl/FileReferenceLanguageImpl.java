/**
 */
package org.nasdanika.amur.lang.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.amur.lang.FileReference;
import org.nasdanika.amur.lang.FileReferenceLanguage;
import org.nasdanika.amur.lang.Filer;
import org.nasdanika.amur.lang.LangFactory;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.common.Editor;
import org.nasdanika.common.SwtEditor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

import org.nasdanika.amur.util.AmurUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Reference Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.FileReferenceLanguageImpl#getFiler <em>Filer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileReferenceLanguageImpl<S extends Source> extends LanguageImpl<FileReference> implements FileReferenceLanguage<S> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FileReferenceLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.FILE_REFERENCE_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Filer<S> getFiler() {
		return (Filer<S>)eGet(LangPackage.Literals.FILE_REFERENCE_LANGUAGE__FILER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiler(Filer<S> newFiler) {
		eSet(LangPackage.Literals.FILE_REFERENCE_LANGUAGE__FILER, newFiler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S resolve(TextSource source, IProgressMonitor monitor) throws CoreException, Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @generated NOT
	 */
	public S resolve(FileReference source, IProgressMonitor monitor) throws Exception {
		if (source==null || source.getPath()==null || getFiler()==null) {
			return null;
		}
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
		IResource res = root.findMember(new Path((String) source.getPath()));
		if (res instanceof IFile) {
			return getFiler().load((IFile) res, monitor); 
		}
		
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Editor> createEditors() {
		return ECollections.<Editor>singletonEList(new SwtEditor() {
			
			FileReferenceComposite frc;
						
			@Override
			public Object getValue() {
				return frc==null ? null : frc.getValue();
			}

			@Override
			public void setValue(Object value) {
				if (frc!=null) {
					frc.setValue((FileReference) value);
				}
			}

			@Override
			public void setEnabled(boolean enabled) {
				frc.setEnabled(enabled);
			}

			@Override
			public void createSwtContent(Control root, Object value, AdapterFactory adapterFactory, CompletionProviderFactory completionProvider) {
				frc = new FileReferenceComposite((Composite) root, SWT.NONE, FileReferenceLanguageImpl.this, adapterFactory);
				if (value instanceof FileReference) {
					frc.setValue((FileReference) value);
				}
			}

			@Override
			public String getName() {
				return "File Reference";
			}
			
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FileReference createSource(Source original) {
		if (original instanceof FileReference) {
			FileReference fr = (FileReference) original;
			if (fr.getLanguage()!=null 
					&& fr.getLanguage().getUid()!=null 
					&& fr.getLanguage().getUid().equals(getUid())) {
				return fr;
			}
			fr = EcoreUtil.copy(fr);
			fr.setLanguage(EcoreUtil.copy(this));
			return fr;
		}
		FileReference ret = LangFactory.eINSTANCE.createFileReference();
		AmurUtil.pumpFeatures(original, ret, false, false, new AmurUtil.SuperClassFeatureFilter(LangPackage.eINSTANCE.getSource()));
		ret.setLanguage(EcoreUtil.copy(this));
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public boolean validate(DiagnosticChain diagnostic, FileReference source, Map<Object, Object> context) {
		boolean result = true;
		if (diagnostic!=null) {
			Filer<S> filer = getFiler();
			if (filer==null) {
				diagnostic.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 FileReference.class.getName(),
					 0,
					 "Filer (file language) is not set",
					 new Object [] { source }));
				
				result = false;
			}

			if (source==null || source.getPath()==null) {
				diagnostic.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 FileReference.class.getName(),
					 1,
					 "File name is not set",
					 new Object [] { source }));
				
				result = false;
			} else {
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
				IResource res = root.findMember(new Path((String) source.getPath()));
				if (res instanceof IFile) {
					if (filer!=null) {
						try {
							S content = filer.load((IFile) res, new NullProgressMonitor());
							if (filer instanceof Language) {
								BasicDiagnostic subDiagnostic = new BasicDiagnostic();
								result = ((Language<S>) filer).validate(subDiagnostic, content, context) && result;
								for (Diagnostic d: subDiagnostic.getChildren()) {
									diagnostic.add(
											new BasicDiagnostic(
													d.getSeverity(), 
													d.getSource(), 
													d.getCode(), 
													"["+source.getPath()+"] "+d.getMessage(), 
													new Object[] {source}));
								}
							}
						} catch (Exception e) {
							diagnostic.add
							(new BasicDiagnostic
								(Diagnostic.ERROR,
								 FileReference.class.getName(),
								 3,
								 "Could not validate content of " + source.getPath()+": "+e,
								 new Object [] { source }));
							
							result = false;
						}
					}
				} else {
					diagnostic.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FileReference.class.getName(),
						 4,
						 (res==null ? "File not found: " : "Not a file: ") + source.getPath(),
						 new Object [] { source }));
					
					result = false;
				}
			}			
		}
		return result;
	}

	@Override
	public boolean isBlank(FileReference source) {
		return source==null 
				|| source.getPath()==null 
				|| source.getPath().trim().length()==0
				|| source.getLanguage()==null;
	}

	@Override
	public Source translate(
			Source source, 
			String targetLanguageId,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			Collection<Runnable> undoCollector)
			throws Exception {
		if (source instanceof FileReference && getUid()!=null && getUid().equals(targetLanguageId)) {
			return resolve((FileReference) source, monitor);
		}
		return null;
	}

	@Override
	public Set<String> supportedTargetLanguages() {		
		return getFiler() instanceof Language ? Collections.singleton(((Language<?>) getFiler()).getUid()) : Collections.<String>emptySet();
	}

	@Override
	public EList<String> mimeTypes() {
		// NOP
		return null;
	}

	@Override
	public IFigure getTooltip(Source source) {
		// TODO Auto-generated method stub
		return null;
	}

} //FileReferenceLanguageImpl
