package com.swtjface.ch3;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class MyGroup extends Composite{  //can't named by Group, which is already defined by imported package

	public MyGroup(Composite parent) {
		super(parent,SWT.None);
		Group group = new Group(this,SWT.SHADOW_ETCHED_IN);
		group.setText("Group Label");
		Label label = new Label(group, SWT.SHADOW_NONE);
		label.setText("Two buttons:");
		label.setLocation(20, 20);
		label.pack();
		
		Button btn1 = new Button(group, SWT.PUSH);
		btn1.setText("Push Button");
//		btn1.setSize(100,100);  一样没作用，但至少不会充满整个视窗，（似乎是group 的作用）
		btn1.setBounds(20,100,20,100);  //前面两个数决定位置，后面那两个还不知作用
		btn1.pack();
		Button btn2 = new Button(group, SWT.CHECK);
		btn2.setText("Push Button");
		btn2.setBounds(20,75,90,30);
//		btn2.setBounds(50,75,200,30);   第一个数数有影响，第三个没差
		btn2.pack();
		
		group.pack();
	}

}
