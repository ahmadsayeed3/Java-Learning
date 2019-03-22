import java.awt.*;
import javax.swing.*;

public class WindowUtilities{

	public static void sayeedSetMotifLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}catch(Exception e){
			System.out.println("Error: "+ e);
		}
	}
	
	public static void setNativeLookAndFeel(){
		try{
			String s = UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(s);
		}catch(Exception e){ System.err.println("Error While Setting NativeLook: " + e); }
	}
}