// LinkList operation on user-defined class.

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample{
	
	public static void main(String...a){
		
		// LinkedList declaration
		LinkedList<Emp> linkList = new LinkedList<>();
		
		// Let's add the elements in LinkedList
		linkList.add(new Emp(1001, "Vineet"));
		linkList.add(new Emp(1002, "Prem"));
		linkList.add(new Emp(1003, "Javed"));
		linkList.add(new Emp(1004, "Sayeed"));
		linkList.add(new Emp(1005, "Parul"));
		linkList.add(new Emp(1006, "Lovely"));
		
		// Display the LinkedList elements
		Iterator<Emp> itr = linkList.iterator();
		while(itr.hasNext()){
			Emp e = itr.next();
			System.out.println(e.id + ", " + e.name);
		}
		
		// Now Let's add elements at first and last.
		linkList.addFirst(new Emp(1000, "Kotlin"));
		linkList.addLast(new Emp(1007, "Papaya"));
		System.out.println("\nAfter Adding: ");
		for(Emp e: linkList){
			System.out.println(e.id + ", " + e.name);
		}
		
		// This is how i get and set value.
		linkList.set(0, new Emp(1000, "Aniqa"));
		Emp e1 = (Emp) linkList.get(0);
		System.out.println("\nChanges via set(0): " + e1.id + ", " + e1.name);
		
		// Now let's remove first and last Element.
		linkList.remove();
		linkList.removeLast();
		
		System.out.println("\nAfter removing first and las elements:");
		itr = linkList.iterator();
		while(itr.hasNext()){
			Emp e = itr.next();
			System.out.println(e.id + ", " + e.name);
		}
		
		// Add to position and remove from a position.
		linkList.add(0, new Emp(999, "Harsh"));
		linkList.remove(linkList.size()-1);
		System.out.println("\nAfter adding via position: ");
		for(Emp e: linkList){
			System.out.println(e.id + ", " + e.name);
		}
		
		Emp fe = (Emp) linkList.getFirst();
		System.out.println("\nFirst element via getFirst(): " + fe.id + ", " + fe.name);
		
		fe = (Emp) linkList.getLast();
		System.out.println("\nFirst element via getLast(): " + fe.id + ", " + fe.name);
		
	}
}



class Emp{
	int id;
	String name;
	
	//Constructor
	Emp(int id, String name){
		this.id = id;
		this.name = name;
	}
}