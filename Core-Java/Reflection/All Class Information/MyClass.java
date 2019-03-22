// Know the parent class details of any class with the help of reflection

import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
public class MyClass{
	
	public static void main(String...a){
		// Know The Parent Classes...
		printParentName(new Frame("FFFF"));
		
		System.out.println("========= Getting the interfaces =======");
		printInterfaces(new Temp());
	}
	
	// Know the parent information...
	public static void printParentName(Object o){
		Class subClass = o.getClass();
		Class superClass = subClass.getSuperclass();
		
		while(superClass != null){
			System.out.println(superClass.getName());
			subClass = superClass;
			superClass = subClass.getSuperclass();
		}
	}
	
	// know the interfaces information
	public static void printInterfaces(Object o){
		Class child = o.getClass();
		Class inter[] = child.getInterfaces();
		
		for(int i=0; i<inter.length; i++){
			System.out.print(inter[i].getName() + ",");
			if(inter[i].getName().equals("java.io.Serializable")){
				System.out.print(child.getName() + " has implemented Serializable");
			}
			
			System.out.println("");
		}
	}
}

interface a1{}
interface a2{}
interface a3{}
class Temp implements a1,a2,a3, Serializable {}