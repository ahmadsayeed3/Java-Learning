// Synchronized Conditions: Interview Questions 
  // Condition 1: More than one thread having a same object(of Shared class). 
    // Shared class have two synchronized method ( non-static Show() and show()1 )
 	  // If Different thread calling different synchronized method, 
		// If there is already first thread in sleep that has called synchronized method then the second thread will wait till first thread end.
		
// All Over if Two Different Threads are calling different synchronized methods of a class with same object 
  // then the thread will complete one by one because synchronized method requires  a Lock.

class Girl{
	
	synchronized void g1(String str, int x){
		System.out.println("G1 Starting: Thread Name is : " + str + " and value of x is: " + x);
		
		try{
			System.out.println("G1 is sleeping but G2 is not able to access g2().");
			Thread.sleep(2000);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("G1 Ending: Thread Name is : " + str + " and value of x is: " + x);
	}
	
	synchronized void g2(String str, int x){
		System.out.println("G2 Starting: Thread Name is : " + str + " and value of x is: " + x);
		
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("G2 Ending: Thread Name is : " + str + " and value of x is: " + x);
	}
}

class Boy1 extends Thread{
	Girl g;
	Boy1(Girl g, String s){
		super(s);
		this.g = g;
		start();
	}
	
	public void run(){
		g.g1(Thread.currentThread().getName(), 10);
	}
}

class Boy2 extends Thread{
	Girl g;
	Boy2(Girl g, String s){
		super(s);
		this.g = g;
		start();
	}
	
	public void run(){
		g.g2(Thread.currentThread().getName(), 20);
	}
}

class GoForDate{
	public static void main(String...a){
		Girl grl = new Girl();
		Boy1 b1 = new Boy1(grl, "Vineet");
		Boy2 b2 = new Boy2(grl, "Javed");
	}
}