/* Deep Cloning: Whenever we want to make clone of a class as well as the associated objects then we
have to make clone of the associated object explicitly. */

// Associate Class...
class Temp implements Cloneable{
	int g;
	
	// constructor
	Temp(int g){
		this.g = g;
	}
	
	// overriding
	public Temp clone(){
		try{	return (Temp) super.clone();	}
		catch(CloneNotSupportedException e){
			System.out.println(e);
			return null;
		}
	}
}


// Class That Will be Deep CLone
class DeepClone implements Cloneable{
	
	int x = 10;
	Temp t;
	
	// constructor
	DeepClone(int a){
		t = new Temp(a);
	}
	
	// overriding
	public DeepClone clone(){
		try{	return (DeepClone) super.clone();	}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
	
	public static void main(String...a){
		DeepClone c = null;
		DeepClone m = new DeepClone(100);
		System.out.println("M: " + m.t.g);
		
		try{
			c = m.clone();
		}catch(Exception e){	System.out.println(e);	}
		
		System.out.println("C: " + c.t.g);
		c.t.g = 300;
		System.out.println("M After changes: " + m.t.g);
		
		if(m.t != c.t){
			System.out.println("Deep Cloning");
		}
	}
}