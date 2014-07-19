package org.nasdanika.amur.lang.provider.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.nasdanika.common.Awt2SwtEditorAdapter;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.SwtEditor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.ui.LanguageComposite;
import org.nasdanika.amur.lang.ui.LanguageDialog;

public class SourceComposite extends org.eclipse.swt.widgets.Composite {
	
	private CLabel languageLabel;
	private Composite editorsComposite;
	
	private StackLayout editorsCompositeLayout; 
	private CLabel languageNameLabel;
	private Button languageSelectionButton;
	
	private Combo editorsCombo;
	
	private class LanguageEntry {
		
		private class EditorEntry implements Comparable<EditorEntry> {
			SwtEditor editor;
			Composite editorComposite;
			
			EditorEntry(Editor editor) {
				if (editor instanceof SwtEditor) {
					this.editor = (SwtEditor) editor;
				} else if (editor instanceof AwtEditor) {
					this.editor = new Awt2SwtEditorAdapter((AwtEditor) editor);
				} else {
					throw new IllegalArgumentException("Unsupported editor type: "+editor.getClass());
				}
			}
			
			void activate(Object value) {
				if (editorComposite==null) {
					editorComposite = new Composite(editorsComposite, SWT.NULL);
					editorComposite.setLayout(new GridLayout());
					
					editor.createSwtContent(editorComposite, value, adapterFactory, completionProvider);
				} else {
					editor.setValue(value);
				}
				editorsCompositeLayout.topControl = editorComposite;
				editorsComposite.layout();
				editorsComposite.setVisible(true);
				activeEditor = this;
			}

			@Override
			public int compareTo(EditorEntry o) {				
				return editor.getName().compareTo(o.editor.getName());
			}
			
		}
		
		Language<?> language;
		List<EditorEntry> editors = new ArrayList<>();
		EditorEntry activeEditor; 
		
		LanguageEntry(Language<?> language, String activeEditorName) {
			this.language = language;
			for (Editor e: language.createEditors()) {
				editors.add(new EditorEntry(e));
			}
			this.activeEditor = this.editors.isEmpty() ? null : this.editors.get(0);
			if (activeEditorName!=null) {
				for (EditorEntry e: this.editors) {
					if (activeEditorName.equals(e.editor.getName())) {
						activeEditor = e; 
					}
				}
			}
			Collections.sort(editors);
		}
	}
		
	List<LanguageEntry> languageEntries = new ArrayList<LanguageEntry>();
	private Source value;
	private AdapterFactory adapterFactory;
	private CompletionProviderFactory completionProvider;
	private CLabel editorLabel;
			
