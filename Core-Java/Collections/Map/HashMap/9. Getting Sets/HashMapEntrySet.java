// Getting key-value pair set and printing via for loop.
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapEntrySet{
	
	public static void main(String...args){
		
		HashMap<String,String> hm = new HashMap<>();
		
		// Add key-value pair to HashMap
		hm.put("N1", "String One");
		hm.put("N2", "String Two");
		hm.put("N3", "String Three");
		
		System.out.println("HashMap: " + hm);
		
		// getting value for the given key from HashMap
		Set<Entry<String, String>> ent = hm.entrySet();
		for(Entry<String, String> et: ent){
			System.out.println(et.getKey() + " = " + et.getValue());
		}
	}
}