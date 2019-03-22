// InterfaceWithPrivateMethod.java

interface InterfaceOne{	

	// Private Methods Don't go outside so we can only execute here
	private static void show(){
		System.out.println("Interface Private Static Method");
	}
	
	default void Draw(){
		display();
	}
	
	private void display(){
		System.out.println("Private Display Function");
	}
	
	
	//From Jdk8 onwards, we can execute interface by keeping a main() in it.
	public static void main(String...a){
		show();	
	}
}


class Register{
	public void reg(InterfaceOne io){
		io.Draw();
	}	
}

class Child implements InterfaceOne{
	
	public static void main(String...a){
		Child c = new Child();
		Register r = new Register();
		r.reg(c);		
	}	
}