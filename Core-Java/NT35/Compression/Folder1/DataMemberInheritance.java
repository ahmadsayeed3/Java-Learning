class DataMemberInheritance{
	// oNLY FOR FILESAVING
}

class Teacher{
	int knowledge = 10;
	int classHour = 1;
	private int exp = 18;
	static String bloodGroup = "A+";
}

class Student extends Teacher{
	//Data Hiding
	int knowledge = 6;
	String bloodGroup = "O+";
	public static void main(String...a){
		staticGet();
		
		Student s = new Student();
		s.get();
	}
	
	//inside static function situation
	static void staticGet(){
		System.out.println("------------Static Output --------------");
		Student s = new Student();
		System.out.println(s.classHour); // working
		System.out.println(s.knowledge); // working
		System.out.println(((Teacher)s).knowledge); // if we want to get parent data member
		//System.out.println(((Teacher)this).knowledge);
		//System.out.println(((Teacher)super).knowledge);
	}
	
	//inside Non-Static function situation
	void get(){
		System.out.println("----------- Non-Static Output ---------------");
		System.out.println(knowledge); // working with data hiding
		//System.out.println(exp); // we can't cause private
		System.out.println(bloodGroup);
		System.out.println(this.bloodGroup); // it wil fetch current class
		//// if we want to get parent data member
		System.out.println(super.bloodGroup); // super will fetch parent data
		System.out.println(((Teacher)this).bloodGroup); // it wil fetch parent class
		//System.out.println(((Teacher)super).bloodGroup); // does not working
	}
	
}

class Nephew extends Student{
	public static void main(String... q){
		System.out.println("---------------- Nephew ----------------");
		Nephew n1 = new Nephew();
		n1.nephewFunc();
	}
	
	void nephewFunc(){
		System.out.println(((Teacher)this).bloodGroup);
		Nephew n1 = new Nephew();
		//System.out.println(((Teacher)super).bloodGroup); //Does not works
		System.out.println(((Teacher)n1).bloodGroup); //Working
	}
}

//All over: 
//((ClassName)this/Refid).dataMember does not depends on inheritance type