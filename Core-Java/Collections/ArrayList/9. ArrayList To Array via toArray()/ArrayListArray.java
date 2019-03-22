// ArrayList Array: void toArray(Object[] o): it adds all elements inside this passed array

import java.util.ArrayList;

public class ArrayListArray{
	public static void main(String...a){
		ArrayList<String> ar = new ArrayList<>();
		ar.add("First");
		ar.add("Second");
		ar.add("Third");
		ar.add("Random");

		System.out.println("Actuals ArrayList: " + ar);

		// Create an array of the ArrayList size:
		String[] s1 = new String[ ar.size() ];
		
		// Not let's add all ArrayList elements to s1 array.
		ar.toArray(s1);

		// Let's print the array elements
		System.out.print("Array Element: ");		
		for(String s2: s1)	System.out.print( s2 + ", ");

		System.out.println();
	}
}