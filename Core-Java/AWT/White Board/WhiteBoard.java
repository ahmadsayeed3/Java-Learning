import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WhiteBoard implements MouseMotionListener, ActionListener{

	JFrame f;
	Color color = Color.BLACK;
	JButton b;
	JButton b1;
	JButton[] colorBtn;
	Color[] colors;
	WhiteBoard(){
		f = new JFrame("White Board");	
		f.addMouseMotionListener(this);
		
		// Get The Dimension And Set Width And Height
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			int w = screenSize.width;
			int h = screenSize.height;
	
		//Create Color Panel
			JPanel colorPane = new JPanel();
			colorPane.setBorder(BorderFactory.createLineBorder(Color.black));
			colorPane.setBounds(w-500, 20, 400,200);
			// Create Color Button
				colors = getColors();
				colorBtn = new JButton[colors.length];
				for(int i=0, x=0, y=0, row=1; i < colors.length; x+=60, i++){
					colorBtn[i] = new JButton();
					colorBtn[i].setBounds(x,y,100,100);
					colorBtn[i].setBackground(colors[i]);
					colorBtn[i].addActionListener(this);
					colorPane.add(colorBtn[i]);
					
					if(row == 10){
						x= - 60;
						y +=60;
						row = 0;
					}
				}
		
		f.add(colorPane);
		f.setLayout(null);
		f.setSize(w,h);
		f.setBackground(Color.WHITE);
		f.setVisible(true);
	}

	public static void main(String...a){
		new WhiteBoard();
	}
	
	public void actionPerformed(ActionEvent e){
		
		Object obj = e.getSource();
		for(int i=0; i<colorBtn.length; i++){
			if(obj == colorBtn[i]){
				this.color = (Color)colors[i];
			}
		}
	}
	
	public void mouseDragged(MouseEvent e){
		Graphics g = f.getGraphics();
		g.setColor(this.color);	
		g.fillOval(e.getX(), e.getY(),20,20);
	}
	
	public Color[] getColors(){
		return new Color[]{Color.BLACK, Color.WHITE,Color.BLUE, Color.CYAN,Color.DARK_GRAY,
		Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,
		Color.YELLOW
		};
	}
	
	public void mouseMoved(MouseEvent e){}
}	