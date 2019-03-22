To run: java OuterClassName$InnerClassName

class NestedClassWithMain{

	//Static Nested Class
	static class ClassOne{
		
		// To execute java OuterClasName$NestedClassName: java StaticNestedWithMain$ClassOne
		public static void main(String...a){
			System.out.println("Main From Nested ClassOne");
		}
	}

	//Non-Static Inner Class: 
	class ClassTwo{

		//Non-Static Class cannot have it's own static data member and member function.
		/*public static void main(String...a){
			System.out.println("Main From Inner Non-Static Class");
		}*/
	}

	//Outer Main
	public static void main(String...a){
		System.out.println("Main From Outer Class");
	}

}