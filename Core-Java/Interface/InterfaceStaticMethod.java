//Interface with static method with body {}
//InterfaceStaticMethod.java

interface InterfaceOne{
	// static methods from interfaces never inherits in child class
	static void show(){
		System.out.println("Interface Static Function");
	}
	
	static void display(){
		System.out.println("Interface Display Function");
	}
}

interface InterfaceTwo{
	static void display(){
		System.out.println("Interface Display Function");
	}
}


//here inheriting interface from InterfaceOne and InterfaceTwo that have same static function display.
//in this case it is not require to override that same default method like we do for default method

interface InterfaceThree extends InterfaceOne, InterfaceTwo{
	
	// we don't need to overrride becasue display is static method. 
	//Static don't override, they do function hidding


}

class Child implements InterfaceThree{
	
	static void show(){
		System.out.println("Child Static Function");
	}
	
	public static void main(String... a){
		// static methods from interfaces never inherits in child class
		// So we don't need to register
		InterfaceOne.show();
		show();
	}
	
	
}

interface InterfaceFour{
	private static void show(){
		System.out.println("Interface Private Static Method");
	}

	// From Jdk8 onwards, we can execute interface by keeping a main() in it.
	public static void main(String...a){
		show();		
	}
}