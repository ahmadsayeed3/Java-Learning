/* Check if given object is primitive, interface or array */ 

public class WhatIs{
	
	public static void main(String...s){
		Class i = int.class;
		Class ar = int[].class;
		Class inf = java.io.Serializable.class;
		
		if(i.isPrimitive()){
			System.out.println("i is Primitive");
		}
		
		if(ar.isArray()){
			System.out.println("ar is an Array");
		}
		
		if(inf.isInterface()){
			System.out.println("inf is an interface");
		}
		
		// This is also work :)
		if(int.class.isPrimitive()){
			System.out.println("int is Primitive");
		}
	}
}