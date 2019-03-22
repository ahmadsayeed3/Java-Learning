class ThreadOne implements Runnable{
	int x;
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName() + " " + x);
		}
		
		System.out.println(Thread.currentThread().getName() + "Dead");
	}
}

class ThreadTwo implements Runnable{
	int x;
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName() + " " + x);
		}
		
		System.out.println(Thread.currentThread().getName() + "Dead");
	}
}

class RunThread{
	public static void main(String...a){
		ThreadOne to = new ThreadOne();
		ThreadTwo tw = new ThreadTwo();
		
		to.x = 10;
		tw.x = 20;
		
		Thread to1 = new Thread(to, "Thread One");
		Thread tw1 = new Thread(tw, "Thread Two");
		
		to1.start();
		tw1.start();
	}
}