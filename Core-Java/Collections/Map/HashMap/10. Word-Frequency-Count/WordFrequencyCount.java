// Word Frequency count with the help of Collection.
import java.util.HashMap;
public class WordFrequencyCount{
	
	public static void main(String...args){
		String s = "This is a a test   this is a test Lalu";
		String[] splitted = s.split(" ");
		
		//
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0; i<splitted.length; i++){
			// the first word won't be available so the word will put as key and counter as value.
			
			if(hm.containsKey(splitted[i])){
				// If key(word) is already there then replace the value as count+1
				int count = hm.get(splitted[i]);
				hm.put(splitted[i], count+1);
			}else{
				hm.put(splitted[i], 1);
			}
		}
		
		// Let's remove the extra space(EmptyString) count key-value pair
		hm.remove("");
		
		// Now Prints the count
		System.out.println(hm);
	}
} 