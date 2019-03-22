// Copying HashMap elements into another HashMap via putAll().
import java.util.HashMap;
public class MyHashMapCopy{
	
	public static void main(String...args){
		
		HashMap <String, String> hm = new HashMap<>();
		
		// add key-value pair to HashMap
		hm.put("First", "First Inserted");
		hm.put("Second", "Second Inserted");
		hm.put("Third", "Third Inserted");
		
		System.out.println("Actual: " + hm);
		
		// Create New HashMap and add few elements
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("S1", "String One");
		hm2.put("S2", "String Two");
		
		// Now let's copy the elements
		hm2.putAll(hm);
		System.out.println("Copied: " + hm2);
	}
}