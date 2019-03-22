/* 
	public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
	It throws StringIndexOutOfBoundsException if beginIndex is greater than endIndex. 
	It doesn't return any value.
*/

class GetChars{
	public static void main(String...a){
		String str = "Welcome to this New Year";
		
		char ch[] = new char[7];
		
		try{
			str.getChars(2, 6, ch, 0);
			//Inserts in ch array from 0 index from string 2 index to till 6. i
			System.out.println("String: " + ch);	// Prints "StringCHexaDecimal" 
			System.out.println(ch);	// Prints "lcom" 
		}catch(Exception e){
			System.out.println(e);
		}

		// Printing The Array
		System.out.println("Printing As Array");
		for(int i=0; i< ch.length; i++){
			System.out.println(ch[i]);
		}
	}
}