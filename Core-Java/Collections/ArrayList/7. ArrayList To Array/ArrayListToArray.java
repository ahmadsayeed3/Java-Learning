// ArrayList To ArrayList

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListToArray{
	
	public static void main(String...a){
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("String 1");
		arrList.add("String 2");
		arrList.add("String 3");
		arrList.add("String 4");
		
		// ArrayList To Array
		// Create an array of ArrayList Size
		String[] s1 = new String[ arrList.size() ];
		
		for(int i=0; i<arrList.size(); i++){
			s1[i] = arrList.get(i);
		}
		
		// Displaying Array s1 elements
		for(String s: s1){
			System.out.println(s);
		}
	}
}