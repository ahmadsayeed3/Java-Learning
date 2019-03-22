//Static Runs always class loading time even before main function
class StaticBlock{
	
	static{
		System.out.println("I am Static Block");
	}

	static{
		System.out.println("2nd Static Block");
	}

	static{
		System.out.println("3rd Static Block");
	}	
	
	public static void main(String... a){
		
	}
}