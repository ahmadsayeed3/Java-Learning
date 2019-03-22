/* Wrapper Classes: 
	Primitive values in Java are not object. In order to manipulate these values as object the java.lang package provides a
	wrapper class for each of the primitive data type. All Wrapper classes are final. The object of all wrapper classes that can be instantiated are immutable that means the value in the wrapper object can not be changed.

	Although, the void class is considered a wrapper class but it does not wrap any primitive values and is not insatiable. 
	It has not public constructor, it just denotes a class object representing the keyword void.
	
	
*/

/* Common Wrapper Class Constructor: Every Wrapper class has two constructor accept Character class. It has only one public 
	constructor taking a char value as a parameter. The other all wrapper classes have Two(2) constructors. 
	1. First takes primitive value and convert them in object.
		Integer iObj = new Integer(10);
	
	2. Second takes a string and convert them into object.
		Integer iObj = new Integer("100");
	
	We can also convert a String to object with the help of method.
		Boolean b = Boolean.valueOf("true");
		int i = Integer.valueOf("10");
	
*/

class WClass{
	
	public static void main(String...a){
		
		//Convert integer (Primitive value) to object Via constructor
		Double d = new Double(50.0); 		
		Integer i = new Integer(20);
		char ch = new Character('C');
		
		// Convert String value to object via constructor and method
		byte b1 = new Byte("123");
		byte b2 = Byte.valueOf("117");
		
		System.out.println("B1: " + b1);
		System.out.println("B2: " + b2);
		
		
		/* Converting Wrapper Object to String:
			Each Wrapper class overrides the toString() method from the object Class. The overridden method returns a 
			string object containing the string representation of primitive value in the wrapper class object.
		*/
			
		Float f1 = new Float("35.70");
		Float f2 = new Float(10.5);
		
		String sf1 = f1.toString();
		String sf2 = f2.toString();
		System.out.println("WC to String: " + sf1 + ", " + sf2);
		
		
		/* Converting primitive value to String
			Each Wrapper Class defines a static method: 	static String toString(Type t){}
			It returns the string corresponding to the primitive value of a type passed as argument.
		*/
		
		String st1 =  Double.toString(13.60);
		String st2 = Float.toString(455F);
		String st3 = Integer.toString(150);
		
		System.out.println("Primitive To String: " + st1 + ", " + st2 + ", " + st3);
		
		
		/* Converting Wrapper Object To Primitive Values: Onwards JDK 1.5
			Way 1: UnBoxing is a convenient way to UnWrap the primitive value in the Wrapper Object. We can Wrap primitive via 	Boxing.
		*/
		
		double iObj2 = 460;		// Convert primitive to object
		float iObj3 = 410F;		// Convert primitive to object
		System.out.println("Converted Primitive to Object: " + iObj2 + ", " + iObj3);
		
		Float f3 = 	iObj3;		// Converted Object to primitive
		Double d3 = iObj2;		// Converted Object to primitive
		System.out.println("Converted Object to primitive: " + f3 + ", " + d3);
		
		
		/* Converting Wrapper Object To Primitive Values
			Way 1: Before JDK 1.5: 
		*/
		
		Integer iObj = new Integer(400);	// Wrapped (Converted primitive To Object)
		int z = iObj.intValue();		// UnWrapped (Object to primitive)
		
		double d4 = new Double(45D).doubleValue();
		char c1 = new Character('S').charValue();
		
		// And So On
		
		System.out.println("Object to Primitive: " + z + "," + c1);
	}
}



	
	