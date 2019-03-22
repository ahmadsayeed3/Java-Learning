// With Solution: Use Of Volatile modifier... It used to share the local variable between threads.

/*
To solve this issue, we will have to make sure that increment operation on count is atomic, we can do
that using synchronization but Java5 java.util.concurrent.atomic provides Wrapper classes for int and
long that can be used to achieve this atomically without usage of synchronization.

Here is the updated program that will always output count value as 8 because AtomicInteger incrementAndGet()
increments the current value one by one.
*/

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic{
	
	public static void main(String...args){
		try{
			
			//user defined thread class.
			ProcessingThread p = new ProcessingThread();
			Thread t1 = new Thread(p, "Thread One");
			t1.start();
			
			Thread t2 = new Thread(p, "Thread Two");
			t2.start();
			
			// Wait the main
			t1.join();
			t2.join();
			
			System.out.println("Count: " + p.getCount());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


// User defined thread class.
class ProcessingThread implements Runnable{
	
	private AtomicInteger count = new AtomicInteger();
	
	@Override
	public void run(){
		for(int i=1; i<5; i++){
			try{
				Thread.sleep(1000);
				count.incrementAndGet();
			}catch(Exception e){	e.printStackTrace(); }
		}
	}
	
	public int getCount(){
		return this.count.get();
	}
}