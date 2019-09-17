public class Program1 implements MyInterface{
	
	public static void main(String...a){
		// for static method
		MyInterface.display();
		MyInterface.show();
		
		// for default method
		System.out.println(new Program1().defaultMethod());
	}
}


interface MyInterface{
	
	// 
	public static void main(String...a){
		show();
		display();
	}
	
	// by default public
	static void show(){
		System.out.println("H! I am private static method in interface");
	}
	
	// public static
	public static void display(){
		System.out.println("H! I am public static method in interface...");
	}
	
	// default method
	default String defaultMethod(){
		return "H! I am default method from inetreface";
	}
}