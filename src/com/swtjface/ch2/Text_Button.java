package com.swtjface.ch2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;


public class Text_Button extends ApplicationWindow{

	public Text_Button() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	protected Control createContents(Composite parent){
		getShell().setText("Widget Window");    //视窗标题显示
		parent.setSize(400,200);
		parent.setLayout(new RowLayout(SWT.VERTICAL));
//		解决btn1太大遮掉btn2的唯一解决办法只剩 layout了
		
		Label shadow_label = new Label(parent, SWT.CENTER|SWT.SHADOW_ETCHED_IN);
		//不知看不到shadow的效果，可能OS不支援
		shadow_label.setText("SWT.SHADOW_OUT"); 
		shadow_label.setBounds(30,60,60,15);
		
		Button btn1 = new Button(parent, SWT.PUSH| SWT.LEFT);	//push按钮后有大片白底把另一个按钮也遮掉
		btn1.setText("Push");
		System.out.println(btn1.getBounds());   //result: Rectangle {0, 0, 0, 0}
//		btn1.setBounds(1,1, 10,10); 
//		btn1.toControl(10, 10);  //same result: Rectangle {0, 0, 65, 32} 
//		btn1.setLocation(10, 10);  
		btn1.pack();  //result: Rectangle {10, 10, 65, 32}
		System.out.println(btn1.getBounds());    //result: Rectangle {10, 10, 10, 10}
//		the problem is that the native button size is over the bound of the window(parent), 
//		so resize line 26>> useless>> directly setsize>> also useless>> pack()
		Button btn2 = new Button(parent, SWT.ARROW|SWT.DOWN);  //ARROW, DOWN的常量要分开写才看得到箭头
		btn2.setText("Down");  
		btn2.setBounds(40,40, 40, 10);	//设定大小没效果
		btn2.setToolTipText("Down");  //箭头移至上方会有浮动text提示
		System.out.println(btn2.getBounds()); 	//result: Rectangle {20, 5, 14, 14}

		return parent;
	}
	public static void main(String[] args) {
		Text_Button wwin = new Text_Button();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}

}
