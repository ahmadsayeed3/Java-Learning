// ArrayList Sorting:

/* List does not have any class that sort the elements. 
Collections class have sort() method that sort elements.
But technology does not know in which basis we want to sort the data.
For this we got Comparable interface that have compareTo() method. We have to implement and override the compareTo().
After that we have to write our sorting logic inside compareTo().
But this way, we can only do sorting in one basis means if we have written to sort the data in ID basis then it
will be hard-coded and for other basis we have re-write it.


*/

import java.util.ArrayList;
import java.util.Collections;

class SortArrayList{
	
	public static void main(String...a){
		
		// List of countries...
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("USA");
		list.add("CHINA");
		list.add("DENMRK");
		list.add("CHINA");
		
		// Let's print the actual and unsorted list.
		System.out.println("Before Sorting");
		for(String ls: list){	System.out.println(ls);	}
		
		// Now let's do the sorting and print them
		Collections.sort(list);
		
		System.out.println("After Sorting");
		for(String ls: list){	System.out.println(ls);	}
	}
}
