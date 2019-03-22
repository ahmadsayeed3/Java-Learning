// 1. throws keyword is used to give indication about an exception to the end-user of program.
// 2. throws keyword is used to make our program or function handler free. (Most Important)
// 3. throws keyword is also used for forwarding the checked exception in calling chain
		//Unchecked Exception are automatically forwarded in a calling chain.

//Example Third

class ClassOne{
	
	public void show(){
		/* 1. Exception occurs so JVM will look for try catch (handler) here. 
			If try-catch is not here then will check from this method is called. In this from case display() */
		int x = 10/0;
	}
	
	public void display(){
		/*  2. As we see inside show() as well as display(), there is no handler then it will look from display() called. */
		show();
	}
	
	public void xyz(){
		/* 3. As we see inside xyz(), there is no handler then it will look from xyz is called */
		display();
	}
}

class ClassTwo{
	
	public static void main(String...a){
		ClassOne co = new ClassOne();
		/* 4. At last it will look inside main(). if it does not get here then the JVM will catch the object and terminate the program
		 co.xyz();  It will terminate the program.
		main() function is also inside handler tryCatch implicitly */
		
		try{
			co.xyz();
		}catch(ArithmeticException e){
			System.out.println("Problem is: " + e);
			
			// To understand the Calling Chain, we can print the stack
			e.printStackTrace();
		}
		
		System.out.println("Program Continue");
	}
}