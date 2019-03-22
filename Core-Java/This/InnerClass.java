class InnerClass{
	
	int x = 18;	
	public static void main(String... a){
		/*Way 1: Send ref id through actual argument. the ref id argument will be always first argument*/
		System.out.println("--------------- Way 1-----------------------");			
		InnerClass ic = new InnerClass();
		ic.show(ic, 10);

		/*Way 2: We don't need to send argument through ref id. the compliler always send in hidden mode */
		System.out.println("--------------- Way 2-----------------------");			
		ic.show(10);

		/*Way 3: Calling an external class and send the ref id. be sure to always send as first parameter*/
		System.out.println("--------------- Way 3 Outer Class-----------------------");			
		OuterClass oc = new OuterClass();
		oc.outorShow(oc, 10);

		/*Way 4: Outer Class: We don't need to send argument through ref id. the compliler always send in hidden mode */
		System.out.println("--------------- Way 4-----------------------");			
		oc.outerShow(10);
		
		/*Way 5 Function: Calling InnerClass function that gets member data of outer class using this*/
		System.out.println("--------------- Way 5-----------------------");			
		OuterClass oc1 = new OuterClass();
		ic.show(oc1);
	}

	/*Way 1 Function*/
	void show(InnerClass ts, int x){
		System.out.println("Argument: " + x);
		System.out.println("Instance Member: " + ts.x);
		
	}

	/*Way 2 Function*/
	void show(int x){
		System.out.println("Argument: " + x);
		System.out.println("Instance Member: " + this.x);		
	}

	/*Way 5 Function: Calling InnerClass function that gets member data of outer class using this*/
	void show(OuterClass oc1){
		System.out.println("Inside InnserClass Function and Printing outerClass class level varaible: " + oc1.x);
	}


}

class OuterClass{
	int x = 16;
	
	/*Way 3 Outer Function. Get ref id as formal argument*/
	void outorShow(OuterClass oc, int x){
		System.out.println("Outer Class Local Variable: " + x);
		System.out.println("Class Level Variable: " + oc.x);
	}

	/*Way 4 Outer Function. Don't take ref id as formal argument*/
	void outerShow(int x){
		System.out.println("Outer Class Local Variable: " + x);
		System.out.println("Class Level Variable: " + this.x);
	}

}