// InterfaceInheritanceMore.java

interface InterfaceOne{
	default void show(){
		System.out.println("InterfaceOne Show");
	}
	
	default void display(){
		System.out.println("Display From Interface");
	}
}

interface InterfaceTwo{
	default void show(){
		System.out.println("InterfaceTwo Show");
	}
}

//here inheriting interface from InterfaceOne and InterfaceTwo that have same defaul function show.
//in this case it requires to override that same default method

interface InterfaceThree extends InterfaceOne, InterfaceTwo{
	
	// overridding
	default void show(){
		System.out.println("InterfaceThree Show");
	}

	//Don't need to override display()
	//because it is alone method from InterfaceOne
}

class Child implements InterfaceThree{
	
	
	public static void main(String...a){
		InterfaceThree c = new Child();
		c.show();
			//OR Both Works
		InterfaceThree c1 = new Child();
		Register r = new Register();
		r.reg(c1);

		InterfaceOne io = new Child();
		io.display();
	}
}


class Register{
	public void reg(InterfaceThree it){
		it.show();
	}
}