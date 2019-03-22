// Remove,Clear Elements from HashMap

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class HashMapRemove{
	
	public static void main(String...args){
		
		HashMap<Emp, String> hm = new HashMap<>();
		System.out.println("Size: " + hm.size());
		System.out.println("isEmpty: " + hm.isEmpty());
		
		hm.put(new Emp(10), "AAAA");
		hm.put(new Emp(20), "BBBB");
		hm.put(new Emp(30), "CCCC");
		hm.put(new Emp(40), "DDDD");
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			Map.Entry e = (Map.Entry) itr.next();		
			Emp k = (Emp) e.getKey();
			String v = (String) e.getValue();
			
			System.out.println(k.id + " = " + v);
		}
		
		// Let's get value by id
		Emp e = new Emp(40); 		// will return the same hashCode because we overridden 
		String ss = hm.get(e);
		System.out.println("Removed: " + ss);
		
		// Now Let's remove element by id
		hm.remove("After Removal: " + e);
		
		System.out.println(hm);
		//Now Again Iterate the elements
		s = hm.entrySet();
		itr = s.iterator();
		
		while(itr.hasNext()){
			Map.Entry e1 = (Map.Entry) itr.next();		
			Emp k = (Emp) e1.getKey();
			String v = (String) e1.getValue();
			
			System.out.println(k.id + " = " + v);
		}
		
		// Now Let's clear all elements via clear().
		System.out.println("Before clear(), isEmpty: " + hm.isEmpty());
		hm.clear();
		
		System.out.println("After clear(), isEmpty: " + hm.isEmpty());
	}
}


class Emp{
	int id;
	Emp(int id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o){
		Emp e = (Emp) o;
		if(e.id == this.id) return true;
		else return false;
	}
	
	// Every time objects creates, new hashcode creates.
	@Override
	public int hashCode(){
		return id*10;
	}
}