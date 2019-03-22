import java.awt.*;
import java.awt.event.*;

class WinAdapter /*extends WindowAdapter*/ extends MouseMotionAdapter{

	Frame f;
	int i =0;
	Button b;
	Button b1;
	WinAdapter(){
		f = new Frame("Window Listener Program");
		//f.addWindowListener(this);
		b = new Button("Erase");
		//b.addActionListener(this);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				i = 1;
			}
		});
		b1 = new Button("Write");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				i = 0;
			}
		});
		
		f.add(b);
		f.add(b1);
		//b1.addActionListener(this);
		f.addMouseMotionListener(this);
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String...a){
		new WinAdapter();
	}
	
	public void windowClosing(WindowEvent we){
		System.out.println("Closing");
		f.dispose();
	}
	
	public void mouseDragged(MouseEvent e){
		Graphics g = f.getGraphics();
		if(this.i == 0){
			g.setColor(Color.ORANGE);
		}else if(this.i == 1){
			g.setColor(Color.WHITE);
		}
		g.fillOval(e.getX(), e.getY(),20,20);
	}
}