// Final Class, Final Member Function, Final Local Variable, Final Data Member

final class Final{ // it can not be inherited
	
	//Final Class Variable
	final int x = 100; // can't change this
	final int y; // (Blank Final Variable) can only assign here and inside constructor
			//It does not have any value like other class level variable

	int n; // it has by defualt value 0

	final static int m = 900; // can't change it through out the program.
	final static int p; // it has by default 0 so cant change it. It has to initialized at class level.


	Final(){  // Constructor can't be final
		//initilizing final y.
		y = 200;
		System.out.println(x + " And "+ y);
	}
	
	void show(){
		
		// Final Local Variable
		final int z = 300; 
		//z = 400; // Can't re-assign
		System.out.println("Final Parent Show. Z = " + z);
	}
	
	void display(final int a){ // can't change the argument value
		//a = 600;  // Can't Change it
		System.out.println("A is : " + a);	
	}
	
	public static void main(String...a){
		final Final f = new Final(); //Now we can't change it
		//f = new Final(); // will create error.
		f.show();
		f.display(500);
	}

}

//This will give error

/*class Child extends FinalParent{
	
}*/