/*
	The java string equals() method compares the two given strings based on the content of the string. 
	If any character is not matched, it returns false. If all characters are matched, it returns true.
	The String equals() method overrides the equals() method of Object class.
*/

class StringEquals{
	
	public static void main(String...a){
		boolean result;
		
		/* 0. public boolean equals(Object anotherObject) From Object Class */
		/* It compares the reference id of two objects*/
		
		StringEquals se = new StringEquals();
		StringEquals se1 = new StringEquals();
		StringEquals se2 = se;
		result = se.equals(se1);
		System.out.println("1. Equals From ObjectClass: " + result); // false
		System.out.println("2. Equals From ObjectClass: " + se.equals(se2)); // true
		
		
		String s = "Hello";
		String s1 = s;
		String s2 = new String("Hello");
		String s3 = "hello";
		String s4 = "HELLO";
		
		
		
		/*1. equals(String s){} Overriden By String Class. Compares the value that is inside String Object*/
		result = s.equals(s1);
		System.out.println("1. Equals: " + result);
		
		result = s.equals(s2);
		System.out.println("2. Equals: " + result);
		
		result = s.equals(s3);
		System.out.println("3. Equals: " + result);
		
		result = s.equals(s4);
		System.out.println("4. Equals: " + result);
		
		/*2. equalsIgnoreCase(String s){} */
		result = s.equalsIgnoreCase(s1);
		System.out.println("1. EqualsIgnoreCase: " + result);
		
		result = s.equalsIgnoreCase(s2);
		System.out.println("2. EqualsIgnoreCase: " + result);
		
		result = s.equalsIgnoreCase(s3);
		System.out.println("3. EqualsIgnoreCase: " + result);
		
		result = s.equalsIgnoreCase(s4);
		System.out.println("4. EqualsIgnoreCase: " + result);
		
		/* public boolean endsWith(String suffix){}: suffix = sequence of character  */
		/* The java.string.endsWith() method checks if the string ends with given suffix.*/
		/* It returns true if this string ends with given suffix else return false*/
		
		String ew = "Good Morning India!!";
		System.out.println("1. endsWith(): " + ew.endsWith("India!!")); 	// true
		System.out.println("1. endsWith(): " + ew.endsWith("India"));		// false
		
		/* public boolean contentEquals(StringBuffer sb){} */
		/* This method returns true if and only if this string represents the same sequence of charcater as the 
			specified in StringBuffer, otherwise false. */
			String sb1 	= "Good Morning Mumbai";
			String sb2 	= "Good Morning Mumbai";
			StringBuffer sb3 = new StringBuffer("Good Morning Mumbai");			
			System.out.println("1. contentEquals(): " + sb1.equals(sb2));				// true
			System.out.println("2. contentEquals(): " + sb1.equals(sb3));	 			// false
			System.out.println("1. contentEquals(): " + sb1.contentEquals(sb3));		// true
	}
}