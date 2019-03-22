// Synchronized Conditions: Interview Questions 
  // Condition 2: More than one thread having a same object(of Shared class). 
	// Shared class have two method ( non-static synchronized Show() and  non-static show()1 )
	  // // If Different thread calling different method, then it won't complete one-by-one.
			// It will run parallel because one is synchronized and other is not synchronized.
			

class Hospital{
	
	int x,y;
	
	synchronized void privateRoom(String str, int x){
		
		this.x = x;
		
		System.out.println("Start Private Room: Thread Name is: " + str + " and value of x is: " + this.x);
		
		try{
			System.out.println(str + "is sleeping so other thread will get chance");
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Exit Private Room: Thread Name is: " + str + " and value of x is: " + this.x);
	} 
	
	void CommonWard(String str, int x){
		
		this.x = x;
		
		System.out.println("Start Common Ward: Thread Name is: " + str + " and value of x is: " + this.x);
		
		try{
			System.out.println(str + "is sleeping so other thread will get chance");
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Exit Common Ward : Thread Name is: " + str + " and value of x is: " + this.x);
		
	}
}

class PatientOne extends Thread{
	
	Hospital h;
	
	PatientOne(Hospital h, String s){
		super(s);
		this.h = h;
		start();
	}
	
	public void run(){
		h.privateRoom(Thread.currentThread().getName(), 100);
	}
}

class PatientTwo extends Thread{
	
	Hospital h;
	
	PatientTwo(Hospital h, String s){
		super(s);
		this.h = h;
		start();
	}
	
	public void run(){
		h.CommonWard(Thread.currentThread().getName(), 200);
	}
}

/* class PatientThree extends Thread{
	
	Hospital h;
	
	PatientThree(Hospital h, String s){
		super(s);
		this.h = h;
		start();
	}
	
	public void run(){
		h.CommonWard(Thread.currentThread().getName(), 300);
	}
}
*/

class RunHospital{
	
	public static void main(String...a){
		Hospital hh = new Hospital();
		PatientOne po = new PatientOne(hh, "Bechara One");
		PatientTwo pt = new PatientTwo(hh, "Bechara Two");
		//PatientThree pth = new PatientThree(hh, "Bechara Three");
	}
}