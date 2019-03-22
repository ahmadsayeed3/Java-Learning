import java.awt.*;
import java.awt.event.*;

class Sum implements ActionListener {

	Frame f;
	Button b;
	TextField tf, tf1, tf2;
	Sum s4;

	Sum(){
		f = new Frame("Sum");
		b = new Button("Add");
		tf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		s4 = this;
		f.add(b);
		b.addActionListener(this);
		
		
		
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String...a){
		new Sum();
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Wel");
		String s1 = tf.getText();
		String s2 =tf1.getText();
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		tf2.setText(String.valueOf(sum));
	}
}