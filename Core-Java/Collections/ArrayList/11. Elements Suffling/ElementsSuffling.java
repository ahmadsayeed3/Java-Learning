// ArrayList Elemenst Shuffling: 

import java.util.ArrayList;
import java.util.Collections;

public class ElementsSuffling{
	
	public static void main(String...a){
		
		// ArrayList Creation.
		ArrayList<String> name = new ArrayList<>();
		name.add("String 1");
		name.add("String 2");
		name.add("String 3");
		name.add("String 4");

		// Actual ArrayList Elements
		System.out.println("Actual ArrayList: " + name);

		// Let's do shuffling... There is a method shuffle() in Collections class that does it.
		Collections.shuffle(name);
		
		// After Shuffling
		System.out.println("After Suffling: " + name);

		//Let's do again suffle
		System.out.println("After Again Suffling: " + name);		
		
	}
}