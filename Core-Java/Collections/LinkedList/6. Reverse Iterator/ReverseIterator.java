// reverse the iterator in LinkedList

import java.util.LinkedList;
import java.util.Iterator;

class ReverseIterator{
	public static void main(String...a){
		
		LinkedList<String> name = new LinkedList<>();
		name.add("String One");
		name.add("String Two");
		name.add("String Three");
		name.add("String Four");
		name.add("String Five");
		
		System.out.println("Actual List: " + name);
		
		// Now let's iterate in descending order.
		System.out.println("\nAfter Reverse Iteration: ");
		Iterator itr = name.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}