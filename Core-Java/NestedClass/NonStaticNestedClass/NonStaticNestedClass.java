// Non-Static Nested Class

// NonStaticNestedClass.java

class Outer{

	//class level data member
	int x = 50;
	int y = 900;
	private int m = 1500; // Inner Class can use private things of outer class
	
	public void display(int z){
		int x = z;
		System.out.println("Dsiplay Local X Is: " + x);
		System.out.println("Dsiplay Class Level is " + Outer.this.x);
	}
	
		
	//non-Static Nested Class

	class InnerClass{
	
		// Doing Data Shadowing
		int x = 100;
		void show(){
			System.out.println("Inner Class X is " + x);
			System.out.println("Class Level X Is From InnerClass Show: " + Outer.this.x);
			System.out.println("Inner Class Private M is " + m);
		}
	}

	public static void main(String...a){
		
		Outer o = new Outer();
		System.out.println("Class level X is: " + o.x);
		
		o.new InnerClass().show();
		o.display(25);
	}
}
