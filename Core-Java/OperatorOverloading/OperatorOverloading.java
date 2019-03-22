/*Operator overloading is part of a polymorphism. it is compile time polymorphism 
that only works implicitly. 
We can't use operator overloading by adding our own extra funcionality*/

class OperatorOverloading{
	public static void main(String... args){
	
		int num1 = 10, num2 = 20;
		String name1 = "Ahmad", name2 = "Sayeed";
		
		int sum = num1 + num2; // implicitly operator overloading
		
		String fullName = name1 + name2;  //implicitly operator overloading // Or
		String fName = "Ahmad " + "Sayeed"; //implicitly operator overloading // Or
		
		System.out.println(sum);
		System.out.println(fullName);
		System.out.println(fName);
	
		/*We can't add extra funcionality in operator overloading so we can't use it as explicitely*/
		
	}

}