// "CustomException.java"
//throw keyword is used for throwing the Exception Explicitly

// Custom Exception : 
class AgeException extends Exception{
	// Constructor
	AgeException(String s){
		super(s); // calling parent constructor
	}
}

// Employee Call That Will Use Custom Exception Class
class Employee{
	int age;
	
	public static void main(String...arg){
		Employee emp = new Employee();
		emp.setAge(Integer.parseInt(arg[0])); // Putting value through Command Line Argument(String to Int)
		
		System.out.println("\n Program is continue.....");
	}
	
	void setAge(int age){
		if(age < 18){
			try{
				throw new AgeException("Invalid Age, Employee age must me greater than 18");
			}catch(AgeException a){
				System.out.println(a);
			}
		}else{
			this.age = age;
			System.out.println("Age is Set: " + this.age);
		}
	}
}
