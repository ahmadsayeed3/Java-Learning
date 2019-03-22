import java.util.ArrayList;		// required for ArrayList
import java.util.Iterator;

public class ArrayListDemo{
	
	public static void main(String...args){
		
		// Generic ArrayList, create object.
		ArrayList<String> names = new ArrayList<> ();
		// add method adds the element in the ArrayList
		names.add("Ahmad");
		names.add("Sayeed");
		names.add("Asmal");
		// names.add('Y');
		// names.add(10); we have fixed type String. No other data type can store.
		
		// Let's print the size/length of the ArrayList
		System.out.println("Size/Length is: " + names.size());
		
		//Let's remove the element from ArrayList
		names.remove(1);	// it will remove "Sayeed"
		
		// Let's print the size/length after removal
		System.out.println("After Removal Length is: " + names.size());
		
		// Let's iterate the elements from ArrayList
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String s = it.next();		// Auto UN-Boxing
			System.out.println(s);
		}
		
		
		/* Non-Generic ArrayList */
		System.out.println("\n=======Non Generic ArrayList=======\n");
		
		ArrayList age = new ArrayList();
		age.add(25);				// Auto Boxing
		age.add(new Integer(26));	// Providing wrapper class that will hold in Object
		age.add(27);
		age.add("MY Age");		// As here no type defined. But it will raise problem while iterating
		System.out.println("Size/Length is: " + age.size());
		
		age.remove(2);
		System.out.println("After Removal Length is: " + age.size());
		
		// Iterating: It is not generic so it won't downcast implicitly, we have to do this explicitly and this is the problem.
		Iterator itr = age.iterator();
		while(itr.hasNext()){
			Integer z = (Integer) itr.next();		// String cannot be cast to Integer
			//Integer z = itr.next();				// Object cannot be converted to Integer
			System.out.println(z);
		}
		
		/*When while loop reach to index 3 means at string value, it will throw ClassCastException */
		// Also when use Non-Generic ArrayList, compiler shows warning
	}
}