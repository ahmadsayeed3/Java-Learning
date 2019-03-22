// Adding and Iterating elements into HashMap. Here using predefined class as key.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapDemo{
	
	public static void main(String...a){
		
		// Declaring a HashMap
		HashMap <String, String> hm = new HashMap<String, String>();
		System.out.println("Size Of: " + hm.size());
		
		// put() to add element
		hm.put("101", "AAA");
		hm.put("102", "BBB");
		hm.put("103", "CCC");
		hm.put("104", "DDD");
		
		Set s = hm.entrySet();
		Iterator<Map.Entry> i = s.iterator();		// We defined the type so we don't need to do auto-boxing.
		while(i.hasNext()){
			
			Map.Entry e = i.next();					// getKey(), getValue() method is of Map.Entry, to cal its method need the down-casting/un-boxing.
			String k = (String) e.getKey();
			String v = (String) e.getKey();
			System.out.println(k + " = " + v);
		}
	}
}

