// close() method is used to make copy of class object which implements Cloneable marker interface. That class also has to override the clone() of the Obetct Class
// But copy constructor also do this but that creates with new operator and that is heavy process and degrades the performance.
// Cloning concept we can do the same thing but with improved performance.

/*Shadow cloning means, Only the current class clone object will be create. the associated classes ka object nahi benega.
	if we also want to clone the associated objects then we have to do deep cloning. */

class ClassOne implements Cloneable{
	
	int x;
	Temp tp;
	// constructor
	ClassOne(){
		tp = new Temp();
	}
	
	// overriding the clone() of Object class. 
	public ClassOne clone(){
		try{	return (ClassOne) super.clone();  }
		catch(CloneNotSupportedException e){
			System.out.println(e);
			return null;
		}
	}
	
	public static void main(String...s){
		ClassOne co = new ClassOne();
		co.x = 10;
		System.out.println("co.x: " + co.x);
		
		// Cloning the object
		ClassOne co1 = co.clone();
		System.out.println("co1.x: " + co1.x);
		co1.x = 200;	// changing the co1.x value...
		
		// and printing co.x so it proves that separate memory has been created.
		System.out.println("After changing co1.x: " + co1.x + " And co.x has own value: " + co.x);
		
		// Prove that associated objects are not cloned
		/* setting data through co.tp.x but i will print using co1.tp.x. It will prove that both objects sharing/ having same reference
			No new cloning done on associated object. */	
		co.tp.x = 500;
		System.out.println("Associated does not cloned: " + co1.tp.x);
		
		// Other way is comparing the reference id
		if(co.tp == co1.tp){
			System.out.println("Associated does not cloned in Shallow Cloning");
		}
		
	}
}


class Temp{
	int x = 10;
}
