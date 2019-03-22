//Example of default constructor
class DefaultConstructor{
	int x = 10;
	/*There is default constructor created JVM compiler*/
	public static void main(String... a){
		System.out.println("I am with default constructor");
		new DefaultConstructor().show();
	}
	
	void show(){
		System.out.println(x);
	}
}