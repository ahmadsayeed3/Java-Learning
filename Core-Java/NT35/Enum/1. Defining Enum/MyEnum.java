/* creating enum. To create enum we have to use enum keyword. 
	Java enum keyword is used to create an enum type. Let’s have a look at the java enum example program.
*/

enum MyCars{
	
	// Defining constant fields:
	/* Since enum fields are constants, Java best practice is to write them in block letters 
		and underscore for spaces. */
	HONDA, BMW, LANDROVER
};

enum Direction{	EAST, WEST, SOUTH, NORTH };
enum Week{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

/* going to use enum in our class   */

public class MyEnum{
	
	public static void main(String...a){
		/*1.*/
		System.out.println("\n============= Accessing enums ===========\n");
		MyCars newCar = MyCars.BMW;
		System.out.println("My New Car is: " + newCar);
		
		System.out.println("\n============= All Constants ===========\n");
		/* 2.	The Java compiler internally adds the values() method when it creates an enum. 
			The values() method returns an array containing all the values of the enum.
		*/
		Direction[] dir = Direction.values();
		for(Direction d: dir){
			System.out.println(d + " direction with the help of values()");
		}
		
		/* 3.
		Enum's valueOf() method
			* @parameter name the name of the constant to return
			* @return the enum constant of the specified enum type with the specified name
			* @throws IllegalArgumentException if the specified enum type has
			*         no constant with the specified name, or the specified
			*         class object does not represent an enum type
			* @throws NullPointerException if {@code enumType} or {@code name}  is null.
		*/
		
		System.out.println("\n============= Conversion ===========\n");
		
		MyCars cr = MyCars.valueOf("LANDROVER");
		System.out.println("cr contains: " + cr);
		
		Direction st = Direction.valueOf("SOUTH");
		System.out.println("st contains: " + st);
		
		try{
			Direction st1 = Direction.valueOf("SOUTH1223");
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}
		
		/* 4. Enum implements "Compareable" interface and it has compareTo() method.
			* When we create constants then JVM saves ordinal value of that constants value.
			In compareTo JVM compares them by ordinal value.
			
			* Compares this enum with the specified object for order.  Returns a
			 * negative integer, zero, or a positive integer as this object is less
			 * than, equal to, or greater than the specified object.
			 *
			 * Enum constants are only comparable to other enum constants of the
			 * same enum type.  The natural order implemented by this
			 * method is the order in which the constants are declared.
			 
			 return self.ordinal - other.ordinal;
		*/		
		
		System.out.println("\n============= Comparison ===========\n");
		Week day1, day2, day3;
		day1  = Week.MONDAY;
		day2 = Week.TUESDAY;
		day3 = Week.FRIDAY;
		
		if(day1.compareTo(day2) < 0){
			System.out.println(day1 + " comes before " + day2);
		}
		
		if(day2.compareTo(day3) > 0){		// false
			System.out.println(day2 + " comes before " + day3);
		}
		
		if(day1.compareTo(day3) == 0){		// false
			System.out.println(day1 + " equals " + day3);
		}
		
		if(day1.compareTo(day1) == 0){		// true
			System.out.println(day1 + " equals " + day1);
		}
		
		
		/*5. Know Ordinal value of enum constants with the help of ordinal method*/
		System.out.println("\n============= Ordinal Values ===========\n");
		Week[] days = Week.values();
		for(Week d: days){
			System.out.println(d + ", Ordinal value is: " + d.ordinal());
		}
	}
}