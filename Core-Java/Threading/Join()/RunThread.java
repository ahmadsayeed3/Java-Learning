// Jis Bhi Thread ke andar join() chalta hai, use wait karna padega. 

class ThreadOne implements Runnable{
	
	public void run(){
		System.out.println("Start " + Thread.currentThread().getName());
		// Thread One is sleeping for 4 second so main thread must continue running. But we have joined 
		//ThreadOne in main thread so main thread won't run and wait to end ThreadOne
		
		try{ Thread.sleep(4000); }
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("End " + Thread.currentThread().getName());
	}
}


class ThreadTwo implements Runnable{
	
	public void run(){
		System.out.println("Start " + Thread.currentThread().getName());
		try{ Thread.sleep(2000); }
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("End " + Thread.currentThread().getName());
	}
}

class ThreadThree implements Runnable{
	
	public void run(){
		System.out.println("Start " + Thread.currentThread().getName());
		try{ Thread.sleep(2000); }
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("End " + Thread.currentThread().getName());
	}
}

class RunThread{

	public static void main(String...a){
		// Objects of our thread classes
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		ThreadThree t3 = new ThreadThree();
		// Sending reference id to Thread Class via constructor
		Thread th1 = new Thread(t1, "Thread One");
		Thread th2 = new Thread(t2, "Thread Two");
		Thread th3 = new Thread(t3, "Thread Three");
		
		// Only Starting ThreadOne for better understanding.
		th1.start();
		//th2.start();
		//th3.start();
		
		// joined the ThreadOne inside main Thread. 
			// Even ThreadOne become idol for a while, main thread won't continue.
		try{
			th1.join();
			//th2.join();
			//th3.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		// This part will run after ending of all threads because have joined other threads.
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName());
		}
		
		try{ Thread.sleep(1000); }
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()	+ " Dead");
		
	}
}