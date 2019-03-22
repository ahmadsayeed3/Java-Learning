// add(Integer index, Object go)
// All Collection methods come to List. List class has also overloaded many number of methods.

import java.util.ArrayList;

public class AddMethod{
	
	public static void main(String...a){
		
		// Create Generic ArrayList object, type String
		ArrayList<String> al = new ArrayList<>();
		al.add("HI");
		al.add("Hello");
		al.add("Welcome");
		al.add("Test STring");
		
		System.out.println(al);
		
		// Using the overloaded method of List add(Integer index, Object go)
		al.add(0, "New String");
		al.add(0, "Good Bye");
		
		System.out.println("More Elements: " + al);
	}
}