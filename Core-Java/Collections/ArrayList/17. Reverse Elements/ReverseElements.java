// Reverese the ArrayList Elements:

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements{

	public static void  main(String...args){
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1001);
		arr.add(1002);
		arr.add(1003);
		arr.add(1004);
		
		System.out.println("Actual ArrayList: " + arr);

		// Collections.reverse(Object o): reverse the elements
		
		Collections.reverse(arr);

		// After reversing the elements
		System.out.println("After Reverse: " + arr);

		// Another Example:-
		System.out.println("\nAnother Example");

		ArrayList<Emp> list = new ArrayList<>();
		list.add( new Emp(100) );		
		list.add( new Emp(200) );
		list.add( new Emp(300) );
		list.add( new Emp(400) );
		
		System.out.println("Actual ArrayList: ");
		for(Emp e: list) { System.out.println(e.id); }

		Collections.reverse(list);

		System.out.println("After Reverse Operation: ");
		for(Emp e: list){
			System.out.println(e.id);
		}

	}
}

class Emp{
	int id;
	Emp(int id){
		this.id = id;
	}
}