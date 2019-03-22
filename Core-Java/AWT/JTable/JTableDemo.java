import java.awt.*;
import javax.swing.*;

class JTableDemo{

	JFrame jf;
	JTable jt;
	JScrollPane jp;

	JTableDemo(){
		jf = new JFrame("JTable With JScrollPane");
		
		String[] headings = {"Full Name", "City", "Contact No"};
		String[][] items = {
			{"Ahmad Sayeed", "Patna", "9386103524"},
			{"MD. Javed", "New Delhi", "9386103524"},
			{"MD. Taushif", "Mumbai", "9386103524"}
		};
		
		jt = new JTable(items, headings);
		jp = new JScrollPane(jt);
		
		jf.add(jp);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600,600);
		jf.setVisible(true);
	}
	
	public static void main(String...a){
		new JTableDemo();
	}
}