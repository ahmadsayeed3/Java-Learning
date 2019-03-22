/* ArrayList's ensureCapacity(): Increases the capacity of this <tt>ArrayList</tt> instance, 
// if
 necessary, to ensure that it can hold at least the number of elements
 specified by the minimum 
// capacity argument.

// ArrayList does not have capacity() method so to understand this we are using Vector Class.
// capacity() method return the current size of the Collection.

// Recommended: The default size of ArrayList is 10. 
// If we know the current size of collection then we must increase it before using.
*/

import java.util.ArrayList;
import java.util.Vector;

public class EnsureCapacity{
	
	public static void main(String...a){
		
		// ArrayList with capacity
		// ArrayList<String> al = new ArrayList<> (4);

		Vector<String> al = new Vector<>(4);
		System.out.println("Current Size: " + al.capacity());

		// Now let's add elements
		al.add("Hi");
		al.add("Hello");
		al.add("Bye");
		al.add("Good Morning");

		//Now let's increase the capacity()
		al.ensureCapacity(76);

		System.out.println("After Inreasing the capacity: " + al.capacity());

		// Let's add few more elements
		al.add("Good Evening");
		al.add("Good AfterNoon");
		al.add("Good Night");
		for(String s1: al){
			System.out.print(s1 + ", ");
		}
		
		System.out.println();
	}
}

