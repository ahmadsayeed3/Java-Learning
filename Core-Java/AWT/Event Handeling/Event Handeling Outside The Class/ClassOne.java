import java.awt.*;
import java.awt.event.*;
class ClassOne{
	Frame f;
	TextField tf;
	Button b;

	ClassOne(){
		// Creating Frame;
		f = new Frame("Outer Class Even Handeling");
		f.setSize(400,400);
		f.setLayout(null);
		
		//Creating Components
		tf = new TextField();
		tf.setBounds(60,50,170,20);
			
		b = new Button("Press Me");
		b.setBounds(100,120,80,30);
		
		//Register Listener
		
		OuterClass obj = new OuterClass(this);
		b.addActionListener(obj);
		
		f.add(b);
		f.add(tf);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				f.setBackground(Color.PINK);
		}});

	}
	
	public static void main(String...a){
		new ClassOne();
	}
}

class OuterClass implements ActionListener{
	
	ClassOne co;
	
	OuterClass(ClassOne co){
		this.co = co;
	}
	
	public void actionPerformed(ActionEvent e){
		co.tf.setText("Welcome");
	}	
}
	