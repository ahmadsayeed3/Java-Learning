/*Why we should not assign directly to the class level variable*/
/*becasue there is data type issue. user can input int into string.*/
class ClassLevelVariable{
	
	String name;
	int salary;
	
	public static void main(String... args){
		ClassLevelVariable clv = new ClassLevelVariable();
		
		//clv.name = 123;
		//clv.salary = "Ahmad";
		
		clv.func(123, "Ahmad");
		
		clv.func(123, "sayeed");
		
		
		System.out.println(" Name is : " + name);
		System.out.println("Salary is : " + salary);
	}
	
	void func(String s1, int s2){
		name = s1;
		salary = s2;
		/*40 lines*/
	}
}