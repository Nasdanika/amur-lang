package org.nasdanika.amur.lang.ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.common.Activator;

public class LanguageComposite extends org.eclipse.swt.widgets.Composite {
	private Text filterText;
	private Label filterLabel;
	private Tree languageTree;
	private LanguageDialog owner;
	private Button okButton;
	
	public static boolean notBlank(String str) {
		return str!=null && str.trim().length()>0;
	}
	
	private boolean strMatches(String str) {
		return str!=null && str.trim().length()>0 && str.toLowerCase().contains(filterText.getText().trim().toLowerCase());
	}
	
	private class LanguageEntry {
		
		LanguageEntry(IConfigurationElement ce) throws Exception {
			language = (Language<?>) ce.createExecutableExtension("class");			
			String iconName = ce.getAttribute("icon");
			if (notBlank(iconName)) {
				IExtension extension = ce.getDeclaringExtension();
				String extendingPluginId = extension.getContributor().getName();
				org.eclipse.jface.resource.ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(extendingPluginId, iconName);
				image = imageDescriptor.createImage();
			} else if (owner.getAdapterFactory()!=null) {
				IItemLabelProvider labelProvider = (IItemLabelProvider) owner.getAdapterFactory().adapt(language, IItemLabelProvider.class);
				if (labelProvider!=null) {
					image = ExtendedImageRegistry.getInstance().getImage(labelProvider.getImage(language));
				}								
			}
			category = ce.getAttribute("category");
			keywords = ce.getAttribute("keywords");
			description = ce.getAttribute("description");
			url = ce.getAttribute("url");
			language.setUid(ce.getAttribute("id"));
			language.setVersion(ce.getAttribute("version"));
			language.setName(ce.getAttribute("name"));
		}
		
		boolean matches() {
			
			return owner.accept(language)
					&& (strMatches(keywords) 
							|| strMatches(language.getName())
							|| strMatches(description));			
		}
		
		Language<?> language;
		String description;
		Image image;
		String category;
		String keywords;
		String url;
		
		void createTreeItem(TreeItem parent) {			
			if (matches()) {
				TreeItem iItem = parent == null ? new TreeItem(languageTree, 0) : new TreeItem(parent, 0);
				iItem.setText(language.getName()==null ? "" : language.getName());
				if (image!=null) {
					iItem.setImage(image);
				}
				iItem.setData(this);
				Font font = iItem.getFont();
				FontData[] fontData = font.getFontData();
				for (FontData fd: fontData) {
					fd.setStyle(SWT.BOLD);
				}
				Font newFont = new Font(font.getDevice(), fontData);
				iItem.setFont(newFont);
				if (uidsEqual(language, owner.getValue())) {
					languageTree.setSelection(iItem);
				} else if (languageTree.getSelection().length==0) {
					languageTree.setSelection(iItem);
				}
			}
		}
	}
	
	private class Category {
		String id;
		String parentId;
		String name;
		String description;
		Image image;
		String url;
		
		Category() {
			// For root category.
		}
		
