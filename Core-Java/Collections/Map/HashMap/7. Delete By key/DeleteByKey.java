// Delete an element from HashMap

import java.util.HashMap;
import java.util.Set;
public class DeleteByKey{
	
	public static void main(String...args){
		
		HashMap<Price, String> hm = new HashMap<>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Mango", 30), "Mango");
		hm.put(new Price("Apple", 10), "Apple");
		
		System.out.println("Actual HashMap Element: ");
		printMap(hm);
		
		Price key = new Price("Banana", 20);
		System.out.println("Does key available: " +  hm.containsKey(key));
		System.out.println("Does value available: " + hm.containsValue("Banana"));
		
		System.out.println("Deleting key...");
		hm.remove(key);
		
		System.out.println("After Deleting Key");
		printMap(hm);
	}
	
	
	// Print Map Elements
	public static void printMap(HashMap<Price, String> map){
		Set<Price> keys = map.keySet();
		for(Price p: keys){
			System.out.println(p + " = " + map.get(p));
		}
	}
}


class Price{
	
	private String item;
	private int price;
	
	Price(String item, int price){
		this.item = item;
		this.price = price;
	}
	
	@Override
	public int hashCode(){
		//System.out.println("Inside hashCode(): ");
		int hashCode = 0;
		hashCode = price*20;
		hashCode+= item.hashCode();				// String class hashCode()
		return hashCode;
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("Inside equals(): ");
		
		if(o instanceof Price){
			Price p = (Price) o;
			return (p.item.equals(this.item) && p.price == this.price);
		}else{	return false; }
	}
	
	@Override
	public String toString(){
		return ("Item: " + item + ", Price: " + price); 
	}
}