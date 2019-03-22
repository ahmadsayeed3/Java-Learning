// Know the Methods

import java.lang.reflect.*;

public class KnowMethods{
	
	public static void printMethodsName(Object o){
		Class c = o.getClass();
		
		Method[] mt = c.getMethods();
		
		for(int i=0; i<mt.length; i++){
			System.out.print(mt[i].getReturnType().getName() + " ");
			System.out.print(mt[i].getName() + "(");
			
			Class[] pr = mt[i].getParameterTypes();
			
			for(int j=0; j<pr.length; j++){
				System.out.print(pr[j].getName());
				if(j != pr.length-1){
					System.out.print(", ");
				}
			}
			System.out.println(")");
		}
	}
	
	public static void main(String...a){
		printMethodsName(new String());
	}
	
}