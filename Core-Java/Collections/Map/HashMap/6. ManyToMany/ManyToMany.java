// Many to Many: Putting an ArrayList as value. One Key - Many Values

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class ManyToMany{
	
	public static void main(String...args){
		
		// Putting ArrayList as Value.
		Map<Integer, List<String>> mp = new HashMap<>();
		
		// user defined method mentioned below.
		add(mp, 1, "String One");
		add(mp, 1, "String Two");
		add(mp, 1, "String Three");
		add(mp, 2, "String Four");
		add(mp, 2, "String Five");
		add(mp, 3, "String Six");
		add(mp, 3, "String Seven");
		
		// Let's iterate the elements
		Set<Integer> keySet = mp.keySet();		// get the only key-Set.
		for(int i: keySet){
			
			List<String> ls = mp.get(i);		// Get the value means ArrayList Object.
			
			System.out.print(i+": ");
			for(String s: ls){					// Get the all elements of the ArrayList Object
				System.out.print(s +", ");
			}
			
			System.out.println("");
		}
	}
	
	private static final void add(Map<Integer, List<String>> mp, int k, String v){
		
		// If key is already available get the ArrayList object and add an element
		if(mp.containsKey(k)){
			mp.get(k).add(v);		// Returns ArrayList Object and call ArrayList's method add()
		}
		
		// If key is not available then create a new ArrayList and put inside HasMap.
		else{
			List<String> ls = new ArrayList<>();
			ls.add(v);
			mp.put(k, ls);
		}
	}
}