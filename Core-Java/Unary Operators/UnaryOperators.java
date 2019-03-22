class UnaryOperators{
	public static void main(String... args){
		
		int number = 1;
				
		//Unary Plus (+) operator
		int result = +number;
		System.out.println("Unary (+) Operator = " + result);

		//Again Unary (+) Operator. It only indicates the positive number. It does not change an expression
		number = -1;
		result = +number;
		System.out.println("Unary (+) Operator = " + result);

		//Unary minus (-) operator. It negates an expression.
		number = +1;
		result = -number;
		System.out.println("Unary (-) Operator = " + result);


		//Logical complement operator (!), inverts the value of a boolean.
		boolean status = true;		
		System.out.println("Old data = " + status + " - After Logical complement operator (!) = " + !status);
	}
}