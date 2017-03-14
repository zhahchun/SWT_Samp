package com.swtjface.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class Comp_for_action extends Composite{
	public Comp_for_action(Composite parent){
		super(parent, SWT.NONE);
		parent.getShell().setText("Test what the default action control looks like");
		Action_status aStatus = new Action_status();
	}
}
