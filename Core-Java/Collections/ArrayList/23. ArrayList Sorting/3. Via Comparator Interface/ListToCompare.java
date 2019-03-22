/* Via Comparable interface we can only have sorting only on one field of an object at a time.
So to do sorting on multiple fields Comparator interface came.
Via Comparator interface we can have sorting on multiple fields of an object at a time.

// Now let's do sorting via Comparator interface that demands to override compare() method.
*/

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListToCompare{
	
	public static void main(String...a){
		
		List<Employee> list = new ArrayList<Employee>();
		list.add( new Employee("Ram", 3000) );
		list.add( new Employee("John", 6000) );
		list.add( new Employee("Cris", 2000) );
		list.add( new Employee("Tom", 2400) );
		
		// Let's first print the actual data
		System.out.println("\nActual Data\n");
		for(Employee e: list){
			System.out.println(e.name + ", " + e.salary);
		}
		System.out.println("\nBy Salary\n");
		
		// Now Let's do sorting on salary field basic.
		Collections.sort( list, new SalarySorting() );
		for(Employee e: list){
			System.out.println(e.name + ", " + e.salary);
		}
		
		System.out.println("\nBy Name\n");
		// Now Let's do sorting on name field basic.
		Collections.sort( list, new NameSorting() );
		for(Employee e: list){
			System.out.println(e.name + ", " + e.salary);
		}
	}
}

class Employee{
	String name;
	int salary;
	
	//Constructor
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	int getSalary(){
		return salary;
	}
}

// Now Let's create sorting logic for different fields

// On Salary based sorting
class SalarySorting implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		if( e1.getSalary() > e2.getSalary() ){ return 1; }
		else { return -1; }
	}
}

// on Name basis sorting
class NameSorting implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		return e1.name.compareTo(e2.name);
	}
}