// Get Package Name of any class
import java.lang.reflect.*;
import java.util.*;
public class KnowPackage{
	
	public static void printPackageName(Object o){
		Class c = o.getClass();
		
		Package pk = c.getPackage();
		System.out.println(pk.getName());
	}
	
	public static void main(String...s){
		printPackageName(new String());
		printPackageName(new Date());
	}

}