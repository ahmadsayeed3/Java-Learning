/* Access the private Field and change the value of final Field */

import java.lang.reflect.*;

class Temp{
	final private int x = 1000;
}

public class AccessPrivateChangeFinalField{
	
	public static void main(String...a){
		try{
			Class cl = Temp.class;
			Field f = cl.getDeclaredField("x");
			f.setAccessible(true);
			System.out.println(f);				//private final int Temp.x
			
			Temp t1 = new Temp();
			System.out.println(f.get(t1));		// 1000 accessed private data 
			
			f.set(t1,50);						// Changed the final data 
			System.out.println(f.get(t1));		// 50
		}catch(Exception e){
			System.out.println(e);
		}
	}
}