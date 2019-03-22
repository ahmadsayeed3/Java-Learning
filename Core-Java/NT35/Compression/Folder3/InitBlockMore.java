class InitBlockMore{
	/*Init Block*/
	{
		System.out.println("I am 1st Init Block Baby");
	}
/*Init Block*/
	{
		System.out.println("I am 2nd Init Block Baby");
	}

	InitBlockMore(){
		/*Init Block*/
		{
			System.out.println("Constructor Hello");
		}
		
	}
	
	void show(){

	System.out.println("Hello345678");
		/*Init Block*/
		{
			System.out.println("Function Hello");
		}
	}

	public static void main(String... a){
		new InitBlockMore().show();
	}
}
