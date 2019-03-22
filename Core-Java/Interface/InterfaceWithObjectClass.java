// InterfaceWithObjectClass.java

interface InterfaceOne{
	// In java all the interfaces are having the non-final methods of an object class
}

class Child implements InterfaceOne{
	public void display(){
		System.out.println("Display");
	}

	public String toString(){
		return "hello";
	}
	
	public static void main(String...a){
		InterfaceOne io = new Child();
		//io.display(); //error
		String s = io.toString(); // Works
		System.out.println(s);
	}
}

//toString is inside Object Class, that's why it is running. 
//So we are here doing method overridding with toString


//We can also extends and implements togeher.
class ChildTwo extends Object implements InterfaceOne {
	
	public static void main(String... a){
		
	}
}

//We can also extends the method body from other calss and abstract method from other
interface InterfaceTwo{
	void show(); // by default public and abstract
}

class BodyClass{
	public void show(){
		System.out.println("Show From BodyClass");
	}
}

class ChildThree extends BodyClass implements InterfaceTwo{
	
	public static void main(String...a){
		InterfaceTwo it = new ChildThree();
		it.show();
	}
}