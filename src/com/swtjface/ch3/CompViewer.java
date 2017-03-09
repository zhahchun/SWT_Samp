package com.swtjface.ch3;

import org.eclipse.jface.window.*;
import org.eclipse.swt.widgets.*;

public class CompViewer extends ApplicationWindow{

	public CompViewer() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	protected Control createContents(Composite parent) {
//		MyGroup myGroup = new MyGroup(parent);
//		return myGroup;
		
		MySashForm mForm = new MySashForm(parent);
		return mForm;
	}
	
	public static void main(String[] args) {
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
		
		
	}

}
