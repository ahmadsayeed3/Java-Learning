// Nested Class Inheritance
class NestedClassInheritance{
	//Only For File Saving
}

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

class ChildOne extends ParentClass{

	public static void main(String...a){
		// Calling static function of static class
		classOne.showOneStatic();

		//Calling non-static function from static class. need to create object.
		ParentClass.classOne pc = new ParentClass.classOne();
		pc.showOneNonStatic();
		
		// new ParentClass.classOne(); // This way also works

		//Calling static function from non static class. 
		//Can't have static things in non-static class

		//Calling non static function from non-static class
		//Special Syntex "new" to access non static nested class
		new ParentClass().new ClassTwo().showTwoNonStatic(); 
		new ChildOne().new ClassTwo().showTwoNonStatic();
		
		// ParentClass c = new ChildOne(); //Works
		ChildOne c = new ChildOne();
		System.out.println(c.x);
		c.new ClassTwo().showTwoNonStatic();

	}	

}