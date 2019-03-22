import java.awt.*;
import javax.swing.*;
class BackgroundForground{
	
	JFrame jf;
	Frame f;
	BackgroundForground(String s){
		jf = new JFrame(s);
		jf.getContentPane().setBackground(Color.RED);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
		f = new Frame(s);
		f.setBackground(Color.blue);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	
	public static void main(String...a){
		new BackgroundForground("Set Background AND Forground Color");
	}
}