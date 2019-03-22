class StringConstructors{

	public static void main(String...a){
		
		/* Constructor 1: public String(), Default Constructor, Strings are immutable so this is not usable for us. 
		But it does use in reflection when we want to make instance of String class */
		String s = new String(); // Empty character sequence
		System.out.println("Default Constructor " + s);
		
		
		//Constructor 2: public String(String original)
		/* Initializes a newly created String object so that it represents the same sequence of characters as the argument; 
			in other words, the newly created string is a copy of the argument string. 
			  Unless an explicit copy of original is needed, use of this constructor is unnecessary since Strings are immutable. */
		String s1 = new String("Ahmad Sayeed");
		
		
		System.out.println("Constructor With Original Value: " + s1);
		
		//Constructor 3: public String(char[] value) Accept char array and return string
		String s2 = new String(new char[]{'A','h','m','a','d','S','a','y','e','e','d'});
		System.out.println("Default Constructor: " + s2);
		
		// Constructor 4: public String(char[] value, int offset, int count)
		// Accept char array and return char from and between last position
		String s3 = new String(new char[]{'A','h','m','a','d','S','a','y','e','e','d'}, 0, 5);
		System.out.println("Constructor 4: " + s3);
		
		// Constructor 5: public String(int[] value, int offset, int count)
		// Accept int SkyValue array and return char value from and between last position
		String s4 = new String(new char[]{65,66,67,68,69,70,71,72,73,74}, 0,5);
		System.out.println("Constructor 5: " + s4);
		
		// Constructor 5: public String(int[] value, int offset, int count)
		// Accept byte SkyValue array and return char value from and between last position
		String s5 = new String(new byte[]{65,66,67,68,69,70,71,72,73,74}, 0,5);
		System.out.println("Constructor 6: " + s4);
	}
}