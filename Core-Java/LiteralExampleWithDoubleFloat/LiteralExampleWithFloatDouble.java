/*It is by default calling boolean*/
/*That's why it requires to provide suffix when we use float or double data type.*/
/*We tell java the difference*/
/*This concept also appiled when we initialized a variable*/

class LiteralExampleWithFloatDouble{
	public static void main(String... srg){
		/*I want to call float type function*/
		/*Solution*/
		show(1.5f);	
		show(1.5d);	
	}
	
	static void show(float f){
		System.out.println("I am Float Data = " + f);
	}

	static void show(double d){
		System.out.println("I am Double Data = " + d);
	}

}