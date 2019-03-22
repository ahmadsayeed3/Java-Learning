/* Lambda Expression with loops/collection. */

import java.util.*;
public class LambdaWithCollection{
	
	public static void main(String...args){
		String[] str = {"Ahmad", "Sayeed", "Asmal", "Babu"};
		// create an ArrayList
		List<String> names = Arrays.asList(str);
		
		System.out.println("\nvia lambda expression\n");
		names.forEach( (n)-> System.out.println(n) );
		
		System.out.println("\nusing (::) double colon operator from java 8\n");
		names.forEach(  System.out::println);
	}
}