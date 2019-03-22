// Adding and Iterating elements into HashMap. Here using user-defined class as key.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

class HashMapDemo1{
	
	public static void main(String...args){
		
		// Emp is key and String is value type
		HashMap<Emp, String> hm = new HashMap<>();
		
		System.out.println("Size: " + hm.size());
		
		// Adding Key-value pair via put(). It gets the reference-id of object and save as key. 
		// Inside it also compares the reference id with all other keys if matched it replace the value.
		// Some times new created reference's hash-code matched accidentally, in this case we override the
		// equals method and compare the data-member value to check if they are different.
		// If same let the put() method replace the value.
		
		hm.put(new Emp(10), "AAAA");
		hm.put(new Emp(10), "BBBB");
		hm.put(new Emp(10), "CCCC");
		hm.put(new Emp(10), "DDDD");
		
		Set s = hm.entrySet();		    //  getting the key-value pair set
		Iterator itr = s.iterator();	// HashMap also have iterator method
		
		while(itr.hasNext()){			
			// While taking iterator, we did not defined the type, so we have  to downcast, it won't to auto-unboxing.
			Map.Entry e = (Map.Entry) itr.next();		// getKey(), getValue() method is of Map.Entry
			
			Emp k = (Emp) e.getKey();
			String v = (String) e.getValue();
			System.out.println(k.id + " = " + v);
		}
	}
}

// Key Class
class Emp{
	int id;
	
	Emp(int id){
		this.id = id;
		//System.out.println(hashcode());
	}
	
	// If we want to make user-defined class as key then we have to override the equals().
	// Here we check if hashCode accidentally generated same then let put() replace the value.
	@Override
	public boolean equals(Object o){
		Emp e = (Emp) o;
		System.out.println("Equals");
		if(e.id == this.id) return true;
		else return false;
	}
	
	/*Every Time Object creates it creates new hashCode*/
	/*If by chance hashCode match*/
	@Override
	public int hashCode(){
		System.out.println("hashcode");
		// returning our own hash-code. 
		// String and other classes also override the hashCode() and equals().
		return id*10;			
	}
}