// Ways to remove elements from linkedList. All remove() methods of LinkedList.

import java.util.LinkedList;

public class AllRemoveMethod{
	
	public static void main(String...args){
		LinkedList<String> linkedList = new LinkedList<> ();
		linkedList.add("String One");
		linkedList.add("String Two");
		linkedList.add("String Three");
		linkedList.add("String Four");
		linkedList.add("String Five");
		linkedList.add("String Six");
		linkedList.add("String Seven");
		linkedList.add("String Eight");
		linkedList.add("String Eight");
		linkedList.add("String Nine");
		
		System.out.println("Actual List: " + linkedList);
		
		System.out.println("\n remove(): " + linkedList.remove());
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n remove(index): " + linkedList.remove(2));
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n remove(Object): " + linkedList.remove("String Six"));
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n removeFirst(): " + linkedList.removeFirst());
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n removeLast(): " + linkedList.removeLast());
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n removeFirstOccurrence(): " + linkedList.removeFirstOccurrence("String Eight"));
		System.out.println(" Changed List: " + linkedList);
		
		System.out.println("\n removeLastOccurrence(): " + linkedList.removeLastOccurrence("String Three"));
		System.out.println(" Changed List: " + linkedList);
	}
}