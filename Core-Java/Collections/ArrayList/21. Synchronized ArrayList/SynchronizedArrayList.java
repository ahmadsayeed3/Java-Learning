// Synchronization: 

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class SynchronizedArrayList{
	
	public static void main(String...args){
		
		// ArrayList is not synchronized class. So to synchronized ArrayList we have synchronizedList() method that accepts
		// ArrayList object. It creates and return List synchronized object.
		List<String> questionPaper = Collections.synchronizedList(	new ArrayList <String> () );
		
		// Adding elements elements to synchronized ArrayList
		questionPaper.add("Maths");
		questionPaper.add("Science");
		questionPaper.add("English");
		
		System.out.println("Iterating ArrayList");
		
		synchronized(questionPaper){
			
			Iterator<String> itr = questionPaper.iterator();
			while(itr.hasNext()){
				System.out.println( itr.next() );
			}
		}
		
	}
}