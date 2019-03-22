import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPopupMenu extends MouseAdapter{

	JFrame jf;
	JButton jb;
	JPopupMenu p;
	
	MyPopupMenu(){
		jf = new JFrame("My Popup Menu Example");
		p = new JPopupMenu("MyMenu");
		ImageIcon ic = new ImageIcon("parul.png");
		JMenuItem i1 = new JMenuItem();
		i1.setIcon(ic);
		JMenuItem i2 = new JMenuItem("Menu 2");
		JMenuItem i3 = new JMenuItem("Menu 3");
		
		p.add(i1);
		p.add(i2);
		p.add(i3);
		
		/*JPanel jp = new JPanel();
		jf.add(jp);*/
		
		jb = new JButton("Click Me");
		jb.addMouseListener(this);
		
		jf.add(jb);
		jf.setSize(500,500);
		jf.setVisible(true);
		
		//JMenuBar
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("Hey");
		int x = e.getButton();
		if(x == MouseEvent.BUTTON3){
			
			p.show(jf, e.getX(), e.getY());
		}
	}
	
	
	public static void main(String...a){
		new MyPopupMenu();
	}

}
