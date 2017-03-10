package com.swtjface.ch4;


import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.swt.events.*;;




public class Event_key extends ApplicationWindow{

	KeyAdapter myKAdapter = new KeyAdapter() {
	
		public void keyPressed(KeyEvent e){
			String string = "original";
			if((e.stateMask&SWT.ALT)!=0){string += "ALT-";}
			if((e.stateMask&SWT.CTRL)!=0){string += "CTRL-";}
			if((e.stateMask&SWT.SHIFT)!=0){string += "SHIFT-";}
			if((e.stateMask&SWT.COMMAND)!=0){string += "COMMAND-";}
			
			switch (e.keyCode) {
			case SWT.BS:
				string += "BACKSPACE-";
				break;
			case SWT.CR:
				string += "CARRIAGE RETURN-";
				break;
			case SWT.DEL:
				string += "DELETE-";
				break;
			case SWT.ESC:
				string += "ESCAPE-";
				break;
			case SWT.LF:
				string += "LINE FEED-";
				break;
			case SWT.TAB:
				string += "TAB-";
				break;
			default:
				string += e.character;
				break;
			}
			System.out.println(string);
		}
	};
	
	public Event_key() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	protected Control createContents(Composite parent){
		Button btn = new Button(parent, SWT.CENTER);
// 		btn.setFocus(); 
//		btn.forceFocus();
 		btn.addKeyListener(myKAdapter);

// 		error: The method addKeyListener(KeyListener) in the type Control is not applicable for the arguments 
// 		 (KeyAdapter）>> because the wrong package imported 
		return parent;
	}
	public static void main(String[] args) {
		Event_key eKey = new Event_key();
		eKey.setBlockOnOpen(true);
		eKey.open();
		Display.getCurrent().dispose();
	}

//	addKeyListener按键为什么没反应： 因为没有获得焦点
//	setFocusable（true）；
//	获得焦点后 keylistener才有用  >> 照样没反应

}
