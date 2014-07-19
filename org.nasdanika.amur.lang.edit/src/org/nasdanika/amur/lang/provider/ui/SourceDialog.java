package org.nasdanika.amur.lang.provider.ui;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nasdanika.common.Activator;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

import org.nasdanika.amur.lang.Source;

public class SourceDialog extends org.eclipse.jface.dialogs.Dialog {

	private String title;
	private SourceComposite sourceComposite;
	private Source value;
	private AdapterFactory adapterFactory;
//	private IBindingService iBindingService;
//	private boolean keyFilterEnabled;
	private CompletionProviderFactory completionProvider;
	
	public SourceDialog(
			Shell parentShell, 
			String title, 
			Source value,
			AdapterFactory adapterFactory,
			CompletionProviderFactory completionProvider) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.value = value;
		this.adapterFactory = adapterFactory;
		this.completionProvider = completionProvider;
		
//		iBindingService = (IBindingService) PlatformUI.getWorkbench().getService(IBindingService.class);
//		keyFilterEnabled = iBindingService.isKeyFilterEnabled();
//		iBindingService.setKeyFilterEnabled(false); // To let keys to pass to Swing editors. Maybe disable conditionally in AWT editors only.
	}
	
//	@Override
//	public boolean close() {
//		iBindingService.setKeyFilterEnabled(keyFilterEnabled); // Restoring key filtering setting on dialog close.
//		return super.close();
//	}	
	
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.getShell().setImage(Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/source_code.png").createImage());
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		try {
			sourceComposite = new SourceComposite(root, SWT.NULL, value, adapterFactory, completionProvider);
		} catch (Exception e) {
			throw new org.nasdanika.amur.AmurException(e);
		}
		root.layout();
		return root;
	}
	
	public Source getValue() {
		return value;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId==IDialogConstants.OK_ID) {
			value = sourceComposite.getValue();
		}
		super.buttonPressed(buttonId);
	}
	
}
