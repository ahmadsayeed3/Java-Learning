import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WinClose{
	JFrame f;
	WinClose()
	{
		f=new JFrame("WinClose");
		f.setSize(400,400);
		f.setVisible(true);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		WinClose w=new WinClose();
		w.f.setVisible(true);
		new WinClose();
	}
}