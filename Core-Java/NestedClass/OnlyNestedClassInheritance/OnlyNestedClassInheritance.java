//	OnlyNestedClassInheritance.java file saving

class ParentClass{

	int x = 10;

	//Static Nested Class
	static class classOne{
		
		static void showOneStatic(){
			System.out.println("Static Show From ClassOne");
		}
		
		void showOneNonStatic(){
			System.out.println("Non Static Show From ClassOne");
		}
	}

	//non-static Nested Class
	class ClassTwo{
		//Can't have static in non static
		/*static void showTwoStatic(){
			System.out.println("Static Show From ClassTwo");
		}*/

		void showTwoNonStatic(){
			System.out.println("Non-Static Show From ClassTwo");
		}
	}
}


class ChildOne extends ParentClass.classOne{
	
	void display(){
		System.out.println("Display From ChildOne Child Class");
	}
	
	public static void main(String...a){
		
		System.out.println("----- Calling Static Function Of Static Class ------");		

		ParentClass.classOne.showOneStatic();	//works
		showOneStatic(); //works
		
		//Also Works
		ChildOne c = new ChildOne();
		c.showOneStatic();
		c.display();
		
		ParentClass.classOne p = new ChildOne();
		p.showOneStatic();
		// p.display(); // But it won't access Childs other function
		
		//Does not working
		// ChildOne.classOne cc = new ChildOne();
		// cc.showOneStatic();
		
		/**/
		System.out.println("----- Calling Non-Static Function From Static Nested Class ---");		
		new ParentClass.classOne().showOneNonStatic(); 

		ChildOne co = new ChildOne();
		co.showOneNonStatic();
		co.display();

		ParentClass.classOne pc = new ChildOne();
		pc.showOneNonStatic();
		// co.diplay(); // Does not work

		/*Let's see as i have extended classOne only then does it inherit other Nested Class*/
		/*Of course it wont't becasue i have only inherited one nested class*/
		
	}
}