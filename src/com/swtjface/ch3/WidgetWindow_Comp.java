package com.swtjface.ch3;

import org.eclipse.jface.window.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class WidgetWindow_Comp extends ApplicationWindow{

	public WidgetWindow_Comp() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Control createContents(Composite parent) {
		TabFolder tfolder = new TabFolder(parent, SWT.NONE);
		TabItem item = new TabItem(tfolder, SWT.NONE);
		item.setText("TabItem");
		item.setControl(new MyComposite(tfolder)); 
		getShell().setText("Widget Window with tabfolder of group and sashform");
		return parent;
	}
	
	public static void main(String[] args) {
		WidgetWindow_Comp wwComp = new WidgetWindow_Comp();
		wwComp.setBlockOnOpen(true);
		wwComp.open();
		Display.getCurrent().dispose();
	}

}
