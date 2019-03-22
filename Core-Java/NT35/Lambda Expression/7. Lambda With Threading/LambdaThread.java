// Lambda Expression with Threads

// Thread
class ThreadOne implements Runnable{
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() +" is entered");
		
		try{	Thread.sleep(2000);	}
		catch(InterruptedException e){ e.printStackTrace(); }
		
		System.out.println(Thread.currentThread().getName() + " is dead now");
	}
}

class LambdaThread{
	
	public static void main(String...a){
		// Thread Running with normal way:
		ThreadOne to1 = new ThreadOne();
		Thread t1 = new Thread(to1, "One");
		t1.start();
		Thread t2 = new Thread(to1, "Two");
		t2.start();
		
		// Or another older way is via anonymous
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("Anonymous Thread is running...");
			}
		};
		
		Thread t3 = new Thread(r1);
		t3.start();
		
		// Thread with lambda
		Runnable r2 = ()->{
			System.out.println("Lambda Thread2 is running...");  
		};
		Thread t4 = new Thread(r2);
		t4.start();
		
		// Just tried
		new Thread(
			()->{	System.out.println("Shortest Lambda Thread is running...");  	}
		).start();
	}
}