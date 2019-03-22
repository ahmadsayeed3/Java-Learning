// Static Nested Class

class StaticNestedClass{

	int x = 100;
	static int y = 200;

	// Show function of outer class
	static void show(){
		System.out.println("Show From Outer Class");
		
		// static nested class. It's not private so we can use it in other class
		/* static class SNClass{
			//static int z = 50; // can't use direct outside the nested class.
			static void staticShow(){
				show();	//Static nested class can use all static field and function of outer class
				System.out.println("From inner static class. Y is " + y);
			}*/
		}
	}

	// static nested class. It's not private so we can use it in other class
	static class SNClass{
		static int z = 50; // can't use direct outside the nested class.
		static void staticShow(){
			show();	//Static nested class can use all static field and function of outer class
			System.out.println("From inner static class. Y is " + y);
		}
	}

	public static void main(String...a){
		SNClass.staticShow();
		System.out.println(SNClass.z);
		//staticShow(); // Can't staticShow() and "z" is inside inner class and using this in outer class
	}

}

// going to use nested static "SNClass" because it also generates .class file
class ClassTwo{

	public static void main(String...a){	
		// We are only able to use it because SNClass is not private.
		StaticNestedClass.SNClass.staticShow();
		System.out.println(StaticNestedClass.SNClass.z);
	}

}