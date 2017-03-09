package com.plumdevelop;


import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class Chapter02 {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Text text = new Text(shell, SWT.CENTER);
		text.setText("Hello Chapter2");
		text.pack();
		shell.pack();
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
