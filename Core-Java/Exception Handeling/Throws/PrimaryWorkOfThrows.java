// 1. throws keyword is used to give indication about an exception to the end-user of program.
// 2. throws keyword is used to make our program or function handler free. (Most Important)
// 3. throws keyword is also used for forwarding the checked exception in calling chain
		//Unchecked Exception are automatically forwarded in a calling chain.

// Example 1st & 2nd
import java.io.*;
class ClassOne{
	
	int div() throws IOException, ArithmeticException{ 
		System.out.println("Enter First Number");
		/* this is checked exception but it won't force to put handler because we have declared throws keyword after function name */
		int x = System.in.read(); 
									
		System.out.println("Enter Second Number");
		int y = System.in.read();
		return x/y;
	}
}

class ClassTwo{
	public static void main(String...a)	{   
		ClassOne co = new ClassOne();
		
// We have added indication at div() function using throws keyword.
// That will force to put handler at the time of calling div()
	co.div(); // It will force to put handler.
		
		/*try{
			int z = co.div();
			System.out.println(z);
		}catch(IOException e){
			System.out.println("Exception is : " + e);
		}*/
		
		System.out.println("Program is continue.....");

// However we can also make our program handler free by adding throws keyword after main.
// But this is not recommended because after that JVM will catch the exception and terminate the program.
	}
}