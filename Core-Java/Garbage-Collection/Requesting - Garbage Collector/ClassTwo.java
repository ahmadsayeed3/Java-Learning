class ClassOne{
	int x = 10;
	int y = 20;

	//Overriding the protected finalize() that is inside Object class.
	//finalize method is deprecated - To see which function is deprecated "javac -Xlint FileName.java" (Capital X in Xlist)
	public void finalize(){
		System.out.println("Jawan Shaheed");
	}
}

class ClassTwo{

	

	static void show(){
		ClassOne co = new ClassOne();
		display();
	}

	static void display(){
		ClassOne co1 = new ClassOne();
	}

	public static void main(String...a) throws Exception{
	
		show();	
	
		//Way 1: 90 % chance that we will get that
		/*for(int i=0; i<2000; i++){
			System.gc();
		}*/

		//Way 2: 95% chances
		for(int i=0; i<2000; i++){
			System.gc();
			Thread.sleep(1000);
		}

		//Way 3: 99.99% chances
		/*for(int i=0; i<2000; i++){
			new ClassOne();
			new ClassOne();
			new ClassOne();
		}*/

		// JVM call finalize() before destroying the object.
		//But We can call finalize() but it won't affect anything

		/*ClassOne c1 = new ClassOne();
		//c1.finalize();
		//System.out.println(c1.x);*/
		
	}
}