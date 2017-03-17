package com.swtjface.ch7;



import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class DrawExample {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Drawing Example");
	    Canvas canvas = new Canvas(shell, SWT.NONE);
	    canvas.setSize(150,150);
	    canvas.setLocation(20, 20);
	    shell.open();
	    shell.setSize(200, 220);
	    GC gc = new GC(canvas);
	    gc.drawPolyline(new int[] {10,120,70,100,100,130,130,75});
	    gc.dispose();
	    while(!shell.isDisposed()){
	    	if(!display.readAndDispatch()){
	    		display.sleep();
	    	}
	   
	    }
	 	display.dispose();
	}
	
	
}
