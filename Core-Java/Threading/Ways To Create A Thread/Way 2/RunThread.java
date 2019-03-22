// If we want to perform a common task on each thread then make a single thread class and create
	// a multiple objects of thread class.
	
class CommonThread extends Thread{
	
	CommonThread(String s){
		super(s);
	}	
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Common Tasks");
	}
}

class RunThread{
	
	public static void main(String...a){
		
		CommonThread ct1 = new CommonThread("Thread Common Task 1");
		CommonThread ct2 = new CommonThread("Thread Common Taks 2");
		CommonThread ct3 = new CommonThread("Thread Common Taks 3");
		
		// main thread always exceutes first
		// Which Thread will execute firs is decides by the JVM
		ct1.start();
		ct2.start();
		ct3.start();
	}
}