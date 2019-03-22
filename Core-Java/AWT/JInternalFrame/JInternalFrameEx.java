// To make JFrameInternale (Window Inside Window), we need to add JInternalFrame into JDesktopPane,
//		JDesktopPane will be add to JFrame

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JInternalFrameEx{	

	JFrame jf;
	
	JInternalFrameEx(){
		jf = new JFrame("JInternal Frame Example");
		jf.getContentPane().setBackground(Color.blue);
		
		// Add JDesktopPane into JFrame
		JDesktopPane jdp = new JDesktopPane();
		jdp.setBackground(Color.green);
		jf.add(jdp, BorderLayout.CENTER);
		
		// Add JInternalFrame into JDesktopPane
		Color[] colors = {Color.RED, Color.blue, Color.yellow, Color.BLACK};
		for(int i=0; i < colors.length; i++){
			//JInternalFrame  jif = new JInternalFrame("JInternalFrame "+ i, ResizeAble,CloseAble,MaximizeAble,MiniMizeAble);
			JInternalFrame  jif = new JInternalFrame("JInternalFrame "+ i, false, false, false,false);
			jif.setLocation(i*50+10, i*50+10);
			jif.setSize(300,250);
			jif.setBackground(colors[i]);
			jif.setVisible(true);
			//Add JInternalFrame Into JDesktopPane.
			jdp.add(jif);
			
			jif.moveToFront();
			//jif.moveToBack();
		}
		
		jf.setSize(800,800);
		jf.setVisible(true);	
		
	}
	public static void main(String...a){
		new JInternalFrameEx();
	}
}