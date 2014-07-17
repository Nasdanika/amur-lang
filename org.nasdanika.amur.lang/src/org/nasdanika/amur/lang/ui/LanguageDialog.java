package org.nasdanika.amur.lang.ui;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;

import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.util.AmurUtil;
import org.nasdanika.amur.util.AmurUtil.FeatureFilter;

public class LanguageDialog extends org.eclipse.jface.dialogs.Dialog {

	private Language<?> value;
	private LanguageComposite languageComposite;
	private String title;
	private Image image;
	private AdapterFactory adapterFactory;
	private static final FeatureFilter SUPER_CLASS_FEATURE_FILTER = new AmurUtil.SuperClassFeatureFilter(LangPackage.eINSTANCE.getLanguage());
	
	public LanguageDialog(
			Shell parentShell, 
			String title,
			Language<?> value,
			AdapterFactory adapterFactory) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.value = value;
		this.title = title;
		this.adapterFactory = adapterFactory;
	}
	
	AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	void setValue(Language<?> value) {
		if (value!=null && this.value!=null) {
			AmurUtil.pumpFeatures(this.value, value, false, false, SUPER_CLASS_FEATURE_FILTER);
		}
		this.value = value;
	}
	
	void setImage(Image image) {
		this.image = image;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		try {
			languageComposite = new LanguageComposite(root, SWT.NULL, this);
		} catch (Exception e) {
			throw new AmurException(e);
		}
		root.layout();
		return root;
	}
	
	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button ret = super.createButton(parent, id, label, defaultButton);
		if (id == IDialogConstants.OK_ID) {
			languageComposite.setOkButton(ret);
		}
		return ret;
	}
	
	public Language<?> getValue() {
		return value;
	}
	
	public Image getImage() {
		return image;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
	
	/**
	 * Override to filter out languages.
	 * @param language
	 * @return
	 */
	protected boolean accept(Language<?> language) {
		return true;
	}
	
}
