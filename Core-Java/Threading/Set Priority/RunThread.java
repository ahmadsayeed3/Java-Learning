class TakeFood implements Runnable{
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName());
		}
	
		System.out.println("Thread Dead");
	}
	
}

class GetCloths implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName());
		}
	
		System.out.println("Thread Dead");
	}
	
}

class RunThread{
	
	public static void main(String...a){
		
		System.out.println(Thread.currentThread().getPriority());
		
		TakeFood tf = new TakeFood();
		GetCloths gc = new GetCloths();
		
		Thread tt = new Thread(tf, "Thread One");
		Thread tt1 = new Thread(gc, "GetCloths");
		
		tt.setPriority(Thread.MIN_PRIORITY);
		tt1.setPriority(Thread.MAX_PRIORITY);
		//tt1.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(tt.getPriority());
		System.out.println(tt1.getPriority());
		
		tt.start();
		tt1.start();
	}
}