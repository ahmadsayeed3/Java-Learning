import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import sid.MyColor;
import sid.RectangleDraw;

@SuppressWarnings({"unchecked", "unsafe"})
class MyPaint extends MouseAdapter implements MouseMotionListener, ActionListener{
	
	public static void main(String...a){
		new MyPaint("SiD Paint V1.O");
	}
	
	Point point1;
	// Init Block
		JPanel p1, p2, p3, p4, p5, panGrid1, panGrid4, jPTextBox, jpRect, textToolPanel;  
		JFrame jf;
		JButton colorChooser, pencilSizeChooser, selectedColorTool, selectedBackColorTool, boldBtn, italicBtn, underLineBtn;
		JButton[] jbtools, colorBtn;
		JTextArea textArea;
		JTextField textBox, textFontsize;
		Icon pencil;	
		String[] toolsIcon, pencilSizeIcon;
		String activeTool, toolAction;
		JPopupMenu p;
		JMenuItem[] pencilSize;
		String pencilSizeChooserIcon = "pencilSizeChooserIcon.png";
		Color color = new Color(54,64,77);
		Color backGroungColor = Color.WHITE;		
		Color[] colors;
		String colorType = "toolColor";
		int toolWidth = 0;
		int pencilWidth = 10;
		int textX, textY;
		int screenWidth, screenHeight;
		int[] tempCord;
		int textStyle = Font.PLAIN;
		JComboBox textFontType, shapeFillTool;
		String fontName = "Arial";
		boolean fillShape = false;
		
	
	MyPaint(String s){
		jf = new JFrame(s);
		// Get The Current Screen Dimension And Intialize to Width And Height. That Will Set The Screen Size of H & W
			setScreenDimension();
		
		
		{	// Create Panel And Set In BorderLayout
			p1=new JPanel();  
			p2=new JPanel();  
			p3=new JPanel();  
			p4=new JPanel();  
			p5=new JPanel(); 
		}
		
		{ // Seting the Border Layout
			jf.add(p4,BorderLayout.WEST);  
			jf.add(p1,BorderLayout.NORTH);  
			jf.add(p2,BorderLayout.SOUTH);  
			jf.add(p3,BorderLayout.EAST);  
			jf.add(p5,BorderLayout.CENTER);
		
		// Making the center White
			p5.setBackground(Color.WHITE);
			
		}
		 
		 
		 
		// Create Tool in Left Tools
			createWestSideTools();
		
		// Make Text Tools on North Panel
			createTextTool();
		//Make Color Tools on North Panel
			createColorTools();
		
		// Color Chooser
			createColorChooserTool();
			
		// Pencil Size chooser Popup Menu
			createPencilSizeChooserTool();
	
		
		/*JPanel centerPanel = new RectangleDraw();
		centerPanel.setPreferredSize(new Dimension(200,200));
		p5.add(centerPanel);
		*/
		
		// MouseClickListener to detect mouse click on center panel
			p5.addMouseListener(this);
		
		//Draw: Register With MouseMotionListener
		p5.addMouseMotionListener(this);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//jf.setSize(screenWidth,screenHeight);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/mypaint.png")));
		jf.setVisible(true);
	}
	
	
	// Create Text Tool And Shape fill No Fill Option
	public void createTextTool(){
		textToolPanel = new JPanel();
		textToolPanel.setLayout(new GridLayout(2,2, 5, 5));
		
		// TextBox 
		
		textBox = new JTextField();
		textBox.setPreferredSize(new Dimension(150,25));
		textToolPanel.add(textBox);
		
		// Adding Choose Font Type Option
		String fontStyle[] = {"Arial", "Arial Black", "Arial Narrow", "Book Antiqua", "Bookman Old Style", "Century Gothic", "Comic Sans MS", "Courier New", "Dialog", "DialogInput", "Garamond", "Georgia", "Impact", "Lucida Bright", "Lucida Sans Unicode", "Monotype Carsiva", "Times New Roman", "Verdana"};
		textFontType = new JComboBox(fontStyle);
		textFontType.setPreferredSize(new Dimension(150,25));
		textFontType.addActionListener(this);
		textToolPanel.add(textFontType);
	
		// Adding Fill No Fill Option For Shape
		String[] shapeFillOption = {"No Fill Shapes", "Fill Shapes"};
		shapeFillTool = new JComboBox(shapeFillOption);
		shapeFillTool.addActionListener(this);
		textToolPanel.add(shapeFillTool);
		
		p1.add(textToolPanel);
		
		// ----------- Font Style Size TextBox -----------
		JPanel textStylePanel = new JPanel();
		textStylePanel.setLayout(new GridLayout(2, 2, 5, 5));
		
		
		textFontsize = new JTextField();
		textFontsize.setPreferredSize(new Dimension(35,25));
		textFontsize.setText("25");
		textStylePanel.add(textFontsize);
		
		//Font  Style Bold Button
		boldBtn = new JButton();
		boldBtn.setPreferredSize(new Dimension(35,25));
		boldBtn.setIcon(new ImageIcon("images/bold.png"));
		boldBtn.addActionListener(this);
		textStylePanel.add(boldBtn);
		
		//Font  Style Italic Button
		italicBtn = new JButton();
		italicBtn.setPreferredSize(new Dimension(35,25));
		italicBtn.setIcon(new ImageIcon("images/italic.png"));
		italicBtn.addActionListener(this);
		textStylePanel.add(italicBtn);
		
		
		//Font  Style Underline Button
		underLineBtn = new JButton();
		underLineBtn.setPreferredSize(new Dimension(35,25));
		underLineBtn.setIcon(new ImageIcon("images/underline.png"));
		underLineBtn.addActionListener(this);
		textStylePanel.add(underLineBtn);
		
		p1.add(textStylePanel);
	}
	
