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

	public static void main(String...a) throws Exception{
		
		// Printing How Much Free Memory Available
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.totalMemory());	
		//System.out.println(rt.freeMemory());	

		// Filling Object In Memory 
		ClassOne co = new ClassOne();
		System.out.println(co.x);
		System.out.println(co.y);
		
		// Printing How Much Free Memory Available
		System.out.println(rt.freeMemory());

	
		// Printing How Much Free Memory Available
		//System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());

//Making Object Unreachable
		//co = null;

			
		
		//Requesting Garbage Collector to Destroy Unreachable Object
		for(int i=0; i<2000; i++){
			System.gc();
		}

System.out.println(rt.totalMemory());
System.out.println(rt.freeMemory());
	}
}