/*What is TypeCasting*/
	/*TypeCasting is a process of 
		converting the value of one data type into another data type*/
		
class TypeCasting{
	public static void main(String... args){
		
		byte b = 10;
		
		/*let's convert this data variable value into int data type*/
		int i = (int) b;
		
		/*Simple just name the data type in bracket when wants to do typecasting*/
		
		String s = "123456";
		//int number = (int) s; // but this line is error. We can't convert string to int this way
		int number = Integer.parseInt(s);
		System.out.println(number);
	}
}