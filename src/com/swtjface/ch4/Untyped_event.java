package com.swtjface.ch4;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class Untyped_event extends ApplicationWindow{

	Listener lisn = new Listener() {
		
		@Override
		public void handleEvent(Event e) {
			// TODO Auto-generated method stub
			switch (e.type) {
			case SWT.KeyDown:
				System.out.println("Key down: "+e.character);
				break;
			case SWT.MouseDown:
				System.out.println("Mouse down: "+e.button);
				break;
			case SWT.MouseDoubleClick:
				System.out.println("Mouse double click");
				break;
			default:
				break;
			}
		}
	};
	
	public Untyped_event() {
		super(null);
		// TODO Auto-generated constructor stub
	}
	
	protected Control createContents(Composite parent) {
		Button btn = new Button(parent, SWT.CENTER);
		btn.addListener(SWT.KeyDown, lisn);
		btn.addListener(SWT.MouseDown, lisn);
		btn.addListener(SWT.MouseDoubleClick, lisn);
		return parent;
	}
	
	public static void main(String[] args) {
		Untyped_event uEvent = new Untyped_event();
		uEvent.setBlockOnOpen(true);
		uEvent.open();
		Display.getCurrent().dispose();
	}

}
