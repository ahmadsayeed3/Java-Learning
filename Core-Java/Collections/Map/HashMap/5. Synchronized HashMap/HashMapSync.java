// synchronized HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;

public class HashMapSync{
	
	public static void main(String...args){
		
		// this method creates an synchronized HashMap class object and return the reference. 
		Map m = Collections.synchronizedMap(new HashMap<Integer, String>());
		new Thread(new ThreadOne(m, "ThreadOne")).start();
		new Thread(new ThreadTwo(m, "ThreadTwo")).start();
		/*m.put(101, "String One");
		m.put(102, "String Two");
		m.put(103, "String Three");
		m.put(104, "String Four");
		
		// Let's iterate
		Set s = m.entrySet();
		synchronized(m){
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println(me.getKey() + " = " + me.getValue());
			}
		}*/
	}
}


class ThreadOne extends Thread{
	
	Map<Integer, String> hm;
	
	ThreadOne(Map<Integer, String> hm, String tName){
		super(tName);
		this.hm = hm;
	}
	
	@Override
	public void run(){
		System.out.println(getName() + " Entered");
		
		hm.put(101, "String One");
		hm.put(102, "String Two");
		
		// Let's iterate
		Set s = hm.entrySet();
		//synchronized(hm){
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println(getName() + ": " + me.getKey() + " = " + me.getValue());
				
				try{ Thread.sleep(2000); }
				catch(Exception exp){ exp.printStackTrace(); }
			}
		//}
		System.out.println(getName() + " Exit");
	}
}


// Class ThreadTwo
class ThreadTwo extends Thread{
	
	Map<Integer, String> hm;
	
	ThreadTwo(Map<Integer, String> hm, String tName){
		super(tName);
		this.hm = hm;
	}
	
	@Override
	public void run(){
		System.out.println(getName() + " Entered");
		hm.put(103, "String Three");
		hm.put(104, "String Four");
		
		// Let's iterate
		Set s = hm.entrySet();
		//synchronized(hm){
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println(getName() + ": " + me.getKey() + " = " + me.getValue());
				
				try{ Thread.sleep(2000); }
				catch(Exception exp){ exp.printStackTrace(); }
			}
		//}
	System.out.println(getName() + " Exit");
	}
}
