package org.eclipse.e4.demo.minimal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Part {
private Composite parent;
	
	@Inject
	public Part(Composite parent) {
		this.parent = parent;
	}
	
	@PostConstruct
	public void createUI() {
		parent.setLayout(new GridLayout(2,false));
		
		Label l = new Label(parent, SWT.NONE);
		l.setText("Firstname");
		
		Text t = new Text(parent, SWT.BORDER);
		t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		l = new Label(parent, SWT.NONE);
		l.setText("Lastname");
		
		t = new Text(parent, SWT.BORDER);
		t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}
}
