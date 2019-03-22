class UpCasting{
	// only for file saving
}


class Parent{
	public void display(){
		System.out.println("I am display from Parent");
	}
	
	public void NotOverriden(){
		System.out.println("I am from Not OverRidden Paret");
	}
}

class Child extends Parent{
	public static void main(String...a){
		//let's do UpCasting. When we put child ref id into parent ref variable.
		Parent p = new Child();
		p.display(); // overriding so it will call child function.
		p.NotOverriden(); // we can access parent function if put child object in parent referenc variable.
		//p.show(); // this will create compilation error. 
		// if we have done upcasting then we can't access child function by parent referenc variable
		
		//Why we do DownCasting
		// to get back the ref id of child calss from parent ref variable.
		// we can do this by creating an new child object but it will create new memory box.
		// so to get the already made object, we do DownCasting
		
		Child c = (Child) p;
		c.display();
	}
	
	public void display(){
		System.out.println("I am display from Child");
	}
	
	public void show(){
		System.out.println("I a show from Child");
	}
}