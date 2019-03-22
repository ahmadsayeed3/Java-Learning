// Via reflection, we can also know the Fields of any class but those field must be "public"...

import java.lang.reflect.*;
import java.awt.Color;

public class KnowFields{
	
	public static void printFields(Object o){
		Class c = o.getClass();			// getting object of "Class" class object
		Field f[] = c.getFields();		// It returns the array of field "Class" class object.
		
		for(int i=0; i<f.length; i++){
			System.out.println("");
			
			Class type = f[i].getType();				// type of data member in form of object
			System.out.print(type.getName());			// getting name of type.
			System.out.print(" " + f[i].getName());		// getting name of data member.
		}
	}
	
	public static void main(String...s){
		//printFields(new Color(1,1,1));
		printFields(new Temp());
	}
}

class Temp{
	
	public int x;
	public byte b;
	public long l;
	public short sh;
	protected boolean b1;			// Not public, won't accessed by refection.
	private double d1;				// Not public, won't accessed by refection.
	char ch1;						// Not public, won't accessed by refection.
}