// Ways To Add and Get Elements From Collections

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWays{
	
	public static void main(String...args){
		// 1.
		System.out.println("\n====Via iterator() method====");
		via_iterator_function();
		
		// 2.
		System.out.println("\n====Via toArray() method====");
		via_toArray_function();
		
		// 3.
		System.out.println("\n====Via Advance for loop (foreach)====");
		via_advance_for_loop();
		
		// 4. 
		System.out.println("\n====Via get() function====");
		via_get_function();
	}
	
	
	public static void via_iterator_function(){
		ArrayList<Integer> al = new ArrayList<> ();
		
		int[] x = {1, -1, 2,  -2, 3, -3, 4, -4};
		// Add Via Loop
		for(int i=0; i<x.length; i++){
			al.add(x[i]);
		}
		System.out.println(al);
		
		// Get Elements via iterator()
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()){
			Integer i = itr.next();	// Auto UN-boxing and down-casting.
			if(i < 0) itr.remove();
			// Integer i = (Integer ) itr.next();	//Down-casting
		}
		System.out.println("After Removal: " + al);
	}
	
	
	public static void via_toArray_function(){
		
		ArrayList<Integer> al = new ArrayList<> ();
		int[] x = {1, -1, 2,  -2, 3, -3, 4, -4};
		// Add Via Loop
		for(int i=0; i<x.length; i++){
			al.add(x[i]);
		}
		System.out.println(al);
		
		// Get Elements via toArray() method
		System.out.print("Using toArray(): ");
		Object[] o = al.toArray();
		
		for(int i=0; i < o.length; i++){
			Integer z = (Integer) o[i];		// Down-casting required
			System.out.print(z.intValue() + " ");
			// System.out.println(z+ " ");
		}
		System.out.println();
	}
	
	
	public static void via_advance_for_loop(){
		ArrayList<Integer> al = new ArrayList<> ();
		int[] x = {1, -1, 2,  -2, 3, -3, 4, -4};
		// Add Via Loop
		for(int i=0; i<x.length; i++){
			al.add(x[i]);
		}
		System.out.println(al);
		
		System.out.print("Using foreach: ");
		for(Integer it: al){
			System.out.print(it.intValue() + " ");
			// System.out.println(it+ " ");
		}
	}
	
	public static void via_get_function(){
		System.out.println();
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("String 1");
		arrList.add("String 2");
		arrList.add("String 3");
		arrList.add("String 4");
		
		// ArrayList To Array
		
		// Create an array of ArrayList Size
		String[] s1 = new String[arrList.size()];
		
		for(int i=0; i<arrList.size(); i++){
			s1[i] = arrList.get(i);
		}
		
		// Displaying Array s1 elements
		
		for(String s: s1){
			System.out.println(s);
		}
		
	}
}