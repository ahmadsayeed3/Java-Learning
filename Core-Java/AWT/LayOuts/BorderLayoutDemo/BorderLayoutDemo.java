import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
class BorderLayoutDemo implements MouseMotionListener, ActionListener{
	
	JPanel p1, p2, p3, p4, p5;  
	JFrame jf;
	JButton[] jbtools, colorBtn;
	Icon pencil;
	String[] toolsIcon;
	Color color = Color.BLACK;
	Color[] colors;
	Toolkit tk;
	int toolWidth = 0;
	int screeWidth, screeHeight;
	
	BorderLayoutDemo(String s){
		jf = new JFrame(s);
		// Get The Dimension And Set Width And Height
			tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			this.screeWidth = screenSize.width;
			this.screeHeight = screenSize.height;
		
		// Create Panel And Set In BorderLayout
			p1=new JPanel();  
			p2=new JPanel();  
			p3=new JPanel();  
			p4=new JPanel();  
			p5=new JPanel(); 
		
		// Seting the Border Layout
			jf.add(p1,BorderLayout.NORTH);  
			jf.add(p2,BorderLayout.SOUTH);  
			jf.add(p3,BorderLayout.EAST);  
			jf.add(p4,BorderLayout.WEST);  
			jf.add(p5,BorderLayout.CENTER);
		// Making the center White
			p5.setBackground(Color.WHITE);
      
		 
		// Left Tools
		toolsIcon = new String[]{"pencil.png", "eraser.png", "colorpicker.png","colorfill.png","text.png","zoom.png"};
		jbtools = new JButton[toolsIcon.length];
		
		JPanel pan4 = new JPanel();
		pan4.setLayout(new GridLayout(toolsIcon.length/2,2));
		p4.add(pan4);
		for(int i=0; i<jbtools.length; i++){
			jbtools[i] = new JButton();
			jbtools[i].addActionListener(this);
			pencil = new ImageIcon(toolsIcon[i]);
			jbtools[i].setIcon(pencil);
			jbtools[i].setPreferredSize(new Dimension(25,25));
			pan4.add(jbtools[i]);
		}
		
		JPanel panGrid1 = new JPanel();
		panGrid1.setLayout(new GridLayout(2,toolsIcon.length/2, 5, 5));
		//panGrid1.setBounds(1000,0,200,200);
		p1.add(panGrid1);
		
		//Color Tools
		/*JPanel panGrid1 = new JPanel();
		panGrid1.setLayout(new GridLayout(2,toolsIcon.length/2, 5, 5));
		
		JPanel panFlow1 = new JPanel();
		panFlow1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panFlow1.add(panGrid1);
		p1.add(panFlow1);*/
		
		colors = getColors();
		colorBtn = new JButton[colors.length];
			for(int i=0; i < colors.length; i++){
				colorBtn[i] = new JButton();
				colorBtn[i].setBackground(colors[i]);
				colorBtn[i].addActionListener(this);
				colorBtn[i].setPreferredSize(new Dimension(25,25));
				panGrid1.add(colorBtn[i]);
			}
		
		
		
		//Draw: Register With MouseMotionListener
		p5.addMouseMotionListener(this);
	
		jf.setSize(screeWidth,screeHeight);
		jf.setVisible(true);
	}
	
	public static void main(String...a){
		new BorderLayoutDemo("Border Layout Demo");
	}
	
	public void mouseDragged(MouseEvent e){
		Graphics g = p5.getGraphics();
		g.setColor(this.color);	
		g.fillOval(e.getX(), e.getY(),toolWidth,toolWidth);
	}
	
	public Color[] getColors(){
		return new Color[]{Color.BLACK, Color.WHITE,Color.BLUE, Color.CYAN,Color.DARK_GRAY,
		Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,
		Color.YELLOW
		};
	}
	
	public void actionPerformed(ActionEvent e){
		
		Object obj = e.getSource();
		for(int i=0; i<colorBtn.length; i++){
			if(obj == colorBtn[i]){
				this.color = (Color)colors[i];
			}
		}
		
		if(obj == jbtools[0]){
			setToolIcon(toolsIcon[0]);
			this.toolWidth = 5;
		}
		
		if(obj == jbtools[1]){
			setToolIcon(toolsIcon[1]);
			this.toolWidth = 50;
			this.color = Color.WHITE;
		}
		
		/*
		for(int i=0; i<jbtools.length; i++){
			if(obj == jbtools[i]){
				this.color = (Color)colors[i];
			}
		}*/
	}
	
	public void setToolIcon(String icon){
		Image img = tk.getImage(icon);
		Cursor c = tk.createCustomCursor(img, new Point(0,0),"custom cursor");
		p5.setCursor(c);
	}
	
	public void mouseMoved(MouseEvent e){}
}