import java.awt.*;
import java.awt.event.*;
public class ExitListener extends WindowAdapter
{
	
	public void windowClosing(WindowEvent e)
	{
	Frame f=new Frame("EXIT");	
	f.setSize(300,300);
	f.setVisible(true);
	System.exit(0);
	
	}
	
}