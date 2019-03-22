// Q. What happens when create ArrayList of "ArrayList TYpe"

import java.util.ArrayList;

public class ListDemo3{
	
	public static void main(String... args){
		
		// create ArrayList of "ArrayList TYpe"
		ArrayList <ArrayList> al = new ArrayList<> ();
		System.out.println("Size OF al is: " + al.size() );
		
		// New ArrayList, Type String
		ArrayList<String> s1 = new ArrayList<> ();
		s1.add("Ahmad");
		s1.add("Asmal");
		s1.add("Sayeed");
		
		al.add(s1);
		System.out.println("After adding s1: " + al.size());
		
		al.add(al);			// Just added own ArrayList reference id to the own ArrayList as an element. 
		System.out.println("After adding itself al: " + al.size());
		
		System.out.println(al.get(1).get(0)); 		// will get s1 reference
	}
}