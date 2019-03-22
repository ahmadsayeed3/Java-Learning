class CheckVariableDefaultValue{

	/*Class Variable Defines inside class block We don't need to assign them*/
	/*As you can see below we are did not assigen any value. we did only decalre them*/
	/*It requires to have static keyword with vriable name to access inside functions*/
	
	static byte b;
	static short s;
	static int i;
	static float f;
	static double d;
	static long l;
	static boolean bn;
	static char c;
	static String str;
		
		

	public static void main(String... sr){
		
		/*When I will run this code then it will show defualt value of variables*/
		System.out.println("I m from Class Block. Class Level Variables Value");
		System.out.println("And I will show default value of all data types variables");
		System.out.println("byte = " + b);
		System.out.println("short = " + s);
		System.out.println("int = " + i);
		System.out.println("float = " + f);
		System.out.println("d = " + d);
		System.out.println("long = " + l);
		System.out.println("boolean = " + bn);
		System.out.println("char = " + c);
		System.out.println("String = " + str);

		System.out.println("-----------------------------------------------");
		
		/*Variables that defines inside the function block called Local Variable*/
		/*It requires to assign default value. We can't only declare them*/
		/*Below program will show compilation error*/

		/*byte b;
		short s;
		int i;
		float f;
		double d;
		long l;
		boolean bn;
		char c;
		String str;*/

		/*To fix the program we have to assign default value to local variables*/
		
			byte b = 1;
			short s = 1;
			int i = 1;
			float f = 1;
			double d = 1;
			long l = 1;
			boolean bn = true;
			char c = '1';
			String str = "1";
		
		
		System.out.println("I m from main() Local Variables Value");
		System.out.println("byte = " + b);
		System.out.println("short = " + s);
		System.out.println("int = " + i);
		System.out.println("float = " + f);
		System.out.println("d = " + d);
		System.out.println("long = " + l);
		System.out.println("boolean = " + bn);
		System.out.println("char = " + c);
		System.out.println("String = " + str);
	}
}