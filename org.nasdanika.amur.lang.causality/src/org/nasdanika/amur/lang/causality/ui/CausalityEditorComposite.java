package org.nasdanika.amur.lang.causality.ui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JRootPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.nasdanika.amur.lang.causality.Causality;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class CausalityEditorComposite extends Composite {
	
	private RSyntaxTextAreaFacade textEditorFacade;
	private Causality language;
	private Combo combo;
	private Text outputExpressionText;
	private Text returnExpressionText;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param textMimeType 
	 * @param autoCompletionProvider 
	 */
	public CausalityEditorComposite(
			Composite parent, 
			int style, 
			Causality language,
			String textMimeType, 
			CompletionProviderFactory autoCompletionProvider) {
		
		super(parent, style);
		setLayout(new GridLayout(4, false));
		
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		this.setLayoutData(data);
		
		this.language = language;
		
		Label lblMode = new Label(this, SWT.NONE);
		lblMode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMode.setText("Mode");
		
		combo = new Combo(this, SWT.READ_ONLY);
		combo.setItems(new String[] {"Parallel", "Sequential", "Synchronous"});
		combo.setVisibleItemCount(3);
		GridData gd_combo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_combo.widthHint = 148;
		combo.setLayoutData(gd_combo);
		combo.select(1);
		
		Label lblOutputExpression = new Label(this, SWT.NONE);
		lblOutputExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOutputExpression.setText("Output expression");
		
		outputExpressionText = new Text(this, SWT.BORDER);
		outputExpressionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite = new Composite(this, SWT.EMBEDDED);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));
		
		Frame frame = SWT_AWT.new_Frame(composite);
		
		Panel panel = new Panel();
		frame.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JRootPane rootPane = new JRootPane();
		panel.add(rootPane);
		
		textEditorFacade = new RSyntaxTextAreaFacade();
		textEditorFacade.create(rootPane, textMimeType, "", autoCompletionProvider);
		
		Label lblReturn = new Label(this, SWT.NONE);
		lblReturn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblReturn.setText("Return");
		
		returnExpressionText = new Text(this, SWT.BORDER);
		returnExpressionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
	}
	
	public CausalitySource getValue() {
		CausalitySource ret = language.createSource(null);
		ret.setMode(Mode.values()[combo.getSelectionIndex()]);
		ret.setText(textEditorFacade.getText());
		ret.setOutputExpression(outputExpressionText.getText());
		ret.setReturnExpression(returnExpressionText.getText());
		return ret;
	}
	
	public void setValue(CausalitySource value) {
		if (value!=null) {
			combo.select(value.getMode().ordinal());
			textEditorFacade.setText(value.getText()==null ? "" : value.getText());
			outputExpressionText.setText(value.getOutputExpression()==null ? "" : value.getOutputExpression());
			returnExpressionText.setText(value.getReturnExpression()==null ? "" : value.getReturnExpression());
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
