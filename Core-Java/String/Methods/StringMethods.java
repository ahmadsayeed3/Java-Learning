class StringMethods{

	public static void main(String...a){
		String s = "Ahmad Sayeed";
		
		//Method 1: Object.toCharArray(); // convert a string return a char array of that string
		char ch[] = s.toCharArray();
		printArray(ch, "toCharArray()");
		
		//Method 1: Object.getBytes(); // convert a string return a byte array of that string
		try{
			byte b[] = s.getBytes(s);
			printArray(b, "getBytes()");
		}catch(Exception e){
			System.out.println(e);
		}
		
		//Method 3: Object.charAt();  return the char value of index position of string
		System.out.println("charAt()" + s.charAt(6));
		
		/* ---------------- indexOf() -----	returns -1 if does not find the match  ---------------*/
		
		// Method 4: indexOf(); return the index(position) of character (First Come First Return)
		String s1 = "Ahmad Sayeed";
		System.out.println("indexOf() :" + s1.indexOf('S'));
		
		// Method 5: int indexOf(int ch, int fromIndex): returns specified char value index starting with given index
		s1 = "Ahamd Sayeed";
		System.out.println("indexOf(int ch, int fromIndex) - " + s1.indexOf('a', 4));
		
		// Method 6: int indexOf(String substring): returns specified substring index
		s1 = "India is good country";
		System.out.println("indexOf(String substring) - " + s1.indexOf("good"));
		
		// Method 7: int indexOf(String substring, int fromIndex): returns specified substring index starting with given index
		s1 = "India is good country";
		System.out.println("indexOf(String substring, int fromIndex) - " + s1.indexOf("is ", 5));
		
		/*------------------	lastIndexOf() - Checks From Right TO Left ---------------------------*/
		// Method 8: int lastIndexOf(int ch) : returns last index position for the given char value
		s1 = "Ahmad";
		System.out.println();
		
		
		// Method 4: public static String format(String format, Object...args){}
		
		//Method 5: public static String format(Locale locale, String)
	}
	
	static void printArray(char []x, String msg){
		System.out.println("");
		System.out.println(msg);
		for(int i=0; i<x.length; i++){
			System.out.print(x[i] + " ");
		}
	}
	
	static void printArray(byte []x, String msg){
		System.out.println("");
		System.out.println(msg);
		for(int i=0; i<x.length; i++){
			System.out.print(x[i] + " ");
		}
	}
}