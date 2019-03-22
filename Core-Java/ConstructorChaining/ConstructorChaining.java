class ConstructorChaining{
	/*Chaining starting from here*/
	ConstructorChaining(){
		this(10); // it will jump to next constructor function that match the parameter.
		System.out.println("Chaining Starts here");
	}

	ConstructorChaining(int x){
		this("Ahmad"); //// it will jump to next constructor function that match the parameter.
		// it will come back from function run all code here and jump back to previous constructor function that sent here and run all their codes.
		System.out.println("2n Chain Constructor");
	}

	ConstructorChaining(String name){
		System.out.println("3rd Chain Constructor");
		// it will run all code and jump back to previous constructor function that sent here and run all their codes.
	}	

	public static void main(String...a){
		new ConstructorChaining();
	}
}