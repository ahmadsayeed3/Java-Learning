//By default all the data members of an interface are final and static
// InterfaceDataMember.java

interface InterfaceOne{

	int x = 50; // by default final and static
	int y = 100; // by default final and static
	//int z; // error. required to initialized

}

interface InterfaceTwo{
	int x = 900; // by default final and static
}

//We can inherit data members from interface but
//We can't change any variable value of interface becasue they are by default final and static

class Child implements InterfaceOne{
	
	int y = 300;
	static int x = 600; // working. Can't override becasue x is final also. Created new variable.
	public static void main(String...a){
		System.out.println(InterfaceOne.x); // working
		System.out.println(x); // working

		System.out.println(InterfaceOne.y); // working
		//System.out.println(y); // error

		InterfaceOne io = new Child();
		System.out.println(io.y); // working

		System.out.println(InterfaceTwo.x); // again working
		
		// now it is non-static new varaiable
		Child c = new Child();
		System.out.println(c.y);
	}
}