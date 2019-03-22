import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RadioCheckBox{
	
	JFrame jf;
	JRadioButton rb;

	public static void main(String...a){
		new RadioCheckBox("Radio Check Box");
	}
	
	RadioCheckBox(String s){
		jf = new JFrame(s);
		
		// Creating CheckBox
		Checkbox cb = new Checkbox("Option One");
		jf.add(cb);
		Checkbox cb1 = new Checkbox("Option Two", true);
		jf.add(cb1);
		
		// Creating Radio Button
		String[] rbtn = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
		JRadioButton jb = new JRadioButton[5];
		for(int i=0; i < jb.length; i++){
			jb[i] = new JRadioButton(rbtn[i]);
		}
		ButtonGroup bg = new ButtonGroup();
		
		
		jf.setSize(400,400);
		jf.setLayout(new GridLayout());
		jf.setVisible(true);
	}
}