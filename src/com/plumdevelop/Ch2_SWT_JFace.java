package com.plumdevelop;

import org.eclipse.jface.window.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class Ch2_SWT_JFace extends ApplicationWindow{

	public Ch2_SWT_JFace() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	protected Control createContents(Composite parent){
		Text helloText = new Text(parent, SWT.CENTER);
		helloText.setText("Hello SWT & JFace");
		parent.pack();
		return parent;
	}
	
	public static void main(String[] args) {
		Ch2_SWT_JFace samp = new Ch2_SWT_JFace();
		samp.setBlockOnOpen(true);
		samp.open();
		Display.getCurrent().dispose();
	}
	
}
