/* Reflection : Reflection is used to find out the detail of any class at runtime whenever we are getting a some clue about
	that class at run-time. */

/* Hint 1: We are getting a class name at runtime in the form of string: 
	In this case we have to first load the class, once we get the object we can find out all details of the class. */
	
/*	Hint 2: We are getting an object of some class at run time into the reference value of parent class. */

/* Hint 3: We know the class name at compile time and we want to find out the detail of that class at run time.*/

import java.lang.reflect.*;
import java.awt.*;

class ClassDetails{
	
	// Hint:1 
	public static void printName(String s){
		try{
			Class c = Class.forName(s);			// load the class and it will return "Class" object that represents  "MyClass" class.
			System.out.println(c.getName());	// method of "Class" that returns name of given class.
			MyClass mc = (MyClass) c.newInstance();		// Down-casting from "Object" class object to MyClass. Also creating object without new keyword
			mc.show();							// confirming that object is ready and can call it's methods.
		}catch(ClassNotFoundException e){		// Class.forName() throws ClassNotFoundException
			System.out.println("CNF: " + e);
		}
		catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
	
	// Hint:2
	public static void printName1(Object o){
		try{
			Class c = o.getClass();		// returns the object id
			System.out.println(c.getName());
			MyClass mc1 = (MyClass) c.newInstance();	// If default constructor not found in class then throws InstantiationException
			mc1.show();
		}catch(InstantiationException | IllegalAccessException e){
			System.out.println(e);
		}
	}
	
	// Hint:3
	public static void printName2(){
		try{
			//Class c = MyClass.class;
			Class c = java.lang.Thread.class;
			System.out.println(c.getName());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...a){
		// HInt 1:
		printName("MyClass");
		
		//Hint2: 
		printName1(new MyClass());
		
		//HInt 3:
		printName2();
	}
	
}

class MyClass{
	public void show(){
		System.out.println("Show From MyClass");
	}
}