// Element Check: check if elements is available in an ArrayList.
/* containsAll() method checks if all elements of passed array are available in an ArrayList*/

import java.util.ArrayList;
import java.util.List;

public class ElementCheck{
	
	public static void main(String...args){
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("String 1");
		arr.add("String 2");
		arr.add("String 3");
		arr.add("String 4");
		arr.add("String 5");

		// ArrayList<String> list = new ArrayList<>();		// also works
		List<String> list = new ArrayList<>();			
		list.add("String 1");
		list.add("String 2");

		System.out.println("Does ArrList contains all List elements: " + arr.containsAll(list));

		// Add Few More Elements
		list.add("String 6");

		System.out.println("Does ArrList contains all List elements: " + arr.containsAll(list) );
	}

}