/* Via Comparable interface we can only have sorting only on one field of an object at a time.
So to do sorting on multiple fields Comparator interface came.
Via Comparator interface we can have sorting on multiple fields of an object at a time.

// Now let's do sorting via Comparable interface
*/

import java.util.ArrayList;
import java.util.Collections;

public class ListToCompare{
	
	public static void main(String...a){
		
		ArrayList<Employee> list = new ArrayList<> ();
		list.add( new Employee("Ram", 3000) );
		list.add( new Employee("John", 6000) );
		list.add( new Employee("Cris", 2000) );
		list.add( new Employee("Tom", 2400) );
		
		// Sort the list. It will do sorting on salary basis because we have defined in Employee class.
		Collections.sort(list);
		
		// Now Let's print the sorted elements
		for(Employee e: list){
			System.out.println(e.getSalary());
		}
		
		
	}
}


// Employee Class

class Employee implements Comparable<Employee>{
	
	String name;
	int salary;
	
	// Constructor
	Employee(String name, int salary){
		this
		.name = name;
		this.salary = salary;
	}
	
	int getSalary(){
		return salary;
	}
	
	public int compareTo(Employee e){
		// Sorting logic, it call by technology
		if(this.salary > e.salary){ return 1; }
		if(this.salary < e.salary){ return -1; }
		else { return 0; }	

		/*If we want to do sorting the we have change the source code again.*/
	}
}