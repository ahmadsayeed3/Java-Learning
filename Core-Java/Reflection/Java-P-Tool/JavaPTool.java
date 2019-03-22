import java.lang.reflect.*;
import java.util.Scanner;

public class JavaPTool{

	public static void main(String...a){
		String s = takeInput("Enter class name with package name...");
		printClassInfo(s);
	}

	public static String takeInput(String s){
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void printClassInfo(String s){
		System.out.println("Compiled from \"" + s + ".java\"" );
		
		// print class name, parent and interfaces
		try{
			Class c = Class.forName(s); 		// load the class and returns the object.
			
			// Printing class modifiers
			int m = c.getModifiers();
			if(Modifier.isPublic(m)){	System.out.print("public "); 	}
			if(Modifier.isFinal(m)){	System.out.print("final "); 	}
			if(Modifier.isAbstract(m)){	System.out.print("abstract "); 	}
			
			System.out.print("class ");
			
			// printing parent class if exists
			Class superClass = c.getSuperclass();
			if(superClass.getName() != ""){	System.out.print("extends " + superClass.getName() + " ");	}
			
			// printing the interfaces if exists
			Class inter[] = c.getInterfaces();
			if(inter.length > 0){	System.out.print("implements ");	}
			for(int i=0; i<inter.length; i++){
				System.out.print(inter[i].getName());
				if(i != inter.length-1){	System.out.print(", ");		}
			}
			
			System.out.println("{");
			
			// Printing Fields
			Field[] f = c.getDeclaredFields();
			for(int j =0; j<f.length; j++){
				// get and print field modifiers
				int fm = f[j].getModifiers();
				if(Modifier.isPublic(fm)){	System.out.print("public "); 	}
				if(Modifier.isStatic(fm)){	System.out.print("static "); 	}
				if(Modifier.isFinal(fm)){	System.out.print("final "); 	}
				if(Modifier.isAbstract(fm)){	System.out.print("abstract "); 	}
			
				Class type = f[j].getType();
				System.out.println(type.getName() + " " + f[j].getName());
			}
			
			// Printing methods
			Method[] mt = c.getDeclaredMethods();
			for(int k=0; k<mt.length; k++){
				
				// get and print modifiers
				int mm = mt[k].getModifiers();
				if(Modifier.isPublic(mm)){	System.out.print("public "); 	}
				if(Modifier.isStatic(mm)){	System.out.print("static "); 	}
				if(Modifier.isFinal(mm)){	System.out.print("final "); 	}
				if(Modifier.isAbstract(mm)){	System.out.print("abstract "); 	}
				
				// get and print type
				Class type = mt[k].getReturnType();
				System.out.print(type.getName() + " ");
				
				System.out.print(mt[k].getName() + "(");
				
				// get & print parameters
				Parameter pr[] = mt[k].getParameters();
				for(int n=0; n<pr.length; n++){
					System.out.print(pr[n].getType().getName() + " " + pr[n].getName());
					if(n != pr.length-1){	System.out.print(", ");	}
				}
				
				System.out.println(");");
			}
			
		}catch(ClassNotFoundException e){	System.out.println("Class Loading: " + e);	}
		catch(Exception e){		System.out.println("Exception: " + e);	}
		
	}
	
}