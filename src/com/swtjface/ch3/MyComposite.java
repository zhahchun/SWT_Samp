package com.swtjface.ch3;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.Composite;

public class MyComposite extends Composite{

	public MyComposite(Composite parent) {
		super(parent, SWT.NONE);
//		MyGroup myGroup = new MyGroup(parent);
//		MySashForm mForm = new MySashForm(parent); ���Լ����Լ��ɵķ���
		parent.getShell().setText("Composite with Group and SashForm");
		MyGroup myGroup = new MyGroup(this);
		myGroup.setLocation(0,0);
		myGroup.pack();
		MySashForm mySashForm = new MySashForm(this);
		mySashForm.setLocation(140,25);
		mySashForm.pack();
		pack();
	}
	
}
