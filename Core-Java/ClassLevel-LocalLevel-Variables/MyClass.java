class MyClass{
	
	/*Class Level Variables Declares here. Within Class Block*/
	/*We Don't Need To Assign Default Value To Class Level Variables*/
	/*It Requires to have static keyword to access the class level variables inside the function block*/
	/*Let's define class level variables*/

	static byte b;
	static short s;
	static 	int i;
	static long l;
	static 	float f;
	static double d;
	static 	char c;
	static String str;
	static 	boolean bn;

	public static void main(String... arg){
		System.out.println("I m class level variable and I will print all default data types variables value");	
		System.out.println("byte = " + b);
		System.out.println("short = " + s);
		System.out.println("int = " + i);
		System.out.println("long = " + l);
		System.out.println("float = " + f);
		System.out.println("double = " + d);
		System.out.println("char = " + c);
		System.out.println("String = " + str);
		System.out.println("boolean = " + bn);

		/*Now Let's see Local Level Variables*/
		/*Variables that defines inside function block {} called local level variables*/
		/*static keyword is not requires to use inside function*/
		
		System.out.println(" ----------------------------------- ");
		
		/*This program will show compilation error becasue local level variables requires to set default value*/
		/*To compile this program, we have to assign default value to local level variables*/
		/*This is main differenec btwn Class Level Variable and Local Level Variables*/
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 5;
		double d = 5;
		char c = 'A';
		String str = "Ahmad Sayeed"; // it demands to use double ""
		boolean bn = true;

		System.out.println("I m local level variable and I will print all default data types variables value");	
		System.out.println("byte = " + b);
		System.out.println("short = " + s);
		System.out.println("int = " + i);
		System.out.println("long = " + l);
		System.out.println("float = " + f);
		System.out.println("double = " + d);
		System.out.println("char = " + c);
		System.out.println("String = " + str);
		System.out.println("boolean = " + bn);

	
	}

}