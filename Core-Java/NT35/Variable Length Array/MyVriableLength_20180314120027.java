/* Variable Length argument: If we define variable length array in formal argument then it will accept 
	any no of argument. */

/* 	1. Whatever argument we pass in variable length arguments they will be converted into an anonymous array 
	first and then pass to the function. 
	2. Variable length argument must be the right most argument.
	3. We can only have variable length argument in a single function.
*/


class MyVriableLength{
	
	public static void main(String...s){
		
		printString();
		printString("Ahmad");
		printString("Ahmad", "Sayeed");
		printString("Ahmad", "Sayeed", "Asmal");
		printString("Ahmad", "Sayeed", "Asmal", "Babu");
		
		// Other examples
		show('a', 10,20,30,40);
		
		// Other Example What if there same name method with single argument.
		same(10);
		
		// other example: accept anything by putting reference into Object class.
		System.out.println("==============================\n=================================");
		int day = 8;
		String month = "JAN";
		int year = 2014;
		
		// now sending anything and that method will accept
		acceptEverything();		// Implicitly converting into anonymous: new Object[]{}
		
		// new Object[] {new Integer(day)}: converting int primitive to Integer Wrapper Class So Object type anonymous array will accept it
		acceptEverything(day);
		
		acceptEverything(day, month); 		// Implicitly: new Object[]{ new Integer(day), month };
		acceptEverything(day, month, year);	// Implicitly: new Object[]{ new Integer(day), month, new Integer(year) }; 
		
		//sending array;
		Object[] dateInfo = {new Integer(day), month, new Integer(year) };
		acceptEverything(dateInfo);
		
		// It will print reference id because Typecasting happening here.
		acceptEverything( (Object) dateInfo);	// Implicitly: new Object[] { (Object) dateInfo };
		acceptEverything( new Object[] {dateInfo} );
	}
	
	public static void printString(String...a){
		for(String s: a){
			System.out.print(s + " ");
		}
		
		System.out.println("");
	}
	
	public static void show(char c, int...x){
		System.out.println("Character: " + c);
		for(int y: x){
			System.out.println(y);
		}
	}
	
	public static void same(int z){
		System.out.println("Priority always goes to exact match");
	}
	
	public static void same(int...z){
		for(int x: z)
		System.out.println("From VRA: " + x);
	}
	
	public static void acceptEverything(Object...o){
		for(Object obj: o){
			System.out.println(obj + " ");
		}
	}
}	