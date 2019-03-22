// sleep() method in java.

class ThreadOne extends Thread{
	
	ThreadOne(String s){
		super(s);
	}
	
	public void run(){
		for(int i=0; i < 3; i++){
			System.out.println(Thread.currentThread().getName() + " Loop " + i);
		
			// Sleep a thread for 1 second
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		
		}
	}
}

class ThreadTwo extends Thread{
	
	ThreadTwo(String s){
		super(s);
	}
	
	public void run(){
		for(int i=0; i < 3; i++){
			System.out.println(Thread.currentThread().getName() + " Loop " + i);
		
			// Sleep a thread for 1 second
			try{
				Thread.sleep(0, 10000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		
		}
	}
}


class RunThreats{
	public static void main(String...a){
		ThreadOne to1 = new ThreadOne("Thread One");
		ThreadOne to2 = new ThreadOne("Thread Two");
		ThreadOne to3 = new ThreadOne("Thread Three");
		
		ThreadTwo tt = new ThreadTwo("Thread Two");
		
		to1.start();
		tt.start();
		//to2.start();
		//to3.start();
		
		
		
	}
}