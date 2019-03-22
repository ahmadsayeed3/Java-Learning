/*What Happens When TypeCast With Char And Int In Java?*/

class IntChar{
	public static void main(String... args){
		System.out.println("");
		/*Explicit Type Cast From Char To Int*/
		char aChar = 'A';
		int iNum = (int) aChar;
		System.out.println("A is now: " + iNum);
		
		/*Explicit TypeCast from Int to Char */
		int jNum = 66;
		char bChar = (char) jNum;
		System.out.println("66 is now : " + bChar);
		
		/*Implicit TypeCast from char to int*/
		int cInt = 'C'; // inserting char value inside int data type
		System.out.println("C is now : " + cInt);
		
		/*Implicit TypeCast from int to char*/
		char d = 68; // inserting int value into char data type
		System.out.println("68 is now: " + d);
		
	}
}