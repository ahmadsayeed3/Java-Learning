/* Reflection : Reflection is used to find out the detail of any class at runtime whenever we are getting a some clue about
	that class at run-time. */
	
import java.lang.reflect.*;
import java.awt.*;
class ClassInformation{
	
	/*	Hint 2: We are getting an object of some class at run time into the reference value of parent class. */
	public static void printName(Object o){
		Class c = o.getClass();				// returns the object id of "Class" class object
		System.out.println(c.getName());
	}
	
	/* Hint 1: We are getting a class name at runtime in the form of string: 
	In this case we have to first load the class, once we get the object we can find out all details of the class. */
	
	public static void printName(String s){
		try{
			Class c = Class.forName(s);				// load the class and it will return "Class" object that represents  "MyClass" class.
			System.out.println(c.getName());		// method of "Class" that returns name of given class.
			StringBuffer sb = (StringBuffer) c.newInstance();	// Down-casting from "Object" class object to StringBuffer. Also creating object without new keyword
			System.out.println(sb.length());			// confirming that object is ready and can call it's methods.
			System.out.println(sb.capacity());
		}catch(ClassNotFoundException e){		// Class.forName() throws ClassNotFoundException
			System.out.println("CNF: " + e);
		}
		catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
	
	/* We are getting a class name at runtime in the form of string: 
	In this case we have to first load the class, once we get the object we can find out all details of the class. 
	To create the object it requires to downcast in the same class which we gathering information.		*/
	public static void printName1(String s){
		try{
			Class c = Class.forName(s);			
			System.out.println(c.getName());
			
			Temp sb = (Temp) c.newInstance();		// If default constructor not found in class then throws InstantiationException
			sb.show();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...a){
		Button b = new Button("BB");
		printName(b);
		
		printName("java.lang.StringBuffer");
		//printName("java.awt.Frame");
		
		printName1("Temp");
		
		/* Hint 3: We know the class name at compile time and we want to find out the detail of that class at run time.*/
		Class c = java.lang.Thread.class;
		System.out.println(c.getName());
	}
}

class Temp{
	
	Temp(){
		System.out.println("Default Constructor");
	}
	
	void show(){
		System.out.println("Creation of object via reflection");
	}
}