// What happens when calls the run() method explicitly???
	// It calls like a normal non-static method. In this case no new thread is going to be started.
	
class ThreadOne extends Thread{
	
	ThreadOne(String s){
		super(s);
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}


class RunThread{
	
	public static void main(String...a){
		ThreadOne to = new ThreadOne("Sayeed Thread");
		to.start();
		
		to.run();
	}
}