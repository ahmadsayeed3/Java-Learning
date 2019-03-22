// Trim ArrayList capacity size. we can call Collections trim() method that will remove un-used capacity.

import java.util.Vector;

public class TrimCapacity{
	
	public static void main(String...args){
		
		// ArrayList<Integer> arrayList = new ArrayList<> ();
		//ArrayList does not have capacity() method so we are using Vector Class.
		
		Vector<Integer> arrayList = new Vector<> ();
		System.out.println("Default Capacity: " + arrayList.capacity() );
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		System.out.println("Added 6 Elements: " + arrayList);
		
		
		arrayList.trimToSize();
		System.out.println("After Size Trim: " + arrayList.capacity());
		
		
	}
}

