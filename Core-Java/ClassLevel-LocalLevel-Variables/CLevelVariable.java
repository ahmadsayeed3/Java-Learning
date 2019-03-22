class CLevelVariable{

	// Class Level Area
	int x = 10;
		
	public static void main(String... ar){
		CLevelVariable clv = new CLevelVariable();
		System.out.println(x); // this is wrong. We can't call it without ref id
		clv.show();
		
	}

	void show(){
		System.out.println(x);
	}
}