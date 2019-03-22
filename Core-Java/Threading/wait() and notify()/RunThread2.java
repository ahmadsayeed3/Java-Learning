// wait() and notify is alternate of suspend() and resume()
	// suspend(): suspend method is used to send a thread into blocked pool for infinity time. 
		// It will be in blocked pool until other thread call resume().
		
	// Why suspend() and resume() deprecated: because whenever we call suspend() from synchronized method, or 
	//	synchronized block then one Dead-Lock will be created. The program will be hang
	

// Program: If resume method is calling from synchronized method then it will require a lock.
	//But lock is inside Blocked pool with ThreadOne because suspend() is called from synchronized block.
	
// To solve this problem wait() and notify() introduced. To know please visit RunThread3.java


class ThreadOne extends Thread{
	
	Shared s;
	
	ThreadOne(Shared s, String str){
		super(str);
		this.s = s;
	}
	
	public void run(){
		s.show(this);
		
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
		s.display(to);
	}
}


class Shared{
	
	synchronized void show(ThreadOne to){
		System.out.println("Entered " + Thread.currentThread().getName());
		
		// Going To Blocked Pool For Infinity Time
		to.suspend();		
		
		System.out.println("Exit " + Thread.currentThread().getName());
	}
	
	synchronized void display(ThreadOne to){
		System.out.println("Entered " + Thread.currentThread().getName());
		// trying to resume the ThreadOne but it won't even come inside this synchronized method.
		// But if we resume the ThreadOne from out the synchronized method or block, then it will run fine.
		to.resume();
		
		System.out.println("Exit: " + Thread.currentThread().getName());
	}
}

class RunThread2{
	public static void main(String...a){
		Shared s = new Shared();
		ThreadOne to = new ThreadOne(s, "Thread One");
		ThreadTwo tw = new ThreadTwo(s, to, "Thread Two");
		
		to.setPriority(10);
		
		to.start();
		tw.start();
	}
}