/*	If multiple threads are sharing same ArrayList object then if one thread started to iterate and other 
thread got the life cycle and perform add() or remove() on that ArrayList object then it will create exception.

*/
// copyOnWrite():

// Program without copyOnWrite(): problem.
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListProblem{
	
	public static void main(String...args){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		try{
			ThreadOne to1 = new ThreadOne(al);
			Thread t1 = new Thread(to1);
			
			ThreadTwo to2 = new ThreadTwo(al);
			Thread t2 = new Thread(to2);
			
			t1.setPriority(10);
			t2.setPriority(1);
			
			t1.start();
			t2.start();
		}catch(Exception exp){ System.out.println(exp); }
	}
}


// Thread One
class ThreadOne implements Runnable{
	
	ArrayList<String> al;
	
	// Constructor
	ThreadOne(ArrayList al){
		this.al = al;
	}
	
	public void run(){
		
		// ThreadOne started to iterate
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			try{
				String str = (String) itr.next();
				System.out.println("Value is: " + str);
				Thread.sleep(2000);							// Thread slept before finishing the iteration
			}catch(Exception exp){
				System.out.println(exp);
				System.exit(0);
			}
		}
	}
}


// ThreadTwo
class ThreadTwo implements Runnable{
	
	ArrayList<String> al;
	
	// Constructor
	ThreadTwo(ArrayList al){
		this.al = al;
	}
	
	public void run(){
		
		// ThreadTwo started to changes
		for(int i=0; i<5; i++){
			try{
				System.out.println("Inside Thread Two");
				al.add("First");
				al.add("Second");
				
				Thread.sleep(2000);
			}catch(Exception exp){
				System.out.println(exp);
			}
		}
	}
}

