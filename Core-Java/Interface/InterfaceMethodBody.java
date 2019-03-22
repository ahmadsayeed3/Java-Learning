//Interface With Method Body: File name: InterfaceMethodBody

interface InterfaceOne{
	//non-static method with body. requires to add "default" Modifier
	default void show(){
		System.out.println("InterfaceOne Show Method With Default");
	}
}

interface InterfaceTwo{
	//non-static method with body. requires to add "default" Modifier
	default void show(){
		System.out.println("InterfaceTwo Show Method With Default");
	}
}

interface InterfaceThree{
	//non-static method with body. requires to add "default" Modifier
	default void display(){
		System.out.println("InterfaceThree display Method With Default");
	}
}

class Register{
	public void reg(InterfaceOne pi){
		pi.show();
	}
	
	public void regThree(InterfaceThree it){
		it.display();
	}
}

class Child implements InterfaceOne, InterfaceTwo, InterfaceThree{

	//now notice Interface1 and Interface2 both have default show function with body.
	// now it requires to overrride show() in the child class.
	public void show(){
		System.out.println("Show from Child - Overridden");
	}
	
		
	public static void main(String...a){
		Child c = new Child();
		Register r = new Register();
		r.reg(c);
		
		//now notice InterfaceThree has display method that does not require to Override.
		r.regThree(c);
	}

}