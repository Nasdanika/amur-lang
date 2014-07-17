/**
 */
package org.nasdanika.amur.lang.impl;

import java.util.Map;

import javax.swing.JRootPane;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.common.Activator;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.SwtEditor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.impl.LanguageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.impl.LanguageImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.impl.LanguageImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LanguageImpl<S extends Source> extends CDOObjectImpl implements Language<S> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(LangPackage.Literals.LANGUAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(LangPackage.Literals.LANGUAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return (String)eGet(LangPackage.Literals.LANGUAGE__UID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		eSet(LangPackage.Literals.LANGUAGE__UID, newUid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(LangPackage.Literals.LANGUAGE__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(LangPackage.Literals.LANGUAGE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Editor> createEditors() {
		EList<Editor> ret = new BasicEList<>();
		for (String mt: mimeTypes()) {
			for (EditorProvider p: Activator.getEditorProviders(null, mt)) {
				Editor editor = createEditor(p, mt);
				if (editor!=null) {
					ret.add(editor);
				}
			};
		}
		return ret;
	}
	
	private Editor createEditor(EditorProvider provider, String mimeType) {
		
		final Editor editor = provider.createEditor(mimeType);
		if (editor==null) {
			return null;
		}
		
		if (editor instanceof SwtEditor) {
			return new SwtEditor() {
	
				@Override
				public Object getValue() {
					return editorValueToSource(editor.getValue());
				}
	
				@SuppressWarnings("unchecked")
				@Override
				public void setValue(Object value) {
					editor.setValue(sourceToEditorValue((S) value));
				}
	
				@Override
				public void setEnabled(boolean enabled) {
					editor.setEnabled(enabled);
				}

				@SuppressWarnings("unchecked")
				@Override
				public void createSwtContent(Control root, Object value, AdapterFactory adapterFactory, CompletionProviderFactory completionProvider) {
					((SwtEditor) editor).createSwtContent(root, sourceToEditorValue((S) value), adapterFactory, completionProvider);					
				}

				@Override
				public String getName() {
					return editor.getName();
				}

			};
		}
		
		if (editor instanceof AwtEditor) {
			return new AwtEditor() {
	
				@Override
				public Object getValue() {
					return editorValueToSource(editor.getValue());
				}
	
				@SuppressWarnings("unchecked")
				@Override
				public void setValue(Object value) {
					editor.setValue(sourceToEditorValue((S) value));
				}
	
				@Override
				public void setEnabled(boolean enabled) {
					editor.setEnabled(enabled);
				}

				@SuppressWarnings("unchecked")
				@Override
				public void createAwtContent(JRootPane root, Object value, CompletionProviderFactory autoCompletionProvider) {
					((AwtEditor) editor).createAwtContent(root, sourceToEditorValue((S) value), autoCompletionProvider);				
				}

				@Override
				public String getName() {
					return editor.getName();
				}
				
			};
		}
		
		return new Editor() {
			
			@Override
			public Object getValue() {
				return editorValueToSource(editor.getValue());
			}

			@SuppressWarnings("unchecked")
			@Override
			public void setValue(Object value) {
				editor.setValue(sourceToEditorValue((S) value));
			}

			@Override
			public void setEnabled(boolean enabled) {
				editor.setEnabled(enabled);
			}

			@Override
			public String getName() {
				return editor.getName();
			}

		};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S createSource(Source original) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> mimeTypes() {
		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostic, S source, Map<Object, Object> context) {
		return true;
	}

	@SuppressWarnings("unchecked")
	protected S editorValueToSource(Object value) {
		return (S) value;
	}

	protected Object sourceToEditorValue(Source source) {
		return source;
	}
	
	@Override
	public String toString() {
		return super.toString() + "{ name: "+getName()+", uid: "+getUid()+" }";
	}

} //LanguageImpl
