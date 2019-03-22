/* Wrapper Class Comparison, Equality And Comparison Pool
	
	1. Each Wrapper class implements Comparable Interface and have compareTo(). If positive value comes the first is positive.
	
	2. Each Wrapper Classes also override the equal() method of object class.
	The overridden method compares two Wrapper Objects for Objects value equality.
	
	3. Wrapper classes are immutable so we can also make wrapper class object via literal. But via literal only range 
		of byte (-128 to 127) value shares the same object. If range is greater than MAX byte range then new memory
		will create in constant pool. No idea why but it happens. 
*/

class CE{
	
	public static void main(String...s){
		// Check Equality
		Integer iObj = new Integer(100);
		Integer iObj2 = new Integer(100);
		System.out.println("Equality: " + iObj.equals(iObj2));			// True because it matches the value
		
		
		// Do Comparison
		Double d1 = new Double(10.5);
		Double d2 = new Double("6.7");
		System.out.println("Compare: " + d1.compareTo(d2));
		
		// Comparison Pool. No duplicate value will go on constant pool. Does not work with float and double. Only Integer data
		Long d3 = 121L;		// Primitive data type value wrapped.
		Long d4 = 121L;
		System.out.println("Comparison Pool: " + (d3==d4));			// True means both sharing the same reference id.
		
		// Now with greater value then byte range
		Integer d5 = 128;
		Integer d6 = 128;
		System.out.println("Comparison Pool: " + (d5==d6));			// false means both have different reference id.
		
		/* Wrapper Constant: We can know all primitive data types MIN and MAX range. Each Wrapper classes has two static Data members. MIN_VALUE holds the minimum range and MAX_VALUE holds max range. */
			
		byte bMin = Byte.MIN_VALUE;
		byte bMax = Byte.MAX_VALUE;
		
		System.out.println("Minimum Range of Byte Primitive is: " + bMin + ", Max Range is :" + bMax);
		
		System.out.println("Minimum Range of Short Primitive is: " + Short.MIN_VALUE + ", Max Range is :" + Short.MAX_VALUE);
		System.out.println("Minimum Range of Character Primitive is: " + Character.MIN_VALUE + ", Max Range is :" + Character.MAX_VALUE);
		System.out.println("Minimum Range of Integer Primitive is: " + Integer.MIN_VALUE + ", Max Range is :" + Integer.MAX_VALUE);
		System.out.println("Minimum Range of Long Primitive is: " + Long.MIN_VALUE + ", Max Range is :" + Long.MAX_VALUE);
		System.out.println("Minimum Range of Float Primitive is: " + Float.MIN_VALUE + ", Max Range is :" + Float.MAX_VALUE);
		System.out.println("Minimum Range of Double Primitive is: " + Double.MIN_VALUE + ", Max Range is :" + Double.MAX_VALUE);
		
		//System.out.println("Minimum Range of Void Primitive is: " + Void.MIN_VALUE + ", Max Range is :" + Double.MAX_VALUE);
		
		
		/*Parsing: Convert the String value to any data type. Every Wrapper classes have parseWrapperClass(String s) method*/
		double dp1 = Double.parseDouble("45");
		System.out.println("Converted From String to double: " + dp1);
		
		int dp2 = Integer.parseInt("95");
		System.out.println("Converted From String to int: " + dp2);
		
	}
}