	public Color[] getColors(){
		return new Color[]{MyColor.WHITE, MyColor.LIGHT_GRAY, MyColor.DARK_GRAY, MyColor.BLACK, MyColor.DARK_RED, MyColor.RED,
			MyColor.ORANGE, MyColor.GOLD, MyColor.Light_YELLOW, MyColor.YELLOW, MyColor.LIME, MyColor.GREEN, MyColor.AQUA,
			MyColor.TURQUOISE, MyColor.INDIGO, MyColor.PINK, MyColor.ROSE, MyColor.BROWN
		};
	}

	// Create West Panel (Left Side Tool)
	public void createWestSideTools(){
		toolsIcon = new String[]{"pencil.png", "eraser.png", "colorpicker.png","colorfill.png","text.png","zoom.png", "line.png", "oval.png", "rectangle.png", "rount-rectangle.png", "triangle.png", "right-triangle.png" , "left-triangle.png", "arrow-triangle.png" /*,"curve.png", "polygon.png","diamond.png", "pentagon.png", "hexagon.png", "right-arrow.png", "left-arrow.png", "up-arrow.png", "down-arrow.png", "four-star.png", "five-star.png", "six-star.png",  "rectangular-callout.png", "cloud-callout.png", "oval-callout.png"*/ };
		jbtools = new JButton[toolsIcon.length];
		
		panGrid4 = new JPanel();
		panGrid4.setLayout(new GridLayout(toolsIcon.length,2, 5,5));
		for(int i=0; i<jbtools.length; i++){
			jbtools[i] = new JButton();
			jbtools[i].addActionListener(this);
			pencil = new ImageIcon("images/" + toolsIcon[i]);
			jbtools[i].setIcon(pencil);
			jbtools[i].setPreferredSize(new Dimension(35,35));
			//jbtools[i].setBorderPainted(false);
			//jbtools[i].setFocusPainted(false);
			panGrid4.add(jbtools[i]);
		}
		
		p4.add(panGrid4);
	}
	
	//Create Color Tools In Nort Panel
	public void createColorTools(){
		panGrid1 = new JPanel();
		panGrid1.setLayout(new GridLayout(2,toolsIcon.length/2, 5, 5));
		p1.add(panGrid1);
		
	
		colors = getColors();
		colorBtn = new JButton[colors.length];
			for(int i=0; i < colors.length; i++){
				colorBtn[i] = new JButton();
				colorBtn[i].setBackground(colors[i]);
				colorBtn[i].addActionListener(this);
				colorBtn[i].setPreferredSize(new Dimension(25,25));				
				panGrid1.add(colorBtn[i]);
		}
	}
	
