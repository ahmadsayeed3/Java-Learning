//Static block always executes only once in the life cycle of a class.
class DataMemberInitialization{
	
	public static void main(String... a){
		System.out.println("Enter a Character");
		System.out.println(ClassOne.x);
		System.out.println(ClassOne.x);

		//when you call it next time it won't ask for input. You can try
		//this by commenting the first class calling line
		
	}
}

class ClassOne{
	static int x;
	static{
		try{
			x = System.in.read();
		}catch(Exception e){}
	}
}