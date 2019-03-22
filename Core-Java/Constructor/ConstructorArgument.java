class ConstructorArgument{
	
	/*Constructor Function*/
	ConstructorArgument(SecondClass sc){
		sc.show();
	}
	
	public static void main(String... a){
		SecondClass sc = new SecondClass();	
		ConstructorArgument ca = new ConstructorArgument(sc);
	}
}

class SecondClass{
	public void show(){
		System.out.println("I am show()");
	}
}