	public SourceComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style,
			final Source value,
			final AdapterFactory adapterFactory,
			CompletionProviderFactory completionProvider) throws Exception {
		super(parent, style);
		this.value = value;
		this.adapterFactory = adapterFactory;
		this.completionProvider = completionProvider;
		GridLayout thisLayout = new GridLayout();
		thisLayout.numColumns = 5;
		this.setLayout(thisLayout);
		
		languageLabel = new CLabel(this, SWT.NONE);
		GridData languageLabelLData = new GridData();
		languageLabel.setLayoutData(languageLabelLData);
		languageLabel.setText("Language");
		
		GridData languageTextLData = new GridData();
		languageTextLData.horizontalAlignment = GridData.FILL;
		languageTextLData.grabExcessHorizontalSpace = true;
		languageNameLabel = new CLabel(this, SWT.BORDER);
		languageNameLabel.setLayoutData(languageTextLData);
	
		languageSelectionButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData languageSelectionButtonLData = new GridData();
		languageSelectionButton.setLayoutData(languageSelectionButtonLData);
		languageSelectionButton.setText("...");
		languageSelectionButton.addSelectionListener(new SelectionAdapter() {
			
		@Override
			public void widgetSelected(SelectionEvent e) {
				LanguageDialog inst = new LanguageDialog(						
						getShell(), 
						"Language",
						languageNameLabel.getData() instanceof LanguageEntry ? ((LanguageEntry) languageNameLabel.getData()).language : null,
						adapterFactory);
				
				if (inst.open()==Window.OK) {
					setLanguage(inst.getValue(), inst.getImage(), SourceComposite.this.value==null ? null : SourceComposite.this.value.getEditor());
				}				
			}	
			
		});
		
		editorLabel = new CLabel(this, SWT.NONE);
		GridData editorLabelLData = new GridData();
		editorLabel.setLayoutData(editorLabelLData);
		editorLabel.setText("Editor");
		editorLabel.setVisible(false);
		
		GridData editorComboLData = new GridData();
		editorComboLData.horizontalAlignment = GridData.FILL;
		editorComboLData.grabExcessHorizontalSpace = true;
		editorsCombo = new Combo(this, SWT.BORDER | SWT.READ_ONLY);
		editorsCombo.setLayoutData(editorComboLData);
		editorsCombo.setVisible(false);
		
		editorsComposite = new Composite(this, SWT.NONE);
		editorsCompositeLayout = new StackLayout();
		editorsCompositeLayout.topControl = null;
		GridData editorsCompositeLData = new GridData();
		editorsCompositeLData.horizontalAlignment = GridData.FILL;
		editorsCompositeLData.grabExcessHorizontalSpace = true;
		editorsCompositeLData.verticalAlignment = GridData.FILL;
		editorsCompositeLData.grabExcessVerticalSpace = true;
		editorsCompositeLData.horizontalSpan = 5;
		editorsCompositeLData.heightHint = 600;
		editorsCompositeLData.widthHint = 800;
		editorsComposite.setLayoutData(editorsCompositeLData);
		editorsComposite.setLayout(editorsCompositeLayout);
		
		this.layout();
		
		if (value!=null && value.getLanguage()!=null) {
			IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value.getLanguage(), IItemLabelProvider.class);
			Image image = labelProvider==null ? null : ExtendedImageRegistry.getInstance().getImage(labelProvider.getImage(value.getLanguage()));
			setLanguage(value.getLanguage(), image, value.getEditor()); 
		}	
		
		editorsCombo.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				LanguageEntry le = (LanguageEntry) languageNameLabel.getData();
				if (le!=null) {
					Object curValue = le.activeEditor.editor.getValue();
					le.editors.get(editorsCombo.getSelectionIndex()).activate(curValue);
				}
			}	
				
		});
				
	}
	
	public Source getValue() {
		LanguageEntry le = (LanguageEntry) languageNameLabel.getData();
		if (le==null) {
			return value;
		}
		Source ret = (Source) le.activeEditor.editor.getValue();
		if (ret!=null) {
			ret.setEditor(le.activeEditor.editor.getName());
		}
		return ret;
	}
	
	public void setLanguage(Language<?> language, Image image, String activeEditorName) {
		if (language==null) {
			languageNameLabel.setData(null);
			languageNameLabel.setText("");
			languageNameLabel.setImage(null);
			editorsComposite.setVisible(false);
		} else {
			LanguageEntry newEntry = null;
			for (LanguageEntry le: languageEntries) {
				if (le.language!=null && LanguageComposite.uidsEqual(language, le.language)) {
					newEntry = le;
					break;
				}
			}
			if (newEntry==null) {
				newEntry = new LanguageEntry(language, activeEditorName);
				languageEntries.add(newEntry);
			}
		
			if (newEntry!=languageNameLabel.getData()) {
				Object curValue = languageNameLabel.getData()==null ? value : ((LanguageEntry) languageNameLabel.getData()).activeEditor.editor.getValue(); 
				languageNameLabel.setData(null);
				
				// Set text and icon
				StringBuilder newLanguageDisplayName = new StringBuilder(language.getName()==null ? language.eClass().getName() : language.getName());
				if (language.getVersion()!=null) {
					newLanguageDisplayName.append(" ");
					newLanguageDisplayName.append(language.getVersion());
				}
				
				languageNameLabel.setText(newLanguageDisplayName.toString());
				languageNameLabel.setImage(image);
				
				if (newEntry.editors.size()>1) {
					editorsCombo.removeAll();
					for (LanguageEntry.EditorEntry e: newEntry.editors) {
						editorsCombo.add(e.editor.getName());
						if (e == newEntry.activeEditor) {
							editorsCombo.select(editorsCombo.getItemCount()-1);
						}
					}
					
					editorsCombo.setVisible(true);
					editorLabel.setVisible(true);											
				} else {
					editorsCombo.setVisible(false);
					editorLabel.setVisible(false);
				}
				
				languageNameLabel.setData(newEntry);						
				newEntry.activeEditor.activate(language.createSource((Source) curValue));
			}
		}
	}

}
