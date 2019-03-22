// It responses when change the state of window
// If we implements WindowListener then we have to override all abstract methods,
// 	Otherwise it will give error. WindowListener has 7 methods

import java.awt.*;
//import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WinListener implements WindowListener{
	
	Frame f;
	
	WinListener(){
		f = new Frame("Window Listener Program");
		f.addWindowListener(this);
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String...a){
		new WinListener();
	}
	
	public void windowActivated(WindowEvent we){
		System.out.println("Activated");
	}
	
	public void windowClosed(WindowEvent we){
		System.out.println("Closed");
	}
	
	public void windowClosing(WindowEvent we){
		System.out.println("Closing");
		f.dispose();
	}
	
	public void windowDeactivated(WindowEvent we){
		System.out.println("Deactiavted");
	}
	
	public void windowDeiconified(WindowEvent we){
		System.out.println("Deiconified");
	}
	
	public void windowIconified(WindowEvent we){
		System.out.println("Iconified");
	}
	
	public void windowOpened(WindowEvent we){
		System.out.println("Opened");
	}
}