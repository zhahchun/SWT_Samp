package com.swtjface.ch3;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.custom.SashForm;


public class MySashForm extends Composite{

	public MySashForm(Composite parent) {
		super(parent, SWT.NONE);
		SashForm sForm = new SashForm(this, SWT.VERTICAL);
		sForm.setSize(120,80);
		Button btn1 = new Button(sForm, SWT.ARROW|SWT.UP);
		btn1.setSize(120,40);
		Button btn2 = new Button(sForm, SWT.ARROW|SWT.DOWN);
		btn2.setBounds(0,40,60,40);   //前两位是位置，后两位是大小（在sashform中终于能控制了）
	}
	
}
