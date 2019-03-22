class MyRunnable implements Runnable{
	public void run()
	{
		System.out.println("Thread started:::"+Thread.currentThread().getName());
		try{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
			System.out.println("Thread ended:::"+Thread.currentThread().getName());
	}
}


public class ThreadJoin
{
	public static void main(String...s)
	{
		// Our Common Task Thread, Our Different Thread Object 
		Thread t1 = new Thread(new MyRunnable(),"t1");
		Thread t2 = new Thread(new MyRunnable(),"t2");
		Thread t3 = new Thread(new MyRunnable(),"t3");
		
		// Starting the 1st Thread. and calling join() for 2 second, so main will continue after 2 second.
		t1.start();
		try
		{
			t1.join(2000);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		// Main thread is continue after 2 second. Now starting 2nd thread.
			
        t2.start();
		
		// Start a thread when thread1 is dead.
		// Joining thread1 to with no time it means thread1 will run completely then main thread will continue.
		try{
			t1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// Thread1 is ended. main thread is again got life cycle.
		//	Thread3 is starting.
		t3.start();
	
		// Now joining all threads with not time. means all threads will be end then main thread will continue.
	   try{
		   // Thread1 is already ended above.
		t1.join();
		// Thread will complete.
		t2.join();
		// Thread3 will complete
		t3.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		// Main Thread Continuing. 
		System.out.println("All threads are dead,exiting main thread");
	}
}


