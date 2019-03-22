// Another example of Generic class.

class Gen<T>{
	
	T o;  	/* declared and data member of Type T*/
	
	//Constructor
	Gen(T o){
		this.o = o;
	}
	
	// Generic Method
	T getObj(){
		return o;
	}
	
	// Know the Wrapper class name coming data.
	public void showType(){
		Class c = o.getClass();
		System.out.println("Type of T is: " + c.getName());
	}
}

public class GenDemo{
	
	public static void main(String...a){
		
		System.out.println("\nWith Integer\n");
		Gen<Integer> iObj = new Gen<Integer> (98);
		iObj.showType();
		int val = iObj.getObj();
		System.out.println("Value: " + val);
		
		System.out.println("\nWith String\n");
		Gen<String> sObj = new Gen<String> ("Ahmad Sayeed");
		sObj.showType();
		String s1 = sObj.getObj();
		System.out.println ("Value is: " + s1);
		
		System.out.println("\nWith User Defined Class\n");
		Employee e = new Employee();
		Gen<Employee> e1 = new Gen<Employee> (e);
		e1.showType();	
		Employee e2 = e1.getObj();
		System.out.println("Value is: " + e2);
	}
}

class Employee{
	int x = 200;
}