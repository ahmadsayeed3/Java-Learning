// Access LinkedList Via Loops

import java.util.LinkedList;
import java.util.Iterator;

public class LinkListLoop{
	
	public static void main(String...a){
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Orange");
		linkedList.add("Mango");
		linkedList.add("Papaya");
		
		// via for loop
		System.out.println("\nVia Loop:");
		for(int i=0; i< linkedList.size(); i++){
			System.out.println(linkedList.get(i));
		}
		
		// Via advance for loop
		System.out.println("\nVia Advance Loop:");
		for(String s1: linkedList){
			System.out.println(s1);
		}
		
		// Via while loop
		int num = 0;
		System.out.println("\nVia While Loop:");
		while(linkedList.size() > num){
			System.out.println(linkedList.get(num));
			++num;
		}
		
		// Via Iterator
		System.out.println("\nVia Iterator:");
		Iterator itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}