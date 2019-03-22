class InitPart2{
	int x;
	{ 
	 x = 10;
	}
	
	InitPart2(){
		System.out.println(x);
	}
	public static void main(String...a){
		new InitPart2();
	}
}