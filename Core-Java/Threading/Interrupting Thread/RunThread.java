class ThreadOne extends Thread{
	
	ThreadOne(String s){
		super(s);
	}
	
	public void run(){
		
		// First ThreadOne will run
		System.out.println(Thread.currentThread().getName() + " Start");
		
		//Thread.currentThread().interrupt();	// It plays no role if we interrupt 
		
		try{
			Thread.sleep(5000 * 10);
			// sleeping but when ThreadTwo runs interrupt(), it will come back with exception and jump to catch block.
		}catch(Exception e){
			System.out.println("Forcefully Interrupted: " + Thread.currentThread().getName());
			System.out.println(e);
		}
		
		// Continuing.... 
		System.out.println("Dead Thread: " + Thread.currentThread().getName());
	}
}

class ThreadTwo extends Thread{
	
	ThreadOne to;
	
	ThreadTwo(String s, ThreadOne to){
		super(s);
		this.to = to;
	}
	
	public void run(){
		
		System.out.println(Thread.currentThread().getName() + " Start");
		to.interrupt();
		
		// Sleeping ThreadTwo so after interrupting ThreadOne will get back the life cycle.
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Dead Thread: " + Thread.currentThread().getName());
	}
}


class RunThread{
	public static void main(String...a){
		ThreadOne to = new ThreadOne("First");
		// Wants to run ThreadOne First
		to.setPriority(10);
		to.start();
		// Sending reference id of the ThreadOne because wants to run interrupt () on it
		ThreadTwo tt = new ThreadTwo("Second", to);
		
		
		tt.start();
	}
}