class ClassOne{

	int x = 10;
	int y = 20;
	
}

class ClassTwo{

	static void show(){
		ClassOne co = new ClassOne();
		display();
		//Once the function ends the co object will destroyed
	}

	static void display(){
		ClassOne c2 = new ClassOne();
		//Once the function ends the co object will destroyed
	}

	public static void main(String...a){
		ClassOne c1 = new ClassOne(); // but it will destroy after the program ends.
		
	//1st Condition
		show();		

	//2nd Condition
		ClassOne c3 = new ClassOne(); //Suppose Memory Obj47
		ClassOne c4 = new ClassOne(); //Suppose Memory Obj48

		c3 = c4; // now c3 also have Memory obj48
		//now Obj47 is alone it's reference id is not available on stack. I will destroy

	//3rd Condition
		ClassOne c5 = new ClassOne(); // Memory Obj49
		System.out.println("X is: " + c5.x);
		System.out.println("Y is: " + c5.y);
		c5 = null; // now Memory Obj49 is alone and it will destroy.
		//System.out.println("X is: " + c5.x); //Run Time error

	//4th Condition: Annonymouse
		new ClassOne(); // it will create and destroy
		
	}
}