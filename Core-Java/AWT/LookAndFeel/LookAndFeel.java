import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LookAndFeel{

	JFrame jf;
	JButton[] b;
	
	LookAndFeel(String s){
		jf = new JFrame(s);
		b = new JButton[4];
		
		//WindowUtilities.sayeedSetMotifLookAndFeel();
		WindowUtilities.setNativeLookAndFeel();
		jf.addWindowListener(new ExitListener());
		
		jf.setLayout(new FlowLayout());
		for(int i=0; i< b.length; i++){
			b[i] = new JButton("Button " + i);
			jf.add(b[i]);
		}
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String...a){
		new LookAndFeel("Look And Feel Example1");
	}
}