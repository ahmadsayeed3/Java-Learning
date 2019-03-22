// Ways to access last elements of LinkedList

import java.util.LinkedList;

public class MyLastElement{
	
	public static void main(String...a){
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("String One");
		linkedList.add("String Two");
		linkedList.add("String Three");
		linkedList.add("String Four");
		linkedList.add("String Five");
		
		System.out.println("Actual List: " + linkedList);
		
		/* getLast(): returns the last element in the list, but if list is empty then it returns exception.*/
		System.out.println("\n via getLast(): " + linkedList.getLast());
		
		/* peekLast(): returns the last element in the list, but if list if empty then it returns null.*/
		System.out.println("\n via peekLast(): " + linkedList.peekLast());
	}
}