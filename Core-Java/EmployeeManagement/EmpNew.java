class EmpNew{
	
	String name;
	int salary;
	static String cName = "TCS";
	
	public static void main(String... args){
		EmpNew javed = new EmpNew();
		javed.get("Ahmad", 50000);
		javed.show();
		
		/*EmpNew jm = new EmpNew();
		jm.get("Sayeed", 45000);
		jm.show();
		
		StaticDirectCall();
		EmpNew.StaticClassCall();
		/*Never use this. */
		//jm.StaticObjectCall();
		
		/*Copy the refference id into refference variable*/
		EmpNew Prem = javed;
		Prem.get("Ahmad", 50000);
		Prem.show();
		
		/*We cant use class level variable inside static function without crating an object*/
		/*main */
		
	}
	
	void get(String s1, int s2){	

		name = s1;
		salary = s2;
	}
	
	void show(){
		EmpNew en = new EmpNew();
		
		System.out.println("Direct Varaible Name is " + name);
		System.out.println("With Class Varaible Name is " + en.name);
		System.out.println("Salary is " + salary);
		System.out.println("Way 1 Direct Variable name : Company name is " + cName);
		System.out.println("Way 2 By Class name and (.) : Company name is " + EmpNew.cName);
		
		/*Never use static things of a class via object.*/
		EmpNew en1 = new EmpNew();
		System.out.println("Way 3 by creating class instance: Company name is " + en1.cName);
	}
	
	public static void StaticDirectCall(){
		System.out.println("I am Direct Call Static Function");
	}
	
	static void StaticClassCall(){
		System.out.println("I am with class call static function");
	}
	
	static void StaticObjectCall(){
		System.out.println("I am with object call static function");
	}
}