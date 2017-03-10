package com.swtjface.ch4;

import org.eclipse.jface.window.*;
import org.eclipse.swt.*;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.*;

public class Event_mouse extends ApplicationWindow{

	MouseListener myMouseListener = new MouseListener() {
		
		@Override
		public void mouseUp(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("mouse up");
		}
		
		@Override
		public void mouseDown(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("mouse down");
		}
		
		@Override
		public void mouseDoubleClick(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("double click");
		}
	};
	
	MouseAdapter myMouseAdapter = new MouseAdapter() {
		public void mouseDoubleClick(MouseEvent arg0) {
			System.out.println("double click bound with mouseadapetr");
		}
	};
			
	public Event_mouse() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Button btn = new Button(parent, SWT.PUSH);
		btn.setText("Push");
		btn.addMouseListener(myMouseAdapter);
		return parent;
	}
	

	
	public static void main(String[] args) {
		Event_mouse eBtn = new Event_mouse();
		eBtn.setBlockOnOpen(true);
		eBtn.open();
		Display.getCurrent().dispose();
	}

}
