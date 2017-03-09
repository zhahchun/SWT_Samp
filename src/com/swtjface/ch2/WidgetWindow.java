package com.swtjface.ch2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;


public class WidgetWindow extends ApplicationWindow{

	public WidgetWindow() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	protected Control createContents(Composite parent){
		getShell().setText("Widget Window");    //视窗标题显示
		parent.setSize(400,200);
		parent.setLayout(new RowLayout(SWT.VERTICAL));

		return parent;
	}
	public static void main(String[] args) {
		WidgetWindow wwin = new WidgetWindow();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}

}
