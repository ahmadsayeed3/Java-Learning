// Class that using the MyArrayList class
import java.util.Iterator;
public class Students{
	
	public static void main(String...a){
		// new MyArrayList().add(new Integer(5));
		MyArrayList My = new MyArrayList();
		My.add("String 1");
		System.out.println(My);
		
		// Let's add multiple elements
		String[] s1 = {"String 2", "String 3", "String 4", "String 5"};
		My.addAll(s1);
		System.out.println(My);
		
		My.set(0, "String 0");
		System.out.println(My);
		
		// Now let's print the size of the MyArrayList
		System.out.println("Size of MyArrayList is: " + My.size());
		
		// Let's remove the last element
		My.remove();
		System.out.println("After Remove: " + My);
		
		// Now Let's check capacity
		System.out.println("Capacity: " + My.capacity());
		
		// Let's check if array is empty
		System.out.println("Is Empty: " + My.isEmpty());
		
		// not let's iterate the elements
		
		Iterator itr = My.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}