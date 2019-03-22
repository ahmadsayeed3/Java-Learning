// Push (add) Pop (remove) elements

import java.util.LinkedList;

public class MyPushPop{
	
	public static void main(String...a){
		
		LinkedList<String> name = new LinkedList<>();
		name.add("String One");
		name.add("String Two");
		name.add("String Three");
		name.add("String Four");
		name.add("String Five");
		
		System.out.println("Actual List: " + name);
		
		// Now let's push the element
		name.push("Push Element");
		System.out.println("Push Changes: " + name);
		
		// Now let's pop the element.
		name.pop();
		System.out.println("Pop Changes: " + name);
	}
}