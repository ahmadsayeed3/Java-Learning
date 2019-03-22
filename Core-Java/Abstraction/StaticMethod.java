abstract class Parent{
	
	//static methods are allowed
	static void show(){
		System.out.println("Static Show From Parent Calling From Child Object");
		methodPrivateNon();
	}
	
	public void nonStaticMethod(){
		System.out.println("Non-Static method from Paren Class CAlling From Child Object");
	}

	// "Abstrac static" method are not allowed
	//abstract static void display();
	abstract void See();
	
	public static void main(String...a){
		System.out.println("Executing The Abstrac Parent Class Direct");
		// also can call static method
		show();
		methodPrivateStatic();
	}
	
	// From JDK 9, we can have private method in abstra class static and non-static
		private static void methodPrivateStatic(){
			System.out.println("I am Private Static Method of Abstract Class");
		}
		
		private static void methodPrivateNon(){
			System.out.println("I am Private Non-static Method of Abstract Class");
		}
}

class Child extends Parent{
	
	public static void main(String...a){
		Child c = new Child();
		c.show();
		
		c.nonStaticMethod();
	}
	
	//Every Abstract method that have Parent is must be override in Child
	void See(){
		
	}

	void display(){
	
	}
}