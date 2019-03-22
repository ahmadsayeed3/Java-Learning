// wait() and notify is alternate of suspend() and resume()
	// suspend(): suspend method is used to send a thread into blocked pool for infinity time. 
		// It will be in blocked pool until other thread call resume().
		
	// Why suspend() and resume() deprecated: because whenever we call suspend() from synchronized method, or 
	//	synchronized block then one Dead-Lock will be created. The program will be hang
	

// Program: This Program Will Work Fine. To see the reason why it deprecated, please visit RunThread2.java

class ThreadOne extends Thread{
	
	Shared s;
	
	ThreadOne(Shared s, String str){
		super(str);
		this.s = s;
	}
	
	public void run(){
		System.out.println("Entered " + Thread.currentThread().getName());
		
		suspend();
		
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Exit " + Thread.currentThread().getName());
		//s.show(Thread.currentThread());
	}
}


class ThreadTwo extends Thread{
	
	ThreadOne to;
	Shared s;
	
	ThreadTwo(Shared s, ThreadOne to, String str){
		super(str);
		this.to = to;
		this.s = s;
	}
	
	public void run(){
		System.out.println("Entered " + Thread.currentThread().getName());
		to.resume();
		
		System.out.println("Exit: " + Thread.currentThread().getName());
	}
}


class Shared{
	
	synchronized void show(Object to){
		System.out.println("Entered Show");
		// Going To Blocked Pool For Infinity Time
		//to.suspend();		
		
		System.out.println("Exit Show");
	}
}

class RunThread{
	public static void main(String...a){
		Shared s = new Shared();
		ThreadOne to = new ThreadOne(s, "Thread One");
		ThreadTwo tw = new ThreadTwo(s, to, "Thread Two");
		
		to.setPriority(10);
		
		to.start();
		tw.start();
	}
}