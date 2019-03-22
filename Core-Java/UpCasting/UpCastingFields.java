class UpCastingFields{
	// only for saving file.
}

class Parent{
	// Does not happens Data Member Overriding
	int x = 10;
	
	//Does Member Function Overriding
	void show(){
		System.out.println("I am show from Parent");
	}
}

class Child extends Parent{
	int x = 5;
	public static void main(String...a){
		Parent p = new Child();
		
		//Does not happens Data Member Overriding
		System.out.println(p.x);
		
		// Does happens Method Overriding
		p.show();
	}
	
	void show(){
		System.out.println("I am show from Child");
	}
}