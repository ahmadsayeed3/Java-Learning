class InitBlock{
	/*Init Block*/
	{
		System.out.println("I am 1st Init Block Baby");
	}

	{
		System.out.println("I am 2nd Init Block Baby");
	}
	
	InitBlock(){
		this(10); 
		System.out.println("Chaining Starts here");
	}

	InitBlock(int x){
		this("Ahmad"); 
		System.out.println("2n Chain Constructor");
	}

	InitBlock(String name){
		/*We can also make init block inside constructor function*/
		{
			System.out.println("I am 3rd Init Block Baby");
		}
		System.out.println("3rd Chain Constructor");
	}	
	

	public static void main(String... a){
		new InitBlock();
	}
}
