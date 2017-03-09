package com.swtjface.ch2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.window.*;


public class List_Buttons extends ApplicationWindow{

	public List_Buttons() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	protected Control createContents(Composite parent){
		getShell().setText("List of Buttons");    //视窗标题显示
		parent.setLayout(new RowLayout(SWT.VERTICAL));
		
		Button btn1 = new Button(parent, SWT.TOGGLE);
		btn1.setText("toggle选我");
//		btn1.setSize(80,80);   uesless
		btn1.pack();
//		btn1.setSelection(true);  //预选
		
		Button[] arrbtn = new Button[4];
		arrbtn[0] = new Button(parent, SWT.CHECK);
		arrbtn[0].setText("check01");
//		arrbtn[0].setLocation(100, 60);  useless
//		arrbtn[0].pack(); 没效果，可能因为放在layout内>> comment layout 也没法定大小
		arrbtn[1] = new Button(parent, SWT.CHECK);
		arrbtn[1].setText("check02");
//		arrbtn[0].setLocation(30, 90);
		arrbtn[2] = new Button(parent, SWT.CHECK);
		arrbtn[2].setText("check03");
		arrbtn[2].setSelection(true);
		arrbtn[3] = new Button(parent, SWT.CHECK);
		arrbtn[3].setText("check04");
		
		Button[] arrbtn2 = new Button[3];
		arrbtn2[0] = new Button(parent, SWT.RADIO);
		arrbtn2[0].setText("radio01");
		arrbtn2[0].setSelection(true);
		arrbtn2[1] = new Button(parent, SWT.RADIO);
		arrbtn2[1].setText("radio02");
		arrbtn2[2] = new Button(parent, SWT.RADIO);
		arrbtn2[2].setText("radio03");
		
		for(Button btn:arrbtn2){	//之后改选择也不会执行
			if(btn.getSelection()){
				System.out.println(btn.getText());
			}
		}
		
		RadioGroupFieldEditor rgfe = new RadioGroupFieldEditor("UserChoice", "Select one option",1,
				new String[][]{{"Choice01","ch1"},{"Choice02","ch2"},{"Choice03","ch3"}}, parent);
		
		parent.pack();
		return parent;
	}
	public static void main(String[] args) {
		List_Buttons wwin = new List_Buttons();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}

}
