/*If you want perfrom any task only once in the life cycle of class
then put the code of that task in a static block.*/

class StaticBlockAdvantage{
	public static void main(String...a){
		Student.insertStudent();
		Student.fetchStudent();
		Student.updateStudent();

		// now check if connection is still open.
		System.out.println(Student.connectionStatus);
	}
}

class Student{
	static boolean connectionStatus;
	static{
		System.out.println("Connect is open now");
		connectionStatus = true;
	}

	static void insertStudent(){
		System.out.println("Student Data Inserted");
	}

	static void fetchStudent(){
		System.out.println("Student Data Fetched");
	}

	static void updateStudent(){
		System.out.println("Student Data Updated");
	}
}