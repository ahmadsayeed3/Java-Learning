/*Parameterized Constructor*/
/*Constructor with parameter created by user is called Parameterized Constructor*/
class PConstructor{
	
	PConstructor(int num, String name){
		System.out.println(num + " - " + name);
	}
	
	public static void main(String... a){
		new PConstructor(10, "Ahmad");
	}
}