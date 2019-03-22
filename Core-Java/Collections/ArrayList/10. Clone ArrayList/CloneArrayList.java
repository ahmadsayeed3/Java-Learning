// ArrayList Clone: 

import java.util.ArrayList;

public class CloneArrayList{
	public static void main(String...a){
		ArrayList<String> arr = new ArrayList<>();
		
		// Not' let's add elements
		arr.add("First");
		arr.add("Second");
		arr.add("Third");
		arr.add("Random");

		// Print Actual ArrayList
		System.out.println("Actual ArrayList: " + arr);

		// Now let's create clone/copy of ArrayList
		ArrayList<String> copyArr = (ArrayList<String>) arr.clone();
		
		// Print Copy ArrayList
		System.out.println("Copied ArrayList: " + copyArr);

		// Let's check if new clone/copy has been created.
		if(arr != copyArr){
			System.out.println("Clone created");
		}
		// It does shallow clonning, means associated objects does not create new copy.
		if( arr.get(0) == copyArr.get(0) ){
			System.out.println("Shallow Cloning");
		}		
	}
}