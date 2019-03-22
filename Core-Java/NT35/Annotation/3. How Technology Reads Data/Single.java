// How Technology Reads the data in behind from our program.
/*
	After compilation annotation converts in interface and it data memeber converts in abstract method.
	At runtime JVM creates a proxy class and implements the MySingle1 interface. proxy class overrides methods
	that returns the value that we set at annotation.
	
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle1{
	int value();
}

public class Single{
	
	@MySingle1(100)
	public static void myMeth(){
		
		Single ob = new Single();
		try{
			Method m = ob.getClass().getMethod("myMeth");
			MySingle1 anno = m.getAnnotation(MySingle1.class);
			
			Class c = anno.getClass();
			System.out.println(c.getName());
			
			Class inter[] = c.getInterfaces();
			for(Class in: inter){
				System.out.println(in.getName());
			}
			
			Method m1 = c.getMethod("value");
			System.out.println(m1.getName());
			
			int x = anno.value();
			System.out.println(x);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...a){
		myMeth();
	}
}