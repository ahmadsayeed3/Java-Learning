// Normal Way. it can only accept integer and store in the memory
/*
class MyClass{
	int x;
	int y;
	
	MyClass(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void show(){
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String...args){
		MyClass mc = new MyClass(20,30);
		mc.show();
	}
}
*/

// Generic Class that can refer to any data type

class MyClass <T>{	// we can use whatever name we want but recommended to use 'T' 
	T x;	
	T y;
	
	MyClass(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	public void show(){
		System.out.print(x + ", " + y);
		System.out.println();
	}
	
	public static void main(String...args){
		MyClass <Integer> mc = new MyClass <Integer> (20,30);
		mc.show();
		
		
		MyClass <String> mc1 = new MyClass <String> ("Ahmad","Sayeed");
		mc1.show();
		
		/*Once we have assigned in 'mc1' variable, we can't put other reference inside it. */
		// mc1 = mc;	// compilation error: MyClass<Integer> cannot be converted to MyClass<String>
		
		/* But we can assign same data type reference id */
		MyClass <Integer> mc0 = new MyClass<> (50,40);
		mc0.show();
		mc0 = mc;		// Assigning here, not compilation error.
		mc0.show();
		
		/* From JDK <> diamond operator came that allows us to provide wrapper class name only once. */
		MyClass <Float> mc2 = new MyClass <> (1.5F, 2.5F);
		mc2.show();
	}
}

/* Why do wee need to provide wrapper class name of primitive data type?
	And how does it works?
	
	Actually while compilation JVM implicitly changes the 'T' or our given data type name to 'Object'.
	As we know Object class is the parent class so it can hold the reference of all classes.
	That's why we provide value via wrapper class. Till JDK 6, we were able to see this via javap tool but
	after jDK 6, it hidden.
*/
