/* 1) Rule: If the superclass method does not declare an exception, 
		subclass overridden method cannot declare the checked exception. But It can declare unchecked exception */

import java.io.*;  

class Parent{  

	void msg(){
		System.out.println("parent");
	}
	
	void show(){
		System.out.println("parent Show Method");
	}
}  
  
class CaseOne extends Parent{  
	
// Can't Happen
/*
	void msg()	throws	IOException{  
		System.out.println("TestExceptionChild");  
	}
*/
	
	// Can Happen
	public void show()	throws	ArithmeticException{
		System.out.println("Child Show Method");
	}
	
	public static void main(String args[]){  
		Parent p = new CaseOne();  
		//p.msg();
		p.show();
	}  
}  
// Test it Now
// Output:Compile Time Error