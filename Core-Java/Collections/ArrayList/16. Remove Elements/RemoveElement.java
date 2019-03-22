// remove element from ArrayList:

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement{
	
	public static void main(String...a){
		
		ArrayList<String> name = new ArrayList<> ();
		name.add("Vineet");
		name.add("Prem");
		name.add("Javed");
		name.add("Lovely");
		name.add("Parul");
		name.add("Harsh");
		
		System.out.println("Actual List: "+  name);
		
		String removeElement = "Harsh";
		
		// Way 1:
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()){
			if(removeElement.equals(itr.next())){
				itr.remove();
			}
		}
		
		System.out.println("After Remove: ");
		System.out.println(name);
		
		// Way 2:
		name.remove("Lovely");
		System.out.println("Again Remove: ");
		System.out.println(name);
	}
}