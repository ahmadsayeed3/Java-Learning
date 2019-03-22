/* 1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, 
		subclass exception or no exception but cannot declare parent exception.
		class Parent. */

import java.io.*;
class Parent{
	
	void show()	throws IOException{
		System.out.println("Parent Show");
	}
	
	void display() throws IOException{
		System.out.println("Parent Display");
	}
	
	void drawing() throws IOException{
		System.out.println("Parent Display");
	}
	
	void watch()  throws IOException{
		System.out.println("Parent Watch");
	}
}

public class CaseTwo extends Parent{
	
	public static void main(String...a){
		try{
			
			new CaseTwo().show();
			new CaseTwo().display();
			new CaseTwo().drawing();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	/* Overriding the show() with no exception. It Can Happen. */
	void show(){
		System.out.println("Child Show");
	}
	
	/* Overriding the display() with same exception. It Can Happen. */
	void display()	throws IOException{
		System.out.println("Child Display");
	}
	
	/* Overriding the drawing() with class that is child of parent's drawing() throwing exception class.
	 FileNotFoundException is the Child of IOException class. It Can Happen. */
	void drawing() throws FileNotFoundException{
		System.out.println("Child Drawing");
	}
	
	/* Overriding the watch() with class that is parent	exception of my parent's watch() throwing exception class
			Exception is the parent of IOException. 
			It Can't Happen */
	
	/*	void watch() throws Exception{
			System.out.println("Watch From Child");
		}
	*/
}