		Category(IConfigurationElement e) {			
			id = e.getAttribute("id");
			parentId = e.getAttribute("parent");
			name = e.getAttribute("name");
			description = e.getAttribute("description");
			url = e.getAttribute("url");
			String iconName = e.getAttribute("icon");
			if (notBlank(iconName)) {
				IExtension extension = e.getDeclaringExtension();
				String extendingPluginId = extension.getContributor().getName();
				org.eclipse.jface.resource.ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(extendingPluginId, iconName);
				image = imageDescriptor.createImage();
			} else {
				image = Activator.getImageDescriptor("icons/fugue/icons/folder-open.png").createImage();				
			}
			
			for (IConfigurationElement ce: e.getChildren()) {
				if ("category".equals(ce.getName())) {
					children.add(new Category(ce));
				} else if ("language".equals(ce.getName())) {
					try {
						languages.add(new LanguageEntry(ce));
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		}
		
		List<Category> children = new ArrayList<LanguageComposite.Category>();
		List<LanguageEntry> languages = new ArrayList<LanguageEntry>();
		
		int matchingLanguages() {
			int ret = 0; 
			for (LanguageEntry ie: languages) {
				if (ie.matches()) {
					++ret;
				}
			}
			for (Category c: children) {
				ret+=c.matchingLanguages();
			}
			return ret;
		}
		
		/**
		 * Merges argument category into this category or one of child categories.
		 * @param cat
		 * @return
		 */
		boolean merge(Category cat) {
			if (this.id != null && cat.id != null && this.id.equals(cat.id)) {
				Z: for (Category cc : cat.children) {
					for (Category c : children) {
						if (c.merge(cc)) {
							continue Z;
						}
					}
					children.add(cc);
				}

				Y: for (LanguageEntry cie : cat.languages) {
					for (LanguageEntry ie : languages) {
						if (uidsEqual(cie.language, ie.language)) {
							continue Y;
						}
					}
					languages.add(cie);
				}
				return true;
			}

			for (Category c : children) {
				if (c.merge(cat)) {
					return true;
				}
			}
			
			if (cat.parentId!=null && cat.parentId.equals(this.id)) {
				children.add(cat);
				return true;
			}
			return false;
		}
		
		/**
		 * Merges argument category into this category or one of child categories.
		 * @param cat
		 * @return
		 */
		boolean add(LanguageEntry ite) {
			if (ite.language.getUid() != null 
					&& this.id != null 
					&& ite.category != null 
					&& this.id.equals(ite.category)) {
				
				for (LanguageEntry ie : languages) {
					if (uidsEqual(ite.language, ie.language)) {
						continue;
					}
				}
				languages.add(ite);
				return true;
			}

			for (Category c : children) {
				if (c.add(ite)) {
					return true;
				}
			}
			return false;
		}

		public void sort() {
			Collections.sort(children, new Comparator<Category>() {

				@Override
				public int compare(Category o1, Category o2) {
					if (o1==null) {
						return o2==null ? 0 : 1;
					}
					if (o2==null) {
						return -1;
					}
					String n1 = o1.name;
					String n2 = o2.name;
					if (n1==null) {
						return n2==null ? o1.hashCode()-o2.hashCode() : 1;
					}
					if (n2==null) {
						return -1;
					}
					
					return n1.compareTo(n2);
				}
				
			});	
			
			Collections.sort(languages, new Comparator<LanguageEntry>() {

				@Override
				public int compare(LanguageEntry o1, LanguageEntry o2) {
					if (o1==null) {
						return o2==null ? 0 : 1;
					}
					if (o2==null) {
						return -1;
					}
					String n1 = o1.language.getName();
					String n2 = o2.language.getName();
					if (n1==null) {
						return n2==null ? o1.hashCode()-o2.hashCode() : 1;
					}
					if (n2==null) {
						return -1;
					}
					
					return n1.compareTo(n2);
				}
				
			});		
			
			for (Category c: children) {
				c.sort();
			}
		}
		
		void createTreeItem(TreeItem parent) {			
			if (matchingLanguages()>0) {
				TreeItem iItem = parent == null ? new TreeItem(languageTree, 0) : new TreeItem(parent, 0);
				iItem.setText(name==null ? "" : name);
				iItem.setData(this);
				if (image!=null) {
					iItem.setImage(image);
				}
				for (Category child: children) {
					child.createTreeItem(iItem);
				}
				for (LanguageEntry ite: languages) {
					ite.createTreeItem(iItem);
				}
			}
		}
				
	}
	
	private Category rootCategory = new Category();
	private Label descriptionLabel;
	private Link link;
	
	public LanguageComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style, 
			final LanguageDialog owner) throws Exception {
		super(parent, style);		
		this.owner = owner;
		
		loadCategoriesAndLanguages();
		
		GridLayout thisLayout = new GridLayout(2, false);
		this.setLayout(thisLayout);
		this.setSize(310, 373);

		filterLabel = new Label(this, SWT.NONE);
		GridData filterLabelLData = new GridData();
		filterLabel.setLayoutData(filterLabelLData);
		filterLabel.setText("Filter");
		filterText = new Text(this, SWT.BORDER);
		GridData filterTextLData = new GridData();
		filterTextLData.verticalAlignment = GridData.BEGINNING;
		filterTextLData.horizontalAlignment = GridData.FILL;
		filterTextLData.grabExcessHorizontalSpace = true;
		filterText.setLayoutData(filterTextLData);
		filterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent evt) {
				loadTree();
			}
		});
		GridData opTreeLData = new GridData();
		opTreeLData.horizontalSpan = 2;
		opTreeLData.horizontalAlignment = GridData.FILL;
		opTreeLData.verticalAlignment = GridData.FILL;
		opTreeLData.grabExcessHorizontalSpace = true;
		opTreeLData.grabExcessVerticalSpace = true;
		opTreeLData.heightHint = 200;
		opTreeLData.widthHint = 300;
		languageTree = new Tree(this, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		languageTree.setLayoutData(opTreeLData);
		languageTree.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if (okButton!=null & okButton.isEnabled()) {
					okButton.notifyListeners(SWT.Selection, new Event());
				}
			}
			
		});
		
		languageTree.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				onTreeSelection();
			}
			
		});
		
		descriptionLabel = new Label(this, SWT.WRAP);
		GridData descriptionLabelLData = new GridData();
		descriptionLabelLData.verticalAlignment = GridData.FILL;
		descriptionLabelLData.horizontalAlignment = GridData.FILL;
		descriptionLabelLData.horizontalSpan = 2;
		descriptionLabelLData.grabExcessHorizontalSpace = true;
		descriptionLabelLData.grabExcessVerticalSpace = true;
		descriptionLabelLData.heightHint=70;
		descriptionLabel.setLayoutData(descriptionLabelLData);
							
		link = new Link(this, SWT.WRAP);
		GridData linkLData = new GridData();
		linkLData.verticalAlignment = GridData.FILL;
		linkLData.horizontalAlignment = GridData.FILL;
		linkLData.horizontalSpan = 2;
		linkLData.grabExcessHorizontalSpace = true;
		linkLData.grabExcessVerticalSpace = true;
		link.setLayoutData(linkLData);	
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {			
			    IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
			    try {
		            URL webUrl = new URL((String) link.getData());
			        IWebBrowser browser = browserSupport.getExternalBrowser();
		            browser.openURL(webUrl);
			    } catch (Exception ex) { 
			    	ex.printStackTrace(); 
			    }
				
			}
		});
							
		this.layout();
		loadTree();
	}
	
	
	private static final String LANGUAGE_ID = "org.nasdanika.amur.lang.language";	
	
	private void loadCategoriesAndLanguages() throws Exception {		
		List<Category> categories = new ArrayList<Category>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(LANGUAGE_ID);
		for (IConfigurationElement ce: config) {
			if ("category".equals(ce.getName())) {
				Category cat = new Category(ce);
				if (!rootCategory.merge(cat)) {
					categories.add(cat);
				}
			}
		}

		Iterator<Category> rcit = categories.iterator();
		while (rcit.hasNext()) {
			Category prc = rcit.next();
			if (!notBlank(prc.parentId)) {
				rootCategory.children.add(prc);
				rcit.remove();
			}
		}
		
		boolean changed;
		do {
			changed = false;
			Iterator<Category> cit = categories.iterator();
			while (cit.hasNext()) {
				if (rootCategory.merge(cit.next())) {
					changed = true;
					cit.remove();
				}
			}			
		} while (changed && !categories.isEmpty());
		
		config = Platform.getExtensionRegistry().getConfigurationElementsFor(LANGUAGE_ID);
		for (IConfigurationElement ce: config) {
			if ("language".equals(ce.getName())) {
				LanguageEntry ite = new LanguageEntry(ce);
				if (!rootCategory.add(ite)) {
					rootCategory.languages.add(ite);
				}
			}
		}
		
		rootCategory.sort();
	}

	private boolean typeMatch(Object obj) {
		return obj instanceof LanguageEntry;
	}
	
	private void enableOk(boolean ok) {
		if (okButton!=null) {
			okButton.setEnabled(ok);
		}
	}
	
	public void setOkButton(Button okButton) {
		this.okButton = okButton;
		this.okButton.setEnabled(false);
	}

	public static boolean uidsEqual(Language<?> e1, Language<?> e2) {
		if (e1 != null && e2 != null) {
			String id1 = e1.getUid();
			String id2 = e2.getUid();
			return id1!=null && id2!=null && id1.trim().equals(id2.trim());			
		}
		return false;
	}
	
	protected void loadTree() {
		enableOk(false);
		languageTree.removeAll();		
		for (Category rc: rootCategory.children) {
			rc.createTreeItem(null);
		}
		for (LanguageEntry rite: rootCategory.languages) {
			rite.createTreeItem(null);
		}
		onTreeSelection();
	}

	private void onTreeSelection() {
		descriptionLabel.setText("");
		link.setText("");
		link.setData(null);
		if (languageTree.getSelectionCount()==1) {
			Object data = languageTree.getSelection()[0].getData();
			String descr = data instanceof LanguageEntry ? ((LanguageEntry) data).description : data instanceof Category ? ((Category) data).description : String.valueOf(data);
			if (notBlank(descr)) {
				descriptionLabel.setText(descr);
			}
			String url = data instanceof LanguageEntry ? ((LanguageEntry) data).url : data instanceof Category ? ((Category) data).url : null;
			if (notBlank(url)) {
				link.setText("<a>More info...</a>");
				link.setData(url);
			}
		}
		if (okButton!=null) {
			okButton.setEnabled(languageTree.getSelectionCount()==1 && typeMatch(languageTree.getSelection()[0].getData()));
			if (okButton.isEnabled()) {
				owner.setValue(EcoreUtil.copy(((LanguageEntry) languageTree.getSelection()[0].getData()).language));
				owner.setImage(languageTree.getSelection()[0].getImage());
			}
		}
	}

}
