// Enum Constructor

// PrimitiveType constants
enum Apple{
	// we can't send value to constructor. It will be hard coded.
	A(10), B(9), C(12), D(15), E(8);
	
	private int price; 		//data member
	
	Apple(int x){
		price = x;
	}
	
	// getter methods
	int getPrice(){
		return price;
	}
};

class MyClass{
	public static void main(String...a){
		// In below code when cursor reach to 'D' then implicitly JVM calls the constructor
		// Hard coded value assigned inside 'p' data member that we get via getPrice();
		System.out.println("D costs: " + Apple.D.getPrice());
		
		// Same as can get other constants value.
		System.out.println("E costs: " + Apple.E.getPrice());
		
		// We can get all apples price via calling values.
		System.out.println("\n====== Cost of all apples are =====\n");
		for(Apple ap: Apple.values()){
			System.out.println(ap + " costs: " + ap.getPrice() + " cents");
		}
	}
}