	// Create Color Chooser Tool
	public void createColorChooserTool(){
		
		JPanel colSecGrid = new JPanel();
		colSecGrid.setLayout(new GridLayout(2,2, 5, 0));
		
		// Current Color Tool
		selectedColorTool = new JButton();
		selectedColorTool.setPreferredSize(new Dimension(25,25));
		selectedColorTool.setBackground(this.color);
		//selectedColorTool.setBorder(BorderFactory.createEtchedBorder(0)); //Raised Border Line
		
		selectedColorTool.addActionListener(this);
		colSecGrid.add(selectedColorTool);
		
		// Current BackGround Color
		selectedBackColorTool = new JButton();
		selectedBackColorTool.setPreferredSize(new Dimension(25,25));
		selectedBackColorTool.setBackground(this.backGroungColor);
		selectedBackColorTool.addActionListener(this);
		colSecGrid.add(selectedBackColorTool);
		
		JLabel lb1 = new JLabel("Tool Color");
		colSecGrid.add(lb1);
		
		JLabel lb2 = new JLabel("BG Color");
		colSecGrid.add(lb2);
		
		p1.add(colSecGrid);
		
		colorChooser = new JButton();
		colorChooser.setPreferredSize(new Dimension(50,50));
		colorChooser.setIcon(new ImageIcon("colorChooser.png"));
		p1.add(colorChooser);
		colorChooser.addActionListener(this);
	}
	
	// Create Pencil Size Chooser Tool
	public void createPencilSizeChooserTool(){
		pencilSizeChooser = new JButton();
		pencilSizeChooser.setPreferredSize(new Dimension(101,50));
		pencilSizeChooser.setIcon(new ImageIcon(this.pencilSizeChooserIcon));
		p1.add(pencilSizeChooser);
		pencilSizeChooser.addMouseListener(this);
			
		p = new JPopupMenu("Pencil Size Choose");
		pencilSizeIcon = new String[]{"pencilSize1.png", "pencilSize2.png", "pencilSize3.png", "pencilSize4.png"};
		pencilSize = new JMenuItem[4];
		for(int i=0, height = 4; i < pencilSize.length; height+=3, i++ ){
			pencilSize[i] = new JMenuItem();
			pencilSize[i].setIcon(new ImageIcon(pencilSizeIcon[i]));
			pencilSize[i].addActionListener(this);
			p.add(pencilSize[i]);
		}
	}
	
	// Set Cursor Icon When Choose Tool
	public void setToolIcon(String icon){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage(icon);
		Cursor c = tk.createCustomCursor(img, new Point(0,0),icon);
		p5.setCursor(c);
	}
	
	// Create Selected Color
	public void createSelectedColorTool(){
		selectedColorTool = new JButton();
		selectedColorTool.setPreferredSize(new Dimension(50,50));
		selectedColorTool.setBackground(this.color);
		panGrid1.add(selectedColorTool);
	}
	
	// Get Screen Dimension Function
	public void setScreenDimension(){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.screenWidth = screenSize.width;
		this.screenHeight = screenSize.height;
	}
	
	 public void mouseClicked(MouseEvent e) {  
		
		Object obj = e.getSource();
		
		if(this.activeTool == "colorfill"){
			p5.setBackground(this.backGroungColor);
		}
		
		if(obj == pencilSizeChooser){
			p.show(pencilSizeChooser, e.getX(), e.getY());
		}

	}
	
	@Override
        public void mousePressed(MouseEvent e) {
            point1 = e.getPoint();
			
			//get the component color
			if(this.activeTool == "colorpicker"){
				JComponent jcp = (JComponent) e.getSource();
				if(this.colorType == "toolColor"){ 
					this.color = jcp.getBackground();
					selectedColorTool.setBackground(this.color);
					
				}else if(this.colorType == "bgColor"){
					this.backGroungColor = jcp.getBackground();
					selectedBackColorTool.setBackground(this.backGroungColor);
				}
				System.out.println(jcp.getBackground());
			}
			
			if(this.activeTool == "text"){
				Graphics g5 = p5.getGraphics();
				g5.setColor(this.color);
				String fontSizevalue = textFontsize.getText();
				int fontSize = Integer.parseInt(fontSizevalue);
				String value = textBox.getText();
				g5.setFont(new Font(fontName, this.textStyle, fontSize)); 
				g5.drawString(value, point1.x ,point1.y);
			}
			
        }
		
