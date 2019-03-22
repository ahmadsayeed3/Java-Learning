// ArrayList subList.
// Consider it like substring but here it gets elements.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSubRange{
	
	public static void main(String...args){
		
		ArrayList<String> name = new ArrayList<>();
		name.add("String 1");
		name.add("String 2");
		name.add("String 3");
		name.add("String 4");
		name.add("String 5");

		// print actual ArrayList
		System.out.println("Actual Element: " + name);

		// Now let's get elements by subrange
		// ArrayList's subList() returns List class Object.
		// ArrayList<String> ls = (ArrayList<String>) name.subList(2,4); 	// Error
	
		List<String> ls = name.subList(2,4);		

		//Let's print the new value
		System.out.println("Sub List value: " + ls);
	}
}