// Compile: javac ClassOne.javac
// Run: java ClassOne 10 20

//That is why accept String parameter in main function, To accept value from Command Line Argument 
//Because as string we can accept any kind of value that we can typeCast Later.
//If we provide no data in CLA then JVM will create string array with zero size and pass in main().

class ClassOne{
	
	public static void main(String...s){
		
		//Once we use the array, it requires to put value from CMD
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int z = x + y;
		System.out.println(z);
		
		System.out.println(s[2]);
	}
}

class ClassTwo{
	
	public static void main(String...a){
		// As we are not using the array so it is not required to provide value from CMD. 
		System.out.println("I am Inside Class Two Main");
	}
	
}