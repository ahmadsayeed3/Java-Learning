import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Clayout implements ActionListener
{
	JFrame f;
	JButton b[];
	JPanel jp;
	CardLayout cl;
	
	
	Clayout(String s)
	{
		String[] ic = {"1.jpg","2.jpg","3.JPG","4.jpg","5.jpg"};
		f = new JFrame(s);
		cl = new CardLayout();
		jp = new JPanel();
		jp.setLayout(cl);
		
		//String[] s1 = {"north", "south", "east", "west", "center"};
		
		b = new JButton[5];
		for(int i =0; i<b.length; i++){
			b[i] = new JButton();
			ImageIcon icon = new ImageIcon(ic[i]);
			b[i].setIcon(icon);
			b[i].addActionListener(this);
			jp.add(b[i]);//, s1[i]
		}
		f.add(jp);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		cl.next(jp);
	}
	
	public static void main(String...a){
		new Clayout("Slide Show");
	}
}