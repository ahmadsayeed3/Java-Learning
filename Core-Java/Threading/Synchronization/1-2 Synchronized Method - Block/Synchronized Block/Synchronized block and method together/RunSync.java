// What happens when synchronized method and synchronized block in Shared object. No data will corrupt.
class Shared{
	
	int x;
	
	synchronized public void show(String str){
		System.out.println("Starting show: " + str);
		
		try{
			Thread.sleep(2000);
		}catch(Exception e){ 
			System.out.println(e);
		}
		
		System.out.println("Ending show" + str);
	}
	
	public void display(String str, int a){
		System.out.println("Starting Display " + str);
		
		synchronized(this){
			x = a;
			System.out.println("Synchronized block " + str + " " + x);
			
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		System.out.println("Ending Display" + str);
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
		this.s.show("Thread One");
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
		this.s.display("Thread Two", 10);
	}
}

class RunSync{
	public static void main(String...a){
		
		Shared s = new Shared();
		
		ThreadOne t1 = new ThreadOne(s, "Thread One");
		ThreadTwo t2 = new ThreadTwo(s, "Thread Two");
	}
}