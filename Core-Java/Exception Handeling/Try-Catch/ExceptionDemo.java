// If we having more that one catch block with a single try block them only a one catch block will execute.

class ExceptionDemo{
	
	//Can't write try catch in class block
	
	public static void main(String...a){
		// Tutorial 1 - (Separate Catch for Each Exception)
		//Checked Exception: Compiler demands to add handler
		try{
			
			//ArithmeticException
			int x = 10/0;  // Exception - It will jump to the ArithmeticException
			
			//It won't jump to the ArrayIndexOutOfBoundsException because exception already occurred 
			//and try program is already skipped. So Only ArithmeticException Catch block will execute and program will continue
			int y[] = new int[5];
			y[6] = 10;
			
			System.out.println("I Won't Execute"); 
			
			//close
			
		}
		catch(ArithmeticException e){ 
			System.out.println("Please Contact Developer"); 
			System.out.println(e);
			//Close the resource
		}
		catch(ArrayIndexOutOfBoundsException ie){
			System.out.println("Inside ArrayIndexOutOfBoundsException"); 
			System.out.println(ie);
			System.out.println(ie.getMessage());
		}
		
		System.out.println("Program is Continue 1");
		
		
		/*
			If We are having more than one catch block in a single try block then they must be in child to parent order
			Because If the Exception (Parent class) is in first catch block then 
			It will give error that exception has been caught and We won't be able to perform task specially for some Exception
		*/
		
		try {
			String name = null;
			System.out.println(name.length());
		}catch(Exception e){
			System.out.println("Inside Exception Catch: " + e);
		}/*catch(ArithmeticException ae){
			System.out.println("If StringIndexOutOfBoundsException Comes Do this " + ae);
		}*/

		System.out.println("Program Is Continue 2");
		
		
		// Tutorial 2 - (Single Catch for Multiple Exception )
			try {
				//ArithmeticException
				int x = 10/0;
				
				// NullPointerException
				String name = null;
				System.out.println(name.length());
				
				//ArrayIndexOutOfBoundsException
				int y[] = new int[5];
				y[6] = 10;
				
		}catch(Exception e){
			System.out.println("Inside Exception Catch: " + e);
		}
		
		System.out.println("Program Is Continue 3");
		
		
		// Tutorial 3 (We can do different task on different exception in single Exception)
		
			try {
				//ArithmeticException
				int x = 10/0;
				
				// NullPointerException
				String name = null;
				System.out.println(name.length());
				
				//ArrayIndexOutOfBoundsException
				int y[] = new int[5];
				y[6] = 10;
				
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
			System.out.println("javaJavaJava " + e);
		}/*catch(Error e){
			System.out.println("Inside Error Catch: " + e);
		}catch(Exception e){
			System.out.println("Inside Exception Catch: " + e);
		
		}catch(Throwable e){
			System.out.println("Inside Throwable: " + e);
		}*/catch(Exception e){
			if(e instanceof ArithmeticException){
				System.out.println("Inside ArithmeticException: " + e);
			}
			else if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("Inside ArrayIndexOutOfBoundsException: " + e);
			}
			else if(e instanceof NullPointerException){
				System.out.println("Inside NullPointerException: " + e);
			}
		}
		
		System.out.println("Program Is Continue 4");
		
	}
}