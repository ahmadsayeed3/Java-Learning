class ThreadOne extends Thread{

	Shared s;

	ThreadOne(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}

	public void run(){
		System.out.println("Sum Of 10, 20 is: " + s.add(10,20));
		//s.show(Thread.currentThread().getName(), 10);
	}
}

class ThreadTwo extends Thread{
	Shared s;
	
	ThreadTwo(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}
	
	public void run(){
		System.out.println("Sum Of 100, 200 is: " + s.add(100,200));
		//s.show(Thread.currentThread().getName(), 20);
	}
}

class ThreadThree extends Thread{
	Shared s;
	
	ThreadThree(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}
	
	public void run(){
		System.out.println("Sum Of 1000, 2000 is: " + s.add(1000,2000));
		//s.show(Thread.currentThread().getName(), 30);
	}

}

class Shared{
	int x,y;
	
	synchronized void show(String s, int a){
		
		x = a;
		System.out.println("Starting in Method " + s + " " + x);
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Exit From Method" + s + " " + x);
	}
	
	 int add(int a, int b){
		// Suppose ThreadOne gets the first entry that is sending 10 and 20. 10 is inside x. 20 is inside 20
		this.x = a;
		this.y = b;
		
		// Thread is sleeping for 2 seconds, means life cycle is free and ThreadTwo gets chance to run .
			// When ThreadTwo run, it changed the value of x, y 100 and 200. ThreadTwo Also slept for 2 seconds.
				// Now Again ThreadOne gets the chance and continue.
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		// ThreadOne is continuing and returning the sum of x and y that is now 100 and 200.
			// But do you remember ThreadOne has sent 10,20 and he is getting back 300.
		return x+y;
	}
}

class RunSync{
	public static void main(String...a){
		Shared sd = new Shared();
		ThreadOne to = new ThreadOne(sd, "TOne");
		ThreadTwo tw = new ThreadTwo(sd, "TTwo");
		ThreadThree tt = new ThreadThree(sd, "TTh");
	}
}