class FinlaWithFunction{
	
	//Non-static Intialization
	final int x = getX(); // non-static function
	final int y = getY(); // static function works

	//Static initialization
	// final static int m = getM(); // non-static function // Not Working demands static function
	final static int n = getN(); // Static function

	int getX(){
		return 300;
	}

	static int getY(){
		return 500;
	}
	
	
	int getM(){
		return 700;
	}
	
	static int getN(){
		return 800;
	}
	
	public static void main(String...a){
		FinlaWithFunction fwf = new FinlaWithFunction();
		System.out.println("From Main Value of X is: " + fwf.x);
		System.out.println("Value of Y is: " + fwf.y);

		System.out.println("Value of N is: " + fwf.n);		
	}
}