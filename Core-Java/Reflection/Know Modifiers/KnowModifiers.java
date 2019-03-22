// Know the modifiers of class, data member  or method

import java.lang.reflect.*;

public class KnowModifiers{
	
	// @Main
	public static void main(String...s){
		try{
			printClassModifiers("java.lang.String");
			System.out.println("================\n================\n================");
			printMethodModifiers("java.lang.String");
			System.out.println("================\n================\n================");
			printFieldsModifiers("java.lang.String");
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	
	// @class modifiers
	public static void printClassModifiers(String s) throws ClassNotFoundException{
		Class c = Class.forName(s); 		// load the class
		int m = c.getModifiers();
		System.out.print(s + " class modifiers are: ");
		if(Modifier.isPublic(m)){
			System.out.print("Public ");
		}
		
		if(Modifier.isFinal(m)){
			System.out.print("Final ");
		}
		
		if(Modifier.isAbstract(m)){
			System.out.print("Abstract ");
		}
		System.out.println("");
	}
	
	// @method modifiers
	public static void printMethodModifiers(String s) throws ClassNotFoundException{
		Class c = Class.forName(s); 		// load the class
		//int m = c.getModifiers();
		
		Method mt[] = c.getMethods();
		
		for(int i=0; i<mt.length; i++){
			int m = mt[i].getModifiers();
			
			System.out.print(mt[i].getName() + " modifiers are: ");
			
			if(Modifier.isPublic(m)){
			System.out.print("Public ");
			}
			
			if(Modifier.isFinal(m)){
				System.out.print("Final ");
			}
			
			if(Modifier.isAbstract(m)){
				System.out.print("Abstract ");
			}
			System.out.println("");
		}
	}
	
	
	// @Field modifiers
	public static void printFieldsModifiers(String s) throws ClassNotFoundException{
		Class c = Class.forName(s); 		// load the class
		//int m = c.getModifiers();
		
		Field f[] = c.getFields();
		
		for(int i=0; i<f.length; i++){
			int m = f[i].getModifiers();
			
			System.out.print(f[i].getName() + " modifiers are: ");
			
			if(Modifier.isPublic(m)){
			System.out.print("Public ");
			}
			
			if(Modifier.isFinal(m)){
				System.out.print("Final ");
			}
			
			if(Modifier.isAbstract(m)){
				System.out.print("Abstract ");
			}
			System.out.println("");
		}
	}
	
}