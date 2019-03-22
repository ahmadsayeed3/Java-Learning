import java.awt.*;
import java.awt.event.*;
class ClassOne{

	Frame f;
	TextField tf;
	Button b;
	Button b1;
	

	ClassOne(){
		f = new Frame("Anonymous way for Event Handelling");
		
		tf = new TextField();
		f.add(tf);
		
		b = new Button("Press Me");
		f.add(b);
		b1 = new Button("Click Me");
		f.add(b1);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setText("Press Me");
			}
		});
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setText("Click Me");
			}
		});
		
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
		
	}
	
	public static void main(String...a){
		new ClassOne();
	}
}