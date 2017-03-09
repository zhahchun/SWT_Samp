package com.plumdevelop;



import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseEvent;

public class OpenShell{
	public static void main(String [] args){
		Display display = new Display();
		Shell shell = new Shell(display);
		initShell(shell);
		shell.open();
		while (!shell.isDisposed()) {
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}

private static void initShell(Shell shell){
	GridLayout glShell = new GridLayout();
	shell.setLayout(glShell);
	
	Composite panel = new Composite(shell, SWT.NONE);
	GridData gdPanel = new GridData(GridData.GRAB_HORIZONTAL|GridData.GRAB_VERTICAL|GridData.FILL_BOTH);
	panel.setLayoutData(gdPanel);
	GridLayout glPanel = new GridLayout();
	panel.setLayout(glPanel);
	final Color bgColor = new Color(Display.getCurrent(),150,0,150);
	panel.setBackground(bgColor);
	final Text text = new Text(panel,SWT.MULTI|SWT.WRAP);
	text.setText("Hello SWT");
	GridData gdText = new GridData(GridData.GRAB_HORIZONTAL|GridData.GRAB_VERTICAL|GridData.FILL_BOTH);
	text.setLayoutData(gdText);
	
	Button btn = new Button(panel, SWT.PUSH);
	btn.setText("Push");
	btn.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseUp(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDown(MouseEvent arg0) {
			// TODO Auto-generated method stub
			text.setText("See you");
			
		}
		
		@Override
		public void mouseDoubleClick(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
	
	shell.addDisposeListener(new DisposeListener() {
		
		@Override
		public void widgetDisposed(DisposeEvent arg0) {
			// TODO Auto-generated method stub
			bgColor.dispose();
		}
	});
}
}