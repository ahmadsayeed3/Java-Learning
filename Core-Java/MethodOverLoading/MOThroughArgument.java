class MOThroughArgument{
	public static void main(String...a){
		/*Way 1*/
		new MOThroughArgument().display("String 1 : ", "String 2 : ", "String 3");
		new MOThroughArgument().display(5, 11, 16);
		
		/*Way 2*/
		int sum1 = new MOThroughArgument().add(12, 13);
		int sum2 = new MOThroughArgument().add(10, 12, 13);
		
		
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	
	/*	Way 1: Creating function with same number of arguments and with 
			 different data type arguments*/
	/*	If you want to keep number of arguments in each function same and still
			want to overload then change the data type of their arguments*/
	void display(String s1, String s2, String s3){
		System.out.println(s1 + s2 + s3);
	}
	
	int display(int n1, int n2, int n3){
		System.out.println(n1 + n2 + n3);
		return 0;
	}
	
	/*	Way 2: creatting function with different number of arguments with same data type*/
	/*	Change the number of arguments in each function*/
	
	int add(int x, int y){
		return x + y;
	}
	
	int add(int x, int y, int z){
		return x + y + z;
	}
}