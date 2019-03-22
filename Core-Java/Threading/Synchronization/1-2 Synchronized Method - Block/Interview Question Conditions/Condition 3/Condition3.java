// Synchronized Conditions: Interview Questions 
  // Condition 3: More than one thread having a same object(of Shared class). 
    // Shared class have one method ( static synchronized Show() )
	  // If Different thread calling same method, both are calling by class name.
		// then in this case one by one function will complete
		
// In Java every class is also having a one implicit lock on it.

class Shared{
	
	static int x;
	
	static synchronized void show(String str, int x){
		Shared.x = x;
		System.out.println("Start Show: Thread Name is: " + str + " and value of x: " + x);
		
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Exit Show: Thread Name is " + str + " and value of x: " +  x);	
	}
}

class ThreadOne extends Thread{

	
	ThreadOne(String str){
		super(str);
		start();
	}
	
	public void run(){
		Shared.show(Thread.currentThread().getName(),100);
	}
}

class ThreadTwo extends Thread{
	ThreadTwo(String s){
		super(s);
		start();
	}
	
	public void run(){
		Shared.show(Thread.currentThread().getName(),200);
	}
}


class RunSync{
	
	public static void main(String...a){
		Shared ss = new Shared();
		new ThreadOne("Thread One");
		new ThreadTwo("Thread Two");
	}
}

