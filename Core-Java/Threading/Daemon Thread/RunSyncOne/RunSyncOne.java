class ThreadOne extends Thread{
	
	ThreadOne(String s){ super(s); 	}
	
	public void run(){
		
		
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName() + " Daemon");
		}
		else{
			System.out.println(Thread.currentThread().getName() + " Normal");
		}
		
		try{
			//System.out.println(Thread.currentThread().getName() + " Sleeping");
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class ThreadTwo extends Thread{
	
	ThreadTwo(String s){ super(s); 	}
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName() + " Daemon");
		}
		else{
			System.out.println(Thread.currentThread().getName() + " Normal");
		}
		
		try{
			//System.out.println(Thread.currentThread().getName() + " Sleeping");
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class ThreadThree extends Thread{
	
	ThreadThree(String s){ super(s); 	}
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName() + " Daemon");
		}
		else{
			System.out.println(Thread.currentThread().getName() + " Normal");
		}
		
		try{
			//System.out.println(Thread.currentThread().getName() + " Sleeping");
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class RunSyncOne{
	public static void main(String...a){
		ThreadOne t1 = new ThreadOne("Thread One");
		ThreadTwo t2 = new ThreadTwo("Thread Two");
		ThreadThree t3 = new ThreadThree("Thread Three");
		
		t1.setDaemon(true);
		t2.setDaemon(false);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName());
			
			try{
				 Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		
			System.out.println(Thread.currentThread().getName());
		}
		
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}