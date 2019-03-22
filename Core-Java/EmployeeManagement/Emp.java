class Emp{

	public static void main(String... args){
		
		Emp e1 = new Emp();
		int salary = e1.get("lalu");
		System.out.println("Salary of lalu is: " + salary);
		
	}
	/*Get Data from Database*/
		int get(String name){
				/*Database code*/
				if(name == "lalu")
				{	
					return 6000;
				}
				else if(name == "vineet")
				{
					return 50000;
				}
				else { return 0;}
		}
		
		void set(String name, int salary){
			/*set data into database*/
			/*database code here*/
		}
}
