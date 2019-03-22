// Singleton class

import java.lang.reflect.*;
class Singleton implements Cloneable {
	
	final private static Singleton obj = new Singleton();
	private Singleton(){
		
		if (obj != null) {
			throw new IllegalStateException("Singleton already constructed");
		}
	}
	
	synchronized public static Singleton getInstance(){
		return obj;
	}
}

public class MyClass {
	
	public static void main(String...a) throws Exception{
		Singleton st = Singleton.getInstance();
		System.out.println("Reference: " + st);
		
		// Now Let's get the new instance via reflection.
		Class c = Singleton.class; //st.getClass();
		Constructor c1 = c.getDeclaredConstructor();
		c1.setAccessible(true);
		
		try{
			Singleton s1 = (Singleton) c1.newInstance();
			System.out.println("New Reference: " + s1);
		}catch(Exception e){
			System.out.println("Can't make object explictly");
		}
	}
}
