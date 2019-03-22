// Single Dimensional Array


class SingleArray{

	//Declaration, Instantioion, and Initialization All Together
	//Static Array
	final static String MyNames[] = {"Ahmad", "Sayeed", "Asmal", "Babu"};

	//Non-static arrays
	String friends[] = {"Prem", "Vineet", "Javed"};
	
	public static void main(String...a){
		
		System.out.println("Printintg Static Array MyNames");
		for(int i = 0; i<MyNames.length; i++){
			System.out.println(MyNames[i]);
		}
	
	
		System.out.println("Printintg Non-Static Array MyNames");

		SingleArray sa = new SingleArray();
		for(int i =0; i<sa.friends.length; i++){
			System.out.println(sa.friends[i]);
		}

		//Declaring and Array: DataType VariableName[];
		String names[];
		int []students;
		String[] schools;

		//Instantiation. Allocating memory at heap: VariableName = new DataType[];
		names = new String[4];
		students = new int[4];
		schools = new String[2];

		//Initialization: VariableName[index] = Value;
		schools[0] = "Prvate School";
		schools[1] = "Goverment Schools";		
		
		// students = {1;2;3;4}; // Can't do this

		students[0] = 101;		
		students[1] = 102;
		students[2] = 103;
		students[3] = 104;

		names[0] = "Ahmad";
		names[1] = "Sayeed"; 
		names[2] = "Asmal"; 
		names[3] = "Babu"; 

		
		System.out.println("Printlning schools using loop");
		
		for(int i = 0; i< schools.length; i++){
			System.out.println(schools[i]);
		}

		System.out.println("Printlning Students using loop");
		
		for(int i = 0; i< students.length; i++){
			System.out.println(students[i]);
		}

		
		System.out.println("Printlning Names using loop");
		
		for(int i = 0; i< names.length; i++){
			System.out.println(names[i]);
		}
	}

}