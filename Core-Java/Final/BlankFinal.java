class BlankFinal{
	
	final int x; // Blank Final Variable, no value inside
	final int y; // Blank Final Variable, no value inside
				// It has to initialize only inside constructor.

	int z; // non-final, by default value 0
	
	BlankFinal(int x){
		this.x = x;
		y = 500;
		System.out.println("X is: " + x);
		System.out.println("Y is: " + y);
		System.out.println("Z is: " + z);
	}
	
	public static void main(String...a){
		BlankFinal bf = new BlankFinal(200);
		System.out.println("Inisde Main X is: " + bf.x);
		// bf.x = 600; // Can't change it. error

		BlankFinal bf2 = new BlankFinal(400);
		System.out.println("Inside Main with BF2 X is: " + bf2.x);
	}
}
