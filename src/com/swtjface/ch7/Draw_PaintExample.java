package com.swtjface.ch7;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Draw_PaintExample {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setSize(150, 150);
		canvas.setLocation(20, 20);
		canvas.addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent pe) {
				// TODO Auto-generated method stub
				GC gc = pe.gc;
				gc.drawArc(10, 10, 70, 90, 15, 10);
			}
		});
		shell.open();
		shell.setSize(200, 220);
		while(!shell.isDisposed()){
	    	if(!display.readAndDispatch()){
	    		display.sleep();
	    	}
	    }
		display.dispose();
	}
}
