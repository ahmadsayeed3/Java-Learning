// Array To ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayToArrayList{
	
	public static void main(String...args){
		
		// create an array and store it inside List then put that list in ArrayList
		String cityNames[] = {"Agra", "Mysore", "Chandigarh", "Bhopal"};
		List<String> list = Arrays.asList(cityNames);
		
		// Array to ArrayList Conversion
		ArrayList<String> cityList = new ArrayList<> (list);
		System.out.println("Elements: " + cityList);
		
		
		// Adding Few More Elements
		cityList.add("New City");
		cityList.add("New City");

		//printing all elements
		for(String str: cityList){
			System.out.println(str);
		}
	}
}