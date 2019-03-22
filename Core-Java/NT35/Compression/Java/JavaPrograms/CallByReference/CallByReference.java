/*Proving that java does not support Call By Reference*/

class CallByReference{
	
	CallByReference(){
		System.out.println("default");	
	}

	CallByReference(CallByReference z){
		z = null;
	}

	public static void main(String... a){
		CallByReference cc = new CallByReference();
		System.out.println(cc);
		
		/*passing "cc" through call by reference. so this should be change when z=null.*/
		/*But It won't change becasue java does not support Call by Reference.*/
		CallByReference c2 = new CallByReference(cc);
		System.out.println(cc);
	}
}