	@Override
	public void mouseDragged(MouseEvent e){
		
		Graphics g5 = p5.getGraphics();
		int[] cord = getCurrentCordinates(e);
		
		
		if(this.activeTool.equals("pencil")){
			g5.setColor(this.color);	
			g5.fillOval(e.getX(), e.getY(),toolWidth,toolWidth);
			this.toolAction = "";
		}else if(this.activeTool.equals("eraser")){
			g5.setColor(Color.WHITE);	
			g5.fillRect(e.getX(), e.getY(),toolWidth,toolWidth);
			this.toolAction = "";
		}
		else if(toolAction == "draw"){
				
				createTempDraw(cord, e);
		}
		
		
	}
	 @Override
        public void mouseReleased(MouseEvent e) {
			if(toolAction == "draw"){
				createDraw(e);
			}
        }
		
	// getCurrent Cordinates
	public int[] getCurrentCordinates(MouseEvent e){
		int[] c = new int[4];
		Point point2 = e.getPoint();
            c[0] = Math.min(point1.x, point2.x);
            c[1] = Math.min(point1.y, point2.y);
            c[2] = Math.abs(point1.x - point2.x);
            c[3] = Math.abs(point1.y - point2.y);
		return c;
	}
	
	// Create temporary draw on mourdragged
	public void createTempDraw(int[] cord, MouseEvent e){
		Graphics g5 = p5.getGraphics();
		g5.setColor(Color.gray);
		Point point2 = e.getPoint();
		//For Right Triangle
		int rHeight = (point1.x + (point2.y - point1.x));
		int rWidth = point1.x + (point2.y - point1. y);
		
		// For Left Triangle
		int lHeight = (point1.x + (point2.y - point1.x));
		int lWidth = point1.x + (point1.y - point2. y);
				
			if(this.activeTool == "rect") { g5.drawRect(cord[0], cord[1], cord[2], cord[3]); }
			else if(this.activeTool == "oval") { g5.drawOval(cord[0], cord[1], cord[2], cord[3]); }
			else if(this.activeTool == "line"){ g5.drawLine(point1.x, point1.y, point2.x, point2.y); }
			else if(this.activeTool == "roundRect"){ g5.drawRoundRect(cord[0], cord[1], cord[2], cord[3], 10,10); }
			else if(this.activeTool == "rightTriangle"){
				
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
			}
			else if(this.activeTool == "triangle"){
				// Left
				//g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				//g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			else if(this.activeTool == "leftTriangle"){
				g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			else if(this.activeTool == "arrowTriangle"){
				// Left
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			
			// repaint the drawn shapes
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){
				System.out.println("Error: " + ex);
			}
				
				JComponent jcp = (JComponent) e.getSource();
				Color defaultColor = jcp.getBackground();
				g5.setColor(defaultColor);
				System.out.println(defaultColor);
			
			if(this.activeTool == "rect") { g5.drawRect(cord[0], cord[1], cord[2], cord[3]); }
			else if(this.activeTool == "oval") { g5.drawOval(cord[0], cord[1], cord[2], cord[3]); }
			else if(this.activeTool == "line"){ g5.drawLine(point1.x, point1.y, point2.x, point2.y); }
			if(this.activeTool == "roundRect"){ g5.drawRoundRect(cord[0], cord[1], cord[2], cord[3], 10,10); }
			else if(this.activeTool == "rightTriangle"){
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
			}
			else if(this.activeTool == "triangle"){
				// Left
				//g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				//g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			else if(this.activeTool == "leftTriangle"){
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			else if(this.activeTool == "arrowTriangle"){
				// Left
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
	}
	
	// create a shape from start point and current point
        public void createDraw(MouseEvent e) {
            Point point2 = e.getPoint();
            int x = Math.min(point1.x, point2.x);
            int y = Math.min(point1.y, point2.y);
            int w = Math.abs(point1.x - point2.x);
            int h = Math.abs(point1.y - point2.y);
			// Get Graphics of panle
			Graphics g5 = p5.getGraphics();
			//set color
			if(this.fillShape){
				g5.setColor(this.backGroungColor);
			}else {
				g5.setColor(this.color);
			}
			
			// Find And Draw Shape
			if(this.activeTool == "rect"){ 
				if(fillShape){
					g5.fillRect(x, y, w, h);
				}else{
					g5.drawRect(x, y, w, h); 
				}
			}
			if(this.activeTool == "oval"){ 
				if(fillShape){
					g5.fillOval(x, y, w, h); 
				}else{
					g5.drawOval(x, y, w, h); 
				}
			}
			if(this.activeTool == "line"){ 
				g5.drawLine(point1.x, point1.y, point2.x, point2.y); 
			}
			if(this.activeTool == "roundRect"){ 
				if(fillShape){
					g5.fillRoundRect(x, y, w, h, 10,10); 
				}
				else{
					g5.drawRoundRect(x, y, w, h, 10,10); 
				}
			
			}
			else if(this.activeTool == "text"){
				textX = x;
				textY = y;
			}
			else if(this.activeTool == "triangle"){
				// Left
				int rHeight = (point1.x + (point2.y - point1.x));
				int rWidth = point1.x + (point1.y - point2. y);
				//g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				int lHeight = (point1.x + (point2.y - point1.x));
				int lWidth = point1.x + (point2.y - point1. y);
				//g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
			else if(this.activeTool == "rightTriangle"){
				int height = (point1.x + (point2.y - point1.x));
				int width = point1.x + (point2.y - point1. y);
				g5.drawLine(point1.x, point1.y, point1.x, height);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, width, point2.y);
			}
			else if(this.activeTool == "leftTriangle"){
				int height = (point1.x + (point2.y - point1.x));
				int width = point1.x + (point1.y - point2. y);
				g5.drawLine(point1.x, point1.y, point1.x, height);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, width, point2.y);
			}
			else if(this.activeTool == "arrowTriangle"){
				// Left
				int rHeight = (point1.x + (point2.y - point1.x));
				int rWidth = point1.x + (point1.y - point2. y);
				g5.drawLine(point1.x, point1.y, point1.x, rHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point2.y - point1. y) , point2.y);
				g5.drawLine(point1.x, point1.y, rWidth, point2.y);
				
				//Right
				int lHeight = (point1.x + (point2.y - point1.x));
				int lWidth = point1.x + (point2.y - point1. y);
				g5.drawLine(point1.x, point1.y, point1.x, lHeight);
				g5.drawLine(point1.x, point2.y,  point1.x + (point1.y - point2. y) , point2.y);
				g5.drawLine(point1.x, point1.y, lWidth, point2.y);
			}
        }
	
	public void mouseMoved(MouseEvent e){}

	
	public void actionPerformed(ActionEvent e){
		
		Object obj = e.getSource();
		
		// Selected Color Tool. Showing What Color is selected now
		JButton activeToolObject = null;
		for(int i=0; i<colorBtn.length; i++){
			if(obj == colorBtn[i]){
				colorBtn[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
				
				if(this.colorType == "toolColor"){ 
					this.color = (Color)colors[i];
					selectedColorTool.setBackground(this.color);
					
				}else if(this.colorType == "bgColor"){
					this.backGroungColor = (Color)colors[i];
					selectedBackColorTool.setBackground(this.backGroungColor);
				}
			}else{
					colorBtn[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			}
		}
		
		if(obj == colorChooser){
			Color c =JColorChooser.showDialog(colorChooser,"Choose a new Color",this.color);  
			this.color = c;
			colorChooser.setBackground(c);
			if(this.colorType == "toolColor"){ 
					selectedColorTool.setBackground(this.color);
				}else if(this.colorType == "bgColor"){
					selectedBackColorTool.setBackground(this.backGroungColor);
			}
		}
		
		//active - deactive tools of west
		for(int i=0; i < jbtools.length; i++){
			if(obj == jbtools[i]){
				jbtools[i].setBorderPainted(true);
				jbtools[i].setFocusPainted(true);
			}else {
				jbtools[i].setBorderPainted(false);
				jbtools[i].setFocusPainted(false);
			}
		}
		
		if(obj == selectedColorTool){
			this.colorType = "toolColor";
			selectedColorTool.setBorder(BorderFactory.createLineBorder(new Color(86,12,47), 4));
			selectedBackColorTool.setBorder(BorderFactory.createLineBorder(new Color(86,12,47), 1));
		}else if(obj == selectedBackColorTool){
			this.colorType = "bgColor";
			selectedColorTool.setBorder(BorderFactory.createLineBorder(new Color(86,12,47), 1));
			selectedBackColorTool.setBorder(BorderFactory.createLineBorder(new Color(86,12,47), 4));
		}
		
		if(obj == jbtools[0]){
			setToolIcon("images/pencil2.png");
			this.toolWidth = this.pencilWidth;
			this.activeTool = "pencil";
			activeToolObject = jbtools[0];
			
		}
		if(obj == jbtools[1]){
			setToolIcon("images/eraser1.png");
			this.toolWidth = 40;
			this.activeTool= "eraser";
			activeToolObject = jbtools[1];
		}
		
		if(obj == jbtools[2]){
			setToolIcon("images/colorpicker2.png");
			this.activeTool = "colorpicker";
			activeToolObject = jbtools[2];
		}
		
		if(obj == jbtools[3]){
			setToolIcon("images/colorfill2.png");
			this.activeTool = "colorfill";
			activeToolObject = jbtools[3];
		}
		
		if(obj == jbtools[4]){
			setToolIcon("images/text2.png");
			this.activeTool = "text";
			this.toolAction = "draw";
			activeToolObject = jbtools[4];
		}
		
		if(obj == jbtools[5]){
			setToolIcon("images/zoom2.png");
			this.activeTool = "zoom";
			activeToolObject = jbtools[5];
		}
		
		if (obj == jbtools[6]){		// if line tool
			setToolIcon("images/precision.png");
			this.activeTool = "line";
			this.toolAction = "draw";
			activeToolObject = jbtools[6];
		}
		/*else if(obj == jbtools[7]){		// if curve tool
			setToolIcon("images/precision.png");
			this.activeTool = "curve";
			this.toolAction = "draw";			
			activeToolObject = jbtools[7];
		}*/		
		else if(obj == jbtools[7]){		// if Oval tool
			setToolIcon("images/precision.png");
			this.activeTool = "oval";
			this.toolAction = "draw";			
			activeToolObject = jbtools[7];
		}
		else if(obj == jbtools[8]){		// if Rectange tool
			setToolIcon("images/precision.png");
			this.activeTool = "rect";
			this.toolAction = "draw";			
			activeToolObject = jbtools[8];
		}
		else if(obj == jbtools[9]){		// if Rectange tool
			setToolIcon("images/precision.png");
			this.activeTool = "roundRect";
			this.toolAction = "draw";			
			activeToolObject = jbtools[9];
		}
		else if(obj == jbtools[10]){		// if triangle tool
			setToolIcon("images/precision.png");
			this.activeTool = "triangle";
			this.toolAction = "draw";			
			activeToolObject = jbtools[10];
		}
		
		else if(obj == jbtools[11]){		// if right triangle tool
			setToolIcon("images/precision.png");
			this.activeTool = "rightTriangle";
			this.toolAction = "draw";			
			activeToolObject = jbtools[11];
		}
		
		else if(obj == jbtools[12]){		// if left triangle tool
			setToolIcon("images/precision.png");
			this.activeTool = "leftTriangle";
			this.toolAction = "draw";			
			activeToolObject = jbtools[12];
		}
		else if(obj == jbtools[13]){		// if left triangle tool
			setToolIcon("images/precision.png");
			this.activeTool = "arrowTriangle";
			this.toolAction = "draw";			
			activeToolObject = jbtools[13];
		}
		
		if(obj == pencilSize[0]){
			this.pencilWidth = 6;
			this.toolWidth= this.pencilWidth;
			pencilSizeChooser.setIcon(new ImageIcon(this.pencilSizeIcon[0]));
		}
		else if(obj == pencilSize[1]){ 
			this.pencilWidth = 10;
			this.toolWidth= this.pencilWidth;
			pencilSizeChooser.setIcon(new ImageIcon(this.pencilSizeIcon[1]));
			
		}
		else if(obj == pencilSize[2]){ 
			this.pencilWidth = 12;
			this.toolWidth= this.pencilWidth;
			pencilSizeChooser.setIcon(new ImageIcon(this.pencilSizeIcon[2]));
		}
		else if(obj == pencilSize[3]){ 
			this.pencilWidth = 15;
			this.toolWidth= this.pencilWidth;
			pencilSizeChooser.setIcon(new ImageIcon(this.pencilSizeIcon[3]));
		}
		

		// Set Text Style
		if(obj == textFontType){
			Object item = textFontType.getItemAt(textFontType.getSelectedIndex());
			this.fontName = (String)item;
		}else if (obj == boldBtn){
			this.textStyle = Font.BOLD;
		}else if (obj == italicBtn){
			this.textStyle = Font.ITALIC;
		}else if (obj == underLineBtn){
			this.textStyle = Font.BOLD + Font.ITALIC;
		}else if (obj == shapeFillTool){
			System.out.println("mmmmm");
			Object fillItem =  shapeFillTool.getItemAt(shapeFillTool.getSelectedIndex());
			String ss = (String) fillItem;
			if(ss.equals("Fill Shapes")){  this.fillShape = true; 
			System.out.println(fillItem); }
			else { this.fillShape = false; }
		}
	}
	
}