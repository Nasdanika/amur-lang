package org.nasdanika.amur.lang.impl;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.nasdanika.amur.lang.FileReference;
import org.nasdanika.amur.lang.FileReferenceLanguage;
import org.nasdanika.amur.lang.Filer;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.ui.LanguageComposite;
import org.nasdanika.amur.lang.ui.LanguageDialog;

public class FileReferenceComposite extends org.eclipse.swt.widgets.Composite {
	
	private CLabel languageLabel;
	private CLabel fileLabel;

	private CLabel languageNameLabel;
	private CLabel fileNameLabel;
	
	private Button languageSelectionButton;
	private Button fileSelectionButton;
	private AdapterFactory adapterFactory;
	private FileReferenceLanguage<?> language;
	
	public FileReferenceComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style,
			FileReferenceLanguage<?> language,
			final AdapterFactory adapterFactory) {
		super(parent, style);
		
		this.language = language;
		
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		this.setLayoutData(data);

		GridLayout thisLayout = new GridLayout();
		thisLayout.numColumns = 3;
		
		this.setLayout(thisLayout);
		this.adapterFactory = adapterFactory;
		
		languageLabel = new CLabel(this, SWT.NONE);
		GridData languageLabelLData = new GridData();
		languageLabel.setLayoutData(languageLabelLData);
		languageLabel.setText("File language");
		
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
						languageNameLabel.getData() instanceof Language ? ((Language<?>) languageNameLabel.getData()) : null,
						adapterFactory) {
					
					@Override
					protected boolean accept(Language<?> language) {
						return language instanceof Filer;
					}
				};
				
				if (inst.open()==Window.OK) {
					setLanguage(inst.getValue(), inst.getImage());
				}				
			}	
			
		});
								

		fileLabel = new CLabel(this, SWT.NONE);
		GridData fileLabelLData = new GridData();
		fileLabel.setLayoutData(fileLabelLData);
		fileLabel.setText("File");
		
		GridData fileTextLData = new GridData();
		fileTextLData.horizontalAlignment = GridData.FILL;
		fileTextLData.grabExcessHorizontalSpace = true;
		fileNameLabel = new CLabel(this, SWT.BORDER);
		fileNameLabel.setLayoutData(fileTextLData);
	
		fileSelectionButton = new Button(this, SWT.PUSH | SWT.CENTER);
		GridData fileSelectionButtonLData = new GridData();
		fileSelectionButton.setLayoutData(fileSelectionButtonLData);
		fileSelectionButton.setText("...");
		fileSelectionButton.addSelectionListener(new SelectionAdapter() {
			
		@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
				IAdaptable res;
				if (fileNameLabel.getText()!=null) {
					res = root.findMember(new Path(fileNameLabel.getText()));
					if (res==null) {
						res = root;
					}
				} else {
					res = root;
				}
				
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				dialog.setTitle("File Selection");
				dialog.setMessage("Select reference target:");
				dialog.setInput(root);
				dialog.setInitialSelection(res);
				
				if (dialog.open() == Window.OK) {
					Object[] ret = dialog.getResult();
					if (ret.length==1 && ret[0] instanceof IResource) {
						fileNameLabel.setText(((IResource) ret[0]).getFullPath().toPortableString());
					}
				}
				
			}	
			
		});
								
		
		this.layout();
	}

	void setValue(FileReference value) {
		if (value!=null && value.getLanguage() instanceof FileReferenceLanguage) {
			Filer<?> filer = ((FileReferenceLanguage<?>) value.getLanguage()).getFiler();
			if (filer!=null) {
				IItemLabelProvider labelProvider = this.adapterFactory==null ? null : (IItemLabelProvider) this.adapterFactory.adapt(filer, IItemLabelProvider.class);
				Image image = labelProvider==null ? null : ExtendedImageRegistry.getInstance().getImage(labelProvider.getImage(filer));
				setLanguage((Language<?>) filer, image); 
			}
			language = (FileReferenceLanguage<?>) value.getLanguage();
		}	
		
		if (value!=null) {
			fileNameLabel.setText(value.getPath());
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FileReference getValue() {
		Language<?> lang = (Language<?>) languageNameLabel.getData();
		FileReferenceLanguage<?> frl = EcoreUtil.copy(language);
		if (lang instanceof Filer) {
			frl.setFiler((Filer) EcoreUtil.copy(lang));
		}
		FileReference ret = frl.createSource(null);
		ret.setLanguage(frl);
		ret.setPath(fileNameLabel.getText());
		return ret;
	}
	
	public void setLanguage(Language<?> language, Image image) {
		if (language==null) {
			languageNameLabel.setData(null);
			languageNameLabel.setText("");
			languageNameLabel.setImage(null);
		} else if (!LanguageComposite.uidsEqual(language, (Language<?>) languageNameLabel.getData())) {
			
			StringBuilder newLanguageDisplayName = new StringBuilder(language.getName()==null ? language.eClass().getName() : language.getName());
			if (language.getVersion()!=null) {
				newLanguageDisplayName.append(" ");
				newLanguageDisplayName.append(language.getVersion());
			}
			
			languageNameLabel.setText(newLanguageDisplayName.toString());
			languageNameLabel.setImage(image);
			languageNameLabel.setData(language);
		}
	}

}
