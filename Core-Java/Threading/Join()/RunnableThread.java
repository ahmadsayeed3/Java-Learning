import java.util.Date;

class ThreadOne implements Runnable{
	
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("Running by: " + Thread.currentThread().getName() + " at " + new Date());
			try{
				Thread.sleep(1000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("End by: " + Thread.currentThread().getName() + " at " + new Date());
	}
}

class RunnableThread{
	
	public static void main(String...a){
		// Main thread started by JVM
		
		ThreadOne to = new ThreadOne();
		Thread t1 = new Thread(to, "T1");
		Thread t2 = new Thread(to, "T2");
		Thread t3 = new Thread(to, "T3");
		
		// First t1 will finish because t1 has joined the main thread. Even t1 is sleeping for 1 second.
		
		t1.start();
		try{
			t1.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// Main thread got the life cycle.
		// Then t2 will finish because t2 has also joined the main thread.
		t2.start();
		try{
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		// Main thread got the life cycle.
		// Then t3 will finish because t2 has joined the main thread.
		t3.start();
		try{
			t3.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		// Main thread got the life cycle.
		System.out.println("--- More Threads And Main Thread Will Run Simultaneously ---");
		
		// Now starting more threads but they will run with main threads
		Thread t4 = new Thread(to, "T4");
		Thread t5 = new Thread(to, "T5");
		
			t4.start();
			t5.start();
		
		for(int i=0; i<3; i++){
			System.out.println("Main is running by: " + Thread.currentThread().getName() + " at " + new Date());
			try{
				Thread.sleep(1000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread is Dead");
	}
}

