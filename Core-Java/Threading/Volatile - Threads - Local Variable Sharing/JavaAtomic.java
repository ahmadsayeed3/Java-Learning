// Thread Local Variable
// With Drawback: Use Of Volatile modifier... It used to share the local variable between threads.
/*
Now requirement came to share the local variable's
value between threads. Each Thread store its local variable's value inside cache. To share the local
variable, we have to make our local variable as "volatile". However it most of the time does not work.

If we are working with the multi-threaded programming, the volatile keyword will be more useful.

When multiple threads using the same variable, each thread will have its own copy of the local cache
for that variable. So, when its updating the value, it is actually updating in the local cache not in 
the main variable memory. The other thread which is using the same variable does not know anything about
the values changed by the another thread. To avoid this problem, if you declare a variable as volatile
then it will not be store in the local cache. Whenever thread are updating the value, it is updated
to the main memory. So, other threads can access the updated value.

the Java volatile keyword is used to mark a Java variable as being stored in a main memory. More
precisely that means that every read of a volatile variable will be read from the computer's main memory,
and not from the CPU cache, and that every write to a volatile will be written to main memory and not 
just to the CPU cache.

*/


public class JavaAtomic{
	
	public static void main(String...a){
		// User Defined Thread
		try{
			ProcessingThread pt = new ProcessingThread();
			Thread t1 = new Thread(pt, "ThreadOne");
			t1.start();
			
			Thread t2 = new Thread(pt, "ThreadTwo");
			t2.start();
			
			// Joining the threads so main will wait
			t1.join();
			t2.join();
			
			System.out.println("Count: " + pt.getCount());
		}catch(Exception e){	e.printStackTrace();	}
	}
}


// User Defined Thread Class.

class ProcessingThread implements Runnable{
	
	private volatile int count;
	
	@Override
	public void run(){
		for(int i=1; i<5; i++){
			// proves that loop is runs 8 times. 4 times for each thread. But it won't show counting 8 everytime.
			System.out.println("Hello"); 
			try{
				Thread.sleep(1000);
			}catch(Exception e){  e.printStackTrace();	}
			
			// counting
			count++;
		}
	}
	
	public int getCount(){
		return this.count;
	}
}

/*If I will run the above program, I will notice that count varies between 5,6,7,8. 
The reason is because count++ is not an atomic operation. So by the time one thread read
its value and increment it by one, other threads has read the older value leading to 
wrong result. 
*/