/*There are two types of Constructor*/
// 1. Non-Parameterized or default parameterized
// 2. Parameterized parameterized.

// By default Java compiler creates constructor in every class that called 
//Non-Parameterized or default parameterized
//

//Example of default constructor
class ConstructorMore{
	/*There is default constructor created JVM compiler*/
	public static void main(String... a){
		System.out.println("I am with default constructor");
	}
}

/*We can create any number of constructor*/
class ManyConstructor{
	
	int x;
	
	/*non-parameterized constructor*/
	ManyConstructor(){
		System.out.println("No Parameter");
	}
	/*Parameterized constructor*/
	ManyConstructor(String s){
		System.out.println(s);
	}
	/*Applying method overloading at constructor*/
	ManyConstructor(int num){
		System.out.println(num);
	}
	
	
	
	int funcNum(){
		return 50;
	}
	
	public static void main(String... a){
		new ManyConstructor();
		new ManyConstructor("Ahmad Sayeed");
		new ManyConstructor(10);
	}
}