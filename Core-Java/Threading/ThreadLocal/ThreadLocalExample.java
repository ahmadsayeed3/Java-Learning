// ThreadLocal: It is a Generic Class

/* 
ThreadLocal class in Java enable you to create variables that can be read and write by some thread.
Thus even if two threads are executing the same code, and the code has a reference to ThreadLocal
variables, then the two threads can not see each others ThreadLocal variable.

Her is a code example that shows how to create a ThreadLocal variable.
			private ThreadL MyThreadLocal = new ThreadLocal();

As you can see, You instantiated a new ThreadLocal object. This only needs to be done once, and
it does not matter which thread does that. All threads will be see the same ThreadLocal instance
but the values set on the ThreadLocal via its set() method will only be visible to thread who
set the value. Even if two different thread sets different value on the same ThreadLocal object,
they cannot see each others value.
*/


public class ThreadLocalExample{
	
	static int n = 0;
	
	// Inner class
	private static class MyRunnable implements Runnable{
		
		// Creating ThreadLocal Variable
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer> ();
		
		@Override
		public void run(){
			
			int z = (int) (Math.random() * 100D);
			System.out.println(Thread.currentThread().getName()+ ": " + z);
			
			// Setting the value for the currentThread
			threadLocal.set(z);
			
			// Sleep, so other come and set their own value.
			try{ Thread.sleep(1000); }
			catch(Exception e){	e.printStackTrace(); }
			
			
			//Now check if value is altered.
			System.out.println("Later.............\n");
			System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		}
	}
	
	// main of outer class
	public static void main(String...args){
		
		MyRunnable shared = new MyRunnable();
		
		new Thread(shared).start();	// Thread-0
		new Thread(shared).start();	// Thread-1
		new Thread(shared).start();	// Thread-2
		new Thread(shared).start();	// Thread-3
		
	}
}