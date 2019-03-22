// Dead Lock Condition: Object One needs Object Two reference and Object Two need Object One Reference id


class ObjectOne{
	
	public void show(){
		System.out.println("Show From Object One");
	}
}

class ObjectTwo{
	public void display(){
		System.out.println("Display From Object Two");
	}
}

class Shared{
	
	ObjectOne oo = new ObjectOne();
	ObjectTwo ot = new ObjectTwo();
	
	public void methodOne(){
		System.out.println("Start methodOne from Shared");
		
		// oo is having lock of Object One
		synchronized(oo){
			oo.show();	
			
			// sleeping for two second so Thread Two will get chance to run
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			// When it comes back to run, it needs Object Two reference to go inside but object two is inside
					// blocked pool waiting for object of ObjectOne class
			synchronized(ot){
				ot.display();
			}
		}
		
		System.out.println("Ending methodOne from Shared");
	}
	
	public void methodTwo(){
		System.out.println("Start methodTwo from Shared");
		
		// ot is having lock of Object Two
		synchronized(ot){
			ot.display();	
			
			// Sleeping for two second so Thread One will get chance to run.
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			// need object of object One reference to go inside
			synchronized(oo){
				oo.show();
			}
		}
		
		System.out.println("Ending methodTwo from Shared It Won't Reach Here");
	}
}

class ThreadOne extends Thread{
	
	Shared sd;
	
	ThreadOne(Shared sd, String s){
		super(s);
		this.sd = sd;
	}
	
	public void run(){
		this.sd.methodOne();
	}
}

class ThreadTwo extends Thread{
	
	Shared sd;
	
	ThreadTwo(Shared sd, String s){
		super(s);
		this.sd = sd;
	}
	
	public void run(){
		this.sd.methodTwo();
	}
}

class RunThread{
	public static void main(String...a){
		Shared s = new Shared();
		new ThreadOne(s, "Thread One").start();
		new ThreadTwo(s, "Thread Two").start();
	}
}