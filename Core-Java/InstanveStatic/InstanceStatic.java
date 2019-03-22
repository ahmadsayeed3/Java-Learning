class InstanceStatic{
	/*Class Level Area:- Class loading time*/
	
	public static void main(String... stg){
		/*Local Method Area*/
	}
	
	static int add(int num1, int num2){
		return num1 + num2;
	}
	
}

class Class2{
	
	public static void main(String... st){
		
		
		int sum = InstanceStatic.add(100,150);
		System.out.println(sum);
	}
}