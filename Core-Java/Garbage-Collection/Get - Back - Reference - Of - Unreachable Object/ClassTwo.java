class ClassOne{

	static ClassOne z;
	int x = 10; 
	int y = 20;

	public void finalize(){
		z = this;
	}
}

class ClassTwo{

	public static void main(String...a){
		ClassOne co = new ClassOne();
		System.out.println("Before Making Object Unreachable X is :" + co.x);

		//Making Object Unreachable
		ClassOne co2 = new ClassOne();		
		co = co2;

		// We got back the reference becasue JVM run finalize before destroy the object
		// And again assign the reference id using "this" inside "z" that is inside stack
		System.out.println("After Making Object Unreachable X is :" + co.x);
	}
}