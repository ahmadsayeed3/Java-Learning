class PrePost{
	public static void main(String... args){
		// define and initialize a int variable
		int number = 1;

		// use the prefix operator
		System.out.println("Old Data " + number + " - After Prefix " + ++number);
	
		//use the postfix operator
		System.out.println("Old Data " + number + " - After Postfix " + number++);
		
		//Now print the variable that appiled Postfix operator
		System.out.println("Applied PostFix variable printing again " + number);
	}
}