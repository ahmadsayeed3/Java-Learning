/* The LinkedList class provides unique name method to get(), remove(), and insert() as element at the beginning and end 
of the list; these operation allowed LinkedList to be used as a Stack, Queue, DQueue. The implementation is not also
synchronized.
*/

/* LinkedList have extra 6 methods in comparison of ArrayList and Vector.
public void addFirst(Object o);
public void addLast(Object o);
public Object getFirst();
public Object getLast();
public void removeFirst();
public void removeLast();
*/

import java.util.LinkedList;

class LinkListExample{
	
	public static void main(String...a){
		
		//LinkedList declaration
		LinkedList<String> linkList = new LinkedList<>();
		
		// Add(String elements) is used for adding the elements to LinkedList
		linkList.add("Item 1");
		linkList.add("Item 2");
		linkList.add("Item 3");
		linkList.add("Item 4");
		linkList.add("Item 6");
		
		// Display the LinkedList elements
		System.out.println("Actual Elements: " + linkList);
		
		//Let's add first elements and last elements
		linkList.addFirst("First Item");
		linkList.addLast("Last Item");
		
		System.out.println("After Adding: " + linkList);
		
		// Now let's get and set values in LinkedList.
		Object firstItem = linkList.get(0);
		System.out.println("First Element is: " + firstItem);
		
		linkList.set(0, "Item Changed");
		firstItem = linkList.get(0);
		System.out.println("First Element After Changes: " + firstItem);
		
		
		// Now' let's remove the first and last element.
		linkList.remove();		//By default remove the first element.
		linkList.removeLast();
		System.out.println("After Deletion: " + linkList);
		
		// Now let's add the element to a position and remove from position.
		linkList.add(4, "Item 5");
		System.out.println("Added Element at a position: " + linkList);
		
		linkList.remove(2);
		System.out.println("After removing from position: " + linkList);
		
		System.out.println("First element via getFirst(): " + linkList.getFirst());
		System.out.println("First element via getLast(): " + linkList.getLast());
	}
}