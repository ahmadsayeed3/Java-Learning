//Constructor Inheritance

class ConstructorInheritance{
	//only for file compiling
}

class Parent{
	
	//Making default constructor is required because if here parametrized constructor is
	//available then JVM won't make default constructor. 
	//And if child call Parent constructor implicitly then it will create compilation error.
	Parent(){
		System.out.println("I am Non-Parametrized constructor from Parent");
	}
	
	Parent(int x){
		System.out.println("I am Parameterized constructor from Parent");
	}
	
}

class Student extends Parent{
	
	//Always First Paren Constructor will execute then child constructor
	Student(){
		//super(); JVM has alredy added super() implicitly always at first line.
		this(10, 20); // doing constructor chaining.
		System.out.println("I am Non-parametrized constructor from Child");
	}
	
	Student(int x){
		//super(); JVM has alredy added super() implicitly. What if we want parametrized constructor
		super(20); // so this way we can call our choosen constructor.
		
	}
	
	//For Constructor Chainig
	Student(int x, int y){
		// now it will execute through constructor chaining and then call parent constructor implicitly/explicitely.
		//super(); // added by JVM
		System.out.println("I am Chaining Constructor from Child");
	}
	
	public static void main(String...srg){
		//For calling Child parametrized constructor and constructor chaining.
		Student s = new Student();
		
		//For calling Child parametrized constructor.
		Student s2 = new Student(10);
	}
}

//What if we want Constructor Chainig, but line is implicitly/explicitely goes to this.
//simple call the constructor chain through this and that called constructor will call Parent constructor.