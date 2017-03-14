package com.swtjface.ch4;

import org.eclipse.jface.action.*;
import org.eclipse.jface.resource.*;

public class Action_status extends Action{
	StatusLineManager sLineManager;
	short triggercount = 0;
	public Action_status(StatusLineManager sm){
		super("&Trigger@CTR+T",AS_PUSH_BUTTON);
		sLineManager = sm;
		setToolTipText("CRT+T trigger the action");
		setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(), "eclipse32.gif"));
	}
	
	public void run(){
		triggercount++;
		sLineManager.setMessage("The status action has been fired at the triggercount: "+triggercount);
	}
}
