// Know COnstructor
/* We can also know the constructor detail */

import java.lang.reflect.*;

public class KnowConstructor{
	public static void printConstructor(Object o){
		Class c = o.getClass(); 	// get the object of "Class" class.
		Constructor[] cr = c.getConstructors();
		
		for(int i=0; i<cr.length; i++){
			System.out.print(cr[i].getName() + "(");
			
			Class[] pr = cr[i].getParameterTypes();
			for(int k=0; k<pr.length; k++){
				System.out.print(pr[k].getName());
				if(k != pr.length-1){
					System.out.print(", ");
				}
			}
			System.out.println(")");
		}
	}
	
	public static void main(String...a){
		printConstructor(new String());
	}
}

