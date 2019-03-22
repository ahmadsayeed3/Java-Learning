//HashMap Cloning.
import java.util.HashMap;

public class HashMapClone{
	
	public static void main(String...args){
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ahmad");
		hm.put(102, "Sayeed");
		hm.put(103, "Asmal");
		hm.put(104, "Babau");
		
		System.out.println("Actual HashMap: " + hm);
		
		HashMap hm2 = (HashMap) hm.clone();
		System.out.println("Cloned HashMap: " + hm2);
	}
}
