
class Temp{
	public void display(){
		System.out.println("Inside Display Method: " + Thread.currentThread().getName());
	}
}

class Shared{
	
	int x;
	Temp tmp = new Temp();
	void show(String str, int x){
		
		// suppose ThreadOne gets the chance to run.
		
		System.out.println("Starting: " + str + " and value of x is: " + x);
		System.out.println(str + " run 50 lines");
		synchronized(tmp){
			this.x  = x;
			//tmp.display();
			
		}
		
		// ThreadOne is sleeping with lock. But still ThreadTwo will get chance to run and it will run his first 50 lines then wait. 
		// You may notice synchronized method don't allow to even enter inside method but using synchronized block ThreadTwo is getting chance to run at-least 50 lines.
		// It is reducing the waiting time. :)
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(str + " is running more 40 lines");
		System.out.println("Ending: " + str + " and value of x is: " + x);
		
	}
	
}

class ThreadOne extends Thread{
	
	Shared s;
	
	ThreadOne(Shared s, String str){
		super(str);
		this.s = s;
		start();
	}
	
	public void run(){
		s.show(Thread.currentThread().getName(), 100);
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
		s.show(Thread.currentThread().getName(), 200);
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
		s.show(Thread.currentThread().getName(), 300);
	}
}


class RunSync{
	public static void main(String...a){
		
		Shared ss = new Shared();
		ThreadOne t = new ThreadOne(ss, "Thread One");
		ThreadTwo tw = new ThreadTwo(ss, "Thread Two");
		ThreadThree th = new ThreadThree(ss, "Thread Three");
		
	}
}

// In this program using synchronized block Temp class also became synchronized because Threads are also visiting Temp class One by one.
/* Output
	Starting: Thread Two and value of x is: 200
	Starting: Thread Three and value of x is: 300
	Starting: Thread One and value of x is: 100
	Thread Three run 50 lines
	Thread Two run 50 lines
	Thread One run 50 lines
	Thread Two is running more 40 lines
	Thread Three is running more 40 lines
	Thread One is running more 40 lines
	Ending: Thread Two and value of x is: 200
	Ending: Thread Three and value of x is: 300
	Ending: Thread One and value of x is: 100
*/