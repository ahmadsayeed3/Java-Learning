// Interface Inheritance

interface GrandParentInterface{
	public abstract void display();
}

interface ParentInterface extends GrandParentInterface{
	public abstract void show();
}

interface ChildInterface extends ParentInterface, GrandParentInterface{
	public abstract void draw();
	public abstract void show(); // again overwriting the show function
}

class InterfaceRegister{
	public void register(ChildInterface ci){
		ci.show();
		ci.display();
		ci.draw();
	}
}

// In Child class, It requires to override all methods of all related interfaces
class Child implements ChildInterface{
	public static void main(String... a){
		Child c = new Child();
		
		InterfaceRegister ir = new InterfaceRegister();
		ir.register(c);
	}
	
	//show function is inside ChildInterface and ParentInterface.
	// we only need to override once.
	public void show(){
		System.out.println("Show");
	}
	public void display(){
		System.out.println("Display");
	}

	public void draw(){
		System.out.println("Draw");
	}
}