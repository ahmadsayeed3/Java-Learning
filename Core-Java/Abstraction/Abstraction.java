
class Abstraction{
	// Only For file saving
}

abstract class AssignmentMaker{
	
	//no class can have without constructor.
	AssignmentMaker(){
		System.out.println("Parent Constructor");
	}

	// From JDK 9, we can have private method in abstra class
		private void methodPrivate(){
			System.out.println("I am Private Method of Abstract Class");
		}
	
	// not require to have abstract method
	abstract void makeAssignment();

	//registration function
	public void CyberCafe(AssignmentMaker am){
		
		// developers code
		
		//after my function
		am.makeAssignment();
	}
	
}


class Student extends AssignmentMaker{

	
	String assignment = "Java";
	
	//overriding
	void makeAssignment(){
		// hundred lines of code.
		System.out.println(" Code Sent");	
	}

	public static void main(String...a){
		Student s = new Student();
		s.CyberCafe(s);		
	}
}