// If we want to perform a different different task on each thread then always keep a 
	//separate thread class for each task.

class ThreadOne extends Thread{
	ThreadOne(String s){
		super(s);
		// start()		// If we want to start a thread just after creating an object
	}
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName());
			// To See the output with normal speed, sleeping the thread for a while
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			
			}
		
		}
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class ThreadTwo extends Thread{
	
	ThreadTwo(String s){
		super(s);
		// start()		// If we want to start a thread just after creating an object
	}
	
	public void run(){
		for(int i =0; i<10; i++){
			System.out.println(Thread.currentThread().getName());
			// To See the output withnormal speed, sleeping the thread for a while
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			
			}
		}
		
		
	
	System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class ThreadThree extends Thread{
	ThreadThree(String s){
		super(s);
		// start()		// If we want to start a thread just after creating an object
	}
	
	public void run(){
		for(int i=0; i < 15; i++){
			System.out.println(Thread.currentThread().getName());
		
			// To See the output withnormal speed, sleeping the thread for a while
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			
			}
		}
	
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class RunThread{
	
	public static void main(String...a){
		ThreadOne to1 = new ThreadOne("Thread One");
		ThreadTwo tw1 = new ThreadTwo("Thread Two");
		ThreadThree tt1 = new ThreadThree("Thread Three");
		
		// Which Thread will execute firs is decides by the JVM
		to1.start();
		tw1.start();
		tt1.start();
		
		for(int i=0; i<20; i++){
			System.out.println(Thread.currentThread().getName());
			// To See the output with normal speed, sleeping the thread for a while
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			
			}
		}
	}
}