// Create My Own ArrayList
import java.util.Iterator;
public class MyArrayList <T> {
	
	int size = 0; 				// default ArrayList size 0 .
	Object object[]; 		// array that will hold all elements.
	float growth = .5F;		// ArrayList size growth value.
	int index = -1;			// ArrayList default index.
	int next;				// ArrayList current index by default 0;
	
	// default constructor that will create ArrayList of default size 10;
	public MyArrayList(){
		size = 10;
		object = new Object[size];
	}
	
	// Parameterized constructor that creates ArrayList od given size.
	public MyArrayList(int size){
		this.size = size;
		object = new Object[size];
	}
	
	// method that returns iterator object
	Iterator iterator(){	return new Itr(); 	}
	
	// Nested Class that have all import methods
	private class Itr implements Iterator{	
		
		// check if the next element is available in the ArrayList
		public boolean hasNext(){
			if(next > index) return false;
			else return true;
		}
		
		// return next the next element
		public Object next(){
			return object[next++];
		}
	}
	
	// this method will add elements in the arrayList
		public void add(T obj){
			// System.out.println(obj.getClass().getName());		// We can know what type of class object in coming here.
			
			// check if ArrayList size and current index is same then need to grow the size.
			// ArrayList will grow half of current size
			if(index +1 == size){
				
				int tempSize = size + (new Float(size * growth)).intValue();
				//System.out.println(tempSize);
				
				// Now let's copy the all old data to new temp array
				Object[] tempObj = new Object[tempSize];
				size = tempSize;
				for(int i=0; i<object.length; i++){
					tempObj[i] = object[i];
				}
				
				// now when the size grow put the old data to new one
				object = tempObj;
			}
			
			// now add the element
			object[ ++index ] = obj;
		}
		
		// this method add all elements of arrays int ArrayList.
		public void addAll(T[] obj){
			for(int i=0; i<obj.length; i++){
				add(obj[i]);	// simply call the add method and it will handle everything.
			}
		}
		
		
		// set element at specific index
		public boolean set(int idx, T obj){
			if(idx < 0) return false;
			else if(idx > index) { add(obj); return true; }
			else { object[idx] = obj; return true; 	}		
		}
		
		// return my customized message
		public String toString(){
			String str = "";
			for(int i=0; i<=index; i++){
				str+= "{" + object[i].toString() + "} ";
			}
			return str;
		}
		
		// get the size of elements
		public int size() { return index + 1; }
		
	// remove the last element
		public void remove(){ 	--index;	}
			
			
		// check if arrayList is empty
		public boolean isEmpty() { return index == -1; }
		
		// return the capacity of ArrayList
		public int capacity(){ return object.length; }
	
	
}