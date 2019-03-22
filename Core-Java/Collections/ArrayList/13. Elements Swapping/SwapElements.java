// ArrayList: swap the elements.

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements{

	public static void main(String...args){
	
		ArrayList<String> name = new ArrayList<>();
		name.add("String 1");
		name.add("String 2");
		name.add("String 3");
		name.add("String 4");
		name.add("String 5");

		// Let's print Actual ArrayList
		System.out.println("Actual ArrayList: " + name);

		// Let's swap the elements with the help of
		// Collections class's swap(Object o, firstElement, LastElement)
		
		Collections.swap(name, 2,4);

		// After swapping ArrayList Elements
		System.out.println("After Swaping: " + name);

		// After Again swapping ArrayList Elements
		Collections.swap(name, 0,4);
		System.out.println("Again Swaping: " + name);
	}
}