import java.awt.*;
import java.awt.event.*;
class ClassOne implements ActionListener{
	Frame f;
	TextField tf;
	Button b;
	Button b1;

	ClassOne(){
		// Creating Frame;
		f = new Frame("Same Class Even Handeling");
		f.setSize(400,400);
		f.setLayout(null);
		
		//Creating Components
		tf = new TextField();
		tf.setBounds(60,50,170,20);
			
		b = new Button("Press Me");
		b.setBounds(100,120,80,30);
		
		b1 = new Button("Click Me");
		b1.setBounds(170,120,80,30);
		
		//Register Listener
		b.addActionListener(this); // Passing Current Class Reference to run overriden method actionPerformed()
		b1.addActionListener(this); // Passing Current Class Reference to run overriden method actionPerformed()
		f.add(b);
		f.add(b1);
		f.add(tf);
		
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b){
			tf.setText("Welcome");
		}else if (e.getSource() == b1){
			tf.setText("Hello World");
		}
		
	}
	
	public static void main(String...a){
		new ClassOne();
	}
}